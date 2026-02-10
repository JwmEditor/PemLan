public class App {

    public static void main(String[] args) {

        BidangDuaDimensi persegi = new BujurSangkar("Persegi", 5);
        BidangDuaDimensi lingkaran = new Lingkaran("Lingkaran", 7);

        persegi.info();
        System.out.println("Luas: " + persegi.luas());

        System.out.println();

        lingkaran.info();
        System.out.println("Luas: " + lingkaran.luas());
    }
}

class BidangDuaDimensi {

    protected String nama;

    public BidangDuaDimensi(String nama) {
        this.nama = nama;
    }

    public void info() {
        System.out.println("Nama bidang: " + nama);
    }

    public double luas() {
        return 0; // belum didefinisikan
    }
}

class BujurSangkar extends BidangDuaDimensi {

    private double sisi;

    public BujurSangkar(String nama, double sisi) {
        super(nama);
        this.sisi = sisi;
    }

    @Override
    public double luas() {
        return sisi * sisi;
    }
}

class Lingkaran extends BidangDuaDimensi {

    private double jariJari;

    public Lingkaran(String nama, double jariJari) {
        super(nama);
        this.jariJari = jariJari;
    }

    @Override
    public double luas() {
        return Math.PI * jariJari * jariJari;
    }
}
