package com.basics.Spring.Boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        //Application Context manages all the beans
        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);

        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
        int result = binarySearch.binarySearch(new int[]{124, 6, 5, 6, 8, 1, 7}, 3);
        System.out.println(result);
    }

}
