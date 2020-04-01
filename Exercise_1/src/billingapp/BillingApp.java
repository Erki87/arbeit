package billingapp;

public class BillingApp {

	public static void main(String[] args) {

		 String person_1 = args[0];
		 String person_2 = args[1];
		 String person_3 = args[2];
		 
		 int ausgabePerson1 = Integer.parseInt(person_1);
		 int ausgabePerson2 = Integer.parseInt(person_2);;
		 int ausgabePerson3 = Integer.parseInt(person_3);;

		 int rechnungGesamt = ausgabePerson1 + ausgabePerson2 + ausgabePerson3;;
		 
		 
		 System.out.println("Die gesamte Rechnung in diesem Monat betrug: "+rechnungGesamt);
		 System.out.println();
		 System.out.println("Person 1 hat "+ausgabePerson1+" gezahlt.");
		 System.out.println("Person 2 hat "+ausgabePerson2+" gezahlt.");
		 System.out.println("Person 3 hat "+ausgabePerson3+" gezahlt.");
		 System.out.println();
		 
		 int zwischenRechung = rechnungGesamt /3;
		 
		 System.out.println("Die Durchschnittliche Rechnung pro Person beträgt: "+ zwischenRechung);
		 System.out.println();
		 System.out.println("Person 1 hat "+(zwischenRechung-ausgabePerson1)+" Euro zu wenig bezahlt");
		 System.out.println("Person 2 hat "+(zwischenRechung-ausgabePerson2)+" Euro zu wenig bezahlt");
		 System.out.println("Person 3 hat "+(ausgabePerson3-zwischenRechung)+" Euro zu viel bezahlt");
		 
		 /*
		 
		 if(ausgabePerson1 < zwischenRechung){
			 System.out.println((-1)*(ausgabePerson1-zwischenRechung) + " zuwenig gezahlt");
			 
		 }else if(ausgabePerson1 == zwischenRechung){
			 System.out.println("nicht mehr offen");
		 }else{
			 System.out.println((ausgabePerson1-zwischenRechung) + "zuviel gezahlt");
		 }
		 
		 */
		 
		

	}
	

}
