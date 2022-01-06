import java.util.*;
import java.lang.String;

class Student
{
String Name;
double TotalScore = 0;
int NumberOfQuizzes = 3;

	public Student(String Name, double Score)
	{
		this.Name = Name;
		TotalScore = TotalScore + Score;
	}
	
	public Student(double Score, String Name)
	{
		this.Name = Name;
		TotalScore = TotalScore + Score;		
	}
	
	public Student(String Name)
	{
		this.Name = Name;
	}
	
	public String getName()
	{
		return Name;
	}
	
	public double getAverage()
	{
		return (TotalScore/NumberOfQuizzes);
	}
	
	public double getTotalScore()
	{
		return TotalScore;
	}
	
	public void addQuiz(double Score)
	{
		TotalScore = TotalScore + Score;
	}
	
	public void printStudent() 
	{
		
		System.out.println( getName() + "'s Total Score is = " + getTotalScore());
		System.out.println( getName() + "'s Average Score is = " + getAverage());
		
	}
	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		String name;
		Double Score;
		
		System.out.print("Enter Student Name = ");
		name = s1.nextLine();
		
		Student obj = new Student(name);
		
		System.out.print("Score of quiz 1 = ");
		Score = s1.nextDouble();
		obj.addQuiz(Score);
		
		System.out.print("Score of quiz 2= ");
		Score = s1.nextDouble();
		obj.addQuiz(Score);
		
		System.out.print("Score of quiz 3 = ");
		Score = s1.nextDouble();
		obj.addQuiz(Score);
		
		obj.printStudent();
		
        s1.close();
	}
	
}
