package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Calendar;

import javafx.scene.image.Image;

/**
 * Photo class allows the create of a photo with relevant information
 * @author Franklin Guo, Myra Daniels
 */
public class Photo{
	
	/**
	 * Name of photo
	 */
	private String name;
	
	private String path;
	
	/**
	 * The date information regarding the image
	 */
	private Calendar calendar;
	
	/**
	 * The actual image
	 */
	private Image i;
	
	
	/**
	 * Creates photo object
	 * @param n: the name of the photo
	 * @param img: the image
	 * @param p: the path to the image
	 */
	public Photo(String n, Image img, String p) {
		i = img;
		calendar = Calendar.getInstance();
		name = n;
		path = p;
	}
	
	/**
	 * Creates photo object
	 * @param n: the name of the photo
	 * @param p: the path to the image
	 * @throws FileNotFoundException 
	 */	
	public Photo(String n, String p) throws FileNotFoundException {
		i = new Image(new FileInputStream(p));  
		calendar = Calendar.getInstance();
		name = n;
		path = p;
	}
	
	public Calendar getDate() {
		return calendar;
	}
	
	
}