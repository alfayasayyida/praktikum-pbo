public class Pegawai {
    public String nama;
    public int gajiPokok = 5000000;
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void tampilData() {
        System.out.println("Nama Pegawai: " + nama);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}