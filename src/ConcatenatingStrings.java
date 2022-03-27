import java.util.Scanner;

public class ConcatenatingStrings {
    public static void main (String[] args){
        String firstname, lastname, fullname;

        Scanner sc = new Scanner(System.in);

        System.out.println("Input firstname: ");
        firstname = sc.next();
        System.out.println("Input last name: ");
        lastname = sc.next();

        fullname = firstname.concat(lastname);

        System.out.println("Your names are: "+ fullname);
        System.out.println("Compare: "+fullname.compareTo(lastname));
        System.out.println("Is a Composition of the string: "+fullname.equalsIgnoreCase(lastname));
    }
}
