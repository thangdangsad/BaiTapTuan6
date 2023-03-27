package bai3;

public class Point {
    protected int x,y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void khoangCach(){
        double khoangCach;
        khoangCach = Math.sqrt(x * x + y * y);
        System.out.println("khoảng cách của tọa độ hiện tại với gốc tọa độ là: " + khoangCach);
    }
    public void khoangCach(int x, int y) {
        double khoangCach;
        khoangCach=Math.sqrt(Math.pow(x-getX(),2)+Math.pow(y-getY(),2));
        System.out.println("khoảng cách của tọa độ hiện tại với tọa độ (x, y) là : "+khoangCach);
    }
    public void khoangcach(Point p ){
        int dx = this.x - p.x;
        int dy = this.y - p.x;
        System.out.println("Khoảng cách của tọa độ hiện tại với tọa độ được truyền vào thông qua lớp Point là :"+Math.sqrt(dx * dx + dy * dy));
    }
}
