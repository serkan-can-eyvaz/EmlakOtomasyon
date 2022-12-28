package GUI_ACTİON;

import DAO.Main_DAO;
import Entites.ilan;
import GUI.*;
import controller.emlakKayıt_Controller;
import controller.saveController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
public class Login_GUI_ACTİON implements ActionListener {
    saveController saveController= new saveController();
    emlakKayıt_Controller emlakKayıt_controller= new emlakKayıt_Controller();
    private SavePanel_GUI savePanel;
    private Save_GUI save_gui;
    private Login_GUI lg;
    private Main_DAO main_dao;
    private Main_GUI main_gui;
    private Kiralık_GUI kiralık_gui;
    private Satilik_GUI satilik_gui;
    private Arsa_GUI arsa_gui;
    private Manager_GUI manager_gui;
    private  ManagerPanel_GUI managerPanel_gui;
    private EmlakBilgi_GUI emlakBilgi_gui;
    private uyeKaydi_GUI uyeKaydi_gui;
    private ilanEkle_GUI ilanEkle_gui;



    public Login_GUI_ACTİON(Save_GUI save_gui)
    {
        this.save_gui=save_gui;
    }
    public Login_GUI_ACTİON(Login_GUI lg)
    {this.lg=lg;}
    public Login_GUI_ACTİON(Main_GUI main_gui)
    {
        this.main_gui=main_gui;
    }
    public Login_GUI_ACTİON(Kiralık_GUI kiralık_gui)
    {
        this.kiralık_gui=kiralık_gui;
    }
    public Login_GUI_ACTİON(Satilik_GUI satilik_gui)
    {
        this.satilik_gui=satilik_gui;
    }
    public Login_GUI_ACTİON(Arsa_GUI arsa_gui)
    {
        this.arsa_gui=arsa_gui;
    }
    public Login_GUI_ACTİON(Manager_GUI manager_gui)
    {
        this.manager_gui=manager_gui;
    }
    public Login_GUI_ACTİON(uyeKaydi_GUI uyeKaydi_gui)
    {
        this.uyeKaydi_gui=new uyeKaydi_GUI();
    }
    public  Login_GUI_ACTİON(EmlakBilgi_GUI emlakBilgi_gui)
    {
        this.emlakBilgi_gui=emlakBilgi_gui;
    }
    public Login_GUI_ACTİON(ManagerPanel_GUI managerPanel_gui)
    {
        this.managerPanel_gui=managerPanel_gui;
    }
    public  Login_GUI_ACTİON(ilanEkle_GUI ilanEkle_gui)
    {
        this.ilanEkle_gui=ilanEkle_gui;
    }


    public Save_GUI getSave_gui() {
        if (this.save_gui==null)
        {
            save_gui=new Save_GUI();
        }
        return save_gui;
    }

    public void setSave_gui(Save_GUI save_gui) {
        this.save_gui = save_gui;
    }

    public Login_GUI getLg() {
        if (this.lg==null)
        {
            lg=new Login_GUI();
        }
        return lg;
    }

    public void setLg(Login_GUI lg) {
        this.lg = lg;
    }

    public Main_DAO getMain_dao() {
        if (this.main_dao==null)
        {
            main_dao=new Main_DAO();
        }
        return main_dao;
    }

    public void setMain_dao(Main_DAO main_dao) {
        this.main_dao = main_dao;
    }

    public Main_GUI getMain_gui() {
        if (this.main_gui==null)
        {
            main_gui=new Main_GUI();
        }
        return main_gui;
    }

    public void setMain_gui(Main_GUI main_gui) {
        this.main_gui = main_gui;
    }

    public Kiralık_GUI getKiralık_gui() throws IOException {
        if (this.kiralık_gui==null)
        {
            kiralık_gui=new Kiralık_GUI();
        }
        return kiralık_gui;
    }

    public void setKiralık_gui(Kiralık_GUI kiralık_gui) {
        this.kiralık_gui = kiralık_gui;
    }

    public Satilik_GUI getSatilik_gui() throws IOException {
        if (this.satilik_gui==null)
        {
            satilik_gui=new Satilik_GUI();
        }
        return satilik_gui;
    }

    public void setSatilik_gui(Satilik_GUI satilik_gui) {
        this.satilik_gui = satilik_gui;
    }

