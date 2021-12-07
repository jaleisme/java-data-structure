/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package widgets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FAIZAL
 */
public class CustomBufferedReader {
    public int integerInput(){
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String angkainput = null;
        try{
            angkainput = bfr.readLine();
        }catch(IOException e){
            e.printStackTrace();
        }
        int Data = Integer.valueOf(angkainput).intValue();
        return Data;
    }
    
    public String stringInput(){
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String stringinput = null;
        try{
            stringinput = bfr.readLine();
        }catch(IOException e){
            e.printStackTrace();
        }
        String Data = stringinput.toString();
        return Data;
    }
    
    public String lowercaseInput(){
        String Data = this.stringInput().toLowerCase();
        return Data;
    }
}
