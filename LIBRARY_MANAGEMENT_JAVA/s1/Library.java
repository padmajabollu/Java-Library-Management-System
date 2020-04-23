package s1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.*;


public class Library
{
    int l_id;
    String l_name;
    String password;
    Pattern pattern;
    Matcher matcher;
    static final String PASSWORD_PATTERN = "((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,40})";
    Scanner sc=new Scanner(System.in);
    
    public Library(int l_id1,String l_name1,String password1)
    {
        while(true)
        {
            try
            {
                if((String.valueOf(l_id1).length())>=4 && l_id1==(int)l_id1)
                {
                    l_id=l_id1;
                    break;

                }
                else
                {
                    System.out.println("\nEnter Valid Id : \n");
                    l_id1=sc.nextInt();
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
                 if((l_name1.getClass().getName())=="java.lang.String" && l_name1.length()>=4 && l_name1 != null)
                {
                    l_name=l_name1;
                    break;
                }
            
                else
                {
                    System.out.println("\nEnter Valid Name : \n");
                    l_name1=sc.next();
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