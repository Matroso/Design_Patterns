public class Car {
    int seats;
    String engine;
    boolean tripComputer;
    boolean isGPS;

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", engine='" + engine + '\'' +
                ", tripComputer=" + tripComputer +
                ", isGPS=" + isGPS +
                '}';
    }
}
