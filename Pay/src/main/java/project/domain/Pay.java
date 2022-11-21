package project.domain;

import project.domain.PayApproved;
import project.PayApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Pay_table")
@Data

public class Pay  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;

    @PostPersist
    public void onPostPersist(){


        PayApproved payApproved = new PayApproved(this);
        payApproved.publishAfterCommit();

    }

    public static PayRepository repository(){
        PayRepository payRepository = PayApplication.applicationContext.getBean(PayRepository.class);
        return payRepository;
    }




    public static void payCancelled(OrderCancelled orderCancelled){

        /** Example 1:  new item 
        Pay pay = new Pay();
        repository().save(pay);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCancelled.get???()).ifPresent(pay->{
            
            pay // do something
            repository().save(pay);


         });
        */

        
    }
    public static void payCancelled(OrderRejected orderRejected){

        /** Example 1:  new item 
        Pay pay = new Pay();
        repository().save(pay);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderRejected.get???()).ifPresent(pay->{
            
            pay // do something
            repository().save(pay);


         });
        */

        
    }


}
