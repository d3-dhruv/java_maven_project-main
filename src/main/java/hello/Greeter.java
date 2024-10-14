package hello;

public class Greeter {
  private int greetingCount = 0;

  // Method to return a default greeting
  public String sayHello() {
    greetingCount++;
    return "Hello world!";
  }

  // Method to return a personalized greeting
  public String sayHello(String name) {
    greetingCount++;
    return "Hello " + name + "!";
  }

  // Method to say goodbye
  public String sayGoodbye() {
    return "Goodbye!";
  }

  // Method to return the number of greetings made
  public int getGreetingCount() {
    return greetingCount;
  }

  // Method to reset the greeting count
  public void resetGreetingCount() {
    greetingCount = 0;
  }
}
