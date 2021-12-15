/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;
import widgets.*;
import arraylistpackage.ArraylistDriver;
import linkedlistpackage.LinkedListDriver;
import stackpackage.StackDriver;
import queuepackage.QueueDriver;
/**
 *
 * @author FAIZAL
 */
public class mainDriver {
    
    public static void showMenu(){
        System.out.println("\n\nTugas Akhir Praktikum Algoritma dan Struktur Data Kelompok 1");
        System.out.println("1. Program Data Peserta Vaksinasi");
        System.out.println("2. Program Perbandngan Harga Vaksinasi");
        System.out.println("3. Program Antrian Vaksinasi");
        System.out.println("4. Program Stock Vaksin");
        System.out.println("5. Kontributor");
        System.out.println("6. Exit");
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
                LinkedListDriver ld = new LinkedListDriver();
                ld.run();
                break;
            case 3:
                QueueDriver qd = new QueueDriver();
                qd.run();
                break;
            case 4:
                StackDriver sd = new StackDriver();
                sd.run();
                break;
            case 5:
                showAuthor();
                break;
            case 6:
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
        System.out.println("1. Muhammad Zahidy Syawal\t\t1207050084");
        System.out.println("2. Putri Fuji Lestari\t\t1207050142");
        System.out.println("3. Muhammad Widianto\t\t1207050083");
        System.out.println("4. Muhammad Iqbal Mubarok\t\t1207050076");
        showMenu();
    }
    
    public static void main(String[] args) {
        showMenu();
    }
    
}
