package di.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DITestMain {

	public static void main(String[] args) {
		
		ApplicationContext container = new GenericXmlApplicationContext("ditest02/beanContainer.xml");
		
		MyCalculator my = (MyCalculator)container.getBean("myCalculator");
		
		my.add();
		my.sub();
		my.mul();
		my.div();
		
	}
}
