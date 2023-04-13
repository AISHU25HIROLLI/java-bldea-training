package com.bldea.crorepathiApp.package1;

import java.util.Scanner;
public class Questions {
	static String result;
	static int count_life_line=3;
	static int aud_phn=1;
	static int cnt_50_50 = 1;
	static int skip_cnt=1;
	static Scanner sc=new Scanner(System.in);
	public static boolean fetchQuestion1(String name)throws Exception
	{
		System.out.println("1. Who is the founder of Java?");
		System.out.println("a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n"
				+ "e) life line");
		result = sc.next();
		if (result.equalsIgnoreCase("d")) {
			Candidate.setAmount(5000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(5000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(5000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(5000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(5000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(5000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(5000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(5000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(5000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(5000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(5000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(5000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(5000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(5000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(5000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(5000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(5000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(5000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(5000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(5000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(5000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(5000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println(
						"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
				result = sc.next();
				if (result.equalsIgnoreCase("d")) {
					Candidate.setAmount(5000);
					return true;
				}
			}

		}


		return false;
	}

	//---------------------------------------
	public static boolean fetchQuestion2(String name)throws Exception
	{
		System.out.println("2.What was the'Name of First Computer'?");
		System.out.println("a)EMICC\n"+
				"b) ENICC\n"+
				"c) ENIAC\n"+
				"d) EMIAC\n"+
				"e)life line");
		result = sc.next();
		if (result.equalsIgnoreCase("c")) {
			Candidate.setAmount(10000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(10000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("c) ENIAC\n"+
										"d) EMIAC\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(10000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(10000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)EMICC\n"+
												"b) ENICC\n"+
												"c) ENIAC\n"+
												"d) EMIAC\n");


										result = sc.next();
										if (result.equalsIgnoreCase("2")) {
											Candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(10000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("c) ENIAC\n"+
												"d) EMIAC\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(10000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)EMICC\n"+
												"b) ENICC\n"+
												"c) ENIAC\n"+
												"d) EMIAC\n");


										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("c) ENIAC\n"+"d) EMIAC\n");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(10000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(10000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(10000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)EMICC\n"+
												"b) ENICC\n"+
												"c) ENIAC\n"+
												"d) EMIAC\n");								
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(10000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(10000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)EMICC\n"+
												"b) ENICC\n"+
												"c) ENIAC\n"+
												"d) EMIAC\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(10000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(10000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println(
												"c) ENIAC\n"+
												"d) EMIAC\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(10000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)EMICC\n"+
												"b) ENICC\n"+
												"c) ENIAC\n"+
												"d) EMIAC\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("c) ENIAC\n"+
										"d) EMIAC\n");							
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(10000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(10000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)EMICC\n"+
												"b) ENICC\n"+
												"c) ENIAC\n"+
												"d) EMIAC\n");									
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a)EMICC\n"+
						"b) ENICC\n"+
						"c) ENIAC\n"+
						"d) EMIAC\n");
				result = sc.next();
				if (result.equalsIgnoreCase("c")) {
					Candidate.setAmount(10000);
					return true;
				}
			}

		}


		return false;
	}






	//----------------------------------------------------	



	//q-3//------------------------------------------
	public static boolean fetchQuestion3(String name)throws Exception
	{

		System.out.println("3.What is the National Anthem of India?");
		System.out.println("a)Saare Jahan se Achchha\n"+
				"b) Vande Mataram\n"+
				"c) Jan Gan Man\n"+
				"d) Hum Honge Kamyab\n"+
				"e) life line");

		result = sc.next();
		if (result.equalsIgnoreCase("c")) {
			Candidate.setAmount(10000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(20000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("b) Vande Mataram\n"+
										"c) Jan Gan Man\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(20000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(20000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Saare Jahan se Achchha\n"+
												"b) Vande Mataram\n"+
												"c) Jan Gan Man\n"+
												"d) Hum Honge Kamyab\n");


										result = sc.next();
										if (result.equalsIgnoreCase("2")) {
											Candidate.setAmount(20000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(20000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println(
												"c) Jan Gan Man\n"+
												"d) Hum Honge Kamyab\n");

										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(20000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Saare Jahan se Achchha\n"+
												"b) Vande Mataram\n"+
												"c) Jan Gan Man\n"+
												"d) Hum Honge Kamyab\n");


										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(20000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println(
								"c) Jan Gan Man\n"+
								"d) Hum Honge Kamyab\n");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(20000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(20000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(20000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Saare Jahan se Achchha\n"+
												"b) Vande Mataram\n"+
												"c) Jan Gan Man\n"+
												"d) Hum Honge Kamyab\n");								
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(20000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(20000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(20000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Saare Jahan se Achchha\n"+
												"b) Vande Mataram\n"+
												"c) Jan Gan Man\n"+
												"d) Hum Honge Kamyab\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(20000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(20000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(20000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println(
												"c) Jan Gan Man\n"+
												"d) Hum Honge Kamyab\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(20000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Saare Jahan se Achchha\n"+
												"b) Vande Mataram\n"+
												"c) Jan Gan Man\n"+
												"d) Hum Honge Kamyab\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(20000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("c) Jan Gan Man\n"+
										"d) Hum Honge Kamyab\n");


								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(20000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(20000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Saare Jahan se Achchha\n"+
												"b) Vande Mataram\n"+
												"c) Jan Gan Man\n"+
												"d) Hum Honge Kamyab\n");									
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(20000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a)Saare Jahan se Achchha\n"+
						"b) Vande Mataram\n"+
						"c) Jan Gan Man\n"+
						"d) Hum Honge Kamyab\n");
				result = sc.next();

				if (result.equalsIgnoreCase("c")) {
					Candidate.setAmount(20000);
					return true;
				}
			}
		}

		return false;
	}







	//q-3//----------------------------------------------------------------




	///////////////////////////////////

	public static boolean fetchQuestion4(String name)throws Exception
	{
		System.out.println("4.Which is the 'Smallest State'of India in terms of Population?");
		System.out.println("a)Goa\n"+
				"b) Sikkim\n"+
				"c) Tripura\n"+
				"d) Arunachal Pradesh\n"+
				"e)life line");
		result = sc.next();
		if (result.equalsIgnoreCase("b")) {
			Candidate.setAmount(40000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 0%\n" + "option b = 59%\n" + "option c = 8%\n" + "option d = 7%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("b")) {
							Candidate.setAmount(40000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b"))                       //check
						{
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)Goa\n"+
										"b) Sikkim\n"
										);
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(40000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(40000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Goa\n"+
												"b) Sikkim\n"+
												"c) Tripura\n"+
												"d) Arunachal Pradesh\n");

										result = sc.next();
										if (result.equalsIgnoreCase("2")) {
											Candidate.setAmount(40000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(40000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)Goa\n"+
												"b) Sikkim\n");


										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(40000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Goa\n"+
												"b) Sikkim\n"+
												"c) Tripura\n"+
												"d) Arunachal Pradesh\n");


										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(40000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a)Goa\n"+
								"b) Sikkim\n"
								);
						result = sc.next();
						if (result.equalsIgnoreCase("b")) {
							Candidate.setAmount(40000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 59%\n" + "option c = 8%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(40000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(40000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Goa\n"+
												"b) Sikkim\n"+
												"c) Tripura\n"+
												"d) Arunachal Pradesh\n");							
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(40000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(40000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 59%\n" + "option c = 8%\n" + "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(40000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Goa\n"+
												"b) Sikkim\n"+
												"c) Tripura\n"+
												"d) Arunachal Pradesh\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(40000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(40000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 59%\n" + "option c = 8%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(40000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)Goa\n"+
												"b) Sikkim\n");

										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(40000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Goa\n"+
												"b) Sikkim\n"+
												"c) Tripura\n"+
												"d) Arunachal Pradesh\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(40000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");

								System.out.println("a)Goa\n"+
										"b) Sikkim\n");

								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(40000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 59%\n" + "option c = 8%\n" + "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(40000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Goa\n"+
												"b) Sikkim\n"+
												"c) Tripura\n"+
												"d) Arunachal Pradesh\n");									
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(40000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a)Goa\n"+
						"b) Sikkim\n"+
						"c) Tripura\n"+
						"d) Arunachal Pradesh\n");
				result = sc.next();

				if (result.equalsIgnoreCase("b")) {
					Candidate.setAmount(40000);
					return true;
				}
			}
		}

		return false;
	}







	/////////////////////////////////////////////////


	//q-5==========================================================================
	public static boolean fetchQuestion5(String name)throws Exception
	{
		System.out.println("5.The most populous city in the world is?");
		System.out.println("a)Paris\n"+
				"b) Peking\n"+
				"c) London\n"+
				"d) Tokyo\n"+
				"e)life line");
		result = sc.next();
		if (result.equalsIgnoreCase("d")) {
			Candidate.setAmount(80000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 0%\n" + "option b = 59%\n" + "option c = 8%\n" + "option d = 77%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(80000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b"))                       
						{
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println(
										"c) London\n"+
										"d) Tokyo\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(80000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(80000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Paris\n"+
												"b) Peking\n"+
												"c) London\n"+
												"d) Tokyo\n");

										result = sc.next();
										if (result.equalsIgnoreCase("2")) {
											Candidate.setAmount(80000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(80000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println(
												"c) London\n"+
												"d) Tokyo\n");


										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(80000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Paris\n"+
												"b) Peking\n"+
												"c) London\n"+
												"d) Tokyo\n");


										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(80000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println(
								"c) London\n"+
								"d) Tokyo\n");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(80000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 59%\n" + "option c = 8%\n" + "option d = 77%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(80000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(80000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Paris\n"+
												"b) Peking\n"+
												"c) London\n"+
												"d) Tokyo\n");							
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(80000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(80000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 59%\n" + "option c = 8%\n" + "option d =77%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(80000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Paris\n"+
												"b) Peking\n"+
												"c) London\n"+
												"d) Tokyo\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(80000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(80000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 59%\n" + "option c = 8%\n" + "option d = 77%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(80000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println(
												"c) London\n"+
												"d) Tokyo\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(80000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Paris\n"+
												"b) Peking\n"+
												"c) London\n"+
												"d) Tokyo\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(80000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");

								System.out.println(
										"c) London\n"+
										"d) Tokyo\n");

								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(80000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 59%\n" + "option c = 8%\n" + "option d = 77%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(80000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Paris\n"+
												"b) Peking\n"+
												"c) London\n"+
												"d) Tokyo\n");									
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(80000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a)Paris\n"+
						"b) Peking\n"+
						"c) London\n"+
						"d) Tokyo\n");
				result = sc.next();

				if (result.equalsIgnoreCase("d")) {
					Candidate.setAmount(80000);
					return true;
				}
			}
		}

		return false;
	}








	//q-5=============================================================================




	//q-6------------------------------------------------------------------
	public static boolean fetchQuestion6(String name)throws Exception
	{

		System.out.println("6.Complete this Hindi proverb 'Anth Bhala To...'");
		System.out.println("a)Sab Bhalla\n"+
				"b) Jag Hansa\n"+
				"c) Kud Fansa\n"+
				"d) Jeb Dheela\n"+
				"e)life line");
		result=sc.next();
		if(result.equalsIgnoreCase("a")) {
			Candidate.setAmount(160000);
			return true;

		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 90%\n" + "option b = 59%\n" + "option c = 8%\n" + "option d = 77%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							Candidate.setAmount(160000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b"))                       
						{
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)Sab Bhalla\n"+
										"b) Jag Hansa\n"
										);
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidate.setAmount(160000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(160000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Sab Bhalla\n"+
												"b) Jag Hansa\n"+
												"c) Kud Fansa\n"+
												"d) Jeb Dheela\n");

										result = sc.next();
										if (result.equalsIgnoreCase("2")) {
											Candidate.setAmount(160000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(160000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)Sab Bhalla\n"+
												"b) Jag Hansa\n");



										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(160000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Sab Bhalla\n"+
												"b) Jag Hansa\n"+
												"c) Kud Fansa\n"+
												"d) Jeb Dheela\n");


										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(160000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a)Sab Bhalla\n"+
								"b) Jag Hansa\n");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							Candidate.setAmount(160000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 90%\n" + "option b = 59%\n" + "option c = 8%\n" + "option d = 77%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidate.setAmount(160000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(160000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Sab Bhalla\n"+
												"b) Jag Hansa\n"+
												"c) Kud Fansa\n"+
												"d) Jeb Dheela\n");						
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(160000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(160000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 90%\n" + "option b = 59%\n" + "option c = 8%\n" + "option d =77%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(160000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Sab Bhalla\n"+
												"b) Jag Hansa\n"+
												"c) Kud Fansa\n"+
												"d) Jeb Dheela\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(160000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(160000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 90%\n" + "option b = 59%\n" + "option c = 8%\n" + "option d = 77%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidate.setAmount(160000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)Sab Bhalla\n"+
												"b) Jag Hansa\n");

										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(160000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Sab Bhalla\n"+
												"b) Jag Hansa\n"+
												"c) Kud Fansa\n"+
												"d) Jeb Dheela\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(160000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)Sab Bhalla\n"+
										"b) Jag Hansa\n");


								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidate.setAmount(160000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 90%\n" + "option b = 59%\n" + "option c = 8%\n" + "option d = 77%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(160000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Sab Bhalla\n"+
												"b) Jag Hansa\n"+
												"c) Kud Fansa\n"+
												"d) Jeb Dheela\n");									
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(160000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a)Sab Bhalla\n"+
						"b) Jag Hansa\n"+
						"c) Kud Fansa\n"+
						"d) Jeb Dheela\n");
				result = sc.next();

				if (result.equalsIgnoreCase("a")) {
					Candidate.setAmount(160000);
					return true;
				}
			}
		}

		return false;
	}







	//-----------------------------------------------------





	//q-7===================================================
	public static boolean fetchQuestion7(String name)throws Exception
	{
		System.out.println("7.The chief constituent of gobar gas is?");
		System.out.println("a)Ethane\n"+
				"b) Methane\n"+
				"c) Hydrogen\n"+
				"d) Carbon dioxide\n"+
				"e)life line");
		result=sc.next();
		if(result.equalsIgnoreCase("b")) {
			Candidate.setAmount(320000);
			return true;

		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 9%\n" + "option b = 91%\n" + "option c = 8%\n" + "option d = 77%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("b")) {
							Candidate.setAmount(320000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b"))                       
						{
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)Ethane\n"+
										"b) Methane\n");

								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(320000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(320000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Ethane\n"+
												"b) Methane\n"+
												"c) Hydrogen\n"+
												"d) Carbon dioxide\n");

										result = sc.next();
										if (result.equalsIgnoreCase("2")) {
											Candidate.setAmount(320000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(320000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)Ethane\n"+
												"b) Methane\n");



										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(320000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Ethane\n"+
												"b) Methane\n"+
												"c) Hydrogen\n"+
												"d) Carbon dioxide\n");


										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(320000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");

						System.out.println("a)Ethane\n"+
								"b) Methane\n");	



						result = sc.next();
						if (result.equalsIgnoreCase("b")) {
							Candidate.setAmount(320000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 9%\n" + "option b = 91%\n" + "option c = 8%\n" + "option d = 77%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(320000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(320000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Ethane\n"+
												"b) Methane\n"+
												"c) Hydrogen\n"+
												"d) Carbon dioxide\n");						
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(320000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(320000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 9%\n" + "option b = 91%\n" + "option c = 8%\n" + "option d =77%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(320000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Ethane\n"+
												"b) Methane\n"+
												"c) Hydrogen\n"+
												"d) Carbon dioxide\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(320000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(320000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 9%\n" + "option b = 91%\n" + "option c = 8%\n" + "option d = 77%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(320000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)Ethane\n"+
												"b) Methane\n");

										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(320000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Ethane\n"+
												"b) Methane\n"+
												"c) Hydrogen\n"+
												"d) Carbon dioxide\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(320000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)Ethane\n"+
										"b) Methane\n");



								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(320000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 9%\n" + "option b = 91%\n" + "option c = 8%\n" + "option d = 77%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(320000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Ethane\n"+
												"b) Methane\n"+
												"c) Hydrogen\n"+
												"d) Carbon dioxide\n");									
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(320000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a)Ethane\n"+
						"b) Methane\n"+
						"c) Hydrogen\n"+
						"d) Carbon dioxide\n");
				result = sc.next();

				if (result.equalsIgnoreCase("b")) {
					Candidate.setAmount(320000);
					return true;
				}
			}
		}

		return false;
	}








	//q-7=========================================================






	//q-8------------------------------------------------------------

	public static boolean fetchQuestion8(String name)throws Exception
	{

		System.out.println("8.Which of these is a Internet Search Engine?");
		System.out.println("a)Google\n"+
				"b) Bing\n"+
				"c) Yahoo\n"+
				"d) All of these\n"+
				"e)life line");
		result=sc.next();
		if(result.equalsIgnoreCase("d")) {
			Candidate.setAmount(640000);
			return true;

		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 9%\n" + "option b = 19%\n" + "option c = 8%\n" + "option d = 77%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(640000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b"))                       
						{
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)Google\n"+

										"d) All of these\n");

								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(640000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(640000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Google\n"+
												"b) Bing\n"+
												"c) Yahoo\n"+
												"d) All of these\n");

										result = sc.next();
										if (result.equalsIgnoreCase("2")) {
											Candidate.setAmount(640000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(640000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("a)Google\n"+

												"d) All of these\n");



										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(640000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Google\n"+
												"b) Bing\n"+
												"c) Yahoo\n"+
												"d) All of these\n");


										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(640000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a)Google\n"+

								"d) All of these\n");

						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(640000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 9%\n" + "option b = 19%\n" + "option c = 8%\n" + "option d = 77%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(640000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(640000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Google\n"+
												"b) Bing\n"+
												"c) Yahoo\n"+
												"d) All of these\n");						
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(640000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(640000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 9%\n" + "option b = 19%\n" + "option c = 8%\n" + "option d =77%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(640000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Google\n"+
												"b) Bing\n"+
												"c) Yahoo\n"+
												"d) All of these\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(640000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(640000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 9%\n" + "option b = 19%\n" + "option c = 8%\n" + "option d = 77%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(640000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)Google\n"+

												"d) All of these\n");

										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(640000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Google\n"+
												"b) Bing\n"+
												"c) Yahoo\n"+
												"d) All of these\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(640000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)Google\n"+

										"d) All of these\n");



								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(640000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 9%\n" + "option b = 19%\n" + "option c = 8%\n" + "option d = 77%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(640000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Google\n"+
												"b) Bing\n"+
												"c) Yahoo\n"+
												"d) All of these\n");									
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(640000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a)Google\n"+
						"b) Bing\n"+
						"c) Yahoo\n"+
						"d) All of these\n");
				result = sc.next();

				if (result.equalsIgnoreCase("d")) {
					Candidate.setAmount(640000);
					return true;
				}
			}
		}

		return false;
	}








	//-q-8---------------------------------------------------------------------




	//q-99999999999999999999999999999999999999999999999999999999999

	public static boolean fetchQuestion9(String name)throws Exception

	{
		System.out.println("9.Bahubali festival is related to?");
		System.out.println("a)Islam\n"+
				"b) Hinduism\n"+
				"c)Buddhism\n"+
				"d) Jainism\n"+
				"e)life line");
		result=sc.next();
		if(result.equalsIgnoreCase("d")) {
			Candidate.setAmount(1250000);
			return true;

		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 9%\n" + "option b = 19%\n" + "option c = 8%\n" + "option d = 77%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(1250000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b"))                       
						{
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println(
										"c)Buddhism\n"+
										"d) Jainism\n");

								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(1250000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(1250000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Islam\n"+
												"b) Hinduism\n"+
												"c)Buddhism\n"+
												"d) Jainism\n");
										result = sc.next();
										if (result.equalsIgnoreCase("2")) {
											Candidate.setAmount(1250000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(1250000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println(
												"c)Buddhism\n"+
												"d) Jainism\n");



										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1250000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Islam\n"+
												"b) Hinduism\n"+
												"c)Buddhism\n"+
												"d) Jainism\n");

										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1250000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");

						System.out.println(
								"c)Buddhism\n"+
								"d) Jainism\n");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(1250000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 9%\n" + "option b = 19%\n" + "option c = 8%\n" + "option d = 77%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(1250000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(1250000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Islam\n"+
												"b) Hinduism\n"+
												"c)Buddhism\n"+
												"d) Jainism\n");						
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1250000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(1250000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 9%\n" + "option b = 19%\n" + "option c = 8%\n" + "option d =77%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1250000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Islam\n"+
												"b) Hinduism\n"+
												"c)Buddhism\n"+
												"d) Jainism\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1250000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(1250000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 9%\n" + "option b = 19%\n" + "option c = 8%\n" + "option d = 77%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(1250000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("c)Buddhism\n"+
												"d) Jainism\n");

										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1250000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Islam\n"+
												"b) Hinduism\n"+
												"c)Buddhism\n"+
												"d) Jainism\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1250000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println(
										"c)Buddhism\n"+
										"d) Jainism\n");



								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(1250000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 9%\n" + "option b = 19%\n" + "option c = 8%\n" + "option d = 77%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1250000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Islam\n"+
												"b) Hinduism\n"+
												"c)Buddhism\n"+
												"d) Jainism\n");									
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1250000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a)Islam\n"+
						"b) Hinduism\n"+
						"c)Buddhism\n"+
						"d) Jainism\n");
				result = sc.next();

				if (result.equalsIgnoreCase("d")) {
					Candidate.setAmount(1250000);
					return true;
				}
			}
		}

		return false;
	}









	//q-99999999999999999999999999999999999999999999999999999999999999999999












	public static boolean fetchQuestion10(String name)throws Exception
	{

		System.out.println("10.Good Friday is observed to commemorate the event of?");
		System.out.println("a)birth of Jesus Christ\n"+
				"b) birth of St.Peter\n"+
				"c) crucification of Jesus Christ\n"+
				"d) rebirth of Jesus Christ\n"+
				"e)life line");
		result=sc.next();
		if(result.equalsIgnoreCase("c")) {
			Candidate.setAmount(2500000);
			return true;

		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 9%\n" + "option b = 19%\n" + "option c = 88%\n" + "option d = 7%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(2500000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b"))                       
						{
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println(
										"c) crucification of Jesus Christ\n"+
										"d) rebirth of Jesus Christ\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2500000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(2500000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)birth of Jesus Christ\n"+
												"b) birth of St.Peter\n"+
												"c) crucification of Jesus Christ\n"+
												"d) rebirth of Jesus Christ\n");
										result = sc.next();
										if (result.equalsIgnoreCase("2")) {
											Candidate.setAmount(2500000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(2500000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println(
												"c) crucification of Jesus Christ\n"+
												"d) rebirth of Jesus Christ\n");


										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2500000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)birth of Jesus Christ\n"+
												"b) birth of St.Peter\n"+
												"c) crucification of Jesus Christ\n"+
												"d) rebirth of Jesus Christ\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2500000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");

						System.out.println(
								"c) crucification of Jesus Christ\n"+
								"d) rebirth of Jesus Christ\n");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(2500000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 9%\n" + "option b = 19%\n" + "option c = 88%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2500000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(2500000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)birth of Jesus Christ\n"+
												"b) birth of St.Peter\n"+
												"c) crucification of Jesus Christ\n"+
												"d) rebirth of Jesus Christ\n");					
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2500000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(2500000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 9%\n" + "option b = 19%\n" + "option c = 88%\n" + "option d =7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2500000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)birth of Jesus Christ\n"+
												"b) birth of St.Peter\n"+
												"c) crucification of Jesus Christ\n"+
												"d) rebirth of Jesus Christ\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2500000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(2500000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 9%\n" + "option b = 19%\n" + "option c = 88%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2500000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println(
												"c) crucification of Jesus Christ\n"+
												"d) rebirth of Jesus Christ\n");

										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2500000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)birth of Jesus Christ\n"+
												"b) birth of St.Peter\n"+
												"c) crucification of Jesus Christ\n"+
												"d) rebirth of Jesus Christ\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2500000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println(
										"c) crucification of Jesus Christ\n"+
										"d) rebirth of Jesus Christ\n");



								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2500000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 9%\n" + "option b = 19%\n" + "option c = 88%\n" + "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2500000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)birth of Jesus Christ\n"+
												"b) birth of St.Peter\n"+
												"c) crucification of Jesus Christ\n"+
												"d) rebirth of Jesus Christ\n");								
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2500000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a)birth of Jesus Christ\n"+
						"b) birth of St.Peter\n"+
						"c) crucification of Jesus Christ\n"+
						"d) rebirth of Jesus Christ\n");
				result = sc.next();

				if (result.equalsIgnoreCase("c")) {
					Candidate.setAmount(2500000);
					return true;
				}
			}
		}

		return false;
	}








}

