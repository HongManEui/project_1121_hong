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
    @Autowired OrderManagementRepository orderManagementRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='PayApproved'")
    public void wheneverPayApproved_OrderInfoReceive(@Payload PayApproved payApproved){

        PayApproved event = payApproved;
        System.out.println("\n\n##### listener OrderInfoReceive : " + payApproved + "\n\n");


        

        // Sample Logic //
        OrderManagement.orderInfoReceive(event);
        

        

    }

}


