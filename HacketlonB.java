public class SolarMonitor {
    public static void main(String[] args) {
        
        double energyGenerated = 12.5; 

        System.out.println("Energy generated today: " + energyGenerated + " kWh");

        
        if (energyGenerated >= 10.0) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Energy Generation");
        }
    }
}
