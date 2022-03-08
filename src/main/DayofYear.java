package main;

public class DayofYear {
	
	static int[][] daysOfMonth = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 평년
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 윤년
	};
	
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	
	static int dayOfYear(int year, int month, int day) {
		int days = day;
		for (int i=1; i<month; i++) {
			days += daysOfMonth[isLeap(year)][i-1];
		}
		return days;
	}

	public static void main(String[] args) {
		System.out.println(dayOfYear(2021, 9, 3));
	}
	
	
}