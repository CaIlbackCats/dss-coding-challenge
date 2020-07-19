package hu.callbackcats;

import lombok.Getter;

import java.util.Map;

@Getter
public enum MachineType {
    CUTTER(5, 8, 6),
    BENDER(10, 16, 15),
    WELDER(8, 12, 10),
    TESTER(5, 5, 5),
    PAINTER(12, 20, 15),
    WRAPPER(10, 15, 12);

    private Integer childBike;
    private Integer adultBike;
    private Integer teenBike;

    MachineType(Integer childBike, Integer adultBike, Integer teenBike) {
        this.childBike = childBike;
        this.adultBike = adultBike;
        this.teenBike = teenBike;
    }
}
