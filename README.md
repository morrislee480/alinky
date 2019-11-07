# beep
<b>Implements an Array List and Linked List, with functions, for class Course</b>

Creates a class named Course that contains a string data field named courseID and an int data
field named capacity.

Provides an abstract data type CourseList, that can be used to represent
sequences of objects of class Course.

The abstract data type CourseList supports the following operations:

• int size() – Returns the current size of the list (total number of courses)

• void addCourse(int i, Course course) - Adds a new element before the i-th element of
the list (the index of the first entry is 0). If i is greater than the number of the elements in
the list, adds it to the end

• boolean changeCapacity(String ID, int cap) – Changes the capacity of the course whose
courseID equals ID and returns true. Returns false if ID does not exist in the list

• boolean removeCourse(int i) - Deletes the i-th element of the list and returns true. In the
case when the list has less than i elements returns false

• Course search(int i) - Returns the i-th element of the list. In the case when the list has
less than i elements returns null

Provides two implementations of this abstract data structure: a class named CourseArrayList and
another class named CourseLinkedList. The first uses an array to store the sequence
of courses and the second a singly linked list.


Also implements the following components:

Two static methods: int prefixCountArrayList(CourseArrayList list, String prefix) and int prefixCountLinkedList(CourseLinkedList list, String prefix) which return the total number of courses in the list with the courseID starting with that prefix.

In the main method of Demo.java, an instance of CourseArrayList is created, several
elements are inserted into it, and then tests CourseArrayList methods and then use the prefixCountArrayList method to
print the number of elements in the sequence with a given prefix
