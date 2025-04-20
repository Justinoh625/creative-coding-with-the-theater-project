import org.code.theater.*;

public class TheaterRunner {
  public static void main(String[] args) {
    VolleyballScene scene = new VolleyballScene();
    scene.playthescene(); // Run the scene
    Theater.playScenes(scene); // Start the theater
  }
}