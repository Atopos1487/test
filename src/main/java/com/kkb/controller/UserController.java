package com.kkb.controller;

import com.github.pagehelper.PageInfo;
import com.kkb.pojo.Role;
import com.kkb.pojo.User;
import com.kkb.service.RoleService;
import com.kkb.service.UserService;
import com.kkb.vo.ResultVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;

@Controller
@ResponseBody
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @Resource
    private RoleService roleService;

    /**
     * 获取用户信息列表
     *
     * @param pageNum
     * @param uLoginname
     * @return
     */
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ResultVO<PageInfo> list(Integer pageNum, Integer pageSize, String uLoginname) {
        if (pageNum == null || pageNum <= 0) {
            pageNum = 1;
        }
        if (pageSize == null || pageSize <= 0) {
            pageSize = 5;
        }
        PageInfo<User> userPageInfo = userService.queryUserList(pageNum, pageSize, uLoginname);
        return new ResultVO(userPageInfo);
    }

    /**
     * 通过id查询用户信息，并关联角色
     *
     * @param uid
     * @return
     */
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResultVO findById(@PathVariable("id") Integer uid) {
        User user1 = new User();
        user1.setuId(uid);
        User user = userService.findUser(user1);
        if (user != null) {
            return new ResultVO(user);
        }
        return new ResultVO<>(500, "服务器内部异常，请稍后再试！");
    }

    /**
     * 查询用户编辑界面的角色信息
     *
     * @return
     */
    @RequestMapping(value = "roleList", method = RequestMethod.GET)
    public ResultVO queryRoleInfo() {
        Integer pageNum = null,
                pageSize = null;
        String rName = null;
        PageInfo<Role> roles = roleService.queryRoleList(pageNum, pageSize, rName);
        return new ResultVO(roles);
    }

    /**
     * 更新用户信息
     *
     * @param id
     * @param user
     * @return
     */
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public ResultVO updateUser(@PathVariable("id") Integer id, User user) {
        user.setuId(id);
        int i = userService.updateRoleInfo(user);
        if (i == 1) {
            return new ResultVO();
        }
        return new ResultVO<>(500, "服务器内部异常，请稍后再试！");
    }

    /**
     * 登录名唯一性校验
     *
     * @param uLoginname
     * @return
     */
    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    public ResultVO checkName(@PathVariable("name") String uLoginname) {
        User user = new User();
        user.setuLoginname(uLoginname);
        User user1 = userService.findUser(user);
        if (user1 != null) {

            return new ResultVO();
        }
        return new ResultVO<>(500, "服务器内部异常，请稍后再试！");
    }

    /**
     * 增加用户
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResultVO addUser(User user) {
        int i = userService.addUser(user);
        if (i == 1) {
            return new ResultVO();
        }
        return new ResultVO<>(500, "服务器内部异常，请稍后再试！");
    }

    /**
     * 删除用户
     *
     * @param ids
     * @return
     */
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public ResultVO deleteUser(@PathVariable("id") Integer[] ids) {
        List<Integer> idsList = Arrays.asList(ids);

        int i = userService.deleteUser(idsList);
        if (i != 0) {

            return new ResultVO();
        }
        return new ResultVO<>(500, "服务器内部异常，请稍后再试！");
    }

    /**
     * 校验旧密码是否正确
     *
     * @param oldPass
     * @param session
     * @return
     */
    @RequestMapping(value = "password", method = RequestMethod.POST)
    public ResultVO checkPass(String oldPass, HttpSession session) {
        //获取当前用户的信息
        User loginSession = (User) session.getAttribute("loginSession");
        if (loginSession != null) {
            //从session中获取密码信息
            String sessionPass = loginSession.getuPassword();
            if (sessionPass.equals(oldPass)) {
                return new ResultVO();
            }
        }
        return new ResultVO<>(500, "服务器内部异常，请稍后再试！");
    }

    @RequestMapping(value = "newPassword", method = RequestMethod.POST)
    public ResultVO updatePass(String oldPass, String newPass, HttpSession session) {
        //获取当前用户的信息
        User loginSession = (User) session.getAttribute("loginSession");
        if (oldPass.equals(loginSession.getuPassword())) {
            loginSession.setuPassword(newPass);
            int i = userService.updatePass(loginSession);
            if (i == 1) {
                return new ResultVO();
            }
        }
        return new ResultVO<>(500, "服务器内部异常，请稍后再试！");
    }
}
