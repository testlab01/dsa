package date;
/**
 *
 * @author Geek Tomba
 */
public class incDate extends Date{
    public incDate(int d, int m, int y){
        super(d, m, y);
    }
    
    public void increment(){
        boolean IsLeap = (year % 400 == 0 || year % 4 == 0 && year != 100);
        if(month == 2){
            if(day == 28  && IsLeap == true){
                day = day + 1;
            }else if(day == 28 && IsLeap == false){
                day = 1;
            }else if(day == 29 && IsLeap == true) {
                day = day + 1;
            }
        }
        switch(month){
            case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
                if(day == 31) {
                    year = (month == 12) ? year += 1 :  year;
                    month = 1;
                    day = 1;
                }else {
                    day = day + 1;
                }
                break;
            case 4 : case 6 : case 9 : case 11 :
                if(day == 30) {
                    day = 1;
                    month = month + 1;
                }else {
                    day = day + 1;
                }
                break;
        }
        
        //if(month > 12) System.out.println("TODO- handle exception, max month 12");
        //if(month == 2 && day > 29) System.out.println("TODO - handle exception max 29 ");
        //if(month > 31) System.out.println("TODO - handle exception max 31");
    }
    
    @Override
    public String toString(){
        return(day + "/" + month + "/" + year);
    }
}


