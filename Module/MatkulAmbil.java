package Module;

import java.util.ArrayList;

public class MatkulAmbil{
    Matakuliah matakuliah;
    private ArrayList<Presensi> presensi = new ArrayList<Presensi>();
    private double n1, n2, n3;
    
    public MatkulAmbil(Matakuliah matakuliah, ArrayList<Presensi> presensi, double n1, double n2, double n3) {
        this.matakuliah = matakuliah;
        this.presensi = presensi;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
    public ArrayList<Presensi> getPresensi() {
        return presensi;
    }
    public void setPresensi(ArrayList<Presensi> presensi) {
        this.presensi = presensi;
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
            "\nMata Kuliah: " + matakuliah +
            "\nPresensi: " + presensi +
            "\nNilai 1: " + n1 +
            "\nNilai 2: " + n2 +
            "\nNilai 3: " + n3;
    }
}
