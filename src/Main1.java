import java.time.*;
public class Main1 {
    public static void main(String[] args) {
LocalDateTime birth = LocalDateTime.of(2005, Month.JANUARY, 19, 04, 35, 41);
    LocalDateTime localDateTime = LocalDateTime.now();
    Duration duration = calculateDuration(birth, localDateTime);
printDuration(duration);




    }

    public static Duration calculateDuration(LocalDateTime StartDateTime, LocalDateTime EndDateTime){
return Duration.between(StartDateTime, EndDateTime);



    }
    public static void printDuration(Duration duration){
        long years = duration.toDays()/365;
long months = (duration.toDays()%365)/30;
long days = duration.toDays()%30;
long hours = duration.toHours()%24;
long minutes = duration.toMinutes()%60;
long seconds = duration.getSeconds()%60;
System.out.println("Вам виповнилося "+ years+ " років, "+ months + " місяці, "+ days + " днів, "+ hours + " годин, "+ minutes + " хвилин, "+ seconds + " секунд.");



    }
}
