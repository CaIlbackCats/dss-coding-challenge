package hu.callbackcats;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class FinishedOrder implements Writeable {

    private String id;
    private Integer profit;
    private Integer fine;
    private LocalDateTime startDate;
    private LocalDateTime finishDate;
    private LocalDateTime originalDeadline;

    @Override
    public String toString() {
        return this.id + ";"
                + this.profit + ";"
                + this.fine + ";"
                + this.startDate + ";"
                + this.finishDate + ";"
                + this.originalDeadline;
    }
}
