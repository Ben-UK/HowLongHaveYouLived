import java.util.Scanner;

public class Month {

	static Scanner scanner = new Scanner(System.in);
	{
System.out.println("______________________________________________\n " + "Enter Your Month of birth:");
	}

	public static void input() {

		String input = scanner.next();
		

		String month = input;
		String monthString;

		//need to add ignore case
		switch (month) {

		
		//need to add facts for months
		case "January":
			monthString = "January is the first month of the year in the Julian and Gregorian calendars, and one of seven Gregorian months with the length of 31 days. The first day of the month is known as New Year's Day. It is, on average, the coldest month of the year within most of the Northern Hemisphere and the warmest month of the year within most of the Southern Hemisphere.";
			break;
		case "February":
			monthString = "The first nuclear power plant is built by the US Atomic Energy Commission. Background: Nuclear Energy";
			break;
		case "March":
			monthString = "George VI of England dies; his daughter becomes Elizabeth II (Feb. 6).";
			break;
		case "April":
			monthString = "Joseph Stalin dies (March 5). Georgi Malenkov becomes Soviet Premier";
			break;
		case "May":
			monthString = "Paris agreements grant West Germany sovereignty and admittance to NATO and Western European Union (Oct. 23; effective May, 1955).";
			break;
		case "June":
			monthString = "Churchill resigns (April 5); Anthony Eden succeeds him (April 6).";
			break;
		case "July":
			monthString = "The neutrino is first observed at Los Alamos, New Mexico.";
			break;
		case "August":
			monthString = "Russia launches Sputnik I, first earth-orbiting satellite—the Space Age begins (Oct. 4).";
			break;
		case "September":
			monthString = "Gen. Charles de Gaulle becomes French premier (June 1), remaining in power until 1969.";
			break;
		case "October":
			monthString = "Tibet's Dalai Lama escapes to India (Mar. 31).";
			break;
		case "November":
			monthString = "Top Nazi murderer of Jews, Adolf Eichmann, captured by Israelis in Argentina (May 23)—executed in Israel in 1962.";
			break;
		case "December":
			monthString = "Alan B. Shepard becomes the first American man in space aboard the Freedom 7. Background: US Staffed Space Flights";
			break;

		default:
			monthString = "Invalid month, please enter a Month in English";
			break;
		}

		System.out.println("\n====================================\n" + input + " " + monthString + "\n====================================\n");

	}

}
