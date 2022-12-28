package GUI;

import GUI_ACTİON.Login_GUI_ACTİON;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class uyeKaydi_GUI {

    public uyeKaydi_GUI()
    {
        build();
    }
    public void build()
    {
        this.getPanel().add(this.jScrollPane);
        this.getFrame().add(this.getPanel());
    }

    String[][] data=
            {
                    {"1","SERKAN CAN","EYVAZ", "0000112546","764618684","1"},
                    {"2","MUHSİN ","BİNEN", "456231987","72676387182", "1"},
                    {"3", "Elif ","OYMAK", "4562378925", "72637121618","0"}
            };
    String[] tabloAdi={"ID","AD","SOYAD"," TC","TELEFON ","YETKİ DURUMU"};
    DefaultTableModel model =new DefaultTableModel (data,tabloAdi);
    JTable table=new JTable(model);
    JScrollPane jScrollPane=new JScrollPane(table);
    JFrame frame;
    JPanel panel;
    JButton uyeEkle;

    public JFrame getFrame() {
        if (this.frame==null)
        {
            frame=new JFrame("KAYITLI ÜYELER");
            frame.setSize(1000,500);
        }
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;

    }

    public JPanel getPanel() {
        if (this.panel==null)
        {
            panel=new JPanel();
        }
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public void setUyeEkle(JButton uyeEkle) {
        this.uyeEkle = uyeEkle;
    }
}
