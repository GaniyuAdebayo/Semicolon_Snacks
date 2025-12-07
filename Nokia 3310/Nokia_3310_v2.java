import java.util.Scanner;
public class Nokia_3310_v2 {

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		boolean first = true;
		
		while (first == true){

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
			
			case 1: 
			System.out.println("Phone Book");

				boolean second = true;
				while (second == true)
				{
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
					11. Main menu
					12. Exit


					""";
					System.out.println(phoneBook);
					int phoneBookOptions = input.nextInt();
				
					switch (phoneBookOptions){
					case 1:
					System.out.println("Search");
					System.exit(0);
					break;

					case 2:
					System.out.println("Service Nos.");
					System.exit(0);
					break;
	
					case 3:
					System.out.println("Add name");
					System.exit(0);
					break;

					case 4: 
					System.out.println("Erase");
					System.exit(0);
					break;
	
					case 5: 
					System.out.println("Edit");
					System.exit(0);
					break;
				
					case 6: 
					System.out.println("Assign tone");
					System.exit(0);
					break;

					case 7:
					System.out.println("Send b'board");
					System.exit(0);
					break;

					case 8: 
					System.out.println("Options");
						

						boolean third = true;
						while (third == true){

						String options = """


						1. Type of view
						2. Memory status
						3. Back
						4. Main menu
						4. Exit


						""";

						System.out.print(options);
						int optionsOption = input.nextInt();

						switch (optionsOption){

						case 1:
						System.out.println("Type of view");
						System.exit(0);
						
						
						case 2:
						System.out.println("Memory status");
						System.exit(0);
						

						case 3:
						third = false;
						continue;

						case 4:
						third = false;
						second = false;						

						default:
						System.out.println("Invalid input");
						System.exit(0);

							}



						}
					break;

					case 9:
					System.out.println("Speed dials");
					System.exit(0);
					break;
				
					case 10:
					System.out.println("Voice tags");
					System.exit(0);
					break;
				
					case 11:
					second = false;
					break;
				
					case 12:
					System.exit(0);
					break;

					default:
					System.out.println("Invalid input");
					System.exit(0);
					break;

						
					}
				}
			break;
			
			case 2:
			System.out.println("Messages");
			
				boolean fourth = true;
				while (fourth == true){
					
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
					11. Back
					12. Exit


					""";

					System.out.println(messages);
					int messageOptions = input.nextInt();

					switch (messageOptions){
					case 1:
					System.out.println("Write messages");
					System.exit(0);
					break;

					case 2:
					System.out.println("Inbox");
					System.exit(0);
					break;

					case 3:
					System.out.println("Outbox");
					System.exit(0);
					break;

					case 4:
					System.out.println("Picture messages");
					System.exit(0);
					break;
		
					case 5:
					System.out.println("Templates");
					System.exit(0);
					break;

					case 6:
					System.out.println("Smileys");
					System.exit(0);
					break;

					case 7:
					System.out.println("Message settings");

						boolean fifth = true;
						while (fifth == true)
						{
							String messageSettings = """

							1. Set 1
							2. Common
							3. Back
							4. Main menu
							5. Exit


							""";
		
							System.out.println(messageSettings);
							int messageSettingsOptions = input.nextInt();

							switch (messageSettingsOptions){
							case 1:
							System.out.println("Set 1");
							
								boolean sixth = true;
								while (sixth == true){

									String oneSquare = """

									1. Message centre number
									2. Message sent as
									3. Message validity
									4. Back
									5. Exit


									""";

									System.out.println(oneSquare);
									int oneSquareOptions = input.nextInt();
									
									switch (oneSquareOptions){

									case 1:
									System.out.println("Message centre number");
									System.exit(0);
									break;
									
									case 2:
									System.out.println("Message sent as");
									System.exit(0);
									break;

									case 3:
									System.out.println("Message validity");
									System.exit(0);		
									break;

									case 4:
									sixth = false;
									break;
									
									case 5:
									System.exit(0);
									break;

									default:
									System.out.println("Invalid input");
									System.exit(0);


									}

								}
							
							case 2:
							System.out.println("Common");

								boolean seventh = true;
								while (seventh == true){

									String commonCube = """
						
									1. Delivery reports
									2. Reply via same centre
									3. Character support
									4. Back
									5. Exit


									""";

									System.out.println(commonCube);
									int commonCubeOptions = input.nextInt();

									switch(commonCubeOptions){

									case 1:
									System.out.println("Delivery reports");
									System.exit(0);
									break;

									case 2:
									System.out.println("Reply via same centre");
									System.exit(0);
									break;

									case 3:
									System.out.println("Character support");
									System.exit(0);
									break;

									case 4:
									seventh = false;
									break;

									case 5:
									System.exit(0);
									break;

									default:
									System.out.println("Invalid input");
									System.exit(0);

									}


								}
							
							case 3:
							fifth = false;
							break;
							
							case 4:
							fifth = false;
							fourth = false;
							break;

							case 5:
							System.exit(0);
							
							}



						}
					break;

					case 8:
					System.out.println("Info service");
					System.exit(0);
					break;

					case 9:
					System.out.println("Voice mailbox number");
					System.exit(0);
					break;

					case 10:
					System.out.println("Service command editor");
					System.exit(0);
					break;
		
					case 11:
					fourth = false;
					break;

					case 12:
					System.exit(0);
					break;

					default:
					System.out.println("Invalid input");
					System.exit(0);

					}
			

				}
			break;

			case 3:
			System.out.println("Chat");
			first = false;
			break;

			case 4:
			System.out.println("Call register");

				boolean eight = true;
				while (eight == true){

					String callRegister = """
	
					1. Missed calls
					2. Received calls
					3. Dialed numbers
					4. Erase recent call lists
					5. Show call duration
					6. Show call costs
					7. Call cost settings
					8. Prepaid credit
					9. Back

					""";

					System.out.println(callRegister);
					int callRegisterOptions = input.nextInt();
	
					switch (callRegisterOptions){
					case 1:
					System.out.println("Missed calls");
					System.exit(0);
					break;

					case 2:
					System.out.println("Received calls");
					System.exit(0);
					break;

					case 3:
					System.out.println("Dialed numbers");
					System.exit(0);
					break;

					case 4:
					System.out.println("Erase recent call lists");
					System.exit(0);
					break;

					case 5:
					System.out.println("Show call duration");
					
						boolean eleventh = true;
						while (eleventh == true){

							String callDuration = """

							1. Last call duration
							2. All call's duration
							3. Received calls' duration
							4. Dialed calls' duration
							5. Clear timers
							6. Back

							""";

							System.out.println(callDuration);
							int callDurationOptions = input.nextInt();

							switch (callDurationOptions){
							case 1:
							System.out.println("Last call duration");
							System.exit(0);
							break;

							case 2:
							System.out.println("All calls' duration");
							System.exit(0);
							break;

							case 3:
							System.out.println("Received calls' duration");
							System.exit(0);
							break;

							case 4:
							System.out.println("Dialed calls' duration");
							System.exit(0);
							break;

							case 5:
							System.out.println("Clear timers");
							System.exit(0);
							break;

							case 6:
							eleventh = false;
							break;

							default:
							System.out.println("Invalid input");
							System.exit(0);


							}



						}
					break;

					case 6:
					System.out.println("Show call costs");
					
						boolean ninth = true;
						while (ninth == true){
						
							String callCost = """

							1. Last call cost
							2. All calls' cost
							3. Clear counters
							4. Back
							""";

							System.out.println(callCost);
							int callCostOptions = input.nextInt();
	
							switch (callCostOptions){

							case 1:
							System.out.println("Last call cost");
							System.exit(0);
							break;

							case 2:
							System.out.println("All calls' cost");
							System.exit(0);
							break;

							case 3:
							System.out.println("Clear counters");
							System.exit(0);

							case 4:
							ninth = false;
							break;

							default:
							System.out.println("Invalid Input");
							System.exit(0);


							}



						}
					break;

					case 7:
					System.out.println("Call cost settings");
					
						boolean tenth = true;
						while (tenth == true){

							String costSettings = """
							1. Call cost limit
							2. Show costs in
							3. Back	

							""";

							System.out.println(costSettings);
							int costSettingsOptions = input.nextInt();
						
							switch (costSettingsOptions){

							case 1:
							System.out.println("Call cost limit");
							System.exit(0);
							break;

							case 2:
							System.out.println("Show costs in");
							System.exit(0);
							break;
							
							case 3:
							tenth = false;
							break;

							default:
							System.out.println("Invalid input");
							System.exit(0);


							}
	

						}
					break;

					case 8:
					System.out.println("Prepaid credit");
					System.exit(0);
					break;

					case 9:
					eight = false;
					break;

					default:
					System.out.println("Invalid input");
					System.exit(0);

					}


				}
			break;

			case 5:
			System.out.println("Tones");

				boolean twelfth = true;
				while (twelfth == true){

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
					10. Back

					""";
					System.out.println(tones);
					int tonesOptions = input.nextInt();

					switch (tonesOptions){

					case 1:
					System.out.println("Ringing tone");
					System.exit(0);
					break;

					case 2:
					System.out.println("Ringing volume");
					System.exit(0);
					break;

					case 3:
					System.out.println("Incoming call alert");
					System.exit(0);
					break;

					case 4:
					System.out.println("Composer");
					System.exit(0);
					break;

					case 5:
					System.out.println("Message alert tone");
					System.exit(0);
					break;

					case 6:
					System.out.println("Keypad tones");
					System.exit(0);
					break;

					case 7:
					System.out.println("Warning and game tones");
					System.exit(0);
					break;

					case 8:
					System.out.println("Vibrating alert");
					System.exit(0);
					break;

					case 9:
					System.out.println("Screen saver");
					System.exit(0);
					break;

					case 10:
					twelfth = false;
					break;

					default:
					System.out.println("Invalid input");
					System.exit(0);

					}



				}
			break;
			
			case 6:
			System.out.println("Settings");

				boolean thirteenth = true;
				while (thirteenth = true){

					String settings = """

					1. Call settings
					2. Phone settings
					3. Security settings
					4. Restore factory settings 
					5. Back
					""";

					System.out.print(settings);
					int settingsOptions = input.nextInt();
				
					switch(settingsOptions){

					case 1:
					System.out.println("Call settings");

						boolean fourteenth = true;
						while (fourteenth == true){

							String callSettings = """
							1. Automatic redial
							2. Speed dialing
							3. Call waiting options
							4. Own number sending
							5. Phone line in use 
							6. Automatic answer
							7. Back
							""";
						
							System.out.println(callSettings);
							int callSettingsOption = input.nextInt();
						
							switch (callSettingsOption){

							case 1:
							System.out.println("Automatic redial");
							System.exit(0);
							break;

							case 2:
							System.out.println("Speed dialing");
							System.exit(0);
							break;

							case 3:
							System.out.println("Call waiting options");
							System.exit(0);
							break;

							case 4:
							System.out.println("Own number sending");
							System.exit(0);
							break;

							case 5:
							System.out.println("Phone line in use ");
							System.exit(0);
							break;

							case 6:
							System.out.println("Automatic answer");
							System.exit(0);
							break;

							case 7:
							fourteenth = false;
							break;

							default:
							System.out.println("Invalid input");
							System.exit(0);


							}
						}
					break;

					case 2:
					System.out.println("Phone settings");

						boolean fifteenth = true;
						while (fifteenth == true){

							String phoneSettings = """
							1. Language
							2. Cell info display
							3. Welcome note
							4. Network selection 
							5. Lights
							6. Confirm SIM service actions
							7. Back
							""";
							
							System.out.println(phoneSettings);
							int phoneSettingsOptions = input.nextInt();
							
							switch (phoneSettingsOptions){

							case 1:
							System.out.println("Language");
							System.exit(0);
							break;

							case 2:
							System.out.println("Cell info diplay");
							System.exit(0);
							break;

							case 3:
							System.out.println("Welcome note");
							System.exit(0);
							break;

							case 4:
							System.out.println("Network selection");
							System.exit(0);
							break;

							case 5:
							System.out.println("Lights");
							System.exit(0);
							break;

							case 6:
							System.out.println("Confirm SIM service actions");
							System.exit(0);
							break;

							case 7:
							fifteenth = false;
							break;

							default:
							System.exit(0);

							}
						}
					break;
				
					case 3:
					System.out.println("Security settings");

						boolean sixteenth = true;
						while (sixteenth == true){
						
							String securitySettings = """

							1. PIN code request
							2. Call barring service
							3. Fixed dialing
							4. Closed user group
							5. Phone security
							6. Change access codes
							7. Back
							""";

							System.out.println(securitySettings);
							int securitySettingsOptions = input.nextInt();
	
							switch (securitySettingsOptions){

							case 1:
							System.out.println("PIN code request");
							System.exit(0);
							break;

							case 2:
							System.out.println("Call barring service");
							System.exit(0);
							break;

							case 3:
							System.out.println("Fixed dialing");
							System.exit(0);
							break;

							case 4:
							System.out.println("Closed user group");
							System.exit(0);
							break;

							case 5:
							System.out.println("Phone security");
							System.exit(0);
							break;

							case 6:
							System.out.println("Change access codes");
							System.exit(0);
							break;

							case 7:
							sixteenth = false;

							default:
							System.out.println("Invalid input");
							System.exit(0);

							}

						}
					break;
					
					case 4:
					System.out.println("Restore factory settings");
					System.exit(0);
					break;

					case 5:
					thirteenth = false;
					break;
					
					default:
					System.out.println("Invalid input");

					}

				}
			break;

			case 7:
			System.out.println("Call divert");
			first = false;
			break;
			
			case 8:
			System.out.println("Games");
			first = false;
			break;
			
			case 9:
			System.out.println("Calculator");
			first = false;
			break;
			
			case 10:
			System.out.println("Reminders");
			first = false;
			break;

			case 11:
			System.out.println("Clock");

				boolean seventeenth = true;
				while (seventeenth == true){

					String clock = """
					1. Alarm clock
					2. Clock settings
					3. Date settings
					4. Stopwatch
					5. Countdown timer
					6. Auto update of date and time
					7. Back
					""";

					System.out.println(clock);
					int clockOptions = input.nextInt();

					switch (clockOptions) {

					case 1:
					System.out.println("Alarm clock");
					System.exit(0);
					break;

					case 2:
					System.out.println("Clock settings");
					System.exit(0);
					break;

					case 3:
					System.out.println("Date settings");
					System.exit(0);
					break;

					case 4:
					System.out.println("Stopwatch");
					System.exit(0);
					break;

					case 5:
					System.out.println("Countdown timer");
					System.exit(0);
					break;

					case 6:
					System.out.println("Auto update of date and time");
					System.exit(0);
					break;

					case 7:
					seventeenth = false;
					break;

					default:
					System.out.println("Invalid input");
					System.exit(0);

					}

				}
			break;

			case 12: 
			System.out.println("Profiles");
			first = false;
			break;

			case 13: 
			System.out.println("SIM Services");
			first = false;
			break;

			default: 
			System.out.println("Invalid input");
			first = false;
			break;



			}

		}



	}
}