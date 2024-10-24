package Module;

public class Doktor extends Mahasiswa{
    private String judulDisertasi;
    private double n1, n2, n3;

    public Doktor(String nama, String alamat, String ttl, String telepon, String nim, String jurusan,
            String judulDisertasi, double n1, double n2, double n3) {
        super(nama, alamat, ttl, telepon, nim, jurusan);
        this.judulDisertasi = judulDisertasi;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
    public String getJudulDisertasi() {
        return judulDisertasi;
    }
    public void setJudulDisertasi(String judulDisertasi) {
        this.judulDisertasi = judulDisertasi;
    }
    public double getN1() {
        return n1;
    }
    public void setN1(double n1) {
        this.n1 = n1;
    }
    public double getN2() {
        return n2;
    }
    public void setN2(double n2) {
        this.n2 = n2;
    }
    public double getN3() {
        return n3;
    }
    public void setN3(double n3) {
        this.n3 = n3;
    }

    @Override
    public String toString(){
        return
            super.toString() +
            "\nJudul Disertasi: " + this.judulDisertasi +
            "\nNilai Sidang 1: " + n1 +
            "\nNilai Sidang 2: " + n2 +
            "\nNilai Sidang 3: " + n3;
    }
}
