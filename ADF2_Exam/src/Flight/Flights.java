/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flight;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author asus
 */
public class Flights {
    private String airCode;
    private String source;
    private String destination;
    private Date dept;
    private int journey;

    public Flights() {
    }

    public Flights(String airCode, String source, String destination, Date dept, int journey) {
        this.airCode = airCode;
        this.source = source;
        this.destination = destination;
        this.dept = dept;
        this.journey = journey;
    }
    
    public String getAirCode() {
        return airCode;
    }

    public void setAirCode(String airCode) {
        this.airCode = airCode;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDept() {
        return dept;
    }

    public void setDept(Date dept) {
        this.dept = dept;
    }

    public int getJourney() {
        return journey;
    }

    public void setJourney(int journey) {
        this.journey = journey;
    }
    
    void input(){
        Scanner sc = new Scanner(System.in);
        Pattern p = null;
        Matcher m = null;
        //airCode
        p = Pattern.compile("\\w{1,}");
        while (true) {            
            System.out.print("AircraftCode:");
            setAirCode(sc.nextLine()); // do yeu cau khoang trang nen khong xai trim()
            m = p.matcher(getAirCode()); //kiem tra name co nhap dung theo pattern khong
            if (m.matches()) {//neu dung theo pattern
                break;
            } else {
                System.out.println("AircraftCode must not blank");
            }
        }
        
        //Source
        p = Pattern.compile("\\w{1,}");
        while (true) {            
            System.out.print("source:");
            setSource(sc.nextLine()); // do yeu cau khoang trang nen khong xai trim()
            m = p.matcher(getSource()); //kiem tra name co nhap dung theo pattern khong
            if (m.matches()) {//neu dung theo pattern
                break;
            } else {
                System.out.println("Source must not blank");
            }
        }
        
        //Desti
        p = Pattern.compile("\\w{1,}");
        while (true) {            
            System.out.print("Destination:");
            setDestination(sc.nextLine()); // do yeu cau khoang trang nen khong xai trim()
            m = p.matcher(getDestination()); //kiem tra name co nhap dung theo pattern khong
            if (m.matches()) {//neu dung theo pattern
                break;
            } else {
                System.out.println("Destination must not blank");
            }
        }
        
        //DepTime
//        System.out.print("DepTime:");
//        dept = sc.nextLine().trim();
        while (true) {           
            System.out.print("Enter the DepTime(dd/MM/yyyy):");//QUAN TR???NG: ?????NH D???NG PH???I L?? dd/MM/yyyy (B???T BU???C MONTH PH???I L?? MM, n???u mm s??? l???i)
            String date = sc.nextLine().trim();
            //t???o ?????nh d???ng ki???u nh???p datetime
            //QUAN TR???NG: ?????NH D???NG PH???I L?? dd/MM/yyyy ho???c MM/dd/yyyy ho???c yyyy/MM/dd (B???T BU???C MONTH PH???I L?? MM, n???u mm s??? l???i)
            //n???u c?? time th?? ?????nh d???ng l?? dd/MM/yyyy HH:mm:ss (ph???i l?? MM v?? HH, kh??ng ???????c mm, hh kh??ng s??? l???i khi insert)
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");//QUAN TR???NG: ?????NH D???NG PH???I L?? dd/MM/yyyy (B???T BU???C MONTH PH???I L?? MM, n???u mm s??? l???i)
            try {
                //Parsing the String to date
                dept = dateFormat.parse(date);
                break;
            } catch (Exception e) {
                // TODO Auto-generated catch block
                System.out.println("Wrong format, please try again");
                e.printStackTrace();
            }
        }
        
        //journeyhrs (>0, <20)
        while (true) {
            System.out.print("JourneyHrs:");            
            try {
                setJourney(sc.nextInt());
                if (0 < getJourney()&& getJourney()< 20) {
                    break;
                }
                System.out.println("JourneyHrs must greater than 0 and less than 20");
            } catch (Exception e) {
                System.out.println("Wrong format " + e.getMessage());
            }
        }
    }

    @Override
    public String toString() {
        return getAirCode() + " - " + getSource() + " - " + getDestination() + " - " + getDept() + " - " + getJourney();
    }
}
