package com.cjg.awesomeshare.common.dto;

import java.io.Serializable;

/**
 * @auther Tianpenghao
 * @date Created in 2020/10/21 16:51
 */
public class ResultDTO<T> implements Serializable {
    private static final long serialVersionUID = 9131899105712058126L;
    private boolean success;
    private String message;
    private String code;
    private T data;

    public static <T> ResultDTO<T> build(){
        return new ResultDTO<>();
    }

    public static <T> ResultDTO<T> ok(){
        ResultDTO<T> resultDTO = new ResultDTO<>();
        return resultDTO.success();
    }

    public static <T> ResultDTO<T> ok(T data){
        ResultDTO<T> resultDTO = new ResultDTO<>();
        return resultDTO.success(data);
    }

    public static <T> ResultDTO<T> fail(String message){
        ResultDTO<T> resultDTO = new ResultDTO<>();
        return resultDTO.failure(message);
    }

    public static <T> ResultDTO<T> fail(String code,String message){
        ResultDTO<T> resultDTO = new ResultDTO<>();
        return resultDTO.failure(code,message);
    }

    public ResultDTO<T> success() {
        this.success=true;
        this.code="200";
        this.message="ok";
        return this;
    }

    public ResultDTO<T> success(T data) {
        this.success=true;
        this.code="200";
        this.message="ok";
        this.data = data;
        return this;
    }

    public ResultDTO<T> success(String code,String message ,T data) {
        this.success=true;
        this.code=code;
        this.message=message;
        this.data = data;
        return this;
    }
    public ResultDTO<T> success(String code,String message ) {
        this.success=true;
        this.code=code;
        this.message=message;
        return this;
    }
    public ResultDTO<T> failure() {
        this.success=false;
        this.code="500";
        this.message="error";
        return this;
    }

    public ResultDTO<T> failure(String message) {
        this.success=false;
        this.code="500";
        this.message=message;
        return this;
    }

    public ResultDTO<T> failure(String code,String message) {
        this.success=false;
        this.code=code;
        this.message=message;
        return this;
    }

    public ResultDTO<T> failure(String code,String message ,T data) {
        this.success=false;
        this.code=code;
        this.message=message;
        this.data = data;
        return this;
    }

    public T getData() {
        return data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "ResultDTO [success=" + success + ", message=" + message + ", code=" + code + ", data=" + data + "]";
    }

}
