package kr.hs.study.config;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  // 객체 만들어달라고 요청하는 파일임을 알려줌
public class BeanConfigClass {
    @Bean   // bean 객체 생성
    public TestBean1 java1() {
        TestBean1 t = new TestBean1();
        return t;
    }

    @Bean
    public TestBean2 java2() {
        TestBean2 t2 = new TestBean2();
        return t2;
    }
}
