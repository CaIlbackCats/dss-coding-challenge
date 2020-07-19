package hu.callbackcats;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Order {
	
	// TODO: Azonosító	Termék	Darabszám	Határidõ	Profit/db (Ft)	Késési büntetés/nap (össz) (Ft)
	
	private String id;
	private String type;
	private Integer count;
	private LocalDateTime deadline;
	private Integer profit;
	private Integer fine;
}
