package idv.bsh.spring.introduction;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

/**
 * Created by lineplus on 2017. 7. 18..
 */


public class IsModifiedImpl
        extends DelegatingIntroductionInterceptor
        implements IsModified{

    private boolean isModified = false;

    @Override
    public boolean isModified() {
        return isModified;
    }

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {

        if (invocation.getMethod().getName().startsWith("set")) {
            isModified = true;
        }

        return super.invoke(invocation);
    }
}


