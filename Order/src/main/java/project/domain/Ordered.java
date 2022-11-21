package project.domain;

import project.domain.*;
import project.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Ordered extends AbstractEvent {

    private Long id;

    public Ordered(Order aggregate){
        super(aggregate);
    }
    public Ordered(){
        super();
    }
}
