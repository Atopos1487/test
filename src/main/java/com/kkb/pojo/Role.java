package com.kkb.pojo;

import java.util.List;

public class Role {
    private Integer rId;

    private String rName;

    private Integer rState;

    //角色对中间表 一对多
    private List<RoleMenu> roleMenus;

    //用于接收前端传角色对权限
    private String hiddenRM;

    public String getHiddenRM() {
        return hiddenRM;
    }

    public void setHiddenRM(String hiddenRM) {
        this.hiddenRM = hiddenRM;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public Integer getrState() {
        return rState;
    }

    public void setrState(Integer rState) {
        this.rState = rState;
    }

    public List<RoleMenu> getRoleMenus() {
        return roleMenus;
    }

    public void setRoleMenus(List<RoleMenu> roleMenus) {
        this.roleMenus = roleMenus;
    }

    @Override
    public String toString() {
        return "Role{" +
                "rId=" + rId +
                ", rName='" + rName + '\'' +
                ", rState=" + rState +
                ", roleMenus=" + roleMenus +
                '}';
    }
}