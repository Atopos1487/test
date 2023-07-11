package com.kkb.pojo;

import org.apache.ibatis.type.Alias;

@Alias("roleMenu")
public class RoleMenu {
    private Integer id;

    private Integer rId;

    private Integer mId;

    //中间表对菜单表 一对一
    private Menu menu;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}