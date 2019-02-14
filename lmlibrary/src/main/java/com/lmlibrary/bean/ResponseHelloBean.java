package com.lmlibrary.bean;

import java.io.Serializable;

/**
 * Created by ccb on 2017/10/11.
 */


public class ResponseHelloBean<T> implements Serializable {
    public String status;
    public T result;
    public String msg;
}