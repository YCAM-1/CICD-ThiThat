package com.example.ThiCuoiMon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SachServletTest {
    private SachServlet sachServlet;
    private Sach sach;
    @BeforeEach
    public void setUp(){
        sachServlet = new SachServlet();
        sach = new Sach("S01", "Sach Java", "Ly Bao", 2020, 500.000f);
    }
    @Test
    public void suaSachHopLeVoiNamXuatBanBienMin(){
        assertTrue(sachServlet.suaSach(sach, "S01", "Sach Java", "Ly Bao", 1990, 500.000f));
    }
    @Test
    public void suaSachHopLeVoiNamXuatBanBienMinCong1(){
        assertTrue(sachServlet.suaSach(sach, "S01", "Sach Java", "Ly Bao", 1991, 500.000f));
    }
    @Test
    public void suaSachHopLeVoiNamXuatBanBienMax(){
        assertTrue(sachServlet.suaSach(sach, "S01", "Sach Java", "Ly Bao", 2025, 500.000f));
    }
    @Test
    public void suaSachHopLeVoiNamXuatBanBienMaxTru1(){
        assertTrue(sachServlet.suaSach(sach, "S01", "Sach Java", "Ly Bao", 2024, 500.000f));
    }
    @Test
    public void suaSachKhongHopLeVoiNamXuatBanBienMaxCong1(){
        assertThrows(IllegalArgumentException.class, () ->
           sachServlet.suaSach(sach, "S01", "Sach Java", "Ly Bao", 2026, 500.000f));
    }
    @Test
    public void suaSachKhongHopLeVoiNamXuatBanBienMinTru1(){
        assertThrows(IllegalArgumentException.class, () ->
                sachServlet.suaSach(sach, "S01", "Sach Java", "Ly Bao", 1989, 500.000f));
    }
    @Test
    public void suaSachKhongHopLeVoiMaSachTrong(){
        assertThrows(IllegalArgumentException.class, () ->
                sachServlet.suaSach(sach, "", "Sach Java", "Ly Bao", 2020, 500.000f));
    }
}