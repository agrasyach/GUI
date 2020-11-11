package javaswing;
import javax.swing.*;

public class JavaSwing {
    public static void main(String[] args) {
        GUI gui = new GUI();
    }
    
}

class GUI extends JFrame{
    JLabel lnama = new JLabel("Nama Lengkap");
    final JTextField fnama = new JTextField(29);
    
    JLabel ljekel = new JLabel("Jenis Kelamin");
    JRadioButton rblaki = new JRadioButton("Laki-Laki");
    JRadioButton rbperempuan = new JRadioButton("Perempuan");
    
    JLabel lalamat = new JLabel("Alamat");
    final JTextField falamat = new JTextField(100);
    
    JLabel llaptop = new JLabel("Pilih Laptop");
    String[] namalaptop = {"Asus TUF","Asus ROG", "Acer Nitro 5", "HP Pavillion", "Acer Predator"};
    JComboBox cmlaptop = new JComboBox(namalaptop);
    
    JLabel lupgrade = new JLabel("Upgrade");
    JCheckBox cbram = new JCheckBox("Ram");
    JCheckBox cbssd = new JCheckBox("SSD");
    JCheckBox cbhdd = new JCheckBox("HDD");
    
    JLabel lsyarat = new JLabel("Persetujuan");
    JRadioButton rbsyarat = new JRadioButton("Dengan ini saya menyetujui untuk membeli laptop ini dan mengisi data diri saya dengan benar");
    
    JButton bbeli = new JButton("Beli");
    
    public GUI(){
        setTitle("Arc Computer");
        setSize(700,300);
        
        ButtonGroup group = new ButtonGroup();
        group.add(rblaki);
        group.add(rbperempuan);
        group.add(rbsyarat);
        
        setLayout(null);
        add(lnama);
        add(fnama);
        add(lalamat);
        add(falamat);
        add(ljekel);
        add(rblaki);
        add(rbperempuan);
        add(llaptop);
        add(cmlaptop);
        add(lupgrade);
        add(cbram);
        add(cbssd);
        add(cbhdd);
        add(lsyarat);
        add(rbsyarat);
        add(bbeli);
        
        lnama.setBounds(10,10,150,20);
        fnama.setBounds(130,10,160,25);
        lalamat.setBounds(10,40,150,20);
        falamat.setBounds(130,40,160,70);
        ljekel.setBounds(10,110,120,20);
        rblaki.setBounds(130,110,100,20);
        rbperempuan.setBounds(230,110,100,20);
        llaptop.setBounds(380,10,150,20);
        cmlaptop.setBounds(500,10,120,20);
        lupgrade.setBounds(380,40,120,20);
        cbram.setBounds(500,40,120,20);
        cbssd.setBounds(500,65,120,20);
        cbhdd.setBounds(500,90,120,20);
        cbram.setBounds(500,40,120,20);
        lsyarat.setBounds(10,180,100,20);
        rbsyarat.setBounds(130,180,700,20);
        bbeli.setBounds(290,230,100,30);
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}

