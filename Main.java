import java.io.*;
import java.util.*;
class Main{
public static void main(String args[]){
File f=new File("data.txt");
try{
Scanner s=new Scanner(f);
String[] tuple;
String row;
s.useDelimiter("\n");
System.out.println("Name  \t  Age  \t  Skill\n_______________________");
while(s.hasNext()){
row=s.next();
tuple=row.split(" ");
System.out.println(tuple[0]+"    "+tuple[1]+"    "+tuple[2]);
}
}catch(FileNotFoundException e){
    }

}
}
