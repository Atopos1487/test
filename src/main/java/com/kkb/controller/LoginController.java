package com.kkb.controller;

import com.kkb.pojo.Role;
import com.kkb.pojo.User;
import com.kkb.service.RoleService;
import com.kkb.service.UserService;
import com.kkb.vo.ResultVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @Description 登录控制层
 */
@Controller
@ResponseBody
@RequestMapping("login")
public class LoginController {

    @Resource
    private UserService userService;

    @Resource
    private RoleService roleService;

    /**
     * 用户登录
     *
     * @param user
     * @param session
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResultVO login(User user, HttpSession session) {
        User u = userService.login(user);

        if (u != null) {
            Integer rid = u.getrId();
            Role role = roleService.findById(rid);
            if (role == null) {
                ResultVO resultVO = new ResultVO<>(503, "该用户所属角色已删除，无法登陆！请联系管理员~");
                return resultVO;
            }

            if (u.getuState() == 1) {
                ResultVO resultVO = new ResultVO<>(501, "该用户已禁用，无法登陆！请联系管理员~");
                return resultVO;
            } else if (u.getuState() == 0) {
                //用户正常，去查询角色状态
                Integer roleState = role.getrState();
                if (roleState == 1) {
                    ResultVO resultVO = new ResultVO<>(502, "该用户所属角色已禁用，无法登陆！请联系管理员~");
                    return resultVO;
                }

                u.setRole(role);
                session.setAttribute("loginSession", u);
                return new ResultVO(u);
            }
        }
        return new ResultVO<>(500, "服务器内部异常，请稍后再试！");
    }

    @RequestMapping(value = "menuList", method = RequestMethod.GET)
    public ResultVO queryMenuList(HttpSession session) {
        User user = (User) session.getAttribute("loginSession");
        Role role = user.getRole();
        if (role != null) {
            return new ResultVO(role);
        }
        return new ResultVO<>(500, "服务器内部异常，请稍后再试！");
    }

    /**
     * 用户退出
     *
     * @param session
     * @return
     */
    @RequestMapping(value = "logout", method = RequestMethod.GET)
    public ResultVO logout(HttpSession session) {
        User loginSession = (User) session.getAttribute("loginSession");
        if (loginSession != null) {
            session.invalidate();
            return new ResultVO();
        }
        return new ResultVO<>(500, "服务器内部异常，请稍后再试！");
    }
}
