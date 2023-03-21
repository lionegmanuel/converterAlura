import javax.swing.JOptionPane;

public class measureConvert {
  measureConverter newConvert = new measureConverter();

  public void lenght(double input) {

    String typeUnitConvertion = (JOptionPane.showInputDialog(null,
        "Ingrese el tipo de conversion deseada a realizar.", "CAMBIO ENTRE LONGITUDES",
        JOptionPane.PLAIN_MESSAGE, null,
        new Object[] { "֍ Kilmoetro a Metro", "֍ Kilometro a Decimetro", "֍ Kilometro a Centimetro",
            "֍ Kilometro a Milimetro", "֍ Metro a Kilometro", "֍ Metro a Decimetro",
            "֍ Metro a Centimetro", "֍ Metro a Milimetro", "֍ Decimetro a Kilometro",
            "֍ Decimetro a Metro", "֍ Decimetro a Centimetro", "֍ Decimetro a Milimetro", "֍ Centimetro a Kilometro",
            "֍ Hectogramo a Kilogramo", "֍ Centimetro a Decimetro",
            "֍ Centimetro a Milimetro", "֍ Milimetro a Kilometro",
            "֍ Milimetro a Metro", "֍ Milimetro a Decimetro",
            "֍ Milimetro a Centimetro", },
        "currencySelection")).toString();
    switch (typeUnitConvertion) {
      case ("֍ Kilmoetro a Metro"):
        newConvert.kmandm(input, 1);
        break;
      case ("֍ Kilometro a Decimetro"):
        newConvert.kmanddm(input, 1);
        break;
      case ("֍ Kilometro a Centimetro"):
        newConvert.kmandcm(input, 1);
        break;
      case ("֍ Kilometro a Milimetro"):
        newConvert.kmandmm(input, 1);
        break;
      case ("֍ Metro a Kilometro"):
        newConvert.kmandm(input, 2);
        break;
      case ("֍ Metro a Decimetro"):
        newConvert.manddm(input, 1);
        break;
      case ("֍ Metro a Centimetro"):
        newConvert.mandcm(input, 1);
        break;
      case ("֍ Metro a Milimetro"):
        newConvert.mandmm(input, 1);
        break;
      case ("֍ Decimetro a Kilometro"):
        newConvert.kmanddm(input, 2);
        break;
      case ("֍ Decimetro a Metro"):
        newConvert.manddm(input, 2);
        break;
      case ("֍ Decimetro a Centimetro"):
        newConvert.dmandcm(input, 1);
        break;
      case ("֍ Decimetro a Milimetro"):
        newConvert.dmandmm(input, 1);
        break;
      case ("֍ Centimetro a Kilometro"):
        newConvert.kmandcm(input, 2);
        break;
      case ("֍ Centimetro a Milimetro"):
        newConvert.cmandmm(input, 1);
        break;
      case ("֍ Milimetro a Kilometro"):
        newConvert.kmandmm(input, 2);
        break;
      case ("֍ Milimetro a Metro"):
        newConvert.mandmm(input, 2);
        break;
      case ("֍ Milimetro a Decimetro"):
        newConvert.dmandmm(input, 2);
        break;
      case ("֍ Milimetro a Centimetro"):
        newConvert.cmandmm(input, 2);
        break;

    }
  }

