package kr.hs.study.beans;

public class TestBean4 {
    public TestBean4(){
        System.out.println("TestBean4의 생성자");
    }

    public void init(){
        System.out.println("init 메서드");
    }

    public void destroy(){
        System.out.println("destroy메서드");
    }
}
