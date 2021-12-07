/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package widgets;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FAIZAL
 */
public class CustomSystemInterruptor {
    public void pauseProgram(){
        try {
            Thread.sleep(2000); //Sleep 2 detik
        } catch (InterruptedException ex) {
            Logger.getLogger(CustomBufferedReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void exitProgram(){
        System.exit(0);
    }
}