    public Arsa_GUI getArsa_gui() {
        if(this.arsa_gui==null){
            arsa_gui=new Arsa_GUI();
        }
        return arsa_gui;
    }

    public void setArsa_gui(Arsa_GUI arsa_gui) {
        this.arsa_gui = arsa_gui;
    }

    public Manager_GUI getManager_gui() {
        if(this.manager_gui==null)
        {
            manager_gui=new Manager_GUI();
        }
        return manager_gui;
    }

    public void setManager_gui(Manager_GUI manager_gui) {
        this.manager_gui = manager_gui;
    }

    public ManagerPanel_GUI getManagerPanel_gui() {
        if (this.managerPanel_gui==null)
        {
            managerPanel_gui=new ManagerPanel_GUI();
        }
        return managerPanel_gui;
    }

    public void setManagerPanel_gui(ManagerPanel_GUI managerPanel_gui) {

        this.managerPanel_gui = managerPanel_gui;
    }

    public EmlakBilgi_GUI getEmlakBilgi_gui() {
        if (this.emlakBilgi_gui==null)
        {
            emlakBilgi_gui=new EmlakBilgi_GUI();
        }
        return emlakBilgi_gui;
    }

    public void setEmlakBilgi_gui(EmlakBilgi_GUI emlakBilgi_gui) {
        this.emlakBilgi_gui = emlakBilgi_gui;
    }

    public uyeKaydi_GUI getUyeKaydi_gui() {
        if (this.uyeKaydi_gui==null)
        {
            uyeKaydi_gui=new uyeKaydi_GUI();
        }
        return uyeKaydi_gui;
    }

    public void setUyeKaydi_gui(uyeKaydi_GUI uyeKaydi_gui) {
        this.uyeKaydi_gui = uyeKaydi_gui;
    }

    public ilanEkle_GUI getIlanEkle_gui() {
        if (this.ilanEkle_gui==null)
        {
            ilanEkle_gui= new ilanEkle_GUI();
        }
        return ilanEkle_gui;
    }

