public class Mahasiswa extends Anggota {
    private String nim;

    public Mahasiswa(String id, String nama, String nim) {
        super(id, nama);
        this.nim = nim;
    }

    @Override
    public int getLimitPinjamBuku() {
        return 5;
    }

    @Override
    public double hitungDenda(int terlambatHari) {
        return terlambatHari * 1000;
    }
}


Anggota a = new MahasiswaDigital("X", "Y", "Z");
DapatDigital d = a;