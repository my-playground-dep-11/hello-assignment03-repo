public class table {
    public static void main(String[] args) {
    


        // String str1 = "-";
        // String repeatString = str1.repeat(40);
        // System.out.printf("+%s+\n", repeatString);
        // System.out.printf("|%-54s|\n", finalName);
        // System.out.printf("|%-40s|\n", finalAge);
        // System.out.printf("|Status : %-45s|\n", status);
        // System.out.printf("|Total  : %-12sAverage : %2$-9s|\n", total, finalAverage);
        // System.out.printf("+%s+\n", repeatString);
        // System.out.printf("| %-6s | %2$-5s |%3$22s|\n", "Subject", "Marks", "Status");
        // System.out.printf("| %-7s | %2$-5s |%3$36s|\n", finalSubject1, finalMarks1, " ");
        // System.out.printf("| %-7s | %2$-5s |%3$36s|\n", finalSubject2, finalMarks2, " ");
        // System.out.printf("| %-7s | %2$-5s |%3$36s|\n", finalSubject3, finalMarks3, " ");
        // System.out.printf("+%s+\n", repeatString);

        final String COLOR_RED = "\033[31;1m";
        final String RESET = "\033[30;0m";
        final String BLUE_COLOR = "\033[34;1m";
        final String GREEN_COLOR = "\033[32;1m";
        final String YELLOW_COLOR = "\033[33;1m";

        final String DISTINGUISHED_PASS = BLUE_COLOR + "DISTINGUISHED PASS(DP)" + RESET;
        final String CREDIT_PASS = GREEN_COLOR + "CREDIT PASS(CP)" + RESET;
        final String PASS = YELLOW_COLOR + "PASS(P)" + RESET;
        final String FAIL = COLOR_RED + "FAIL(F)" + RESET;

        


        String name = "Kasun Sampath";
        Integer age = 10;
        String subject1 = "SE-1";
        String subject2 = "SE-2";
        String subject3 = "SE-3";
        Double marks1 = 97.00;
        Double marks2 = 77.00;
        Double marks3 = 35.00;




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
