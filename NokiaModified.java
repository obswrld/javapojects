import java.util.Scanner;
public class NokiaModified {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);			

		String menu = """
			Welcome!
			Menue Fuctions:
			1 =>  Phonebook 
			2 =>  Message
			3 =>  Chat
			4 =>  Call Register
			5 =>  Tones
			6 =>  Settings 
			7 =>  Call Divert
			8 =>  Games
			9 =>  Calculator
			10 => Reminders
			11 => Clock
			12 => Profiles
			13 => SIM service
			0 => Exit
			""";
		
			while (true) {
				System.out.println(menu);
				System.out.println("Please Select an Option:  ");
				int num = input.nextInt();
					
				if (num == 0) {
					System.out.println("Exiting.....");
					break;
				}

				if (num < 1 || num > 13) {
					System.out.println("Invalid Option Please Select a number between 1 and 13");
					continue;
				}
			
				int section1 = num;
				switch (section1) {
					case 1: {
						phonebook(input);
						break;
						}
					case 2: {
						message(input);
						break;
						}
					case 3: {
						System.out.println("Chat");
						goback();
						break;
						}
					case 4: {
						callRegister(input);
						break;
						}
					case 5: {
						tones(input);
						break;
						}
					case 6: {
						settings(input);
						break;
						}
					case 7: {
						System.out.println("Call Divert");
						goback();
						break;
						}
					case 8: {
						System.out.println("Games");
						goback();
						break;
						}
					case 9: {
						System.out.println("Calculator");
						goback();
						break;
						}
					case 10: {
						System.out.println("Reminders");
						goback();
						break;
						}
					case 11: {
						clock(input);
						break;
						}
					case 12: {
						System.out.println("Profiles");
						goback();
						break;
						}
					case 13: {
						System.out.println("SIM services");
						goback();
						break;
						}
				}
			}//first while true
	}

	
	public static void phonebook(Scanner input) {
		String phone = """
				Phonebook Menue: 
				1 => Search
				2 => Service Nos.
				3 => Addname
				4 => Erase 
				5 => Edit
				6 => Assign Tone
				7 => Send b'card 
				8 => Options 
				9 => Speed Dials
				10 => Voice Tags
				0 => Back to menu
				""";
				
				while (true) {
					System.out.println(phone);
					System.out.println("Please Select an Option:  ");
					int num1 = input.nextInt();

					if (num1 == 0) {
					break;
					}

					if (num1 < 1 || num1 > 10) {
						System.out.println("Please Enter a valid Number between 1 and 10");
						continue;
						}

					int phone1 = num1;
					switch (phone1) {
						case 1: {
							System.out.println("Search");
							goback();
							break;
							}
						case 2:  {
							System.out.println("Service Nos");	
							goback();
							break;
							}
						case 3: {
							System.out.println("Addname");
							goback();
							break;
							}
						case 4:  {
							System.out.println("Erase");
							goback();
							break;
							}
						case 5:  {
							System.out.println("Edit");
							goback();
							break;
							}
						case 6:  {
							System.out.println("Assign Tone");
							goback();
							break;
							}
						case 7:  {
							System.out.println("Send b'card");
							goback();
							break;
							}
						case 8: {
							options(input);
							break;
							}
						case 9:  {
							System.out.println("Speed Dials");
							goback();
							break;
							}
						case 10:  {
							System.out.println("Voice Tags");
							goback();
							break;
							}
					}
				}// while true for phonebook 
	}// the phonebook function

	
	public static void options(Scanner input) {
		String options = """
				Options Menue: 
				1 => Type of View
				2 => Memory Status
				0 => Back to Phonebook
				""";
											
			while (true) {	
				System.out.println(options);
				System.out.println("Please Select an Option:  ");
				int num2 = input.nextInt();
									
				if (num2 == 0) {
					break;
				}

				if (num2 < 1 || num2 > 2) {
					System.out.println("Invalid Option. Please Select A Number between 1 and 2");
					continue;
				}
				
				int options1 = num2;
				
				switch (options1) {
					case 1: {
						System.out.println("Type of View");
						goback();
						break;
						}
					case 2: {
						System.out.println("Memory Status");
						goback();
						break;
						}
				}
			} // while for the option
	
	} // the options function in the phonebook function


	public static void message(Scanner input) {
		String message = """
				Message 
				1 => Write message
				2 => Inbox
				3 => Outbox
				4 => Pictures message
				5 => Templates
				6 => Smileys
				7 => Message settings
				8 => Info service
				9 => Voice mailbox number
				10 => Service command editor
				0 => Back to menu						
				""";
									

			while (true) {
					System.out.println(message);
					System.out.println("Please Select an Option:  ");
					int num3 = input.nextInt();

					if (num3 == 0) {
						break;
					}
				
					if (num3 < 1 || num3 > 10) {
						System.out.println("Invalid Number. Please Select a Number between 1 and 10");
						continue;
					}
					
					int messages1 = num3;

					switch (messages1) {
							case 1: {
								System.out.println("Write Message");
								goback();
								break;
								}
							case 2: {
								System.out.println("Inbox");
								goback();
								break;
								}
							case 3: {
								System.out.println("Outbox");
								goback();
								break;
								}
							case 4: {
								System.out.println("Pictures Messages");
								goback();
								break;
								}
							case 5: {
								System.out.println("Templates");
								goback();
								break;
								}
							case 6: {
								System.out.println("Smileys");
								goback();
								break;
								}
							case 7: {
								messageSettings(input);
								break;
								}
							case 8: {
								System.out.println("Info Service");
								goback();
								break;
								}
							case 9: {
								System.out.println("Voice Mailbox Number");
								goback();
								break;
								}
							case 10: {
								System.out.println("Service Comman Editor");
								goback();
								break;
								}		
					}
			}// while for the message function

	}// the message function


	public static void messageSettings(Scanner input) {
		String messageSettings = """
						Message settings 
						1 => Set 1
						2 => Common
						0 => Back to Message  
						""";

						while (true) { 
							System.out.println(messageSettings);
							System.out.println("Please Select an Option:  ");
							int num4 = input.nextInt();

							if (num4 == 0) {
								break;
							}
	
							if (num4 < 1 || num4 > 2) {
								System.out.println("Invalid Number. Please Select A Number between 1 or 2");
								continue;
							}
							
							int messageSettings1 = num4;

							switch (messageSettings1) {
									case 1: {
										set(input);
										break;
										}
									case 2: {
										common(input);
										break;
										}
							}
						} // while for the messageSettings 
	}// the messageSettings method in the message function


	public static void set(Scanner input) {
		String set = """
				Set 1
				1 => Message center number
				2 => Message sent as
				3 => Message validity
				0 => Back to Message Settings
				""";

				while (true) {
					System.out.println(set);
					System.out.println("Please Select an Option:  ");
					int num5 = input.nextInt();
			
					if (num5 == 0) {
						break;
					}
					
					if (num5 < 1 || num5 > 3) {
						System.out.println("Invalid Number. Please Select A Number 1 and 3.");
						continue;
					}

					int set1 = num5;
		
					switch (set1) {
							case 1: {
								System.out.println("Message Center Number");
								goback();
								break;
								}
							case 2: {
								System.out.println("Message Sent as");
								goback();
								break;
								}
							case 3: {
								System.out.println("Message Validity");
								goback();
								break;
								}
					}
				}// while for set function
	}// the set method in the messageSettings function inside the message function 

	
	public static void common(Scanner input) {
		String common = """
					Common 
					1 => Delievery Reports
					2 => Reply Via Same Center
					3 => Character Support
					0 => Back to Message Settings
					""";
	
					while (true) {
						System.out.println(common);
						System.out.println("Please Select an Option:  ");
						int num6 = input.nextInt();
			
						if (num6 == 0) {
							break;
						}

						if (num6 < 1 || num6 > 3) {
							System.out.println("Invalid Number. Please select Number 1 and 3.");
							continue;
						}
						
						int common1 = num6;
	
						switch(common1) {
								case 1: {
									System.out.println("Delievery Reports");
									goback();
									break;
									}
								case 2: {
									System.out.println("Reply Via Same Center");
									goback();
									break;
									}
								case 3: {
									System.out.println("Character Support");
									goback();
									break;
									}
						}
					} // while for the common in the messageSettings function inside the message function 

	}// common method in the messageSettings function inside the message function
	
	
	public static void callRegister(Scanner input) {
		String register = """
					Call register
					1 => Missed calls
					2 => Recieved calls 
					3 => Dialled numbers 
					4 => Erase recent call lists
					5 => Show call duration
					6 => Show call costs
					7 => Call cost limit 
					8 => Prepaid credit
					0 => Back to Menu
					""";
						
					while(true) {
						System.out.println(register);
						System.out.println("Please Select an Option:  ");
						int num7 = input.nextInt();

						if (num7 == 0) {
							break;
						}
			
						if (num7 < 1 || num7 > 8) {
							System.out.println("Invalid Number. Please A Number between 1 and 8");
							continue;
						}

						int register1 = num7;
		
						switch (register1) {
							case 1: {
								System.out.println("Missed calls");
								goback();
								break;
								}
							case 2: {
								System.out.println("Received calls");
								goback();
								break;
								}
							case 3: {
								System.out.println("Dialled numbers");
								goback();
								break;
								}
							case 4: {
								System.out.println("Erase recent calls list");
								goback();
								break;
								}
							case 5: {
								callDuration(input);
								break;
								}
							case 6: {
								callCost(input);
								break;
								}
							case 7: {
								costSettings(input);
								break;
								}
							case 8: {
								System.out.println("Prepaid Credit");
								goback();
								break;
								}
						}
					}// while for the callRegister function


	}// callRegister function


	public static void callDuration(Scanner input) {
		String callDuration = """
					Show all call duration
					1 => Last call duration
					2 => All call's duration
					3 => Recieved calls' duration
					4 => Dialled call's duration
					5 => Clear timers 
					0 => Back to Call Register
					""";

					while (true) {
						System.out.println(callDuration);
						System.out.println("Please Select an Option: ");
						int num8 = input.nextInt();

						if (num8 == 0) {
							break;
						}

						if (num8 < 1 || num8 > 5) {
							System.out.println("Invalid Number. Please Select A Number between 1 and 5.");
							continue;
						}

						int callDuration1 = num8;
			
						switch (callDuration1) {
									case 1: { 
										System.out.println("Last Call Duration");
										goback();
										break;
										}
									case 2: {
										System.out.println("All Call's Duration");
										goback();
										break;
										}
									case 3: {
										System.out.println("Recieved Call's duration");
										goback();
										break;
										}
									case 4: {
										System.out.println("Dialled Call's Duration");
										goback();
										break;
										}
									case 5: {
										System.out.println("Clear Timers");
										goback();
										break;
										}
						}
					}// while for callCuration 
	}// callDuration method in callregister function


	public static void callCost(Scanner input) {
		String callCost = """
				Show call cost
				1 => Last call cost
				2 => All call's cost
				3 => clear counters
				0 => Back to Call Register 
				""";

				while (true) {
					System.out.println(callCost);
					System.out.println("Please Select an option:  ");
					int num9 = input.nextInt();

					if (num9 == 0) {
						break;
					}
			
					if (num9 < 1 || num9 > 3 ) {
						System.out.println("Invalid Number. Please Select A Number between 1 and 3.");
						continue;
					}


					int callCost1 = num9;
					
					switch (callCost1) {
						case 1: {
							System.out.println("Last Call Cost");
							goback();
							break;
							}
						case 2: {
							System.out.println("All Call's Cost");
							goback();
							break;
							}
						case 3: {
							System.out.println("Clear Counters");
							goback();
							break;
							}
					}
				}// while for the callCost method in the callRegister function
	}// callCost function in the callRegister function

		
	public static void costSettings(Scanner input) {
			String costSettings = """
					Call cost settings 
					1 => Call cost limit 
					2 => Show costs in
					0 => Back to Call Register 
					""";
		
					while (true) {
						System.out.println(costSettings);
						System.out.println("Please select an Option:  ");
						int num10 = input.nextInt();

						if (num10 == 0) {
							break;
						}
		
						if (num10 < 1 || num10 > 2) {
							System.out.println("Invalid Number. Please Select A Number between 1 and 2 ");
						}

						int costSettings1 = num10;

						switch (costSettings1) {
							case 1: {
								System.out.println("Call Cost Limit");
								goback();
								break;
								}
							case 2: {
								System.out.println("Show Costs In");
								goback();
								break;
								}
						}
					}// while loop for costSettings in the callRegister function
	}// costSettings method in the callResgister function

	
	public static void tones(Scanner input) {
		String tones = """
				Tones
				1 => Ringing tone
				2 => Ringing volume 
				3 => Incoming call alert
				4 => Composer
				5 => Message alert tone
				6 => Keypad tone
				7 => Warning and games tones
				8 => Vibrating alert
				9 => Screen saver
				0 => Back to Menu
				""";

				while (true) {		
					System.out.println(tones);
					System.out.println("Please Select an Option:  ");
					int num11 = input.nextInt();

					if (num11 == 0) {
						break;
					}
					
					if (num11 < 1 || num11 > 9) {
						System.out.println("Invalid Number. Please Select A Number between 1 and 9");
						continue;
					}
					
					int tones1 = num11;

					switch (tones1) {
						case 1: {
							System.out.println("Ringing Tone");
							goback();
							break;
							}
						case 2: {
							System.out.println("Ringing Volume");
							goback();
							break;	
							}
						case 3: {
							System.out.println("Incoming Call Alert");
							goback();
							break;
							}
						case 4: {
							System.out.println("Composer");
							goback();
							break;
							}
						case 5: {
							System.out.println("Message Alert Tone");
							goback();
							break;
							}
						case 6: {
							System.out.println("Keypad Tones");
							goback();
							break;
							}
						case 7: {
							System.out.println("Warning and Game Tones");
							goback();
							break;
							}
						case 8: {
							System.out.println("Vibrationg Alert");
							goback();
							break;
							}
						case 9: {
							System.out.println("Screen Saver");
							goback();
							break;
							}
					}
				}// while loop for tones function in the menu function
	}// tones method in the menu function


	public static void settings(Scanner input) {
		String settings = """
					Settings
					1 => Call settings
					2 => Phone settings
					3 => Security settings 
					4 => Restore factory settings
					0 => Back to menu 
					""";
					
					while (true) {
							System.out.println(settings);
							System.out.println("Please Select an Option:  ");
							int num13 = input.nextInt();

							if (num13 == 0) {
								break;
							}
				
							if (num13 < 1 || num13 > 4) {
								System.out.println("Invalid Number. Please Select A Number between 1 and 4");
								continue;
							}

							int settings1 = num13;

							switch(settings1) {
									case 1: { 
										callSettings(input);
										break;
										}
									case 2: {
										phoneSettings(input);
										break;
										}
									case 3: {
										security(input);
										break;
										}
									case 4: {
										System.out.println("Restore Factory settings");
										goback();
										break;
										}
							}
					}// while loop for settings method in the menu function 

	}// settings method in the menu function


	public static void callSettings(Scanner input) {
		String callSettings = """
					Call settings
					1 => Automatic redial 
					2 => Speed dialing 
					3 => Call waiting options 
					4 => Own number sending
					5 => Phone line in use 
					6 => Automatic answer
					0 => Back to Settings
					""";

					while (true) {
						System.out.println(callSettings);
						System.out.println("Please Select an Option:  ");
						int num14 = input.nextInt();
		

						if (num14 == 0) {
							break;
						}
			
						if (num14 < 1 || num14 > 6) {
							System.out.println("Invalid Number. Please Select A Number between 1 and 6");
							continue;
						}
						
						int callSettings1 = num14;

						switch (callSettings1) {
							case 1: {
								System.out.println("Automatic Redial");
								goback();
								break;
								}
							case 2: {
								System.out.println("Speed Dialing");
								goback();
								break;
								}
							case 3: {
								System.out.println("Call Waiting Options");
								goback();
								break;
								}
							case 4: {
								System.out.println("Own Number Sending");
								goback();
								break;
								}
							case 5: {
								System.out.println("Phone Line In Use");
								goback();
								break;
								}
							case 6: {
								System.out.println("Automatic Answer");
								goback();
								break;
								}
						} 
					}// while loop for callSettings 

	} // callSettings method in settings function 


	public static void phoneSettings(Scanner input) {
		String phoneSettings = """
				Phone settings 
				1 => Language 
				2 => Cell info display
				3 => Welcome note
				4 => Network selection
				5 => Lights 
				6 => Confirm SIM service actions
				0 => Back to Settings
				""";
	
				while (true) {									
					System.out.println(phoneSettings);
					System.out.println("Please Select an Option:  ");
					int num15 = input.nextInt();
					

					if (num15 == 0) {
						break;
					}

					if (num15 < 1 || num15 > 6) {
						System.out.println("Invalid Number. Please select A Number between 1 and 6");
						continue;
					}												
																		
					int phoneSettings1 = num15;

					switch (phoneSettings1) {
						case 1: {
							System.out.println("Language");
							goback();
							break;
							}
						case 2: {
							System.out.println("Cell Info Display");
							goback();
							break;
							}
						case 3: {
							System.out.println("Welcome Note");
							goback();
							break;
							}
						case 4: {
							System.out.println("Network Selection");
							goback();
							break;
							}
						case 5: {
							System.out.println("Lights");
							goback();
							break;
							}
						case 6: {
							System.out.println("Confirm SIM Services Actions");
							goback();
							break;
							}
					}

			}// while loop for phoneSettings in the settings function
	}// phoneSettings function in the settings function

	public static void security(Scanner input) {
		String security = """
				Security Settings 
				1 => Pin code request
				2 => Call barring service 
				3 => Fixed dialing 
				4 => Closed user group
				5 => Phone security
				6 => Change access codes
				0 => Back to Settings 
				""";

				while (true) {
						System.out.println(security);
						System.out.println("Please Select an Option:  ");
						int num16 = input.nextInt();

						if (num16 == 0){
							break;
						}
		
						if (num16 < 1 || num16 > 6) {
							System.out.println("Invalid Number. Please Select A Number between 1 and 6");
							continue;
						}

						int security1 = num16;

						switch (security1) {
							case 1: {
								System.out.println("Pin Code request");
								goback();
								break;
								}
							case 2: {
								System.out.println("Call Barring services");
								goback();
								break;
								}
							case 3: {
								System.out.println("Fixed Dialing");
								goback();
								break;
								}
							case 4: {
								System.out.println("Closed User Group");
								goback();
								break;
								}
							case 5: {
								System.out.println("Phone Security");
								goback();
								break;
								}
							case 6: {
								System.out.println("Change Access Codes");
								goback();
								break;
								}
						}
				}//while loop in the security function in the settings function
	}// security function in settings function


	public static void clock(Scanner input) {
		String clock = """
				Clock
				1 => Alarm clock
				2 => Clock settings
				3 => Date setting 
				4 => Stopwatch
				5 => Countdown timer
				6 => Auto update of date and time 
				""";
				
				while (true) {
						System.out.println(clock);
						System.out.println("Please select an Option:  ");
						int num12 = input.nextInt();

						if (num12 == 0) {
							break;
						}

						if (num12 < 1 || num12 > 6) {
							System.out.println("Invalid Number. Please Select A Number between 1 and 6");
							continue;
						}
			
						int clock1 = num12;

						switch (clock1) {
							case 1: {
								System.out.println("Alarm Clock");
								goback();
								break;
								}
							case 2: {
								System.out.println("Clock Setting");
								goback();
								break;
								}
							case 3: {
								System.out.println("Date Setting");
								goback();
								break;
								}
							case 4: {
								System.out.println("Stopwatch");
								goback();
								break;
								}
							case 5: {
								System.out.println("Countdown Timer");
								goback();
								break;
								}
							case 6: {
								System.out.println("Auto Update of Date and Time");
								goback();
								break;
								}
						}
				}// while loop in clock function in the menu function

	}//clock method in the menu function

	public static void goback() {
		Scanner input = new Scanner(System.in);
		while (input.nextInt() != 0) {
			System.out.println("Invalid Number boss. Press 0 to go back");
		}
	}

}
