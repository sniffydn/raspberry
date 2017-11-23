/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.raspberry;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

/**
 *
 * @author dustin
 */
public class Control4PinLed {
public static void main(String[] args) throws InterruptedException {

        System.out.println("<--Pi4J--> GPIO Control Example ... started.");

        // create gpio controller
        final GpioController gpio = GpioFactory.getInstance();

        // provision gpio pin #01 as an output pin and turn on
        final GpioPinDigitalOutput pin01 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "MyLED", PinState.HIGH);

        // set shutdown state for this pin
        pin01.setShutdownOptions(true, PinState.LOW);

        System.out.println("--> GPIO state should be: ON");

        Thread.sleep(5000);

        // turn off gpio pin #01
        pin01.low();
        System.out.println("--> GPIO state should be: OFF");
        
         // provision gpio pin #00 as an output pin and turn on
        final GpioPinDigitalOutput pin00 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_00, "MyLED", PinState.HIGH);

        // set shutdown state for this pin
        pin00.setShutdownOptions(true, PinState.LOW);

        System.out.println("--> GPIO state should be: ON");

        Thread.sleep(5000);

        // turn off gpio pin #00
        pin00.low();
        System.out.println("--> GPIO state should be: OFF");

         // provision gpio pin #02 as an output pin and turn on
        final GpioPinDigitalOutput pin02 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_02, "MyLED", PinState.HIGH);

        // set shutdown state for this pin
        pin02.setShutdownOptions(true, PinState.LOW);

        System.out.println("--> GPIO state should be: ON");

        Thread.sleep(5000);

        // turn off gpio pin #02
        pin02.low();
        System.out.println("--> GPIO state should be: OFF");
        
        Thread.sleep(5000);

        // toggle the current state of gpio pin #01 (should turn on)
        pin01.toggle();
        System.out.println("--> GPIO state should be: ON");

        Thread.sleep(5000);

        // toggle the current state of gpio pin #01  (should turn off)
        pin01.toggle();
        System.out.println("--> GPIO state should be: OFF");

        Thread.sleep(5000);

        // turn on gpio pin #01 for 1 second and then off
        System.out.println("--> GPIO state should be: ON for only 1 second");
        pin01.pulse(1000, true); // set second argument to 'true' use a blocking call

        // stop all GPIO activity/threads by shutting down the GPIO controller
        // (this method will forcefully shutdown all GPIO monitoring threads and scheduled tasks)
        gpio.shutdown();

        System.out.println("Exiting ControlGpioExample");
    }
    
}
