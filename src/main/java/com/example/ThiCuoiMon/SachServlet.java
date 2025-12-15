package com.example.ThiCuoiMon;

public class SachServlet {
    public boolean suaSach(Sach s, String maSach, String tenSach, String tacGia, int namXuatBan, float gia){
        if (maSach == null || maSach.isEmpty()){
            throw new IllegalArgumentException("Nhap ma sach di");
        }
        if (tacGia == null || tacGia.isEmpty()){
            throw new IllegalArgumentException("Nhap ma sach di");
        }
        if (tacGia == null || tacGia.isEmpty()){
            throw new IllegalArgumentException("Nhap ma sach di");
        }
        if (namXuatBan < 1990 || namXuatBan > 2025){
            throw new IllegalArgumentException("Nam tu 1990 den 2025");
        }
        return true;
    }
}
