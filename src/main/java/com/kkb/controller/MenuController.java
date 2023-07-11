package com.kkb.controller;

import com.github.pagehelper.PageInfo;
import com.kkb.pojo.Menu;
import com.kkb.service.MenuService;
import com.kkb.vo.ResultVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @Description 菜单资源控制层
 */
@Controller
@ResponseBody
@RequestMapping("menu")
public class MenuController {

    @Resource
    private MenuService menuService;

    /**
     * 查询菜单资源列表
     *
     * @param pageNum  页码
     * @param pageSize 每页条数
     * @param mName    菜单名称
     * @return
     */
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ResultVO<PageInfo> list(Integer pageNum, Integer pageSize, String mName) {
        if (pageNum == null || pageNum <= 0) {
            pageNum = 1;
        }
        if (pageSize == null || pageSize <= 0) {
            pageSize = 5;
        }
        PageInfo<Menu> menuPageInfo = menuService.queryMenuList(pageNum, pageSize, mName);
        return new ResultVO(menuPageInfo);
    }

    /**
     * 通过菜单id查询菜单信息
     *
     * @param mId
     * @return
     */
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResultVO<Menu> findById(@PathVariable("id") Integer mId) {
        Menu menu = menuService.findById(mId);
        if (menu != null) {
            return new ResultVO(menu);
        }
        return new ResultVO<>(500, "服务器内部异常，请稍后再试！");
    }

    /**
     * 通过id更新菜单信息
     *
     * @param mid
     * @param menu
     * @return
     */
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public ResultVO update(@PathVariable("id") Integer mid, Menu menu) {
        menu.setmId(mid);
        int update = menuService.update(menu);
        if (update == 1) {
            return new ResultVO(menu);
        }
        return new ResultVO<>(500, "服务器内部异常，请稍后再试！");
    }

    /**
     * 菜单名称唯一性验证
     *
     * @param
     * @param
     * @return
     */
    @RequestMapping(value = "name", method = RequestMethod.GET)
    public ResultVO checkName(Menu menu) {
        Menu menu1 = menuService.checkByName(menu);
        if (menu1 == null) {
            return new ResultVO();
        }
        return new ResultVO<>(500, "服务器内部异常，请稍后再试！");
    }

    /**
     * 添加菜单
     *
     * @param menu
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResultVO addMenu(Menu menu) {
        int i = menuService.addMenu(menu);
        if (i == 1) {
            return new ResultVO();
        }
        return new ResultVO<>(500, "服务器内部异常，请稍后再试！");
    }

    /**
     * 删除菜单
     *
     * @param ids
     * @return
     */
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public ResultVO deleteMenu(@PathVariable("id") Integer[] ids) {
        int i = 0;
        if (ids != null) {
            List<Integer> idList = Arrays.asList(ids);
            i = menuService.deleteMenu(idList);
        }

        if (i != 0) {
            return new ResultVO();
        }
        return new ResultVO<>(500, "服务器内部异常，请稍后再试！");
    }
}
