public class Car {
    private String brand;
    private String model;
    private int year;
    private double price;
    private double fuel;
// Encapsulation is the process of hiding the internal data of an object and allowing access only through methods.
    //Default constructor
    public Car(){

    }
    // Parameterised Constructor method
    public Car(int year, double price) {
        this.year = year;
        this.price = price;
    }


    public Car(String model, int year, double price) {
        this.year = year;
        this.price = price;
        this.model = model;
    }


    //Price
    public void setPrice (double price) {
        if (price > 0) {
            this.price = price;
        } else {
            IO.println("Invalid price");
        }
    }

    double getPrice () {
        return price;
    }

    //Year
    public void setYear (int year) {
        if (year > 2000) {
            this.year = year;
        } else {
            IO.println("Invalid Year");
        }
    }

    int getYear () {
        return year;
    }

    public void setModel (String model) {
            this.model = model;
        }

    String getModel () {
        return model;
    }


    public double getFuel () {
        return fuel;
    }

    public void refillFuel(double fuel) {
        this.fuel = this.fuel + fuel;
    }

    //horn method
    public void honkHorn() {
        IO.println(this.model + "Beep Beep");
    }

    public void run (int time) {
        double perSecondExpense = 1;
        double totalExpense = perSecondExpense * time;
        this.fuel = this.fuel - totalExpense ;
    }

}
