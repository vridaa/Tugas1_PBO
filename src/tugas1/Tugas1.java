/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;
//vrida_123220082

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
/**
 *
 * @author ASUS
 */
class LoginFrame extends JFrame{
    JLabel tulisan = new JLabel("Selamat Datang!");
    JLabel tulisan2 = new JLabel("Silahkan Masuk untuk melanjutkan.");
    JLabel username = new JLabel("Username");
    JTextField inputNama = new JTextField();
    JLabel password = new JLabel("Password");
    JTextField inputpassword = new JTextField();
    JLabel gender = new JLabel("Jenis Kelamin");
    JRadioButton pilihLaki = new JRadioButton("Laki-laki");
    JRadioButton pilihPerempuan = new JRadioButton("Perempuan");
    JButton tombolLogin = new JButton("Login");
    
    LoginFrame() {
        setVisible(true);
        setSize(480, 520);
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLayout(null);
        
        add (tulisan);
        tulisan.setBounds(20, 20, 150, 30);
        tulisan.setFont(new Font("Serif",Font.BOLD, 20));
        
        add (tulisan2);
        tulisan2.setBounds(20,40, 300,30);
        
        add (username);
        username.setBounds(20,70, 150,30);
        
        add (inputNama);
        inputNama.setBounds(20, 100, 410, 30);
        
        add(password);
        password.setBounds(20,140,150,30);
        
        add(inputpassword);
        inputpassword.setBounds(20,170,410,30);
        
        add(gender);
        gender.setBounds(20,210,150,30);
        
        ButtonGroup pilihJK =new ButtonGroup();
        pilihJK.add(pilihLaki);
        pilihJK.add(pilihPerempuan);
        
        add(pilihLaki);
        pilihLaki.setBounds(20, 230, 100, 30);
        add(pilihPerempuan);
        pilihPerempuan.setBounds(210,230, 100, 30);
        
        add(tombolLogin);
        tombolLogin.setBounds(20, 280, 410, 35);
        tombolLogin.setBackground(Color.white);
}
    
}
class halamanUtama extends JFrame{
    JLabel salam= new JLabel("Welcome,[Mr./Mrs.][username]");
    JLabel tulisan2= new JLabel("Tentukan panjang, lebar, dan tinggi untuk menghitung Balok");
    JLabel panjang = new JLabel("Panjang");
    JLabel lebar = new JLabel("Lebar");
    JLabel tinggi = new JLabel ("Tinggi");
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
    
    
    halamanUtama(){
        setVisible(true);
        setSize(480, 520);
        setTitle("Halaman Utama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLayout(null);  
        
        add(salam);
        salam.setBounds(20, 20, 370, 40);
        salam.setFont(new Font("Serif",Font.BOLD, 20));
        
        add(tulisan2);
        tulisan2.setBounds(20,50,350,20);
        
        add(panjang);
        panjang.setBounds(20,80,75,30);
        add(inputpanjang);
        inputpanjang.setBounds(130, 80,300 , 30);
        
        add(lebar);
        lebar.setBounds(20, 120, 75, 30);
        add(inputlebar);
        inputlebar.setBounds(130,120,300,30);
        
        add(tinggi);
        tinggi.setBounds(20,160,75,30);
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
        
        
        
    }
}
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LoginFrame kotakFrame = new LoginFrame();
        halamanUtama halaman = new halamanUtama();
    }
    
}
