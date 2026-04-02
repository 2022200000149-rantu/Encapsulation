void main () {
    IO.println("We will learn encapsulation today");

//Object1

    Car car1 = new Car();
    car1.setPrice(999999);
    car1.setYear(2025);
    car1.setModel("Axio");


    IO.println("Price: " + car1.getPrice());
    IO.println("Year: " + car1.getYear());

    car1.honkHorn();


//Object2

    Car car2 = new Car(2026, 78684);
    Car car3 = new Car("No", 3000, 898);


    IO.println(car2.getYear());
    IO.println(car3.getYear());


    car1.refillFuel(10);


}