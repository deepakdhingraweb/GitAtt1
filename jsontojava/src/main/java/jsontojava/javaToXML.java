package jsontojava;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class javaToXML {
		
	 public static void main(String[] args) throws Exception {
		 	JAXBContext context = JAXBContext.newInstance(Employee.class);

		    Marshaller m = context.createMarshaller();
		    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		    Employee object = new Employee();
		    object.setCode("CA");
		    object.setName("Cath");
		   

		    m.marshal(object, System.out);
	 }
	
	 @Override
	 public String toString() {
		 try{
		 JAXBContext context = JAXBContext.newInstance(Employee.class);

		    Marshaller m = context.createMarshaller();
		    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		    Employee object = new Employee();
		    object.setCode("CA");
		    object.setName("Cath");
		   
		    
		    m.marshal(object, System.out);
	         
		   
		 return System.out.toString();
		 }catch(Exception ex){
			 return "abc";
		 }
	 }
	
}
