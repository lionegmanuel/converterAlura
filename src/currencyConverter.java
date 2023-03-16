import java.util.ArrayList;

public class currencyConverter {
  private ArrayList<currency> currencies; // registro del total de monedas disponibles para operar
  private double changeType[][]; // registro del total de tipos de cambio entre monedas

  public currencyConverter() {
    this.currencies = new ArrayList<currency>();
    this.changeType = new double[6][6]; // la dimension de la matriz DEBE SER proporcional a la cantidad de objetos //
                                        // posibles a operar. En caso de que se deban agregar objetos, se debera
                                        // actualizar la dimension de la matriz.
  }

  public void addCurrency(currency currency) { // registro de divisas a la lista
    this.currencies.add(currency);
  }

  public void showCurrencies() { // muestra de las divisas registradas
    if (currencies.isEmpty())
      System.out.println("¡ERROR!\nNo hay divisas registradas.");
    else {
      for (int x = 0; x < currencies.size(); x++) {
        System.out.println(currencies.get(x));
      }
    }

  }

  public double[][] getChangeType() {
    return changeType;
  }

  public ArrayList<currency> getCurrencies() {
    return currencies;
  }
  // trabajo con la matriz y todos los posibles tipos de cambio

  @Override
  public String toString() {
    return "texto de prueba";
  }

}