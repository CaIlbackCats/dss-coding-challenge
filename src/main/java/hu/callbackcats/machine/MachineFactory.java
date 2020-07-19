package hu.callbackcats.machine;

import hu.callbackcats.MachineType;
import hu.callbackcats.OrderType;
import lombok.Getter;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

@Getter
public class MachineFactory {

    private static List<Machine> machineList = new ArrayList<>();
    private static Map<MachineType, Integer> machineTypeCounts = new EnumMap<>(MachineType.class);

    public static Machine createMachine(MachineType machineType) {
        Map<OrderType, Integer> orderProcessTime = new EnumMap<>(OrderType.class);
        switch (machineType) {
            case BENDER:
                orderProcessTime.put(OrderType.FB, 16);
                orderProcessTime.put(OrderType.GYB, 10);
                orderProcessTime.put(OrderType.SB, 15);
                break;
            case CUTTER:
                orderProcessTime.put(OrderType.FB, 8);
                orderProcessTime.put(OrderType.GYB, 5);
                orderProcessTime.put(OrderType.SB, 6);
                break;
            case TESTER:
                orderProcessTime.put(OrderType.FB, 5);
                orderProcessTime.put(OrderType.GYB, 5);
                orderProcessTime.put(OrderType.SB, 5);
                break;
            case WELDER:
                orderProcessTime.put(OrderType.FB, 12);
                orderProcessTime.put(OrderType.GYB, 8);
                orderProcessTime.put(OrderType.SB, 10);
                break;
            case PAINTER:
                orderProcessTime.put(OrderType.FB, 20);
                orderProcessTime.put(OrderType.GYB, 12);
                orderProcessTime.put(OrderType.SB, 15);
                break;
            case WRAPPER:
                orderProcessTime.put(OrderType.FB, 15);
                orderProcessTime.put(OrderType.GYB, 10);
                orderProcessTime.put(OrderType.SB, 12);
                break;
        }
        if (!machineTypeCounts.containsKey(machineType)) {
            machineTypeCounts.put(machineType, 0);
        }
        machineTypeCounts.put(machineType, machineTypeCounts.get(machineType) + 1);
        Machine machine = new Machine(machineTypeCounts.get(machineType), machineType, orderProcessTime);
        machineList.add(machine);
        return machine;
    }
}
