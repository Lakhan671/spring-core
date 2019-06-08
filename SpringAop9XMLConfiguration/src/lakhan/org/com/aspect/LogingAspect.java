package lakhan.org.com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


public class LogingAspect {
	
	 
	 
		
	
		public Object myAroundAdvice(ProceedingJoinPoint proceedingjoinpoint){
			
        	Object returnValue=null;
        	try {
        		
        		System.out.println("...before Advice method...");
        		returnValue=proceedingjoinpoint.proceed();
				System.out.println("..after returning..");
			} catch (Throwable e) {
				System.out.println("..inside catch block..");
				
				//e.printStackTrace();
			}
        	System.out.println("....After finally....");
        	return returnValue;
		}
        
}

