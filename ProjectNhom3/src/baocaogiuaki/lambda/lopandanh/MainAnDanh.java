package baocaogiuaki.lambda.lopandanh;

public class MainAnDanh {
    public static void main(String[] args) {
        HinhHoc hinhGiDo = new HinhHoc() {
             
            protected float banKinh;
                 
            @Override
            public void nhapBanKinh(float banKinh) {
                this.banKinh = banKinh;
            }
                 
            @Override
            public float tinhChuVi() {
                return 2 * PI * banKinh;
            }
                 
            @Override
            public float tinhDienTich() {
                return PI * banKinh * banKinh;
            }
                 
            @Override
            public void xuatThongTin() {
                System.out.println("Hinh Vo Danh");
                System.out.println("Chu vi: " + tinhChuVi());
                System.out.println("Dien tich: " + tinhDienTich());
            }
        };
             
        hinhGiDo.nhapBanKinh(10);
        hinhGiDo.xuatThongTin();
    }
}
