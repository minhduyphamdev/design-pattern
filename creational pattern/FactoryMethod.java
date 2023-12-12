  interface Product {
    public void create();
  }

  class ProductA implements Product {
    @Override
    public void create() {
      System.out.println("ProductA is created");
    }
  }

  class ProductB implements Product {
    @Override
    public void create() {
      System.out.println("ProductB is created");
    }
  }

  interface ConcreteProduct {
    Product factoryMethod();
  }

  class ConcreteProductA implements ConcreteProduct {
    @Override
    public Product factoryMethod() {
      return new ProductA();
    }
  }

  class ConcreteProductB implements ConcreteProduct {
    @Override 
    public Product factoryMethod() {
      return new ProductB();
    }
  }
public class FactoryMethod {
  public static void main(String[] args) {
    ConcreteProduct concreteA = new ConcreteProductA();
    Product productA = concreteA.factoryMethod();
    productA.create();

    ConcreteProduct concreteB = new ConcreteProductB();
    Product productB = concreteB.factoryMethod();
    productB.create();
  }

}
