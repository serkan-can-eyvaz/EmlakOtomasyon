package GUI;

import GUI_ACTİON.Login_GUI_ACTİON;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Login_GUI {
    private JFrame frame;
    private JPanel panel;
    private JLabel userlabel;
    private JTextField userField;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JButton Loginbutton;
    private JButton kayıtbutton;
    private ImageIcon icon;
    private Image image;
    private JLabel label;

    public Login_GUI()
    {
        build();
    }
    public void build()
    {
        this.getPanel().add(this.getUserlabel());
        this.getPanel().add(this.getUserField());
        this.getPanel().add(this.getPasswordLabel());
        this.getPanel().add(this.getPasswordField());
        this.getPanel().add(this.getLoginbutton());
        this.getPanel().add(this.getKayıtbutton());
        this.getPanel().add(this.getLabel());
        this.getFrame().setContentPane(this.getPanel());
    }

    public ImageIcon getIcon() {
        if(this.icon==null)
        {
            icon=new ImageIcon("C:\\Users\\serki\\OneDrive\\Masaüstü\\Yazılım 2.Sınıf\\Nesne Yönelik Programlama\\EmlakOtomasyon\\GÖRSEL\\main2.jpg");
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

    public JFrame getFrame() {
        if (this.frame==null)
        {
            frame=new JFrame("LOGIN:");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setSize(450,450);
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
           // panel.setLayout(new GridLayout(2,2));
        }
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JLabel getUserlabel() {
       if (this.userlabel==null)
       {
           userlabel=new JLabel("Kullanıcı Adı:");

       }
       return  userlabel;
    }

    public void setUserlabel(JLabel userlabel) {
        this.userlabel = userlabel;
    }

    public  JTextField getUserField() {
        if (this.userField==null)
        {
            userField=new JTextField(5);
        }
        return  userField;
    }

    public void setUserField(JTextField userField) {
        this.userField = userField;
    }

    public JLabel getPasswordLabel() {
        if (this.passwordLabel==null)
        {
            passwordLabel=new JLabel("Password:");

        }
        return  passwordLabel;
    }

    public void setPasswordLabel(JLabel passwordLabel) {
        this.passwordLabel = passwordLabel;
    }

    public JPasswordField getPasswordField() {
        if (this.passwordField==null)
        {
            passwordField=new JPasswordField(5);
        }
        return  passwordField;
    }

    public void setPasswordField(JPasswordField passwordField) {
        this.passwordField = passwordField;
    }

    public JButton getLoginbutton() {
        if (this.Loginbutton==null)
        {
            Loginbutton=new JButton("Login");
            Loginbutton.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    Loginbutton.setBackground(Color.GREEN);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    Loginbutton.setBackground(null);
                }
            });
            this.Loginbutton.addActionListener(new Login_GUI_ACTİON(this));
        }
        return  Loginbutton;
    }

    public void setLoginbutton(JButton loginbutton) {
        this.Loginbutton=loginbutton;
    }

    public JButton getKayıtbutton() {
        if (this.kayıtbutton==null)
        {
            kayıtbutton=new JButton("Kayıt ol");
            kayıtbutton.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    kayıtbutton.setBackground(Color.GREEN);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    kayıtbutton.setBackground(null);
                }
            });
            this.kayıtbutton.addActionListener(new Login_GUI_ACTİON(this));
        }
        return kayıtbutton;
    }

    public void setKayıtbutton(JButton kayıtbutton) {
        this.kayıtbutton = kayıtbutton;
    }
}
