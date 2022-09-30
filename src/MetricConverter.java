import java.util.Scanner;

public class MetricConverter {

    public static float Converter(String sourceMetric, String targetMetric, float sourceNum) {
        float targetNum = 0;
        switch (sourceMetric) {
            case "km":
                switch (targetMetric) {
                    case "m":
                        targetNum = sourceNum * 1000;
                        break;
                    case "mile":
                        targetNum = sourceNum / (float) 1.6;
                        break;
                    case "ly":
                        targetNum = sourceNum * (float) 0.00000000000010570;
                        break;
                    case "ft":
                        targetNum = sourceNum * (float) 3280.8;
                        break;
                    case "cm":
                        targetNum = sourceNum * (float) 100000;
                        break;
                    case "mm":
                        targetNum = sourceNum * (float) 1000000;
                        break;
                    default:
                        System.out
                                .println("Your input cannot be handled by the system at the time, try another metric");
                        System.out
                                .printf("%.2f %s = %.2f %s%n", sourceNum, sourceMetric, targetNum, targetMetric);

                }
        }
        System.out
                .printf("%.2f %s = %.2f %s%n", sourceNum, sourceMetric, targetNum, targetMetric);
        return targetNum;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String str;
        String[] strArray;
        float sourceNum;
        String sourceMetric;
        String targetMetric;
        while (true) {
            System.out.println(
                    "Welcome to the metric converter. Please input your metric to be converted in the proper form. For example, 1 km = m.");
            System.out.println("Enter your input below");
            str = scanner.nextLine();
            if (str.equals("Exit")) {
                System.out.println("Thank you for using the converter. Goodbye!");
                scanner.close();
                return;
            }
            strArray = str.split(" ");
            if (strArray.length != 4) {
                System.out.println("ERROR INVALID INPUT. Please input with the following format to convert, 1 lb = kg");
                continue;
            } else {
                sourceNum = Float.parseFloat(strArray[0]);
                sourceMetric = strArray[1];
                targetMetric = strArray[3];
                Converter(sourceMetric, targetMetric, sourceNum);
                continue;

            }

        }
    }
}
