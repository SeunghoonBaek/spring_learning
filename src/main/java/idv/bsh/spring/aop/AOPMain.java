package idv.bsh.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by lineplus on 2017. 7. 18..
 */
public class AOPMain {

    public static void main(String[] args){

        ApplicationContext context = new AnnotationConfigApplicationContext(AOPConfig.class);
        CustomerBo customerBo = context.getBean(CustomerBo.class);
        customerBo.addCustomer();

//
//        customerBo.addCustomerReturnValue();
//
//        try{
//            customerBo.addCustomerThrowException();
//        }catch(Exception err){
//
//        }
//
//        customerBo.addCustomerAround("bsh");
    }
}
