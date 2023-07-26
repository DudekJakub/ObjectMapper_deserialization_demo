package com.example;

import java.io.Serializable;
import java.util.List;

public class TestClassJavaList implements Serializable {

    private List<String> list;

    public TestClassJavaList() {
    }

    public TestClassJavaList(List<String> list) {
        this.list = list;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "TestClassJavaList{" +
                "list=" + list +
                '}';
    }
}
