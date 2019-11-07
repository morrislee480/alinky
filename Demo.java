/**
 * Created by Leonard Dervishi on 09/20/2019.
 */

public class Demo {

	/**
	 * Counts the number of courses starting with a given prefix
	 * @param list The list of courses
	 * @param prefix The given prefix
	 * @return the count of courses
	 */
	public static int prefixCountArrayList(CourseArrayList list, String prefix){	
		//TODO implementation
		int counter = 0;
		for (int i = 0; i < list.size()-1; i++) {
			if (list.search(i).getString().substring(0,prefix.length()).equals(prefix));
				counter++;
		}
		return counter;
	}
	
	/**
	 * Counts the number of courses starting with a given prefix
	 * @param list The list of courses
	 * @param prefix The given prefix
	 * @return the count of courses
	 */
	public static int prefixCountLinkedList(CourseLinkedList list, String prefix){
		//TODO implementation
		int counter = 0;
		for (int i = 0; i < list.size()-1; i++) {
			if (list.search(i).getString().substring(0, prefix.length()).equals(prefix));
				counter++;
		}
		return counter;		
	}
	
	public static void main (String [] args)
	{
		CourseArrayList alist = new CourseArrayList();		
		Course course1 = new Course("MATH444", 30);
		Course course2 = new Course("EECS123", 120);
		Course course3 = new Course("EECS233", 140);
		Course course4 = new Course("EBME399", 50);
		
		
		// Add course objects to arraylist
		alist.addCourse(0, course1);
		alist.addCourse(1, course2);
		alist.addCourse(2, course3);
		alist.addCourse(3, course4);
		
		System.out.println("----------------------------------------");
		//Testing ArrayList methods
		System.out.println("Capacity of " + alist.search(0).getString() + " is " + alist.search(0).getCap());
		
		System.out.println("\nCapacity of EECS233: " + alist.getList()[2].getCap());
		System.out.println("Change capacity method: " + alist.changeCapacity("EECS233", 100));
		System.out.println("Change capacity method: " + alist.changeCapacity("EECS133", 100));
		System.out.println("Capacity of EECS233: " + alist.getList()[2].getCap());
		
		System.out.println("\nNumber of courses: " + alist.size());
		System.out.println("Course removed:" + alist.removeCourse(1));
		System.out.println("Course removed:" + alist.removeCourse(5));
		System.out.println("Number of courses: " + alist.size());
		
		System.out.println("\nNumber of courses starting with EECS: " + prefixCountArrayList(alist, "EECS"));
		System.out.println("----------------------------------------");
		
		//Change back the capacity of EECS233 to 140
		alist.changeCapacity("EECS233", 140);
		
		CourseLinkedList llist = new CourseLinkedList();	
		// Add course objects to Linkedlist
		llist.addCourse(0, course1);
		llist.addCourse(1, course2);
		llist.addCourse(2, course3);
		llist.addCourse(3, course4);
		
		
		System.out.println("----------------------------------------");
		//Testing LinkedList methods		
		System.out.println("Capacity of " + llist.search(1).getString() + " is " + llist.search(1).getCap());
		
		System.out.println("\nCapacity of EECS233: " + llist.search(2).getCap());
		System.out.println("Change capacity method: " + llist.changeCapacity("EECS233", 100));
		System.out.println("Change capacity method: " + llist.changeCapacity("EECS133", 100));
		System.out.println("Capacity of EECS233: " + llist.search(2).getCap());
		
		System.out.println("\nNumber of courses: " + llist.size());
		System.out.println("Course removed:" + llist.removeCourse(1));
		System.out.println("Course removed:" + llist.removeCourse(5));
		System.out.println("Number of courses: " + llist.size());
		
		System.out.println("\nNumber of courses starting with EECS: " + prefixCountLinkedList(llist, "EECS"));
		System.out.println("----------------------------------------");
		
	}
}
