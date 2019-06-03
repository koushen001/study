package com.cike.java8.lambda;

import lombok.extern.slf4j.Slf4j;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Description 事件处理
 * @Author kou
 * @Version 1.0
 **/
@Slf4j
public class LambdaExample2 {

    public static void main(String[] args) {
        Button button = new Button();
        // Old way
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello world");
            }
        });

        // New way
        button.addActionListener((e) -> System.out.println("Hello world"));
    }

}
