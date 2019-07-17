package com.stackroute;

import org.springframework.stereotype.Component;

@Component
public class User {
    private String msg;
    //setters and getters
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


}

