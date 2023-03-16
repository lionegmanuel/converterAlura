import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    // divisas
    System.out.println("---CONVERSOR DE DIVISAS Y TEMPERATURA---");
    System.out.println("---testeo de funcionamiento---\n");
    currencyConverter currencyConverter = new currencyConverter();
    currencyConverter.addCurrency(new currency("Peso Argentino"));
    currencyConverter.addCurrency(new currency("Libra Exterlina"));
    currencyConverter.addCurrency(new currency("USD"));
    currencyConverter.addCurrency(new currency("EUR"));
    currencyConverter.addCurrency(new currency("Yen Japones"));
    currencyConverter.showCurrencies();
    System.out.println("---");
    // escalas de temperatura

    temperatureConverter temperatureConverter = new temperatureConverter();
    temperatureConverter.addTemperatureScale(new scale("Celsius"));
    temperatureConverter.addTemperatureScale(new scale("Kelvin"));
    temperatureConverter.addTemperatureScale(new scale("Fahrenheit"));
    temperatureConverter.showTemperatureScale();
    System.out.println("¿Que desea convertir?\n1-DIVISAS\n2-TEMPERATURAS");
    Scanner userAnswer = new Scanner(System.in);
    int answer = userAnswer.nextInt();
    if (answer == 1)
      System.out.println(
          "Seleccione la divisa origen (Valor inicial):\n1-ARS\n2-USD\n3-EUR\n4-Libra Esterlina\n5-Yen Japones\n6-Won Surcoreano");
    answer = userAnswer.nextInt();
    Scanner userWorth = new Scanner(System.in); // valor a convertir
    Scanner userAnswer2 = new Scanner(System.in); // divisa destino
    if (answer == 1) { // ars
      System.out.println(
          "Seleccione la divisa destino (A la que desea realizar la conversion):\n1-USD\n2-EUR\n3-Libra Esterlina\n4-Yen Japones\n5-Won Surcoreano");
      int answer2 = userAnswer2.nextInt();
      if (answer2 == 1) { // usd
        System.out.println("Ingrese el valor a convertir:\n");
        double worth = userWorth.nextDouble();
        double worth2 = worth / 203;
        System.out.println("RESULTADO:\n$ " + worth2);

      } else if (answer2 == 2) { // eur
        System.out.println("Ingrese el valor a convertir:\n");
        double worth = userWorth.nextDouble();
        double worth2 = worth / 215.4;
        System.out.println("RESULTADO:\n€ " + worth2);

      } else if (answer2 == 3) { // libra
        System.out.println("Ingrese el valor a convertir:\n");
        double worth = userWorth.nextDouble();
        double worth2 = worth / 245.72;
        System.out.println("RESULTADO:\n₤ " + worth2);
      } else if (answer2 == 4) { // yen
        System.out.println("Ingrese el valor a convertir:\n");
        double worth = userWorth.nextDouble();
        double worth2 = worth / 1.52;
        System.out.println("RESULTADO:\n¥ " + worth2);
      } else { // won
        System.out.println("Ingrese el valor a convertir:\n");
        double worth = userWorth.nextDouble();
        double worth2 = worth / 0.161;
        System.out.println("RESULTADO:\n₩ " + worth2);
      }
    } else if (answer == 2) // usd
    {
      System.out.println(
          "Seleccione la divisa destino (A la que desea realizar la conversion):\n1-USD\n2-EUR\n3-Libra Esterlina\n4-Yen Japones\n5-Won Surcoreano");
      int answer2 = userAnswer2.nextInt();
      if (answer2 == 1) { // ars
        System.out.println("Ingrese el valor a convertir:\n");
        double worth = userWorth.nextDouble();
        double worth2 = worth * 203;
        System.out.println("RESULTADO:\n$ " + worth2);

      } else if (answer2 == 2) { // eur
        System.out.println("Ingrese el valor a convertir:\n");
        double worth = userWorth.nextDouble();
        double worth2 = worth * 0.94;
        System.out.println("RESULTADO:\n€ " + worth2);

      } else if (answer2 == 3) { // libra
        System.out.println("Ingrese el valor a convertir:\n");
        double worth = userWorth.nextDouble();
        double worth2 = worth * 0.83;
        System.out.println("RESULTADO:\n₤ " + worth2);
      } else if (answer2 == 4) { // yen
        System.out.println("Ingrese el valor a convertir:\n");
        double worth = userWorth.nextDouble();
        double worth2 = worth * 133.6;
        System.out.println("RESULTADO:\n¥ " + worth2);
      } else { // won
        System.out.println("Ingrese el valor a convertir:\n");
        double worth = userWorth.nextDouble();
        double worth2 = worth * 1301;
        System.out.println("RESULTADO:\n₩ " + worth2);
      }
    } else if (answer == 3) // eur
    {
      System.out.println(
          "Seleccione la divisa destino (A la que desea realizar la conversion):\n1-USD\n2-EUR\n3-Libra Esterlina\n4-Yen Japones\n5-Won Surcoreano");
      int answer2 = userAnswer2.nextInt();
      if (answer2 == 1) { // usd
        System.out.println("Ingrese el valor a convertir:\n");
        double worth = userWorth.nextDouble();
        double worth2 = worth * 1.06;
        System.out.println("RESULTADO:\n$ " + worth2);

      } else if (answer2 == 2) { // ars
        System.out.println("Ingrese el valor a convertir:\n");
        double worth = userWorth.nextDouble();
        double worth2 = worth * 215.4;
        System.out.println("RESULTADO:\n€ " + worth2);

      } else if (answer2 == 3) { // libra
        System.out.println("Ingrese el valor a convertir:\n");
        double worth = userWorth.nextDouble();
        double worth2 = worth * 0.9;
        System.out.println("RESULTADO:\n₤ " + worth2);
      } else if (answer2 == 4) { // yen
        System.out.println("Ingrese el valor a convertir:\n");
        double worth = userWorth.nextDouble();
        double worth2 = worth * 141.7;
        System.out.println("RESULTADO:\n¥ " + worth2);
      } else { // won
        System.out.println("Ingrese el valor a convertir:\n");
        double worth = userWorth.nextDouble();
        double worth2 = worth * 1379.7;
        System.out.println("RESULTADO:\n₩ " + worth2);
      }
    } else if (answer == 4) // libra
    {
      System.out.println(
          "Seleccione la divisa destino (A la que desea realizar la conversion):\n1-USD\n2-EUR\n3-Libra Esterlina\n4-Yen Japones\n5-Won Surcoreano");
      int answer2 = userAnswer2.nextInt();
      if (answer2 == 1) { // usd
        System.out.println("Ingrese el valor a convertir:\n");
        double worth = userWorth.nextDouble();
        double worth2 = worth * 1.21;
        System.out.println("RESULTADO:\n$ " + worth2);

      } else if (answer2 == 2) { // eur
        System.out.println("Ingrese el valor a convertir:\n");
        double worth = userWorth.nextDouble();
        double worth2 = worth * 1.14;
        System.out.println("RESULTADO:\n€ " + worth2);

      } else if (answer2 == 3) { // ars
        System.out.println("Ingrese el valor a convertir:\n");
        double worth = userWorth.nextDouble();
        double worth2 = worth * 245.72;
        System.out.println("RESULTADO:\n₤ " + worth2);
      } else if (answer2 == 4) { // yen
        System.out.println("Ingrese el valor a convertir:\n");
        double worth = userWorth.nextDouble();
        double worth2 = worth * 161.7;
        System.out.println("RESULTADO:\n¥ " + worth2);
      } else { // won
        System.out.println("Ingrese el valor a convertir:\n");
        double worth = userWorth.nextDouble();
        double worth2 = worth * 1574.2;
        System.out.println("RESULTADO:\n₩ " + worth2);
      }
    } else if (answer == 5) // yen
    {
      System.out.println(
          "Seleccione la divisa destino (A la que desea realizar la conversion):\n1-USD\n2-EUR\n3-Libra Esterlina\n4-Yen Japones\n5-Won Surcoreano");
      int answer2 = userAnswer2.nextInt();
      if (answer2 == 1) { // usd
        System.out.println("Ingrese el valor a convertir:\n");
        double worth = userWorth.nextDouble();
        double worth2 = worth / 133.56;
        System.out.println("RESULTADO:\n$ " + worth2);

      } else if (answer2 == 2) { // eur
        System.out.println("Ingrese el valor a convertir:\n");
        double worth = userWorth.nextDouble();
        double worth2 = worth / 141.72;
        System.out.println("RESULTADO:\n€ " + worth2);

      } else if (answer2 == 3) { // libra
        System.out.println("Ingrese el valor a convertir:\n");
        double worth = userWorth.nextDouble();
        double worth2 = worth / 161.88;
        System.out.println("RESULTADO:\n₤ " + worth2);
      } else if (answer2 == 4) { // ars
        System.out.println("Ingrese el valor a convertir:\n");
        double worth = userWorth.nextDouble();
        double worth2 = worth / 245.7;
        System.out.println("RESULTADO:\n¥ " + worth2);
      } else { // won
        System.out.println("Ingrese el valor a convertir:\n");
        double worth = userWorth.nextDouble();
        double worth2 = worth * 6.41;
        System.out.println("RESULTADO:\n₩ " + worth2);
      }
    } else // won
    {
      System.out.println(
          "Seleccione la divisa destino (A la que desea realizar la conversion):\n1-USD\n2-EUR\n3-Libra Esterlina\n4-Yen Japones\n5-Won Surcoreano");
      int answer2 = userAnswer2.nextInt();
      if (answer2 == 1) { // usd
        System.out.println("Ingrese el valor a convertir:\n");
        double worth = userWorth.nextDouble();
        double worth2 = worth / 1301;
        System.out.println("RESULTADO:\n$ " + worth2);

      } else if (answer2 == 2) { // eur
        System.out.println("Ingrese el valor a convertir:\n");
        double worth = userWorth.nextDouble();
        double worth2 = worth / 1380.6;
        System.out.println("RESULTADO:\n€ " + worth2);

      } else if (answer2 == 3) { // libra
        System.out.println("Ingrese el valor a convertir:\n");
        double worth = userWorth.nextDouble();
        double worth2 = worth / 1575;
        System.out.println("RESULTADO:\n₤ " + worth2);
      } else if (answer2 == 4) { // yen
        System.out.println("Ingrese el valor a convertir:\n");
        double worth = userWorth.nextDouble();
        double worth2 = worth / 9.74;
        System.out.println("RESULTADO:\n¥ " + worth2);
      } else { // ars
        System.out.println("Ingrese el valor a convertir:\n");
        double worth = userWorth.nextDouble();
        double worth2 = worth / 6.41;
        System.out.println("RESULTADO:\n₩ " + worth2);
      }

    }
  }
}
