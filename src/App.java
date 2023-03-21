import java.util.Scanner;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class App {
  public static void main(String[] args) {
    Boolean work = true;
    moneyConvert money = new moneyConvert();
    temperatureConvert scale = new temperatureConvert();
    administrativeMeausre measure = new administrativeMeausre();
    while (work) {

      try {
        String options = (JOptionPane.showInputDialog(null, "¿Que tipo de conversion desea realizar?", "MENU",
            JOptionPane.QUESTION_MESSAGE,
            null, new Object[] { "DIVISAS", "TEMPERATURAS",
                "OTRAS UNIDADES DE MEDIDA" },
            "Selection")).toString();
        switch (options) {
          case "DIVISAS":
            String amountOption = JOptionPane.showInputDialog("Ingrese el monto deseado a convertir.");
            if (inputValidator(amountOption.trim())) {
              Double amountInput = Double.parseDouble(amountOption);
              money.convert(amountInput);
              String[] optionProgram = { "SI, CONTINUAR EL PROCESO DE CONVERSION.", "NO, FINALIZAR." };
              int programOption = JOptionPane.showOptionDialog(null, "¿Desea continuar el proceso de conversion?",
                  "¡CONVERSION EXITOSA!", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                  optionProgram, optionProgram[0]);

              if (programOption == 1) {
                JOptionPane.showMessageDialog(null, "✔ PROGRAMA FINALIZADO ✔", "¡Gracias por utilizar el programa!",
                    JOptionPane.INFORMATION_MESSAGE, null);
                work = false;
                break;
              }
            } else {
              JOptionPane.showMessageDialog(null, "ERROR!\n✎ Ingrese caracteres validos.", "Caracter/es invalido/s",
                  JOptionPane.ERROR_MESSAGE, null);
            }
            break;

          case "TEMPERATURAS":
            String scaleOption = JOptionPane.showInputDialog("Ingrese el valor de temperatura deseado a convertir.");
            if (inputValidator(scaleOption)) {
              Double scaleInput = Double.parseDouble(scaleOption);
              scale.convert(scaleInput);
              String[] optionProgram = { "SI, CONTINUAR EL PROCESO DE CONVERSION", "NO, FINALIZAR EL PROGRAMA" };
              int programOption = JOptionPane.showOptionDialog(null, "¿Desea continuar el proceso de conversion?",
                  "¡CONVERSION EXITOSA!", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                  optionProgram, optionProgram[0]);
              if (programOption == 1) {
                JOptionPane.showMessageDialog(null, "✔ PROGRAMA FINALIZADO ✔", "¡Gracias por utilizar el programa!",
                    JOptionPane.INFORMATION_MESSAGE, null);
                work = false;
                break;
              }
            } else {
              JOptionPane.showMessageDialog(null, "ERROR!\n✎ Ingrese caracteres validos.", "Caracter/es invalido/s",
                  JOptionPane.ERROR_MESSAGE, null);

            }
            break;

          case "OTRAS UNIDADES DE MEDIDA":
            String unitOfMeasurement = JOptionPane.showInputDialog("Ingrese el valor deseado a convertir.");
            if (inputValidator(unitOfMeasurement)) {
              Double measureInput = Double.parseDouble(unitOfMeasurement);
              measure.registerUnit(measureInput);
              String[] optionProgram = { "SI, CONTINUAR EL PROCESO DE CONVERSION", "NO, FINALIZAR EL PROGRAMA" };
              int programOption = JOptionPane.showOptionDialog(null, "¿Desea continuar el proceso de conversion?",
                  "¡CONVERSION EXITOSA!", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                  optionProgram, optionProgram[0]);
              if (programOption == 1) {
                JOptionPane.showMessageDialog(null, "✔ PROGRAMA FINALIZADO ✔", "¡Gracias por utilizar el programa!",
                    JOptionPane.INFORMATION_MESSAGE, null);
                work = false;
                break;
              }
            } else {
              JOptionPane.showMessageDialog(null, "ERROR!\n✎ Ingrese caracteres validos.", "Caracter/es invalido/s",
                  JOptionPane.ERROR_MESSAGE, null);

            }
            break;

        }
      } catch (NullPointerException e) {
        JOptionPane.showMessageDialog(null, "✘ PROCESO CANCELADO ✘", "Proceso Cancelado",
            JOptionPane.INFORMATION_MESSAGE, null);
        break;
      }
    }

  }

  public static boolean inputValidator(String strInput) { // validador del ingreso
    return strInput.matches("[0-9]*"); // expresion regular para verificar que SOLAMENTE se ingresen numeros
  }
}
