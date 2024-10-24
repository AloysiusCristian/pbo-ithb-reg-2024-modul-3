package Module;

import java.util.ArrayList;

public class Sarjana extends Mahasiswa{
    private ArrayList <MatkulAmbil> mataKuliahDiambil = new ArrayList<MatkulAmbil>();

    public Sarjana(String nama, String alamat, String ttl, String telepon, String nim, String jurusan,
            ArrayList<MatkulAmbil> mataKuliahDiambil) {
        super(nama, alamat, ttl, telepon, nim, jurusan);
        this.mataKuliahDiambil = mataKuliahDiambil;
    }

    public ArrayList<MatkulAmbil> getMataKuliahDiambil() {
        return mataKuliahDiambil;
    }

    public void setMataKuliahDiambil(ArrayList<MatkulAmbil> mataKuliahDiambil) {
        this.mataKuliahDiambil = mataKuliahDiambil;
    }

    @Override
    public String toString(){
        return
            super.toString() +
            "\nMata Kuliah Diambil: " + mataKuliahDiambil;
    }
}
