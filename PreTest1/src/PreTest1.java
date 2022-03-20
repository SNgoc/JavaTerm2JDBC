
import java.util.Scanner;
import salary.Worker;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class PreTest1 {
    private final int maxn = 10;
    private int n = 0;
    Worker[] arrWorker = new Worker[maxn];

    public void add(){
        if (n == maxn) {
            System.out.println("Full list");
            return;
        }
        //khoi tao doi tuong emp trong add() thi moi khong bi ghi de data khi add vao array (neu tao ngoai thi se bi ghi de data cu)
        Worker w = new Worker();
        //tvList[count].accept(); //khong the su dung cach nay voi array thuong vi se bi loi nullPointer
        w.input();
        
        //THUẬT TOÁN void add():thêm 1 nhân viên mới vô danh sách ds.
        //Lưu ý: kiểm tra nếu mã số bị trùng sẽ báo lỗi và từ chối thêm mới. Dùng hàm for each để duyệt từng phần tử trong mảng kiểm tra giá trị
        for (Worker worker : arrWorker) {
            if (worker == null) {
                break;
            }
            if (worker.getName().equals(w.getName())) {
                System.out.println("Duplicate name " + w.getName());
                return;
            }
        }
        arrWorker[n] = w;
        n++;
        System.out.println("Add success.");
    }
    
   public void OverTime(){
        if (n == 0) {
            System.out.println("Chua co du lieu");
            return;
        }
        boolean found = false;
        for (Worker worker : arrWorker) {
            if (worker == null) {
                break;
            }
            if (worker.getWorkday() > 22) {
                System.out.println("Thong tin worker co days > 22:");
                System.out.println(worker);
                found = true;
            }
        }
        if (found == false) {
               System.out.println("Khong co worker nao co days tren 22");
        }
    }
    
   public void displayAll(){
        if (n == 0) {
            System.out.println("Chua co du lieu");
            return;
        }
        for (Worker worker : arrWorker) {
            if (worker == null) {
                break;
            }
            worker.display();
        }
    }
   
   public void menu(){
        Scanner sc = new Scanner(System.in);
        PreTest1 wk = new PreTest1();
        String opt;
        do {
            System.out.println("********************************************************");
            System.out.println("*        1.Add Worker                                  *");
            System.out.println("*        2.Find Over Time                              *");
            System.out.println("*        3.Display All                                 *");
            System.out.println("*        4.Exit                                        *");
            System.out.println("********************************************************");
            System.out.print("Input command:");
            opt = sc.nextLine();
            switch(opt){
                case "1":
                    System.out.println("Add a new television:");
                    wk.add();
                    break;
                case "2":
                    System.out.println("Find Over Time by workday:");
                    wk.OverTime();
                    break;
                case "3":
                    System.out.println("Display all televisions :");
                    wk.displayAll();
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
        PreTest1 test = new PreTest1();
        test.menu();
    }
    
}
