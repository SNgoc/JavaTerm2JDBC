/*
1.	Tạo class exception InvalidException bao gồm các hàm dựng thông báo lỗi sai.
 */
package lab1;

/**
 *
 * @author asus
 */
public class InvalidException extends Exception{
    String msg;

    public InvalidException(String msg) {
        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return "Loi sai " + msg;
    }

}
