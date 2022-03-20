//Bạn hãy viết chương trình hiển thị ra màn hình các số từ 1 tới 5 sử dụng vòng lặp do-while.

/*
LÝ THUYẾT:

Đầu tiên khối lệnh bên trong vòng lặp do-while sẽ được thực thi trước. 
Sau đó vòng lặp do-while sẽ kiểm tra biểu thức điều kiện, nếu biểu thức điều kiện đúng thì chương trình sẽ tiếp tục thực thi khối lệnh trong do-while, 
ngược lại nếu biểu thức điều kiện sai thì dừng vòng lặp.

Vòng lặp do-while khác vòng lặp while ở chỗ vòng lặp while sẽ kiểm tra điều kiện trước, 
còn vòng lặp do-while sẽ thực hiện khối lệnh trước nên khối lệnh trong do-while sẽ được thực thi ít nhất 1 lần.
*/

public class BT57_do_while {
    public static void main(String args[]) {
        int i = 1;
        do {            
            System.out.print(i + " ");
            i++;
        } while (i <= 5);
    }
}
