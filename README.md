# alinky
By Morris Lee

Creates a class named <i>Course</i> that contains a string data field named <i>courseID</i> and an int data
field named <i>capacity</i> that follows the guidelines:

Provides an abstract data type <i>CourseList</i>, that can be used to represent
sequences of objects of class <i>Course</i>.

The abstract data type <i>CourseList</i> supports the following operations:

  <i>• int size() – Returns the current size of the list (total number of courses)</i>

  <i>• void addCourse(int i, Course course) - Adds a new element before the i-th element of
  the list (the index of the first entry is 0). If i is greater than the number of the elements in
  the list, adds it to the end </i>

  <i>• boolean changeCapacity(String ID, int cap) – Changes the capacity of the course whose
  courseID equals ID and returns true. Returns false if ID does not exist in the list </i>

  <i>• boolean removeCourse(int i) - Deletes the i-th element of the list and returns true. In the
  case when the list has less than i elements returns false</i>

  <i>• Course search(int i) - Returns the i-th element of the list. In the case when the list has
  less than i elements returns null </i>

Provides two implementations of this abstract data structure: a class named <i>CourseArrayList</i> and
another class named <i>CourseLinkedList</i>. The first uses an array to store the sequence
of courses and the second a singly linked list.


Also implements the following components:

  <i>Two static methods: int prefixCountArrayList(CourseArrayList list, String prefix) and int prefixCountLinkedList(CourseLinkedList list,   String prefix) which return the total number of courses in the list with the courseID starting with that prefix.</i>

In the main method of Demo.java, an instance of <i>CourseArrayList</i> is created, several
elements are inserted into it, and then tests <i>CourseArrayList</i> methods and then use the <i>prefixCountArrayList</i> method to
print the number of elements in the sequence with a given prefix
