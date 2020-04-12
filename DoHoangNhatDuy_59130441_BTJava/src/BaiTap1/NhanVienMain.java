
package BaiTap1;

public class NhanVienMain {
    public static void main(String[] args) {
        //1
        NhanVien nhanvien1 = new NhanVien();
        nhanvien1.ten = "Nhat Duy";
        nhanvien1.diaChi = "Nha Trang";
        nhanvien1.tuoi = 20;
        nhanvien1.tienLuong = 6500000;
        nhanvien1.tongGioLam = 120;
        //2
        NhanVien nhanvien2 = new NhanVien();
        nhanvien2.ten = "Quang Nghia";
        nhanvien2.diaChi = "Ninh Hoa";
        nhanvien2.tuoi = 21;
        nhanvien2.tienLuong = 7000000;
        nhanvien2.tongGioLam = 100;
        
        System.out.println("Thong tin nhan vien 1:"+nhanvien1.getThongTin());
        
        System.out.println("Thong tin nhan vien 2:"+nhanvien2.getThongTin());
    }
    
}
