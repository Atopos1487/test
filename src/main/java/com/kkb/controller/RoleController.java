package com.kkb.controller;

import com.github.pagehelper.PageInfo;
import com.kkb.pojo.Menu;
import com.kkb.pojo.Role;
import com.kkb.service.MenuService;
import com.kkb.service.RoleService;
import com.kkb.vo.ResultVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@Controller
@ResponseBody
@RequestMapping("role")
public class RoleController {

    @Resource
    private RoleService roleService;

    @Resource
    private MenuService menuService;

    /**
     * 查询角色资源列表
     *
     * @param pageNum  页码
     * @param pageSize 每页条数
     * @param rName    角色名称
     * @return
     */
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ResultVO<PageInfo> list(Integer pageNum, Integer pageSize, String rName) {
        if (pageNum == null || pageNum <= 0) {
            pageNum = 1;
        }
        if (pageSize == null || pageSize <= 0) {
            pageSize = 5;
        }
        PageInfo<Role> rolePageInfo = roleService.queryRoleList(pageNum, pageSize, rName);
        return new ResultVO(rolePageInfo);
    }

    /**
     * 通过角色id查询角色信息以及对应菜单信息
     *
     * @param rId
     * @return
     */
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResultVO findById(@PathVariable("id") Integer rId) {

        Role role = roleService.findById(rId);
        if (role != null) {
            return new ResultVO(role);
        }
        return new ResultVO<>(500, "服务器内部异常，请稍后再试！");

    }

    /**
     * 查询所有菜单信息
     *
     * @return
     */
    @RequestMapping(value = "muenList", method = RequestMethod.GET)
    public ResultVO queryMenuAll() {
        Integer pageNum = null,
                pageSize = null;
        String mName = null;
        PageInfo<Menu> menuPageInfo = menuService.queryMenuList(pageNum, pageSize, mName);
        return new ResultVO(menuPageInfo);
    }

    /**
     * 更新角色信息
     */
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public ResultVO updateRole(@PathVariable("id") Integer rid, Role role) {
        role.setrId(rid);

        int i = roleService.updateRole(role);
        if (i == 1) {
            return new ResultVO();
        }
        return new ResultVO<>(500, "服务器内部异常，请稍后再试！");
    }

    /**
     * 角色名唯一性校验
     *
     * @param role
     * @return
     */
    @RequestMapping(value = "name", method = RequestMethod.GET)
    public ResultVO checkRole(Role role) {
        Role role1 = roleService.checkByName(role);
        if (role1 == null) {
            return new ResultVO();
        }
        return new ResultVO<>(500, "服务器内部异常，请稍后再试！");
    }

    /**
     * 添加角色
     *
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResultVO addRole(Role role) {
        int i = roleService.addRole(role);
        if (i == 1) {
            return new ResultVO();
        }
        return new ResultVO<>(500, "服务器内部异常，请稍后再试！");
    }

    /**
     * 删除角色
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public ResultVO deleteRole(@PathVariable("id") Integer[] id) {
        List<Integer> idList = Arrays.asList(id);
        int i = roleService.deleteRole(idList);
        if (i == 1) {
            return new ResultVO();
        }
        return new ResultVO<>(500, "服务器内部异常，请稍后再试！");
    }
}
