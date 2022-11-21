package projecthong.domain;

import projecthong.domain.*;
import projecthong.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private Long id;

    public OrderCancelled(Order aggregate){
        super(aggregate);
    }
    public OrderCancelled(){
        super();
    }
}
