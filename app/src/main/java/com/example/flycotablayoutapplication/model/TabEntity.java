package com.example.flycotablayoutapplication.model;

import com.flyco.tablayout.listener.CustomTabEntity;

/**
 * @Author: david.lvfujiang
 * @Date: 2019/10/28
 * @Describe:
 */
public class TabEntity implements CustomTabEntity {

    public String title;
    private int selectedIcon;
    private int unSelectedIcon;

    public TabEntity(String title, int selectedIcon, int unSelectedIcon) {
        this.title = title;
        this.selectedIcon = selectedIcon;
        this.unSelectedIcon = unSelectedIcon;
    }

    @Override
    public String getTabTitle() {
        return title;
    }

    @Override
    public int getTabSelectedIcon() {
        return selectedIcon;
    }

    @Override
    public int getTabUnselectedIcon() {
        return unSelectedIcon;
    }

}