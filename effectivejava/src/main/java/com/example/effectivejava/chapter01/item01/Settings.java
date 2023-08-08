package com.example.effectivejava.chapter01.item01;

public class Settings {

    private boolean useAutoSteering;

    private boolean useABS;

    private Difficulty difficulty;

    private static final Settings SETTINGS = new Settings();

    // 여러개의 인스턴스 생성 불가능
    // 생성자로는 할 수 없지만 정적 팩토리 메서드를 통해서는 가능
    // 생성자로는 객체를 사용하는 사람이 원하는대로 객체를 생성한다.
    // 정적 팩토리 메서드를 통해서는 객체 생성을 원하는대로 객체를 생성할 수 없다.(컨트롤 제한)
    public static Settings getInstance() {
        return SETTINGS;
    }
}
