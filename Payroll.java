public class Payroll {
    public void cetakGaji(Pegawai p) {
        p.tampilData();
        System.out.println("Total Gaji: " + (p.gajiPokok + (p instanceof Manager ? ((Manager) p).tunjangan : ((Programmer) p).bonus)));
    }
}