package GUI;

import DAO.Main_DAO;
import Entites.ilan;
import GUI_ACTİON.Login_GUI_ACTİON;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Satilik_GUI {


    public Satilik_GUI() throws IOException {
            build();
        }
        public void build() throws IOException {
            this.getPanel().add(this.getSatınAl());
            this.getPanel().add(this.getIlanEkleSatılık());
            this.getPanel().add(this.getGüncelleSatılık());
            this.getPanel().add(this.getList());
            this.getFrame().add(this.getPanel());
        }

        JFrame frame;
        JPanel panel;
        JScrollPane sp;
        JList list;
        JButton satınAl;
        JButton ilanEkleSatılık;
        JButton güncelleSatılık;
        DefaultListModel model;

    public JButton getSatınAl() {
        if (this.satınAl==null)
        {
            satınAl=new JButton("SATIN AL");
            satınAl.addActionListener(new Login_GUI_ACTİON(this));
            satınAl.setBounds(50,20,100,30);
        }
        return satınAl;
    }

    public void setSatınAl(JButton satınAl) {
        this.satınAl = satınAl;
    }

    public JButton getIlanEkleSatılık() {
        if (this.ilanEkleSatılık==null)
        {
            ilanEkleSatılık=new JButton("İLAN EKLE");
            ilanEkleSatılık.addActionListener(new Login_GUI_ACTİON(this));
            ilanEkleSatılık.setBounds(180,20,100,30);
        }
        return ilanEkleSatılık;
    }

    public void setIlanEkleSatılık(JButton ilanEkleSatılık) {
        this.ilanEkleSatılık = ilanEkleSatılık;
    }

    public JButton getGüncelleSatılık() {
        if (this.güncelleSatılık==null)
        {
            güncelleSatılık=new JButton("GÜNCELLE");
            güncelleSatılık.addActionListener(new Login_GUI_ACTİON(this));
            güncelleSatılık.setBounds(310,20,100,30);
        }
        return güncelleSatılık;
    }

    public void setGüncelleSatılık(JButton güncelleSatılık) {
        this.güncelleSatılık = güncelleSatılık;

    }

    public JFrame getFrame() {
        if (this.frame==null)
        {
            frame=new JFrame();
            frame.setSize(500,500);
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
            panel.setLayout(null);
            panel.setVisible(true);
        }
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }
    public JScrollPane getSp() {
        if (this.sp==null)
        {
            sp=new JScrollPane(list);
        }
        return sp;
    }

    public void setSp(JScrollPane sp) {
        this.sp = sp;
    }
    public DefaultListModel getModel() throws IOException {
        if (this.model==null)
        {
            ilan i=new ilan();
            Main_DAO md=new Main_DAO();
            model=new DefaultListModel();
            String dosya=String.valueOf(i.getClass())+".txt";
            String [] dizi=md.getData(dosya);

            for (int j=0;j<dizi.length;j++)
            {
                this.model.addElement(dizi[j]);
                System.out.println(dizi[j]);
            }

        }
        return model;
    }
    public void setModel(DefaultListModel model) {
        this.model = model;
    }
    public JList getList() throws IOException {
        if (this.list==null)
        {
            list=new JList(this.getModel());
            list.setBounds(100,100,300,300);
        }
        return list;
    }

    public void setList(JList list) {
        this.list = list;
    }

}
