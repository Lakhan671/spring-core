import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


public class XMLToObject {
	public static void main(String[] agr){
		try{
			File file=new File("D://filedocument//question.xml");
			JAXBContext context=JAXBContext.newInstance(Question.class);
			Unmarshaller unmar=context.createUnmarshaller();
			Question que=(Question)unmar.unmarshal(file);
			System.out.println(que.getId()+"  "+que.getQuestionname());
			System.out.println("...Answer...");
			//System.out.println(que);
		List<Answer> list=que.getAnswer();
		System.out.println(list.size());
		
		for(Answer ans:list){
			System.out.println(ans.getId()+" "+ans.getAnswername()+"  "+ans.getPostedby());
			
			
		}
	
	}catch(JAXBException e){
		System.out.println(e);
	}
		
	}

}
