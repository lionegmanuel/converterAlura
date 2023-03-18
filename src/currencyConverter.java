import java.util.ArrayList;

import javax.swing.JOptionPane;

public class currencyConverter {
  public void arsandusd(double worth) {
    double argentineCotization = 201.3; // valor de 1 USD en pesos.
    double result = worth / argentineCotization;
    JOptionPane.showMessageDialog(null, "RESULTADO: $" + result);
  }

  public void arsandeur(double worth) {
    double argentineCotization = 216.4; // valor de 1 EUR en pesos.
    double result = worth / argentineCotization;
    JOptionPane.showMessageDialog(null, "RESULTADO: €" + result);
  }

  public void arsandlib(double worth) {
    double argentineCotization = 245.7; // valor de 1 libra en pesos.
    double result = worth / argentineCotization;
    JOptionPane.showMessageDialog(null, "RESULTADO: £" + result);
  }

  public void arsandyen(double worth) {
    double argentineCotization = 1.53; // valor de 1 yen japones en pesos.
    double result = worth / argentineCotization;
    JOptionPane.showMessageDialog(null, "RESULTADO: ¥" + result);
  }

  public void arsandwon(double worth) {
    double argentineCotization = 0.15; // valor de 1 won surcoreano en pesos.
    double result = worth / argentineCotization;
    JOptionPane.showMessageDialog(null, "RESULTADO: ₩" + result);
  }

}