    public void setIlanEkle_gui(ilanEkle_GUI ilanEkle_gui) {
        this.ilanEkle_gui = ilanEkle_gui;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==getLg().getLoginbutton())
        {
            String text="Elif";
            System.out.println(text);
            String lamel="Serkan";
            String abc="Muhsin";
            if (getLg().getUserField().getText().equals(text) ||getLg().getUserField().getText().equals(lamel)||getLg().getUserField().getText().equals(abc))
            {
                getMain_gui().getFrame().setContentPane(getMain_gui().getPanel());
                getMain_gui().getFrame().repaint();
                getMain_gui().getFrame().setVisible(true);
            }
//            if (getLg().getUserField().getText().equals(lamel))
//            {
//
//                getMain_gui().getFrame().setContentPane(getMain_gui().getPanel());
//                getMain_gui().getFrame().repaint();
//                getMain_gui().getFrame().setVisible(true);
//            }
            else
            {
                JOptionPane.showMessageDialog(null,"HATALI GİRİŞ");
            }


        }
        else if (e.getSource()==getLg().getKayıtbutton())
        {

            getSave_gui().getJsFrame().setContentPane(getSave_gui().getJsPanel());
            getSave_gui().getJsFrame().repaint();
            getSave_gui().getJsFrame().setVisible(true);


        }
        else if (e.getSource()==getSave_gui().getJsbutton())
        {


            JOptionPane.showMessageDialog(null,"KAYIT BAŞARILI");

            saveController.build(getSave_gui());

            getSave_gui().getJsFrame().setVisible(false);

        }
        else if (e.getSource()==getMain_gui().getKiralikBtn())
        {

            try {
                getKiralık_gui().getFrame().setContentPane(getKiralık_gui().getPanel());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

            try {
                getKiralık_gui().getFrame().setVisible(true);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            try {
                getKiralık_gui().getFrame().repaint();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }


        }
        else if(e.getSource()==getMain_gui().getSatilikBtn())
        {
            try {
                getSatilik_gui().getFrame().setContentPane(getSatilik_gui().getPanel());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            try {
                getSatilik_gui().getFrame().setVisible(true);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            try {
                getSatilik_gui().getFrame().repaint();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

        }
        else if (e.getSource()==getMain_gui().getArsaBtn()) {
            getArsa_gui().getFrame().setContentPane(getArsa_gui().getPanel());
            getArsa_gui().getFrame().setVisible(true);
            getArsa_gui().getFrame().repaint();

        }
        else {
            try {
                if (e.getSource()==getKiralık_gui().getKirala())
                {
                    JOptionPane.showMessageDialog(null,"EV KİRALANDI.HAYIRLI OLSUN..");
                }
                else if (e.getSource()==getSatilik_gui().getSatınAl())
                {
                    JOptionPane.showMessageDialog(null,"EVİNİZ HAYIRLI OLSUN..");

                }else if (e.getSource()==getArsa_gui().getArsaSatinAl())
                {
                    JOptionPane.showMessageDialog(null,"ARSANIZ HAYIRLI OLSUN..");

                }
                else if(e.getSource()==getKiralık_gui().getIlanEkleKiralık())
                {
                    getManager_gui().getFrame().setContentPane(getManager_gui().getPanel());
                    getManager_gui().getFrame().setVisible(true);
                    getManager_gui().getFrame().repaint();
                }
                else if(e.getSource()==getSatilik_gui().getIlanEkleSatılık())
                {
                    getManager_gui().getFrame().setContentPane(getManager_gui().getPanel());
                    getManager_gui().getFrame().setVisible(true);
                    getManager_gui().getFrame().repaint();
                }
                else if(e.getSource()==getArsa_gui().getIlanEkleArsa())
                {
                    getManager_gui().getFrame().setContentPane(getManager_gui().getPanel());
                    getManager_gui().getFrame().setVisible(true);
                    getManager_gui().getFrame().repaint();
                }
                else if(e.getSource()==getKiralık_gui().getGüncelleKiralık())
                {

                    getManager_gui().getFrame().setContentPane(getManager_gui().getPanel());
                    getManager_gui().getFrame().setVisible(true);
                    getManager_gui().getFrame().repaint();
                }
                else if(e.getSource()==getSatilik_gui().getGüncelleSatılık())
                {
                    getManager_gui().getFrame().setContentPane(getManager_gui().getPanel());
                    getManager_gui().getFrame().setVisible(true);
                    getManager_gui().getFrame().repaint();
                }
                else if(e.getSource()==getArsa_gui().getGüncelleArsa())
                {
                    getManager_gui().getFrame().setContentPane(getManager_gui().getPanel());
                    getManager_gui().getFrame().setVisible(true);
                    getManager_gui().getFrame().repaint();
                }
                else if (e.getSource()==getManager_gui().getLoginbutton())
                {
                    String data="Serkan";
                    String veri="Elif";
                    if (getManager_gui().getManagerField().getText().equals(data))
                    {
                        getManagerPanel_gui().getFrame().setContentPane(getManagerPanel_gui().getPanel());
                        getManagerPanel_gui().getFrame().setVisible(true);
                        getManagerPanel_gui().getFrame().repaint();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"YÖNETİCİ DEğİLSİNİZ");
                    }

                }
                else if (e.getSource()==getMain_gui().getEmlakBilgi())
                {
                    getEmlakBilgi_gui().getFrame().setContentPane(getEmlakBilgi_gui().getPanel());
                    getEmlakBilgi_gui().getFrame().setVisible(true);
                    getManager_gui().getFrame().repaint();
                }
                else if (e.getSource()==getMain_gui().getUyeButon())
                {
                    getUyeKaydi_gui().getFrame().setContentPane(getUyeKaydi_gui().getPanel());
                    getUyeKaydi_gui().getFrame().setVisible(true);
                    getUyeKaydi_gui().getFrame().repaint();
                }
                else if(e.getSource()==getManagerPanel_gui().getIlanEkle())
                {

                    getIlanEkle_gui().getFrame().setContentPane(getIlanEkle_gui().getPanel());
                    getIlanEkle_gui().getFrame().setVisible(true);
                    getIlanEkle_gui().getFrame().repaint();
                }
                else if (e.getSource()==getManagerPanel_gui().getKullanıcıEkle())
                {
                    JOptionPane.showMessageDialog(null,"SİSTEM GÜNCEL");
                }
                else if (e.getSource()==getManagerPanel_gui().getIlanGüncelle())
                {
                    JOptionPane.showMessageDialog(null,"İLANLARINIZ GÜNCELLENMİŞTİR");
                }
                else if (e.getSource()==getIlanEkle_gui().getKaydet())
                {
                    emlakKayıt_controller.buld(getIlanEkle_gui());
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }

    }
}
