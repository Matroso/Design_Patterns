public class CarManualBuilder implements MyBuilder {
    private Manual manual;

    @Override
    public void reset() {
        manual = new Manual();
        manual.start = "Рады, что Вы выбрали автомобиль нашей марки.";
        manual.finish = "Приятной поездки!";
    }

    @Override
    public void setSeats(int seats) {
        manual.seats = "Автомобиль оборудован " + Integer.toString(seats) + " местами для сидения.";
    }

    @Override
    public void setEngine(String engine) {
        manual.engine = "Мощный двигатель '" + engine + "' под капотом вытянет любые ситуации вместе с вами.";
    }

    @Override
    public void setTripComputer(boolean tripComputer) {
        if (tripComputer){
            manual.tripComputer = "Встроенный бортовой компьютер поможет на раз разобраться с любой сложной задачей.";
        }
    }

    @Override
    public void setGPS(boolean GPS) {
        if (GPS){
            manual.GPS = "Встроенная система навигации на даст свернуть с намеченного пути.";
        }
    }

    public Manual getResult(){
        return manual;
    }
}
