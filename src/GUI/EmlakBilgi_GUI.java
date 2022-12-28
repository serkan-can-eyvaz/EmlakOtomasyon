package GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class EmlakBilgi_GUI {

    public EmlakBilgi_GUI()
    {
        build();
    }
    public  void build()
    {
        this.getPanel().add(this.jScrollPane);
        this.getFrame().add(this.getPanel());
    }
                                                                                                                                                                                            String[][] data=
                                                                                                                                                                                                    {
                                                                                                                                                                                                            {"1","SERKAN CAN","EYVAZ", "01234567899", "00000000000", " ELZEM OFİS"},
                                                                                                                                                                                                            {"1","Muhsin ","BİNEN", "01234567899", "00000000000", "GONDOR OFİS"}
                                                                                                                                                                                                    };
    String[] tabloAdi={"ID","AD ","SOYAD","TC ","TELEFON ","ADRES"};
    DefaultTableModel model =new DefaultTableModel (data,tabloAdi);
    JTable table=new JTable(model);
    JScrollPane jScrollPane=new JScrollPane(table);
    JFrame frame;
    JPanel panel;

    public JFrame getFrame() {
        if (this.frame==null)
        {
            frame=new JFrame("EMLAK OFİS VE KURULUŞ DANIŞMANLARI");
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
            panel= new JPanel();
        }
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }
}
