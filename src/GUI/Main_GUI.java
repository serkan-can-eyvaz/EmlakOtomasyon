package GUI;

import GUI_ACTİON.Login_GUI_ACTİON;

import javax.swing.*;
import java.awt.*;

public class Main_GUI {
    public Main_GUI()
    {
        build();
    }
    public  void build()
    {

        this.getPanel().add(this.getKiralikBtn());
        this.getPanel().add(this.getSatilikBtn());
        this.getPanel().add(this.getArsaBtn());
        this.getPanel().add(this.getEmlakBilgi());
        this.getPanel().add(this.getUyeButon());
        this.getPanel().add(this.getLabel());
        this.getFrame().add(this.getPanel());
    }

    private JLabel label;
    private ImageIcon image;
    private Image imageImage;
    JButton kiralikBtn;
    JButton satilikBtn;
    JButton arsaBtn;
    JButton emlakBilgi;
    JButton uyeButon;

    JPanel panel;
    JFrame frame;


    public JLabel getLabel() {
        if(this.label==null){

            this.label=new JLabel(new ImageIcon(getImageImage()));
            this.label.setSize(500,500);
        }
        return label;
    }

    public ImageIcon getImage() {
        if (this.image==null)
        {
            this.image=new ImageIcon("C:\\Users\\serki\\OneDrive\\Masaüstü\\Yazılım 2.Sınıf\\Nesne Yönelik Programlama\\EmlakOtomasyon\\GÖRSEL\\main.jpg");
        }
        return image;
    }

    public void setImageIcon(ImageIcon imageIcon) {
        this.image = imageIcon;
    }

    public Image getImageImage() {
        if (this.imageImage==null)
        {
            this.imageImage= getImage().getImage().getScaledInstance(500,500,Image.SCALE_SMOOTH);
        }
        return imageImage;
    }

    public void setImage(Image image) {
        this.imageImage = image;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public JButton getKiralikBtn() {
        if (this.kiralikBtn==null)
        {
            kiralikBtn=new JButton("KİRALIK İLANLAR");
            kiralikBtn.setBounds(400,450,20,20);
            kiralikBtn.addActionListener(new Login_GUI_ACTİON(this));
        }
        return kiralikBtn;
    }

    public void setKiralikBtn(JButton kiralikBtn) {
        this.kiralikBtn = kiralikBtn;
    }

    public JButton getSatilikBtn() {
        if (this.satilikBtn==null)
        {
            satilikBtn=new JButton("SATILIK İLANLAR");
            satilikBtn.addActionListener(new Login_GUI_ACTİON(this));
        }
        return satilikBtn;
    }

    public void setSatilikBtn(JButton satilikBtn) {
        this.satilikBtn = satilikBtn;
    }

    public JButton getArsaBtn() {
        if(this.arsaBtn==null)
        {
            arsaBtn=new JButton("ARSA İLANLARI");
            arsaBtn.addActionListener(new Login_GUI_ACTİON(this));
        }
        return arsaBtn;
    }

    public void setArsaBtn(JButton arsaBtn) {
        this.arsaBtn = arsaBtn;
    }

    public JButton getEmlakBilgi() {
        if (this.emlakBilgi==null)
        {
            emlakBilgi=new JButton("EMLAK HİZMET KAYDI");
            emlakBilgi.addActionListener(new Login_GUI_ACTİON(this));
        }
        return emlakBilgi;
    }

    public void setEmlakBilgi(JButton emlakBilgi) {
        this.emlakBilgi = emlakBilgi;
    }

    public JButton getUyeButon() {
        if (this.uyeButon==null)
        {
            uyeButon=new JButton("ÜYE KAYDI");
            uyeButon.addActionListener(new Login_GUI_ACTİON(this));
        }
        return uyeButon;
    }

    public void setUyeButon(JButton uyeButon) {
        this.uyeButon = uyeButon;
    }

    public JPanel getPanel() {
        if (this.panel==null)
        {
            panel=new JPanel();
            panel.setBounds(0,0,1000,500);
           // panel.setLayout(null);
            //panel.setBackground(Color.blue);
        }
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JFrame getFrame() {
        if (this.frame==null)
        {
            frame=new JFrame("HOŞGELDİNİZ");
            frame.setLayout(null);
            frame.setSize(500,500);

        }
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }


}
