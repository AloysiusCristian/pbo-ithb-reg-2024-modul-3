package Module;

import java.util.ArrayList;

public class DosenHonorer extends Dosen{
    private double honorPerSKS;

    public DosenHonorer(String nama, String alamat, String ttl, String telepon, String nik, String departemen,
            ArrayList<MatkulAjar> mataKuliahDiajar, double honorPerSKS) {
        super(nama, alamat, ttl, telepon, nik, departemen, mataKuliahDiajar);
        this.honorPerSKS = honorPerSKS;
    }

    public double getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(double honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

    @Override
    public String toString(){
        return
            super.toString() +
            "\nHonor Per SKS: " + this.honorPerSKS;
    }
}
