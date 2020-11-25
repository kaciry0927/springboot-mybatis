/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2020 kaciry@126.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.kaciry.dto;

/**
 * @author kaciry
 * @date 2020/11/25 18:14
 * @description
 */
public class ResponseData<T> {
    private int code;
    private String msg;
    private T data;

    /**
     * 分别提供返回成功和失败的不同的方法
     * 也就是说返回的数据形式是RestResponse所包含的
     * d第一个T ：泛型方法的标示，没有实际的意义
     * 第二个返回的数据类型的一种规范
     * 这也就是所谓的工厂模式的应用,
     */

    public static <T> ResponseData<T> success() {
        return new ResponseData<>();
    }

    public static <T> ResponseData<T> success(T data) {
        ResponseData restResponse = new ResponseData();
        restResponse.setData(data);
        return restResponse;
    }

    public static <T> ResponseData<T> error(RestCode restCode) {
        ResponseData<T> restResponse = new ResponseData<>(restCode.code, restCode.msg);
        return restResponse;
    }

    public ResponseData() {
        //默认会调用有参的构造函数,默认是成功的
        this(RestCode.OK.code, RestCode.OK.msg);
    }

    public ResponseData(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResponseData(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResponseData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