  public void mass(double input) {

    String typeUnitConvertion = (JOptionPane.showInputDialog(null,
        "Ingrese el tipo de conversion deseada a realizar.", "CAMBIO ENTRE MASAS",
        JOptionPane.PLAIN_MESSAGE, null,
        new Object[] { "֍ Kilogramo a Gramo", "֍ Kilogramo a Tonelada", "֍ Kilogramo a Hectogramo",
            "֍ Kilogramo a Miligramo ", "֍ Gramo a Kilogramo", "֍ Gramo a Tonelada",
            "֍ Gramo a Hectogramo", "֍ Gramo a Miligramo", "֍ Tonelada a Kilogramo",
            "֍ Tonelada a Gramo", "֍ Tonelada a Hectogramo", "֍ Tonelada a Miligramo", "֍ Hectogramo a Tonelada",
            "֍ Hectogramo a Kilogramo", "֍ Hectogramo a Gramo",
            "֍ Hectogramo a Miligramo", "֍ Miligramo a Tonelada",
            "֍ Miligramo a Kilogramo", "֍ Miligramo a Hectogramo",
            "֍ Miligramo a Gramo", },
        "currencySelection")).toString();
    switch (typeUnitConvertion) {
      case ("֍ Kilogramo a Gramo"):
        newConvert.kgandgr(input, 1);
        break;
      case ("֍ Kilogramo a Tonelada"):
        newConvert.kgandt(input, 1);
        break;
      case ("֍ Kilogramo a Hectogramo"):
        newConvert.kgandhg(input, 1);
        break;
      case ("֍ Kilogramo a Miligramo"):
        newConvert.kgandmg(input, 1);
        break;
      case ("֍ Gramo a Kilogramo"):
        newConvert.kgandgr(input, 2);
        break;
      case ("֍ Gramo a Tonelada"):
        newConvert.tandg(input, 2);
        break;
      case ("֍ Gramo a Hectogramo"):
        newConvert.hgandg(input, 2);
        break;
      case ("֍ Gramo a Miligramo"):
        newConvert.gandmg(input, 1);
        break;
      case ("֍ Tonelada a Kilogramo"):
        newConvert.kgandt(input, 2);
        break;
      case ("֍ Tonelada a Gramo"):
        newConvert.tandg(input, 1);
        break;
      case ("֍ Tonelada a Hectogramo"):
        newConvert.tandhg(input, 1);
        break;
      case ("֍ Tonelada a Miligramo"):
        newConvert.tandmg(input, 1);
        break;
      case ("֍ Hectogramo a Tonelada"):
        newConvert.tandhg(input, 2);
        break;
      case ("֍ Hectogramo a Kilogramo"):
        newConvert.kgandhg(input, 2);
        break;
      case ("֍ Hectogramo a Gramo"):
        newConvert.hgandg(input, 1);
        break;
      case ("֍ Hectogramo a Miligramo"):
        newConvert.hgandmg(input, 1);
        break;
      case ("֍ Miligramo a Tonelada"):
        newConvert.tandmg(input, 2);
        break;
      case ("֍ Miligramo a Kilogramo"):
        newConvert.kgandmg(input, 2);
        break;
      case ("֍ Miligramo a Hectogramo"):
        newConvert.hgandmg(input, 2);
        break;
      case ("֍ Miligramo a Gramo"):
        newConvert.gandmg(input, 2);
        break;

    }
  }

  public void time(double input) {

    String typeUnitConvertion = (JOptionPane.showInputDialog(null,
        "Ingrese el tipo de conversion deseada a realizar.", "CAMBIO ENTRE LONGITUDES",
        JOptionPane.PLAIN_MESSAGE, null,
        new Object[] { "֍ Milisegundos a Segundos", "֍ Milisegundos a Minutos", "֍ Milisegundos a Horas",
            "֍ Segundos a Minutos", "֍ Segundos a Horas", "֍ Segundos a Dias",
            "֍ Minutos a Horas", "֍ Minutos a Dias", "֍ Minutos a Semanas",
            "֍ Horas a Minutos", "֍ Horas a Semanas", "֍ Horas a Meses",
            "֍ Dias a Semanas", "֍ Dias a Meses", "֍ Dias a Años" },
        "currencySelection")).toString();
    switch (typeUnitConvertion) {
      case ("֍ Milisegundos a Segundos"):
        newConvert.msandyear(input, 1);
        break;
      case ("֍ Milisegundos a Minutos"):
        newConvert.msandyear(input, 2);
        break;
      case ("֍ Milisegundos a horas"):
        newConvert.msandyear(input, 3);
        break;
      case ("֍ Segundos a Minutos"):
        newConvert.msandyear(input, 4);
        break;
      case ("֍ Segundos a Horas"):
        newConvert.msandyear(input, 5);
        break;
      case ("֍ Segundos a Dias"):
        newConvert.msandyear(input, 6);
        break;
      case ("֍ Minutos a Horas"):
        newConvert.msandyear(input, 7);
        break;
      case ("֍ Minutos a Dias"):
        newConvert.msandyear(input, 9);
        break;
      case ("֍ Minutos a Semanas"):
        newConvert.msandyear(input, 10);
        break;
      case ("֍ Horas a Minutos"):
        newConvert.msandyear(input, 8);
        break;
      case ("֍ Horas a Semanas"):
        newConvert.msandyear(input, 11);
        break;
      case ("֍ Horas a Meses"):
        newConvert.msandyear(input, 12);
        break;
      case ("֍ Dias a Semanas"):
        newConvert.msandyear(input, 13);
        break;
      case ("֍ Dias a Meses"):
        newConvert.msandyear(input, 14);
        break;
      case ("֍ Dias a Años"):
        newConvert.msandyear(input, 15);
        break;
    }
  }

