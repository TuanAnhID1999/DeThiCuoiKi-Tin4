package com.tuananh.cuoiki;

public class Book {
    private String maso, tensach, tacgia;
    private int gia;
    private double phanTramGiamGia;
     public  Book(){

     }

    public Book(String maso, String tensach, String tacgia, int gia, double phanTramGiamGia) {
        this.maso = maso;
        this.tensach = tensach;
        this.tacgia = tacgia;
        this.gia = gia;
        this.phanTramGiamGia = phanTramGiamGia;
    }

    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public double getPhanTramGiamGia() {
        return phanTramGiamGia;
    }

    public void setPhanTramGiamGia(double phanTramGiamGia) {
        this.phanTramGiamGia = phanTramGiamGia;
    }
}
