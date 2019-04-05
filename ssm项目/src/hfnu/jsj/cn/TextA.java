package hfnu.jsj.cn;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TextA {
    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        D d = (D)applicationContext.getBean("d");
        d.eat();
    }

}
