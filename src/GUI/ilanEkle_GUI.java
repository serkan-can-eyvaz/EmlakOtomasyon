package GUI;

import GUI_ACTİON.Login_GUI_ACTİON;

import javax.swing.*;

public class ilanEkle_GUI {


    public  void  build()
    {

        this.getPanel().add(this.getLabel1());
        this.getPanel().add(this.getTextFieldid());
        this.getPanel().add(this.getLabel2());
        this.getPanel().add(this.getTextFieldkonuttipi());
        this.getPanel().add(this.getLabel3());
        this.getPanel().add(this.getTextFieldalan());
        this.getPanel().add(this.getLabel4());
        this.getPanel().add(this.getTextFieldodasayisi());
        this.getPanel().add(this.getLabel5());
        this.getPanel().add(this.getTextFieldısınma());
        this.getPanel().add(this.getLabel6());
        this.getPanel().add(this.getTextFieldyapımyılı());
        this.getPanel().add(this.getLabel7());
        this.getPanel().add(this.getTextFieldfiyat());
        this.getPanel().add(this.getKaydet());
        this.getFrame().add(this.getPanel());
    }
    public ilanEkle_GUI()
    {
        build();
    }
    JFrame frame;
    JPanel panel;
    JButton kaydet;
    JLabel label1;
    JTextField textFieldid;
    JLabel label2;
    JTextField textFieldkonuttipi;
    JLabel label3;
    JTextField textFieldyapımyılı;
    JLabel label4;
    JTextField textFieldısınma;
    JLabel label5;
    JTextField textFieldalan;
    JLabel label6;
    JTextField textFieldfiyat;
    JLabel label7;
    JTextField textFieldodasayisi;

    public JFrame getFrame() {
        if (this.frame==null)
        {
            frame=new JFrame("İLAN");
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

    public JLabel getLabel1() {
        if (this.label1==null)
        {
            label1=new JLabel("İD");
        }
        return label1;
    }

    public void setLabel1(JLabel label1) {
        this.label1 = label1;
    }

    public JTextField getTextFieldid() {
        if (this.textFieldid==null)
        {
            textFieldid=new JTextField(20);
        }
        return textFieldid;
    }

    public void setTextFieldid(JTextField textFieldid) {
        this.textFieldid = textFieldid;
    }

    public JLabel getLabel2() {
        if (this.label2==null)
        {
            label2=new JLabel("KONUT TİPİ");
        }
        return label2;
    }

    public void setLabel2(JLabel label2) {
        this.label2 = label2;
    }

    public JTextField getTextFieldkonuttipi() {
        if (this.textFieldkonuttipi==null)
        {
            textFieldkonuttipi=new JTextField(20);
        }
        return textFieldkonuttipi;
    }

    public void setTextFieldkonuttipi(JTextField textFieldkonuttipi) {
        this.textFieldkonuttipi = textFieldkonuttipi;
    }

    public JLabel getLabel3() {
        if (this.label3==null)
        {
            label3=new JLabel("ALAN");
        }
        return label3;
    }

    public void setLabel3(JLabel label3) {
        this.label3 = label3;
    }

    public JTextField getTextFieldyapımyılı() {
        if (this.textFieldyapımyılı==null)
        {
            textFieldyapımyılı=new JTextField(20);
        }
        return textFieldyapımyılı;
    }

    public void setTextFieldyapımyılı(JTextField textFieldyapımyılı) {
        this.textFieldyapımyılı = textFieldyapımyılı;
    }

    public JLabel getLabel4() {
        if (this.label4==null)
        {
            label4=new JLabel("ODA SAYISI");
        }
        return label4;
    }

    public void setLabel4(JLabel label4) {
        this.label4 = label4;
    }

    public JTextField getTextFieldısınma() {
        if (this.textFieldısınma==null)
        {
            textFieldısınma=new JTextField(20);
        }
        return textFieldısınma;
    }

    public void setTextFieldısınma(JTextField textFieldısınma) {
        this.textFieldısınma = textFieldısınma;
    }

    public JLabel getLabel5() {
        if (this.label5==null)
        {
            label5=new JLabel("ISINMA");
        }
        return label5;
    }

    public void setLabel5(JLabel label5) {
        this.label5 = label5;
    }

    public JTextField getTextFieldalan() {
        if (this.textFieldalan==null)
        {
            textFieldalan=new JTextField(20);
        }
        return textFieldalan;
    }

    public void setTextFieldalan(JTextField textFieldalan) {
        this.textFieldalan = textFieldalan;
    }

    public JLabel getLabel6() {
        if (this.label6==null)
        {
            label6=new JLabel("YAPIM YILI");
        }
        return label6;
    }

    public void setLabel6(JLabel label6) {
        this.label6 = label6;
    }

    public JTextField getTextFieldfiyat() {
        if (this.textFieldfiyat==null)
        {
            textFieldfiyat=new JTextField(20);
        }
        return textFieldfiyat;
    }

    public void setTextFieldfiyat(JTextField textFieldfiyat) {
        this.textFieldfiyat = textFieldfiyat;
    }

    public JLabel getLabel7() {
        if (this.label7==null)
        {
            label7=new JLabel("FİYAT");
        }
        return label7;
    }

    public void setLabel7(JLabel label7) {
        this.label7 = label7;
    }

    public JTextField getTextFieldodasayisi() {
        if (this.textFieldodasayisi==null)
        {
            textFieldodasayisi=new JTextField(20);
        }
        return textFieldodasayisi;
    }

    public void setTextFieldodasayisi(JTextField textFieldodasayisi) {
        this.textFieldodasayisi = textFieldodasayisi;
    }

    public JButton getKaydet() {
        if (this.kaydet==null)
        {
            kaydet=new JButton("KAYDET");
            kaydet.addActionListener(new Login_GUI_ACTİON(this));
        }
        return kaydet;
    }

    public void setKaydet(JButton kaydet) {
        this.kaydet = kaydet;
    }
}
