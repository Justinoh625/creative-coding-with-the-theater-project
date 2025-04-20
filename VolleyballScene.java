import org.code.theater.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A custom Scene that shows volleyball positions
 * It lets the user pick one and displays info and images
 */
public class VolleyballScene extends Scene {
  private ArrayList<VolleyballPosition> positions;

  /**
   * Allows to play the main scene
   * Asks the user for input, displays position info or a default screen
   */
  public void playthescene() {
    positions = new ArrayList<VolleyballPosition>();

    addPositions(); // adds the positions to array list

    // Print question and options
    System.out.println("Which volleyball position do you want to learn about?");
    for (VolleyballPosition pos : positions) {
      System.out.println("- " + pos.getName());
    }

    // Get input from user
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your desired position: ");
    String userInput = input.nextLine().trim();

    boolean found = false; // boolean to see if the position entered exists or not

    // look through all positions
    for (VolleyballPosition pos : positions) {
      if (pos.getName().equalsIgnoreCase(userInput)) {
        clear("white"); // clear screen
        pos.displayInfo(this); // show info
        System.out.println(pos.getName() + " - " + pos.getDescription());
        found = true;
      }
    }

    // if there is no match found show a default message
    if (!found) {
      clear("gray");
      drawText("Sorry, this position was not found.", 50, 50);
      drawImage("Redx.png", 30, 55, 360, 360);
      playSound("Buzzer-sound.wav");
      System.out.println("Sorry, this position is not found.");
    }
  }

  /**
   * add all regular and special volleyball positions to the list
   */
  private void addPositions() {
    positions.add(new VolleyballPosition("Setter", "Runs the team offense by setting."));
    positions.add(new VolleyballPosition("Middle Blocker", "Blocks hits and attacks in the middle."));
    positions.add(new VolleyballPosition("Outside Hitter", "Main attacker and good passer."));
    positions.add(new VolleyballPosition("Opposite Hitter", "Handles right side hits and blocks."));
    positions.add(new VolleyballPosition("Libero", "Receives serves and plays back row."));
    positions.add(new SpecialPosition("Defensive Specialist", "Receives serves but does not wear a different jersey."));
    positions.add(new SpecialPosition("Serving Specialist", "Brought in just to serve."));
  }
}