
package BaiTap2;

import BaiTap1.NhanVien;


public class QLNVMain {
    public static void main(String[] args){
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        
        NhanVien nv1 = new NhanVien("Nhat Duy", 21, "Nha Trang", 6500000, 120);
        NhanVien nv2 = new NhanVien("Thai Tuan", 21, "Phu Yen", 5000000, 150);
        NhanVien nv3 = new NhanVien("The Dung", 21, "Nha Trang", 7000000, 210);
        NhanVien nv4 = new NhanVien("Hoang Khoa", 21, "Nha Trang", 5000000, 100);
        NhanVien nv5 = new NhanVien("Ngoc Phuc", 21, "Dak Lak", 5500000, 120);
        
        qlnv.them(nv1);
        qlnv.them(nv2);
        qlnv.them(nv3);
        qlnv.them(nv4);
        qlnv.them(nv5);
        
        qlnv.inDS();
    }
}
