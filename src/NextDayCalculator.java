public class NextDayCalculator {

    public static final String CONCATENATION = "/";

    public static String calculateNextDay(int day, int month, int year){

//        if(day == 31){
//            return 1 + "/" + (month+1) + "/"+year;
//        }
//        if(day == 30 && month == 4){
//            return 1 + "/" + (month+1) + "/" + year;
//        }
        
        return (day+1)+ CONCATENATION +month+ CONCATENATION +year;
    }
}
