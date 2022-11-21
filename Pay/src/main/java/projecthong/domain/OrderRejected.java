package projecthong.domain;

import projecthong.domain.*;
import projecthong.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderRejected extends AbstractEvent {

    private Long id;
}


