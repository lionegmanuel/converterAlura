public class App {
  public static void main(String[] args) throws Exception {
    // divisas
    System.out.println("---CONVERSOR DE DIVISAS Y TEMPERATURA---");
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
  }
}
