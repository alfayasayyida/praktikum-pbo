public class Programmer extends Pegawai {
    public int bonus = 450000;
    
    public Programmer(String nama) {
        setNama(nama);
    }
    
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus: " + bonus);
    }
}