package com.example;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

    public static void main(String[] args) throws CustomException {

        Map hMap= new HashMap<>();

        if (hMap.isEmpty()){
            throw new CustomException("map is empty");

        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
