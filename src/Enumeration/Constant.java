package Enumeration;

//when we want to declare pre-defined constants then we use enums

public class Constant {

	enum WEEKDAYS{
		MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY
	}
	
	enum WEEKEND{
		SATURDAY,SUNDAY
	}
	
	enum projectName{ENUMERATION_UNDERSTANDING}
	
	public static void main(String[] args) {
		
		System.out.println(WEEKDAYS.MONDAY);
		System.out.println(WEEKEND.SATURDAY);
		System.out.println(projectName.ENUMERATION_UNDERSTANDING);
		System.out.println(ProjectName.ENUMERATION_PROJECT);
		System.out.println(Courses.CORE_JAVA);
		System.out.println(Courses.values());
		
		Courses[] values = Courses.values();
		for(Courses c:values)
			System.out.println(c);
	}
}
