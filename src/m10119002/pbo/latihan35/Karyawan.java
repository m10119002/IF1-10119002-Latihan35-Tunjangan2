/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan35;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Class untuk objek Kalkulator
 * 
 * 
 */
public class Karyawan {
    private Double gajiPokok, tunjangan, totalGaji;
    private Boolean statusKawin;
    
    public void gajiPokok(String input) {
        try {
            gajiPokok = (double)Integer.parseInt(input);
        } catch (NumberFormatException ex) {
            gajiPokok = null;
            System.err.println("ERROR: Gaji Pokok hanya boleh berisi Angka!");
        } catch (Exception ex) {
            gajiPokok = null;
            System.err.println("ERROR: Terjadi Kesalahan Sistem!");
        }
    }
    
    public void statusKawin(String input) {
        if(input.toLowerCase().equals("menikah")) statusKawin = true;
        else if(input.toLowerCase().equals("belum")) statusKawin = false;
        else statusKawin = null;
        if(statusKawin==null) System.err.println(
                "ERROR: Masukkan tidak dikenal!");
    }
    
    public void hitungGaji() {
        if((gajiPokok == null) || (statusKawin == null)) {
            System.out.println("");
            System.err.println("Gagal, Pengisian Data tidak benar!");
            return;
        }
        if(statusKawin) tunjangan = gajiPokok * 0.35;
        else tunjangan = 0.0;
        totalGaji = gajiPokok + tunjangan;
        System.out.println("");
        System.out.println("========Hasil Perhitungan Gaji Anda=========");
        System.out.println("Gaji Pokok              : Rp ".
                concat(Double.toString(gajiPokok)));
        System.out.println("Tunjangan               : Rp ".
                concat(Double.toString(tunjangan)));
        System.out.println("Total Gaji              : Rp ".
                concat(Double.toString(totalGaji)));
        System.out.println("Developed by : Firman Sahita)");
    }
}
