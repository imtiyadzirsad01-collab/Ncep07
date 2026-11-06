public interface DapatDigital {
    // Method abstrak
    void aksesEBook(String url);

    // Default method
    default void infoDigital() {
        System.out.println("Anggota ini dapat mengakses e-book.");
    }

    // Konstanta
    int MAX_DOWNLOAD_PER_HARI = 10;
}