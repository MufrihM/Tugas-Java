package com.company;
import java.util.Scanner;

public class mufrihMadjid_202410101146 {
    public static void bynary(int[] list, int panjang, int awal, int dicari){
        int tengah = (awal+panjang)/2;
        while(awal <= panjang){
            if (list[tengah] < dicari){
                awal = tengah+1;
            }else if(list[tengah] == dicari){
                System.out.println("Angka yang dicari ditemukan pada index "+tengah);
                break;
            }else{
                panjang = tengah-1;
            }
            tengah = (awal+panjang)/2;
        }
        if (awal > panjang){
            System.out.println("Angka yang dicari tidak ditemukan");
        }
    }
    public static void main(String[] args) {
        //Problem1
        Scanner prima = new Scanner(System.in);
        System.out.println("Masukkan bilangan yang anda inginkan: ");
        int input = prima.nextInt();
        System.out.println("inputan yang anda masukkan adalah: " + input);
        int cek = 0;
        for (int i = 2; i <= input; i++){
            int hasil = input % i;
            if (hasil == 0) {
                cek++;
            }
        }
        if (cek == 1){
            System.out.println("angka yang dimasukkan termasuk bilangan prima");
        }else{
            System.out.println("angka yang dimasukkan tidak termasuk bilangan prima");
        }
        //Problem2
        long[] angka = {1,2,3,123124235,43641235436236L,2634645856295803463L};
        for (int i=0; i < angka.length; i++)
            if (angka[i]%2 == 0){
                System.out.println(angka[i]+" adalah angka genap");
            }else{
                System.out.println(angka[i]+" adalah angka ganjil");
            }
        //Problem 3
        int[] list = {1,2,3,4,5};
        int dicari = 4;
        int panjang = list.length-1;
        bynary(list, panjang, 0, dicari);
        }
    }
