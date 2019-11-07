class Course{
	
	String courseID;
	int capacity;

	
	//constructor for Course
	Course (String ID, int cap) {
		courseID = ID;
		capacity = cap;
	}
	
	//returns the Course ID as String
	String getString() {
		return courseID;
	}
	
	//sets the class capacity
	void setCap(int cap) {
		capacity = cap;
	}
	
	//returns the capacity as int
	int getCap() {
		return capacity;
	}

}



