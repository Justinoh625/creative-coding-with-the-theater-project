import org.code.theater.*;

/**
 *a volleyball position
 *Stores the name, description, and handles images
 */
public class VolleyballPosition {
  private String name;
  private String description;

   // Sets up the position with its name and description
  public VolleyballPosition(String name, String description) {
    this.name = name;
    this.description = description;
  }

  // Displays position info on the scene
  public void displayInfo(Scene scene) {
    scene.playSound("Ping-sound-effect.wav");
    scene.drawText("Position: " + name, 120, 50);
    scene.drawImage(getImageName(), 30, 100, 360, 360);
  }

    // overloaded version with custom text position
  public void displayInfo(Scene scene, int x, int y) {
    scene.playSound("Ping-sound-effect.wav");
    scene.drawText("Position: " + name, x, y);
    scene.drawImage(getImageName(), 30, 100, 360, 360);
  }

   // Returns the name of the position
  public String getName() {
    return name;
  }

    // Returns the description of the position
  public String getDescription() {
    return description;
  }

  //Chooses image name based on position
  private String getImageName() {
    if (name.equalsIgnoreCase("Setter")) {
      return "simeonnikollovsetting.jpg";
    }
    if (name.equalsIgnoreCase("Middle Blocker")) {
      return "middleblocker.jpg";
    }
    if (name.equalsIgnoreCase("Outside Hitter")) {
      return "hank.jpg";
    }
    if (name.equalsIgnoreCase("Opposite Hitter")) {
      return "oppositeHitter.jpg";
    } 
    if (name.equalsIgnoreCase("Libero")) {
      return "libero.jpg";
    }
    if (name.equalsIgnoreCase("Defensive Specialist")) {
      return "dsvolleyball.jpg";
    }
    if (name.equalsIgnoreCase("Serving Specialist")) {
      return "servingspecialist.jpg";
    }
    return "Nothing";
}
}