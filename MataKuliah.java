package PraktikumPemlan.Modul9.SoalPraktikum;

abstract class MataKuliah {

    double tugas, kuis, uts, uas;

    public MataKuliah(double tugas, double kuis, double uts, double uas) {

        this.tugas = tugas;
        this.kuis = kuis;
        this.uts = uts;
        this.uas = uas;
    }

    abstract double hitungNilai();
}
