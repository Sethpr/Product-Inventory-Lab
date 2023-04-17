import io.Console;
import services.CakeService;
import services.PieService;

import java.sql.SQLOutput;

public class App{
    private CakeService cakes = new CakeService();
    private PieService pies = new PieService();
    private Console con = new Console(System.in, System.out);
    private boolean flag = true;
    public static void main(String[] args) {
        new App().init();
    }

    public void init(){
        con.printWelcome();
        int in;
        while(flag){
            in  = con.prompt();
            if(in < 1 || in > 6){
                con.invalid();
                continue;
            }
            process(in);
        }
        con.printExit();
    }

     private void process(Integer in){
        switch(in){
            case 1:
                generate(getType());
                break;
            case 2:
                if(getType().equals("cake")){
                    con.print(cakes.toString());
                } else{
                    con.print(pies.toString());
                }
                break;
            case 3:
                if(getType().equals("cake")){
                    cakeUpdate();
                } else{
                    pieUpdate();
                }
                break;
            case 4:
                delete(getType());
                break;
            case 5:
                con.print("idk what is supposed to go here");
                break;
            case 6:
                flag = false;
        }
    }

    public String getType(){
        String type;
        while(true){
            type = con.type();
            if(type.equals("cake") || type.equals("pie")){
                return type;
            }
        }
    }

    public void delete(String type){
        int target = con.id();
        if(type.equals("cake")){
            cakes.delete(target);
        }else{
            pies.delete(target);
        }
    }

    public void cakeUpdate(){
        int target = con.id();
        while(true){
            switch(con.cakeEdit()){
                case 1:
                    cakes.find(target).setFlavor(con.flavor("cake"));
                    return;
                case 2:
                    cakes.find(target).setTiers(con.tiers());
                    return;
                case 3:
                    cakes.find(target).setPrice(con.price());
                    return;
                case 4:
                    cakes.find(target).setQty(con.qty());
                    return;
                default:
                    con.invalid();
            }
        }

    }

    public void generate(String type){ //this feels written incredibly poorly, but sanity checking in console feels wrong
        String flavor;
        int qty;
        int tiers = 0;
        float circ = 0;
        float price;

        flavor = con.flavor(type);
        while(true){
            qty = con.qty();
            if(qty > 0){
                break;
            }
        }
        if(type.equals("cake")){
            while(true){
                tiers = con.tiers();
                if(tiers > 0){
                    break;
                }
            }
        } else{
            while(true){
                circ = con.circumference();
                if(circ > 0){
                    break;
                }
            }
        }
        while(true){
            price = con.price();
            if(price > 0){
                break;
            }
        }

        if(type.equals("cake")){
            cakes.create(flavor, tiers, qty, price);
        } else{
            pies.create(flavor, circ, qty, price);
        }

    }


}