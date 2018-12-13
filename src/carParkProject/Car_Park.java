package carParkProject;

public class Car_Park {
	static int currentTicket = 5000;
	static Space[] spacesArray = new Space[10];

	public static void main(String[] args) {
		park("XYZ");
		park("ABC");
		park("EFG");
		unpark(5001);
		compact();
		for (int i = 0; i < spacesArray.length; i++) {
			if(spacesArray[i] != null) {
				System.out.print(Space.getLicence(spacesArray[i]) + ",");
			}else {
				System.out.print(",");
			}
		}
	}

	public static int park(String licence) {
		int ticket = 0;
		for (int i = 0; i < spacesArray.length; i++) {
			if (spacesArray[i] == null) {
				spacesArray[i] = new Space(currentTicket, licence);
				currentTicket++;
				return (currentTicket - 1);
			}
		}
		return ticket;
	}

	public static void unpark(int ticket) {
		for (int i = 0; i < spacesArray.length; i++) {
			if (Space.getTicket(spacesArray[i]) == ticket) {
				spacesArray[i] = null;
				return;
			}
		}
	}

	public static void compact() {
		for (int i = 0; i < spacesArray.length-1; i++) {
			if(spacesArray[i] == null) {
				for(int j = i;j<spacesArray.length-1;j++) {
					spacesArray[j] = spacesArray[j+1];
				}
			}
		}
	}
}
