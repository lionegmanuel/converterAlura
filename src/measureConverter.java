import javax.swing.JOptionPane;

public class measureConverter {

  public void kmandm(double amount, int typeCase) { // kilometros y metros
    if (typeCase == 1) {
      double result = Math.round((amount * 1000) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (m) " + result + "\n\nKILOMETROS ➙  METROS");
    } else {
      double result = Math.round((amount / 1000) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (km) " + result + "\n\nMETROS ➙  KILOMETROS");
    }
  }

  public void kmanddm(double amount, int typeCase) { // kilometros y dmimetros
    if (typeCase == 1) {
      double result = Math.round((amount * 10000) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (dm) " + result + "\n\nKILOMETROS ➙  dmIMETROS");
    } else {
      double result = Math.round((amount / 10000) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (km) " + result + "\n\ndmIMETROS ➙  KILOMETROS");
    }
  }

  public void kmandcm(double amount, int typeCase) { // kilometros y centimetros
    if (typeCase == 1) {
      double result = Math.round((amount * 100000) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (cm) " + result + "\n\nKILOMETROS ➙  CENTIMETROS");
    } else {
      double result = Math.round((amount / 100000) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (km) " + result + "\n\nCENTIMETROS ➙  KILOMETROS");
    }
  }

  public void kmandmm(double amount, int typeCase) { // kilometros y milimetros
    if (typeCase == 1) {
      double result = Math.round((amount / 1000000) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (mm) " + result + "\n\nKILOMETROS ➙  MILIMETROS");
    } else {
      double result = Math.round((amount / 1000000) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (km) " + result + "\n\nMILIMETROS ➙  KILOMETROS");
    }
  }

  public void manddm(double amount, int typeCase) { // metros y dmimetros
    if (typeCase == 1) {
      double result = Math.round((amount * 10) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (dm) " + result + "\n\nMETROS ➙  DECIMETROS");
    } else {
      double result = Math.round((amount / 10) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (m) " + result + "\n\nDECIMETROS ➙  METROS");
    }
  }

  public void mandcm(double amount, int typeCase) { // metros y centimetros
    if (typeCase == 1) {
      double result = Math.round((amount * 100) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (cm) " + result + "\n\nMETROS ➙  CENTIMETROS");
    } else {
      double result = Math.round((amount / 100) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (m) " + result + "\n\nCENTIMETROS ➙  METROS");
    }
  }

  public void mandmm(double amount, int typeCase) { // metros y milimetros
    if (typeCase == 1) {
      double result = Math.round((amount * 1000) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (mm) " + result + "\n\nMETROS ➙  MILIMETROS");
    } else {
      double result = Math.round((amount / 1000) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (m) " + result + "\n\nMILIMETROS ➙  METROS");
    }
  }

  public void dmandcm(double amount, int typeCase) { // dmimetros y centimetros
    if (typeCase == 1) {
      double result = Math.round((amount * 10) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (m) " + result + "\n\nDECIMETROS ➙  CENTIMETROS");
    } else {
      double result = Math.round((amount / 10) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (dm) " + result + "\n\nCENTIMETROS ➙  DECIMETROS");
    }
  }

  public void dmandmm(double amount, int typeCase) { // decimetros y milimetros
    if (typeCase == 1) {
      double result = Math.round((amount * 100) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (mm) " + result + "\n\nDECIMETROS ➙  MILIMETROS");
    } else {
      double result = Math.round((amount / 100) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (dm) " + result + "\n\nMILIMETROS ➙  DECIMETROS");
    }
  }

  public void cmandmm(double amount, int typeCase) { // centimetros y milimetros
    if (typeCase == 1) {
      double result = Math.round((amount * 10) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (mm) " + result + "\n\nCENTIMETROS ➙  MILIMETROS");
    } else {
      double result = Math.round((amount / 10) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (cm) " + result + "\n\nMILIMETROS ➙  CENTIMETROS");
    }
  }

  // -----------------------------------
  public void kgandt(double amount, int typeCase) { // kilogramo y tonelada
    if (typeCase == 1) {
      double result = Math.round((amount / 1000) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (t) " + result + "\n\nKILOGRAMOS ➙  TONELADA");
    } else {
      double result = Math.round((amount * 1000) * 10d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (kg) " + result + "\n\nTONELADA ➙  KILOGRAMOS");
    }
  }

  public void kgandgr(double amount, int typeCase) { // kilogramo y gramo
    if (typeCase == 1) {
      double result = Math.round((amount * 1000) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (gr) " + result + "\n\nKILOGRAMOS ➙  GRAMOS");
    } else {
      double result = Math.round((amount / 1000) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (kg) " + result + "\n\nGRAMOS ➙  KILOGRAMOS");
    }
  }

  public void kgandhg(double amount, int typeCase) { // kilogramo y hectogramo
    if (typeCase == 1) {
      double result = Math.round((amount * 10) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (hg) " + result + "\n\nKILOGRAMOS ➙  HECTOGRAMOS");
    } else {
      double result = Math.round((amount / 10) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (kg) " + result + "\n\nHECTOGRAMOS ➙  KILOGRAMOS");
    }
  }

  public void kgandmg(double amount, int typeCase) { // kilogramo y miligramo
    if (typeCase == 1) {
      double result = Math.round((amount * 1000000) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (mg) " + result + "\n\nKILOGRAMOS ➙  MILIGRAMOS");
    } else {
      double result = Math.round((amount / 1000000) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (kg) " + result + "\n\nMILIGRAMOS ➙  KILOGRAMOS");
    }
  }

  public void tandhg(double amount, int typeCase) { // tonelada y hectogramo
    if (typeCase == 1) {
      double result = Math.round((amount * 10000) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (hg) " + result + "\n\nTONELADAS ➙  HECTOGRAMOS");
    } else {
      double result = Math.round((amount / 10000) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (t) " + result + "\n\nHECTOGRAMOS ➙  TONELADAS");
    }
  }

  public void tandg(double amount, int typeCase) { // tonelada y gramo
    if (typeCase == 1) {
      double result = Math.round((amount * 1000000) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (gr) " + result + "\n\nTONELADAS ➙  GRAMOS");
    } else {
      double result = Math.round((amount / 1000000) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (t) " + result + "\n\nGRAMOS ➙  TONELADAS");
    }
  }

  public void tandmg(double amount, int typeCase) { // tonelada y miligramo
    if (typeCase == 1) {
      double result = Math.round((amount * 1.000000000) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (mg) " + result + "\n\nTONELADAS ➙  MILIGRAMOS");
    } else {
      double result = Math.round((amount / 1000000000) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (t) " + result + "\n\nMILIGRAMOS ➙  TONELADAS");
    }
  }

  public void hgandg(double amount, int typeCase) { // hectogramo y gramo
    if (typeCase == 1) {
      double result = Math.round((amount * 100) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (gr) " + result + "\n\nHECTOGRAMOS ➙  GRAMOS");
    } else {
      double result = Math.round((amount / 100) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (hg) " + result + "\n\nGRAMOS ➙  HECTOGRAMOS");
    }
  }

  public void hgandmg(double amount, int typeCase) { // hectogramo y miligramo
    if (typeCase == 1) {
      double result = Math.round((amount * 100000) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (mg) " + result + "\n\nHECTOGRAMOS ➙  MILIGRAMOS");
    } else {
      double result = Math.round((amount / 100000) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (hg) " + result + "\n\nMILIGRAMOS ➙  HECTOGRAMOS");
    }
  }

  public void gandmg(double amount, int typeCase) { // gramo y miligramos
    if (typeCase == 1) {
      double result = Math.round((amount * 1000) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (mg) " + result + "\n\nGRAMOS ➙  MILIGRAMOS");
    } else {
      double result = Math.round((amount / 1000) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (gr) " + result + "\n\nMILIGRAMOS ➙  GRAMOS");
    }
  }

  // ------------------------
  public void msandyear(double amount, int typeCase) { // contempla de milisegundos a años
    if (typeCase == 1) { // ms a seg
      double result = Math.round((amount / 1000) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (seg) " + result + "\n\nMILISEGUNDOS ➙  SEGUNDOS");
    } else if (typeCase == 2) {// ms a min
      double result = Math.round((amount / 60000) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (min) " + result + "\n\nMILISEGUNDOS ➙  MINUTOS");
    } else if (typeCase == 3) { // ms a hs
      double result = Math.round((amount / 3600000) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (hs) " + result + "\n\nMILISEGUNDOS ➙  HORAS");
    } else if (typeCase == 4) { // seg a min
      double result = Math.round((amount * 0.02) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (min) " + result + "\n\nSEGUNDOS ➙  MINUTOS");
    } else if (typeCase == 5) { // seg a horas
      double result = Math.round((amount / 3600) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (hs) " + result + "\n\nSEGUNDOS ➙  HORAS");
    } else if (typeCase == 6) { // seg a dias
      double result = Math.round(amount / 86400);
      JOptionPane.showMessageDialog(null, "RESULTADO: (days) " + result + "\n\nSEGUNDOS ➙  DIAS");
    } else if (typeCase == 7) { // min a hs
      double result = Math.round((amount * 0.02) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (hs) " + result + "\n\nMINUTOS ➙  HORAS");
    } else if (typeCase == 8) { // hs a min
      double result = Math.round((amount * 60) * 100d);
      JOptionPane.showMessageDialog(null, "RESULTADO: (min) " + result + "\n\nHORAS ➙  MINUTOS");
    } else if (typeCase == 9) { // min a days
      double result = Math.round(amount / 1440);
      JOptionPane.showMessageDialog(null, "RESULTADO: (days) " + result + "\n\nMINUTOS ➙  DIAS");
    } else if (typeCase == 10) { // min a week
      double result = Math.round(amount / 10080);
      JOptionPane.showMessageDialog(null, "RESULTADO: (week) " + result + "\n\nMINUTOS ➙  SEMANAS");
    } else if (typeCase == 11) {// hs a semanas
      double result = Math.round(amount * 0.01);
      JOptionPane.showMessageDialog(null, "RESULTADO: (week) " + result + "\n\nHORAS ➙  SEMANAS");
    } else if (typeCase == 12) { // hs a meses
      double result = Math.round(amount / 730.5);
      JOptionPane.showMessageDialog(null, "RESULTADO: (month) " + result + "\n\nHORAS ➙  MESES");
    } else if (typeCase == 13) { // dias a semanas
      double result = Math.round(amount * 0.14);
      JOptionPane.showMessageDialog(null, "RESULTADO: (week) " + result + "\n\nDIAS ➙  SEMANAS");
    } else if (typeCase == 14) { // dias a meses
      double result = Math.round(amount * 0.03);
      JOptionPane.showMessageDialog(null, "RESULTADO: (month) " + result + "\n\nDIAS ➙  MESES");
    } else if (typeCase == 15) { // dias a years
      double result = Math.round(amount / 365);
      JOptionPane.showMessageDialog(null, "RESULTADO: (year) " + result + "\n\nDIAS ➙  AÑOS");
    } else { // years a dias
      double result = Math.round(amount * 365);
      JOptionPane.showMessageDialog(null, "RESULTADO: (days) " + result + "\n\nAÑOS ➙  DIAS");
    }
  }
  // -------------------

  public void ampandmilamp(double amount, int typeCase) { // amperios y miliamperios
    if (typeCase == 1) {
      double result = amount * 1000;
      JOptionPane.showMessageDialog(null, "RESULTADO: (mA) " + result + "\n\nAMPERIOS ➙  MILIAMPERIOS");
    } else {
      double result = amount / 1000;
      JOptionPane.showMessageDialog(null, "RESULTADO: (A) " + result + "\n\nMILIAMPERIOS ➙  AMPERIOS");
    }
  }

  public void ampandmicroamp(double amount, int typeCase) { // amperios y microamperios
    if (typeCase == 1) {
      double result = amount * 1000000;
      JOptionPane.showMessageDialog(null, "RESULTADO: (µA) " + result + "\n\nAMPERIOS ➙  MICROAMPERIOS");
    } else {
      double result = amount / 1000000;
      JOptionPane.showMessageDialog(null, "RESULTADO: (A) " + result + "\n\nMICROAMPERIOS ➙  AMPERIOS");
    }
  }

  public void ampandnanoamp(double amount, int typeCase) { // amperios y nanoamperios
    if (typeCase == 1) {
      double result = amount * 1000000000;
      JOptionPane.showMessageDialog(null, "RESULTADO: (nA) " + result + "\n\nAMPERIOS ➙  NANOAMPERIOS");
    } else {
      double result = amount / 1000000000;
      JOptionPane.showMessageDialog(null, "RESULTADO: (A) " + result + "\n\nNANOAMPERIOS ➙  AMPERIOS");
    }
  }

  public void ampandmegamp(double amount, int typeCase) { // amperios y megamperios
    if (typeCase == 1) {
      double result = amount / 1000000;
      JOptionPane.showMessageDialog(null, "RESULTADO: (MA) " + result + "\n\nAMPERIOS ➙  MEGAMPERIOS");
    } else {
      double result = amount * 1000000;
      JOptionPane.showMessageDialog(null, "RESULTADO: (A) " + result + "\n\nMEGAMPERIOS ➙  AMPERIOS");
    }
  }

  public void miliampandmicroamp(double amount, int typeCase) { // miliamperios y microamperios
    if (typeCase == 1) {
      double result = amount * 1000;
      JOptionPane.showMessageDialog(null, "RESULTADO: (µA) " + result + "\n\nMILIAMPERIOS ➙  MICROAMPERIOS");
    } else {
      double result = amount / 1000;
      JOptionPane.showMessageDialog(null, "RESULTADO: (mA) " + result + "\n\nMICROAMPERIOS ➙  MILIAMPERIOS");
    }
  }

  public void miliampandnanoamp(double amount, int typeCase) { // miliamperios y nanoamperios
    if (typeCase == 1) {
      double result = amount * 1000000;
      JOptionPane.showMessageDialog(null, "RESULTADO: (nA) " + result + "\n\nMILIAMPERIOS ➙  NANOAMPERIOS");
    } else {
      double result = amount / 1000000;
      JOptionPane.showMessageDialog(null, "RESULTADO: (mA) " + result + "\n\nNANOAMPERIOS ➙  MILIAMPERIOS");
    }
  }

  public void miliampandmegamp(double amount, int typeCase) { // miliamperios y megamperios
    if (typeCase == 1) {
      double result = amount / 1000000000;
      JOptionPane.showMessageDialog(null, "RESULTADO: (MA) " + result + "\n\nMILIAMPERIOS ➙  MEGAMPERIOS");
    } else {
      double result = amount * 1000000000;
      JOptionPane.showMessageDialog(null, "RESULTADO: (mA) " + result + "\n\nMEGAMPERIOS ➙  MILIAMPERIOS");
    }
  }

  public void microampandnanoamp(double amount, int typeCase) { // microamperios y nanoamperios
    if (typeCase == 1) {
      double result = amount * 1000;
      JOptionPane.showMessageDialog(null, "RESULTADO: (nA) " + result + "\n\nMICROAMPERIOS ➙  NANOAMPERIOS");
    } else {
      double result = amount / 1000;
      JOptionPane.showMessageDialog(null, "RESULTADO: (µA) " + result + "\n\nNANOAMPERIOS ➙  MICROAMPERIOS");
    }
  }

  public void microampandmegamp(double amount, int typeCase) { // microamperios y megamperios
    if (typeCase == 1) {
      double result = amount / 10000000000000L;
      JOptionPane.showMessageDialog(null, "RESULTADO: (MA) " + result + "\n\nMICROAMPERIOS ➙  MEGAMPERIOS");
    } else {
      double result = amount * 10000000000000L;
      JOptionPane.showMessageDialog(null, "RESULTADO: (µA) " + result + "\n\nMEGAMPERIOS ➙  MICROAMPERIOS");
    }
  }

  public void nanoampdandmegamp(double amount, int typeCase) { // nanoamperios y megamperios
    if (typeCase == 1) {
      double result = amount / 10000000000000000L;
      JOptionPane.showMessageDialog(null, "RESULTADO: (MA) " + result + "\n\nNANOAMPERIOS ➙  MEGAMPERIOS");
    } else {
      double result = amount * 10000000000000000L;
      JOptionPane.showMessageDialog(null, "RESULTADO: (nA) " + result + "\n\nMEGAMPERIOS ➙  NANOAMPERIOS");
    }
  }

}
