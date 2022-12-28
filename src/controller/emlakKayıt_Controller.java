package controller;

import DAO.Main_DAO;
import Entites.ilan;
import GUI.ilanEkle_GUI;

import java.io.IOException;

public class emlakKayıt_Controller {

    private ilanEkle_GUI ilanEkle_gui;
    Main_DAO main_dao= new Main_DAO();
    public void buld(ilanEkle_GUI ilanEkle_gui ){
        ilan ilan=new ilan();
        this.ilanEkle_gui=ilanEkle_gui;
        ilan.setIlanid(ilanEkle_gui.getTextFieldid().getText());
        ilan.setKonutipii(ilanEkle_gui.getTextFieldkonuttipi().getText());
        ilan.setAlan(ilanEkle_gui.getTextFieldalan().getText());
        ilan.setIsınma(ilanEkle_gui.getTextFieldısınma().getText());
        ilan.setOdasayisi(ilanEkle_gui.getTextFieldodasayisi().getText());
        ilan.setYapımyili(ilanEkle_gui.getTextFieldyapımyılı().getText());
        ilan.setFiyat(ilanEkle_gui.getTextFieldfiyat().getText());
        try {
            main_dao.Save(ilan);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
