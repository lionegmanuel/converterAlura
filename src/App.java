import java.util.Scanner;

import javax.swing.Icon;
import javax.swing.JOptionPane;

public class App {
  public static void main(String[] args) {

    String options = (JOptionPane.showInputDialog(null, "¿Que desea convertir?", "MENU", JOptionPane.QUESTION_MESSAGE,
        null, new Object[] { "Divisas", "Temperaturas" }, "Selection")).toString();
    switch (options) {
      case "Divisas":
        String currencyOption = (JOptionPane.showInputDialog(null, "Seleccione el metodo de cotizacion",
            "DIVISAS A OPERAR", JOptionPane.QUESTION_MESSAGE, null, new Object[] { "PESO A DOLAR", "PESO A EURO",
                "PESO A LIBRA ESTERLINA", "PESO A YEN JAPONES", "PESO A WON SURCOREANO" },
            "convertSelection")).toString();
        switch (currencyOption) {
          case "PESO A DOLAR":

          case "PESO A EURO":
          case "PESO A LIBRA ESTERLINA":
          case "PESO A YEN JAPONES":
          case "PESO A WON SURCOREANO":

        }
      case "Temperaturas":
        System.out.println("En desarrollo...");
    }

  }

  public static boolean inputValidator(String strInput) { // validador del ingreso

    try {
      double input = Double.parseDouble(strInput);
      if (input >= 0 || input < 0)
        ;
      return true;
    } catch (Exception e) {
      System.out.println("¡ERROR! Ingrese caracteres validos");
      return false;
    }

  }
}
