/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

/**
 *
 * @author Phong Vu
 */
public class CXMain {
    public static void main(String[] args){
        QuanLyChuyenXe qlcx = new QuanLyChuyenXe();
    
        ChuyenXe noi1 = new ChuyenXeNoiThanh(11, 100, "1abcxyz", "Dang Quang Nghia", "8049AR7", 100000);
        ChuyenXe noi2 = new ChuyenXeNoiThanh(25, 120, "2abcyzz", "Do Hoang Nhat Duy", "809BC09", 150000);
        ChuyenXe noi3 = new ChuyenXeNoiThanh(33, 90, "abc3xyz", "Nguyen Thai Tuan", "1059XY5", 80000);
        
        ChuyenXe ngoai1 = new ChuyenXeNgoaiThanh("Cam Ranh", 2, "abc4xyz", "Truong Hoang Khoa", "123456a", 220000);
        ChuyenXe ngoai2 = new ChuyenXeNgoaiThanh("Ninh Hoa", 1, "abc5xyz", "Nguyen Trung Khiem", "123456b", 200000);
        ChuyenXe ngoai3 = new ChuyenXeNgoaiThanh("Vung Tau", 3, "abc6xyz", "Le The Dung", "123456c", 320000);
        
        qlcx.them(noi1);
        qlcx.them(noi2);
        qlcx.them(noi3);
        qlcx.them(ngoai1);
        qlcx.them(ngoai2);
        qlcx.them(ngoai3);
        
        qlcx.inDS();
        
        System.out.println("Tong doanh thu xe noi thanh: " + qlcx.tongDoanhThuXeNoiThanh());
        System.out.println("Tong doanh thu xe ngoai thanh: " + qlcx.tongDoanhThuXeNgoaiThanh());
        System.out.println("Tong doanh thu ca hai xe: " + qlcx.tongDoanhThuHaiLoaiXe());
    }
}
