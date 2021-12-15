/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistpackage;

import driver.mainDriver;
import static driver.mainDriver.showMenu;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import widgets.CustomBufferedReader;

/**
 *b
 */
public class LinkedListDriver {
    public static LinkedList<String> priceList = new LinkedList<>();
    public static int n;
    
    public static void search(){
        System.out.print("\n\nMasukkan nama Vaksin: ");
        CustomBufferedReader cbr = new CustomBufferedReader();
        String name = cbr.stringInput();
        boolean status = false;
        for (int i = 0; i < n; i++) {
            if(priceList.get(i).equals(name)){
                System.out.println("\n\nData berada pada index "+i);
                status = true;
            }
        }
        if(status = false){
            System.out.println("\n\nData Tidak Ditemukan!");
        }
        showMenu();
    }
    
    public static void put(){
        //Initiate the size of the linkedlist
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan jumlah harga yang ingin dimasukkan: ");
        n = inp.nextInt();
        
        //Input Data
        CustomBufferedReader cbr = new CustomBufferedReader();
        for (int i = 0; i < n; i++) {            
            int loopInput = 0;
            String temp = "";
            System.out.print("\n\nMasukkan  harga pembanding\nFormat: [harga_nama Vaksin]: ");
            temp = cbr.stringInput();
            priceList.add(temp);
        }
        showMenu();
    }
    
    public static void sortAscending(){
        System.out.println("\n\nBandingkan Harga dari yang termurah\t: ");
	Collections.sort(priceList);
        show();
    }
    
    public static void sortDescending(){
        System.out.println("\n\nBandingkan Harga dari yang termahal\t: ");
        Collections.sort(priceList, Collections.reverseOrder());
	show();
    }
    
    public static void show(){
        System.out.println("\n\nList Harga");
	System.out.println(priceList);
        showMenu();
    }
    
    public static void showMenu(){
        System.out.println("\n\nProgram Pembanding Harga");
        System.out.println("1. Tambah Harga Perbandingan");
        System.out.println("2. Tampilkan List Harga");
        System.out.println("3. Urutkan dari yang paling murah");
        System.out.println("4. Urutkan dari yang paling mahal");
        System.out.println("5. Cari Harga Perbandingan");
        System.out.println("6. Keluar dari Program");
        System.out.print("Pilih menu [1-6]: ");
        chooseMenu();
    }
    
    public static void chooseMenu(){
        CustomBufferedReader cbr = new CustomBufferedReader();
        int choice = cbr.integerInput();
        switch(choice){
            case 1:
                put();
                break;
            case 2:
                show();
                break;
            case 3:
                sortAscending();
                break;
            case 4:
                sortDescending();
                break;
            case 5:
                search();
                break;
            case 6:
                mainDriver md = new mainDriver();
                md.showMenu();
                break;
            default:
                showMenu();
                break;
        }
    }
    
    public void run() {       
        showMenu();
    }
}
