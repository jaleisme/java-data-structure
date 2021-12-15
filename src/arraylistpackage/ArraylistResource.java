/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistpackage;

import java.util.ArrayList;
import widgets.*;
import arraylistpackage.ArraylistDriver;

/**
 *
 * @author FAIZAL
 */
public class ArraylistResource {
    CustomBufferedReader cbr = new CustomBufferedReader();
    CustomSystemInterruptor csi = new CustomSystemInterruptor();
    
    public void put(ArrayList<String> alist){
        System.out.print("\n\nMasukkan jumlah Peserta Vaksin: ");
        int n = cbr.integerInput();
        for (int i = 0; i < n; i++) {
            String nama = "";
            System.out.print("Masukkan nama peserta ke-"+(i+1)+": ");
            nama = cbr.stringInput();
            alist.add(nama);
        }
    }    

    public void show(ArrayList<String> alist){
        System.out.println("\n\nList Data Peserta Vaksinasi");
        for (int i = 0; i < alist.size(); i++) {
            System.out.println("["+i+" - "+alist.get(i)+"]");
        }
    }
    
    public void edit(ArrayList<String> alist){
        System.out.println("\n\nList Data Peserta Vaksinasi");
        for (int i = 0; i < alist.size(); i++) {
            System.out.println("["+i+" - "+alist.get(i)+"]");
        }
        System.out.print("Masukkan indeks yang ingin diubah: ");
        int x = cbr.integerInput();
        if (x > alist.size()) {
            System.out.println("Indeks tidak ditemukan!");
            csi.pauseProgram();
        }
        else{
            System.out.print("Masukkan nama Peserta Vaksinasi: ");
            String nama = cbr.stringInput();
            alist.set(x, nama);
        }
    }
    
    public void pop(ArrayList<String> alist){
        System.out.println("\n\nList Data Peserta Vaksinasi");
        for (int i = 0; i < alist.size(); i++) {
            System.out.println("["+i+" - "+alist.get(i)+"]");
        }        
        System.out.print("Masukkan indeks yang ingin dihapus: ");
        int x = cbr.integerInput();
        if (x > alist.size()) {
            System.out.println("Indeks tidak ditemukan!");
            csi.pauseProgram();
        }
        else{
            alist.remove(x);
            System.out.println("Data peserta Vaksinasi berhasil dihapus!");
        }
    }
}
