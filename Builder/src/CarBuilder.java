public class CarBuilder implements MyBuilder{
    private Car car;
    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public void setSeats(int seats) {
        car.seats = seats;
    }

    @Override
    public void setEngine(String engine) {
        car.engine = engine;
    }

    @Override
    public void setTripComputer(boolean tripComputer) {
        car.tripComputer = tripComputer;
    }

    @Override
    public void setGPS(boolean GPS) {
        car.isGPS = GPS;
    }

    public Car getResult(){
        return car;
    }
}
