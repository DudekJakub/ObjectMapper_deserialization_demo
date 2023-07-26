package com.example;

import java.io.Serializable;
import java.util.Map;

public class TestClassJavaMap implements Serializable {

    private Map<String, String> map;

    public TestClassJavaMap() {
    }

    public TestClassJavaMap(Map<String, String> map) {
        this.map = map;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "TestClassJavaMap{" +
                "map=" + map +
                '}';
    }
}
