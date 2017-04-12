public abstract class Base {

  private String greeting = "Base";

  public void printGreeting() {
    System.out.println("Hello " + greeting + "!");
  }

  public Base(String greeting) {
    this.greeting = greeting;
  }

}
