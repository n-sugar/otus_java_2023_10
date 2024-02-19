package ru.otus.java;

import com.google.common.base.Splitter;
import java.util.List;

@SuppressWarnings("java:S106")
public class HelloOtus {
    public static void main(String[] args) {
        String numbers = "10,11,25,6,8,9,6,8,5,10258";
        List<String> list = Splitter.on(",").splitToList(numbers);
        System.out.println("Numbers:");
        for (String number : list) {
            System.out.println(number);
        }
    }
}
