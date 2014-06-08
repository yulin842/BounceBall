import java.awt.*;
import javax.swing.*;

public class BounceBallApp extends JFrame {
  public BounceBallApp() {
    add(new BallControl());
  }

  public static void main(String[] args) {
    JFrame frame = new BounceBallApp();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("BounceBallApp");
    frame.setSize(400, 320);
    frame.setVisible(true);
  }
}
