package carParkProject;

public class Car_Park {
	static int currentTicket = 5000;
	static Space[] spacesArray = new Space[10];
	

	public static void main(String[] args) {
		park("XYZ");
		park("ABC");
		unPark(5001);
	}
	
	public static int park(String licence) {
		int ticket = 0;
		for(int i=0;i<spacesArray.length;i++) {
			if(spacesArray[i] == null) {
				spacesArray[i] = new Space(currentTicket, licence);
				currentTicket++;
				return (currentTicket - 1);
			}
		}	
		return ticket;
	}
	
	public static void unPark(int ticket) {
		for(int i=0;i<spacesArray.length;i++) {
			if(Space.getTicket(spacesArray[i]) == ticket) {
				System.out.println("DELETED");
				return;
			}
		}
	}
}
