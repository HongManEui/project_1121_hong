package project.domain;

import project.domain.*;
import project.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderPicked extends AbstractEvent {

    private Long id;

    public OrderPicked(Delivery aggregate){
        super(aggregate);
    }
    public OrderPicked(){
        super();
    }
}
