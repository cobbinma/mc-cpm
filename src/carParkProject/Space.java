package carParkProject;

public class Space {
	static int ticket;
	String licence;
	
	public Space(int ticket, String licence) {
		Space.ticket = ticket;
		this.licence = licence;
	}
	
	public static int getTicket(Space newSpace) {
		return Space.ticket;
	}
}
