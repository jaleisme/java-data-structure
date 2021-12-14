/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackpackage;

import java.util.InputMismatchException;
import java.util.Scanner;
import driver.mainDriver;
import widgets.CustomBufferedReader;

/**
 *
 * @author FAIZAL
 */
public class StackDriver {
private static String[] stack = new String[5];
    private static int counter = 0;
    private static boolean checkStack(){
        boolean status = (counter < stack.length) ? true : false;
        return status;
    }
    
    //Push
    private static void pushStack(){
        int loopInput = 0;
        String temp = "";
        while(loopInput == 0){
            System.out.print("Masukkan nama pasien : ");
            CustomBufferedReader cbr = new CustomBufferedReader();
            try{
                temp = cbr.stringInput();
                loopInput = 1;
            }catch(InputMismatchException e){
                System.out.println("Nama yang dimasukkan harus berupa teks!");
                loopInput = 0;
            }
        }
        stack[counter] = temp;
        counter++;
    }
    
    //Pop
    private static void popStack(){
        counter--;
        System.out.println("Pasien yang terakhir diinputkan sudah dihapus!");
    }
    
    private static void showStack(){
        System.out.println("Pasien dalam Antrian: ");
        if(counter > -1){
            for (int i = 0; i < counter; i++) {
                System.out.println("["+i+" => "+stack[i]+"]");
            }
        } else {
            System.out.println("Stack kosong!");
        }
    }
    
    private static void resetStack(){
        counter = 0;
    }
    
    private static void exitProgram(){
        String quit = "n";
        System.out.print("Keluar dari program [y/n] : ");
        quit = new Scanner(System.in).nextLine();
        if(quit.equalsIgnoreCase("y")){
            System.exit(0);
        } else {
            menuProgram();
        }
    }
    
    private static void menuProgram(){
        int loopInput = 0, chosenMenu = 0;
        while(loopInput == 0){
            System.out.println("\n\nAntrian Pasien");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Hapus Pasien");
            System.out.println("3. Cek Status Antrian");
            System.out.println("4. Lihat Antrian");
            System.out.println("5. Reset Antrian");
            System.out.println("6. Keluar dari Program");
            System.out.print("Pilih menu [1-6] : ");
            Scanner inputMenu = new Scanner(System.in);
            try{
                chosenMenu = inputMenu.nextInt();
                loopInput = 1;
            }catch(InputMismatchException e){
                System.out.println("Pilihan berupa angka");
                loopInput = 0;
            }
        }
        System.out.println("");
        menuChooser(chosenMenu);
    }
    
    private static void menuChooser(int chosenMenu){
        switch(chosenMenu){
            case 1:
                boolean status = checkStack();
                if(status){
                    pushStack();
                } else {
                    System.out.println("Antrian penuh! Kosongkan antrian terlebih dahulu.");
                }
                break;
            case 2:
                popStack();
                break;
            case 3:
                System.out.println("Status Antrian");
                System.out.println("Kapasitas\t: "+stack.length);
                System.out.println("Terisi\t\t: "+counter);
                break;
            case 4:
                showStack();
                break;
            case 5:
                resetStack();
                break;
            case 6:
                mainDriver md = new mainDriver();
                md.showMenu();
                break;
            default:
                System.out.println("Menu tidak ditemukan!");
                break;
        }
        menuProgram();
    }
    
    public void run(){
        menuProgram();
    }    
}
