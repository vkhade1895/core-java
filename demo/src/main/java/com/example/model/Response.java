package com.example.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Optional;

public class Response {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Optional<Doctor> resDoctor;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String msg;

    public Optional<Doctor> getResDoctor() {
        return resDoctor;
    }

    public void setResDoctor(Optional<Doctor> resDoctor) {
        this.resDoctor = resDoctor;
    }

    @Override
    public String toString() {
        return "Response{" +
                "resDoctor=" + resDoctor +
                ", status='" + msg + '\'' +
                '}';
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
