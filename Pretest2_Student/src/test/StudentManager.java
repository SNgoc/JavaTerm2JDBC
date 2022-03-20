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
    
     public void add(){
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
    
    public void displayAll(){
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
                if (IdDel < 100 ) {
                    throw new Error("Id must greater than 100 or equal");//tu tao loi cho minh
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
    
     public void menu(){
        Scanner sc = new Scanner(System.in);
        StudentManager st = new StudentManager();
        String opt;
        do {
            System.out.println("********************************************************");
            System.out.println("*        1.Create new Student                          *");
            System.out.println("*        2.Delete student By Id                        *");
            System.out.println("*        3.View all student                            *");
            System.out.println("*        4.Exit                                        *");
            System.out.println("********************************************************");
            System.out.print("Input command:");
            opt = sc.nextLine();
            switch(opt){
                case "1":
                    System.out.println("Create new Student:");
                    st.add();
                    break;
                case "2":
                    System.out.println("Delete student By Id:");
                    st.deleteStudent();
                    break;
                case "3":
                    System.out.println("View all student:");
                    st.displayAll();
                    break;
                case "4":
                    System.out.println("Exit!!!");
                    break;
                default:
                    System.out.println("Wrong input, please try again!!!");
            }
        } while(!"4".equals(opt));
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        StudentManager test = new StudentManager();
        test.menu();
    }
    
}
