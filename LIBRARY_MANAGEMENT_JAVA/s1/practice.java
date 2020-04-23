import java.text.SimpleDateFormat;  
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.time.LocalDate;

class practice
{
    public static void main(String args[])
    {
        /*
        //static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        Date currentDate=new Date();
        System.out.println(currentDate);
        String dateToStr = DateFormat.getDateInstance().format(currentDate);  
        System.out.println("Date Format using getInstance(): "+dateToStr);  
 
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate localDate = LocalDate.now();
        System.out.println(dtf.format(localDate));
        LocalDate localDate1 = LocalDate.now();
        System.out.println("Substraction : "+ (localDate+localDate1));
    

    System.out.println();
    
    String a="";
    int n=0;
    System.out.println(a.length()==5);
    System.out.println(a.getClass().getName());
    System.out.println(a != null);
    System.out.println(n==(int)n);
   */
	String dateStart = "01/14/2012 09:29:58";
		String dateStop = "01/15/2012 10:31:48";

		//HH converts hour in 24 hours format (0-23), day calculation
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

		Date d1 = null;
		Date d2 = null;

		try {
			d1 = format.parse(dateStart);
			d2 = format.parse(dateStop);
            System.out.println(d1);
            System.out.println(d2);

            Date d3=new Date();
            Date d4=new Date();

            long diff1= d3.getTime()-d4.getTime();
            long diffDays1 = diff1 / (24 * 60 * 60 * 1000);
            System.out.println(d1);
            System.out.println(d2);
            System.out.println("No of days : "+diffDays1);



            

			//in milliseconds
			long diff = d2.getTime() - d1.getTime();
            

			long diffSeconds = diff / 1000 % 60;
			long diffMinutes = diff / (60 * 1000) % 60;
			long diffHours = diff / (60 * 60 * 1000) % 24;
			long diffDays = diff / (24 * 60 * 60 * 1000);

			System.out.print(diffDays + " days, ");
			System.out.print(diffHours + " hours, ");
			System.out.print(diffMinutes + " minutes, ");
			System.out.print(diffSeconds + " seconds.");

            Date date = Calendar.getInstance().getTime();  
            Date date1=new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").parse("2019-1-18 11:18:07"); 
            System.out.println(date1);
            long diff2= date.getTime()-date1.getTime();
            long diffDays2 = diff1 / (24 * 60 * 60 * 1000);
            System.out.println(diffDays2);

            System.out.println(new Date());
            

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
