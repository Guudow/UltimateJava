public class VariableAndNames {

    public static void main(String[] args) {

        int cars, drivers, passengers, cars_not_driven, cars_drvien;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;

        cars = 100;
        space_in_a_car = 4.0;
        drivers = 30;
        passengers = 90;
        cars_not_driven = cars - drivers;
        cars_drvien = drivers;
        carpool_capacity = cars_drvien * space_in_a_car;
        average_passengers_per_car = passengers / cars_drvien;

        System.out.println("there are " + cars + "cars available");
        System.out.println("there are only " + drivers + " drivers available");
        System.out.println("There are only " + cars_not_driven + "empty cars today");
        System.out.println("We can transport " + carpool_capacity + " people today ");
        System.out.println("We have " + passengers + " to carpool today");
        System.out.println("we need to put about " + average_passengers_per_car + " in each car");

    }
}
