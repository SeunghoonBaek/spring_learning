import idv.bsh.spring.aop.AOPConfig;
import idv.bsh.spring.aop.CustomerBo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by lineplus on 2017. 7. 18..
 */
public class ApplicationAOPTest {

    @Test
    public void AOPXMLConfigTest(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AOPConfig.class);
        CustomerBo customerBo = context.getBean(CustomerBo.class);
        customerBo.addCustomer();
    }

    @Test
    public void AOPJavaConfigTest(){
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/idv/bsh/spring/aop/AOPConfig.xml");
        CustomerBo customerBo = (CustomerBo)context.getBean("customerBo");
        customerBo.addCustomer();
    }
}
