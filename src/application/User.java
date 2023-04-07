package application;

import java.util.ArrayList;

/**
 * User class holds all of the information pertaining to each user
 * @author Franklin Guo, Myra Daniels
 */
public class User{

	/**
	 * User's login username
	 */
	private String username;
	
	/**
	 * Contains all of the image locations of the photos that the user has uploaded
	 */
	private ArrayList<String> imageLocations = new ArrayList<String>();
	
	/**
	 * Contains all of the unique albums under this user
	 */
	private ArrayList<Album> albums = new ArrayList<Album>();

	
	/**
	 * Creates User object using a username
	 * @param username
	 */
	public User(String username) {
		this.username = username;
//		albums.add(Main.storage.defaultAlbum);
	}
	
	public void addImage() {
		
	}
	
	
	
	
}