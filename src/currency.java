public class currency implements convertible {
  private String name;

  public currency(String name) {
    this.name = name;
  }

  @Override
  public void converter(String obj) {

  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "DIVISA: " + this.name;
  }
}
