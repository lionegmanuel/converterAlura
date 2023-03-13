public class App {
  public static void main(String[] args) throws Exception {
    System.out.println("---CONVERSOR DE DIVISAS Y TEMPERATURA---");
    currencyConverter converterOne = new currencyConverter();
    converterOne.addCurrency(new currency("Peso Argentino"));
    converterOne.addCurrency(new currency("Libra Exterlina"));
    converterOne.addCurrency(new currency("USD"));
    converterOne.addCurrency(new currency("EUR"));
    converterOne.addCurrency(new currency("Yen Japones"));

    converterOne.showCurrencies(converterOne);
  }
}
