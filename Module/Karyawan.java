package Module;

import java.util.ArrayList;

public class Karyawan extends Staff{
    private double salary;
    private ArrayList<PresensiStaff> presensi = new ArrayList<PresensiStaff>();
    
    public Karyawan(String nama, String alamat, String ttl, String telepon, String nik, double salary,
            ArrayList<PresensiStaff> presensi) {
        super(nama, alamat, ttl, telepon, nik);
        this.salary = salary;
        this.presensi = presensi;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public ArrayList<PresensiStaff> getPresensi() {
        return presensi;
    }
    public void setPresensi(ArrayList<PresensiStaff> presensi) {
        this.presensi = presensi;
    }

    @Override
    public String toString(){
        return
            super.toString() +
            "\nSalary: " + this.salary +
            "\nPresensi: " + this.presensi;
    }
}
