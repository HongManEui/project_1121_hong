package project.domain;

import project.domain.*;
import project.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderRejected extends AbstractEvent {

    private Long id;

    public OrderRejected(OrderManagement aggregate){
        super(aggregate);
    }
    public OrderRejected(){
        super();
    }
}
