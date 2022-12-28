import DAO.Main_DAO;
import Entites.Customer;
import GUI.*;
import controller.saveController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList arrayList=new ArrayList();
        Login_GUI lg=new Login_GUI();
        lg.getFrame().setVisible(true);
        Main_DAO main_dao=new Main_DAO();
        Customer customer = new Customer();
        Customer customer1=new Customer();
     //  arrayList=main_dao.getData(customer1);


    }
}