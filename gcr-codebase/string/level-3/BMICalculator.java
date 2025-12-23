import java.util.Scanner;

//Create class BMICalculator to calculate bmi
public class BMICalculator {

    // Method to calculate BMI and status for a single person
    public static String[] calculateBMIAndStatus(double weight, double heightCm) {

        // Convert height from cm to meters
        double heightMeter = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (heightMeter * heightMeter);

        // Determine BMI status
        String status;
        

        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }


        // Return height, weight, BMI, and status as String array
        return new String[]{
            String.valueOf(heightCm),
            String.valueOf(weight),
            String.format("%.2f", bmi),
            status
        };
    }

    // Method to process all persons and return 2D String array
    public static String[][] processBMI(double[][] data) {

        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double height = data[i][1];

            result[i] = calculateBMIAndStatus(weight, height);
        }

        return result;
    }

    // Method to display results in tabular format
    public static void displayResult(String[][] result) {

        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.println(
                result[i][0] + "\t\t" +
                result[i][1] + "\t\t" +
                result[i][2] + "\t\t" +
                result[i][3]
            );
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 2D array to store weight and height
        double[][] data = new double[10][2];

        // Taking input
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));
            System.out.print("Enter Weight (kg): ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter Height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        // Processing BMI
        String[][] result = processBMI(data);

        // Displaying result
        displayResult(result);

        sc.close();
    }
}
