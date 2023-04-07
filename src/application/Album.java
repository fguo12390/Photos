package application;

import java.util.ArrayList;
import java.util.Calendar;

import javafx.scene.image.Image;

/**
 * User class holds all of the information pertaining to each user
 * @author Franklin Guo, Myra Daniels
 */
public class Album{
	
	/**
	 * Earliest taken photo
	 */
	private Photo earliestTaken;
	
	/**
	 * Latest taken photo
	 */
	private Photo latestTaken;
	
	/**
	 * Name of album
	 */
	private String name;
	
	/**
	 * Holds all of the images in the album
	 */
	private ArrayList<Photo> photos;
	
	
	/**
	 * Constructor class for album
	 * @param name: name of album
	 */
	public Album(String name) {
		this.name = name;
		photos = new ArrayList<Photo>();
		latestTaken = null;
		earliestTaken = null;
	}
	
	
	/**
	 * Changes album name to n
	 * @param n: the new name of album
	 */
	public void changeName(String n) {
		name = n;
	}
	
	
	/**
	 * Returns name of album
	 * @return name of album
	 */
	public String getName() {
		return name;
	}
	
	
	/**
	 * Adds an image to the album
	 * @param i: the image to be uploaded
	 */
	public void addImage(Photo i) {
		photos.add(i);
		if(photos.isEmpty()) {
			latestTaken = i;
			earliestTaken = i;
		}else {
			Calendar d = i.getDate();
			Calendar lt = latestTaken.getDate();
			Calendar et = earliestTaken.getDate();
			
			if(et.compareTo(d) > 0) //new earliest taken
				earliestTaken = i;
			else if(lt.compareTo(d) < 0) //new latest taken
				latestTaken = i;
		}
	}
}

