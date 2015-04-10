/**
 * Raul Buendia
 * @author rdb24057@email.vccs.edu
 * Purpose: Create a class that describes one room in a house. 
 * 			The room will have walls that are painted a color. 
 * 			The floor will either be hard wood, carpeting, or tiled. The room may or may not have windows, 
 * 			but it is possible to have multiple windows in the room. 
 */
public class RoomDriver {

	public static void main(String[] args) {
		//Default room stated in Room
		Room BedRoom = new Room();
		System.out.println("The Bedroom is " + BedRoom);
		
		//The main method will create one room that is painted yellow with hard wood flooring, and 1 window.
		Room RoomOne=new Room ("Yellow", "Hard Wood",1);
		System.out.println("Room one is " + RoomOne);
		
		//The main method must create a second room that is painted purple, has tiled floors, and has no windows. 
		Room RoomTwo =new Room ("Purple","Tiled", 0);
		System.out.println("Room two is " + RoomTwo);
		
		//The main method must also create a room that is carpeted and painted white with 3 windows
		Room RoomThree =new Room ("White","Carpet", 3);
		System.out.println("Room three is " + RoomThree);
	}
}

