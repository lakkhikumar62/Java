package project;

public class Smartphone{
    String model_name;
    String Brand_name;
    int price;
    int screen_size;
    String color;

    void Details(){
        System.out.println("Model Name: "+model_name);
        System.out.println("Brand Name: "+Brand_name);
        System.out.println("Price: "+price);
        System.out.println("Screen Size: "+screen_size);
        System.out.println("Color: "+color);
    }

    void Turnoff(){
        System.out.println("The phone is turned off");
    }

    void call(){
        System.out.println("Calling...");
    }
} 
    
 