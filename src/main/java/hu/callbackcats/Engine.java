package hu.callbackcats;

import hu.callbackcats.machine.Machine;
import hu.callbackcats.machine.MachineFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Engine {

    public void init(){
        List<Machine> machines = Arrays.stream(MachineType.values()).map(MachineFactory::createMachine).collect(Collectors.toList());
        System.out.println(machines);
    }

}
