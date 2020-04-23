import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Date;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Calendar;  
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class LIBRARY_MANAGEMENT_JAVA 
{
    public static void main(String args[])
    {
        try
        {   
            List<String[]> Book=new ArrayList<String[]>();
            List<String[]> StudentBook=new ArrayList<String[]>();
            List<String[]> Student=new ArrayList<String[]>();
            List<String[]> Librarian=new ArrayList<String[]>();

            String str;

            FileReader rBook=new FileReader("BookData.txt");
            BufferedReader rBook1 = new BufferedReader(rBook);
            while ((str=rBook1.readLine()) != null) 
            {
                String[] array=str.split(" ");
			    Book.add(new String[] {array[0],array[1],array[2],array[3]});
			
            }
            rBook1.close();
            for (String[] row : Book) {
				
				System.out.println("Book : "+ row[0]);
			}
            FileReader rStudent=new FileReader("StudentData.txt");
            BufferedReader rStudent1 = new BufferedReader(rStudent);
            while ((str=rStudent1.readLine()) != null) 
            {
                String[] array=str.split(" ");
			    Student.add(new String[] {array[0],array[1],array[2],array[3]});
			
            }
            rStudent1.close();
            for (String[] row : Student) {
				
				System.out.println("Student : "+ row[0]);
			}

            FileReader rLibrarian=new FileReader("LibrarianData.txt");
            BufferedReader rLibrarian1 = new BufferedReader(rLibrarian); 
            while ((str=rLibrarian1.readLine()) != null) 
            {
                String[] array=str.split(" ");
			    Librarian.add(new String[] {array[0],array[1],array[2]});
			
            }
            rLibrarian1.close();
            for (String[] row : Librarian) {
				
				System.out.println("Librarian : " +row[0]);
			}
            FileReader rStudentbook=new FileReader("StudentBookData.txt");
            BufferedReader rStudentbook1 = new BufferedReader(rStudentbook); 
            while ((str=rStudentbook1.readLine()) != null) 
            {
                String[] array=str.split(" ");
			    StudentBook.add(new String[] {array[0],array[1],array[2],array[3],array[4],array[5],array[6]});
			
            }
            rStudentbook1.close();
            for (String[] row : StudentBook) {
				
				System.out.println("StudentBook : "+row[0]);
			}
            
		
        
		

            
		
        int s_prn;
        String s_name;
        String s_email;
        String s_password;
        
        int l_id;
        String l_name;
        String l_password;
        
        int b_id;
        String b_name;
        String b_author;
        String b_publication;
        int b_prn;
        Date b_date;
        
        
        Pattern pattern;
        Matcher matcher;
        String PASSWORD_PATTERN = "((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,40})";
        String EMAIL_PATTERN = 
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            try
            {
                System.out.println("\nSelect your Option\n");
                System.out.println("1.Registration");
                System.out.println("2.Login");
                System.out.println("3.Exit");
                int ch=sc.nextInt();
                if(ch==1)
                {
                    while(true)
                    {
                        System.out.println("\nSelect your Option\n");
                        System.out.println("1.Librarian Registration");
                        System.out.println("2.Student Registration");
                        System.out.println("3.Exit");
                        int ch1=sc.nextInt();
                        if(ch1==1)
                        {
                            System.out.println("\nEnter ID: ");
                            int l_id1 = sc.nextInt();
                            System.out.println("\nEnter the name : ");
                            String l_name1 = sc.next(); 
                            System.out.println("\nEnter Valid Password like Pass.word@25 : ");
                            String l_password1=sc.next();
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
                                        System.out.println("\nEnter Valid Id : ");
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
                                        System.out.println("\nEnter Valid Name : ");
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
                                    matcher = pattern.matcher(l_password1);
                                    if(matcher.matches())
                                    {
                                        l_password=l_password1;
                                        break;
                                    }
                                    
                                    else
                                    {
                                        System.out.println("\nEnter Valid Password : ");
                                        l_password1=sc.next();
                                        continue;
                                    }

                                }
                                catch(Exception e)
                                {
                                    continue;
                                }
                            }
                            Librarian.add(new String[] {Integer.toString(l_id),l_name,l_password});
                            System.out.println("\nRegistration Done Successfully !!!");
                            FileWriter wLibrarian=new FileWriter("LibrarianData.txt",false);
                            BufferedWriter wLibrarian1=new BufferedWriter(wLibrarian);
                            
                            for (String[] row : Librarian) 
                            {
                                System.out.println("Row = " + Arrays.toString(row));
                                String s=row[0] +" "+ row[1] +" "+row[2];
                                //System.out.println(s);
                                wLibrarian1.write(s);
                                wLibrarian1.newLine();
                                
                            }
                            wLibrarian1.close();
                                    //System.out.println();
                        }
                        
                        else if(ch1==2)
                        {
                            System.out.println("\nEnter PRN : ");
                            int s_prn1 = sc.nextInt();
                            
                            System.out.println("\nEnter the name : ");
                            String s_name1 = sc.next();
                            
                            System.out.println("\nEnter your email id : ");
                            String s_email1 = sc.next();
                            
                            System.out.println("\nEnter Valid Password like Pass.word@25 : ");
                            String s_password1=sc.next();
                            
                            while(true)
                            {
                                try
                                {
                                    if((String.valueOf(s_prn1).length())>=9 && s_prn1==(int)s_prn1)
                                    {
                                        s_prn=s_prn1;
                                        break;

                                    }
                                    else
                                    {
                                        System.out.println("\nEnter Valid PRN : ");
                                        s_prn1=sc.nextInt();
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
                                    if((s_name1.getClass().getName())=="java.lang.String" && s_name1.length()>=4 && s_name1 != null)
                                    {
                                        s_name=s_name1;
                                        break;
                                    }
                                
                                    else
                                    {
                                        System.out.println("\nEnter Valid Name : ");
                                        s_name1=sc.next();
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
                                    matcher = pattern.matcher(s_email1);
                                    if(matcher.matches())
                                    {
                                        s_email=s_email1;
                                        break;
                                    }
                                    
                                    else
                                    {
                                        System.out.println("\nEnter Valid Email Id : ");
                                        s_email1=sc.next();
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
                                    matcher = pattern.matcher(s_password1);
                                    if(matcher.matches())
                                    {
                                        s_password=s_password1;
                                        break;
                                    }
                                    
                                    else
                                    {
                                        System.out.println("\nEnter Valid Password : ");
                                        s_password1=sc.next();
                                        continue;
                                    }

                                }
                                catch(Exception e)
                                {
                                    continue;
                                }
                            }
                            
                            Student.add(new String[] {String.valueOf(s_prn),s_name,s_email,s_password});
                            System.out.println("\nRegistration Done Successfully !!!");

                            FileWriter wStudent=new FileWriter("StudentData.txt",false);
                            BufferedWriter wStudent1=new BufferedWriter(wStudent);
                            
                            for (String[] row : Student) 
                            {
                                String s1=row[0]+" "+row[1]+" "+row[2]+" "+row[3] ;
                                //System.out.println(s1);
                                wStudent1.write(s1);
                                wStudent1.newLine();
                                
                                System.out.println("\nRow = " + Arrays.toString(row));
                            }
                            wStudent1.close();
                            //System.out.println("\nSuccess");
                            
                            
                            //System.out.println();   
                        }
                        else if(ch1==3)
                        {
                            break;
                        }
                        else
                        {
                            System.out.println("\nWrong Choice...........\n");
                            continue;
                        }

                    }

                }

                else if(ch==2)
                {
                    while(true)
                    {
                        System.out.println("\nSelect your Option\n");
                        System.out.println("1.Librarian Login");
                        System.out.println("2.Student Login");
                        System.out.println("3.Exit");
                        int ch1=sc.nextInt();
                        if(ch1==1)
                        {
                            System.out.println("\nEnter Id & Password for Login : ");
                            System.out.println("\nEnter ID: ");
                            int l_id1 = sc.nextInt();
                            System.out.println("\nEnter Valid Password like Pass.word@25 : ");
                            String l_password1=sc.next();
                            while(true)
                            {
                                try
                                {
                                    if((String.valueOf(l_id1).length())>=4 && l_id1==(int)l_id1)
                                    {
                                        
                                        break;

                                    }
                                    else
                                    {
                                        System.out.println("\nEnter Valid Id : ");
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
                                    pattern = Pattern.compile(PASSWORD_PATTERN);
                                    matcher = pattern.matcher(l_password1);
                                    if(matcher.matches())
                                    {
                                        
                                        break;
                                    }
                                    
                                    else
                                    {
                                        System.out.println("\nEnter Valid Password : ");
                                        l_password1=sc.next();
                                        continue;
                                    }

                                }
                                catch(Exception e)
                                {
                                    continue;
                                }
                            }
                            for(String[] row5 : Librarian )
                            {
                                if(Integer.toString(l_id1).equals(row5[0]) && l_password1.equals(row5[2]))
                                {
                                    System.out.println("\nLogin Successful !!!");
                                    while(true)
                                    {
                                        System.out.println("\nSelect your Option\n");
                                        System.out.println("1.Add Book");
                                        System.out.println("2.Delete Book");
                                        System.out.println("3.Issue Book");
                                        System.out.println("4.Return Book");
                                        System.out.println("5.Available Books Details");
                                        System.out.println("6.Issued Books Details");
                                        System.out.println("7.Total Issued Books");
                                        System.out.println("8.Total Available Books");
                                        System.out.println("9.Delete Student");
                                        System.out.println("10.Exit");
                                        int c=sc.nextInt();
                                        if(c==1)
                                        {
                                            System.out.println("\nEnter the Book Id : ");
                                            int b_id1= sc.nextInt();
                                            System.out.println("\nEnter the Book Name : ");
                                            String b_name1= sc.next();
                                            System.out.println("\nEnter the Book Author : ");
                                            String b_author1= sc.next();
                                            System.out.println("\nEnter the Book publication : ");
                                            String b_publication1= sc.next();
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
                                                        System.out.println("\nEnter Valid Book Id : ");
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
                                                        System.out.println("\nEnter Valid Book Name : ");
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
                                                        System.out.println("\nEnter Valid Book Author : ");
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
                                                        System.out.println("\nEnter Valid Book Publication : ");
                                                        b_publication1=sc.next();
                                                        continue;
                                                    }

                                                }
                                                catch(Exception e)
                                                {
                                                    continue;
                                                }
                                            }
                                            int f=0;
                                            for (String[] row : Book) 
                                            {
                                                if(String.valueOf(b_id)==row[0])
                                                {
                                                    f=1;
                                                }
                                            }
                                            if(f==0)
                                            {
                                                System.out.println("\nBook Id Already Exists !!!\n");
                                            }
                                            else{
                                                Book.add(new String[] {String.valueOf(b_id),b_name,b_author,b_publication});
                                                System.out.println("\nBook Added Successfully !!!\n");
                                            
                                            }
                                            FileWriter wBook=new FileWriter("BookData.txt",false);
                                            BufferedWriter wbook1=new BufferedWriter(wBook);
                                            
                                            for (String[] row : Book) {
                                                String s2=row[0]+" "+row[1]+" "+row[2]+" "+row[3] ;
                                                wbook1.write(s2);
                                                wbook1.newLine();
                                                
                                                System.out.println("\nRow = " + Arrays.toString(row));
                                            }
                                            wbook1.close();

                                        }
                                        else if(c==2)
                                        {
                                            System.out.println("\nEnter Book Id :");
                                            int b_id1=sc.nextInt();
                                            while(true)
                                            {
                                                try
                                                {
                                                    if(String.valueOf(b_id1).length()>=4 && b_id1==(int)b_id1)
                                                    {

                                                        break;

                                                    }
                                                    else
                                                    {
                                                        System.out.println("\nEnter Valid Book Id : ");
                                                        b_id1=sc.nextInt();
                                                        continue;
                                                    }

                                                }
                                                catch(Exception e)
                                                {
                                                    continue;
                                                }
                                            }
                                            int i=0;
                                            int f=0;
                                            for(String[] row : Book )
                                            {
                                                if(Integer.parseInt(row[0])==b_id1)
                                                {
                                                    f=1;
                                                    Book.remove(i);
                                                    System.out.println("\nBook Deleted Successfully !!!");
                                                    break;

                                                }
                                                i+=1;
                                            }
                                            if(f==0)
                                            {
                                                System.out.println("\nBook Id Not Exists !!!\n");
                                            }
                                            FileWriter wBook=new FileWriter("BookData.txt",false);
                                            BufferedWriter wbook1=new BufferedWriter(wBook);
                                            
                                            for (String[] row : Book) {
                                                String s2=row[0]+" "+row[1]+" "+row[2]+" "+row[3] ;
                                                wbook1.write(s2);
                                                wbook1.newLine();
                                                
                                                System.out.println("\nRow = " + Arrays.toString(row));
                                            }
                                            wbook1.close();


                                        }
                                        else if(c==3)
                                        {
                                            System.out.println("\nEnter the Book Id : ");
                                            int b_id1=sc.nextInt();
                                            System.out.println("\nEnter the PRN : ");
                                            int s_prn1=sc.nextInt();
                                            while(true)
                                            {
                                                try
                                                {
                                                    if(String.valueOf(b_id1).length()>=4 && b_id1==(int)b_id1)
                                                    {
                                                        
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
                                                    if((String.valueOf(s_prn1).length())>=9 && s_prn1==(int)s_prn1)
                                                    {
                                                        
                                                        break;

                                                    }
                                                    else
                                                    {
                                                        System.out.println("\nEnter Valid PRN : \n");
                                                        s_prn1=sc.nextInt();
                                                        continue;
                                                    }

                                                }
                                                catch(Exception e)
                                                {
                                                    continue;
                                                }
                                            }
                                            Date date = Calendar.getInstance().getTime();  
                                            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
                                            String strDate = dateFormat.format(date); 
                                            int i=0;
                                            int f=0;
                                            for(String[] row : Book)
                                            {
                                                if(Integer.parseInt(row[0])==b_id1)
                                                {
                                                    for(String[] row7 : Student)
                                                    {
                                                        if(Integer.parseInt(row7[0])==s_prn1)
                                                        {
                                                            f=1;
                                                            StudentBook.add(new String[] {row[0],row[1],row[2],row[3],Integer.toString(s_prn1),strDate});
                                                            Book.remove(i);
                                                            System.out.println("\nBook Issued Successfully !!!");
                                                            FileWriter wBook=new FileWriter("BookData.txt",false);
                                                            BufferedWriter wbook1=new BufferedWriter(wBook);
                                                            
                                                            for (String[] row3 : Book) {
                                                                String s2=row3[0]+" "+row3[1]+" "+row3[2]+" "+row3[3] ;
                                                                wbook1.write(s2);
                                                                wbook1.newLine();
                                                                
                                                                System.out.println("\nRow = " + Arrays.toString(row));
                                                            }
                                                            wbook1.close();
                                                            FileWriter wStudentbook=new FileWriter("StudentBookData.txt",false);
                                                            BufferedWriter wStudentbook1=new BufferedWriter(wStudentbook);
                                                            
                                                            for (String[] row2 : StudentBook) {
                                                                String s4=row2[0]+" "+row2[1]+" "+row2[2]+" "+row2[3]+" "+row2[4]+" "+row2[5];
                                                                wStudentbook1.write(s4);
                                                                wStudentbook1.newLine();
                                                                System.out.println("\nRow = " + Arrays.toString(row2));
                                                            }
                                                            wStudentbook1.close();
                                                            break;

                                                                }

                                                    }
                                                    
                                                    
                                                }
                                                i+=1;
                                            }
                                            if(f==0)
                                            {
                                                System.out.println("\nStudent Account Not Exists !!!\n");
                                            }                    

                                        }
                                        else if(c==4)
                                        {
                                            System.out.println("\nEnter the Book Id : ");
                                            int b_id1=sc.nextInt();
                                            System.out.println("\nEnter the PRN : ");
                                            int s_prn1=sc.nextInt();
                                            while(true)
                                            {
                                                try
                                                {
                                                    if(String.valueOf(b_id1).length()>=4 && b_id1==(int)b_id1)
                                                    {
                                                        
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
                                                    if((String.valueOf(s_prn1).length())>=9 && s_prn1==(int)s_prn1)
                                                    {
                                                        
                                                        break;

                                                    }
                                                    else
                                                    {
                                                        System.out.println("\nEnter Valid PRN : \n");
                                                        s_prn1=sc.nextInt();
                                                        continue;
                                                    }

                                                }
                                                catch(Exception e)
                                                {
                                                    continue;
                                                }
                                            }
                                            Date date = Calendar.getInstance().getTime();  
                                            
                                            int i=0;
                                            int f=0;
                                            for(String[] row : StudentBook)
                                            {
                                                if(Integer.parseInt(row[4])==s_prn1)
                                                {
                                                    for(String[] row7 : StudentBook)
                                                    {
                                                        if(Integer.parseInt(row7[4])==s_prn1)
                                                        {
                                                            f=1;
                                                            String d=row7[5]+" "+row[6];
                                                            System.out.println(d);
                                                            
                                                            Date date1=new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").parse(d); 
                                                            System.out.println(date1);
                                                            long diff1= date.getTime()-date1.getTime();
                                                            long diffDays1 = diff1 / (24 * 60 * 60 * 1000);
                                                            System.out.println(diffDays1);
                                                            
                                                            Book.add(new String[] {row[0],row[1],row[2],row[3]});
                                                            StudentBook.remove(i);
                                                            System.out.println("\nBook Returned Successfully !!!");
                                                            FileWriter wBook=new FileWriter("BookData.txt",false);
                                                            BufferedWriter wbook1=new BufferedWriter(wBook);
                                                            
                                                            for (String[] row1 : Book) {
                                                                String s2=row1[0]+" "+row1[1]+" "+row1[2]+" "+row1[3] ;
                                                                wbook1.write(s2);
                                                                wbook1.newLine();
                                                                
                                                                System.out.println("\nRow = " + Arrays.toString(row));
                                                            }
                                                            wbook1.close();
                                                            FileWriter wStudentbook=new FileWriter("StudentBookData.txt",false);
                                                            BufferedWriter wStudentbook1=new BufferedWriter(wStudentbook);
                                                            
                                                            for (String[] row2 : StudentBook) {
                                                                String s4=row[0]+" "+row[1]+" "+row[2]+" "+row[3]+" "+row[4]+" "+row[5];
                                                                wStudentbook1.write(s4);
                                                                wStudentbook1.newLine();
                                                                System.out.println("\nRow = " + Arrays.toString(row2));
                                                            }
                                                            wStudentbook1.close();
                                                            
                                                            break;
                                                        }
                                                    }
                                                }
                                                i+=1;
                                            }
                                            if(f==0)
                                            {
                                                System.out.println("\nStudent Account Not Exists !!!\n");
                                            }

                                        }
                                        else if(c==5)
                                        {
                                            System.out.println("\nAvailable Book Details :");

                                            System.out.println("\nBook Id\t\t\t Name\t\t\t\tAuthor\t\t   Publication \n");
                                            for(String[] row : Book){
                                                System.out.println(row[0]+"\t"+row[1]+"\t"+row[2]+"\t"+row[3]);
                                            }

                                        }
                                        else if(c==6)
                                        {
                                            System.out.println("\nIssued Book Details :");
                                            System.out.println("\nBook Id\t\t\t Name\t\t\t\tAuthor\t\t   Publication \n");
                                            
                                            for(String[] row : StudentBook){
                                                System.out.println(row[0]+"\t"+row[1]+"\t"+row[2]+"\t"+row[3]);
                                            }
                                            

                                        }
                                        else if(c==7)
                                        {
                                            int total=0;
                                            for(String[] row : StudentBook)
                                            {
                                                total=total+1;
                                            }
                                            System.out.println("\nTotal Issued Books : "+total);

                                        }
                                        else if(c==8)
                                        {
                                            int total=0;
                                            for(String[] row : Book)
                                            {
                                                total=total+1;
                                            }
                                            System.out.println("\nTotal Available Books : "+total);

                                        }
                                        else if(c==9)
                                        {
                                            System.out.println("\nEnter Student PRN :");
                                            int s_prn1=sc.nextInt();
                                            while(true)
                                            {
                                                try
                                                {
                                                    if(String.valueOf(s_prn1).length()>=9 && s_prn1==(int)s_prn1)
                                                    {

                                                        break;

                                                    }
                                                    else
                                                    {
                                                        System.out.println("\nEnter Valid PRN : \n");
                                                        s_prn1=sc.nextInt();
                                                        continue;
                                                    }

                                                }
                                                catch(Exception e)
                                                {
                                                    continue;
                                                }
                                            }
                                            int i=0;
                                            int f=0;
                                            for(String[] row : Student )
                                            {
                                                if(Integer.parseInt(row[0])==s_prn1)
                                                {
                                                    Student.remove(i);
                                                    f=1;
                                                    System.out.println("\nStudent Deleted Successfully !!!");
                                                    break;
                                                }
                                                i+=1;
                                            }
                                            if(f==0)
                                            {
                                                System.out.println("\nStudent Account Not Exists !!!\n");
                                            }
                                            FileWriter wStudent=new FileWriter("StudentData.txt",false);
                                            BufferedWriter wStudent1=new BufferedWriter(wStudent);
                                            
                                            for (String[] row : Student) 
                                            {
                                                String s1=row[0]+" "+row[1]+" "+row[2]+" "+row[3] ;
                                                //System.out.println(s1);
                                                wStudent1.write(s1);
                                                wStudent1.newLine();
                                                
                                                System.out.println("\nRow = " + Arrays.toString(row));
                                            }
                                            wStudent1.close();

                                        }
                                        else if(c==10)
                                        {
                                            break;
                                        }
                                        else
                                        {
                                            System.out.println("\nWrong Choice ............");
                                            continue;
                                        }
                                        
                                    }
                                    

                                }
                            }
                            //System.out.println("\nInvalid Id & Password");
                            //validation code
                            
                        }
                        else if(ch1==2)
                        {
                            System.out.println("\nEnter PRN & Password for Login : ");
                            System.out.println("\nEnter PRN: ");
                            int s_prn1 = sc.nextInt();
                            System.out.println("\nEnter Valid Password like Pass.word@25 : ");
                            String s_password1=sc.next();
                            while(true)
                            {
                                try
                                {
                                    if((String.valueOf(s_prn1).length())>=4 && s_prn1==(int)s_prn1)
                                    {
                                        
                                        break;

                                    }
                                    else
                                    {
                                        System.out.println("\nEnter Valid PRN : ");
                                        s_prn1=sc.nextInt();
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
                                    matcher = pattern.matcher(s_password1);
                                    if(matcher.matches())
                                    {
                                        
                                        break;
                                    }
                                    
                                    else
                                    {
                                        System.out.println("\nEnter Valid Password : ");
                                        s_password1=sc.next();
                                        continue;
                                    }

                                }
                                catch(Exception e)
                                {
                                    continue;
                                }
                            }
                            for(String[] row6 : Student )
                            {
                                if(Integer.toString(s_prn1).equals(row6[0]) && s_password1.equals(row6[3]))
                                {
                            //validation
                                    while(true)
                                    {
                                        System.out.println("\nLogin Successful !!!");
                                        System.out.println("\nSelect your Option\n");
                                        System.out.println("1.Search Book");
                                        System.out.println("2.Display Issued Book Details");
                                        System.out.println("3.Exit");
                                        int ch2=sc.nextInt();
                                        if(ch2==1)
                                        {
                                            while(true)
                                            {
                                                System.out.println("\n Select your Option");
                                                System.out.println("1.Search by Book Name");
                                                System.out.println("2.Search by Book Author");   
                                                System.out.println("3.Search by Book Publication");  
                                                System.out.println("4.Exit");
                                                int ch3=sc.nextInt();
                                                if(ch3==1)
                                                {
                                                    System.out.println("\nEnter the Book Name : ");
                                                    String b_name1=sc.next();
                                                    System.out.println("\nBook Id\t\t\t Name\t\t\t\tAuthor\t\t   Publication \n");
                                            
                                                    for(String[] row :Book)
                                                    {
                                                        if(b_name1.equals(row[1]))
                                                        {
                                                            System.out.println(row[0]+"\t"+row[1]+"\t"+row[2]+"\t"+row[3]);
                                                            break;
                                                        }
                                                    }
                                                    

                                                }
                                                else if(ch3==2)
                                                {
                                                    System.out.println("\nEnter the Book Author : ");
                                                    String b_author1=sc.next();
                                                    System.out.println("\nBook Id\t\t\t Name\t\t\t\tAuthor\t\t   Publication \n");
                                            
                                                    for(String[] row :Book)
                                                    {
                                                        System.out.println(row[2]);
                                                        if(b_author1.equals(row[2]))
                                                        {
                                                            
                                                            System.out.println(row[0]+"\t"+row[1]+"\t"+row[2]+"\t"+row[3]);
                                                            break;
                                                        }
                                                    }
                                                    

                                                }
                                                else if(ch3==3)
                                                {
                                                    System.out.println("\nEnter the Book Publication : ");
                                                    String b_publication1=sc.next();
                                                    System.out.println("\nBook Id\t\t\t Name\t\t\t\tAuthor\t\t   Publication \n");
                                            
                                                    for(String[] row :Book)
                                                    {
                                                        if(b_publication1.equals(row[3]))
                                                        {
                                                            System.out.println(row[0]+"\t"+row[1]+"\t"+row[2]+"\t"+row[3]);
                                                            break;
                                                        }
                                                    }
                                                    

                                                }
                                                else if(ch3==4)
                                                {
                                                    break;
                                                }
                                                else{
                                                    System.out.println("\nWrong Choice...........");
                                                }
                                            }


                                }
                                else if(ch2==2){
                                    System.out.println("\nIssued Book Details :");
                                    System.out.println("\nBook Id\t\t\t Name\t\t\t\tAuthor\t\t   Publication \n");
                                                            
                                    for(String[] row : StudentBook){
                                        if(Integer.toString(s_prn1)==row[4])
                                        {
                                            System.out.println(row[0]+"\t"+row[1]+"\t"+row[2]+"\t"+row[3]);
                                    

                                        }
                                        
                                    }

                                }
                                else if(ch2==3)
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("\nWrong Choice ............");
                                    continue;
                                }
                            }
                                }
                            }
                            //System.out.println("\nInvalid PRN & Password  ");

                        }
                        else if(ch1==3)
                        {
                            break;
                        }
                        else
                        {
                            System.out.println("\nWrong Choice ............");
                            continue;
                        }
                    }
                }
                else if(ch==3)
                {
                    break;
                }
                else{
                    System.out.println("\nWrong Choice ............");
                    continue;
                }
                
                

            }
            catch(Exception e)
            {
                System.out.println("\nWrong Choice ............");
                continue;
            }
        }


    }
    catch(Exception e)
    {

    }
    }
}