import java.util.Scanner;

class StudentGradeCalculator 
{
    public static void main(String[] args) 
    {
        Scanner inputMarks = new Scanner(System.in);

        System.out.println("Subject 1 (out of 100):");
        float sub1 = inputMarks.nextFloat();
        
        System.out.println("Subject 2 (out of 100):");
        float sub2 = inputMarks.nextFloat();

        System.out.println("Subject 3 (out of 100):");
        float sub3 = inputMarks.nextFloat();

        System.out.println("Subject 4 (out of 100):");
        float sub4 = inputMarks.nextFloat();
        
        float total = sub1+sub2+sub3+sub4;
        float percentage = total/4;
        
        System.out.println("\nTotal Marks = " + total);
        System.out.println("Average Percentage = " + percentage);
       
        if (percentage >= 90 && percentage == 100)
        {
            System.out.println("Grade = A+");
        }
        else if (percentage >= 80)
        {
            System.out.println("Grade = A");
        }
        else if (percentage >= 65)
        {
            System.out.println("Grade = B+");
        }
        else if (percentage >= 55)
        {
            System.out.println("Grade = B");
        }
        else if (percentage >= 30)
        {
            System.out.println("Grade = C");
        }
        else
        {
            System.out.println("Grade = F");
        }

        System.out.println("\n");
        System.out.println("-----------------------------------------------------");
        System.out.println("Grade scale chart : ");
        System.out.println("-----------------------------------------------------");
        System.out.println("90 - 100% = A+ = Very Good");
        System.out.println("80 - 89% = A = Good");
        System.out.println("65 - 79% = B+ = Average");
        System.out.println("55 - 64% = B = Below Average");
        System.out.println("30 - 54% = C = Pass");
        System.out.println("29% and below = F = Fail"); 
    }
}