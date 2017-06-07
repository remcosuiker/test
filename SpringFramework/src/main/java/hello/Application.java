package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		System.out.println("Na ApplicationContext");
		
		MessagePrinter printer = context.getBean(MessagePrinter.class);
		IMessageService messageService = context.getBean(IMessageService.class);
		System.out.println("MessageService says: " + messageService.getMessage());
		printer.printMessage();
		printer.printMessage();
		printer.printMessage();
		printer.printMessage();
	}
}