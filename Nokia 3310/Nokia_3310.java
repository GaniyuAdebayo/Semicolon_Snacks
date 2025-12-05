import java.util.Scanner;
public class Nokia_3310{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		String menuFunctions = """

		PHONE MENU

		1. Phone book
		2. Messages
		3. Chat
		4. Call register
		5. Tones
		6. Settings
		7. Call divert
		8. Games
		9. Calculator
		10. Reminders
		11. Clock
		12. Profiles
		13. SIM services

""";

System.out.println(menuFunctions);
int menuFunctionsOptions = input.nextInt();

switch (menuFunctionsOptions){
case 1 -> {System.out.println("Phone Book");

	String phoneBook = """

	1. Search
	2. Service Nos.
	3. Add name
	4. Erase
	5. Edit
	6. Assign tone
	7. Send b'card
	8. Options
	9. Speed dials
	10. Voice tags


""";
	System.out.println(phoneBook);
	int phoneBookOptions = input.nextInt();
	switch (phoneBookOptions){
	case 1 -> System.out.println("Search");
	case 2 -> System.out.println("Service Nos.");
	case 3 -> System.out.println("Add name");
	case 4 -> System.out.println("Erase");
	case 5 -> System.out.println("Edit");
	case 6 -> System.out.println("Assign tone");
	case 7 -> System.out.println("Send b'board");
	case 8 -> {System.out.println("Options");

	String options = """


		1. Type of view
		2. Memory status


	""";

		System.out.print(options);
		int optionsOption = input.nextInt();

		switch (optionsOption){

		case 1 -> System.out.println("Type of view");
		case 2 -> System.out.println("Memory status");
		default -> System.out.println("Invalid input");

				}

			}

	case 9 -> System.out.println("Speed dials");
	case 10 -> System.out.println("Voice tags");
	default -> System.out.println("Invalid input");
 
		}
	}
//END OF CASE 1
case 2 -> {System.out.println("Messages"); 							//1

	String messages = """

		1. Write messages
		2. Inbox
		3. Outbox
		4. Picture messages
		5. Templates
		6. Smileys
		7. Message settings
		8. Info service
		9. Voice mailbox number
		10. Service command editor


""";

	System.out.println(messages);
	int messageOptions = input.nextInt();
	switch (messageOptions){ 									//2
	case 1 -> System.out.println("Write messages");
	case 2 -> System.out.println("Inbox");
	case 3 -> System.out.println("Outbox");
	case 4 -> System.out.println("Picture messages");
	case 5 -> System.out.println("Templates");
	case 6 -> System.out.println("Smileys");
	case 7 -> {System.out.println("Message settings"); 				//3


		String messageSettings = """

		1. Set 1^2
		2. Common ^3


	""";
	System.out.println(messageSettings);
	int messageSettingsOptions = input.nextInt();
	switch (messageSettingsOptions){							//4
	case 1 -> {System.out.println("Set 1^2");						//5

	String oneSquare = """

	1. Message centre number
	2. Message sent as
	3. Message validity


""";

	System.out.println(oneSquare);
	int oneSquareOptions = input.nextInt();
	switch (oneSquareOptions){								//6

	case 1 -> System.out.println("Message centre number");
	case 2 -> System.out.println("Message sent as");
	case 3 -> System.out.println("Message validity");
	default -> System.out.println("Invalid input");


						} 							//6




					} 								//5
	case 2 ->	{System.out.println("Common ^3");					//a
	String commonCube = """

	1. Delivery reports
	2. Reply via same centre
	3. Character support


""";

	System.out.println(commonCube);
	int commonCubeOptions = input.nextInt();
	switch(commonCubeOptions){								//b
	case 1 -> System.out.println("Delivery reports");
	case 2 -> System.out.println("Reply via same centre");
	case 3 -> System.out.println("Character support");
	default -> System.out.println("Invalid input");


}													//b
}													//a


				}									//4
			} 										//3

	case 8 -> System.out.println("Info service");
	case 9 -> System.out.println("Voice mailbox number");
	case 10 -> System.out.println("Service command editor");
	default -> System.out.println("Invalid input");
	

		} 											//2

	}												 //1

//END OF CASE 2
case 3 -> System.out.println("Chat");
case 4 -> {System.out.println("Call register");						//1
	String callRegister = """
	
	1. Missed calls
	2. Received calls
	3. Dialed numbers
	4. Erase recent call lists
	5. Show call duration
	6. Show call costs
	7. Call cost settings
	8. Prepaid credit

""";

	System.out.println(callRegister);
	int callRegisterOptions = input.nextInt();
	switch (callRegisterOptions){								//2

	case 1 -> System.out.println("Missed calls");
	case 2 -> System.out.println("Received calls");
	case 3 -> System.out.println("Dialed numbers");
	case 4 -> System.out.println("Erase recent call lists");
	case 5 -> {System.out.println("Show call duration");				//3

	String callDuration = """

	1. Last call duration
	2. All call's duration
	3. Received calls' duration
	4. Dialed calls' duration
	5. Clear timers


""";

	System.out.println(callDuration);
	int callDurationOptions = input.nextInt();
	switch (callDurationOptions){								//3

	case 1 -> System.out.println("Last call duration");
	case 2 -> System.out.println("All calls' duration");
	case 3 -> System.out.println("Received calls' duration");
	case 4 -> System.out.println("Dialed calls' duration");
	case 5 -> System.out.println("Clear timers");
	default -> System.out.println("Invalid input");


}													//3			


}													//3
	case 6 -> {System.out.println("Show call costs");					//a				

	String callCost = """

	1. Last call cost
	2. All calls' cost
	3. Clear counters
""";

	System.out.println(callCost);
	int callCostOptions = input.nextInt();
	switch (callCostOptions){
	case 1 -> System.out.println("Last call cost");
	case 2 -> System.out.println("All calls' cost");
	case 3 -> System.out.println("Clear counters");


}
}													//b

	case 7 -> {System.out.println("Call cost settings");

	String costSettings = """
	1. Call cost limit
	2. Show costs in	

""";
	System.out.println(costSettings);
	int costSettingsOptions = input.nextInt();
	switch (costSettingsOptions){

	case 1 -> System.out.println("Call cost limit");
	case 2 -> System.out.println("Show costs in");
	default -> System.out.println("Invalid input");


}




}
	case 8 -> System.out.println("Prepaid credit");
	default -> System.out.println("Invalid input");


}													//2

}													//1

//END OF CASE 4
case 5 -> {System.out.println("Tones");
	String tones = """

	1. Ringing tone
	2. Ringing volume
	3. Incoming call alert
	4. Composer
	5. Message alert tone
	6. Keypad tones
	7. Warning and game tones
	8. Vibrating alert
	9. Screen saver

""";
	System.out.println(tones);
	int tonesOptions = input.nextInt();

	switch (tonesOptions){

	case 1 -> System.out.println("Ringing tone");
	case 2 -> System.out.println("Ringing volume");
	case 3 -> System.out.println("Incoming call alert");
	case 4 -> System.out.println("Composer");
	case 5 -> System.out.println("Message alert tone");
	case 6 -> System.out.println("Keypad tones");
	case 7 -> System.out.println("Warning and game tones");
	case 8 -> System.out.println("Vibrating alert");
	case 9 -> System.out.println("Screen saver");
	default -> System.out.println("Invalid input");

}


}
case 6 -> {System.out.println("Settings");

	String settings = """

	1. Call settings
	2. Phone settings
	3. Security settings
	4. Restore factory settings 
	""";

	System.out.print(settings);
	int settingsOptions = input.nextInt();
	switch(settingsOptions){

	case 1 -> {System.out.println("Call settings");
	
	String callSettings = """
	1. Automatic redial
	2. Speed dialing
	3. Call waiting options
	4. Own number sending
	5. Phone line in use 
	6. Automatic answer
""";
	System.out.println(callSettings);
	int callSettingsOption = input.nextInt();
	switch (callSettingsOption){

	case 1 -> System.out.println("Automatic redial");
	case 2 -> System.out.println("Speed dialing");
	case 3 -> System.out.println("Call waiting options");
	case 4 -> System.out.println("Own number sending");
	case 5 -> System.out.println("Phone line in use ");
	case 6 -> System.out.println("Automatic answer");
	default -> System.out.println("Invalid input");
}

}
	case 2 -> {System.out.println("Phone settings");
	String phoneSettings = """
	1. Language
	2. Cell info display
	3. Welcome note
	4. Network selection 
	5. Lights
	6. Confirm SIM service actions
""";
	System.out.println(phoneSettings);
	int phoneSettingsOptions = input.nextInt();
	switch (phoneSettingsOptions){
	case 1 -> System.out.println("Language");
	case 2 -> System.out.println("Cell info diplay");
	case 3 -> System.out.println("Welcome note");
	case 4 -> System.out.println("Network selection");
	case 5 -> System.out.println("Lights");
	case 6 -> System.out.println("Confirm SIM service actions");

}
}
	case 3 -> {System.out.println("Security settings");

	String securitySettings = """

	1. PIN code request
	2. Call barring service
	3. Fixed dialing
	4. Closed user group
	5. Phone security
	6. Change access codes
""";

	System.out.println(securitySettings);
	int securitySettingsOptions = input.nextInt();
	switch (securitySettingsOptions){

	case 1 -> System.out.println("PIN code request");
	case 2 -> System.out.println("Call barring service");
	case 3 -> System.out.println("Fixed dialing");
	case 4 -> System.out.println("Closed user group");
	case 5 -> System.out.println("Phone security");
	case 6 -> System.out.println("Change access codes");
	default -> System.out.println("Invalid input");
}
}
	case 4 -> System.out.println("Restore factory settings");
	default -> System.out.println("Invalid input");
}
}
case 7 -> System.out.println("Call divert");
case 8 -> System.out.println("Games");
case 9 -> System.out.println("Calculator");
case 10 -> System.out.println("Reminders");
case 11 -> {System.out.println("Clock");

	String clock = """
	1. Alarm clock
	2. Clock settings
	3. Date settings
	4. Stopwatch
	5. Countdown timer
	6. Auto update of date and time
""";
	System.out.println(clock);
	int clockOptions = input.nextInt();
	switch (clockOptions) {

	case 1 -> System.out.println("Alarm clock");
	case 2 -> System.out.println("Clock settings");
	case 3 -> System.out.println("Date settings");
	case 4 -> System.out.println("Stopwatch");
	case 5 -> System.out.println("Countdown timer");
	case 6 -> System.out.println("Auto update of date and time");
	default -> System.out.println("Invalid input");
}
}
case 12 -> System.out.println("Profiles");
case 13 -> System.out.println("SIM Services");
default -> System.out.println("Invalid input");
}
}

}