package io;

import java.io.InputStream;
import java.io.OutputStream;

public class Console {

    InputStream in;
    OutputStream out;

    public Console(InputStream in, OutputStream out){
        this.in = in;
        this.out = out;
    }


    public static void printWelcome(){
        System.out.println("" +
                "**************************************************" +
                "***           Welcome and Bienvenue            ***" +
                "***                    to                      ***" +
                "***          ZipCo Inventory Manager           ***" +
                "**************************************************");
    }
}
