package idv.bsh.spring.proxyfactorybean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by lineplus on 2017. 7. 18..
 */


public class ServiceLoggingAdvice implements MethodInterceptor {


    @Override
    public Object invoke(MethodInvocation methodInvocation)
            throws Throwable {

        System.out.println("** Before calling service method");
        methodInvocation.proceed();
        System.out.println("** Before calling service method");
        return null;
    }
}
