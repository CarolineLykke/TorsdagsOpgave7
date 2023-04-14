package Opgave2;

public class Main {
    public static void main(String[] args){
        Cirkel c1 = new Cirkel();
        try {
            c1.setRadius(-5);
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            //c1.setRadius(5);
        }
       // System.out.println("Arealet af cirklen er: " + c1.getRadius());
    }
}
