package modal_files;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import beans.Employee;

public class Main_file {

	private static ApplicationContext appcontext;

	public static void main(String[] args) {
	
		appcontext = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Employee emp=(Employee) appcontext.getBean("emp");
		System.out.println(emp.getEmpid()+". "+emp.getName()+" :"+emp.getDesignation());
		

	}

}
