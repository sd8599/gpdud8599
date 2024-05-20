package stringEx0517;

import java.util.Calendar;

public class CalendarEx {
	public static void printCalendar(String msg, Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;//컴퓨터는 달을 0~11 인식
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int ampm = cal.get(Calendar.AM_PM);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND); //1000분의 1초
		
		System.out.print(msg+":"+year+"-"+month+"-"+day+" "); //현재:2024-5-17
//		System.out.println(dayOfWeek); //6 (일 : 1, 월 : 2, 화 : 3, 수 : 4~)
//		System.out.println(Calendar.FRIDAY);
		
		switch (dayOfWeek) {
		case Calendar.SUNDAY:System.out.println("일요일");break;
		case Calendar.MONDAY:System.out.println("월요일");break;
		case Calendar.TUESDAY:System.out.println("화요일");break;
		case Calendar.WEDNESDAY:System.out.println("수요일");break;
		case Calendar.THURSDAY:System.out.println("목요일");break;
		case Calendar.FRIDAY:System.out.println("금요일");break;
		case Calendar.SATURDAY:System.out.println("토요일");break;
		default:break;
		}
		
		System.out.print("("+hourOfDay+")"); //24시간 기준
		if (ampm == Calendar.AM) {
			System.out.print("오전");
		} else {
			System.out.print("오후");
		}
		//(20)오후8시 30분 0초 0밀리초
		System.out.println(hour+"시 "+minute+"분 "+second+"초 "+millisecond+"밀리초");
	}
	
	public static void main(String[] args) {
//		abstract class는 new 연산자로 객체생성 불가
		Calendar now = Calendar.getInstance();
		printCalendar("현재", now);

		Calendar firstDate = Calendar.getInstance();
		firstDate.clear(); //날짜, 시간정보를 삭제
		firstDate.set(2016, 11, 25);
		firstDate.set(Calendar.HOUR_OF_DAY, 20);
		firstDate.set(Calendar.MINUTE, 30);
		//(20)오후8시 30분 0초 0밀리초
		printCalendar("처음 데이트한 날은 ",firstDate);//처음 데이트한 날은 :2016-12-25 일요일
	}
}





