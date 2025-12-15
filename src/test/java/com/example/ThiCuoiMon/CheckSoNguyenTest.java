package com.example.ThiCuoiMon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckSoNguyenTest {
    CheckSoNguyen checkSoNguyen;
    @BeforeEach
    public void setUp(){
        checkSoNguyen = new CheckSoNguyen();
    }
    @Test
    public void soNguyenHopLeVoiBienMin(){
        String mongMuon = checkSoNguyen.checkSo(1);
        String thucTe = "So nguyen";
        assertEquals(mongMuon, thucTe);
    }
    @Test
    public void soNguyenHopLeVoiBienMinCong1(){
        String mongMuon = checkSoNguyen.checkSo(2);
        String thucTe = "So nguyen";
        assertEquals(mongMuon, thucTe);
    }
    @Test
    public void soNguyenHopLeVoiBienMax(){
        String mongMuon = checkSoNguyen.checkSo(100);
        String thucTe = "So nguyen";
        assertEquals(mongMuon, thucTe);
    }
    @Test
    public void soNguyenHopLeVoiBienMaxTru1(){
        String mongMuon = checkSoNguyen.checkSo(99);
        String thucTe = "So nguyen";
        assertEquals(mongMuon, thucTe);
    }
    @Test
    public void soNguyenKhongHopLeVoiBienMaxCong1(){
        assertThrows(IllegalArgumentException.class, () -> checkSoNguyen.checkSo(101));
    }
    @Test
    public void soNguyenKhongHopLeVoiBienMinTru1(){
        assertThrows(IllegalArgumentException.class, () -> checkSoNguyen.checkSo(0));
    }
}