import java.util.ArrayList;

import javax.swing.JOptionPane;

public class temperatureConverter {
  public void celsandfar(double amount, int typeCase) { // celsius y fahrenheit // escala celsius como principal
    if (typeCase == 1) {
      double result = Math.round(((1.8 * amount) + 32) * 10d); // resultado final de conversion
      JOptionPane.showMessageDialog(null, "RESULTADO: " + result + " °F\n\nCELSIUS ➙  FAHRENHEIT");
    } else { // escala fahrenheit es la principal
      double result = Math.round(((amount - 32) / 1.8) * 10d);
      JOptionPane.showMessageDialog(null, "RESULTADO: " + result + " °C\n\nFAHRENHEIT ➙  CELSIUS");
    }

  }

  public void celsandkel(double amount, int typeCase) { // celsius con kelvin
    if (typeCase == 1) {

      double result = Math.round((amount + 273.15) * 10d);
      JOptionPane.showMessageDialog(null, "RESULTADO: " + result + " °K\n\nCELSIUS ➙  KELVIN");
    } else {
      double result = Math.round((amount - 273.15) * 10d);
      JOptionPane.showMessageDialog(null, "RESULTADO: " + result + " °C\n\nKELVIN ➙  CELSIUS");
    }
  }

  public void fahrandkel(double amount, int typeCase) { // fahrenheit y kelvin
    if (typeCase == 1) {
      double result = Math.round((((amount - 32) / 1.8) + 273.15) * 10d);
      JOptionPane.showMessageDialog(null, "RESULTADO: " + result + " °K\n\nFAHRENHEIT ➙  KELVIN");
    } else {

      double result = Math.round(((((amount - 273.15) * 1.8) + 32)) * 10d);
      JOptionPane.showMessageDialog(null, "RESULTADO: " + result + " °F\n\nKELVIN ➙  FAHRENHEIT");
    }
  }
}
