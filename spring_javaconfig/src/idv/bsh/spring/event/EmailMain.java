package idv.bsh.spring.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.Arrays;

/**
 * Created by baek on 2017. 7. 17..
 */
public class EmailMain {

    public static void main(String[] args){
        ApplicationContext context =
                new FileSystemXmlApplicationContext(
                        "/src/idv/bsh/spring/event/eventconfig.xml");

        EmailService bean = context.getBean(EmailService.class);
        bean.sendEmail("black@list.org", "hi wonwoo");
    }
}
