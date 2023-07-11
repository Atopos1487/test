package com.kkb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkb.mapper.MenuMapper;
import com.kkb.pojo.Menu;
import com.kkb.pojo.MenuExample;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MenuService {
    @Resource
    private MenuMapper menuMapper;

    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public PageInfo<Menu> queryMenuList(Integer pageNum, Integer pageSize, String mName) {
        MenuExample ex = new MenuExample();
        MenuExample.Criteria criteria = ex.createCriteria();
        if (mName != null && !"".equals(mName.trim())) {
            criteria.andMNameLike("%" + mName.trim() + "%");
        }

        if (pageNum != null && pageSize != null) {

            PageHelper.startPage(pageNum, pageSize);
        }

        List<Menu> menus = menuMapper.selectByExample(ex);
        return new PageInfo<>(menus);
    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public Menu findById(Integer id) {
        return menuMapper.selectByPrimaryKey(id);
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public int update(Menu menu) {
        return menuMapper.updateByPrimaryKeySelective(menu);
    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public Menu checkByName(Menu menu) {
        return menuMapper.checkByName(menu);
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public int addMenu(Menu menu) {
        return menuMapper.insertSelective(menu);
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public int deleteMenu(List ids) {
        MenuExample example = new MenuExample();
        MenuExample.Criteria criteria = example.createCriteria();
        criteria.andMIdIn(ids);
        return menuMapper.deleteByExample(example);
    }
}
