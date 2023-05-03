public class Manager extends Pegawai {
    public int tunjangan = 700000;
    
    public Manager(String nama) {
        setNama(nama);
    }
    
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan: " + tunjangan);
    }
}