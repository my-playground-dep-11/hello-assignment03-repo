import java.util.Scanner;

public class Assignment3 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        final String COLOR_RED = "\033[31;1m";
        final String RESET = "\033[30;0m";
        final String BLUE_COLOR = "\033[34;1m";
        final String GREEN_COLOR = "\033[32;1m";
        final String YELLOW_COLOR = "\033[33;1m";

        String name;
        int age;
        String subject1;
        String subject2;
        String subject3;
        double marks1;
        double marks2;
        double marks3;

        final String ERROR_MSG = String.format("%s%s%s \n", COLOR_RED,"%s",RESET);

app:{ System.out.print("Enter your name: ");
        name = scanner.nextLine().strip();

        if(name.length() == 0){
            System.out.printf(ERROR_MSG,"Name can't be empty");
            break app;
        }

        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        scanner.nextLine();
        // scanner.skip(System.lineSeparator());

        if(age<10 || age>18){
            System.out.printf(ERROR_MSG,"Invalid age");
            break app;
        }

        System.out.print("Enter subject1: ");
        subject1 = scanner.nextLine().strip();

        if(subject1.isBlank()){
            System.out.printf(ERROR_MSG,"Subject one can't be empty");
            break app;
        }else if(!subject1.startsWith("SE-")){
            System.out.printf(ERROR_MSG,"Inavlid Subject 1");
            break app;
        }

        System.out.printf("Enter marks for %s: ",subject1);
        marks1 = scanner.nextDouble();
        scanner.nextLine();

        if(marks1<0 || marks1>100){
            System.out.printf(ERROR_MSG,"Invalid marks");
            break app;
        }

        System.out.print("Enter subject2: ");
        subject2 = scanner.nextLine().strip();

        if(subject1.isBlank()){
            System.out.printf(ERROR_MSG,"Subject one can't be empty");
            break app;
        }else if(!subject2.startsWith("SE-")){
            System.out.printf(ERROR_MSG,"Inavlid Subject 1");
            break app;
        }else if(subject2.equals(subject1)){
            System.out.printf(ERROR_MSG,"Inavlid Subject 2. Subject already exists");
            break app;
        }

        System.out.printf("Enter marks for %s: ",subject2);
        marks2 = scanner.nextDouble();
        scanner.nextLine();

        if(marks2<0 || marks2>100){
            System.out.printf(ERROR_MSG,"Invalid marks");
            break app;
        }

        System.out.print("Enter subject3: ");
        subject3 = scanner.nextLine().strip();

        if(subject1.isBlank()){
            System.out.printf(ERROR_MSG,"Subject one can't be empty");
            break app;
        }else if(!subject3.startsWith("SE-")){
            System.out.printf(ERROR_MSG,"Inavlid Subject 1");
            break app;
        }else if(subject3.equals(subject1) || subject3.equals(subject2)){
            System.out.printf(ERROR_MSG,"Inavlid Subject 3. Subject already exists");
            break app;
        }

        System.out.printf("Enter marks for %s: ",subject3);
        marks3 = scanner.nextDouble();
        scanner.nextLine();

        if(marks3<0 || marks3>100){
            System.out.printf(ERROR_MSG,"Invalid marks");
            break app;
        }
        

        final String DISTINGUISHED_PASS = BLUE_COLOR + "DISTINGUISHED PASS(DP)" + RESET;
        final String CREDIT_PASS = GREEN_COLOR + "CREDIT PASS(CP)" + RESET;
        final String PASS = YELLOW_COLOR + "PASS(P)" + RESET;
        final String FAIL = COLOR_RED + "FAIL(F)" + RESET;

        double total  = marks1 + marks2 + marks3;
        double average = total / 3;



        String status;              //Overall status
        String subject1Status;
        String subject2Status;
        String subject3Status;


        if (average >= 75) status = DISTINGUISHED_PASS;
        else if (average >= 65) status = CREDIT_PASS;
        else if (average >= 55) status = PASS;
        else status = FAIL;

        if (marks1 >= 75) subject1Status = DISTINGUISHED_PASS;
        else if (marks1 >= 65) subject1Status = CREDIT_PASS;
        else if (marks1 >= 55) subject1Status = PASS;
        else subject1Status =  FAIL;

        if (marks2 >= 75) subject2Status = DISTINGUISHED_PASS;
        else if (marks2 >= 65) subject2Status = CREDIT_PASS;
        else if (marks2 >= 55) subject2Status = PASS;
        else subject2Status = FAIL;

        if (marks3 >= 75) subject3Status = DISTINGUISHED_PASS;
        else if (marks3 >= 65) subject3Status = CREDIT_PASS;
        else if (marks3 >= 55) subject3Status = PASS;
        else subject3Status = FAIL;

        subject1 = String.format("SE-%03d",Integer.valueOf(subject1.substring(3)));
        subject2 = String.format("SE-%03d",Integer.valueOf(subject2.substring(3)));
        subject3 = String.format("SE-%03d",Integer.valueOf(subject3.substring(3)));

        name = String.format("%s%3$s%2$s",BLUE_COLOR,RESET, name.toUpperCase());

        




        System.out.println("+".concat("-".repeat(50)).concat("+"));
        System.out.printf("| %-10s: %-51s|\n", "Name", name);
        System.out.printf("| %-10s: %-37s|\n", "Age", age + " years old");
        System.out.printf("| %-10s: %-51s|\n", "Status", status);
        System.out.printf("| %-10s: %-17s", "Total", String.format("%.2f",total));
        System.out.printf(" %10s: %-7s|\n", "Average", String.format("%.2f",average).concat("%"));

        final String LINE = "+".concat("-".repeat(10)).concat("+").concat("-".repeat(12)).concat("+").concat("-".repeat(26).concat("+"));
        System.out.println(LINE);
        System.out.printf("|%-10s|%-12s|%-26s|\n", "Subject", "Marks", "Grade");
        System.out.println(LINE);
        System.out.printf("|%-10s|%-12s|%-40s|\n", subject1, marks1, subject1Status);
        System.out.printf("|%-10s|%-12s|%-40s|\n", subject2, marks2, subject2Status);
        System.out.printf("|%-10s|%-12s|%-40s|\n", subject3, marks3, subject3Status);
        System.out.println("+".concat("-".repeat(50)).concat("+"));
        
        
    }   
    

        


                                                                  
        
            
        

        



        
    }
    
}
