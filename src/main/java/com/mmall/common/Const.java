package com.mmall.common;

import com.google.common.collect.Sets;

import java.util.Set;

public class Const {
    //表示当前用户
    public static final String CURRENT_USER = "currentUser";

    //用户名
    public static final String USERNAME = "username";

    //邮箱
    public static final String EMAIL = "email";

    public interface ProductListOrderBy{
        Set<String> PRICE_ASC_DESC = Sets.newHashSet("price_desc","price_asc");
    }

    public interface Cart{
        int CHECKED = 1;//购物车选中状态
        int UN_CHECKED = 0;//购物车中未选中状态

        String LIMIT_NUM_FAIL = "LIMIT_NUM_FAIL";// 购物车产品数量限制失败
        String LIMIT_NUM_SUCCESS = "LIMIT_NUM_SUCCESS"; //购物车产品数量限制成功
    }

    //角色
    public interface Role{
        //普通用户
        int ROLE_CUSTOMER = 0;
        //管理员
        int ROLE_ADMIN = 1;
    }

    public enum ProductStatusEnum{

        ON_SALE(1,"在线");

        private int code;
        private String value;
        ProductStatusEnum(int code, String value){
            this.code = code;
            this.value = value;
        }

        public String getValue(){
            return value;
        }

        public int getCode(){
            return code;
        }
    }
}
