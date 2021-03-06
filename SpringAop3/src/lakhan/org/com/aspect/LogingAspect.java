package lakhan.org.com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogingAspect {
	/*@Before("execution(public String getName())")
	not understand which public String getName() is called
	dueto it we give class name as..
	*/
	//@Before("execution(public String lakhan.org.com.model.Triangle.getName())")
	/*to applied at all method which is start with get have returntype 
	string .is applied as*/
	//@Before("execution(public String get*())")
	
	/*{get(*) it means one or more argument have then called
		
	get(..) it means zero or more argument have then called
	*get() means any modifier and any return return type then called
		
	}*/
	
	/*to applied at all method which is start with get have not returntype  .is applied as*/
	
	/*@Before("execution( * get*())")
	public void LoggingAdvice(){
		System.out.println("Advice run : getmethod is called..");
	}
    
	@Before("execution( * get*())")
	public void secondAdvice(){
		
		System.out.println(" Second Advice run : getmethod is called..");	
	}
	@Pointcut("execution( * get*())")
	public void allGets(){
		
	}*/
	
	//another way as
	
	
	//@Before("allGets()")
	//@Before("allCircleMethod2()")
	/* @Before("allGetCircleMethod()")
	public void LoggingAdvice(){
		System.out.println("Advice run : getmethod is called..");
	}
    
	//@Before("allGets()")
	@Before("allGets()")
	public void secondAdvice(){
		
		System.out.println(" Second Advice run : getmethod is called..");	
	}
	@Pointcut("execution( * get*())")
	public void allGets(){
		System.out.println("inside getall");
		
	}
	
	@Pointcut("execution(* lakhan.org.com.model.Circle.*get(..))")
	public void allGetCircleMethod(){
		System.out.println("inside all circlemethod");
		
	}
	@Pointcut("within(lakhan.org.com.model.Triangle)")
	public void allCircleMethod2(){
		System.out.println("inside all circlemethod2");
		
	}*/
/************************************************************
 * another ways as...
...............................................................
************************************************************
	*/
	 @Before("allCircleMethod2()")
		public void LoggingAdvice(JoinPoint joinpoint){
			//System.out.println(joinpoint.toString());
		 System.out.println(joinpoint.getTarget());
		}
	    
	  //  @Before("args(String)")//for all get string will called
	    @Before("args(name)")//to know the what is passed in method 
	    public void allStringArgumentMethod(String name){
	    	System.out.println("method take String is called. the value is who passed:"+name);
			
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
