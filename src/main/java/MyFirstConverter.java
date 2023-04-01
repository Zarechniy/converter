import java.util.Scanner;

public class MyFirstConverter {

    public static void main(String[] args) {

        System.out.println("Введите, что хотели бы конвертировать: масса -1 или расстояние - 2");
        Scanner scanner = new Scanner(System.in);
        int measurement = scanner.nextInt();

        if (measurement == 1) {
            System.out.println("Конвертируем массу");
        }
        else if (measurement == 2) {
            System.out.println("Конвертируем расстояние");
            System.out.println("Выберите единицу измерения: метр - 1, миля - 2, ярд -3, фут - 4");
            int measurementOfLength = scanner.nextInt();

            if (measurementOfLength == 1) {
                System.out.println("Введите количество единиц");

                double amount = scanner.nextDouble();
                double metres = amount;
                double miles = amount / 1609;
                double yards = amount * 1.094;
                double foots = amount * 3.281;

                System.out.printf("Метры: %.2f", metres);
                System.out.printf("\nМили: %.3f", miles);
                System.out.printf("\nЯрды: %.2f", yards);
                System.out.printf("\nФуты: %.2f", foots);
            }
        }
        else {
            System.out.println("Неверное значение");
        }
    }
}
