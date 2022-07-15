package com.Eisen.daily.exception_orElseThrow;


public class CustomException extends RuntimeException {
    protected String code = "500";
    protected String messageCode = "undefined";

    public <T extends CustomException> T setCode(String code){
        this.code = code;
        return (T)this;
    }

}
