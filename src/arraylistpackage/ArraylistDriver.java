/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistpackage;

import java.util.ArrayList;
import widgets.*;
import driver.mainDriver;
import arraylistpackage.ArraylistResource;

/**
 *
 * @author FAIZAL
 */
public class ArraylistDriver {
    CustomBufferedReader cbr = new CustomBufferedReader();
    ArrayList<String> alist = new ArrayList<>();
    ArraylistResource ar = new ArraylistResource();
    
    public void showMenu(){
        System.out.println("\n\nProgram Arraylist");
        System.out.println("1. Tambah Profil Mahasiswa");
        System.out.println("2. Lihat Profil Mahasiswa");
        System.out.println("3. Ubah Profil Mahasiswa");
        System.out.println("4. Hapus Profil Mahasiswa");
        System.out.println("5. Keluar dari program");
        System.out.print("Pilih menu [1-5]: ");
        chooseMenu();
    }
    
    public void chooseMenu(){
        CustomBufferedReader cbr = new CustomBufferedReader();
        int choice = cbr.integerInput();
        switch(choice){
            case 1:
                ar.put(alist);
                showMenu();
                break;
            case 2:
                ar.show(alist);
                showMenu();
                break;
            case 3:
                ar.edit(alist);
                showMenu();
                break;
            case 4:
                ar.pop(alist);
                showMenu();
                break;
            case 5:
                mainDriver md = new mainDriver();
                md.showMenu();
                break;
            default:
                showMenu();
                break;
        }
    }    
    
    public void run(){
        showMenu();
    }
}
