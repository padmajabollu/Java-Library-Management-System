package s1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Student
{
    int prn;
    String name;
    String email;
    int contact;
    String password;
    Pattern pattern;
    Matcher matcher;
    static final String PASSWORD_PATTERN = "((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,40})";
    static final String EMAIL_PATTERN = 
		"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";


    Scanner sc=new Scanner(System.in);
    
    
    Student(int prn1,String name1,String email1,int contact1,String password1)
     {
            while(true)
            {
                try
                {
                    if((String.valueOf(prn1).length())==10 && prn1==(int)prn1)
                    {
                        prn=prn1;
                        break;

                    }
                    else
                    {
                        System.out.println("\nEnter Valid PRN : \n");
                        prn1=sc.nextInt();
                        continue;
                    }

                }
                catch(Exception e)
                {
                    continue;
                }
            }
        while(true)
            {
                try
                {
                    if((name1.getClass().getName())=="java.lang.String" && name1.length()>=4 && name1 != null)
                    {
                        name=name1;
                        break;
                    }
                
                    else
                    {
                        System.out.println("\nEnter Valid Name : \n");
                        name1=sc.next();
                        continue;
                    }

                }
                catch(Exception e)
                {
                    continue;
                }
            }

            while(true)
            {
                try
                {
                    pattern = Pattern.compile(EMAIL_PATTERN);
                    matcher = pattern.matcher(email1);
                    if(matcher.matches())
                    {
                        email=email1;
                        break;
                    }
                    
                    else
                    {
                        System.out.println("\nEnter Valid Email Id : \n");
                        email1=sc.next();
                        continue;
                    }

                }
                catch(Exception e)
                {
                    continue;
                }
            }
            while(true)
            {
                try
                {
                    if((String.valueOf(contact1).length())==10 && contact1==(int)contact1)
                    {
                        contact=contact1;
                        break;

                    }
                    else
                    {
                        System.out.println("\nEnter Valid Contact Number : \n");
                        contact1=sc.nextInt();
                        continue;
                    }

                }
                catch(Exception e)
                {
                    continue;
                }
            }
            while(true)
            {
                try
                {
                    pattern = Pattern.compile(PASSWORD_PATTERN);
                    matcher = pattern.matcher(password1);
                    if(matcher.matches())
                    {
                        password=password1;
                        break;
                    }
                    
                    else
                    {
                        System.out.println("\nEnter Valid Password : \n");
                        password1=sc.next();
                        continue;
                    }

                }
                catch(Exception e)
                {
                    continue;
                }
            }
    }
    
}