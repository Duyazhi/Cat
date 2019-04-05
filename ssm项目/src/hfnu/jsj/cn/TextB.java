package hfnu.jsj.cn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TextB {
    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        C c = (C)applicationContext.getBean("c");
        c.sleep();
    }
}
