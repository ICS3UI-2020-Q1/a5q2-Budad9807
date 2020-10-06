import java.util.Scanner;
/**
 *Typing a postive interger prints out numbers in space with comma
 * @author David
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create the count varibale
    int count = 1;
    // create a loop that goes up to 7 with commas
    while(count <= 7){
      // loop action print the number to the console
      System.out.print(count + ",");
      // increase the count
      count = count + 1;
    }
    // it print out 1 through 7 with commas
  }
}