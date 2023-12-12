public class BuilderFactory {

  class Product {
    private String field1;
    private String field2;

    public String getField1() {
      return field1;
    }

    public String getField2() {
      return field2;
    }

    public void setField1(String field1) {
      this.field1 = field1;
    }

    public void setField2(String field2) {
      this.field2 = field2;
    }

    @Override
    public String toString() {
      return "Product{" +
          "field1='" + field1 + '\'' +
          ", field2='" + field2 + '\'' +
          '}';
    }
  }

  interface Builder {
    ConcreteBuilder buildField1(String field1);
    ConcreteBuilder buildField2(String field2);
    Product getResult();
  }

  class ConcreteBuilder implements Builder {
    private Product product = new Product();

    @Override
    public ConcreteBuilder buildField1(String field1) {
      product.setField1(field1);
      return this;
    }

    @Override
    public ConcreteBuilder buildField2(String field2) {
      product.setField2(field2);
      return this;
    }

    @Override
    public Product getResult() {
      return product;
    }

  }

  public static void main(String[] args) {
    BuilderFactory builderFactory = new BuilderFactory();
    ConcreteBuilder concreteBuilder = builderFactory.new ConcreteBuilder();
    Product product = concreteBuilder.buildField1("a").buildField2("b").getResult();
    System.out.println(product.toString());
  }
}