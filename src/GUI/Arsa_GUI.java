package GUI;

import GUI_ACTİON.Login_GUI_ACTİON;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Arsa_GUI {
    public Arsa_GUI()
    {
        build();
    }
    public void build()
    {
        this.getPanel().add(this.getArsaSatinAl());
        this.getPanel().add(this.getIlanEkleArsa());
        this.getPanel().add(this.getGüncelleArsa());
        this.getPanel().add(this.jScrollPane);
        this.getFrame().add(this.getPanel());
    }

                                                                                                                                                                                                                                                                                                                                                    String[][] data=
                                                                                                                                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                                                                                                                                                    {"1","MÜSTAKİL","150m²", "4+1", "200", "DOĞALGAZ", "2015","4000"},
                                                                                                                                                                                                                                                                                                                                                                    {"2","APARTMAN","130m²", "5+1", "150", "MERKEZİ ISITMA", "2018","7500"},
                                                                                                                                                                                                                                                                                                                                                                    {"3", "TRİPLEX","200m²", "6+2", "MERKEZİ ISITMA", "30", "2020","9750"}
                                                                                                                                                                                                                                                                                                                                                            };
    String[] tabloAdi={"ID","KONUT TİPİ","ALAN","ODA SAYISI","ISINMA SİSTEMİ","YAPIM YILI","FİYAT"};
    DefaultTableModel model =new DefaultTableModel (data,tabloAdi);
    JTable table=new JTable(model);
    JScrollPane jScrollPane=new JScrollPane(table);
    JFrame frame;
    JPanel panel;
    JButton arsaSatinAl;
    JButton ilanEkleArsa;
    JButton güncelleArsa;

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

    public JButton getArsaSatinAl() {
        if (this.arsaSatinAl==null)
        {
            arsaSatinAl=new JButton("SATIN AL");
            arsaSatinAl.addActionListener(new Login_GUI_ACTİON(this));
        }
        return arsaSatinAl;
    }

    public void setArsaSatinAl(JButton arsaSatinAl) {
        this.arsaSatinAl = arsaSatinAl;
    }

    public JButton getIlanEkleArsa() {
        if (this.ilanEkleArsa==null)
        {
            ilanEkleArsa=new JButton("İLAN EKLE");
            ilanEkleArsa.addActionListener(new Login_GUI_ACTİON(this));
        }
        return ilanEkleArsa;
    }

    public void setIlanEkleArsa(JButton ilanEkleArsa) {
        this.ilanEkleArsa = ilanEkleArsa;
    }

    public JButton getGüncelleArsa() {
        if (this.güncelleArsa==null)
        {
            güncelleArsa=new JButton("GÜNCELLE");
            güncelleArsa.addActionListener(new Login_GUI_ACTİON(this));
        }
        return güncelleArsa;
    }

    public void setGüncelleArsa(JButton güncelleArsa) {
        this.güncelleArsa = güncelleArsa;
    }

    public JFrame getFrame() {
        if (this.frame==null)
        {
            frame=new JFrame("SATILIK ARSALAR");
            frame.setSize(1000,500);
        }
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }
}
