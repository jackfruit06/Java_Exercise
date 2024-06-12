/** Class EduCenter: 
 * Lớp dùng để gọi thực hiện và kiểm thử các lớp đã xây dựng trước đó. 
 * Cần hoàn thiện các phương thức chưa đầy đủ nhưng phải giữ nguyên mẫu
 * phương thức (khai báo, đối số, kiểu trả về). Có thể thay đổi giá trị 
 * sau lệnh return cuối các phương thức nhưng cần giữ nguyên kiểu trả về. 
 * Có thể bổ sung phương thức nếu cần, nhưng phải giữ lại đầy đủ các phương thức đã được khai báo sẵn
 * */
import java.util.Scanner;
import java.util.ArrayList;

public class EduCenter{

    public static int currentYear = 2020;
    public static double baseAmount;

    public static Person[] readData(Scanner scan){
        // bổ sung mã lệnh. Có thể sửa giá trị trả về của lệnh return
        // nhưng không thay đổi kiểu trả về!
        int n = Integer. parseInt(scan.nextLine());
        Person[] person = new Person[n];
        try{
            for(int i = 0; i < n; i++){
                String personCode = scan.nextLine();
                String name = scan.nextLine();
                String[] day = scan.nextLine().split(" ");
                int d = Integer.parseInt(day[0]);
                int m = Integer.parseInt(day[1]);
                int y = Integer.parseInt(day[2]);
                Date birthday = new Date(y,m,d);
                Boolean gender = Boolean.parseBoolean(scan.nextLine());
                String email = scan.nextLine();
                String address = scan.nextLine();
                if(personCode.charAt(0) == '1'){
                    double score = Double.parseDouble(scan.nextLine());
                    String majors = scan.nextLine();
                    person[i] = new Student(personCode, email,majors, score, name, birthday,gender, address);
                } else{
                    String department = scan.nextLine();
                    double salary = Double.parseDouble(scan.nextLine());
                    String[] days = scan.nextLine().split(" ");
                    int d1 = Integer.parseInt(days[0]);
                    int m1 = Integer.parseInt(days[1]);
                    int y1 = Integer.parseInt(days[2]);
                    Date recruit = new Date(y1, m1, d1);
                    person[i] = new Staff(personCode, email, department, salary, recruit, name, birthday, gender, address);
                }
            }
            // bổ sung mã lệnh ở đây! Có thể sửa giá trị trả về của lệnh return
            // nhưng không thay đổi kiểu trả về!
            // Thứ tự dữ liệu nhập: Đọc và thực hiện đúng theo yêu cầu như trong mô tả
        } catch(ArithmeticException ArtmExcp){
            System.out.print(ArtmExcp.getMessage() );
            return null;
        } catch(Exception Excp){
            System.out.println("Data types mismatch!");
            return null;
        }
        // Có thể sửa giá trị trả về của lệnh return
        // nhưng không thay đổi kiểu trả về!        
        return person;
    }

    public static ArrayList<Person> listOfStaff(Person[] listPerson){

        ArrayList<Person> results = new ArrayList<Person>();
        // bổ sung mã lệnh ở đây! Có thể sửa giá trị trả về của lệnh return
        // nhưng không thay đổi kiểu trả về!

        for(Person person : listPerson){
            if(person instanceof Staff){
                results.add(person);
            }
        }
        if ( results.size() > 0)
            return results;
        else
            return null;
    }

    public static void sortStaffBySalary(ArrayList<Person> listStaff){
        Staff tmp;
        int n = listStaff.size();
        Staff staffI, staffJ;
        for (int i = 0; i < n-1; i ++)
            for(int j = i + 1; j < n; j++){
                staffI = (Staff)listStaff.get(i);
                staffJ = (Staff)listStaff.get(j);
                if(staffI.getSalary() > staffJ.getSalary()){
                    tmp = (Staff)listStaff.get(i);
                    listStaff.set(i, listStaff.get(j) );
                    listStaff.set(j, tmp);
                }
            }
    }

    public static void sortStudentByScore(ArrayList<Person> listStudent){
        // bổ sung mã lệnh ở đây! Không thay đổi khai báo phương thức!
        // Tham khảo phương thức sortStaffBySalary
        Student temp, student1, student2;
        for(int i = 0; i < listStudent.size(); i++){
            for(int j = 1; j < listStudent.size(); j++){
                student1 = (Student) listStudent.get(j);
                student2 = (Student) listStudent.get(j-1);
                if(student1.getScore() < student2.getScore()){
                    temp = (Student) listStudent.get(j);
                    listStudent.set(j, listStudent.get(j-1));
                    listStudent.set(j-1, temp);
                }
            }
        }
    }

    public static ArrayList<Person> listOfStudent(Person[] listPerson){

        ArrayList<Person> results = new ArrayList<Person>();
        for(Person person : listPerson){
            if(person instanceof Student){
                results.add(person);
            }
        }

        // bổ sung mã lệnh ở đây! Có thể sửa giá trị trả về của lệnh return
        // nhưng không thay đổi kiểu trả về!
        if(results.size() > 0)
            return results;
        else
            return null;
    }

