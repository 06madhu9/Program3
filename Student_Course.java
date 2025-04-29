package q_two;

public class Student_Course {
        String course;
        int sem;
        float marks;
        
        // Constructor
        Student_Course(String course, int sem, float marks) {
            this.course = course;
            this.sem = sem;
            this.marks = marks;
        }
        
        // Method to display course details
        void displayStudent_Course() {
            System.out.println("Course= " + course);
            System.out.println("Semester= " + sem);
            System.out.println("Marks= " + marks);
        }
    
        // Main method inside the same class
        public static void main(String[] args) {
            // Creating student_course objects
            Student_Course s1 = new Student_Course("Java", 3, 50);
            Student_Course s2 = new Student_Course("Devops", 4, 40);
            Student_Course s3 = new Student_Course("BigData", 5, 30);
            
            // Displaying course details for each student
            s1.displayStudent_Course();
            s2.displayStudent_Course();
            s3.displayStudent_Course();
        }
    }
    


