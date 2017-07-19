package idv.bsh.spring.introduction;

import org.aopalliance.aop.Advice;
import org.springframework.aop.support.DefaultIntroductionAdvisor;

/**
 * Created by lineplus on 2017. 7. 18..
 */


public class IsModifiedAdvisor
        extends DefaultIntroductionAdvisor {

    public IsModifiedAdvisor() {
        super( new IsModifiedImpl());
    }
}
