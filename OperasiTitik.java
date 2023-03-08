///OperasiTitik.java 08/03/01
///Penulis : Alfaya Sayyida
///NIM : 24060121120009
///Deskripsi : kelas yang dapat mendukung enkapsulasi

class OperasiTitik{
	private void refleksiSumbuX(Titik titik) {
		Double ordinat = titik.getOrdinat();
		titik.setOrdinat(-1 * ordinat);
	}

	private void refleksiSumbuY(Titik titik) {
		Double absis = titik.getAbsis();
		titik.setAbsis(-1 * absis);
	}

	public void refleksiX(Titik titik) {
		Double ordinat = titik.getOrdinat();
		titik.setOrdinat(-1 * ordinat);
	}

	public void refleksiY(Titik titik) {
		Double absis = titik.getAbsis();
		titik.setAbsis(-1 * absis);
	}
}