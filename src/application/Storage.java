package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Hashtable;

import javafx.scene.image.Image;

/**
 * Storage class holds all of the user and general information
 * @author Franklin Guo, Myra Daniels
 */
public class Storage{
	
	/**
	 * Holds all of the User objects for easy access
	 */
	private Hashtable<String, User> allUsers;
	
	/**
	 * Default album that contains stock photos
	 */
	private Album defaultAlbum;
	 
	
	/**
	 * Constructor class for Storage
	 * @throws FileNotFoundException 
	 */
	public Storage() throws FileNotFoundException {
		allUsers = new Hashtable<String, User>();
		defaultAlbum = new Album("stock"); 
		
		//add images to default album
		for(int i = 1; i <= 6; i++) {
    		Path currentRelativePath = Paths.get("");
    		String path = currentRelativePath.toAbsolutePath().toString();
//    		System.out.println("Current absolute path is: " + s);
			try {
				path += "\\data\\stock1.jpeg";
        		Image test = new Image(new FileInputStream(path));  
//        		System.out.println("success");
        		
        	}catch(IOException ex) {
        	    System.out.println("cant load stock");
        	}
			defaultAlbum.addImage(new Photo(("stock" + i), path));
			System.out.println("added");
		}
	}
	
	/**
	 * Used to determine whether or not a particular user already exists
	 * @param username: username used to log in
	 * @return true if user has an account, false if not
	 */
	public Boolean userExists(String username) {
		
		return allUsers.contains(username);
	}
	
	/**
	 * Take in a username and returns the corresponding user
	 * @param username: username of user
	 * @return the User object
	 */
	public User getUser(String username) {
		return allUsers.get(username);
	}
	
	/**
	 * Returns all of the stored logins
	 * @return array list of username's (string)
	 */
	public ArrayList<String> getAllUsernames() {
		return new ArrayList<String>(allUsers.keySet());
	}
	
	/**
	 * Adds a user to the storage
	 * @param username: username of user 
	 * @param user: the user object itself
	 */
	public void addUser(String username, User user) {
		allUsers.put(username, user);
	}
	
	
}