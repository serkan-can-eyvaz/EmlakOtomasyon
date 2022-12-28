package GUI;

import GUI_ACTİON.Login_GUI_ACTİON;

import javax.swing.*;

public class Manager_GUI {
    private JFrame frame;
    private JPanel panel;
    private JLabel managerLabel;
    private JTextField managerField;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JButton Loginbutton;

    public Manager_GUI()
    {
        build();
    }

    public void build()
    {
        this.getPanel().add(getManagerLabel());
        this.getPanel().add(getManagerField());
        this.getPanel().add(getPasswordLabel());
        this.getPanel().add(getPasswordField());
        this.getPanel().add(getLoginbutton());
        this.getFrame().add(this.getPanel());
    }

    public JFrame getFrame() {
        if(this.frame==null)
        {
            frame=new JFrame("YETKİLİ GİRİŞİ");
            frame.setSize(1000,500);
        }
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JPanel getPanel() {
        if(this.panel==null)
        {
            panel=new JPanel();
        }
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JLabel getManagerLabel() {
        if(this.managerLabel==null)
        {
            managerLabel=new JLabel("KULLANICI ADI:");
        }
        return managerLabel;
    }

    public void setManagerLabel(JLabel managerLabel) {
        this.managerLabel = managerLabel;
    }

    public JTextField getManagerField() {
        if(this.managerField==null)
        {
            managerField=new JTextField(20);
        }
        return managerField;
    }

    public void setManagerField(JTextField managerField) {
        this.managerField = managerField;
    }

    public JLabel getPasswordLabel() {
        if(this.passwordLabel==null)
        {
            passwordLabel=new JLabel("PASSWORD:");
        }
        return passwordLabel;
    }

    public void setPasswordLabel(JLabel passwordLabel) {
        this.passwordLabel = passwordLabel;
    }

    public JPasswordField getPasswordField() {
        if(this.passwordField==null)
        {
            passwordField=new JPasswordField(20);
        }
        return passwordField;
    }

    public void setPasswordField(JPasswordField passwordField) {
        this.passwordField = passwordField;
    }

    public JButton getLoginbutton() {
        if(this.Loginbutton==null)
        {
            Loginbutton=new JButton("Login");
            Loginbutton.addActionListener(new Login_GUI_ACTİON(this));
        }
        return Loginbutton;
    }

    public void setLoginbutton(JButton loginbutton) {
        Loginbutton = loginbutton;
    }
}
