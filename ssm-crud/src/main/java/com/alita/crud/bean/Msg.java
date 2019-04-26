package com.alita.crud.bean;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * 通用的返回
 */
@Data
public class Msg {
    // 状态吗
    private int code;
    // 提示信息
    private String msg;
    // 返回给用户的数据
    private Map<String, Object> data = new HashMap<>();

    public static Msg success() {
        Msg s = new Msg();
        s.setCode(100);
        s.setMsg("ok");
        return s;
    }

    public static Msg fail() {
        Msg s = new Msg();
        s.setCode(-1);
        s.setMsg("fail");
        return s;
    }

    public Msg add(String key, Object value) {
        data.put(key, value);
        return this;
    }

}
