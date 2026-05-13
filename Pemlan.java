package PraktikumPemlan.Modul9.SoalPraktikum;

class Pemlan extends MataKuliah {

    public Pemlan(double tugas, double kuis, double uts, double uas) {
        super(tugas, kuis, uts, uas);
    }

    double hitungNilai() {

        return (tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.3);
    }
}
