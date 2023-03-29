package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.config.BeanConfigClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

//        TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);
//        System.out.println("data1 : "+obj1.getData1());

        ctx.close();
        System.out.println("=========================================================");

        AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
        TestBean1 obj1 = ctx2.getBean("java1", TestBean1.class);
//        TestBean2 obj2 = ctx2.getBean("java2", TestBean2.class);  //이름을 a로 바꿨기 때문에 존재하지 않는다고 에러가 난다.
//        obj2.pr_Method();
        TestBean2 obj3 = ctx2.getBean("a", TestBean2.class);
        obj3.pr_Method();
        System.out.println("obj3 : "+obj3);
//        TestBean3 obj4 = ctx2.getBean("java3", TestBean3.class);
//        obj4.pr_Method2();

        TestBean2 obj5 = ctx2.getBean("a", TestBean2.class);
        System.out.println("obj5 : "+obj5);

        ctx2.close();
    }
}