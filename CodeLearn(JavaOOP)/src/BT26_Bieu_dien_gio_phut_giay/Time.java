/*
 Bài tập
Bạn hãy tạo ra lớp Time trong file Time.java với thông tin giống như sau:



Giải thích:

Time là lớp được dùng để lưu thông tin về giờ, phút, giây.
hour, minute, second lần lượt là các thuộc tính chỉ giờ, phút, giây của lớp Time.
Time(hour: int, minute: int, second: int) là phương thức khởi tạo có tham số dùng để khởi tạo giá trị cho các thuộc tính.
setTime(hour: int, minute: int, second: int) là phương thức dùng để thay đổi giá trị của các thuộc tính hour, minute, second.
nextSecond() là phương thức tăng thời gian của đối tượng lên 1 giây. Ví dụ:
Giá trị của các thuộc tính trước và sau khi gọi phương thức nextSecond() là hour = 7, minute = 7, second = 40 và hour = 7, minute = 7, second = 41.
Giá trị của các thuộc tính trước và sau khi gọi phương thức nextSecond() là hour = 23, minute = 59, second = 59 và hour = 0, minute = 0, second = 0.
Giá trị của các thuộc tính trước và sau khi gọi phương thức nextSecond() là hour = 7, minute = 59, second = 59 và hour = 8, minute = 0, second = 0.
previousSecond() là phương thức giảm thời gian của đối tượng đi 1 giây. Ví dụ:
Giá trị của các thuộc tính trước và sau khi gọi phương thức previousSecond() là hour = 7, minute = 7, second = 7 và hour = 7, minute = 7, second = 6.
Giá trị của các thuộc tính trước và sau khi gọi phương thức previousSecond() là hour = 0, minute = 0, second = 0 và hour = 23, minute = 59, second = 59.
display() là phương thức dùng để hiển thị ra màn hình thông tin về thời gian của đối tượng dưới định dạng "HH:mm:ss". Ví dụ:
Nếu hour = 1, minute = 8, second = 45 thì sau khi gọi phương thức display() màn hình sẽ hiển thị ra: "01:08:45"
Nếu hour = 23, minute = 5, second = 7 thì sau khi gọi phương thức display() màn hình sẽ hiển thị ra: "23:05:07"
Các phương thức còn lại là các setter và getter mà bạn đã biết.
Chương trình để test lớp Time:

class Entry {
	public static void main(String[] args) {
		Time t = new Time(12, 1, 1);
		t.display();
		t.setTime(23, 59, 59);
		t.display();
		t.nextSecond();
		t.display();
		t.nextSecond();
		t.display();
		t.setTime(7, 0, 0);
		t.display();
		t.previousSecond();
		t.display();
	}
}
Kết quả khi chạy chương trình:

12:01:01
23:59:59
00:00:00
00:00:01
07:00:00
06:59:59
 */
package BT26_Bieu_dien_gio_phut_giay;

/**
 *
 * @author asus
 */
public class Time {
   private int hour, minute, second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time() {
    }
    
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
   
    public void nextSecond(){
        second++;
        if (second > 59) {
            second = 0;
            minute++;
        }
        if (minute > 59) {
            minute = 0;
            hour++;
        }
        if (hour > 23) {
            hour = 0;
        }
    }
    public void previousSecond(){
        second--;
        if (second < 0) {
            second = 59;
            minute--;
        }
        if (minute < 0) {
            minute = 59;
            hour--;
        }
        if (hour < 0) {
            hour = 23;
        }
    }
    
    public void display(){
        String second = this.second + "";
        String minute = this.minute + "";
        String hour = this.hour + "";
        if (second.length() == 1) {
            second = "0" + second;
        }
        if (minute.length() == 1) {
            minute = "0" + minute;
        }
        if (hour.length() == 1) {
            hour = "0" + hour;
        }
        System.out.println(hour + ":" + minute + ":" + second);
    }
}
