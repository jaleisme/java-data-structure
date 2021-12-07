/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;
import widgets.*;
import arraylistpackage.ArraylistDriver;

/**
 *
 * @author FAIZAL
 */
public class mainDriver {
    
    public static void showMenu(){
        System.out.println("\n\nTugas Akhir Prak. Algo & Strukdat");
        System.out.println("1. Program Arraylist");
        System.out.println("2. Program Linkedlist");
        System.out.println("3. Program Queue");
        System.out.println("4. Program Stack");
        System.out.println("5. Program Hash");
        System.out.println("6. Profil Kontributor");
        System.out.println("7. Exit");
        System.out.print("Pilih menu [1-6]: ");
        chooseMenu();
    }
    
    public static void chooseMenu(){
        CustomBufferedReader cbr = new CustomBufferedReader();
        int choice = cbr.integerInput();
        switch(choice){
            case 1:
                ArraylistDriver ad = new ArraylistDriver();
                ad.run();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                showAuthor();
                break;
            case 7:
                CustomSystemInterruptor csi = new CustomSystemInterruptor();
                csi.exitProgram();
                break;
            default:
                showMenu();
                break;
        }
    }
    
    public static void showAuthor(){
        System.out.println("\n\nKontributor: ");
        System.out.println("0. Cello Aeris\t\t1207050034");
        showMenu();
    }
    
    public static void main(String[] args) {
        showMenu();
    }
    
}
