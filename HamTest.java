package de5;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;

public class HamTest {


    public static void main(String[] args) {
        Vector vectorHeader =new Vector();
        Vector vectorData =new Vector<>();


        try {
            BufferedReader fileReader =new BufferedReader(new FileReader("/home/quang/Desktop/codeJava/codeDe/src/de5/nhanvien.dat"));

            int i;

            while (true){
                Vector nv=new Vector<>();
                String data="";
                while (true){
                    i=fileReader.read();
                    if(i==(int) '$') break;
                    data=data+(char)i;
                }
                nv.add(data);
                data="";

                while (true) {
                    i=fileReader.read();
                    if(i==(int) '$') break;
                    data=data+(char)i;
                }
                nv.add(data);
                data="";

                while (true){
                    i=fileReader.read();
                    if(i==(int) '$') break;
                    data=data+(char)i;
                }
                nv.add(data);
                data="";

                while (true){
                    i=fileReader.read();
                    if(i==(int) '$') break;
                    data=data+(char)i;
                }
                nv.add(data);
                data="";

                while (true){
                    i=fileReader.read();
                    if(i==(int) '$') break;
                    data=data+(char)i;
                }

                nv.add(data);
                data="";

                while (true){
                    i=fileReader.read();
                    if(i==(int) '$') break;
                    data=data+(char)i;
                }
                nv.add(data);
                data="";

                while (true) {
                    i=fileReader.read();
                    // 10 la
                    if(i==10 || i==-1) break;
                    data=data+(char)i;
                }
                nv.add(data);

                vectorData.add(nv);

                if(i==-1) break;

            }
            fileReader.close();
        }
        catch (IOException exception){
            System.out.println(exception);
        }
        catch (NumberFormatException ex){
            System.out.println(ex);
        }

        // bang


        JFrame jFrame =new JFrame("hien thong tin");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(800,800);

        vectorHeader.add("ten");
        vectorHeader.add("ngay sinh");
        vectorHeader.add("que");
        vectorHeader.add("gioi tuinh");
        vectorHeader.add("ma sv");
        vectorHeader.add("he so luolng");
        vectorHeader.add("vi chi");
        JTable jTable=new JTable(vectorData,vectorHeader);

        JScrollPane jScrollPane =new JScrollPane(jTable);
        jFrame.add(jScrollPane);
        jFrame.setVisible(true);

    }
}
