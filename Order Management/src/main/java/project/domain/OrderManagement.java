package project.domain;

import project.domain.OrderAccepted;
import project.domain.OrderRejected;
import project.OrderManagementApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="OrderManagement_table")
@Data

public class OrderManagement  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;

    @PostPersist
    public void onPostPersist(){

        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.


        project.external.Cook cook = new project.external.Cook();
        // mappings goes here
        OrderManagementApplication.applicationContext.getBean(project.external.CookService.class)
            .cook(cook);


        OrderAccepted orderAccepted = new OrderAccepted(this);
        orderAccepted.publishAfterCommit();



        OrderRejected orderRejected = new OrderRejected(this);
        orderRejected.publishAfterCommit();

    }

    public static OrderManagementRepository repository(){
        OrderManagementRepository orderManagementRepository = OrderManagementApplication.applicationContext.getBean(OrderManagementRepository.class);
        return orderManagementRepository;
    }




    public static void orderInfoReceive(PayApproved payApproved){

        /** Example 1:  new item 
        OrderManagement orderManagement = new OrderManagement();
        repository().save(orderManagement);

        */

        /** Example 2:  finding and process
        
        repository().findById(payApproved.get???()).ifPresent(orderManagement->{
            
            orderManagement // do something
            repository().save(orderManagement);


         });
        */

        
    }


}
