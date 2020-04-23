package s1;
import java.util.Date;
import java.util.Scanner;

public class Book
{
    int b_id;
    String b_name;
    String b_author;
    String b_publication;
    int prn;
    Date date;
    Scanner sc=new Scanner(System.in);
    

    Book(int b_id1,String b_name1,String b_author1,String b_publication1)
    {
        while(true)
        {
            try
            {
                if(String.valueOf(b_id1).length()>=4 && b_id1==(int)b_id1)
                {
                    b_id=b_id1;
                    break;

                }
                else
                {
                    System.out.println("\nEnter Valid Book Id : \n");
                    b_id1=sc.nextInt();
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
                 if(b_name1.getClass().getName()=="java.lang.String" && b_name1.length()>=4 && b_name1 != null)
                {
                    b_name=b_name1;
                    break;
                }
            
                else
                {
                    System.out.println("\nEnter Valid Book Name : \n");
                    b_name1=sc.next();
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
                if(b_author1.getClass().getName()=="java.lang.String" && b_author1.length()>=4 && b_author1 != null)
                {
                    b_author=b_author1;
                    break;
                        }

                
                else
                {
                    System.out.println("\nEnter Valid Book Author : \n");
                    b_author1=sc.next();
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
                if(b_publication1.getClass().getName()=="java.lang.String" && b_publication1.length()>=4 && b_publication1 != null)
                {
                    b_publication=b_publication1;
                    break;
                }
                
                else
                {
                    System.out.println("\nEnter Valid Book Publication : \n");
                    b_publication1=sc.next();
                    continue;
                }

            }
            catch(Exception e)
            {
                continue;
            }
        }
       
       
        
        
    }

    Book(int b_id1,String b_name1,String b_author1,String b_publication1,int prn1,int day,int month,int year)
    {

        while(true)
        {
            try
            {
                if(String.valueOf(b_id1).length()>=4 && b_id1==(int)b_id1)
                {
                    b_id=b_id1;
                    break;
                }
                else
                {
                    System.out.println("\nEnter Valid Book Id : \n");
                    b_id1=sc.nextInt();
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
                 if(b_name1.getClass().getName()=="java.lang.String" && b_name1.length()>=4 && b_name1 != null)
                {
                    b_name=b_name1;
                    break;
                }
            
                else
                {
                    System.out.println("\nEnter Valid Book Name : \n");
                    b_name1=sc.next();
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
                if(b_author1.getClass().getName()=="java.lang.String" && b_author1.length()>=4 && b_author1 != null)
                {
                    b_author=b_author1;
                    break;
                        }

                
                else
                {
                    System.out.println("\nEnter Valid Book Author : \n");
                    b_author1=sc.next();
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
                if(b_publication1.getClass().getName()=="java.lang.String" && b_publication1.length()>=4 && b_publication1 != null)
                {
                    b_publication=b_publication1;
                    break;
                }
                
                else
                {
                    System.out.println("\nEnter Valid Book Publication : \n");
                    b_publication1=sc.next();
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
                if(String.valueOf(prn1).length()==10 && prn1==(int)prn1)
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
                if(day>=1 && day<=31 && month>=1 && month<=12 && year>=1999 && year<=2019)
                {
                    Date date1=new Date(year,month,day);
                    date=date1;
                    break;
                }
                
                else
                {
                    System.out.println("\nEnter Valid Day : \n");
                    day=sc.nextInt();
                    System.out.println("\nEnter Valid Month : \n");
                    month=sc.nextInt();
                    System.out.println("\nEnter Valid Year : \n");
                    year=sc.nextInt();
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
