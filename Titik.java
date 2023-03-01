///MTitik.java 23/03/01
///Penulis : Alfaya Sayyida
///Deskripsi : Kelas yang berisi program utama yang memanfaatkan program Titik

class Titik {
	double absis;
	double ordinat;
	static int counterTitik;

	Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;

	}

	double getAbsis(){
		return absis;
	}

	double getOrdinat(){
		return ordinat;
	}

	void setAbsis(double a){
		absis = a;
	}

	void setOrdinat(double o){
		ordinat = o;
	}

	static int getCounterTitik(){
		return counterTitik;
	}

}
