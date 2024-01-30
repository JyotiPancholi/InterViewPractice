package enumerators.java.com;

enum Day
{
	SUNDAY,
	MONDAY,
	TUESDAY,
	WEDNESSDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY;
}
public class EnumWidSwitch {
Day day;

	public EnumWidSwitch(Day day) {
	this.day = day;
}
public void dayIsLike() 
{
	switch(day) {
	case MONDAY:
		System.out.println("Mondays are bad.");
		break;
	case FRIDAY:
		System.out.println("Fridays are better.");
		break;
	case SATURDAY:
	case SUNDAY:
		System.out.println("Weekends are best.");
		break;
	default:
		System.out.println("Midweek days are so-so.");
		break;
	}
}
	public static void main(String[] args) {
			String str = "MONDAY";
			EnumWidSwitch e = new EnumWidSwitch(Day.valueOf(str));
			e.dayIsLike();
			
	}

}
