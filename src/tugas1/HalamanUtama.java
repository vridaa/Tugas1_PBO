/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

import BangunDatar.persegi;
import BangunRuang.balok;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author ASUS
 */
public class HalamanUtama extends JFrame implements ActionListener {
    JLabel salam= new JLabel();
    JLabel tulisan2= new JLabel("Tentukan panjang, lebar, dan tinggi untuk menghitung Balok");
    JLabel Lpanjang = new JLabel("Panjang");
    JLabel Llebar = new JLabel("Lebar");
    JLabel Ltinggi = new JLabel ("Tinggi");
    JTextField inputpanjang = new JTextField();
    JTextField inputlebar = new JTextField();
    JTextField inputtinggi = new JTextField();
    JButton tombolhitung = new JButton("Hitung");
    JButton tombolreset = new JButton("Reset");
    JLabel hasil = new JLabel("Hasil");
    JLabel luas = new JLabel("Luas Persegi");
    JLabel keliling = new JLabel("Keliling Persegi");
    JLabel volume = new JLabel("Volume Balok");
    JLabel luaspermukaan = new JLabel ("Luas Permukaan Balok");
    JLabel hasilluas = new JLabel("[Hasil Berupa Angka]");
    JLabel hasilkeliling = new JLabel("[Hasil Berupa Angka]");
    JLabel hasilvolume = new JLabel("[Hasil Berupa Angka]");
    JLabel hasilluaspermukaan = new JLabel("[Hasil Berupa Angka]");
    
    
    HalamanUtama(String Username, String jenisKelamin){
        String JK =(jenisKelamin=="L"?"Mr.":"Mrs.");
        setVisible(true);
        setSize(480, 520);
        setTitle("Halaman Utama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLayout(null);  
        
        add(salam);
        salam.setText("Wellcome, "+ JK + Username);
        salam.setBounds(20, 20, 370, 40);
        salam.setFont(new Font("Serif",Font.BOLD, 20));
        
        add(tulisan2);
        tulisan2.setBounds(20,50,350,20);
        
        add(Lpanjang);
        Lpanjang.setBounds(20,80,75,30);
        add(inputpanjang);
        inputpanjang.setBounds(130, 80,300 , 30);
        
        add(Llebar);
        Llebar.setBounds(20, 120, 75, 30);
        add(inputlebar);
        inputlebar.setBounds(130,120,300,30);
        
        add(Ltinggi);
        Ltinggi.setBounds(20,160,75,30);
        add(inputtinggi);
        inputtinggi.setBounds(130,160,300,30);
        
        add(tombolhitung);
        tombolhitung.setBounds(20, 210, 410, 33);
        tombolhitung.setBackground(Color.white);
        
        add(tombolreset);
        tombolreset.setBounds(20,250, 410, 33);
        tombolreset.setBackground(Color.white);
        
        add(hasil);
        hasil.setBounds(20,290,410,30);
        hasil.setHorizontalAlignment(SwingConstants.CENTER);
        
        add(luas);
        luas.setBounds(20, 315, 175, 30);
        add(hasilluas);
        hasilluas.setBounds(200,315,300,30);
        
        add(keliling);
        keliling.setBounds(20,345, 175, 30);
        add(hasilkeliling);
        hasilkeliling.setBounds(200,345,300,30);
        
        add(volume);
        volume.setBounds(20, 375, 175, 30);
        add(hasilvolume);
        hasilvolume.setBounds(200,375,300,30);
        
        add(luaspermukaan);
        luaspermukaan.setBounds(20, 405, 175, 30);
        add(hasilluaspermukaan);
        hasilluaspermukaan.setBounds(200,405,300,30);
        
        tombolhitung.addActionListener(this);
        tombolreset.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String panjang = inputpanjang.getText();
            String lebar = inputlebar.getText();
            String tinggi = inputtinggi.getText();
            if(panjang.isEmpty()){
                throw new Exception("panjang belom di masukkan!!");
            }else if(lebar.isEmpty()){
                throw new Exception("lebar belom di masukkan!!");
            }else if(tinggi.isEmpty()){
                throw new Exception("tinggi belom di masukkan!!");
            }
            if(!inputpanjang.getText().matches("[0-9]*")){
                 throw new Exception("inputan panjang harus angka!!");
            } else if(!inputlebar.getText().matches("[0-9]*")) {
                throw new Exception("inputan lebar harus angka!!");              
            }else if(!inputtinggi.getText().matches("[0-9]*")) {
                throw new Exception("inputan tinggi harus angka!!");              
            }
        } catch(Exception error){
            JOptionPane.showMessageDialog(null, error.getMessage());
            return;
        }
        if (e.getSource() == tombolhitung) {
        double panjang = Double.parseDouble(inputpanjang.getText());
        double lebar = Double.parseDouble(inputlebar.getText());
        double tinggi = Double.parseDouble(inputtinggi.getText());
        
        persegi bangun1 = new persegi(panjang, lebar);
        String hasilLuas = String.valueOf(bangun1.luas());
        String hasilKeliling = String.valueOf(bangun1.keliling());
        
        balok bangun2 = new balok(panjang, lebar, tinggi);
        String hasilVolume = String.valueOf(bangun2.volume());
        String hasilLuaspermukaan = String.valueOf(bangun2.luaspermukaan());
        
        
        this.hasilluas.setText(hasilLuas);
        this.hasilkeliling.setText(hasilKeliling);
        this.hasilvolume.setText(hasilVolume);
        this.hasilluaspermukaan.setText(hasilLuaspermukaan);
    } else if (e.getSource() == tombolreset) {
        inputpanjang.setText("");
        inputlebar.setText("");
        inputtinggi.setText("");
        hasilluas.setText("Hasil berupa angka");
        hasilkeliling.setText("Hasil berupa angka");
        hasilvolume.setText("Hasil berupa angka");
        hasilluaspermukaan.setText("Hasil berupa angka");
    }

    }
    
}
