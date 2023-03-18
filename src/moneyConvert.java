import javax.swing.JOptionPane;

public class moneyConvert implements convertible {

  currencyConverter newConvert = new currencyConverter();

  @Override
  public void convert(double input) {
    String typeConvertion = (JOptionPane.showInputDialog(null,
        "Ingrese el tipo de cotizacion deseado para realizar el cambio.", "COTIZACION Y CAMBIO DE DIVISA",
        JOptionPane.PLAIN_MESSAGE, null,
        new Object[] { "★ Peso Argentino a Dolar", "★ Peso Argentino a Euro", "★ Peso Argentino a Libra Esterlina",
            "★ Peso Argentino a Yen Japones", "★ Peso Argentino a Won Surcoreano", "★ Dolar a Peso Argentino",
            "★ Euro a Peso Argentino", "★ Libra Esterlina a Peso Argentino", "★ Yen Japones a Peso Argentino",
            "★ Won Surcoreano a Peso Argentino" },
        "currencySelection")).toString();
    switch (typeConvertion) {
      case ("★ Peso Argentino a Dolar"):
        newConvert.arsandusd(input, 1);
        break;
      case ("★ Peso Argentino a Euro"):
        newConvert.arsandeur(input, 1);
        break;
      case ("★ Peso Argentino a Libra Esterlina"):
        newConvert.arsandlib(input, 1);
        break;
      case ("★ Peso Argentino a Yen Japones"):
        newConvert.arsandyen(input, 1);
        break;
      case ("★ Peso Argentino a Won Surcoreano"):
        newConvert.arsandwon(input, 1);
        break;
      case ("★ Dolar a Peso Argentino"):
        newConvert.arsandusd(input, 2);
        break;
      case ("★ Euro a Peso Argentino"):
        newConvert.arsandeur(input, 2);
        break;
      case ("★ Libra Esterlina a Peso Argentino"):
        newConvert.arsandlib(input, 2);
        break;
      case ("★ Yen Japones a Peso Argentino"):
        newConvert.arsandyen(input, 2);
        break;
      case ("★ Won Surcoreano a Peso Argentino"):
        newConvert.arsandwon(input, 2);
        break;

    }
  }

}
