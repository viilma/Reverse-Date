package com.vilma.zaveckiene.dates;

import java.time.LocalDate;

public class Date {
	
	static void printBonusDatesBetween(int fromYear, int toYear) {
			
		// start date
		LocalDate startDate = LocalDate.of(fromYear, 1, 1);
			
		// end date
		LocalDate endDate = LocalDate.of(toYear, 1, 1);
	
		// day by day:
		while(startDate.isBefore(endDate)){
				
		    String date = startDate.toString();
			    
		    // print the date if numbers of that date are reversed
		    if ((date.charAt(0)==date.charAt(9)) && (date.charAt(1)==date.charAt(8)) && (date.charAt(2)==date.charAt(6)) && (date.charAt(3)==date.charAt(5))) {
				System.out.println(date);
			}
			    
		    startDate = startDate.plusDays(1);
		}
	}
}
