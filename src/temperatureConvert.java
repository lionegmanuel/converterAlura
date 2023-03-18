import javax.swing.JOptionPane;

public class temperatureConvert implements convertible {

  temperatureConverter newConverter = new temperatureConverter();

  @Override
  public void convert(double input) {
    String typeConvertion = (JOptionPane.showInputDialog(null,
        "Ingrese el tipo de cambio entre escalas de temperatura que desea realizar.", "CAMBIO DE TEMPERATURA",
        JOptionPane.PLAIN_MESSAGE, null,
        new Object[] { "✳ Grados Celsius a Grados Fahrenheit", "✳ Grados Celsius a Grados Kelvin",
            "✳ Grados Fahrenheit a Grados Celsius",
            "✳ Grados Fahrenheit a Grados Kelvin", "✳ Grados Kelvin a Grados Celsius",
            "✳ Grados Kelvin a Grados Fahrenheit" },
        "currencySelection")).toString();
    switch (typeConvertion) {
      case ("✳ Grados Celsius a Grados Fahrenheit"):
        newConverter.celsandfar(input, 1);
        break;
      case ("✳ Grados Celsius a Grados Kelvin"):
        newConverter.celsandkel(input, 1);
        break;
      case ("✳ Grados Fahrenheit a Grados Celsius"):
        newConverter.celsandfar(input, 2);
        break;
      case ("✳ Grados Fahrenheit a Grados Kelvin"):
        newConverter.fahrandkel(input, 1);
        break;
      case ("✳ Grados Kelvin a Grados Celsius"):
        newConverter.celsandfar(input, 2);
        break;
      case ("✳ Grados Kelvin a Grados Fahrenheit"):
        newConverter.fahrandkel(input, 2);
        break;
    }
  }

}
