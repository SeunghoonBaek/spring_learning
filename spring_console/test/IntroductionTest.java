
import idv.bsh.spring.introduction.IsModified;
import idv.bsh.spring.introduction.IsModifiedAdvisor;
import idv.bsh.spring.introduction.IsModifiedImpl;
import idv.bsh.spring.introduction.TargetBean;
import idv.bsh.spring.proxyfactorybean.Service;
import idv.bsh.spring.proxyfactorybean.ServiceImpl;
import idv.bsh.spring.proxyfactorybean.ServiceLoggingAdvice;
import org.junit.Before;
import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.framework.ProxyFactoryBean;

/**
 * Created by lineplus on 2017. 7. 18..
 */
public class IntroductionTest {

    private ProxyFactoryBean proxyFactoryBean;
    private ProxyFactory proxyFactory;

    @Before
    public void before(){
        proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new TargetBean());
        proxyFactory.addAdvisor(new IsModifiedAdvisor());
        proxyFactory.setOptimize(true);

        proxyFactoryBean = new ProxyFactoryBean();
        proxyFactoryBean.setTarget(new TargetBean());
        proxyFactoryBean.addAdvisor(new IsModifiedAdvisor());
        proxyFactoryBean.setOptimize(true);
    }

    @Test
    public void introductionTest(){
        TargetBean targetBean = (TargetBean) proxyFactory.getProxy();
        IsModified isModified = (IsModified) targetBean;

        System.out.println(isModified.isModified());

        targetBean.setName("test");

        System.out.println(isModified.isModified());
    }

    @Test
    public void proxyFactoryBeanTest(){
        TargetBean targetBean = (TargetBean) proxyFactoryBean.getObject();
        IsModified isModified = (IsModified) targetBean;

        System.out.println(isModified.isModified());

        targetBean.setName("test");

        System.out.println(isModified.isModified());
    }
}
