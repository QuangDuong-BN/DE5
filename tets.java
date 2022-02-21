package de5;

import java.io.FileReader;
import java.io.IOException;

public class tets {
    public static void main(String[] args) {
        try {
            FileReader fileReader =new FileReader("/home/quang/Desktop/codeJava/codeDe/src/de5/nhanvien.dat");

        }
        catch (IOException ae){
            System.out.println(ae);
        }
    }
}
