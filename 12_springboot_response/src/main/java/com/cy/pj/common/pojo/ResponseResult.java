package com.cy.pj.common.pojo;

public class ResponseResult {
    //响应状态码（或用code）
    private Integer state=1;//默认状态码假设为1
    //状态的具体信息
    private String message="ok";
    //响应体
    private Object data;

    public ResponseResult(String message) {
        this.message = message;
    }

    public ResponseResult(Object data) {
        this.data = data;
    }

    public ResponseResult(Throwable e){
        this.state=0;
        this.message=e.getMessage();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ResponseResult() {
    }
}
