
public class App extends Base {

  public App() {
    super("AppBase");
  }

  public App(String greeting) {
    super(greeting);
  }

  public static void main(String[] args) throws InterruptedException {
    new App().printGreeting();
  }
}
