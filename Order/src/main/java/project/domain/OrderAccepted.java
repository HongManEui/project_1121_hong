package project.domain;

import project.domain.*;
import project.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderAccepted extends AbstractEvent {

    private Long id;
}


