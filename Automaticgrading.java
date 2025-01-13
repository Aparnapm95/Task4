package guviprg;

public class Automaticgrading {

	public static void main(String[] args) {
		System.out.println("Enter Grade varying from S,A,B,C,D");
	        String grade = "B";
	        if (grade == "S") {
	            System.out.println(
	                "Student has scored between 90 to 100");
	        }
	        else if (grade == "A") {
	            System.out.println(
	                "Student has scored between 80 to 90");
	        }
	        else if (grade == "B") {
	            System.out.println(
	                "Student has scored between 70 to 80");
	        }
	        else if (grade == "C") {
	            System.out.println(
	                "Student has scored between 60 to 70");
	        }
	        else if (grade == "D") {
	            System.out.println(
	                "Student has scored between 50 to 60");
	        }
	        else {
	 
	            System.out.println(
	                "The grade you entered is not valid!");
	}
	}
}
