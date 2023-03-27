package bai2;

import java.util.Scanner;

public class Bank {
    private int stk;
    private double soDu;
    private String name;
    private String email;
    private String sdt;

    public Bank() {
    }

    public Bank(int stk, double soDu, String name, String email, String sdt) {
        this.stk = stk;
        this.soDu = soDu;
        this.name = name;
        this.email = email;
        this.sdt = sdt;
    }

    public int getStk() {
        return stk;
    }

    public void setStk(int stk) {
        this.stk = stk;
    }

    public double getSoDu() {
        return soDu;
    }

    public void setSoDu(int soDu) {
        this.soDu = soDu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    Scanner scanner = new Scanner(System.in);
    public void tangSoDu(){
        System.out.println("mời bạn nhập số tiền muốn đút vào tài khoản:");
        double inMoney;
        inMoney = scanner.nextDouble();
        soDu += inMoney;
        System.out.println("bạn vừa thêm "+inMoney+" đồng vào tài khoản");
        System.out.println("số dư của bạn là: "+soDu);
    }
    public void rutTien(){
        double outMoney;
        System.out.println(" số tiền bạn cần rút: ");
        outMoney = scanner.nextDouble();
        if(soDu <outMoney)System.out.println("số tiền bạn muons rút vượt quá số dư.\n Số dư của bạn là:"+soDu);
        else{
            soDu -= outMoney;
            System.out.println("bạn vừa rút "+outMoney+".\n Số dư của bạn là:"+soDu);
        }
    }
    public void pintInfo(){
        System.out.println("SỐ TÀI KHOẢN:"+getStk());
        System.out.println("HỌ VÀ TÊN: "+getName());
        System.out.println("SỐ DƯ: "+getSoDu());
        System.out.println("EMAIL: "+getEmail());
        System.out.println("sỐ ĐIỆN THOẠI: "+getSdt());

    }
}
