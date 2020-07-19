package hu.callbackcats;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Order implements Readable {

    // TODO: Azonos�t�	Term�k	Darabsz�m	Hat�rid�	Profit/db (Ft)	K�s�si b�ntet�s/nap (�ssz) (Ft)

    private String id;
    private OrderType type;
    private Integer count;
    private LocalDateTime deadline;
    private Integer profit;
    private Integer fine;
}
