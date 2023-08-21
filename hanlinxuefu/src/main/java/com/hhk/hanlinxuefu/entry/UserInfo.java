package com.hhk.hanlinxuefu.entry;

import lombok.Data;

import java.util.Date;

@Data
public class UserInfo {

    private Integer id;

    private String name;

    private Date birthday;

    private String signature;

    private String avatar;

    private String gender;

    private String nationality;

}
