import java.util.ArrayList;

public class MainPerpustakaan {
    public static void main(String[] args) {
        // Polimorfisme via Abstract Class
        ArrayList<Anggota> anggotaList = new ArrayList<>();
        anggotaList.add(new Mahasiswa("A001", "Budi", "2023001"));
        anggotaList.add(new Dosen("A002", "Pak Andi", "12345"));
        anggotaList.add(new MahasiswaDigital("A003", "Siti", "2023002"));

        System.out.println("== DAFTAR ANGGOTA PERPUSTAKAAN ==");
        for (Anggota a : anggotaList) {
            a.tampilkanInfo();
            System.out.println("Limit Pinjam : " + a.getLimitPinjamBuku()+ " buku");
            System.out.println("Denda (5hari): Rp " + a.hitungDenda(5));

            // Cek apakah anggota bisa akses digital
            if (a instanceof DapatDigital) {
                System.out.println(">> Anggota Digital!");
                // Downcasting untuk memanggil method interface
                DapatDigital dd = (DapatDigital) a;
                dd.aksesEBook("https://perpus.ac.id/ebook/123");
                dd.infoDigital();
            }
            System.out.println("-------------------------");
        }

        // Polimorfisme via Interface - ArrayList bertipe DapatDigital
        System.out.println("== KELOMPOK ANGGOTA DIGITAL ==");
        ArrayList<DapatDigital> anggotaDigital = new ArrayList<>();
        anggotaDigital.add(new MahasiswaDigital("A004", "Dewi", "2023003"));
        // anggotaDigital.add(new Dosen(...));

        for (DapatDigital d : anggotaDigital) {
            d.aksesEBook("https://perpus.ac.id/ebook/456");
            d.infoDigital();
        }
    }
}

