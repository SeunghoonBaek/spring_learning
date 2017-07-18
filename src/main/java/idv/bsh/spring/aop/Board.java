package idv.bsh.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by lineplus on 2017. 7. 18..
 */
public class Board {

    @Pointcut("execution(* test.Service.getBoards(..))")
    public void getBoards(){}

    @Pointcut("execution(* test.Service.getUsers(..))")
    public void getUsers(){}

    @Before("getBoards() || getUsers()")
    public void beforeLogging(JoinPoint joinPoint) {

    }
}



