class MinHour {
	public static void main (String args[]) {
	int hour, min, sec, millisec, Hours, MinYear, SecYear, daymin, daysec,daymilli;	//daymin in minutes in a days. // 1millisec=60,000
	long MillisecYear;
	hour = 24;
	min = 60;
	sec = 60;
	millisec = 60000;
	Hours = hour*365;
	MinYear = Hours*min;
	SecYear = MinYear*sec;
	MillisecYear = SecYear*millisec;
	daymin = hour*min;
	daysec = daymin*sec;
	daymilli = millisec*60*hour;
		System.out.println("Days in a year: 365days/year" );
		System.out.println("Hours in a year: " +Hours);
		System.out.println("The Minutes in the year: " +MinYear);
		System.out.println("The Seconds in a year: " +SecYear);
		System.out.println("The millisec in a year: " +MillisecYear);
		System.out.println("The Hours in one day: " +hour);
		System.out.println("The Minutes in the day: " +daymin);
		System.out.println("The Seconds in one day: " +daysec);
		System.out.println("The millisec in the day: " +daymilli);
		}
} 
