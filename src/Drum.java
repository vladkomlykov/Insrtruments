public class Drum implements Instrument {
  private String size;

  public Drum(String size) {
    this.size = size;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  @Override
  public  void play() {
    System.out.println("Играет барабан" + " " + size);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Drum)) return false;

    Drum caisse = (Drum) o;

    return size != null ? size.equals(caisse.size) : caisse.size == null;
  }

  @Override
  public int hashCode() {
    return size != null ? size.hashCode() : 0;
  }

  @Override
  public String toString() {
    return "Drum{" +
            "size='" + size + '\'' +
            '}';
  }
}