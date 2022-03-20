/*
Chương trình để test 3 lớp trên:

public class Entry {
	public static void main(String[] args) {
            Person person1 = new Employee("Trung", "HN", 3300);
            Person person2 = new Customer("Linh", "BN", 10400);
            person1.display();
            person2.display();
	}
}
Kết quả khi chạy chương trình:

Employee name: Trung
Employee address: HN
Employee salary: 3300
Customer name: Linh
Customer address: BN
Customer balance: 10400
 */
package BT44_tinh_truu_tuong;

/**
 *
 * @author asus
 */
public class testBT44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person person1 = new Employee("Trung", "HN", 3300);
        Person person2 = new Customer("Linh", "BN", 10400);
        person1.display();
        person2.display();
    }
    
}
