package modul6npm06935;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.*;

public class GUI extends Komponen {

    public GUI() {
        npm.setBounds(20, 50, 200, 30);
        npm.setFont(new Font("Consolas", Font.BOLD, 16));
        nPm.setBounds(200, 50, 200, 25);
        nama.setBounds(20, 100, 200, 30);
        nama.setFont(new Font("Consolas", Font.BOLD, 16));
        namA.setBounds(200, 100, 200, 25);
        tlp.setBounds(20, 150, 200, 30);
        tlp.setFont(new Font("Consolas", Font.BOLD, 16));
        Telp.setBounds(200, 150, 200, 25);
        
        jk.setBounds(20, 200, 200, 30);
        jk.setFont(new Font("Consolas", Font.BOLD, 16));
        pr.setBounds(200, 200, 100, 25);
        wt.setBounds(300, 200, 100, 25);
        ttl.setBounds(20, 250, 200, 30);
        ttl.setFont(new Font("Consolas", Font.BOLD, 16));
        Ttl.setBounds(200, 250, 200, 25);
        ank.setBounds(450, 250, 60, 30);
        bln.setBounds(550, 250, 80, 30);
        thn.setBounds(650, 250, 100, 30);
        hoby.setBounds(20, 300, 200, 25);
        hoby.setFont(new Font("Consolas", Font.BOLD, 16));
        J1.setBounds(200, 300, 150, 25);
        J2.setBounds(200, 350, 150, 25);
        J3.setBounds(200, 400, 150, 25);
        J4.setBounds(400, 300, 150, 25);
        J5.setBounds(400, 350, 150, 25);
        J6.setBounds(400, 400, 150, 25);
        
        alamat.setBounds(20, 450, 200, 30);
        alamat.setFont(new Font("Consolas", Font.BOLD, 16));
        alm.setBounds(200, 450, 500, 100);
        insert.setBounds(200, 570, 100, 25);

//       insert.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showOptionDialog(, 
//                        "",                
//                        "Head", JOptionPane.INFORMATION_MESSAGE);
//            }
//        });
        insert.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                String hsl = null;
                if (pr.isSelected()) {
                    hsl = pr.getText();
                } else if (wt.isSelected()) {
                    hsl = wt.getText();
                }
                JOptionPane.showMessageDialog(null,
                        "NPM :" + nPm.getText() + "\n" + "Nama :" + namA.getText() + "\n" + "Telpon" + Telp.getText()
                        + "\n" + "Jenis Kelamin    :" + hsl + "\n" + "Tempat Lahir :" + Ttl.getText() + "\n"
                        + "Tanggal   :" + ank.getSelectedItem() + "\n" + "Bulan   :" + bln.getSelectedItem() + "\n"
                        + "Tahun :" + thn.getSelectedItem() + "\n" + "Hoby :   " + Arrays.toString(ho()) + "\n" + "ALamat   :"
                        + alm.getText(),
                        "Head", JOptionPane.INFORMATION_MESSAGE);
                
            }
        });
        Cancel.setBounds(400, 570, 100, 25);
        Cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        add(nPm);
        add(npm);
        add(Telp);
        add(tlp);
        add(nama);
        add(namA);
        add(jk);
        add(pr);
        add(wt);
        add(ttl);
        add(Ttl);
        add(ank);
        add(bln);
        add(thn);
        add(hoby);
        add(J1);
        add(J2);
        add(J3);
        add(J4);
        add(J5);
        add(J6);
        add(alamat);
        add(alm);
        add(insert);
        add(Cancel);
        
        setLayout(null);
        setVisible(true);
        setSize(930, 700);
    }
    
    public String[] ho() {
        String hobi[] = {
            (J1.isSelected() == true ? J1.getText() : ""),
            (J2.isSelected() == true ? J2.getText() : ""),
            (J3.isSelected() == true ? J3.getText() : ""),
            (J4.isSelected() == true ? J4.getText() : ""),
            (J5.isSelected() == true ? J5.getText() : ""),
            (J6.isSelected() == true ? J6.getText() : "")
        };
        
        return hobi;
    }
    
}
