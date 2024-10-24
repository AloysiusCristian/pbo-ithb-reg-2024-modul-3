import Module.*;
import Enum.*;

import java.sql.Time;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Matakuliah[] listMatkul = new Matakuliah[5];
        listMatkul[0] = new Matakuliah("001", "DesWeb", 2);
        listMatkul[1] = new Matakuliah("002", "Algo", 4);
        listMatkul[2] = new Matakuliah("003", "Prak Algo", 1);
        listMatkul[3] = new Matakuliah("004", "PTI", 3);
        listMatkul[4] = new Matakuliah("005", "Indo", 2);

        Presensi presenHadirMhs = new Presensi(new Date(), StatusHadir.HADIR);
        Presensi presenAlphaMhs = new Presensi(new Date(), StatusHadir.ALPHA);

        //Ko Dion = Doktor
        Doktor doktor = new Doktor("Dionisius", "Bandung", "Bandung", "082", "112301", "IF", "CNN", 90, 90, 99);
        
        //Richie = Magister
        ArrayList<Presensi> listPresensiRichie = new ArrayList<Presensi>();
        listPresensiRichie.add(presenAlphaMhs);
        ArrayList<MatkulAmbil> listMatkulRichie = new ArrayList<MatkulAmbil>();
        listMatkulRichie.add(new MatkulAmbil(listMatkul[1], listPresensiRichie, 70, 80, 90));
        listMatkulRichie.add(new MatkulAmbil(listMatkul[3], listPresensiRichie, 80, 90, 90));
        listMatkulRichie.add(new MatkulAmbil(listMatkul[0], listPresensiRichie, 70, 93, 76));
        Magister magister = new Magister("Richie", "Bandung", "Bandung", "081", "112302", "IF", listMatkulRichie, "AI");

        //Aloy = Sarjana
        ArrayList<Presensi> listPresensiAloy = new ArrayList<Presensi>();
        listPresensiAloy.add(presenHadirMhs);
        ArrayList<MatkulAmbil> listMatkulAloy = new ArrayList<MatkulAmbil>();
        listMatkulAloy.add(new MatkulAmbil(listMatkul[1], listPresensiAloy, 70, 80, 90));
        listMatkulAloy.add(new MatkulAmbil(listMatkul[3], listPresensiAloy, 80, 90, 90));
        listMatkulAloy.add(new MatkulAmbil(listMatkul[0], listPresensiAloy, 70, 93, 76));
        Sarjana sarjana = new Sarjana("Aloy", "Bandung", "Bandung", "083", "112303", "IF", listMatkulAloy);

        //Polimorphism
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<Mahasiswa>();
        listMahasiswa.add(doktor);
        listMahasiswa.add(magister);
        listMahasiswa.add(sarjana);


        PresensiStaff presenHadirStaff = new PresensiStaff(new Date(), StatusHadir.HADIR, new Time(0));
        PresensiStaff presenAlphaStaff = new PresensiStaff(new Date(), StatusHadir.ALPHA, new Time(0));
        
        //Ibu Inge = Dosen Tetap
        ArrayList<PresensiStaff> listPresensiBuInge = new ArrayList<PresensiStaff>();
        listPresensiBuInge.add(presenHadirStaff);
        ArrayList<MatkulAjar> listMatkulBuInge = new ArrayList<MatkulAjar>();
        listMatkulBuInge.add(new MatkulAjar(listMatkul[1], listPresensiBuInge));
        listMatkulBuInge.add(new MatkulAjar(listMatkul[3], listPresensiBuInge));
        DosenTetap dosenTetap = new DosenTetap("Ibu Inge", "Bandung", "Bandung", "0889", "123", "IF", listMatkulBuInge, 15000000);

        //Ko Hans = Dosen Honorer
        ArrayList<PresensiStaff> listPresensiKoHans = new ArrayList<PresensiStaff>();
        listPresensiKoHans.add(presenAlphaStaff);
        ArrayList<MatkulAjar> listMatkulKoHans = new ArrayList<MatkulAjar>();
        listMatkulKoHans.add(new MatkulAjar(listMatkul[0], listPresensiKoHans));
        listMatkulKoHans.add(new MatkulAjar(listMatkul[2], listPresensiKoHans));
        listMatkulKoHans.add(new MatkulAjar(listMatkul[4], listPresensiKoHans));
        DosenTetap dosenHonorer = new DosenTetap("Ko Hans", "Bandung", "Bandung", "0898", "124", "IF", listMatkulKoHans, 2000000);

        //Pa Taufik = Karyawan IT
        ArrayList<PresensiStaff> listPresensiPaTaufik = new ArrayList<PresensiStaff>();
        listPresensiPaTaufik.add(presenAlphaStaff);
        Karyawan karyawan = new Karyawan("Pa Taufik", "Bandung", "Bandung", "0988", "125", 7000000, listPresensiPaTaufik);

        //Polimorphism
        ArrayList<Staff> listStaff = new ArrayList<Staff>();
        listStaff.add(dosenHonorer);
        listStaff.add(dosenTetap);
        listStaff.add(karyawan);

        for (Staff staff : listStaff) {
            System.out.println(staff.toString());
        }
        for (Mahasiswa mahasiswa : listMahasiswa) {
            System.out.println(mahasiswa.toString());
        }
    }
}
