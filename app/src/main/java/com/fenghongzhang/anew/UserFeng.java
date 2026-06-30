package com.fenghongzhang.anew;

import javax.inject.Inject;

public class UserFeng {
    @Feng( "哈哈")
    private String name;

    @Inject
    public UserFeng() {
    }

    public UserFeng(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

