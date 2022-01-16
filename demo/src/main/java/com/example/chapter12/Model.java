package com.example.chapter12;

public class Model {
    private int _value;
    public Model(int value) {
        _value = value;
    }
    public void setValue(int value) {
        _value = value;
    }
    public int getValue() {
        return _value;
    }
    public void addValue() {
        _value++;
    }
    public void subtractValue() {
        _value--;
    }
}
