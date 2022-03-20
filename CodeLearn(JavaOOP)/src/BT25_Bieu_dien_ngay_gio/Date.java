/*
 Bài tập
Bạn hãy tạo ra lớp Date trong file Date.java với thông tin giống như sau:



Giải thích:

day, month, year là các thuộc tính chỉ ngày, tháng, năm của đối tượng Date.
Date(day: int, month: int, year: int) là phương thức khởi tạo có tham số dùng để khởi tạo giá trị cho các thuộc tính.
setDate(day: int, month: int, year: int) là phương thức dùng để thay đổi giá trị cho các thuộc tính.
display() là phương thức dùng để hiển thị thông tin về ngày của đối tượng theo định dạng "dd/MM/yyyy". Ví dụ:
Nếu day = 1, month = 7, year = 1997 thì khi gọi phương thức display() màn hình sẽ hiển thị ra "01/07/1997"
Nếu day = 8, month = 12, year = 2003 thì khi gọi phương thức display() màn hình sẽ hiển thị ra "08/12/1997"
Các phương thức khác là các setter và getter bạn đã biết.
Để đơn giản, bạn không cần quan tâm tới ngày, tháng, năm của lớp Date có hợp lệ hay không.
Chương trình test lớp Date trên:

public class Entry {
	public static void main(String[] args) {
		Date d = new Date(1, 1, 1997);
		d.display();
		d.setDate(12, 12, 2004);
		d.display();
		d.setMonth(3);
		d.display();
	}
}
Kết quả khi chạy chương trình:

01/01/1997
12/12/2004
12/03/2004
 */
package BT25_Bieu_dien_ngay_gio;


public class Date {
    private int day, month, year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    
    public void display(){
        String day = this.day + "";
        String month = this.month + "";
        String year = this.year + "";
        if (day.length() == 1) {
                day = "0" + day;			
        }
        if (month.length() == 1) {
                month = "0" + month;			
        }
        System.out.println(day + "/" + month + "/" + year);
    }
}
