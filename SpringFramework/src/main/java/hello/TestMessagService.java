package hello;

import java.security.SecureRandom;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class TestMessagService {

	@Bean
	IMessageService maakBeanAan() {
		System.out.println("maakBeanAan()");
		return new IMessageService() {
			SecureRandom random = new SecureRandom();
			
			public String getMessage() {
				return "Hello World!" + random.nextDouble();
			}
		};
	}
}
