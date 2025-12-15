package com.example.ThiCuoiMon;

public class CheckSoNguyen {
    public String checkSo(int a){
        if (a < 1 || a > 100){
            throw new IllegalArgumentException("Nhap so nguyen duong di em");
        }
        if (a >= 1 || a <= 100){
            return "So nguyen";
        }
        return null;
    }
}
