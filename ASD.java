package PraktikumPemlan.Modul9.SoalPraktikum;

class ASD extends MataKuliah {

    public ASD(double tugas, double kuis, double uts, double uas) {
        super(tugas, kuis, uts, uas);
    }

    double hitungNilai() {

        return (tugas * 0.1) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.4);
    }
}
