/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackpackage;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author FAIZAL
 */
public class StackDriver {
private static int[] stack = new int[5];
    private static int counter = 0;
    private static boolean checkStack(){
        boolean status = (counter < stack.length) ? true : false;
        return status;
    }
    
    //Push
    private static void pushStack(){
        int loopInput = 0, temp = 0;
        while(loopInput == 0){
            System.out.print("Masukkan data (angka) : ");
            Scanner tempInput = new Scanner(System.in);
            try{
                temp = tempInput.nextInt();
                loopInput = 1;
            }catch(InputMismatchException e){
                System.out.println("Data yang dimasukkan harus berupa angka!");
                loopInput = 0;
            }
        }
        stack[counter] = temp;
        counter++;
    }
    
    //Pop
    private static void popStack(){
        counter--;
        System.out.println("Data yang terakhir diinputkan sudah dihapus!");
    }
    
    private static void showStack(){
        System.out.println("Data dalam stack : ");
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
            System.out.println("\nSimple Integer Stack menggunakan Java");
            System.out.println("1. Tambah Data Stack (Push)");
            System.out.println("2. Hapus Data Stack (Pop)");
            System.out.println("3. Cek Status Stack");
            System.out.println("4. Lihat Isi Stack");
            System.out.println("5. Reset Stack");
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
                    System.out.println("Stack penuh! Kosongkan stack terlebih dahulu.");
                }
                break;
            case 2:
                popStack();
                break;
            case 3:
                System.out.println("Status Stack");
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
                exitProgram();
                break;
            default:
                System.out.println("Menu tidak ditemukan!");
                break;
        }
        menuProgram();
    }
    
    public static void main(String[] args){
        menuProgram();
    }    
}
