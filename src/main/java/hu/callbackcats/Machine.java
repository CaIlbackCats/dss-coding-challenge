package hu.callbackcats;

import lombok.Getter;

import java.util.Map;

@Getter
public class Machine {

    private MachineType name;
    private Long id;
    private Map<OrderType, Integer> orderProcessTime;

    public Machine(MachineType name){
        this.name=name;

    }

    public Integer calculateProcessTime(Order order) {
        return orderProcessTime.get(order.getType()) * order.getCount();
    }
}
