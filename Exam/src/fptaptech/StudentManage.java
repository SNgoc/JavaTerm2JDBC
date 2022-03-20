package fptaptech;
import academic.Student;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class StudentManage {

    int maxStudent = 10;
    int nextStudent = 0;
    Student[]arr = new Student[maxStudent];
    
    public void createNew(){
        if (nextStudent == maxStudent) {
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
            if (student.getStuID() == s.getStuID()) {
                System.out.println("Duplicate Id " + s.getStuID());
                return;
            }
        }
        arr[nextStudent] = s;
        nextStudent++;
        System.out.println("Add success.");
    }
    
    public void showAll(){
        if (nextStudent == 0) {
            System.out.println("No data");
            return;
        }
        for (Student student : arr) {
            if (student == null) {
                break;
            }
            student.display();
        }
    }
    
    public void menu(){
        Scanner sc = new Scanner(System.in);
        StudentManage st = new StudentManage();
        String opt;
        do {
            System.out.println("********************************************************");
            System.out.println("*        1.Create new Student                          *");
            System.out.println("*        2.Show all student                            *");
            System.out.println("*        3.Exit                                        *");
            System.out.println("********************************************************");
            System.out.print("Input command:");
            opt = sc.nextLine();
            switch(opt){
                case "1":
                    System.out.println("Create new Student:");
                    st.createNew();
                    break;
                case "2":
                    System.out.println("View all student:");
                    st.showAll();
                    break;
                case "3":
                    System.out.println("Exit!!!");
                    break;
                default:
                    System.out.println("Wrong input, please try again!!!");
            }
        } while(!"3".equals(opt));
    }
    
    public static void main(String[] args) {
        StudentManage test = new StudentManage();
        test.menu();
    }
    
}
