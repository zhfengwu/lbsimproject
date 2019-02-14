package com.lmlibrary.exception;

import com.google.gson.Gson;
import com.lmlibrary.bean.SimpleResponse;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * Created by ccb on 2017/12/7.
 */

public class MyException extends IllegalStateException {

    private SimpleResponse errorBean;

    public MyException(String s) {
        super(s);
        errorBean = new Gson().fromJson(s, SimpleResponse.class);

    }

    public SimpleResponse getErrorBean() {
        return errorBean;
    }



}
