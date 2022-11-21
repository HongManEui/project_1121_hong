package project.domain;

import project.domain.CookFinished;
import project.KitchenApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Cook_table")
@Data

public class Cook  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;

    @PostPersist
    public void onPostPersist(){

        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.


        project.external.Delivery delivery = new project.external.Delivery();
        // mappings goes here
        KitchenApplication.applicationContext.getBean(project.external.DeliveryService.class)
            .pickDelivery(delivery);


        CookFinished cookFinished = new CookFinished(this);
        cookFinished.publishAfterCommit();

    }

    public static CookRepository repository(){
        CookRepository cookRepository = KitchenApplication.applicationContext.getBean(CookRepository.class);
        return cookRepository;
    }






}
