package Module;

import java.util.Date;
import java.sql.Time;

import Enum.StatusHadir;

public class PresensiStaff extends Presensi{
    private Time jam = new Time(0);

    public PresensiStaff(Date tanggal, StatusHadir status, Time jam) {
        super(tanggal, status);
        this.jam = jam;
    }

    public Time getJam() {
        return jam;
    }

    public void setJam(Time jam) {
        this.jam = jam;
    }

    @Override
    public String toString() {
        return 
            super.toString() +
            "\nPresensi Staff Jam: " + this.jam;
    }
    
}
