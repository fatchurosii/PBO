
package modul6npm06935;

import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Komponen extends JFrame{


    
    JLabel nama = new JLabel("Nama         :");
    JLabel npm = new JLabel("NPM          :");
    JLabel tlp = new  JLabel("Telp         :");
    JLabel jk = new JLabel("Jenis Kelamin :");
    JLabel ttl = new JLabel("TTL          :");
    JLabel hoby = new JLabel("Hobby       :");
    JLabel alamat = new JLabel("Alamat    :");
    JTextField namA = new JTextField();
    JTextField nPm = new JTextField();
    JTextField Telp = new JTextField();

    JRadioButton pr = new JRadioButton("Pria");
    JRadioButton wt = new JRadioButton("Wanita");
    
    JTextField Ttl = new JTextField();
    String angka[]={
        "20","21","22","23","24","25","26","27","28"
    };
    JComboBox ank = new JComboBox(angka);
    String bulan[]={
        "Januari","Februari","Maret","April","Mei"
    };
    JComboBox bln = new JComboBox(bulan);
    String tahun[] ={
        "1998","1999","2000","2001","2002"
    };
    JComboBox thn = new JComboBox(tahun);
    
    JCheckBox J1 = new JCheckBox("Ngoding");
    JCheckBox J2 = new JCheckBox("Design");
    JCheckBox J3 = new JCheckBox("Game");
    JCheckBox J4 = new JCheckBox("Baca Novel");
    JCheckBox J5 = new JCheckBox("Makan Bakso");
    JCheckBox J6 = new JCheckBox("Dll");
    
    JTextArea alm = new JTextArea();
    
    JButton insert = new JButton("Insert");
    
    JButton Cancel = new JButton("Cancel");
}
