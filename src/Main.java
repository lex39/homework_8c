import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    System.out.println("Программа конвертер единиц измерения.");

    while (true) {
      Scanner input = new Scanner(System.in);

      System.out.println("Выберите что переводить:");
      System.out.println("[1] - масса");
      System.out.println("[2] - расстояние");

      int menuCommand = input.nextInt();

      if (menuCommand == 1) {
        System.out.println("Выберите единицу измерения:");
        System.out.println("[1] - килограмм");
        System.out.println("[2] - грамм");
        System.out.println("[3] - фунт");
        System.out.println("[4] - карат");

        int menuCommandWeight = input.nextInt();

        System.out.println("Введите число:");

        double number = input.nextInt();

        if (menuCommandWeight == 1) {
          System.out.println("Результат:");
          System.out.println("Килограмм: " + number);
          System.out.println("Грамм: " + number * 1000);
          System.out.println("Фунтов: " + number * 2.2);
          System.out.println("Карат: " + number * 5000);
          break;
        } else if (menuCommandWeight == 2) {
          System.out.println("Результат:");
          System.out.println("Килограмм: " + number * 0.001);
          System.out.println("Грамм: " + number);
          System.out.println("Фунтов: " + number * 0.0022);
          System.out.println("Карат: " + number * 5);
          break;
        } else if (menuCommandWeight == 3) {
          System.out.println("Результат:");
          System.out.println("Килограмм: " + number * 0.45);
          System.out.println("Грамм: " + number * 453.59);
          System.out.println("Фунтов: " + number);
          System.out.println("Карат: " + number * 2267.96);
          break;
        } else if (menuCommandWeight == 4) {
          System.out.println("Результат:");
          System.out.println("Килограмм: " + number * 0.0002);
          System.out.println("Грамм: " + number * 0.2);
          System.out.println("Фунтов: " + number * 0.00044);
          System.out.println("Карат: " + number);
          break;
        } else {
          break;
        }

      } else if (menuCommand == 2) {
        System.out.println("Выберите единицу измерения:");
        System.out.println("[1] - метр");
        System.out.println("[2] - миля");
        System.out.println("[3] - ярд");
        System.out.println("[4] - фут");

        int menuCommandLong = input.nextInt();

        System.out.println("Введите число:");

        double numberIn = input.nextInt();

        if (menuCommandLong == 1) {
          System.out.println("Результат:");
          System.out.println("Метров: " + numberIn);
          System.out.println("Миль: " + numberIn * 0.00062);
          System.out.println("Ярдов: " + numberIn * 1.09);
          System.out.println("Футов: " + numberIn * 3.28);
          break;
        } else if (menuCommandLong == 2) {
          System.out.println("Результат:");
          System.out.println("Метров: " + numberIn * 1609.34);
          System.out.println("Миль: " + numberIn);
          System.out.println("Ярдов: " + numberIn * 1760);
          System.out.println("Футов: " + numberIn * 5280  );
          break;
        } else if (menuCommandLong == 3) {
          System.out.println("Результат:");
          System.out.println("Метров: " + numberIn * 0.91);
          System.out.println("Миль: " + numberIn * 0.00057);
          System.out.println("Ярдов: " + numberIn);
          System.out.println("Футов: " + numberIn * 3);
          break;
        } else if (menuCommandLong == 4) {
          System.out.println("Результат:");
          System.out.println("Метров: " + numberIn * 0.3);
          System.out.println("Миль: " + numberIn * 0.00019);
          System.out.println("Ярдов: " + numberIn * 0.33);
          System.out.println("Футов: " + numberIn);
          break;
        } else {
          break;
        }
      } else {
        break;
      }
    }
  }
}