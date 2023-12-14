public class Adapter {
  class EnglishAdaptee {
    public void translate(String word) {
      System.out.println("Hello");
    }
  
  }

  interface VietnameseTarget {
    void send(String s);
  }

  class VietnameseAdapter implements VietnameseTarget {

    private EnglishAdaptee englishAdaptee;

    public VietnameseAdapter(EnglishAdaptee englishAdaptee) {
      this.englishAdaptee = englishAdaptee;
    }

    @Override
    public void send(String s) {
      System.out.println(s);

      englishAdaptee.translate(s);
    }
  }

  public static void main(String[] args) {
    Adapter adapter = new Adapter();
    VietnameseTarget target = adapter.new VietnameseAdapter(adapter.new EnglishAdaptee());

    target.send("Xin chào");
  }
}
