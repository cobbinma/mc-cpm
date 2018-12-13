package carParkProject;

public class Space {
	int ticket;
	String licence;
	
	public Space(int ticket, String licence) {
		this.ticket = ticket;
		this.licence = licence;
	}
	
	public static int getTicket(Space newSpace) {
		return newSpace.ticket;
	}
	
	public static String getLicence(Space newSpace) {
		return newSpace.licence;
	}
}
