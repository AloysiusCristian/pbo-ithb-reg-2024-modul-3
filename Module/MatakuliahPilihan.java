package Module;

public class MatakuliahPilihan extends Matakuliah{
    private int minMahasiswa;

    public MatakuliahPilihan(String kode, String nama, int sks, int minMahasiswa) {
        super(kode, nama, sks);
        this.minMahasiswa = minMahasiswa;
    }

    public int getMinMahasiswa() {
        return minMahasiswa;
    }

    public void setMinMahasiswa(int minMahasiswa) {
        this.minMahasiswa = minMahasiswa;
    }

    @Override
    public String toString(){
        return
            super.toString()+
            "\nMin Mahasiswa: " + minMahasiswa;
    }
}
