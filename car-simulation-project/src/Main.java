public class Main {
    public static void main(String[] args) {
        Car myFirstCar = new Car();

        myFirstCar.make = "Toyota";
        myFirstCar.model = "Corolla";
        myFirstCar.color = "Black";
        myFirstCar.year = 2019;
        
        // display the car details for myFirstCar
        myFirstCar.getCarDetails();
    }
}
