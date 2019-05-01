package pl.danplo.springbootclientrabbitmq;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class ClientMq {
    @RestController
    public class CleintMq {

        @Autowired
        private RabbitTemplate rabbitTemplate;

        @GetMapping("/receiveMessage")
        public String get() {

            Object message = rabbitTemplate.receiveAndConvert("eggs");
            return message.toString();

        }

        @RabbitListener(queues = "eggs") //nasłuchiwanie kanału/kolejki eggs
        public void RabbitListener(String string){
            System.out.println(string);
        }


    }

}
