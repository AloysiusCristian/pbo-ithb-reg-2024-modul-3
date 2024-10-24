package Module;

public class Staff extends User {
    private String nik;

    public Staff(String nama, String alamat, String ttl, String telepon, String nik) {
        super(nama, alamat, ttl, telepon);
        this.nik = nik;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    @Override
    public String toString(){
        return
            super.toString() +
            "\nNIK: " + this.nik;
    }
}
