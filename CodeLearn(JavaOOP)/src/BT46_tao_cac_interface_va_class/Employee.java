/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT46_tao_cac_interface_va_class;

/**
 *
 * @author asus
 */
public abstract class Employee implements IEmployee{// dùng abstract class để không phải override calculateSalary() từ interface IEmployee
    private String name;
    private int paymentPerHour;

    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }

    @Override
    public String getName() {
        return name;
    }
}
