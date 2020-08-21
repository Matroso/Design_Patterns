public class Main {
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();
        CarManualBuilder manualBuilder = new CarManualBuilder();
        Director director = new Director();
        director.constructorSportCar(carBuilder);
        Car car = carBuilder.getResult();
        director.constructorSportCar(manualBuilder);
        Manual manual = manualBuilder.getResult();

        System.out.println(manual.toString());
        System.out.println(car.toString());
    }
}
