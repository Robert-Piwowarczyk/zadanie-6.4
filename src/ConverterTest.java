public class ConverterTest {
    public static void main(String[] args) {

        int dayNumber;
        for (dayNumber = 1; dayNumber <= 7; dayNumber++)
            System.out.println(CalendarConverter.convertDayToString(dayNumber));
    }
}
