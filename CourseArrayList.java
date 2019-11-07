class CourseArrayList extends CourseList {
	Course[] courses;
	
	CourseArrayList () {
		courses = new Course[0];
	}
	//returns the size of the array of courses
	int size() {
		return getList().length;
	}
	
	//adds a course to the ith spot
	void addCourse(int i, Course Course) {
		Course[] temp = new Course[getList().length + 1];
		if (i > getList().length) { //checks if i is greater than the length of the array
			for(int k = 0; k < getList().length; k++) { //creates another array of the same
				temp[k] = getList()[k];
			}
			temp[getList().length] = Course;//tacks on the new element to the end
		}
		else if (i < 0) { //if i is negative
			temp[0] = Course;
			for (int k = 0; k < getList().length; k++) {
				temp[k+1] = getList()[k]; //adds 
			}
		}
		else {
			for (int k = 0; k < i; k++) { //adds all elements before i
				temp[k] = getList()[k];
			}
			temp[i] = Course; //adds new element in place
			//for (int j = i; j < courses.length-1; j++) { //tacks on the rest of the original array
				//temp[j+1] = courses[j];
			//}
		}
		courses = temp;
	}
	
	boolean changeCapacity(String ID, int cap) {
		for (int i = 0; i < getList().length; i++) {
			if (ID.equals(getList()[i].getString())) {
				getList()[i].setCap(cap); 
				return true; //if successful, will return true
			}
		}
		return false;
	}
	
	boolean removeCourse(int i) {
		Course[] temp = new Course[getList().length-1];
		if (i > getList().length) { //if i is outside the bounds of the array
			return false;
		}
		else if(i < 0)
			return false;
		else {
			for (int k = 0; k < i; k++) {
				temp[k] = getList()[k]; //goes up to the element and takes it out
			}
			for (int j = i; j < getList().length-1; j++) { //adds rest of it
				temp[j] = getList()[j+1];
			}
			courses = temp;
			return true;
		}
		
	}
	
	Course[] getList() {
		return courses;
	}
	
	Course search(int i) {	
		Course tempCourse = null;
		if (i < getList().length) {
			tempCourse = getList()[i];
			return tempCourse;	
		}
		else
			return null;
	}
}
