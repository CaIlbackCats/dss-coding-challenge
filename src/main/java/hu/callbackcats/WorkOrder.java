package hu.callbackcats;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class WorkOrder implements Writeable {

    private LocalDate date;
    private Machine machine;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String orderId;

    @Override
    public String toString() {
        return this.date + ";"
                + this.machine + ";"
                + this.startTime + ";"
                + this.endTime + ";"
                + this.orderId;
    }
}
