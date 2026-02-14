package project;
public class Gadget {
    public static void main(String[] args){
        Smartphone phone1 = new Smartphone();

        phone1.model_name="Infinix Note 50x 5G";
        phone1.Brand_name="Infinix";
        phone1.price=11499;
        phone1.screen_size=6;
        phone1.color="Black";

        phone1.Details();
        phone1.Turnoff();
        phone1.call();
    }
}

