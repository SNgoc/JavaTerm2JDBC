package test;
import java.util.Scanner;
import stud.Student;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class StudentManager {
    private final int maxn = 10;
    private int n = 0;
    Student[]arr = new Student[maxn];
    
    public void createStudent(){
        if (n == maxn) {
            System.out.println("Fulled list");
            return;
        }
        //khoi tao doi tuong emp trong add() thi moi khong bi ghi de data khi add vao array (neu tao ngoai thi se bi ghi de data cu)
        Student s = new Student();
        //tvList[count].accept(); //khong the su dung cach nay voi array thuong vi se bi loi nullPointer
        s.input();

        //THUẬT TOÁN void add():thêm 1 nhân viên mới vô danh sách ds.
        //Lưu ý: kiểm tra nếu mã số bị trùng sẽ báo lỗi và từ chối thêm mới. Dùng hàm for each để duyệt từng phần tử trong mảng kiểm tra giá trị
        for (Student student : arr) {
            if (student == null) {
                break;
            }
            if (student.getId() == s.getId()) {
                System.out.println("Duplicate Id " + s.getId());
                return;
            }
        }
        arr[n] = s;
        n++;
        System.out.println("Add success.");
    }
    
    public void viewAll(){
        if (n == 0) {
            System.out.println("No data");
            return;
        }
        for (Student student : arr) {
            if (student == null) {
                break;
            }
            student.print();
        }
    }
    
    public void deleteStudent(){
        Scanner sc = new Scanner(System.in);
        int IdDel;
        while (true) {
            System.out.print("Input ID to delete:");
            try {
                //cach 2 khong can dung sc.nextLine();
                IdDel = Integer.parseInt(sc.nextLine());//chuyen doi tu string sang int sau khi nhap
                if (IdDel < 100) {
                    throw new Error("Id must greater or equal than 100");//tu tao loi cho minh
                }
                else{
                    break;
                }
            }
            //catch nhieu loi, muon catch loi throw thi catch loi phai giong voi kieu loi throw
            catch (NumberFormatException e) {
                System.out.println("Error: Wrong format input.");
            }
            catch (Error e){
                System.out.println(e.getMessage());
            }
        }
        
        if (n == 0) {
            System.out.println("No data");
            return;
        }
        for (int i = 0; i < n; i++)
        {
            if (arr[i].getId() == IdDel) {
                for (int j = i; j <=n-1; j++) {
                   arr[j] = arr[j+1];
                }
                System.out.println("Deleted student has id " + IdDel);
                n--;
                return;
            }
        }
        System.out.println("Can't find student has id " + IdDel);
    }
    
    public void searchById(){
        Scanner sc = new Scanner(System.in);
        int IdS;
        while (true) {
            System.out.print("Input ID to search:");
            try {
                //cach 2 khong can dung sc.nextLine();
                IdS = Integer.parseInt(sc.nextLine());//chuyen doi tu string sang int sau khi nhap
                if (IdS < 100) {
                    throw new Error("Id must greater or equal than 100");//tu tao loi cho minh
                }
                else{
                    break;
                }
            }
            //catch nhieu loi, muon catch loi throw thi catch loi phai giong voi kieu loi throw
            catch (NumberFormatException e) {
                System.out.println("Error: Wrong format input.");
            }
            catch (Error e){
                System.out.println(e.getMessage());
            }
        }
        if (n == 0) {
            System.out.println("No data");
            return;
        }
        boolean found = false;
        for (Student student : arr) {
            if (student == null) {
                break;
            }
            if (student.getId() == IdS) {
                System.out.println("Found student has Id " + IdS);
                System.out.println(student);
                found = true;
            }
        }
        if (found == false) {
            System.out.println("Can't find student has id " + IdS);
        }
        
    }
    
    public void menu(){
        Scanner sc = new Scanner(System.in);
        StudentManager st = new StudentManager();
        String opt;
        do {
            System.out.println("********************************************************");
            System.out.println("*        1.Create new Student                          *");
            System.out.println("*        2.Delete student By Id                        *");
            System.out.println("*        3.View all student                            *");
            System.out.println("*        4.Search student by Id                        *");
            System.out.println("*        5.Exit                                        *");
            System.out.println("********************************************************");
            System.out.print("Input command:");
            opt = sc.nextLine();
            switch(opt){
                case "1":
                    System.out.println("Create new Student:");
                    st.createStudent();
                    break;
                case "2":
                    System.out.println("Delete student By Id:");
                    st.deleteStudent();
                    break;
                case "3":
                    System.out.println("View all student:");
                    st.viewAll();
                    break;
                case "4":
                    System.out.println("Search student by Id:");
                    st.searchById();
                    break;
                case "5":
                    System.out.println("Exit!!!");
                    break;
                default:
                    System.out.println("Wrong input, please try again!!!");
            }
        } while(!"5".equals(opt));
    }

    public static void main(String[] args) {
        // TODO code application logic here
        StudentManager test = new StudentManager();
        test.menu();
    }
    
}
