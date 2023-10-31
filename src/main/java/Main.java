public class Main {
    public static void main(String[] args) {
        final int DISTANCE_FROM_HOME_TO_OFFICE_KM = 50;
        final double AVERAGE_TAXI_SPEED_KM = 60.5;
        final double TRAVEL_TIME = DISTANCE_FROM_HOME_TO_OFFICE_KM / AVERAGE_TAXI_SPEED_KM;

        final double SLOWING_TAXI_EVENING = 1.5;
        final double FROM_OFFICE_TO_HOME_KM = TRAVEL_TIME * SLOWING_TAXI_EVENING;

        System.out.println("Время от дома до офиса: " + TRAVEL_TIME);
        System.out.println("Время от офиса до дома: " + FROM_OFFICE_TO_HOME_KM);
    }
}