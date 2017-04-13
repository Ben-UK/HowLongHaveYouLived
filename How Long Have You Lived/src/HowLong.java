import java.util.Scanner;

public class HowLong {

	static Scanner scanner = new Scanner(System.in);
	{
		System.out.println("Enter Your DOB in the following format: YYYY");

	}

	public static void input() {

		
		int input = scanner.nextInt();

		
		System.out.println(2017 - input);

		int year = input;
		String yearString;
		switch (year) {

		case 1950:
			yearString = "Korean War begins when North Korean Communist forces invade South Korea.";
			break;
		case 1951:
			yearString = "The first nuclear power plant is built by the US Atomic Energy Commission. Background: Nuclear Energy";
			break;
		case 1952:
			yearString = "George VI of England dies; his daughter becomes Elizabeth II (Feb. 6).";
			break;
		case 1953:
			yearString = "Joseph Stalin dies (March 5). Georgi Malenkov becomes Soviet Premier";
			break;
		case 1954:
			yearString = "Paris agreements grant West Germany sovereignty and admittance to NATO and Western European Union (Oct. 23; effective May, 1955).";
			break;
		case 1955:
			yearString = "Churchill resigns (April 5); Anthony Eden succeeds him (April 6).";
			break;
		case 1956:
			yearString = "The neutrino is first observed at Los Alamos, New Mexico.";
			break;
		case 1957:
			yearString = "Russia launches Sputnik I, first earth-orbiting satellite—the Space Age begins (Oct. 4).";
			break;
		case 1958:
			yearString = "Gen. Charles de Gaulle becomes French premier (June 1), remaining in power until 1969.";
			break;
		case 1959:
			yearString = "Tibet's Dalai Lama escapes to India (Mar. 31).";
			break;
		case 1960:
			yearString = "Top Nazi murderer of Jews, Adolf Eichmann, captured by Israelis in Argentina (May 23)—executed in Israel in 1962.";
			break;
		case 1961:
			yearString = "Alan B. Shepard becomes the first American man in space aboard the Freedom 7. Background: US Staffed Space Flights";
			break;
		case 1962:
			yearString = "Cuban Missile Crisis: USSR to build missile bases in Cuba; Kennedy orders Cuban blockade, lifts blockade after Russia backs down (Aug.-Nov.).";
			break;
		case 1963:
			yearString = "Michael E. De Bakey implants artificial heart in human for first time at Houston hospital (April 21).";
			break;
		case 1964:
			yearString = "Nelson Mandela sentenced to life imprisonment in South Africa (June 11).";
			break;
		case 1965:
			yearString = "The first US combat troops arrive in Vietnam. By the end of the year, 190,000 American soldiers are in Vietnam. Background: Vietnam War";
			break;
		case 1966:
			yearString = "The first Star Trek episode, The Man Trap, is broadcast on September 8. The plot concerns a creature that sucks salt from human bodies.";
			break;
		case 1967:
			yearString = "Israeli and Arab forces battle; Six-Day War ends with Israel occupying Sinai Peninsula, Golan Heights, Gaza Strip and West Bank (June 5). Background: Arab-Israeli Wars";
			break;
		case 1968:
			yearString = "Martin Luther King, Jr., civil rights leader, is slain in Memphis (April 4).";
			break;
		case 1969:
			yearString = "Apollo 11 astronauts—Neil A. Armstrong and Edwin E. Aldrin, Jr., —take first walk on the Moon (July 20).";
			break;
		case 1970:
			yearString = "The Beatles break up. By the end of the year, each member had released a solo album.";
			break;
		case 1971:
			yearString = "Mariner IX, orbitting Mars, takes revealing pictures of the planet's surface. ";
			break;
		case 1972:
			yearString = "Atari introduces the arcade version of Pong, the first video game. The home version comes out in 1974.";
			break;
		case 1973:
			yearString = "At the 1972 Academy Awards, Sacheen Littlefeather stands in for Marlon Brando and refuses his Best Actor Oscar for his role in The Godfather, to protest the U.S. government's treatment of Native Americans.";
			break;
		case 1974:
			yearString = "Richard M. Nixon announces he will resign the next day, the first President to do so (Aug. 8).";
			break;
		case 1975:
			yearString = "One Flew Over the Cuckoo's Nest sweeps the top Oscars, winning Best Picture, Director, Actor, and Actress.";
			break;
		case 1976:
			yearString = "Air France and British Airways begin the first regularly scheduled commercial supersonic transport (SST) flights. ";
			break;
		case 1977:
			yearString = "Star Wars hits theaters--for the first time--and will go on to be the second highest-grossing film of all time.";
			break;
		case 1978:
			yearString = "Sony introduces the Walkman, the first portable stereo.";
			break;
		case 1979:
			yearString = "Conservatives win British election; Margaret Thatcher becomes new prime minister";
			break;
		case 1980:
			yearString = "Ronald Reagan elected president in Republican sweep ";
			break;
		case 1981:
			yearString = "MTV goes on the air running around the clock music videos, debuting with Video Killed the Radio Star.";
			break;
		case 1982:
			yearString = "Michael Jackson releases Thriller, which sells more than 25 million copies, becoming the biggest-selling album in history.";
			break;
		case 1983:
			yearString = "Second space shuttle, Challenger, makes successful maiden voyage, which includes the first US space walk in nine years";
			break;
		case 1984:
			yearString = "Led by Bob Geldof, the band Band Aid releases Do They Know It's Christmas, with proceeds of the single going to feed the starving in Africa.";
			break;
		case 1985:
			yearString = "Dozens of top-name musicians and bands perform at the Live Aid concerts in Philadelphia and London. The shows benefit African famine victims.";
			break;
		case 1986:
			yearString = "Major nuclear accident at Soviet Union's Chernobyl power station alarms world";
			break;
		case 1987:
			yearString = "Prime Minister Thatcher wins rare third term in Britain (June 11).";
		case 1988:
			yearString = "NASA scientist James Hansen warns congress of the dangers of the global warming and the greenhouse effect. ";
			break;
		case 1989:
			yearString = "After 28 years, Berlin Wall is open to West";
			break;
		case 1990:
			yearString = "South Africa frees Nelson Mandela, imprisoned 27½ years (Feb. 11).";
			break;
		case 1991:
			yearString = "Seattle band Nirvana releases the song Smells Like Teen Spirit on the LP Nevermind and enjoys national success. With Nirvana's hit comes the grunge movement, which is characterized by distorted guitars, dispirited vocals and lots of flannel.";
			break;
		case 1992:
			yearString = "Bush and Yeltsin proclaim a formal end to the Cold War (Feb. 1).";
			break;
		case 1993:
			yearString = "British House of Commons approves European unity pact (May 20). Maastricht Treaty takes effect, creating European Union";
			break;
		case 1994:
			yearString = "O. J. Simpson arrested in killings of wife, Nicole Brown Simpson, and friend, Ronald Goldman (June 18).";
			break;
		case 1995:
			yearString = "Nerve gas attack in Tokyo subway kills eight and injures thousands. The Aum Shinrikyo (Supreme Truth) cult is to blame (March 20)";
			break;
		case 1996:
			yearString = "Gangsta rapper Tupac Shakur is shot four times in a drive-by shooting. He dies six days later at age 25.";
			break;
		case 1997:
			yearString = "Hong Kong returns to Chinese rule";
			break;
		case 1998:
			yearString = "Europeans agree on single currency, the euro ";
			break;
		case 1999:
			yearString = "The world awaits the consequences of the Y2K bug, with more drastic millennial theorists warning of Armageddon.";
			break;
		case 2000:
			yearString = "Nationwide uprising overthrows Yugoslavian president Milosevic (Oct. 5); Vojislav Kostunica sworn in as president (Oct. 7).";
			break;
		default:
			yearString = "Invalid year, please enter a year between 1950 and 200";
			break;
		}
		System.out.println("in" + input + yearString);

		// need to add info about number of days months facts etc
	}

}
