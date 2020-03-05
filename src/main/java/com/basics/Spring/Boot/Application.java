package com.basics.Spring.Boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
        int result = binarySearch.binarySearch(new int[]{124, 6, 5, 6, 8, 1, 7}, 3);
        System.out.println(result);
//        SpringApplication.run(Application.class, args);
    }

}
