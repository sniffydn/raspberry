package com.raspberry;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dustin
 */
public class SuperJumpHelper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int waitTime = 720;
        long startTime = System.currentTimeMillis();
        System.out.println("Start " + (System.currentTimeMillis() - startTime));
        try {
            Thread.sleep(waitTime);
        } catch (InterruptedException ex) {
            Logger.getLogger(SuperJumpHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        startTime = System.currentTimeMillis();
        long prevTime = System.currentTimeMillis();
        for (int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(waitTime);
            } catch (InterruptedException ex) {
                Logger.getLogger(SuperJumpHelper.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Hit" + i + " " + (System.currentTimeMillis() - startTime) + "    " + (System.currentTimeMillis() - prevTime));
            prevTime = System.currentTimeMillis();
        }

    }

}
