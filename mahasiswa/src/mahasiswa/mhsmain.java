/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswa;
import mahasiswa.Mahasiswa;
/**
 *
 * @author Kevin
 */
public class mhsmain {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		// a. Membuat objek dari class Mahasiswa
		Mahasiswa mahasiswa = new Mahasiswa("A11.2020.12451", "Vicenzo Frendyatha A", 3.88, 24, "2002-07-06");

		// b. Mencari nama program studi berdasarkan nim
		System.out.println("Program Studi : " + mahasiswa.getProgdi("A11"));

		// c. Mencari status berdasarkan ipk
		System.out.println("Status IPK : " + mahasiswa.ipkStatus());

		// d. Mencari tahun angkatan berdasarkan nim
		System.out.println("Angkatan : " + mahasiswa.getTahun());

		// e. Mencari tagihan berdasarkan sks
		System.out.println("Tagihan : " + mahasiswa.getTagihanSks());

		// f. Mencari berapa semester mahasiswa sudah kuliah
		System.out.println("Semester : " + mahasiswa.getMhsSemester());

		// g. Mencari umur mahasiswa
		System.out.println("Umur : " + mahasiswa.getUmur());
	}
    
}
