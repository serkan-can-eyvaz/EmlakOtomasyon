package controller;

import DAO.Main_DAO;
import Entites.Customer;
import GUI.Save_GUI;

public class saveController {
    private Save_GUI save_gui;
    Main_DAO main_dao= new Main_DAO();
    public void build(Save_GUI save_gui){
        Customer customer =new Customer();
        this.save_gui=save_gui;
        customer.setAd(save_gui.getNameField().getText());
        customer.setSoyad(save_gui.getSurTextField().getText());
        customer.setEmail(save_gui.getEmailtextfield().getText());
        customer.setTelefon(save_gui.getPasswordField().getText());
        customer.setCustomer_Id(2);
        try {
            main_dao.Save(customer );
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