  public void electricCurrent(double input) {

    String typeUnitConvertion = (JOptionPane.showInputDialog(null,
        "Ingrese el tipo de conversion deseada a realizar.", "CAMBIO ENTRE LONGITUDES",
        JOptionPane.PLAIN_MESSAGE, null,
        new Object[] { "֍ Amperios a Miliamperios", "֍ Amperios a Microamperios", "֍ Amperios a Nanoamperios",
            "֍ Amperios a Megamperios", "֍ Miliamperios a Amperios", "֍ Miliamperios a Microamperios",
            "֍ Miliamperios a Nanoamperios", "֍ Miliamperios a Megamperios", "֍ Microamperios a Amperios",
            "֍ Microamperios a Miliamperios", "֍ Microamperios a Nanoamperios", "֍ Microamperios a Megamperios",
            "֍ Megamperios a Amperios",
            "֍ Megamperios a Miliamperios", "֍ Megamperios a Microamperios",
            "֍ Megamperios a Nanoamperios", "֍ Nanoamperios a Amperios",
            "֍ Nanoamperios a Miliamperios", "֍ Nanoamperios a Microamperios",
            "֍ Nanoamperios a Megamperios" },
        "currencySelection")).toString();
    switch (typeUnitConvertion) {
      case ("֍ Amperios a Miliamperios"):
        newConvert.ampandmilamp(input, 1);
        break;
      case ("֍ Amperios a Microamperios"):
        newConvert.ampandmicroamp(input, 1);
        break;
      case ("֍ Amperios a Nanoamperios"):
        newConvert.ampandnanoamp(input, 1);
        break;
      case ("֍ Amperios a Megamperios"):
        newConvert.ampandmegamp(input, 1);
        break;
      case ("֍ Miliamperios a Amperios"):
        newConvert.ampandmilamp(input, 2);
        break;
      case ("֍ Miliamperios a Microamperios"):
        newConvert.miliampandmicroamp(input, 1);
        break;
      case ("֍ Miliamperios a Nanoamperios"):
        newConvert.miliampandnanoamp(input, 1);
        break;
      case ("֍ Miliamperios a Megamperios"):
        newConvert.miliampandmegamp(input, 1);
        break;
      case ("֍ Microamperios a Amperios"):
        newConvert.ampandmicroamp(input, 2);
        break;
      case ("֍ Microamperios a Miliamperios"):
        newConvert.miliampandmicroamp(input, 2);
        break;
      case ("֍ Microamperios a Nanoamperios"):
        newConvert.microampandnanoamp(input, 1);
        break;
      case ("֍ Microamperios a Megamperios"):
        newConvert.microampandmegamp(input, 1);
        break;
      case ("֍ Megamperios a Amperios"):
        newConvert.ampandmegamp(input, 2);
        break;
      case ("֍ Megamperios a Miliamperios"):
        newConvert.miliampandmegamp(input, 2);
        break;
      case ("֍ Megamperios a Microamperios"):
        newConvert.microampandmegamp(input, 2);
        break;
      case ("֍ Megamperios a Nanoamperios"):
        newConvert.nanoampdandmegamp(input, 2);
        break;
      case ("֍ Nanoamperios a Amperios"):
        newConvert.ampandnanoamp(input, 2);
        break;
      case ("֍ Nanoamperios a Miliamperios"):
        newConvert.miliampandnanoamp(input, 2);
        break;
      case ("֍ Nanoamperios a Microamperios"):
        newConvert.microampandnanoamp(input, 2);
        break;
      case ("֍ Nanoamperios a Megamperios"):
        newConvert.nanoampdandmegamp(input, 1);
        break;
    }
  }

}
