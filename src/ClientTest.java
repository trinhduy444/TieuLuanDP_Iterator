import java.util.*;

import ConcreteIterator.ListStudentIterator;
import ConcreteIterator.MapStudentIterator;
import Enum.TypeList;
import Factory.AggregateFactory;
import Inter.Aggregate;
import Inter.Iterator;
import Model.Student;
import Inter.*;

public class ClientTest {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int choice = 0;
//        do {
//            System.out.print("Enter 1 for Map or 2 for List: ");
//            choice = sc.nextInt();
//
//        } while (choice < 1 || choice > 2);
//
//        Aggregate<Student> studentAggregate = AggregateFactory.createAggregate(choice == 1 ? TypeList.MAP : TypeList.LIST);
//
//        studentAggregate.add(new Student("Trinh Truong Duy", 1001, "duytrinh@example.com", "03445116xx", "A01", 3.5));
//        studentAggregate.add(new Student("Nguyen Van A", 1002, "anguyenvip@example.com", "03445116xx", "A03", 2.8));
//        studentAggregate.add(new Student("Lionel Messi", 1003, "leogoat@example.com", "03445116xx", "A02", 3.9));
//        studentAggregate.add(new Student("El Pulga", 1004, "theking@example.com", "03445116xx", "A02", 3.9));
//
//        System.out.print("\nEnter ID student you want to find: ");
//        int id = sc.nextInt();
//
//        Student studentById = studentAggregate.getStudentById(id);
//
//        if (studentById == null) {
//            System.out.println("Student with ID " + id + " not found.");
//        } else {
//            System.out.println("Student with ID " + id + ": " + studentById);
//        }


        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Trinh Truong Duy", 1001, "duytrinh@example.com", "03445116xx", "A01", 3.5));
        studentList.add(new Student("Nguyen Van A", 1002, "anguyenvip@example.com", "03445116xx", "A03", 2.8));
        studentList.add(new Student("Lionel Messi", 1003, "leogoat@example.com", "03445116xx", "A02", 3.9));
        studentList.add(new Student("El Pulga", 1004, "theking@example.com", "03445116xx", "A02", 3.9));
        // Tạo bản đồ các học sinh
        Map<Integer, Student> studentMap = new HashMap<>();
        for (Student student : studentList) {
            studentMap.put(student.getId(),student);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Chọn cấu trúc dữ liệu để duyệt:\n1. Map\n2. List");
        int choice = scanner.nextInt();
        Iterator<Student> iterator = null;
        switch (choice) {
            case 1:
                iterator = new MapStudentIterator(studentMap);
                break;
            case 2:
                iterator = new ListStudentIterator(studentList);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ");
                System.exit(1);
        }

        System.out.println("Duyệt danh sách các học sinh theo trường 'name':");
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student.getName());
        }

    }
}