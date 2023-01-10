import Transport.Car;

public class Main {
    public static void main(String[] args) {

        Car ladaGranta = new Car(null, "Granta",0,"Yellow",2015,"Russia", "Automatic", "Седан", "х666хх161", 5,true );
        System.out.println(ladaGranta);
        System.out.println();

        ladaGranta.changeTiresOfSeason();
        System.out.println("ladaGranta = " + ladaGranta);


//        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 0.0,"Black", 2020, "Germany");
//        audiA8.printAutomobile();

//        System.out.println();

 //       Car bmwZ8 = new Car("BMW","Z8",3.0,"Black",2021,"Germany");
//        bmwZ8.printAutomobile();

//        System.out.println();

//        Car kiaSportage = new Car("Kia", "Spotrage QL",2.4,"Red",2018,"South Korea");
//        kiaSportage.printAutomobile();

//        System.out.println();

//        Car hyundaiAvante = new Car("Hyundai","Avante",1.6, "Orange", 2016, "South Korea" );
//        hyundaiAvante.printAutomobile();



    }
}