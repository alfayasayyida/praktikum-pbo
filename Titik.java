///Titik.java 23/02/01
///Penulis : Alfaya Sayyida
///NIM : 24060121120009
///Deskripsi : Kelas yang berisi program utama yang memanfaatkan program Titik

class Titik {
	private double absis;
	private double ordinat;
	private static int counterTitik;

	public Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;

	}

	public double getAbsis(){
		return absis;
	}

	public double getOrdinat(){
		return ordinat;
	}

	public void setAbsis(double a){
		absis = a;
	}

	public void setOrdinat(double o){
		ordinat = o;
	}

	public static int getCounterTitik(){
		return counterTitik;
	}

}