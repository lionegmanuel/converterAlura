public class scale implements convertible {
  private String name;

  public scale(String name) {
    this.name = name;
  }

  @Override
  public void converter(String obj) {

  }

  @Override
  public String toString() {
    return "ESCALA DE TEMPERATURA: " + this.name;
  }
}
