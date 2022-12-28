package GUI;

import GUI_ACTİON.Login_GUI_ACTİON;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Kiralık_GUI {
    public Kiralık_GUI()
    {
        build();
    }
    public void build()
    {

        this.getPanel().add(this.jScrollPane);
        this.getPanel().add(this.getKirala());
        this.getPanel().add(this.getIlanEkleKiralık());
        this.getPanel().add(this.getGüncelleKiralık());
        this.getFrame().add(this.getPanel());
    }

    String[][] data=
            {
                    {"1","MÜSTAKİL","150m²", "4+1", "200", "DOĞALGAZ", "YOK","4000"},
                    {"2","APARTMAN","130m²", "5+1", "150", "MERKEZİ ISITMA", "YOK","7500"},
                    {"3", "DUBLEX","200m²", "6+2", "MERKEZİ ISITMA", "30", "VAR","9750"}
            };
    String[] tabloAdi={"ID","KONUT TİPİ","ALAN","ODA SAYISI","ISINMA SİSTEMİ","EŞYA DURUMU","FİYAT"};
    DefaultTableModel model =new DefaultTableModel (data,tabloAdi);
    JTable table=new JTable(model);
    JScrollPane jScrollPane=new JScrollPane(table);
    JFrame frame;
    JPanel panel;
    JButton kirala;
    JButton ilanEkleKiralık;
    JButton güncelleKiralık;

    public JButton getKirala() {
        if (this.kirala==null)
        {
            kirala=new JButton("EVİ KİRALA");
            kirala.addActionListener(new Login_GUI_ACTİON(this));
        }
        return kirala;
    }

    public void setKirala(JButton kirala) {
        this.kirala = kirala;
    }

    public JButton getIlanEkleKiralık() {
        if (this.ilanEkleKiralık==null)
        {
            ilanEkleKiralık=new JButton("İLAN EKLE");
            ilanEkleKiralık.addActionListener(new Login_GUI_ACTİON(this));
        }
        return ilanEkleKiralık;
    }

    public void setIlanEkleKiralık(JButton ilanEkleKiralık) {
        this.ilanEkleKiralık = ilanEkleKiralık;
    }

    public JButton getGüncelleKiralık() {
        if (this.güncelleKiralık==null)
        {
            güncelleKiralık=new JButton("GÜNCELLE");
            güncelleKiralık.addActionListener(new Login_GUI_ACTİON(this));
        }
        return güncelleKiralık;
    }

    public void setGüncelleKiralık(JButton güncelleKiralık) {
        this.güncelleKiralık = güncelleKiralık;
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

    public JFrame getFrame() {
        if (this.frame==null)
        {
            frame=new JFrame("KİRALIK EVLER");
            frame.setSize(1000,500);
        }
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }
}
