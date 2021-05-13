package di.xml.n01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

// 스프링을 통한 속성 주입
public class DriverMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("di-xml01.xml");
		
		// 방법 2
		Car car = (Car)context.getBean("car2");
		car.prnTireBrand();
		
		// 방법1
//		Tire tire = (Tire)context.getBean("tire");
//		Car car = (Car)context.getBean("car");
//		car.setTire(tire);
//		
//		car.prnTireBrand();
//		
		/*
		Car car = new Car();
		
		Tire tire = new HankookTire();
		car.setTire(tire);
		
		car.prnTireBrand();
		*/
	}
}
