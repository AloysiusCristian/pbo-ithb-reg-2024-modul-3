package Module;

import java.util.ArrayList;

public class Magister extends Mahasiswa {
    private ArrayList <MatkulAmbil> mataKuliahDiambil = new ArrayList<MatkulAmbil>();
    private String namaPenelitian;

    public Magister(String nama, String alamat, String ttl, String telepon, String nim, String jurusan,
            ArrayList<MatkulAmbil> mataKuliahDiambil, String namaPenelitian) {
        super(nama, alamat, ttl, telepon, nim, jurusan);
        this.mataKuliahDiambil = mataKuliahDiambil;
        this.namaPenelitian = namaPenelitian;
    }
    public ArrayList<MatkulAmbil> getMataKuliahDiambil() {
        return mataKuliahDiambil;
    }
    public void setMataKuliahDiambil(ArrayList<MatkulAmbil> mataKuliahDiambil) {
        this.mataKuliahDiambil = mataKuliahDiambil;
    }
    public String getNamaPenelitian() {
        return namaPenelitian;
    }
    public void setNamaPenelitian(String namaPenelitian) {
        this.namaPenelitian = namaPenelitian;
    }

    @Override
    public String toString(){
        return
            super.toString() +
            "\nMata Kuliah Diambil: " + this.mataKuliahDiambil +
            "\nNama Penelitian: " + namaPenelitian;
    }
}
