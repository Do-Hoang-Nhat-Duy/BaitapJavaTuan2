/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author Phong Vu
 */
public class SVMain {
    public static void main(String[] args){
        SinhVienPoLy sv1 = new SinhVienIT(5, 6, 7, "Nhat Duy", "CNTT"){};
        System.out.println("Sinh vien IT");
        sv1.Xuat();
        
        SinhVienPoLy sv2 = new SinhVienBiz(7, 8, "Quang Nghia", "Marketing") {
        };
        System.out.println("Sinh vien Biz");
        sv2.Xuat();
    }
}
