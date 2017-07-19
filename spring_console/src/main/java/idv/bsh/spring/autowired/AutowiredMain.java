package idv.bsh.spring.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by lineplus on 2017. 7. 17..
 */
public class AutowiredMain {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(PusherConfig.class);
        AdminService adminService = context.getBean(AdminService.class);

        adminService.doSomethings();
    }
}
