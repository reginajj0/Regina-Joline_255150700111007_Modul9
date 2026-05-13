package PraktikumPemlan.Modul9.SoalPraktikum;

import java.awt.*;
import java.awt.event.*;

public class PraktikumGUI extends Frame {

    Label lbJudul, lbTugas, lbKuis, lbUTS, lbUAS, lbHasil;

    TextField txtTugas, txtKuis, txtUTS, txtUAS, txtHasil;

    CheckboxGroup cbg;
    Checkbox cbPemlan, cbASD, cbMatkomlan, cbProbstat;

    Button btnHitung, btnTampil;

    TextArea area;

    double nilaiPemlan, nilaiASD, nilaiMatkomlan, nilaiProbstat;

    public PraktikumGUI() {

        setLayout(null);

        lbJudul = new Label("Hitung Nilai Akhir");
        lbJudul.setFont(new Font("Arial", Font.BOLD, 16));
        add(lbJudul);
        lbJudul.setBounds(120, 30, 200, 30);

        cbg = new CheckboxGroup();

        cbASD = new Checkbox("ASD", cbg, false);
        add(cbASD);
        cbASD.setBounds(40, 70, 60, 20);

        cbPemlan = new Checkbox("Pemlan", cbg, true);
        add(cbPemlan);
        cbPemlan.setBounds(110, 70, 80, 20);

        cbMatkomlan = new Checkbox("Matkomlan", cbg, false);
        add(cbMatkomlan);
        cbMatkomlan.setBounds(190, 70, 90, 20);

        cbProbstat = new Checkbox("Probstat", cbg, false);
        add(cbProbstat);
        cbProbstat.setBounds(290, 70, 80, 20);

        lbTugas = new Label("Tugas : ");
        add(lbTugas);
        lbTugas.setBounds(110, 110, 60, 20);

        lbKuis = new Label("Kuis : ");
        add(lbKuis);
        lbKuis.setBounds(110, 140, 60, 20);

        lbUTS = new Label("UTS : ");
        add(lbUTS);
        lbUTS.setBounds(110, 170, 60, 20);

        lbUAS = new Label("UAS : ");
        add(lbUAS);
        lbUAS.setBounds(110, 200, 60, 20);

        lbHasil = new Label("Hasil : ");
        add(lbHasil);
        lbHasil.setBounds(110, 230, 60, 20);

        txtTugas = new TextField();
        add(txtTugas);
        txtTugas.setBounds(180, 110, 70, 20);

        txtKuis = new TextField();
        add(txtKuis);
        txtKuis.setBounds(180, 140, 70, 20);

        txtUTS = new TextField();
        add(txtUTS);
        txtUTS.setBounds(180, 170, 70, 20);

        txtUAS = new TextField();
        add(txtUAS);
        txtUAS.setBounds(180, 200, 70, 20);

        txtHasil = new TextField();
        add(txtHasil);
        txtHasil.setBounds(180, 230, 70, 20);

        btnHitung = new Button("Hitung");
        add(btnHitung);
        btnHitung.setBounds(130, 270, 100, 30);

        area = new TextArea();
        add(area);
        area.setBounds(50, 320, 280, 130);

        btnTampil = new Button("Tampilkan nilai semua matkul");
        add(btnTampil);
        btnTampil.setBounds(70, 470, 220, 30);

        ItemListener kosongkan = new ItemListener() {

            public void itemStateChanged(ItemEvent e) {

                txtTugas.setText("");
                txtKuis.setText("");
                txtUTS.setText("");
                txtUAS.setText("");
                txtHasil.setText("");
            }
        };

        cbPemlan.addItemListener(kosongkan);
        cbASD.addItemListener(kosongkan);
        cbMatkomlan.addItemListener(kosongkan);
        cbProbstat.addItemListener(kosongkan);

        btnHitung.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                double tugas = Double.parseDouble(txtTugas.getText());
                double kuis = Double.parseDouble(txtKuis.getText());
                double uts = Double.parseDouble(txtUTS.getText());
                double uas = Double.parseDouble(txtUAS.getText());

                double hasil = 0;

                if (cbPemlan.getState()) {

                    Pemlan p = new Pemlan(tugas, kuis, uts, uas);
                    hasil = p.hitungNilai();
                    nilaiPemlan = hasil;

                } else if (cbASD.getState()) {

                    ASD a = new ASD(tugas, kuis, uts, uas);
                    hasil = a.hitungNilai();
                    nilaiASD = hasil;

                } else if (cbMatkomlan.getState()) {

                    Matkomlan m = new Matkomlan(tugas, kuis, uts, uas);
                    hasil = m.hitungNilai();
                    nilaiMatkomlan = hasil;

                } else if (cbProbstat.getState()) {

                    Probstat p = new Probstat(tugas, kuis, uts, uas);
                    hasil = p.hitungNilai();
                    nilaiProbstat = hasil;
                }

                txtHasil.setText(String.valueOf(hasil));
            }
        });

        btnTampil.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                area.setText(
                    "HASIL NILAI SEMUA MATA KULIAH\n\n" +
                    "Pemlan : " + nilaiPemlan + "\n" +
                    "ASD : " + nilaiASD + "\n" +
                    "Matkomlan : " + nilaiMatkomlan + "\n" +
                    "Probstat : " + nilaiProbstat
                );
            }
        });

        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {

        PraktikumGUI window = new PraktikumGUI();

        window.setTitle("Hitung Nilai Akhir dengan GUI");
        window.setSize(380, 560);
        window.setVisible(true);
    }
}