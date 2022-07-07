package optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

         Optional.ofNullable(null)
                 .ifPresentOrElse(email->
                     //logic
                     System.out.println("Sending email to "+ email)
                 ,()-> System.out.println("Cannot send email"));

    }
}
