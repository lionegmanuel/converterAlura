import javax.swing.JOptionPane;

public class administrativeMeausre {
  measureConvert newConvert = new measureConvert();

  public void registerUnit(double input) {
    String typeConvertion = (JOptionPane.showInputDialog(null,
        "Ingrese el tipo de unidad de medida que desee convertir.", "REGISTRO DE UNIDAD DE MEDIDA",
        JOptionPane.PLAIN_MESSAGE, null,
        new Object[] { "֍ Longitud", "֍ Masa", "֍ Tiempo",
            "֍ Intensidad de la Corriente Electrica", "֍ Temperatura Termodinamica", "֍ Cantidad de Sustancia",
            "֍ Intensidad Luminosa" },
        "currencySelection")).toString();
    switch (typeConvertion) {
      case ("֍ Longitud"):
        newConvert.lenght(input);
        break;
      case ("֍ Masa"):
        newConvert.mass(input);
        break;
      case ("֍ Tiempo"):
        newConvert.time(input);
        break;
      case ("֍ Intensidad de la Corriente Electrica"):
        newConvert.electricCurrent(input);
        break;
      case ("֍ Temperatura Termodinamica"):
        newConvert.thermodynamicTemperature(input);
        break;
      case ("֍ Cantidad de Sustancia"):
        newConvert.amountOfSubstance(input);
        break;
      case ("֍ Intensidad Luminosa"):
        newConvert.luminousIntensity(input);
        break;
    }
  }

}
