import org.code.theater.*;
/**
 * A special type of VolleyballPosition
 * Changes background color and sound when displayed
 */
public class SpecialPosition extends VolleyballPosition {
  // Sets name and description using the superclass constructor
  public SpecialPosition(String name, String description) {
    super(name, description);
  }
  // this Shows special visuals and sound for this type of position
  @Override
  public void displayInfo(Scene scene) {
    scene.playSound("Magic-Wand-Sound-Effects-_no-copyright__.wav");
    scene.clear("yellow");
    scene.drawText("Special Position: " + getName(), 50, 50);
    scene.drawImage(getImageName(), 30, 100, 360, 360);
  }
  
    // the special positions are the serving specialist and the defensive specialist
  private String getImageName() {
    if (getName().equalsIgnoreCase("Defensive Specialist")) return "dsvolleyball.jpg";
    if (getName().equalsIgnoreCase("Serving Specialist")) return "servingspecialist.jpg";
    return "Nothing";
  }
}