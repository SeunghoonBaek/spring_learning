import idv.bsh.spring.proxyfactorybean.Service;
import idv.bsh.spring.proxyfactorybean.ServiceImpl;
import idv.bsh.spring.proxyfactorybean.ServiceLoggingAdvice;
import org.junit.Before;
import org.junit.Test;
import org.springframework.aop.framework.ProxyFactoryBean;

/**
 * Created by lineplus on 2017. 7. 18..
 */


public class ProxyFactoryBeanTest {

    private ProxyFactoryBean proxyFactoryBean;

    @Before
    public void before(){
        proxyFactoryBean = new ProxyFactoryBean();
        proxyFactoryBean.setTarget(new ServiceImpl());
        proxyFactoryBean.addAdvice(new ServiceLoggingAdvice());
    }

    @Test
    public void proxyFactoryBeanTest(){
        Service service = (Service) proxyFactoryBean.getObject();
        service.begin();
    }
}
