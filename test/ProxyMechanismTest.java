import idv.bsh.spring.proxyfactorybean.Service;
import idv.bsh.spring.proxyfactorybean.ServiceImpl;
import idv.bsh.spring.proxyfactorybean.ServiceLoggingAdvice;
import idv.bsh.spring.proxyfactorybean.ServiceWithoutInterface;
import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.framework.ProxyFactoryBean;

/**
 * Created by baek on 2017. 7. 18..
 */
public class ProxyMechanismTest {

    @Test
    public void targetClass_WithInterface_Test(){
        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
        proxyFactoryBean.setTarget(new ServiceImpl());
        proxyFactoryBean.addAdvice(new ServiceLoggingAdvice());

        Service service = (Service) proxyFactoryBean.getObject();
        System.out.println(service.getClass().toString());
    }

    @Test
    public void targetClass_WithoutInterface_Test(){
        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
        proxyFactoryBean.setTarget(new ServiceWithoutInterface());
        proxyFactoryBean.addAdvice(new ServiceLoggingAdvice());

        ServiceWithoutInterface service = (ServiceWithoutInterface) proxyFactoryBean.getObject();
        System.out.println(service.getClass().toString());
    }

    @Test
    public void targetClass_WithInterface_And_OnOptimizer_Test(){
        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
        proxyFactoryBean.setTarget(new ServiceImpl());
        proxyFactoryBean.addAdvice(new ServiceLoggingAdvice());
        proxyFactoryBean.setOptimize(true);

        Service service = (Service) proxyFactoryBean.getObject();
        System.out.println(service.getClass().toString());
    }

}
