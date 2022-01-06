/*
 * Created by nphau on 06/01/2022, 09:50
 * Copyright (c) 2022. All rights reserved.
 * Last modified 06/01/2022, 09:50
 */
package Chapter09_InheritanceAndInterfaces;

public class Truck extends Car {
    public void m1() {
        System.out.println("truck 1");
    }
     
    public void m2() {
        super.m1();
    }
     
    public String toString() {
        return super.toString() + super.toString();
    }
}