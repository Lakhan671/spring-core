package withotInterface.org;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class BookCollection implements InitializingBean,DisposableBean{
	private BookType booktype1;
	private BookType booktype2;
	private BookType booktype3;
	
	 public BookType getBooktype1() {
		return booktype1;
	}

	public void setBooktype1(BookType booktype1) {
		this.booktype1 = booktype1;
	}

	public BookType getBooktype2() {
		return booktype2;
	}

	public void setBooktype2(BookType booktype2) {
		this.booktype2 = booktype2;
	}

	public BookType getBooktype3() {
		return booktype3;
	}

	public void setBooktype3(BookType booktype3) {
		this.booktype3 = booktype3;
	}

	public void bookinformation(){
		 System.out.println("java book: "+getBooktype1().getJava()+" c book :"+getBooktype1().getC()+"database book: "+getBooktype1().getBD());
		 System.out.println("java book: "+getBooktype2().getJava()+" c book :"+getBooktype2().getC()+"database book: "+getBooktype2().getBD());
		 System.out.println("java book: "+getBooktype3().getJava()+" c book :"+getBooktype3().getC()+"database book: "+getBooktype3().getBD());
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitalizationBean int method is called");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean Destroyed method is called ");
	}
	

}
