interface Prototype {
  Prototype clone();
}

class ConcretePrototype implements Prototype {
  private String property;

  public ConcretePrototype (String property) {
    this.property = property;
  }
  public String getProperty() {
    return property;
  }

  public void setProperty(String property) {
    this.property = property;
  }
  
  @Override 
  public Prototype clone() {
    return new ConcretePrototype(this.property);
  }
  
  @Override
  public String toString() {
    return "ConcretePrototype [property=" + property + "]";
  }

}

public class PrototypeExample {
  public static void main(String[] args) {
    Prototype prototype = new ConcretePrototype("property");
    System.out.println(prototype.toString());

    Prototype prototype1 = prototype.clone();
    System.out.println(prototype1.toString());
  }
}
