import java.util.Scanner;
public class Nokia {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

			String message = """
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
			""";

				System.out.println(message);
				System.out.println("Please Select an Option:  ");
				int num = input.nextInt();
			
				int value = num;
				switch(value) {
							case 1: {
									String phone = """
									Phonebook Menue: 
									1 => Service
									2 => Service Nos.
									3 => Addname
									4 => Erase 
									5 => Edit
									6 => Assign Tone
									7 => Send b'card 
									8 => Options 
									9 => Speed Dials
									10 => Voice Tags 
									""";
									System.out.println(phone);
									System.out.println("Please Select an Option:  ");
									int num1 = input.nextInt();
				
									int phone1 = num1;
									switch(phone1) {
													case 1: {
									 						System.out.println("Service");
															break;
														}
													case 2:  {
															System.out.println("Service Nos");
															break;
														}
													case 3: {
															System.out.println("Addname");
															break;
														}
													case 4:  {
															System.out.println("Erase");
															break;
														}
													case 5:  {
															System.out.println("Edit");
															break;
														}
													case 6:  {
															System.out.println("Assign Tone");
															break;
														}
													case 7:  {
															System.out.println("Send b'card");
															break;
														}
													case 8:  {
															String options = """
															Options Menue: 
															1 => Type of View
															2 => Memory Status
											
															System.out.println(options);
															System.out.println("Please Select an Option:  ");
															input num2 = input.nextInt();
										
															int options1 = num2;
															switch(options1) {
																			case 1: {
																					System.out.println("Type of View");
																					break;
																				}
																			case 2: {
																					System.out.println("Memory Status");
																					break;
																				}
															}
														}
													case 9:  {
															System.out.println("Speed Dials");
															break;
														}
													case 10:  {
															System.out.println("Voice Tags");
															break;
														}
							
						} 
					case 2: {
							String orders =""" 
							Messages 
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
							""";
						
								System.out.println(orders);
								System.out.println("Please Select an Option:  ");
								int num3 = input.nextInt();
								
								int messages1 = num3;

								switch (meesages1) {
												case 1: {
														System.out.println("Write Message");
														break;
													}
												case 2:  {
														System.out.println("Inbox");
														break;
													}
												case 3: {
														System.out.println("Outbox");
														break;
													}
												case 4: {
														System.out.println("Pictures Messages");
														break;
													}
												case 5: {
														System.out.println("Templates");
														break;
													}
												case 6: {
														System.out.println("Smileys");
														break;
													}
												case 7: {
														String messageSettings = """
														Message Settings:
														1 => Set 1
														2 => Common 
														""";
															System.out.println(messageSettings);
															System.out.println("Please Select an Option:  ");
															int num4 = input.nextInt();

															int messageSettings1 = num4;
															switch (messageSettings) {
																				case 1: {
																						String set = """
																						Set 1 
																						1 => Message Center Number
																						2 => Message Sent as
																						3 => Message Validity
																						""";
																						System.out.println(set);
																						System.out.println("Please Select an Option:  ");
																						int num5 = input.nextInt();
																	
																						int set1 = num5;
																						switch (set1) {
																									case 1: {
																											System.out.println("Message Center Number");
																											break;	
																										}
																									case 2:  {
																											System.out.println("Message Sent as");
																											break;
																										}
																									case 3: {
																											System.out.println("Message Validity");
																											break;
																										}
																						}
																	
				
																					}
																				case 2: {
																						String common = """
																						Common 
																						1 => Delievery Reports 
																						2 => Reply Via Same Center
																						3 => Character Support
																						""";
																							System.out.println(common);
																							System.out.println("Please Select an Option:  ");
																							int num6 = input.nextInt();
	
																							int common1 = num6;
																							switch (common1) {
																											case 1: {
																													System.out.println("Delievery Reports");
																													break;
																												}
																											case 2: {
																													System.out.println("Reply Via Same Center");
																													break;
																												}
																											case 3: {
																													System.out.println("Character Support");
																													break;
																												}
																							}
 
																					}
															}
													}
												case 8: {
														System.out.println("Info Service");
														break;
													}
												case 9: {
														System.out.println("Voice Mailbox Number");
														break;
													}
												case 10: {
														System.out.println("Service Comman Editor");
														break;
													}
										}
								}
				


				}
			}
	} 
} 