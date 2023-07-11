package com.kkb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkb.mapper.UserMapper;
import com.kkb.pojo.User;
import com.kkb.pojo.UserExample;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public PageInfo<User> queryUserList(Integer pageNum, Integer pageSize, String uLoginname) {
        User user = new User();
        user.setuLoginname(uLoginname);
        if (pageNum != null && pageSize != null) {
            PageHelper.startPage(pageNum, pageSize);
        }
        List<User> users = userMapper.selectUserAndRole(user);
        return new PageInfo<>(users);
    }

    public User findUser(User user) {
        //只可能有一条
        List<User> users = userMapper.selectUserAndRole(user);
        for (User user1 : users) {
            return user1;
        }
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public int updateRoleInfo(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public int addUser(User user) {
        return userMapper.insert(user);
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public int deleteUser(List ids) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUIdIn(ids);
        return userMapper.deleteByExample(userExample);
    }

    public User login(User user) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andULoginnameEqualTo(user.getuLoginname().trim());
        criteria.andUPasswordEqualTo(user.getuPassword().trim());
        List<User> users = userMapper.selectByExample(userExample);
        for (User user1 : users) {

            return user1;
        }
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public int updatePass(User user) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUPasswordEqualTo(user.getuPassword());
        return userMapper.updateByPrimaryKeySelective(user);
    }
}
