package com.example.effectivejava.chapter01.item01;

public enum OrderStatus {
    PREPARING(0), SHIPPED(1), DELIVERING(2), DELIVERED(3);

    // enum 필드를 가질 수 있다.
    private int number;

    // enum 생성자를 가질 수 있다.
    OrderStatus(int number) {
        this.number = number;
    }
}
