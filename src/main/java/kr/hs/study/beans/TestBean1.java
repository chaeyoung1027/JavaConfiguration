package kr.hs.study.beans;

import lombok.Data;

@Data
public class TestBean1
{
    private int data1;


    public TestBean1(){
        System.out.println("TestBean1의 생성자");
    }
}
