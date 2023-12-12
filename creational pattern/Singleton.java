public class Singleton {
  private static volatile Singleton instance = null;

  public static Singleton getInstance() {
    if ( instance == null ) {
      synchronized (Singleton.class) {
        if ( instance == null ) {
          instance = new Singleton();
        }
      }
    }

    return instance;
  }

  public void showMessage() {
    System.out.println("Hello, I am a Singleton!");
  } 

  public static void main(String[] args) {
    // Get the singleton instance
    Singleton singleton = Singleton.getInstance();

    // Use the singleton instance
    singleton.showMessage();
  }
}
