import java.util.ArrayList;

public class currencyConverter {
  private ArrayList<currency> currencies; // registro del total de monedas disponibles para operar
  private double changeType[][]; // registro del total de tipos de cambio entre monedas

  public currencyConverter() {
    this.currencies = new ArrayList<currency>();
    this.changeType = new double[5][5]; // la dimension de la matriz DEBE SER proporcional a la cantidad de objetos //
                                        // posibles a operar. En caso de que se deban agregar objetos, se debera
                                        // actualizar la dimension de la matriz.
  }

  public void addCurrency(currency currency) {
    this.currencies.add(currency);
  }

  public void showCurrencies(currencyConverter list) {
    for (currency currentCurrency : list) {
      System.out.println(currentCurrency.toString());
    }
  }

  public double[][] getChangeType() {
    return changeType;
  }

  public ArrayList<currency> getCurrencies() {
    return currencies;
  }

  @Override
  public String toString() {
    return "texto de prueba";
  }

}