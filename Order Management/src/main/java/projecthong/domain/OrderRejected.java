package projecthong.domain;

import projecthong.domain.*;
import projecthong.infra.AbstractEvent;
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
