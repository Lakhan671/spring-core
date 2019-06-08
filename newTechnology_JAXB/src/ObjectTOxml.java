import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
// Java Architecture for XML Binding (JAXB). This tutorial is based on Java 6.

public class ObjectTOxml {
	public static void main(String[] arg) throws JAXBException{
		JAXBContext contextObject=JAXBContext.newInstance(Employee.class);
		Marshaller marshallerobj=contextObject.createMarshaller();
		marshallerobj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		Employee emp=new Employee(101,"lakhan singh",122222);
		try {
			marshallerobj.marshal(emp,new FileOutputStream("d:employee.xml"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
