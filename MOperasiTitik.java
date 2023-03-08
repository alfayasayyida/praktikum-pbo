///MOperasiTitik.java 08/03/01
///Penulis : Alfaya Sayyida
///NIM : 24060121120009
///Deskripsi : kelas yang dapat mendukung enkapsulasi


class MOperasiTitik
{

	public static void main(String[] atgs)
	{
		Titik t1 = new Titik();
		t1.setAbsis(1.0);
		t1.setOrdinat(2.0);

		System.out.println("titik = ("+t1.getAbsis()+"," + t1.getOrdinat()+")");

		OperasiTitik op = new OperasiTitik();
		op.refleksiSumbuX(t1);
		op.refleksiSumbuY(t1);
		System.out.println("titik setelah refleksi X = ("+t1.getAbsis()+"," + t1.getOrdinat()+")");
		System.out.println("titik setelah refleksi Y = ("+t1.getAbsis()+"," + t1.getOrdinat()+")");

		OperasiTitik ot = new OperasiTitik();
		ot.refleksiX(t1);
		ot.refleksiY(t1);
		System.out.println("titik setelah refleksi X = ("+t1.getAbsis()+"," + t1.getOrdinat()+")");
		System.out.println("titik setelah refleksi Y = ("+t1.getAbsis()+"," + t1.getOrdinat()+")");
	}
}