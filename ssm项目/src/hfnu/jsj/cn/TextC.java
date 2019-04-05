package hfnu.jsj.cn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TextC {
    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        B b = (B)applicationContext.getBean("b");
        b.say();
    }
}
