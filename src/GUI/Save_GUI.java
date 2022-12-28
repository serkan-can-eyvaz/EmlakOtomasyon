package GUI;

import GUI_ACTİON.Login_GUI_ACTİON;

import javax.swing.*;
import java.awt.*;
import java.util.DoubleSummaryStatistics;

public class Save_GUI {

    private JFrame jsFrame;
    private  JPanel jsPanel;
    private JLabel namelabel;
    private JTextField nameField;
    private  JLabel surnameLabel;
    private JTextField surTextField;
    private JLabel emaillabel;
    private JTextField emailtextfield;
    private  JLabel passowrodlabel;
    private JPasswordField passwordField;
    private JButton jsbutton;
    private ImageIcon icon;
    private Image image;
    private JLabel label;

    public Save_GUI()
    {
        build();
    }
    public void build()
    {
        this.getJsPanel().add(this.getNamelabel());
        this.getJsPanel().add(this.getNameField());
        this.getJsPanel().add(this.getSurnameLabel());
        this.getJsPanel().add(this.getSurTextField());
        this.getJsPanel().add(this.getEmaillabel());
        this.getJsPanel().add(this.getEmailtextfield());
        this.getJsPanel().add(this.getPassowrodlabel());
        this.getJsPanel().add(this.getPasswordField());
        this.getJsPanel().add(this.getJsbutton());
        this.getJsPanel().add(this.getLabel());
        this.getJsFrame().add(this.getJsPanel());
    }

    public ImageIcon getIcon() {
        if(this.icon==null)
        {
            icon=new ImageIcon("C:\\Users\\serki\\OneDrive\\Masaüstü\\Yazılım 2.Sınıf\\Nesne Yönelik Programlama\\EmlakOtomasyon\\GÖRSEL\\main3.jpg");
        }
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }

    public Image getImage() {
        if(this.image==null)
        {
            this.image=getIcon().getImage().getScaledInstance(1000,500,Image.SCALE_SMOOTH);
        }
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public JLabel getLabel() {
        if (this.label==null)
        {
            label=new JLabel(new ImageIcon(getImage()));
        }
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }
    public JFrame getJsFrame() {
        if (this.jsFrame==null)
        {
            jsFrame=new JFrame("KAYIT OL");
            jsFrame.setSize(1000,500);
        }
        return jsFrame;
    }

    public void setJsFrame(JFrame jsFrame) {
        this.jsFrame = jsFrame;
    }

    public JPanel getJsPanel() {
       if (this.jsPanel==null)
       {
           jsPanel=new JPanel();
       }
       return jsPanel;
    }

    public void setJsPanel(JPanel jsPanel) {
        this.jsPanel = jsPanel;
    }

    public JLabel getNamelabel() {
        if (this.namelabel==null)
        {
            namelabel=new JLabel("AD");
        }
        return namelabel;
    }

    public void setNamelabel(JLabel namelabel) {
        this.namelabel = namelabel;
    }

    public JTextField getNameField() {
        if (this.nameField==null)
        {
            nameField=new JTextField(20);
        }
        return nameField;
    }

    public void setNameField(JTextField nameField) {
        this.nameField = nameField;
    }

    public JLabel getSurnameLabel() {
        if(this.surnameLabel==null){
            surnameLabel=new JLabel("SOYAD");
        }
        return surnameLabel;
    }

    public void setSurnameLabel(JLabel surnameLabel) {
        this.surnameLabel = surnameLabel;
    }

    public JTextField getSurTextField() {
        if(this.surTextField==null){
            this.surTextField=new JTextField(20);
        }
        return surTextField;
    }

    public void setSurTextField(JTextField surTextField) {
        this.surTextField = surTextField;
    }

    public JLabel getEmaillabel() {
        if(this.emaillabel==null)
        {
            emaillabel=new JLabel("Email:");
        }
        return emaillabel;
    }

    public void setEmaillabel(JLabel emaillabel) {
        this.emaillabel = emaillabel;
    }

    public JTextField getEmailtextfield() {
        if (this.emailtextfield==null)
        {
            emailtextfield=new JTextField(20);
        }
        return emailtextfield;
    }

    public void setEmailtextfield(JTextField emailtextfield) {
        this.emailtextfield = emailtextfield;
    }

    public JLabel getPassowrodlabel() {
        if (this.passowrodlabel==null)
        {
            passowrodlabel=new JLabel("ŞİFRE");
        }
        return passowrodlabel;
    }

    public void setPassowrodlabel(JLabel passowrodlabel) {
        this.passowrodlabel = passowrodlabel;
    }

    public JPasswordField getPasswordField() {
        if (this.passwordField==null)
        {
            passwordField=new JPasswordField(20);
        }
        return passwordField;
    }

    public void setPasswordField(JPasswordField passwordField) {
        this.passwordField = passwordField;
    }

    public JButton getJsbutton() {
        if (this.jsbutton==null)
        {
            jsbutton=new JButton("KAYDOL");
            jsbutton.addActionListener(new Login_GUI_ACTİON(this));
        }
        return jsbutton;
    }

    public void setJsbutton(JButton jsbutton) {
        this.jsbutton = jsbutton;
    }

}
