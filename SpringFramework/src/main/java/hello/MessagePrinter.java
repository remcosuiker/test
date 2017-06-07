package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {

    final private IMessageService service;

    @Autowired
    public MessagePrinter(IMessageService service) {
    	System.out.println("MessagePrinter() constructed");
        this.service = service;
    }

    public void printMessage() {
        System.out.println("MessagePrinter says: " + service.getMessage());
    }
}