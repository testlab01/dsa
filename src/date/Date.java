package date;
/**
 *
 * @author Geek Tomba
 */
public class Date {
    protected int year;
    protected int month;
    protected int day;
    protected static final int MINYEAR = 1589;
    
    public Date(int newDay, int newMonth, int newYear){
        day = newDay;
        month = newMonth;
        year = newYear;
    }
    
    public int dayIs() {
        return day;
    } 
    
    public int monthIs(){
        return month;
    }
    
    public int yearIS(){
        return year;
    }
}
