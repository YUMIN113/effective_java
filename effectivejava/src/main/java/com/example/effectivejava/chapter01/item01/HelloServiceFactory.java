package com.example.effectivejava.chapter01.item01;

public class HelloServiceFactory {

    // 네번째 장점
    // of(String lang)[정적 팩터리 메서드] 메서드를 통해 어떤 인스턴스를 가져오던 타입은 인터페이스의 타입이 된다.
    // 즉, 구체적인 타입을 클라이언트에게 숨길 수 있다.
    public static void main(String[] args) {
        HelloService ko = HelloService.of("ko");
        System.out.println(ko.hello());
    }
}
