package lakhan.org.com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
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
	    
	 
	 @AfterReturning(pointcut="args(name)",returning="returningString")   //for complete execution of method..then called 
	    public void allStringArgumentMethod(String name,String returningString){
	    	System.out.println("method is sucessfull executed. the value is who passed:"+name+"  return output value is:"+returningString);
			
		}
	 @AfterThrowing(pointcut="args(name)",throwing="ex")
	 public void exceptuonAdvice(String name,Exception ex){
		 System.out.println("exception has been throws and   Exception is as:"+ex);
		 
	 }
		@Pointcut("execution( * get*())")
		public void allGets(){
			System.out.println("inside getall");
			
		}
		
		
		@Pointcut("within(lakhan.org.com.model.Triangle)")
		public void allCircleMethod2(){
			System.out.println("inside all circlemethod2");
			
		}
        @Around("allGets()")
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

