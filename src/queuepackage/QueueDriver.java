/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuepackage;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author FAIZAL
 */
public class QueueDriver {
    private static int Qsize = 10;
    private static int counter = 0;
    private static Queue<String>queue;
    private static void createQueue(){
        queue = new LinkedList<String>();
    }
    private static boolean checkQueue(){
        boolean status = false;
        System.out.println("");
        if(counter==0){
            System.out.println("Antrian kosong.");
            status = true;
        } else{
            if(counter<Qsize-1){
                System.out.println("Antrian sudah terisi "+counter+" dari total kapasitas "+Qsize+".");
                status = true;
            } else if(counter==Qsize-1){
                System.out.println("Antrian sudah penuh!");
                status = false;
            }
        }
        return status;
    }
    private static void insertQueue(){
        int loopInput = 0;
        String temp = "";
        System.out.print("Masukkan nama mahasiswa: ");
        Scanner input = new Scanner(System.in);
        try{
            temp = input.nextLine();
            loopInput = 1;
        }catch(InputMismatchException e){
            System.out.println("Nama harus teks!");
            loopInput = 0;
        }
        queue.add(temp);
        counter++;
        temp = String.valueOf(queue.size());
        System.out.println("Jumlah mahasiswa dalam antrian saat ini adalah "+temp+".");
        menuProgram();
    }
    private static void removeQueue(){
        if(counter==0){
            System.out.println("Antrian kosong!");
        }else{
            String temp = queue.remove();
            System.out.println("\nMahasiswa atas nama "+temp+" dapat masuk ke ruang bimbingan.");
            counter--;
            temp = String.valueOf(queue.size());
            System.out.println("Jumlah pemesan dalam mahasiswa saat ini adalah "+temp+".");
            menuProgram(); 
        }
    }
    private static void peekQueue(){
        System.out.println("\nMahasiswa selanjutnya adalah "+queue.peek()+".");
        menuProgram();
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
            System.out.println("\nAntrian Bimbingan Pak Dani");
            System.out.println("1. Daftar Antrian");
            System.out.println("2. Panggil Mahasiswa Berikutnya");
            System.out.println("3. Cek Status Antrian");
            System.out.println("4. Lihat Mahasiswa Selanjutnya");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu [1-5] : ");
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
                boolean status = checkQueue();
                if(status){
                    insertQueue();
                } else {
                    System.out.println("Tunggu mahasiswa lain selesai terlebih dahulu.");
                }
                break;
            case 2:
                removeQueue();
                break;
            case 3:
                status = checkQueue();
                break;
            case 4:
                peekQueue();
                break;
            case 5:
                exitProgram();
                break;
            default:
                System.out.println("Menu tidak ditemukan!");
                break;
        }
        menuProgram();
    }
    public void run(){
        createQueue();
        menuProgram();
    }
}
