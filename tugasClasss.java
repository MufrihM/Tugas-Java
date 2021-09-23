package com.company;
import java.util.Scanner;

class Penyewa{
    String namaPenyewa;
    int waktuSewa;
    int lapangan;
    String tanggalSewa;
    int uangMuka;
    int uangTotal;
    boolean isLunas;

    public void setPenyewa(String namaPenyewa, int waktuSewa, int lapangan, boolean isLunas){
        this.namaPenyewa = namaPenyewa;
        this.waktuSewa = waktuSewa;
        this.lapangan = lapangan;
        this.isLunas = isLunas;
    }
    public String getNama_penyewa(){
        return namaPenyewa;
    }
    public int getWaktuSewa(){
        return waktuSewa;
    }
    public int getLapangan(){
        return lapangan;
    }
    public boolean getIsLunas(){
        return isLunas;
    }
}
public class tugasClasss {
    public static void main(String[] args){
        Scanner nama = new Scanner(System.in);
        System.out.println("Masukkan nama anda:");
        String input = nama.next();

        Scanner waktu = new Scanner(System.in);
        System.out.println("Anda ingin menyewa lapangan berapa jam?");
        int input1 = waktu.nextInt();

        Scanner lap = new Scanner(System.in);
        System.out.println("Lapangan mana yang ingin anda sewa?");
        int input2 = lap.nextInt();

        Scanner status = new Scanner(System.in);
        System.out.println("Apakah anda ingin membayar lunas? (true/false)");
        boolean input3 = status.nextBoolean();

        Penyewa manusia = new Penyewa();
        manusia.setPenyewa(input, input1, input2, input3);
        System.out.println(manusia.getNama_penyewa());
        System.out.println(manusia.getLapangan());
        System.out.println(manusia.getWaktuSewa());
        System.out.println(manusia.getIsLunas());
    }
}