/*

5. Smart Home Automation System
Scenario: Users can control appliances like lights, fans, ACs via a smart interface.
Concepts Used:
● Class: Appliance, Light, Fan, AC, UserController

Scenario-based Problems

● Constructor: Set default or user-defined power settings
● Access Modifiers: Internal device settings as private, toggle methods as public
● Interface: Controllable with methods turnOn(), turnOff()
● Operators: Compare energy usage (>, <, ==)
● OOP:
○ Encapsulation: Control internal appliance state
○ Abstraction: Devices follow common control interface
○ Inheritance: Device types inherit from Appliance
○ Polymorphism: Turning on a Light vs an AC involves different behaviors

*/

package com.day1.smarthomeautomationsystem;

class Main {

    public static void main(String[] args) {

        UserController user = new UserController("Krishna");

        Appliance light = new Light();
        Appliance fan = new Fan();
        Appliance ac = new AC();

        user.controlOn(light);
        user.controlOn(fan);
        user.controlOn(ac);

        System.out.println();

        light.showStatus();
        fan.showStatus();
        ac.showStatus();

        System.out.println();
        
        user.showTotalPowerUsage(light, fan, ac);
        
        System.out.println();

        user.compareEnergyUsage(light, ac);
        user.compareEnergyUsage(fan, light);

        System.out.println();

        user.controlOff(ac);
        
        System.out.println();
        
        // Recalculate after turning AC off
        user.showTotalPowerUsage(light, fan, ac);
    }
}