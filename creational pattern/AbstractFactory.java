public class AbstractFactory {

  interface Button {
    public void draw();
  }

  class MacButton implements Button{

    @Override
    public void draw() {
      System.out.println("MacButton");
    }
  }

  class WindowsButton implements Button{

    @Override
    public void draw() {
      System.out.println("WindowsButton");
    }
  }

  interface Checkbox {
    public void click();
  }

  class MacCheckbox implements Checkbox{

    @Override
    public void click() {
      System.out.println("MacCheckbox");
    }
  }

  class WindowsCheckbox implements Checkbox{

    @Override
    public void click() {
      System.out.println("WindowsCheckbox");
    }
  }

  interface GuiFactory {
    public Button createButton();
    public Checkbox createCheckbox();
  }

  class MacFactory implements GuiFactory {

    @Override
    public Button createButton() {
      return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
      return new MacCheckbox();
    }
    
  }

  class WindowsFactory implements GuiFactory {

    @Override
    public Button createButton() {
      return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
      return new WindowsCheckbox();
    }
  }

  public static void main(String[] args) {
    AbstractFactory abstractFactory = new AbstractFactory();
    GuiFactory gui = abstractFactory.new MacFactory();
    Button button1 = gui.createButton();
    Checkbox checkbox1 = gui.createCheckbox();
    button1.draw();
    checkbox1.click();

    GuiFactory gui1 = abstractFactory.new WindowsFactory();
    Button button2 = gui1.createButton();
    Checkbox checkbox2 = gui1.createCheckbox();
    button2.draw();
    checkbox2.click();

  }
}