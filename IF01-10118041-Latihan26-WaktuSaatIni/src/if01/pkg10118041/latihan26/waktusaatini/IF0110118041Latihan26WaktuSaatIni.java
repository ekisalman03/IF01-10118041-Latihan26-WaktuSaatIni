/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118041.latihan26.waktusaatini;
import java.util.Date;
/**
 * Nama      : Eki salman sya'bani
 * Kelas     : IF-1
 * NIM       : 10118041
 * Deskripsi : Menampilkan Waktu Saat ini
 * @author Eki
 */

public class IF0110118041Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        int detik, menit, jam, hari, tanggal, bulan, tahun;
        //Array
        String[] Bulan = {"Jan", "Feb", "Mar", "Apr", "Mei", "Jun", "Jul", "Agus", "Sep", "Okt", "Nov", "Des"};
        String[] Hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};

        //Fungsi Date
        Date date = new Date();

        hari = date.getDay();
        tanggal = date.getDate();
        bulan = date.getMonth();
        tahun = date.getYear() + 1900;
        jam = date.getHours();
        menit = date.getMinutes();
        detik = date.getSeconds();

        //Output
        System.out.println("Hari ini adalah hari : " + Hari[hari] + ", " + tanggal + " " + Bulan[bulan] + " " + tahun + " " + jam + ":" + menit + ":" + detik);
    }    
}
