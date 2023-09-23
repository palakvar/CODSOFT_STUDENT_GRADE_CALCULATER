import java.util.*;
class Student
{
  public static void main (String args [])
  {
    int n,i;
    String grade;
  Scanner br= new Scanner(System.in);
   System. out. println("Enter the number of students");
  n = br.nextInt();
   int r[]= new int[n];
  String name []= new String[n];
  int m1[]= new int [n];
 int m2[]= new int [n];
 int m3[]= new int [n];
 int m4[]= new int[n];
 int m5[]= new int[n];
double avg[]=new double[n];
int total[] = new int[n];
 for(i = 0; i<n;i++)
 {
     System. out. println("Enter the roll no. of student");
     r[i]=br.nextInt();
     System. out. println("Enter the name of students");
     name[i]=br.next();
     System. out. println("Enter marks in English");
     m1[i]=br.nextInt();
     System.out.println("Enter marks in Hindi");
     m2[i]=br.nextInt();
     System.out.println("Enetr marks in Maths");
     m3[i]=br.nextInt();
     System.out.println("Enetr marks in Science");
     m4[i]=br.nextInt();
     System.out.println("Enter marks in Computer");
     m5[i]=br.nextInt(); 
     total[i]=m1[i]+m2[i]+m3[i]+m4[i]+m5[i];
     avg[i] = (m1[i]+m2[i]+m3[i]+m4[i]+m5[i])/5 ;
   }
   System.out.println("SNo.  Name  \tEnglish\tHindi\tMaths\tScience   Computer  Total   Percentage%      Grade");
   for(i=0;i<n;i++)
   {
    System.out.print(r[i]+"   "+name[i]+"  \t"+m1[i]+"\t"+m2[i]+"\t"+m3[i]+"\t"+m4[i]+"\t  "+m5[i]+"\t    "+total[i]+" \t"+avg[i]+"      ");
    //avg[i]=(m1[i]+m2[i]+m3[i])/3;
  if(avg[i]>=90 && avg[i]<=100)
  {
    grade="A++";
  System. out. println("\t"+grade);
  }
  else if(avg[i]>=80 && avg[i]<=89)
   {
    grade="A";
     System. out. println("\t"+grade);
     }
   else  if(avg[i]>=70 &&avg[i]<=79)
     {
      grade="B+";
       System. out. println("\t"+grade);
       }
    else   if(avg[i]>=60 && avg[i]<=69)
       {
        grade="B";
           System. out. println("\t"+grade);
           }
         else if(avg[i]>=50 && avg[i]<=59)
          {
            grade="C+";
          System. out. println("\t"+grade);
           }
           else if(avg[i]>=40 && avg[i]<=49)
            {
              grade="C";
              System.out.println("\t"+grade);
            }
            else if(avg[i]>=30 && avg[i]<=39)
             {
              grade="D";
               System.out.print("\t"+grade);
             }
             else if(avg[i]>=0 && avg[i]<=29)
             {
              grade="Fail";
               System. out. println("\t"+grade);
             }
          }
           }
           }