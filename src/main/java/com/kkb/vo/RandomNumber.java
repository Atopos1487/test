package com.kkb.vo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomNumber {
    public String getRandomNumber(){
        Random random = new Random();
        //生成一个四位的随机数
        String randomCode="";
        for(int i = 0;i<4;i++){
            String s = String.valueOf(random.nextInt(10));
            randomCode+=s;
        }
        return randomCode;
    }

}
