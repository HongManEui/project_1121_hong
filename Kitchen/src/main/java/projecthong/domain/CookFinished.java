package projecthong.domain;

import projecthong.domain.*;
import projecthong.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CookFinished extends AbstractEvent {

    private Long id;

    public CookFinished(Cook aggregate){
        super(aggregate);
    }
    public CookFinished(){
        super();
    }
}
