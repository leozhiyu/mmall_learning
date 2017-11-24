package com.mmall.common;

public enum ResponseCode {
    // 成功
    SUCCESS(0,"SUCCESS"),
    // 失败,尝试登录，但是失败了
    ERROR(1,"ERROR"),
    // 强制登录，进入没有权限的页面，需要登录
    NEED_LOGIN(10,"NEED_LOGIN"),
    // 不合法参数
    ILLEGAL_ARGUMENT(2,"ILLEGAL_ARGUMENT");

    private final int code;
    private final String desc;

    //枚举类的构造方法默认强制是私有的
    ResponseCode(int code,String desc){
        this.code = code;
        this.desc = desc;
    }

    public int getCode(){
        return code;
    }

    public String getDesc(){
        return desc;
    }

}
