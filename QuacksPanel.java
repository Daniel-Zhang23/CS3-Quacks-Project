import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.image.*;
import java.util.*;
import java.awt.event.*;

public class QuacksPanel extends JPanel implements MouseListener{
	private BufferedImage startBG, roundBG, ruby, scoreboard, d1, d2, dPumpkin, dRuby, dDroplet, dropletForward, flame;
	private Map<String,Map<String, BufferedImage>> playerElements;
	private Map<String,Map<Integer, BufferedImage>> tokens;
	private Map<String, BufferedImage> cards;
	
	
	public QuacksPanel() {
		super();
		playerElements=new TreeMap<String, Map<String, BufferedImage>>();
		Map<String, BufferedImage> red=new TreeMap<String, BufferedImage>();
		Map<String, BufferedImage> blue=new TreeMap<String, BufferedImage>();
		Map<String, BufferedImage> green=new TreeMap<String, BufferedImage>();
		Map<String, BufferedImage> yellow=new TreeMap<String, BufferedImage>();
		Map<Integer,BufferedImage> pumpkin=new TreeMap<Integer, BufferedImage>();
		Map<Integer,BufferedImage> moth=new TreeMap<Integer, BufferedImage>();
		Map<Integer,BufferedImage> mushroom=new TreeMap<Integer, BufferedImage>();
		Map<Integer,BufferedImage> spider=new TreeMap<Integer, BufferedImage>();
		Map<Integer,BufferedImage> crowSkull=new TreeMap<Integer, BufferedImage>();
		Map<Integer,BufferedImage> mandrake=new TreeMap<Integer, BufferedImage>();
		Map<Integer,BufferedImage> ghost=new TreeMap<Integer, BufferedImage>();
		cards=new TreeMap<String,BufferedImage>();
		tokens=new TreeMap<String,Map<Integer,BufferedImage>>();
		try {
			
		} catch(Exception e) {
			System.out.println("Error");
			return;
		}
		
		
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		
	}
	
}
