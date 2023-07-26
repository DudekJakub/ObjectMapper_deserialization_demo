package com.example;

import java.io.Serializable;
import java.util.Set;

public class TestClassJavaSet implements Serializable {

    private Set<String> set;

    public TestClassJavaSet() {
    }

    public TestClassJavaSet(Set<String> set) {
        this.set = set;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    @Override
    public String toString() {
        return "TestClassJavaSet{" +
                "set=" + set +
                '}';
    }
}
