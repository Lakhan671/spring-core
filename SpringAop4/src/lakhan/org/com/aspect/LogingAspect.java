package lakhan.org.com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogingAspect {
	
	 @Before("allCircleMethod2()")
		public void LoggingAdvice(JoinPoint joinpoint){
			//System.out.println(joinpoint.toString());
		 System.out.println(joinpoint.getTarget());
		}
	    
	  
	   /* @After("args(name)")   //to know the what is passed in method 
	    public void allStringArgumentMethod(String name){
	    	System.out.println("method take String is called. the value is who passed:"+name);
			
		}*/
	 @AfterReturning("args(name)")   //for complete execution of method..then called 
	    public void allStringArgumentMethod(String name){
	    	System.out.println("method is successfull executed. the value is who passed:"+name);
			
		}
		@Pointcut("execution( * get*())")
		public void allGets(){
			System.out.println("inside getall");
			
		}
		
		
		@Pointcut("within(lakhan.org.com.model.Triangle)")
		public void allCircleMethod2(){
			System.out.println("inside all circlemethod2");
			
		}
}
