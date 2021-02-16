package snhu.jukebox.playlist;

import snhu.student.playlists.*;

import java.util.ArrayList;
import java.util.List;

public class StudentList {

	public StudentList(){
	}

	public List<String> getStudentsNames() {
		ArrayList<String> studentNames = new ArrayList<String>();
		
		String StudentName1 = "TestStudent1Name";
		studentNames.add(StudentName1);
		
		String StudentName2 = "TestStudent2Name";
		studentNames.add(StudentName2);
		
		//Module 5 Code Assignment
		//Add your name to create a new student profile
		//Use template below and put your name in the areas of 'StudentName'
		//String StudentName3 = "TestStudent3Name";
		//studentNames.add(StudentName3);
		
		//adding my name to create myself as a student for the Jukebox app - CY
		String Cassidy = "Cassidy";
		studentNames.add(Cassidy);
		
		//Added name to create a new student profile
		String Esi = "Esi";
		studentNames.add(Esi);

		//Added name to create a new student profile
		String Felicia = "Felicia";
		studentNames.add(Felicia);
		
		return studentNames;
	}

	public Student GetStudentProfile(String student){
		Student emptyStudent = null;
	
		switch(student) {
		   case "TestStudent1_Playlist":
			   TestStudent1_Playlist testStudent1Playlist = new TestStudent1_Playlist();
			   Student TestStudent1 = new Student("TestStudent1", testStudent1Playlist.StudentPlaylist());
			   return TestStudent1;
			   
		   case "TestStudent2_Playlist":
			   TestStudent2_Playlist testStudent2Playlist = new TestStudent2_Playlist();
			   Student TestStudent2 = new Student("TestStudent2", testStudent2Playlist.StudentPlaylist());
			   return TestStudent2;
			   
			   
		   //Module 6 Code Assignment - Add your own case statement for your profile. Use the above case statements as a template.
		   case "Esi_Playlist":
			   			   Esi_Playlist EsiPlaylist = new Esi_Playlist();
			   			   Student Esi = new Student("Esi", EsiPlaylist.StudentPlaylist());
			   			   return Esi;
		}
		return emptyStudent;
	}
}
