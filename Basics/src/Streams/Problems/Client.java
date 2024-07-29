package Streams.Problems;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {

    public static List<Student> injectValuesInList() {
        return Arrays.asList(
                new Student(1, "Alice", 20, 8.5, Map.of(Subject.MATHS, 85, Subject.PHYSICS, 90, Subject.ENGLISH, 80)),
                new Student(2, "Bob", 22, 9.0, Map.of(Subject.MATHS, 92, Subject.CHEMISTRY, 88, Subject.ENGLISH, 84)),
                new Student(3, "Charlie", 19, 7.5, Map.of(Subject.MATHS, 78, Subject.PHYSICS, 80, Subject.BIOLOGY, 75)),
                new Student(4, "David", 21, 8.8, Map.of(Subject.MATHS, 89, Subject.PHYSICS, 92, Subject.CHEMISTRY, 87)),
                new Student(5, "Eve", 20, 9.2, Map.of(Subject.MATHS, 95, Subject.PHYSICS, 94, Subject.ENGLISH, 90)),
                new Student(6, "Frank", 23, 7.8, Map.of(Subject.HINDI, 80, Subject.ENGLISH, 70, Subject.CHEMISTRY, 76)),
                new Student(7, "Grace", 22, 8.1, Map.of(Subject.MATHS, 81, Subject.PHYSICS, 83, Subject.ENGLISH, 78)),
                new Student(8, "Hannah", 19, 8.4, Map.of(Subject.BIOLOGY, 86, Subject.PHYSICS, 85, Subject.CHEMISTRY, 82)),
                new Student(9, "Ivan", 21, 9.1, Map.of(Subject.MATHS, 93, Subject.PHYSICS, 91, Subject.BIOLOGY, 89)),
                new Student(10, "Jack", 20, 7.6, Map.of(Subject.MATHS, 77, Subject.HINDI, 79, Subject.ENGLISH, 73)),
                new Student(11, "Kate", 22, 8.9, Map.of(Subject.PHYSICS, 88, Subject.CHEMISTRY, 90, Subject.BIOLOGY, 87)),
                new Student(12, "Leo", 20, 8.0, Map.of(Subject.MATHS, 82, Subject.PHYSICS, 84, Subject.HINDI, 80)),
                new Student(13, "Mia", 19, 9.3, Map.of(Subject.MATHS, 96, Subject.ENGLISH, 94, Subject.BIOLOGY, 92)),
                new Student(14, "Nina", 23, 7.4, Map.of(Subject.PHYSICS, 75, Subject.CHEMISTRY, 78, Subject.ENGLISH, 72)),
                new Student(15, "Owen", 21, 8.7, Map.of(Subject.MATHS, 87, Subject.PHYSICS, 89, Subject.CHEMISTRY, 85)),
                new Student(16, "Paul", 20, 8.3, Map.of(Subject.MATHS, 83, Subject.PHYSICS, 86, Subject.CHEMISTRY, 80)),
                new Student(17, "Quinn", 22, 8.6, Map.of(Subject.MATHS, 85, Subject.PHYSICS, 88, Subject.BIOLOGY, 82)),
                new Student(18, "Ruth", 21, 9.0, Map.of(Subject.HINDI, 91, Subject.CHEMISTRY, 89, Subject.ENGLISH, 88)),
                new Student(19, "Sam", 19, 7.9, Map.of(Subject.MATHS, 79, Subject.PHYSICS, 81, Subject.BIOLOGY, 78)),
                new Student(20, "Tina", 23, 8.2, Map.of(Subject.MATHS, 82, Subject.CHEMISTRY, 83, Subject.ENGLISH, 80)),
                new Student(21, "Uma", 20, 8.1, Map.of(Subject.PHYSICS, 84, Subject.CHEMISTRY, 81, Subject.BIOLOGY, 80)),
                new Student(22, "Vince", 22, 9.1, Map.of(Subject.MATHS, 94, Subject.ENGLISH, 92, Subject.CHEMISTRY, 91)),
                new Student(23, "Wendy", 19, 7.7, Map.of(Subject.MATHS, 78, Subject.PHYSICS, 80, Subject.HINDI, 76)),
                new Student(24, "Xander", 21, 8.5, Map.of(Subject.MATHS, 88, Subject.PHYSICS, 87, Subject.ENGLISH, 86)),
                new Student(25, "Yara", 20, 9.3, Map.of(Subject.MATHS, 97, Subject.PHYSICS, 95, Subject.BIOLOGY, 94)),
                new Student(26, "Zane", 23, 7.3, Map.of(Subject.MATHS, 76, Subject.CHEMISTRY, 78, Subject.ENGLISH, 72)),
                new Student(27, "Abby", 21, 8.4, Map.of(Subject.MATHS, 86, Subject.PHYSICS, 84, Subject.HINDI, 82)),
                new Student(28, "Ben", 20, 8.9, Map.of(Subject.MATHS, 89, Subject.CHEMISTRY, 90, Subject.ENGLISH, 88)),
                new Student(29, "Cara", 22, 8.7, Map.of(Subject.MATHS, 88, Subject.PHYSICS, 87, Subject.BIOLOGY, 86)),
                new Student(30, "Dean", 19, 7.5, Map.of(Subject.MATHS, 77, Subject.CHEMISTRY, 79, Subject.ENGLISH, 75))
        );

    }

    public static Student[] injectValuesInArray() {
        return new Student[] {
                new Student(1, "Alice", 20, 8.5, Map.of(Subject.MATHS, 85, Subject.PHYSICS, 90, Subject.ENGLISH, 80)),
                new Student(2, "Bob", 22, 9.0, Map.of(Subject.MATHS, 92, Subject.CHEMISTRY, 88, Subject.ENGLISH, 84)),
                new Student(3, "Charlie", 19, 7.5, Map.of(Subject.MATHS, 78, Subject.PHYSICS, 80, Subject.BIOLOGY, 75)),
                new Student(4, "David", 21, 8.8, Map.of(Subject.MATHS, 89, Subject.PHYSICS, 92, Subject.CHEMISTRY, 87)),
                new Student(5, "Eve", 20, 9.2, Map.of(Subject.MATHS, 95, Subject.PHYSICS, 94, Subject.ENGLISH, 90)),
                new Student(6, "Frank", 23, 7.8, Map.of(Subject.HINDI, 80, Subject.ENGLISH, 70, Subject.CHEMISTRY, 76)),
                new Student(7, "Grace", 22, 8.1, Map.of(Subject.MATHS, 81, Subject.PHYSICS, 83, Subject.ENGLISH, 78)),
                new Student(8, "Hannah", 19, 8.4, Map.of(Subject.BIOLOGY, 86, Subject.PHYSICS, 85, Subject.CHEMISTRY, 82)),
                new Student(9, "Ivan", 21, 9.1, Map.of(Subject.MATHS, 93, Subject.PHYSICS, 91, Subject.BIOLOGY, 89)),
                new Student(10, "Jack", 20, 7.6, Map.of(Subject.MATHS, 77, Subject.HINDI, 79, Subject.ENGLISH, 73)),
                new Student(11, "Kate", 22, 8.9, Map.of(Subject.PHYSICS, 88, Subject.CHEMISTRY, 90, Subject.BIOLOGY, 87)),
                new Student(12, "Leo", 20, 8.0, Map.of(Subject.MATHS, 82, Subject.PHYSICS, 84, Subject.HINDI, 80)),
                new Student(13, "Mia", 19, 9.3, Map.of(Subject.MATHS, 96, Subject.ENGLISH, 94, Subject.BIOLOGY, 92)),
                new Student(14, "Nina", 23, 7.4, Map.of(Subject.PHYSICS, 75, Subject.CHEMISTRY, 78, Subject.ENGLISH, 72)),
                new Student(15, "Owen", 21, 8.7, Map.of(Subject.MATHS, 87, Subject.PHYSICS, 89, Subject.CHEMISTRY, 85)),
                new Student(16, "Paul", 20, 8.3, Map.of(Subject.MATHS, 83, Subject.PHYSICS, 86, Subject.CHEMISTRY, 80)),
                new Student(17, "Quinn", 22, 8.6, Map.of(Subject.MATHS, 85, Subject.PHYSICS, 88, Subject.BIOLOGY, 82)),
                new Student(18, "Ruth", 21, 9.0, Map.of(Subject.HINDI, 91, Subject.CHEMISTRY, 89, Subject.ENGLISH, 88)),
                new Student(19, "Sam", 19, 7.9, Map.of(Subject.MATHS, 79, Subject.PHYSICS, 81, Subject.BIOLOGY, 78)),
                new Student(20, "Tina", 23, 8.2, Map.of(Subject.MATHS, 82, Subject.CHEMISTRY, 83, Subject.ENGLISH, 80)),
                new Student(21, "Uma", 20, 8.1, Map.of(Subject.PHYSICS, 84, Subject.CHEMISTRY, 81, Subject.BIOLOGY, 80)),
                new Student(22, "Vince", 22, 9.1, Map.of(Subject.MATHS, 94, Subject.ENGLISH, 92, Subject.CHEMISTRY, 91)),
                new Student(23, "Wendy", 19, 7.7, Map.of(Subject.MATHS, 78, Subject.PHYSICS, 80, Subject.HINDI, 76)),
                new Student(24, "Xander", 21, 8.5, Map.of(Subject.MATHS, 88, Subject.PHYSICS, 87, Subject.ENGLISH, 86)),
                new Student(25, "Yara", 20, 9.3, Map.of(Subject.MATHS, 97, Subject.PHYSICS, 95, Subject.BIOLOGY, 94)),
                new Student(26, "Zane", 23, 7.3, Map.of(Subject.MATHS, 76, Subject.CHEMISTRY, 78, Subject.ENGLISH, 72)),
                new Student(27, "Abby", 21, 8.4, Map.of(Subject.MATHS, 86, Subject.PHYSICS, 84, Subject.HINDI, 82)),
                new Student(28, "Ben", 20, 8.9, Map.of(Subject.MATHS, 89, Subject.CHEMISTRY, 90, Subject.ENGLISH, 88)),
                new Student(29, "Cara", 22, 8.7, Map.of(Subject.MATHS, 88, Subject.PHYSICS, 87, Subject.BIOLOGY, 86)),
                new Student(30, "Dean", 19, 7.5, Map.of(Subject.MATHS, 77, Subject.CHEMISTRY, 79, Subject.ENGLISH, 75))
        };
    }

    public static void main(String[] args) {
        // Add some dummy data
        List<Student> studentsList = injectValuesInList();
        Student[] studentsArr = injectValuesInArray();

        //1. Creating a Stream of Students
        Stream<List<Student>> studentStream = Stream.of(studentsList);
        Stream<Student> studentStreamFromList = studentsList.stream();
        Stream<Student> studentStreamFromArr = Arrays.stream(studentsArr);

        //2. Filtering Students
        System.out.println("=====================================");
        System.out.println("AGE GREATER THAN 20");
        studentsList.stream().filter(student -> student.getAge() > 20)
                .forEach(System.out::println);
        System.out.println("=====================================");
        System.out.println("CGPA GREATER THAN 8.0");
        Arrays.stream(studentsArr).filter(student -> student.getCgpa() > 8.0)
                .forEach(System.out::println);
        System.out.println("=====================================");

        //3. Mapping Student Attributes
        System.out.println("=====================================");
        System.out.println("GET ALL STUDENT NAMES");
        List<String> studentNames = studentsList.stream().map(Student::getName)
                .toList();
        System.out.println(studentNames);
        System.out.println("=====================================");
        System.out.println("GET ALL AGES");
        List<Integer> ages = studentsList.stream().map(Student::getAge).toList();
        System.out.println(ages);
        System.out.println("=====================================");

        //4. Sorting Students
        System.out.println("=====================================");
        System.out.println("SORTED BY NAMES");
        List<Student> sortedByNames = studentsList.stream()
                        .sorted(Comparator.comparing(Student::getName))
                        .toList();
        System.out.println(sortedByNames);
        System.out.println("=====================================");
        System.out.println("SORTED BY CGPA DESC");
        List<Student> sortedByCGPADesc = studentsList.stream()
                        .sorted(Comparator.comparing(Student::getCgpa).reversed())
                        .toList();
        System.out.println(sortedByCGPADesc);
        System.out.println("=====================================");
        System.out.println("SORTED BY CGPA AND AGE");
        List<Student> sortedByCGPAAndAge = studentsList.stream()
                        .sorted(Comparator.comparingDouble(Student::getCgpa).thenComparingInt(Student::getAge))
                        .toList();
        System.out.println(sortedByCGPAAndAge);
        System.out.println("=====================================");
        System.out.println("SORTED BY NAME LENGTH");
        List<Student> sortedByNameLength = studentsList.stream()
                        .sorted(Comparator.comparingInt(student -> student.getName().length()))
                        .toList();
        System.out.println(sortedByNameLength);
        System.out.println("=====================================");

        // 5. Aggregating Data
        System.out.println("=====================================");
        System.out.println("TOTAL CGPA OF ALL STUDENTS");
        double avgCGPA = studentsList.stream().mapToDouble(Student::getCgpa)
                            .average().orElse(0.0);
        System.out.println("Average CGPA: " + avgCGPA);
        System.out.println("=====================================");
        System.out.println("HIGHEST CGPA OF ALL STUDENTS");
        double maxCGPA = studentsList.stream().mapToDouble(Student::getCgpa)
                            .max().orElse(0.0);
        System.out.println("Max CGPA: " + maxCGPA);
        System.out.println("=====================================");

        // 6. Counting Students
        System.out.println("=====================================");
        System.out.println("TOTAL STUDENT IN STREAM");
        long totStudents = studentsList.stream().count();
        System.out.println("Total Students: " + totStudents);
        System.out.println("=====================================");
        System.out.println("COUNT STUDENTS WITH CGPA > 8.0");
        long countStudentsOnCGPA = studentsList.stream()
                            .filter(student -> student.getCgpa() > 8.0)
                            .count();
        System.out.println("Number of Students with CGPA > 8: " + countStudentsOnCGPA);
        System.out.println("=====================================");
        System.out.println("COUNT OF STUDENTS WITH AGE > 21");
        long countStudentsOnAge = studentsList.stream()
                            .filter(student -> student.getAge() > 21)
                            .count();
        System.out.println("Number of Students with Age > 21: " + countStudentsOnAge);
        System.out.println("=====================================");
        System.out.println("DISTINCT AGE OF STUDENTS");
        long distinctAge = studentsList.stream()
                .map(Student::getAge)
                .distinct().count();
        System.out.println("Distinct Ages: " + distinctAge);
        System.out.println("=====================================");

        // 7. Finding Specific Students
        System.out.println("=====================================");
        System.out.println("FIRST STUDENT WITH CGPA GREATER THAN 8.5");
        Optional<Student> firstHighCGPAStudent = studentsList.stream()
                            .filter(student -> student.getCgpa() > 8.5)
                            .findFirst();
        firstHighCGPAStudent.ifPresent(System.out::println);
        System.out.println("=====================================");
        System.out.println("STUDENT WITH LOWEST AGE");
        Optional<Student> youngestStudent = studentsList.stream()
                        .min(Comparator.comparingInt(Student::getAge));
        youngestStudent.ifPresent(System.out::println);
        System.out.println("=====================================");

        //8. Grouping Students
        System.out.println("=====================================");
        System.out.println("GROUPING STUDENTS BASED ON AGE");
        Map<Integer, List<Student>> studentsByAge = studentsList.stream()
                        .collect(Collectors.groupingBy(Student::getAge));
        System.out.println(studentsByAge);
        System.out.println("=====================================");
        System.out.println("GROUPING STUDENTS BY THEIR CGPA RANGE");
        Map<String, List<Student>> studentsByCGPA = studentsList.stream()
                        .collect(Collectors.groupingBy(student -> {
                            double cgpa = student.getCgpa();
                            if(cgpa >= 7 && cgpa < 8) return "7-8";
                            else if(cgpa >= 8 && cgpa < 9) return "8-9";
                            else if (cgpa >= 9 && cgpa <= 10) return "9-10";
                            else return "Unknown";
                        }));
        System.out.println(studentsByCGPA);
        System.out.println("=====================================");

        // 9. Summarizing Data
        System.out.println("=====================================");
        System.out.println("MARKS OF ALL STUDENTS IN MATHEMATICS");
        int mathMarks = studentsList.stream()
                            .mapToInt(student -> student.getMarks().getOrDefault(Subject.MATHS, 0))
                            .sum();
        System.out.println("Math Marks Total: " + mathMarks);
        System.out.println("=====================================");
        System.out.println("AVERAGE OF MARKS IN PHYSICS");
        double avgPhysicsMarks = studentsList.stream()
                .mapToInt(student -> student.getMarks().getOrDefault(Subject.PHYSICS, 0))
                        .average().orElse(0.0);
        System.out.println("Average in Physics : " + avgPhysicsMarks);
        System.out.println("=====================================");

        // 10. Finding Min and Max
        System.out.println("=====================================");
        System.out.println("MAX AGE STUDENT");
        Optional<Student> maxAge = studentsList.stream()
                        .max(Comparator.comparingInt(Student::getAge));
        maxAge.ifPresent(System.out::println);
        System.out.println("=====================================");
        System.out.println("MIN CGPA STUDENT");
        Optional<Student> minCgpa = studentsList.stream()
                        .min(Comparator.comparingDouble(Student::getCgpa));
        minCgpa.ifPresent(System.out::println);
        System.out.println("=====================================");

        // 11. Matching Students
        System.out.println("=====================================");
        System.out.println("CHECK IF ALL STUDENTS HAVE CGPA > 8.0");
        boolean checkCGPAAll = studentsList.stream()
                        .allMatch(student -> student.getCgpa() > 8.0);
        System.out.println("All Students have CGPA > 8.0? " + checkCGPAAll);
        System.out.println("=====================================");
        System.out.println("CHECK IF ANY STUDENT HAS CGPA > 9.0");
        boolean checkCGPAAny = studentsList.stream()
                        .anyMatch(student -> student.getCgpa() > 9.0);
        System.out.println("Any Student has CGPA > 9.0? " + checkCGPAAny);
        System.out.println("=====================================");
        System.out.println("CHECK IF ALL STUDENTS ARE OLDER THAN 15");
        boolean checkAgeAll = studentsList.stream()
                        .allMatch(student -> student.getAge() > 15);
        System.out.println("All Students are older than 15? " + checkAgeAll);
        System.out.println("=====================================");
        System.out.println("CHECK IF ANY STUDENT HAS CHEMISTRY MARKS < 40");
        boolean checkChemistryAny = studentsList.stream()
                        .anyMatch(student -> student.getMarks().getOrDefault(Subject.CHEMISTRY, 50) < 40);
        System.out.println("Any Student has Chemistry Marks lesser than 40? " + checkChemistryAny);
        System.out.println("=====================================");
        System.out.println("CHECK IF NONE OF THE STUDENT HAS CGPA < 5.0");
        boolean noneCGPA = studentsList.stream()
                        .allMatch(student -> student.getCgpa() > 5.0);
        System.out.println("None has CGPA < 5.0? " + noneCGPA);
        System.out.println("=====================================");

        // 12. Finding First and Any Student
        System.out.println("=====================================");
        System.out.println("FIND FIRST STUDENT");
        Optional<Student> firstStudent = studentsList.stream()
                        .findFirst();
        firstStudent.ifPresent(System.out::println);
        System.out.println("=====================================");
        System.out.println("FIND ANY STUDENT WITH AGE > 20");
        Optional<Student> studentAged = studentsList.stream()
                        .filter(student -> student.getAge() > 20).findFirst();
        studentAged.ifPresent(System.out::println);
        System.out.println("=====================================");



    }
}
