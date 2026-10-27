import java.util.*;
import java.awt.*;
import javax.swing.*;

public class QuacksFrame extends JFrame{
  private static final int HEIGHT=960;
  private static final int WIDTH=1600;
  public QuacksFrame(title){
    super(title);
    setSize(WIDTH,HEIGHT);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    add(new QuacksPanel());
    setVisible(true);
  }
}
