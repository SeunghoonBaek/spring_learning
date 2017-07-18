package idv.bsh.spring.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Aspect
public class LoggingAspect {

	@Before("execution(* idv.bsh.spring.aop.CustomerBo.addCustomer(..))")
	public void logBefore(JoinPoint joinPoint) {

		System.out.println("logBefore() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");
	}

//	@Before("execution(* idv.bsh.spring.aop.CustomerBo.addCustomer(..))")
//	public void logBefore(JoinPoint joinPoint) {
//
//		System.out.println("logBefore() is running!");
//		System.out.println("hijacked : " + joinPoint.getSignature().getName());
//		System.out.println("******");
//	}

	@After("execution(* idv.bsh.spring.aop.CustomerBo.addCustomer(..))")
	public void logAfter(JoinPoint joinPoint) {

//		System.out.println("logAfter() is running!");
//		System.out.println("hijacked : " + joinPoint.getSignature().getName());
//		System.out.println("******");
	}

	@AfterReturning(
			pointcut = "execution(* idv.bsh.spring.aop.CustomerBo.addCustomerReturnValue(..))",
			returning= "result")
	public void logAfterReturning(JoinPoint joinPoint, Object result) {

		System.out.println("logAfterReturning() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("Method returned value is : " + result);
		System.out.println("******");

	}

	@Pointcut("execution(* idv.bsh.spring.aop.CustomerBo.addCustomer(..))")
	public void pointcut1(){}

	@Pointcut("execution(* idv.bsh.spring.aop.CustomerBo.addCustomerReturnValue(..))")
	public void pointcut2(){}

	@Before("pointcut1() || pointcut2()")
	public void PointCutAnnotationSample(){
		System.out.println("Before method");
	}


	@AfterThrowing(
			pointcut = "execution(* idv.bsh.spring.aop.CustomerBo.addCustomerThrowException(..))",
			throwing= "error")
	public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {

		System.out.println("logAfterThrowing() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("Exception : " + error);
		System.out.println("******");
	}
	
	
	@Around("execution(* idv.bsh.spring.aop.CustomerBo.addCustomerAround(..))")
	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {

		System.out.println("logAround() is running!");
		System.out.println("hijacked method : " + joinPoint.getSignature().getName());
		System.out.println("hijacked arguments : " + Arrays.toString(joinPoint.getArgs()));

		System.out.println("Around before is running!");
		joinPoint.proceed();
		System.out.println("Around after is running!");

		System.out.println("******");
	}
	
}