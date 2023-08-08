package com.example.effectivejava.chapter01.item01;

import java.util.Arrays;

public class Order {

    private boolean prime;

    private boolean  urgent;

    private Product product;

    private OrderStatus orderStatus;

    // 문제 상황 :
    // 생성자 오버로딩으로 정의할 수 없다.
//    public Order(boolean prime, Product product) {
//        this.prime = prime;
//        this.product = product;
//    }
//
//    public Order(boolean urgent, Product product) {
//        this.prime = prime;
//        this.product = product;
//    }

    // 해결책 :
    // 정적 팩토리 메서드 사용
    // 생성자의 시그니쳐가 중복될 때 사용할 수 있다.

    public static Order primeOrder(Product product) {
        Order order = new Order();
        order.prime = true;
        order.product = product;
        return order;
    }

    public static Order urgentOrder(Product product) {
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }

    public static void main(String[] args) {
        // enum 타입이 가질 수 있는 모든 값을 출력
        Arrays.stream(OrderStatus.values()).forEach(System.out::println);

        // enum 은 하나의 인스턴스만 생성한다는 것을 보장 한다.
        // 따라서 (==) 사용을 권장한다.
        // (equals) 도 가능하지만 null 일 경우, NullPointerException 이 발생할 수 있다.
        Order order = new Order();
        if(order.orderStatus == OrderStatus.DELIVERING) {
            System.out.println("delivered");
        }

        // enum 을 key 값으로 set 이나 map 으로 사용할 경우, EnumSet, EnumMap 을 사용해야 한다.
    }
}
