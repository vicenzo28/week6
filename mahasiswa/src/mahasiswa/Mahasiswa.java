/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 *
 * @author Kevin
 */
public class Mahasiswa {
    String nim;
	String nama;
	Double ipk;
	int sks;
	String tglLahir;//formatnya yyyy-mm-dd
	
	public Mahasiswa(String nim, String nama, Double ipk, int sks, String tglLahir) {
		this.nim = nim;
		this.nama = nama;
		this.ipk = ipk;
		this.sks = sks;
		this.tglLahir = tglLahir;
	}
	
	public String getProgdi(String progdi) {
		String ps="";
		if(progdi=="A11") {
			ps = "Teknik Informatika";
		}
		else if(progdi=="A12") {
			ps = "Sistem Informasi";
		}
		else if(progdi=="B11") {
			ps = "Manajemen";
		}
		else if(progdi=="B12") {
			ps = "Akuntansi";
		}
		else {
			ps = "Belum terdaftar";
		}
		
		return ps;
	}
	
	public String ipkStatus() {
		String stat="";
		
		// * jika 0 < ipk <=1 , maka stat = "Perlu usaha lebih"
		if (0<ipk&&ipk<=1) {
			stat = "Perlu usaha lebih";
		}
		// * jika 1 < ipk <=2, maka stat = "Perlu segera menaikkan IPK"
		else if (1<ipk&&ipk<=2) {
			stat = "Perlu segera menaikkan IPK";
		}
		// * jika 2 < ipk <=2.75, maka stat = "Sedikit lagi"
		else if (2<ipk&&ipk<=2.75) {
			stat = "Sedikit lagi";
		}
		// * jika 2.75 < ipk <= 3, maka stat = "Memuaskan"
		else if (2.75<ipk&&ipk<=3) {
			stat = "Memuaskan";
		}
		// * jika 3 < ipk <= 3.5, maka stat = "Sangat Memuaskan
		else if (3<ipk&&ipk<=3.5) {
			stat = "Sangat Memuaskan";
		}
		// * jika 3.5 < ipk <=4, maka stat = "Dengan pujian"
		else if (3.5<ipk&&ipk<=4) {
			stat = "Dengan pujian";
		}
		// * jika di atas 4, maka stat = "Range ipk di luar jalur" 
		else {
			stat = "Range IPK di luar jalur";
		}
		
		return stat;
	}
	
	public int getTahun() {
		int angkatan;
		String str = nim.substring(4, 8);
		angkatan = Integer.parseInt(str); // casting to integer

		return angkatan;
	}
	
	public int getTagihanSks() {
		int perSks = 250000;
		int tagihan = sks*perSks;
		
		return tagihan;
	}
	
	public int getMhsSemester() {
		int smt = 0;
		Calendar kld = Calendar.getInstance();
		int thnSkr = kld.get(Calendar.YEAR);
		int blnSkr = kld.get(Calendar.MONTH);

		smt = (thnSkr - getTahun()) * 2;

		if (blnSkr<2) {
			smt = smt-1;
		} else if (blnSkr>6) {
			smt = smt+1;
		}
		
		
		return smt;
	}
	
	private Date dateFormatter(String pola, String tanggal) {
		Date tgl=null;
		SimpleDateFormat formatter = new SimpleDateFormat(pola);
		
		try {
			tgl = formatter.parse(tanggal);
		}
		catch(ParseException e) {
			e.printStackTrace();
		}
		return tgl;
	}
	
	public String getUmur() {
		String umur = "";
		Calendar cal = Calendar.getInstance();
		int thnNow = cal.get(Calendar.YEAR);
		int blnNow = cal.get(Calendar.MONTH);
		int dayNow = cal.get(Calendar.DATE);

		String[] arrtgLhr = tglLahir.split("-");
		int thnBorn = Integer.parseInt(arrtgLhr[0]);
		int blnBorn = Integer.parseInt(arrtgLhr[1]);
		int dayBorn = Integer.parseInt(arrtgLhr[2]);

		int tempUmur = thnNow - thnBorn;
		if ((blnBorn-1)>blnNow) {
			tempUmur = tempUmur-1;
		} else if ((blnBorn-1)==blnNow) {
			if (dayBorn>dayNow) {
				tempUmur = tempUmur-1;
			}
		}

		umur = String.valueOf(tempUmur);

		
		
		return umur;
		
	}
}


