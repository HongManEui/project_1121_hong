package projecthong.domain;

import projecthong.domain.*;
import projecthong.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class PayApproved extends AbstractEvent {

    private Long id;

    public PayApproved(Pay aggregate){
        super(aggregate);
    }
    public PayApproved(){
        super();
    }
}
