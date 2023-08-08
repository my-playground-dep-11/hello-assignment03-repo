import java.util.Scanner;

public class Assignment3 {
    private static final Scanner scanner = new Scanner(System.in);

    
    public static void main(String[] args) {
        
        
        System.out.print("Enter your name:  ");
        String name = scanner.nextLine();

    

        final String RED_COLOR = "\033[31;1m";
        final String BLUE_COLOR = "\033[34;1m";
        final String RESET = "\033[30;0m";
        final String GREEN_COLOR = "\033[32;1m";
        final String YELLOW_COLOR = "\033[33;1m";

        if (name.length() > 0){
            if (name.startsWith(" ")){
                System.out.printf("%sInvalid Name!%2$s\n", RED_COLOR, RESET);
                return;
            }else{
                String name1 = name.toUpperCase();
                String finalName = String.format("Name   : %2$s%1$s%3$s", name1, BLUE_COLOR, RESET);
                System.out.print("Enter your age:  ");
                Integer age = scanner.nextInt();
                scanner.nextLine();
                if ((age < 10) || (age > 18)){
                    System.out.printf("%sInvalid Age!%2$s \n", RED_COLOR, RESET);
                    return;
                }else {
                    String finalAge = String.format("Age    : %s years old", age);
                    System.out.print("Enter your Subject 1 : ");
                    String subject1 = scanner.nextLine();
                    if (subject1.startsWith("SE")){
                        String x1 = subject1.substring(3);
                        int num1 = Integer.valueOf(x1);
                        String y1 = subject1.substring(0,3);
                        String finalSubject1 = String.format("%2$s%1$03d", num1, y1);
                        System.out.print("Enter your Marks 1 : ");
                        Double marks1 = scanner.nextDouble();
                        scanner.nextLine();                       

                        if ((0 > marks1) || (100 < marks1)){
                            System.out.printf("%sInvalid Marks!%2$s \n",RED_COLOR, RESET);
                            return;
                        }else{
                            String finalMarks1 = String.format("%.2f", marks1);
                            System.out.print("Enter your Subject 2 : ");
                            String subject2 = scanner.nextLine();
                            if (subject2.startsWith("SE")){
                                if (subject2.equals(subject1)){
                                    System.out.printf("%sSubject already exist!%2$s\n", RED_COLOR, RESET);
                                    return;
                                }else{
                                    String x2 = subject2.substring(3);
                                    int num2 = Integer.valueOf(x2);
                                    String y2 = subject2.substring(0,3);
                                    String finalSubject2 = String.format("%2$s%1$03d", num2, y2);
                                    System.out.print("Enter your Marks 2 : ");
                                    Double marks2 = scanner.nextDouble();
                                    scanner.nextLine();
                                    if ((0 > marks2) || (100 < marks2)){
                                        System.out.printf("%sInvalid Marks!%2$s \n", RED_COLOR, RESET);
                                    }else{
                                        String finalMarks2 = String.format("%.2f", marks2);
                                        System.out.print("Enter your Subject 3 : ");
                                        String subject3 = scanner.nextLine();
                                        if (subject3.startsWith("SE")){
                                            if (subject3.equals(subject2)){
                                                System.out.printf("%sSubject already exist!%2$s\n", RED_COLOR, RESET);
                                                return;

                                            }else{
                                                if (subject3.equals(subject1)){
                                                    System.out.printf("%sSubject already exist!%2$s\n", RED_COLOR, RESET);
                                                    return;

                                                }else{
                                                    String x3 = subject3.substring(3);
                                                    int num3 = Integer.valueOf(x3);
                                                    String y3 = subject3.substring(0,3);
                                                    String finalSubject3 = String.format("%2$s%1$03d", num3, y3);
                                                    System.out.print("Enter your Marks 3 : ");
                                                    Double marks3 = scanner.nextDouble();
                                                    scanner.nextLine();
                                                    if ((0 > marks3) || (100 < marks3)){
                                                        System.out.printf("%sInvalid Marks!%2$s\n", RED_COLOR, RESET);
                                                    }else{
                                                        String finalMarks3 = String.format("%.2f", marks3);
                                            
                                                                
                                                                Double total = marks1 + marks2 + marks3;
                                                                Double average = total / 3;
                                                                String percentageMark = "%";
                                                                String finalAverage = String.format("%.2f%2$s", average, percentageMark );
                                                                if (average >= 75){
                                                                    String status1 = "Distinguished Pass";
                                                                    String finalStatus1 = String.format("%2$s%1$s%3$s", status1, BLUE_COLOR, RESET);
                                                                    String str1 = "-";
                                                                    String repeatString = str1.repeat(40);
                                                                    System.out.printf("+%s+\n", repeatString);
                                                                    System.out.printf("|%-54s|\n", finalName);
                                                                    System.out.printf("|%-40s|\n", finalAge);
                                                                    System.out.printf("|Status : %-45s|\n", finalStatus1);
                                                                    System.out.printf("|Total  : %-12sAverage : %2$-9s|\n", total, finalAverage);
                                                                    System.out.printf("+%s+\n", repeatString);
                                                                    System.out.printf("| %-6s | %2$-5s |%3$22s|\n", "Subject", "Marks", "Status");
                                                                    
                                                                    System.out.printf("| %-7s | %2$-5s |%3$36s|\n", finalSubject1, finalMarks1, finalStatus1);
                                                                    

                                                                    

                                                                    System.out.printf("| %-7s | %2$-5s |%3$36s|\n", finalSubject2, finalMarks2, " ");
                                                                    
                                                                    

                                                                    
                                                                        
                                                                
                                                            
                                                                
                                                                    System.out.printf("| %-7s | %2$-5s |%3$22s|\n", finalSubject3, finalMarks3, " ");
                                                                    System.out.printf("+%s+\n", repeatString);

                                                                    
                                                                    
                                                                    

                                                                }else if (average >= 65){
                                                                    String status1 = "Credit Pass";
                                                                    String finalStatus1 = String.format("%2$s%1$s%3$s", status1, GREEN_COLOR, RESET);
                                                                    String str1 = "-";
                                                                    String repeatString = str1.repeat(40);
                                                                    System.out.printf("+%s+\n", repeatString);
                                                                    System.out.printf("|%-54s|\n", finalName);
                                                            System.out.printf("|%-40s|\n", finalAge);
                                                            System.out.printf("|Status : %-45s|\n", finalStatus1);
                                                            System.out.printf("|Total  : %-12sAverage : %2$-9s|\n", total, finalAverage);
                                                            System.out.printf("+%s+\n", repeatString);
                                                            System.out.printf("| %-6s | %2$-5s |%3$22s|\n", "Subject", "Marks", "Status");
                                                            
                                                            System.out.printf("| %-7s | %2$-5s |%3$36s|\n", finalSubject1, finalMarks1, finalStatus1);
                                                                    

                                                                

                                                    
                                                                    
                                                            System.out.printf("| %-7s | %2$-5s |%3$22s|\n", finalSubject2, finalMarks2, " ");

                                                                    
                                                    
                                                           
                                                            System.out.printf("| %-7s | %2$-5s |%3$22s|\n", finalSubject3, finalMarks3, " ");
                                                            System.out.printf("+%s+\n", repeatString);
                                                    
                                                        }else if (average >= 55){
                                                            String status1 = "Pass";
                                                            String finalStatus1 = String.format("%2$s%1$s%3$s", status1, YELLOW_COLOR, RESET);
                                                            String str1 = "-";
                                                            String repeatString = str1.repeat(40);
                                                            System.out.printf("+%s+\n", repeatString);
                                                            System.out.printf("|%-54s|\n", finalName);
                                                            System.out.printf("|%-40s|\n", finalAge);
                                                            System.out.printf("|Status : %-45s|\n", finalStatus1);
                                                            System.out.printf("|Total  : %-12sAverage : %2$-9s|\n", total, finalAverage);
                                                            System.out.printf("+%s+\n", repeatString);
                                                            System.out.printf("| %-6s | %2$-5s |%3$22s|\n", "Subject", "Marks", "Status");
                                                            
                                                            System.out.printf("| %-7s | %2$-5s |%3$36s|\n", finalSubject1, finalMarks1, finalStatus1);
                                                                    

                                                                    

                                                            
                                                                    
                                                            System.out.printf("| %-7s | %2$-5s |%3$22s|\n", finalSubject2, finalMarks2, " ");

                                                                    
                                                            System.out.printf("| %-7s | %2$-5s |%3$22s|\n", finalSubject3, finalMarks3, " ");
                                                            System.out.printf("+%s+\n", repeatString);

                                                        }else{
                                                            String status1 = "Fail";
                                                            String finalStatus1 = String.format("%2$s%1$s%3$s", status1, RED_COLOR, RESET);
                                                            String str1 = "-";
                                                            String repeatString = str1.repeat(40);
                                                            System.out.printf("+%s+\n", repeatString);
                                                            System.out.printf("|%-54s|\n", finalName);
                                                            System.out.printf("|%-40s|\n", finalAge);
                                                            System.out.printf("|Status : %-45s|\n", finalStatus1);
                                                            System.out.printf("|Total  : %-12sAverage : %2$-9s|\n", total, finalAverage);
                                                            System.out.printf("+%s+\n", repeatString);
                                                            System.out.printf("| %-6s | %2$-5s |%3$22s|\n", "Subject", "Marks", "Status");
                                                            
                                                                       
                                                                       
                                                            System.out.printf("| %-7s | %2$-5s |%3$36s|\n", finalSubject1, finalMarks1, finalStatus1);
                                                                    

                                                                    

                                                            System.out.printf("| %-7s | %2$-5s |%3$22s|\n", finalSubject2, finalMarks2, " ");
                                                                    
                                                            System.out.printf("| %-7s | %2$-5s |%3$22s|\n", finalSubject3, finalMarks3, " ");
                                                            System.out.printf("+%s+\n", repeatString);
                                                        }
                                                           
                                                    }
                                                }
                                            }
                                        }else{
                                            System.out.printf("%sInvalid Subject!%2$s \n", RED_COLOR, RESET);
                                            return;
                                        }
                                    }
                                }
                            }else{
                                System.out.printf("%sInvalid Subject!%2$s \n", RED_COLOR, RESET);
                                return;
                            }
                        }
                    }else {
                        System.out.printf("%sInvalid Subject!%2$s \n", RED_COLOR, RESET);
                        return;
                    }
                }
            }
    
        }else{
            System.out.printf("%sInvalid Name!%2$s\n", RED_COLOR, RESET);
            return;
        }
        


                                                                  
        
            
        

        



        
    }
    
}
