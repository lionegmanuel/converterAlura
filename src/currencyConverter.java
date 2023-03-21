
import javax.swing.JOptionPane;

public class currencyConverter {
  public void arsandusd(double amount, int typeCase) { // moneda ARS es la divisa principal
    if (typeCase == 1) {
      double argentineCotization = 201.3; // valor de 1 USD en pesos.
      double result = Math.round((amount / argentineCotization) * 1000d);
      JOptionPane.showMessageDialog(null, "RESULTADO: $ " + result + "\n\nPESO ARGENTINO ➙  DOLAR ESTADOUNIDENSE");
    } else { // USD es la moneda principal para convertir a pesos como el destino
      double argentineCotization = 201.3; // valor de 1 USD en pesos.
      double result = Math.round((amount * argentineCotization) * 1000d);
      JOptionPane.showMessageDialog(null, "RESULTADO: $ " + result + "\n\nDOLAR ESTADOUNIDENSE ➙  PESO ARGENTINO");
    }

  }

  public void arsandeur(double amount, int typeCase) {
    if (typeCase == 1) {
      double argentineCotization = 216.4; // valor de 1 EUR en pesos.
      double result = Math.round((amount / argentineCotization) * 1000d);
      JOptionPane.showMessageDialog(null, "RESULTADO: € " + result + "\n\nPESO ARGENTINO ➙  EURO");
    } else {
      double argentineCotization = 216.4; // valor de 1 EUR en pesos.
      double result = Math.round((amount * argentineCotization) * 1000d);
      JOptionPane.showMessageDialog(null, "RESULTADO: $ " + result + "\n\nEURO ➙  PESO ARGENTINO");
    }
  }

  public void arsandlib(double amount, int typeCase) {
    if (typeCase == 1) {
      double argentineCotization = 245.7; // valor de 1 libra en pesos.
      double result = Math.round((amount / argentineCotization) * 1000d);
      JOptionPane.showMessageDialog(null, "RESULTADO: £ " + result + "\n\nPESO ARGENTINO ➙  LIBRA ESTERLINA");
    } else {
      double argentineCotization = 245.7; // valor de 1 libra en pesos.
      double result = Math.round((amount * argentineCotization) * 1000d);
      JOptionPane.showMessageDialog(null, "RESULTADO: $ " + result + "\n\nLIBRA ESTERLINA ➙  PESO ARGENTINO");
    }
  }

  public void arsandyen(double amount, int typeCase) {
    if (typeCase == 1) {
      double argentineCotization = 1.53; // valor de 1 yen japones en pesos.
      double result = Math.round((amount / argentineCotization) * 1000d);
      JOptionPane.showMessageDialog(null, "RESULTADO: ¥ " + result + "\n\nPESO ARGENTINO ➙  YEN JAPONES");
    } else {
      double argentineCotization = 1.53; // valor de 1 yen japones en pesos.
      double result = Math.round((amount * argentineCotization) * 1000d);
      JOptionPane.showMessageDialog(null, "RESULTADO: $ " + result + "\n\nYEN JAPONES ➙  PESO ARGENTINO");
    }
  }

  public void arsandwon(double amount, int typeCase) {
    if (typeCase == 1) {
      double argentineCotization = 0.15; // valor de 1 won surcoreano en pesos.
      double result = Math.round((amount / argentineCotization) * 1000d);
      JOptionPane.showMessageDialog(null, "RESULTADO: ₩ " + result + "\n\nPESO ARGENTINO ➙  WON SURCOREANO");
    } else {
      double argentineCotization = 0.15; // valor de 1 won surcoreano en pesos.
      double result = Math.round((amount / argentineCotization) * 1000d);
      JOptionPane.showMessageDialog(null, "RESULTADO: $ " + result + "\n\nWON SURCOREANO ➙  PESO ARGENTINO");
    }
  }

}