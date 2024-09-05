package study.kiwi.ticketing_kiwi.domain.test;

import lombok.Getter;

@Getter
public class TestMember {
    private String name;
    private int age;

    TestMember(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
