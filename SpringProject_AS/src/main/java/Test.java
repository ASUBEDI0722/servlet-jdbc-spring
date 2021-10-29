import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ektha.app.beans.SampleBean;
import com.ektha.app.printer.MessagePrinter;

public class Test {

	public static void main(String[] args) {
		
		
		

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.ektha.app.provider");
		MessagePrinter messagePrinter = applicationContext.getBean(MessagePrinter.class);
		messagePrinter.printMessage();
		// appC is interface and annotation is container
		
		
//		SampleBean sampleBean = applicationContext.getBean(SampleBean.class);
		// asking container to provide sample bean class reference object, application
		// context represents container
		
		
//		System.out.println(sampleBean.greet());
//		
//		System.out.println(sampleBean.greetDBMessage());
//		
//		MessagePrinter messagePrinter = applicationContext.getBean(MessagePrinter.class);
//		messagePrinter.printMessage();
		
	}

}
