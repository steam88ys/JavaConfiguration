package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.config.BeanConfigClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);
        System.out.println("obj1: "+obj1);

        TestBean2 obj11 = ctx.getBean("t2", TestBean2.class);
        System.out.println("obj1-1: "+obj11);
        ctx.close();

        System.out.println("============================================================");

        AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
        TestBean1 obj2 = ctx2.getBean("java1", TestBean1.class);
        System.out.println("obj2: "+obj2);

        TestBean2 obj22 = ctx2.getBean("java2", TestBean2.class);
        System.out.println("obj2-1: "+obj22);
        ctx2.close();
    }
}