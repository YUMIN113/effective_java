package com.example.effectivejava.chapter01.item01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class ListQuiz {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        IntStream.rangeClosed(1, 10).forEach(it -> list.add(it));

        list.sort(Comparator.reverseOrder());
        System.out.println("역순 정렬 1 : " + list);


        List<Integer> numbers = new ArrayList<>();
        IntStream.rangeClosed(1, 10).forEach(it -> numbers.add(it));

        Comparator<Integer> desc1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };
        Collections.sort(numbers, desc1);
        System.out.println("역순 정렬 2 : " + numbers);

        Comparator<Integer> desc2 = (o1, o2) -> o2 - o1;
        numbers.sort(desc2);
        System.out.println("역순 정렬 3 : " + numbers);

        numbers.sort(desc2.reversed());
        System.out.println("reversed() 사용 : " + numbers);
    }
}
