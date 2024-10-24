package Module;

import java.util.Date;
import Enum.*;

public class Presensi {
    private Date tanggal = new Date(0);
    private StatusHadir status;
    
    public Presensi(Date tanggal, StatusHadir status) {
        this.tanggal = tanggal;
        this.status = status;
    }
    public Date getTanggal() {
        return tanggal;
    }
    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }
    public StatusHadir getStatus() {
        return status;
    }
    public void setStatus(StatusHadir status) {
        this.status = status;
    }
    @Override
    public String toString(){
        return 
            super.toString() +
            "\nDate: " + this.tanggal + 
            "\nStatus Hadir: " + this.status;
    }
}
