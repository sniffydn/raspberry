/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raspberry;

import com.raspberry.exceptions.RaspistillException;
import java.io.IOException;

/**
 *
 * @author dustin
 */
public class CameraExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        RPiCamera piCamera = null;
        // Attempt to create an instance of RPiCamera, will fail
        // if raspistill is not properly installed
        try {
            String saveDir = "/home/pi/Desktop";
            piCamera = new RPiCamera(saveDir);
        } catch (RaspistillException e) {
            e.printStackTrace();
        }
        // Take a still image, buffer, and save it
        if (piCamera != null) {
            for (int i = 0; i < 10; i++) {
                try {
                    piCamera.takeStill("Picture" + i);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
