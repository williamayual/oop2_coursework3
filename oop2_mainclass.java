
package oop2_coursework3;
import java.util.Scanner;
import java.util.ArrayList;

public class oop2_mainclass {
 public static void main(String[]args){
     oop2_coursework3 stds=new oop2_coursework3(56);
     Scanner Smarks=new Scanner(System.in);
    
     //System.out.println(stds.mark);
     String course[]={"oop3","BMC","BIT","DCS","BSC","research method"};
     ArrayList<Integer> allmarks=new ArrayList();
      int studentsmarks;
      for(;true;){
             oop2_coursework3 std=new oop2_coursework3();
             System.out.println("enter name:");
             std.setName(Smarks.next());
             System.out.println("enter yob");
             std.setYob(Smarks.next());
             System.out.println("enter regNo" );
             std.setRegno(Smarks.nextInt());
             if(std.getName().toUpperCase().equals("willy"))
                 break;
                     
         else
             {
      System.out.println("enter student mark Details:");
     for(int x=0;x < 6; x++){
        System.out.print(course[x]+":"); 
         studentsmarks=Smarks.nextInt();
         stds.setMark(studentsmarks);
         allmarks.add(studentsmarks);
         
     }
         
     }
     int total=0;
     for(int q=0;q< allmarks.size(); q++){
      total+= allmarks.get(q);
 }
     int average=total/6;
     System.out.println("total marks:"+ total);
     System.out.println("average marks:"+ average);
     allmarks.clear();
 } 
 }
}