    public static Person searchByCode(Person[] listPerson, String code){
        for(Person person : listPerson){
            if(person.getCode().equals(code)){
                return person;
            }
        }
        // bổ sung mã lệnh ở đây! Có thể sửa giá trị trả về của lệnh return
        // nhưng không thay đổi kiểu trả về!
        return null;
    }
    public static void sortByName(Person[] listPerson) {
        Person temp;
        for (int i = 0; i < listPerson.length - 1; i++) {
            for (int j = i + 1; j < listPerson.length; j++) {
                String[] nameParts1 = listPerson[i].getName().trim().split("\\s+");
                String[] nameParts2 = listPerson[j].getName().trim().split("\\s+");
                String lastName1 = nameParts1[nameParts1.length - 1];
                String lastName2 = nameParts2[nameParts2.length - 1];

                // Compare last names
                int compareLastName = lastName1.compareToIgnoreCase(lastName2);
                if (compareLastName > 0) {
                    temp = listPerson[i];
                    listPerson[i] = listPerson[j];
                    listPerson[j] = temp;
//                } else if (compareLastName == 0) {
//                    // If last names are the same, compare full names
//                    String fullName1 = listPerson[i].getName();
//                    String fullName2 = listPerson[j].getName();
//                    if (fullName1.compareToIgnoreCase(fullName2) > 0) {
//                        temp = listPerson[i];
//                        listPerson[i] = listPerson[j];
//                        listPerson[j] = temp;
//                    }
               }
            }
        }
    }
    // Phương thức theo yêu cầu ở mục 4.2 trong mô tả
    public static void displayList(Person[] listPerson){
        if(listPerson != null){
            sortByName(listPerson);
            for (Person perso : listPerson) {
                System.out.println(perso.toString());
            }
            // bổ sung mã lệnh ở đây!
        } else{
            System.out.println("No any person in this list!");
        }
    }


    // Phương thức theo yêu cầu ở mục 4.3 trong mô tả
    public static void displayList(ArrayList<Person>  listPerson){
        // Bổ sung mã lệnh để phương thức này có thể thông tin ra màn hình đúng theo mẫu
        // cả trường hợp Student và Staff
        int n = listPerson.size();
        if(n > 0){

            for (int i = 0; i < n; i ++){
                if(listPerson.get(i).getClass().getSimpleName().equals("Staff")){
                    Staff  staff= (Staff)listPerson.get(i);
                    System.out.println( staff.toString() + " Income:" + String.valueOf(staff.getRealEarnings(currentYear)));
                    /* Đặt staff = (Staff)(đối tượng thứ i). Bổ sung lệnh để in ra xâu ký tự theo mẫu sau:
                    staff.toString() + " Income:" + String.valueOf(staff.getRealEarnings(currentYear)) */
                }else{
                    Student student = (Student) listPerson.get(i);
                    System.out.println(  student.toString() + " Total Fees:" + String.valueOf(student.getPayment(baseAmount)));
                    /* Đặt student = (Student)(đối tượng thứ i). Bổ sung lệnh để in ra xâu ký tự theo mẫu sau:
                    student.toString() + " Total Fees:" + String.valueOf(student.getPayment(baseAmount) ) */;
                }
            }
        } else{
            System.out.println("No any person in this list!");
        }
    }


    public static void sortByLastName(Person[] listPerson){
        // Bổ sung mã lệnh để phương thức này có thể sắp xếp mảng theo thứ tự tăng dần 
        // của phần tên LastName (từ cuối cùng của tên đầy đủ) các đối tượng Person
        // Dùng phương thức lớp String: str1.compareTo(String str2) để so hai xâu str1 và str2.
        Person temp;
        for (int i = 0; i < listPerson.length - 1; i++) {
            for (int j = i + 1; j < listPerson.length; j++) {
                String[] nameParts1 = listPerson[i].getName().trim().split("\\s+");
                String[] nameParts2 = listPerson[j].getName().trim().split("\\s+");
                String lastName1 = nameParts1[nameParts1.length - 1];
                String lastName2 = nameParts2[nameParts2.length - 1];

                // Compare last names
                int compareLastName = lastName1.compareToIgnoreCase(lastName2);
                if (compareLastName > 0) {
                    temp = listPerson[i];
                    listPerson[i] = listPerson[j];
                    listPerson[j] = temp;
                }
            }

        }
    }

    public static ArrayList<Person> searchByMajors(Person[] listPerson, String majors){
        // bổ sung mã lệnh ở đây để liệt kê các đối tượng Student trong listPerson có trường majors
        // trùng với tham đối majors! Có thể sửa giá trị trả về của lệnh return
        // nhưng không thay đổi kiểu trả về!
        ArrayList<Person> result = new ArrayList<>();

        for(Person person : listPerson){
            if(person instanceof Student &&  ((Student) person).getMajors().equals(majors)) {
                result.add(person);
            }
        }
        return result;
    }


    public static void main(String Ag[]){
        Scanner scan = new Scanner(System.in);

        currentYear = Integer.parseInt(scan.nextLine());
        displayList(readData(scan));
        System.out.println();
        currentYear = Integer.parseInt(scan.nextLine());

        // Chỉ cần viết main để kiểm thử theo ý người lập trình
        // Phần chạy thử & chấm trên hệ thống đã có lớp khác.
    }

}