/**
 * Raul Buendia
 * @author rdb24057@email.vccs.edu
 * Purpose: Create a class that describes one room in a house. 
 * 			The room will have walls that are painted a color. 
 * 			The floor will either be hard wood, carpeting, or tiled. The room may or may not have windows, 
 * 			but it is possible to have multiple windows in the room. 
 */
public class Room {
	
	private String roomColor;
	private String roomFlooring;
	private int roomWindows;
	
	// Constructor that does not allow input 
	/**
	 * Initializes the rooms to default 
	 */
	public Room(){
		this.roomColor = "Grey";
		this.roomFlooring = "Hard Wood";
		this.roomWindows = 4;
	}
	//Constructor that allows user input
	//Pushes to Driver to allow user to enter his/her choice in color, flooring, and window number. 
	/**
	 * Initializes the rooms input from user
	 * @param roomColor
	 * @param roomFlooring
	 * @param roomWindows
	 */
	public Room(String roomColor, String roomFlooring, int roomWindows){
		this.roomColor = roomColor;
		this.roomFlooring = roomFlooring;
		this.roomWindows= roomWindows;
	}
	//Sets the room color
	public String setRoomColor(){
		return roomColor;
		} 
	/**
	 * Allows the user to input a color of choice.
	 * Returns room color that user input.
	 * @param roomColor
	 */
	//Gets the room color
	public void getRoomColor(String roomColor){
		this.roomColor = roomColor;
		}
	//Sets the room flooring
	public String setRoomFlooring(){
		return roomFlooring;
		} 
	/**
	 * Allows the user to input the flooring of choice.
	 * Returns rooms flooring type that user input.
	 * @param roomFlooring
	 */
	//Gets the room flooring
	public void getRoomFlooring(String roomFlooring){
		this.roomFlooring = roomFlooring;
		}
	//Sets the amount of windows in the room
	public int setRoomWindows(){
		return roomWindows;
		} 
	/**
	 * Allows the user to input the amount of windows in the room.
	 * Returns number of windows in the room.
	 * @param roomWindows
	 */
	//Gets the amount of windows in the room
	public void getRoomWindows(int roomWindows){
		this.roomWindows = roomWindows;
		}	
	/**
	 * Returns the room information.
	 */
	public String toString(){
		return "colored: " + this.roomColor + ", The room flooring is: " + this.roomFlooring + ", The room has: " + this.roomWindows +" windows.";
	}

}