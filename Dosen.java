public class Dosen extends Anggota {
    private String nidn;
    
    public Dosen(String id, String nama, String nidn) {
        super(id, nama);
        this.nidn = nidn;
    }

    @Override
    public int getLimitPinjamBuku() {
        return 10;
    }
    
    @Override
    public double hitungDenda(int terlambatHari) {
        return terlambatHari * 500;
    }
}

