import java.util.Calendar;

public class SinhVien {
    private String msv;
    private String hoTen;
    private int namSinh;
    private double diemJava;

    public SinhVien() {
    }

    public SinhVien(String msv, String hoTen, int namSinh, double diemJava) {
        this.msv = msv;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diemJava = diemJava;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }
    public int tuoiSV(){
        Calendar today = Calendar.getInstance();
        int currentYear = today.get(Calendar.YEAR);
        return currentYear - namSinh;
    }
    public void hienThiThongTin(){
        System.out.println( getHoTen() + " ," + tuoiSV() +" tuổi, có mã sinh viên là: "+getMsv()+", đạt "+getDiemJava()+" điểm Java ");
    }
}
