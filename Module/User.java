package Module;

abstract class User {
    private String nama, alamat, ttl, telepon;

    public User(String nama, String alamat, String ttl, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.ttl = ttl;
        this.telepon = telepon;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    @Override
    public String toString(){
        return
            "Nama: " + this.nama +
            "\nAlamat: " + this.alamat +
            "\nttl: " + this.ttl +
            "\ntelepon: " + this.telepon;
    }
}
