public class NextDayCalculator {

    public static final String CONCATENATION = "/";
    public static final int MAX_MONTH = 12;
    public static final int MAX_DAY = 31;

    public static String calculateNextDay(int day, int month, int year){
        if(day == MAX_DAY && month != MAX_MONTH){
            return 1 + NextDayCalculator.CONCATENATION + (month+1) + NextDayCalculator.CONCATENATION +year;
        }
        if(day == 30 && (month == 4 || month == 6 || month == 9 || month == 11)){
            return 1 + NextDayCalculator.CONCATENATION + (month+1) + NextDayCalculator.CONCATENATION + year;
        }
        if(day == 28 || day == 29 && month == 2){
            return 1 + NextDayCalculator.CONCATENATION + 3 + NextDayCalculator.CONCATENATION + year;
        }
        if(day == MAX_DAY && month == MAX_MONTH){
            return 1 + CONCATENATION + 1 + CONCATENATION + (year +1);
        }
        return (day+1)+ CONCATENATION +month+ CONCATENATION +year;
    }
}
