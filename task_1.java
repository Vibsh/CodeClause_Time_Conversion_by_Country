
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Time Zone: ");
        String newZone = sc.nextLine();

        Calendar localTime = Calendar.getInstance();
        int hour = localTime.get(Calendar.HOUR);
        int minute = localTime.get(Calendar.MINUTE);
        int second = localTime.get(Calendar.SECOND);
        int year = localTime.get(Calendar.YEAR);

        System.out.printf("Local time: %02d:%02d:%02d %02d\n", hour, minute, second, year);

        Calendar newTime = new GregorianCalendar(TimeZone.getTimeZone(newZone));
        newTime.setTimeInMillis(localTime.getTimeInMillis());
        hour = newTime.get(Calendar.HOUR);
        minute = newTime.get(Calendar.MINUTE);
        second = newTime.get(Calendar.SECOND);
        year = newTime.get(Calendar.YEAR);

        System.out.printf("%s time: %02d:%02d:%02d %02d\n", newZone, hour, minute, second, year);

    }

};

// Europe/Brussels