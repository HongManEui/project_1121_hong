package projecthong.domain;

import projecthong.domain.*;
import projecthong.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;

    public DeliveryStarted(Delivery aggregate){
        super(aggregate);
    }
    public DeliveryStarted(){
        super();
    }
}
