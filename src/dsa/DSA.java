package dsa;
import date.incDate;
/**
 *
 * @author Geek Tomba
 */
public class DSA {
    public static void main(String[] args) {      
        incDate newDate = new incDate(31,12,2016);
        newDate.increment();
        System.out.println(newDate);
    }
    
}
