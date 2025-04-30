import java.util.Scanner;
public class NokiaPhoneModified{
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
			12 => Profiles
			13 => SIM service
			""";

				System.out.println(message);
				System.out.println("Please Select an Option:  ");
				int num = input.nextInt();

				int section1 = num;
				
				switch (section1) {
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
									switch (phone1) {
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
															""";
											
															System.out.println(options);
															System.out.println("Please Select an Option:  ");
															int num2 = input.nextInt();
										
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
														break;
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
				

					} // case 1 end 
				case 2: {
					String message1 = """
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
									""";

									System.out.println(message1);
									System.out.println("Please Select an Option:  ");
									int num3 = input.nextInt();

									int messages2 = num3;

									switch (messages2) {
													case 1: {
															System.out.println("Write Message");
															break;
														}
													case 2: {
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
															System.out.println("Templates");
															break;
														}
													case 7: {
															String messageSettings = """
																				Message settings 
																				1 => Set 1
																				2 => Common
																				""";

																				System.out.println(messageSettings);
																				System.out.println("Please Select an Option:  ");
																				int num4 = input.nextInt();
	
																				int messageSettings1 = num4;

																				switch (messageSettings1) {
																										case 1: {
																												String set = """
																															Set 1
																															1 => Message center number
																															2 => Message sent as
																															3 => Message validity
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
																																		case 2: {
																																				System.out.println("Message Sent as");
																																				break;
																																			}
																																		case 3: {
																																				System.out.println("Message Validity");
																																				break;
																																			}
																															}
																											break;
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
																											break;			
																											}
																				}
														break;
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
									} // main swtich in case 2



				} // case 2 end
			case 3: {
					System.out.println("Chat");
					break;
				}
			case 4: {
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
									""";
						
									System.out.println(register);
									System.out.println("Please Select an Option:  ");
									int num7 = input.nextInt();

									int register1 = num7;

									switch (register1) {
														case 1: {
																System.out.println("Missed calls");
																break;
															}
														case 2: {
																System.out.println("Received calls");
																break;
															}
														case 3: {
																System.out.println("Dialled numbers");
																break;
															}
														case 4: {
																System.out.println("Erase recent calls list");
																break;
															}
														case 5: {
																String call = """
																			Show all call duration
																			1 => Last call duration
																			2 => All call's duration
																			3 => Recieved calls' duration
																			4 => Dialled call's duration
																			5 => Clear timers 
																			""";
													
																			System.out.println(call);
																			System.out.println("Please Select an Option: ");
																			int num8 = input.nextInt();
	
																			int call1 = num8;

																			switch (call1) {
																						case 1: {
																								System.out.println("Last Call Duration");
																								break;
																							}
																						case 2: {
																								System.out.println("All Call's Duration");
																								break;
																							}
																						case 3: {
																								System.out.println("Recieved Call's duration");
																								break;
																							}
																						case 4: {
																								System.out.println("Dialled Call's Duration");
																								break;
																							}
																						case 5: {
																								System.out.println("Clear Timers");
																								break;
																							}
																			}
															break;
															}
														case 6: {
																String cost = """
																			Show call cost
																			1 => Last call cost
																			2 => All call's cost
																			3 => clear counters
																			""";

																			System.out.println(cost);
																			System.out.println("Please Select an option:  ");
																			int num9 = input.nextInt();

																			int cost1 = num9;
																			
																			switch (cost1) {
																						case 1: {
																								System.out.println("Last Call Cost");
																								break;
																							}
																						case 2: {
																								System.out.println("All Call's Cost");
																								break;
																							}
																						case 3: {
																								System.out.println("Clear Counters");
																								break;
																							}
																			}	
															break;				
															}
														case 7: {
																String costSettings = """
																				Call cost settings 
																				1 => Call cost limit 
																				2 => Show costs in
																				""";

																				System.out.println(costSettings);
																				System.out.println("Please select an Option:  ");
																				int num10 = input.nextInt();

																				int costSettings1 = num10;

																				switch (costSettings1) {
																									case 1: {
																											System.out.println("Call Cost Limit");
																											break;
																										}
																									case 2: {
																											System.out.println("Show Costs In");
																											break;
																										}
																				}
															break;
															}
														case 8: {
																System.out.println("Prepaid Credit");
																break;
															}
									} // main switch in case 4
				} // case 4 end
			case 5: {
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
								""";

								System.out.println(tones);
								System.out.println("Please Select an Option:  ");
								int num11 = input.nextInt();

								int tones1 = num11;
								
								switch (tones1) {
												case 1: {
														System.out.println("Ringing Tone");
														break;
													}
												case 2: {
														System.out.println("Ringing Volume");
														break;	
													}
												case 3: {
														System.out.println("Incoming Call Alert");
														break;
													}
												case 4: {
														System.out.println("Composer");
														break;
													}
												case 5: {
														System.out.println("Message Alert Tone");
														break;
													}
												case 6: {
														System.out.println("Keypad Tones");
														break;
													}
												case 7: {
														System.out.println("Warning and Game Tones");
														break;
													}
												case 8: {
														System.out.println("Vibrationg Alert");
														break;
													}
												case 9: {
														System.out.println("Screen Saver");
														break;
													}
								}
				} // case 5 end 
			case 6: {
					String callSettings = """
									Settings
									1 => Call settings
									2 => Phone settings
									3 => Security settings 
									4 => Restore factory settings 
									""";

									System.out.println(callSettings);
									System.out.println("Please Select an Option:  ");
									int num13 = input.nextInt();

									int callSettings1 = num13;

									switch (callSettings1) {
														case 1: {
																String callSettings11 = """
																					Call settings
																					1 => Automatic redial 
																					2 => Speed dialing 
																					3 => Call waiting options 
																					4 => Own number sending
																					5 => Phone line in use 
																					6 => Automatic answer
																					""";

																					System.out.println(callSettings11);
																					System.out.println("Please Select an Option:  ");
																					int num14 = input.nextInt();

																					int call1 = num14;

																					switch (call1) {
																										case 1: {
																												System.out.println("Automatic Redial");
																												break;
																											}
																										case 2: {
																												System.out.println("Speed Dialing");
																												break;
																											}
																										case 3: {
																												System.out.println("Call Waiting Options");
																												break;
																											}
																										case 4: {
																												System.out.println("Own Number Sending");
																												break;
																											}
																										case 5: {
																												System.out.println("Phone Line In Use");
																												break;
																											}
																										case 6: {
																												System.out.println("Automatic Answer");
																												break;
																											}
																					}
															break;
															}
														case 2: {
																String phoneSettings = """
																					Phone settings 
																					1 => Language 
																					2 => Cell info display
																					3 => Welcome note
																					4 => Network selection
																					5 => Lights 
																					6 => Confirm SIM service actions
																					""";
																
																					System.out.println(phoneSettings);
																					System.out.println("Please Select an Option:  ");
																					int num15 = input.nextInt();
																	
																					int phones1 = num15;

																					switch (phones1) {
																									case 1: {
																											System.out.println("Language");
																											break;
																										}
																									case 2: {
																											System.out.println("Cell Info Display");
																											break;
																										}
																									case 3: {
																											System.out.println("Welcome Note");
																											break;
																										}
																									case 4: {
																											System.out.println("Network Selection");
																											break;
																										}
																									case 5: {
																											System.out.println("Lights");
																											break;
																										}
																									case 6: {
																											System.out.println("Confirm SIM Services Actions");
																											break;
																										}
																					}
																					
															break;
															}
														case 3: {
																String security = """
																				Security Settings 
																				1 => Pin code request
																				2 => Call barring service 
																				3 => Fixed dialing 
																				4 => Closed user group
																				5 => Phone security
																				6 => Change access codes 
																				""";

																				System.out.println(security);
																				System.out.println("Please Select an Option:  ");
																				int num16 = input.nextInt();

																				int security1 = num16;

																				switch (security1) {
																								case 1: {
																										System.out.println("Pin Code request");
																										break;
																									}
																								case 2: {
																										System.out.println("Call Barring services");
																										break;
																									}
																								case 3: {
																										System.out.println("Fixed Dialing");
																										break;
																									}
																								case 4: {
																										System.out.println("Closed User Group");
																										break;
																									}
																								case 5: {
																										System.out.println("Phone Security");
																										break;
																									}
																								case 6: {
																										System.out.println("Change Access Codes");
																										break;
																									}
																				}
															break;
															}
														case 4: {
																System.out.println("Restore Factory Settings");
																break;
															}
									} 
									
				break;
				} // case 6 end 
			case 7: {
					System.out.println("Call Divert");
					break;
				} // case 7 end
			case 8: {
					System.out.println("Games");
					break;
				} // case 8 end
			case 9: {
					System.out.println("Calculator");
					break;
				} // case 9 end  
			case 10: {
					System.out.println("Reminders");
					break;
				} // case 10 end
			case 11: {
					String clock = """
								Clock
								1 => Alarm clock
								2 => Clock settings
								3 => Date setting 
								4 => Stopwatch
								5 => Countdown timer
								6 => Auto update of date and time 
								""";

								System.out.println(clock);
								System.out.println("Please select an Option:  ");
								int num12 = input.nextInt();
			
								int clock1 = num12;

								switch (clock1) {
												case 1: {
														System.out.println("Alarm Clock");
														break;
													}
												case 2: {
														System.out.println("Clock Setting");
														break;
													}
												case 3: {
														System.out.println("Date Setting");
														break;
													}
												case 4: {
														System.out.println("Stopwatch");
														break;
													}
												case 5: {
														System.out.println("Countdown Timer");
														break;
													}
												case 6: {
														System.out.println("Auto Update of Date and Time");
														break;
													}
									}
				break;
				} // case 11 end 
			case 12: {
					System.out.println("Profiles");
					break;
				} // case 12 end 
			case 13: {
					System.out.println("SIM Services");
					break;
				}
			} // main switch end
			

	}
}