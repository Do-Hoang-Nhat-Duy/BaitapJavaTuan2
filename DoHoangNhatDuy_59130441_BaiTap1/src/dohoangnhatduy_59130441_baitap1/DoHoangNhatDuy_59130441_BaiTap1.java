
package dohoangnhatduy_59130441_baitap1;


public class DoHoangNhatDuy_59130441_BaiTap1 {

    public static void main(String[] args) {
        LopHoc lh = new LopHoc();
        
        HocSinh hs1 = new HocSinh("59CNTT1", "Hat", "Nhat Duy", 21, "Nha Trang", "0204890184");
        HocSinh hs2 = new HocSinh("59CNTT2", "Ve", "Nhat Hai", 21, "Nha Trang", "0204890194");
        HocSinh hs3 = new HocSinh("59CNTT3", "Dien kich", "Nhat Huy", 21, "Nha Trang", "0204890174");
        
        lh.themHocSinh(hs1);
        lh.themHocSinh(hs2);
        lh.themHocSinh(hs3);
        
        lh.inDSHS();
    }
    
}
