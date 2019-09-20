package com.example;

import java.io.IOException;
import java.net.URL;

public class Hello {

    public static void main(String[] args) throws IOException {
        System.out.println("hello");

        URL url = Hello.class.getClassLoader().getResource("app.properties");
        System.out.println("url: " + url);
        System.in.read();
    }
}
