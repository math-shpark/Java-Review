package sec01;

public class StudentManager {

	Student[] students = new Student[100];
	int size = 0;
	
	int findStudent(String name) {
		int index = -1;
		
		for (int i = 0; i < size; i++) {
			if(name.equals(students[i].name)) {
				index = i;
				break;
			}
		}
		
		return index;
	}
	
	Student getStudent(String name) {
		int index = findStudent(name);
		
		if(index == -1) {
			return null;
		} else {
			return students[index];
		}
	}
	
	void changeMajor(String name, String major) {
		int index = findStudent(name);
		
		if(index == -1) {
			
		} else {
			students[index].major = major;
		}
	}
	
}
