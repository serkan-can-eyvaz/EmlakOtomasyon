package GUI;

import GUI_ACTİON.Login_GUI_ACTİON;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ManagerPanel_GUI {

    public ManagerPanel_GUI()
    {
        build();
    }
    public void build()
    {
        this.getPanel().add(this.getKullanıcıEkle());
        this.getPanel().add(this.getIlanGüncelle());
        this.getPanel().add(this.getIlanEkle());
        this.getPanel().add(this.jScrollPane);
        this.getFrame().add(this.getPanel());
    }
    String[][] data=
            {
                    {"1","Serkan ","EYVAZ", "11111111111", "00000000000"},
                    {"0","Elif","OYMAK", "11117111111", "150"},
                    {"0", "Muhsin","BİNEN", "0178", "22222222222"}
            };
    String[] tabloAdi={"YETKİ","AD ","SOYAD","TC","TELEFON"};
    DefaultTableModel model =new DefaultTableModel (data,tabloAdi);
    JTable table=new JTable(model);
    JScrollPane jScrollPane=new JScrollPane(table);
    JFrame frame;
    JPanel panel;
    JButton ilanEkle;
    JButton ilanGüncelle;
    JButton kullanıcıEkle;


    public JFrame getFrame() {
        if (this.frame==null)
        {
            frame=new JFrame("ADMİN PANELİ");
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

    public JButton getIlanEkle() {
        if (this.ilanEkle==null)
        {
            ilanEkle=new JButton("İLAN EKLE");
            ilanEkle.addActionListener(new Login_GUI_ACTİON(this));
        }
        return ilanEkle;
    }

    public void setIlanEkle(JButton ilanEkle) {
        this.ilanEkle = ilanEkle;
    }

    public JButton getIlanGüncelle() {
        if (this.ilanGüncelle==null)
        {
            ilanGüncelle=new JButton("İLAN GÜNCELLE");
            ilanGüncelle.addActionListener(new Login_GUI_ACTİON(this));
        }
        return ilanGüncelle;
    }

    public void setIlanGüncelle(JButton ilanGüncelle) {
        this.ilanGüncelle = ilanGüncelle;
    }

    public JButton getKullanıcıEkle() {
        if (this.kullanıcıEkle==null)
        {
            kullanıcıEkle=new JButton("SİSTEM DURUMU");
            kullanıcıEkle.addActionListener(new Login_GUI_ACTİON(this));
        }
        return kullanıcıEkle;
    }

    public void setKullanıcıEkle(JButton kullanıcıEkle) {
        this.kullanıcıEkle = kullanıcıEkle;
    }
}
