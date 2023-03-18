import java.util.Scanner;
import javax.swing.Icon;
import javax.swing.JOptionPane;

public class App {
  public static void main(String[] args) {
    Boolean work = true;
    moneyConvert money = new moneyConvert();
    temperatureConvert scale = new temperatureConvert();
    while (work) {
      String options = (JOptionPane.showInputDialog(null, "¿Que tipo de conversion desea realizar?", "MENU",
          JOptionPane.QUESTION_MESSAGE,
          null, new Object[] { "Conversion de divisas", "Conversion de temperaturas" }, "Selection")).toString();
      switch (options) {
        case "Conversion de divisas":
          Boolean flag1 = true;
          while (flag1) {
            String amountOption = JOptionPane.showInputDialog("Ingrese el monto deseado a convertir.");
            if (inputValidator(amountOption)) {
              Double amountInput = Double.parseDouble(amountOption);
              money.convert(amountInput);
              String[] optionProgram = { "SI, CONTINUAR EL PROCESO DE CONVERSION", "NO, FINALIZAR EL PROGRAMA" };
              int programOption = JOptionPane.showOptionDialog(null, "¿Desea continuar el proceso de conversion?",
                  "¡CONVERSION EXITOSA!", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                  optionProgram, optionProgram[0]);
              flag1 = false;
              if (programOption == 1) {
                JOptionPane.showMessageDialog(null, "¡PROGRAMA FINALIZADO!");
                work = false;
                break;
              }
            } else
              JOptionPane.showMessageDialog(null, "¡ERROR!\nIngrese caracteres validos.");

          }
        case "Conversion de temperaturas":
          Boolean flag2 = true;
          while (flag2) {
            String scaleOption = JOptionPane.showInputDialog("Ingrese el valor de temperatura deseado a convertir.");
            if (inputValidator(scaleOption)) {
              Double scaleInput = Double.parseDouble(scaleOption);
              scale.convert(scaleInput);
              String[] optionProgram = { "SI, CONTINUAR EL PROCESO DE CONVERSION", "NO, FINALIZAR EL PROGRAMA" };
              int programOption = JOptionPane.showOptionDialog(null, "¿Desea continuar el proceso de conversion?",
                  "¡CONVERSION EXITOSA!", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                  optionProgram, optionProgram[0]);
              flag2 = false;
              if (programOption == 1) {
                JOptionPane.showMessageDialog(null, "¡PROGRAMA FINALIZADO!");
                work = false;
                break;
              }
            } else
              JOptionPane.showMessageDialog(null, "¡ERROR!\nIngrese caracteres validos.");
          }

      }
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
