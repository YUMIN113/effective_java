package com.example.effectivejava.chapter01.item01;

public interface HelloService {

    // 인터페이스에서는 생략시, public 으로 간주

    String hello();

    // java8 부터는 static 메서드를 인터페이스에 정의할 수 있다.

    // 세번째 장점
    // 인터페이스로 선언시 유연해진다.
    // 정적 팩터리 메서드를 통해서 하위 객체를 리턴할 수 있다.
    // 매개변수를 통해서 각기 다른 인스턴스를 리턴할 수 있다.
    static HelloService of(String lang) {
        if(lang.equals("ko")) {
            return new KoreanHelloService();
        } else {
            return new EnglishHelloService();
        }
    }
}
