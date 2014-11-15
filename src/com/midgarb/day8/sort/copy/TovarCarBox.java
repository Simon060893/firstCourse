package com.midgarb.day8.sort.copy;

import com.midgarb.day5.hw01.TovarCar;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Админ on 03.07.2014.
 */
public class TovarCarBox<T extends TovarCar> {
    TovarCar<T> car;
    public TovarCarBox(){
        car = new TovarCar<T>();
    }

    public TovarCar<T> getCar() {
        return car;
    }

    public void setCar(TovarCar<T> car) {
        this.car = car;
    }
}
