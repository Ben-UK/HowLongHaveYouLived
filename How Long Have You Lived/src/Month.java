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

		// need to add ignore case
		switch (month) {

		case "January":
			monthString = "January is the first month of the year in the Julian and Gregorian calendars, and one of seven Gregorian months with the length of 31 days. The first day of the month is known as New Year's Day. It is, on average, the coldest month of the year within most of the Northern Hemisphere and the warmest month of the year within most of the Southern Hemisphere.";
			break;
		case "February":
			monthString = "Much Ado About Nothing is the only Shakespeare play that mentions February. ";
			break;
		case "March":
			monthString = "Welcome to the third month of the year—or, if you were born before 150 B.C., the first! According to the oldest Roman calendars, one year was ten months long, beginning in March and ending in December. So, what about January and February? They were just two nameless months called winter.";
			break;
		case "April":
			monthString = "According to the Oxford Dictionary an ‘April  gentleman’ once meant ‘a foolish man; specifically  a newly-married husband, considered as a fool.’  ";
			break;
		case "May":
			monthString = "May is generally thought to have been named after Maia, the Greek goddess of fertility";
			break;
		case "June":
			monthString = "The Romans called June “Iunius” or Junius, but it is unclear whether this was after Juno, goddess of marriage, or whether May and June were named for the old and young: ‘maiores’ and ‘juniores’.";
			break;
		case "July":
			monthString = "The month of July is named after Julius Caesar by a decision of the Roman Senate in 44BC as July was the month of his birth.";
			break;
		case "August":
			monthString = "The Romans gave this month its name in 8BC, after the first Roman Emperor Augustus who ruled from 27BC until his death in AD14.";
			break;
		case "September":
			monthString = "The Anglo-Saxons called September Gerst Monath (Barley Month) or Haefest Monath (Harvest Month) celebrating the barley harvest.";
			break;
		case "October":
			monthString = "The ‘October Revolution’ in Russia in 1917 took place in November, but at the time Russians had not yet changed from the Julian calendar.";
			break;
		case "November":
			monthString = "The Anglo-Saxons called November ‘Blotmonath’ after the blood of slaughtered cattle.";
			break;
		case "December":
			monthString = "It is estimated that £11billion will be withdrawn from ATMs in the UK in December. We withdraw more money in December than any other month.";
			break;

		default:
			monthString = "Invalid month, please enter a Month in English";
			break;
		}

		System.out.println("\n====================================\n" + input + ": " + monthString
				+ "\n====================================\n");

	}

}
