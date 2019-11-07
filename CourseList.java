abstract class CourseList {
	CourseList() {
		
	}
	
	abstract int size();
	abstract void addCourse(int i, Course course);
	abstract boolean changeCapacity(String ID, int cap);
	abstract boolean removeCourse(int i);
	abstract Course search(int i);
}
