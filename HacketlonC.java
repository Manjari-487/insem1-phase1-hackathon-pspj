import java.util.Scanner;

public class SolarEnergyCalculator {

    public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter morning energy generation (in kWh): ");
        double morning = scanner.nextDouble();

        System.out.print("Enter evening energy generation (in kWh): ");
        double evening = scanner.nextDouble();

        double totalEnergy = calculateTotalEnergy(morning, evening);

        System.out.println("Total energy generated today: " + totalEnergy + " kWh");

        
        if (totalEnergy >= 10.0) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Energy Generation");
        }

        scanner.close();
    }
}
