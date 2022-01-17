//Name: Julian van Geest
//Date: 10/17/2021
//Project Description: This program can read a csv file, in this 
//case a student grade database. It will also compute each student's
//final grade letter (of total grade: 20% for HW, 50% for Midterm, 
//30% for final) and write back the total grade letter for each
//student and update (save) the csv file.
//Input: csv file
//Output: total grade letter
//Comment: 

package myCLUHW7;

import java.io.*;
import java.util.Scanner;

public class HW7 {

	public static void main(String[] args) throws FileNotFoundException {
		int i = 0;
		String[] StudentID = new String[256];
		String[] FirstName = new String[256];
		String[] LastName = new String[256];
		String[] Homework = new String[256];
		String[] Midterm = new String[256];
		String[] Final = new String[256];
		String[] FinalGrade = new String[256];
		try {
			// Create an input stream for the file
			DataInputStream input = new DataInputStream(new FileInputStream("C:\\Users\\julia\\OneDrive\\Documents\\CSC210\\myCLUHW7\\studentgradedatabase.csv"));
			// Read values from the file
			String value = "";
			String[] fileData;
			while((value = input.readLine()) != null) {
				i++;
				if (i == 1) {
					continue;
				}
				fileData = value.split(",");
				StudentID[i-2] = fileData[0];
				FirstName[i-2] = fileData[1];
				LastName[i-2] = fileData[2];
				Homework[i-2] = fileData[3];
				Midterm[i-2] = fileData[4];
				Final[i-2] = fileData[5];
				System.out.println(fileData[0] + ", " + fileData[1] + ", " + fileData[2] + ", " + fileData[3] + ", " + fileData[4] + ", " + fileData[5] + ", ");
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			// Create an output stream to the file
			PrintWriter output = new PrintWriter(new FileOutputStream("C:\\Users\\julia\\OneDrive\\Documents\\CSC210\\myCLUHW7\\studentgradedatabase.csv"));
			// Output values to the file
			for (int a = 0; a < StudentID.length; a++) {
				if (StudentID[a] != null) {
					FinalGrade[a] = gradeLetter(Integer.parseInt(Homework[a]), Integer.parseInt(Midterm[a]), Integer.parseInt(Final[a]));
					output.println(StudentID[a] + ", " + FirstName[a] + ", " + LastName[a] + ", " + Homework[a] + ", " + Midterm[a] + ", " + Final[a] + ", " + FinalGrade[a]);
				}
				
			}
			output.close();
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("End of program");
	}
	
	public static String gradeLetter(int studentHW, int studentMidterm, int studentFinal) {
		double calculation = studentHW * 0.2 + studentMidterm * 0.5 + studentFinal * 0.3;
		if (calculation >= 90)
			return "A";
		else if (calculation >= 80)
			return "B";
		else if (calculation >= 70)
			return "C";
		else if (calculation >= 60)
			return "D";
		else
			return "F";
	}
}
