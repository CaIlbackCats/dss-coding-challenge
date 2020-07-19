package hu.callbackcats.machine;

import hu.callbackcats.MachineType;
import hu.callbackcats.Order;
import hu.callbackcats.OrderType;
import lombok.Getter;

import java.util.Map;

@Getter
public class Machine {

    private MachineType name;
    private Integer id;
    private Map<OrderType, Integer> orderProcessTime;

    Machine(Integer id, MachineType name, Map<OrderType, Integer> orderProcessTime) {
        this.id = id;
        this.name = name;
        this.orderProcessTime = orderProcessTime;
    }

    public Integer calculateProcessTime(Order order) {
        return orderProcessTime.get(order.getType()) * order.getCount();
    }

    @Override
    public String toString() {
        return this.name + "_" + this.id;
    }
}
