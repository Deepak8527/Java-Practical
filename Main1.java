public class Main1 {
    public static Student findStudent(int rollNumber) throws RollNumberNotFoundException {
        Student[] students = {
            new Student(101, "Alice"),
            new Student(102, "Bob"),
            new Student(103, "Charlie")
        };

        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }

        throw new RollNumberNotFoundException("Student with roll number " + rollNumber + " not found");
    }

    public static void main(String[] args) {
        try {
            Student student = findStudent(102);
            System.out.println("Student found: " );
            
            Student studentNotFound = findStudent(105);
            System.out.println("Student found: " );
        } catch (RollNumberNotFoundException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
    
}
