/**
 * Hitta felen!
 */

public class car
{
    // Vad kallas dessa?
    private String model;
    private int year;
    private double fuelLevel;
    private String isRunning;

    // Vad heter denna?
    public car(model, year) {
        model = model;
        year = year;
        fuelLevel = 0.0; // Initialize fuel level to empty
        isRunning = false; // The car is initially not running
    }

    // Starta bilen!
    public void start() {
        if (!isRunning && fuelLevel > 0) {
                isRunning = true;
                System.out.println("The car is now running.");
        }
        else if (isRunning) {
            System.out.println("The car is already running.");
        }
        else {
            System.out.println("The car is out of fuel. Refill before starting.");
        }
    }

    // Stanna bilen
    public stop() {
        if (isRunning) {
            isRunning = false;
            System.out.println("The car has been stopped.");
        }
        else {
            System.out.println("The car is not running.");
        }
    }

    // Fyll på!
    public void refuel(double gallons) {
        if (gallons > 0) {
                fuelLevel = fuelLevel + gallons;
            System.out.println("Added " + gallons + " gallons of fuel. Current fuel level: " + fuelLevel + " gallons.");
        }
            else {
            System.out.println("Invalid amount of fuel to add.");
        }
    }

    // Setter till fuelLevel
    public void setfuellevel(double fuelLevel) {
        fuelLevel = this.fuelLevel;
    }

    // Getter till isRunning. Behövs this här?
    public boolean isRunning() {
        return this.isRunning;
    }

    // Setter till isRunning
    public void setRunning(isRunning) {
        this.isRunning = isRunning;
    }


}
