package io;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {

    Scanner in;
    PrintStream out;

    public Console(InputStream in, PrintStream out){
        this.in = new Scanner(in);
        this.out = out;
    }


    public void printWelcome(){
        out.print("" +
                "**************************************************\n" +
                "***           Welcome and Bienvenue            ***\n" +
                "***                    to                      ***\n" +
                "***          ZipCo Inventory Manager           ***\n" +
                "**************************************************\n");
    }

    public void invalid() {
        out.print("" +
                "**************************************************\n" +
                "***                   Error                    ***\n" +
                "***                Please enter                ***\n" +
                "***                Valid input                 ***\n" +
                "**************************************************\n");
    }

    public void printExit() {
        out.print("" +
                "**************************************************\n" +
                "***                 Goodbye!                   ***\n" +
                "**************************************************\n");
    }

    public Integer prompt() {
        out.print("" +
                "**************************************************\n" +
                "***         Please enter the command           ***\n" +
                "***             you want to run                ***\n" +
                "***           1) create    2) read             ***\n" +
                "***           3) update    4) delete           ***\n" +
                "***           5) report    6) exit             ***\n" +
                "**************************************************\n");
        try {
            return in.nextInt();
        } catch(InputMismatchException e){
            return -1;
        }
    }

    public String type() {
        out.print("" +
                "**************************************************\n" +
                "***                Cake or Pie?                ***\n" +
                "**************************************************\n");
            return in.next().toLowerCase().trim();
    }

    public Integer cakeEdit() {
        out.print("" +
                "**************************************************\n" +
                "***          What do you want to update        ***\n" +
                "***              1) flavor   2) tiers          ***\n" +
                "***              3) price    4) qty            ***\n" +
                "**************************************************\n");
        return in.nextInt();
    }

    public String flavor(String type){
        if(type.equals("cake")){
            out.print("" +
                    "**************************************************\n" +
                    "***          What flavor is your cake          ***\n" +
                    "**************************************************\n");
        } else{
            out.print("" +
                    "**************************************************\n" +
                    "***          What flavor is your pie           ***\n" +
                    "**************************************************\n");
        }

        return in.next().toLowerCase();
    }

    public Integer qty() {
        out.print("" +
                "**************************************************\n" +
                "***            How many do you have            ***\n" +
                "**************************************************\n");
        try {
            return in.nextInt();
        } catch(InputMismatchException e){
            return -1;
        }
    }

    public Integer tiers() {
        out.print("" +
                "**************************************************\n" +
                "***        How many tiers is your cake         ***\n" +
                "**************************************************\n");
        try {
            return in.nextInt();
        } catch(InputMismatchException e){
            return -1;
        }
    }

    public float price() {
        out.print("" +
                "**************************************************\n" +
                "***           How much does it cost            ***\n" +
                "**************************************************\n");
        try {
            return in.nextFloat();
        } catch(InputMismatchException e){
            return -1;
        }
    }

    public float circumference() {
        out.print("" +
                "**************************************************\n" +
                "***    What is the circumference of your pie   ***\n" +
                "**************************************************\n");
        try {
            return in.nextFloat();
        } catch(InputMismatchException e){
            return -1;
        }
    }

    public Integer id() {
        out.print("" +
                "**************************************************\n" +
                "***          What id do you operate on         ***\n" +
                "**************************************************\n");
        try {
            return in.nextInt();
        } catch(InputMismatchException e){
            return -1;
        }
    }




    public void print(String prompt){
        out.println(prompt);
    }
}
