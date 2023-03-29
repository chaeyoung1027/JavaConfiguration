package kr.hs.study.config;


import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

//이 파일은 객체 만들어줘! 라고 스프링에게 요청하는 설정파일
@Configuration
public class BeanConfigClass {

    @Bean
    public TestBean1 java1(){
        TestBean1 t = new TestBean1();
        return t;
    }
    @Bean(name = "a")   //각각 Bean을 붙이기!
    public TestBean2 java2(){
        TestBean2 t2 = new TestBean2();
        return t2;
    }
    @Bean   //annotation!
    @Lazy
    public TestBean3 java3(){
        TestBean3 t3 = new TestBean3();
        return t3;
    }
}
