
class CourseLinkedList extends CourseList {
	Node head;
	CourseLinkedList () {
		head = null;
	}
	
	Node getHead() { //encapsulation
		return head;
	}
	
	static class Node {
		Course course;
		Node next;
		Node(Course course, Node next){ //constructor
			this.course = course;
			this.next = next;
		}
		
		Course getCourse() { //returns the course
			return this.course;
		}
		
		Node getNext() { //returns next pointer
			return this.next;
		}	
		
		void setNext(Node n) {
			this.next = n;
		}
	}
	
	int size() { //gives the size through counts in iteration
		int counter = 0;
		Node temp = getHead();
		while(temp != null) {
			counter++;
			temp = temp.getNext();
		}
		return counter;
	}
	
	void addCourse(int i, Course course) {
		if (getHead() == null)
			head = new Node(course, null);
		else {
			Node temp1 = getHead();
			for (int k = 0; k < i-1; k++) {
				temp1 = temp1.getNext();
			}
			Node temp2 = temp1.getNext();
			temp1.setNext(new Node(course, temp2));
		}
	}
	
	boolean changeCapacity(String ID, int cap) {
		Node temp = getHead();
		for (int k = 0; k < size(); k++) {
			if (temp.getCourse().toString().equals(ID)) {
				temp.getCourse().setCap(cap);
				return true;
			}
		}
		return false;
	}
	
	boolean removeCourse(int i) {
		Node temp1 = getHead();
		if (i < size()) {
			for (int k = 0; k < i-1; k++) {
				temp1 = temp1.next;
			}
			temp1.next = temp1.next.next; //removes pointer and skips to the next next one
			return true;
		}
		else
			return false;
	}
	
	Course search(int i) {
		if (i > size())
			return null;
		else if (i < 0)
			return null;
		else if(getHead() == null)
			return null;
		else {
			Node tempN = getHead();
			System.out.println(tempN.next);
			for (int k = 0; k < i; k++) {						
				tempN = tempN.getNext();		
			}
			return tempN.getCourse();
		}
	}
}
