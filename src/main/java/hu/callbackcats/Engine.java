package hu.callbackcats;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Engine {

    public void init(){
        List<Machine> machineList = Arrays.stream(MachineType.values()).map(Machine::new).collect(Collectors.toList());
    }

}
