package com.lmlibrary.bean;

import java.io.Serializable;

/**
 * Created by ccb on 2017/10/11.
 *
 */


public class ResponseBean<T> implements Serializable {
    public int status;
    public String msg;
    public T data;
}