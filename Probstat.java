package PraktikumPemlan.Modul9.SoalPraktikum;

class Probstat extends MataKuliah {

    public Probstat(double tugas, double kuis, double uts, double uas) {
        super(tugas, kuis, uts, uas);
    }

    double hitungNilai() {

        return (tugas * 0.15) +
               (kuis * 0.15) +
               (uts * 0.3) +
               (uas * 0.4);
    }
}
