package com.example.mark1.dto;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


public class Output {

    public Output(){

    }
    public Output(String success, String message) {
        this.success = success;
        this.message = message;
    }


    String success;
    String message;


    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
