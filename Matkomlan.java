package PraktikumPemlan.Modul9.SoalPraktikum;

class Matkomlan extends MataKuliah {

    public Matkomlan(double tugas, double kuis, double uts, double uas) {
        super(tugas, kuis, uts, uas);
    }

    double hitungNilai() {

        return (tugas * 0.25) +
               (kuis * 0.25) +
               (uts * 0.25) +
               (uas * 0.25);
    }
}
