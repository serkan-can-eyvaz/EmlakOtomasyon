package DAO;

import java.io.BufferedWriter;
import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public abstract class Abstract_DAO {//polymorplusum

    public void Save(Object o) throws IOException {

        String Filename= String.valueOf(o.getClass())+".txt";
        File f = new File(Filename);
        if(!f.exists()){
            f.createNewFile();
            System.out.println("dosya oluşturuldu  "+o.getClass());
        }
        else {
            FileWriter fw = new FileWriter(f,true);
            BufferedWriter bv =new BufferedWriter(fw);
            bv.write(String.valueOf(o.toString()));
            bv.newLine();
            bv.close();
            System.out.println("dosyaya yazıldı  "+o.getClass());
        }
    }
//    public String [] getData(Object o) throws IOException {
//        String str="";
//        String filename=String.valueOf(o.getClass())+".txt";
//        File f = new File(filename);
//        if(!f.exists()){
//            f.createNewFile();
//            System.out.println("dosya oluşturuldu  "+o.getClass());
//        }
//        FileReader fileReader = new FileReader(filename);
//        String line;
//        int sayac=0;
//        BufferedReader br = new BufferedReader(fileReader);
//        while ((line = br.readLine()) != null) {System.out.println("selam");
//            str=str+line;
//            sayac++;
//        }
//        br.close();
//        String [] list=str.split(" ");
//        return list;
//    }
public String[] getData(String filename) throws IOException {
    //        ArrayList list=new ArrayList();
    // ArrayList liste2=new ArrayList();
    //String filename=String.valueOf(o.getClass());
    //filename="class Entites.ilan.txt";
    //System.out.println(filename);
    //filename=filename+".txt";
    File f = new File(filename);
    if (!f.exists()) {
        f.createNewFile();
    }
    FileReader fr = new FileReader(f);
    BufferedReader br = new BufferedReader(fr);
    String str, line = "";
    while ((str = br.readLine()) != null) {
        line = line + str;

    }System.out.println(line);
    String[] liste = line.split("&");
    //        for(String a: liste){
    //            System.out.println(a);
    //        }

    return liste;
}


}
