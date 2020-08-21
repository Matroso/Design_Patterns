public class Director {
    public void constructorSportCar(MyBuilder builder){
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("Speedy V12");
        builder.setTripComputer(true);
        builder.setGPS(true);
    }
}
