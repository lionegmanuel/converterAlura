import java.util.ArrayList;

public class temperatureConverter {
  private ArrayList<scale> scales; // registro del total de escalas de temperaturas disponibles para operar
  private double changeType[][]; // registro del total de tipos de cambio entre temperaturas

  public temperatureConverter() {
    this.scales = new ArrayList<scale>();
    this.changeType = new double[3][3]; // la dimension de la matriz DEBE SER proporcional a la cantidad de objetos //
                                        // posibles a operar. En caso de que se deban agregar objetos, se debera
                                        // actualizar la dimension de la matriz.
  }

  public void addTemperatureScale(scale scale) { // registro de escalas de temperaturas a la lista
    scales.add(scale);
  }

  public void showTemperatureScale() { // muestra de las escalas de temperatura registradas
    if (scales.isEmpty())
      System.out.println("¡ERROR!\nNo hay escalas de temperatura registradas.");
    else {
      for (int i = 0; i < scales.size(); i++) {
        System.out.println(scales.get(i));
      }
    }
  }

  public ArrayList<scale> getScales() {
    return scales;
  }

}
