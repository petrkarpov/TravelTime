public class Main {
    public static void main(String[] args) {
        final int distanceFromHomeToOfficeKm = 50;
        final double averageTaxiSpeedKm = 60.5;
        final double travelTime = distanceFromHomeToOfficeKm / averageTaxiSpeedKm;

        final double slowingTaxiEvening = 1.5;
        final double fromOfficeToHomeKm = travelTime * slowingTaxiEvening;

        System.out.println("Время от дома до офиса: " + travelTime);
        System.out.println("Время от офиса до дома: " + fromOfficeToHomeKm);
    }
}