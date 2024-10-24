package Module;

import java.util.ArrayList;

public class Dosen extends Staff{
    private String departemen;
    private ArrayList <MatkulAjar> mataKuliahDiajar = new ArrayList<MatkulAjar>();

    public Dosen(String nama, String alamat, String ttl, String telepon, String nik, String departemen,
            ArrayList<MatkulAjar> mataKuliahDiajar) {
        super(nama, alamat, ttl, telepon, nik);
        this.departemen = departemen;
        this.mataKuliahDiajar = mataKuliahDiajar;
    }
    public String getDepartemen() {
        return departemen;
    }
    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }
    public ArrayList<MatkulAjar> getMataKuliahDiajar() {
        return mataKuliahDiajar;
    }
    public void setMataKuliahDiajar(ArrayList<MatkulAjar> mataKuliahDiajar) {
        this.mataKuliahDiajar = mataKuliahDiajar;
    }

    @Override
    public String toString(){
        return
            super.toString() +
            "\nDepartemen: " + this.departemen +
            "\nMata Kuliah Diajar: " + this.mataKuliahDiajar;
    }
}
