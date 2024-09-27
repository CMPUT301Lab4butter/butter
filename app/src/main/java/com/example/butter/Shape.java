package com.example.butter;

abstract public class Shape {

    private int x;
    private int y;
    private String color = "red";

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
}
