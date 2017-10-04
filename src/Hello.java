import java.util.Scanner;
import java.util.Scanner;
public class Hello {
public static void main (String[]args)
{
    String name;
    Scanner keyboard=new Scanner(System.in);
    System.out.println("enter your name");
    name=keyboard.next();
   System.out.println(heythere(name));

}
public static String heythere(String name)
{return "hello,"+name+"!";
}
}
        