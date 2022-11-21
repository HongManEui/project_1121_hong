package projecthong.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import projecthong.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import projecthong.domain.*;


@Service
@Transactional
public class PolicyHandler{
    @Autowired PayRepository payRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderCancelled'")
    public void wheneverOrderCancelled_PayCancelled(@Payload OrderCancelled orderCancelled){

        OrderCancelled event = orderCancelled;
        System.out.println("\n\n##### listener PayCancelled : " + orderCancelled + "\n\n");


        

        // Sample Logic //
        Pay.payCancelled(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderRejected'")
    public void wheneverOrderRejected_PayCancelled(@Payload OrderRejected orderRejected){

        OrderRejected event = orderRejected;
        System.out.println("\n\n##### listener PayCancelled : " + orderRejected + "\n\n");


        

        // Sample Logic //
        Pay.payCancelled(event);
        

        

    }

}


