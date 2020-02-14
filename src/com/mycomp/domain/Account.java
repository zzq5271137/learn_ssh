package com.mycomp.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {
    private Integer id;
    private String name;
    private Double money;

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
