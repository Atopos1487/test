package com.kkb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkb.mapper.RoleMapper;
import com.kkb.mapper.RoleMenuMapper;
import com.kkb.pojo.Role;
import com.kkb.pojo.RoleExample;
import com.kkb.pojo.RoleMenu;
import com.kkb.pojo.RoleMenuExample;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class RoleService {

    @Resource
    private RoleMapper roleMapper;

    @Resource
    private RoleMenuMapper roleMenuMapper;

    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public PageInfo<Role> queryRoleList(Integer pageNum, Integer pageSize, String rName) {
        RoleExample example = new RoleExample();
        RoleExample.Criteria criteria = example.createCriteria();
        if (rName != null && !"".equals(rName.trim())) {
            criteria.andRNameLike("%" + rName.trim() + "%");
        }
        if (pageNum != null && pageSize != null) {

            PageHelper.startPage(pageNum, pageSize);
        }
        List<Role> roles = roleMapper.selectByExample(example);

        return new PageInfo<>(roles);
    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public Role findById(Integer id) {
        Role role = roleMapper.queryRoleMenu(id);
        return role;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public int updateRole(Role role) {
        //修改角色表
        int i = roleMapper.updateByPrimaryKeySelective(role);

        //修改中间表  先删除该角色对应的菜单，再插入
        //删除
        Integer rid = role.getrId();
        RoleMenuExample rmExample = new RoleMenuExample();
        RoleMenuExample.Criteria criteria = rmExample.createCriteria();
        if (rid != null) {
            criteria.andRIdEqualTo(rid);
        }
        int i1 = roleMenuMapper.deleteByExample(rmExample);
        //插入
        //获取修改的菜单编号
        String[] rm = role.getHiddenRM().split(",");
        ArrayList<RoleMenu> roleMenus = new ArrayList<>();
        for (int j = 0; j < rm.length; j++) {
            RoleMenu roleMenu = new RoleMenu();
            roleMenu.setrId(rid);
            roleMenu.setmId(Integer.valueOf(rm[j]));
            roleMenus.add(roleMenu);
        }
        int i2 = roleMenuMapper.insertBatch(roleMenus);

        return i > 0 && i1 > 0 && i2 > 0 ? 1 : 0;
    }

    public Role checkByName(Role role) {
        return roleMapper.checkByName(role);
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public int addRole(Role role) {
        //插入角色表
        int i = roleMapper.insert(role);

        //插入角色菜单中间表
        //获取自增的rid
        Integer rid = role.getrId();
        //获取菜单编号
        String[] rm = role.getHiddenRM().split(",");
        ArrayList<RoleMenu> roleMenus = new ArrayList<>();
        for (int j = 0; j < rm.length; j++) {
            RoleMenu roleMenu = new RoleMenu();
            roleMenu.setrId(rid);
            roleMenu.setmId(Integer.valueOf(rm[j]));
            roleMenus.add(roleMenu);
        }
        int i1 = roleMenuMapper.insertBatch(roleMenus);
        System.out.println(i1);
        return (i > 0 && i1 > 0) ? 1 : 0;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public int deleteRole(List idList) {
        //删除角色表
        RoleExample roleExample = new RoleExample();
        RoleExample.Criteria criteria1 = roleExample.createCriteria();
        criteria1.andRIdIn(idList);
        int i = roleMapper.deleteByExample(roleExample);

        //删除角色对中间表
        RoleMenuExample example = new RoleMenuExample();
        RoleMenuExample.Criteria criteria = example.createCriteria();
        criteria.andRIdIn(idList);
        int i1 = roleMenuMapper.deleteByExample(example);

        return i > 0 && i1 > 0 ? 1 : 0;
    }

    public List<RoleMenu> findMenuList(Integer id) {
        RoleMenuExample roleMenuExample = new RoleMenuExample();
        RoleMenuExample.Criteria criteria = roleMenuExample.createCriteria();
        criteria.andRIdEqualTo(id);
        List<RoleMenu> roleMenus = roleMenuMapper.selectByExample(roleMenuExample);
        return roleMenus;
    }
}
