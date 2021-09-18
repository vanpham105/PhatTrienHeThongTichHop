public class PhanSo {
    private int tu, mau;
    public PhanSo(int tu, int mau) {
        super();
        this.tu = tu;
        this.mau = mau;
    }
     public int getTu() {
        return tu;
    }
    public void setTu(int tu) {
        this.tu = tu;
    }
    public int getMau() {
        return mau;
    }
    public void setMau(int mau) {
        this.mau = mau;
    }
    void inManHinh(){
        System.out.println("Phân số: "+tu + "/" + mau);
    }
    public void nghichDao(){
        int ts=this.getMau();
        int ms=this.getTu();
        PhanSo nghichDao = new PhanSo(ts, ms);
        System.out.println("Phân số nghịch đảo = " + ts + "/" + ms);
    }
    public int timUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
    public void toiGianPhanSo() {
        int i = timUSCLN(this.getTu(), this.getMau());
        this.setTu(this.getTu() / i);
        this.setMau(this.getMau() / i);
    }
    public void congPhanSo(PhanSo ps) {
        int ts = this.getTu() * ps.getMau() + ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        PhanSo phanSoTong = new PhanSo(ts, ms);
        phanSoTong.toiGianPhanSo();
        System.out.println("Tổng 2 phân số = " + phanSoTong.tu + "/" + phanSoTong.mau);
    }
    public void truPhanSo(PhanSo ps) {
        int ts = this.getTu() * ps.getMau() - ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        PhanSo phanSoHieu = new PhanSo(ts, ms);
        phanSoHieu.toiGianPhanSo();
        System.out.println("Hiệu 2 phân số = " + phanSoHieu.tu + "/" + phanSoHieu.mau);
    }
    public void nhanPhanSo(PhanSo ps) {
        int ts = this.getTu() * ps.getTu();
        int ms = this.getMau() * ps.getMau();
        PhanSo phanSoTich = new PhanSo(ts, ms);
        phanSoTich.toiGianPhanSo();
        System.out.println("Tích 2 phân số = " + phanSoTich.tu + "/" + phanSoTich.mau);
    }
    public void chiaPhanSo(PhanSo ps) {
        int ts = this.getTu() * ps.getMau();
        int ms = this.getMau() * ps.getTu();
        PhanSo phanSoThuong = new PhanSo(ts, ms);
        phanSoThuong.toiGianPhanSo();
        System.out.println("Thương 2 phân số = " + phanSoThuong.tu + "/" + phanSoThuong.mau);
    }
    public static void main(String[] args) {
        PhanSo phanSo1=new PhanSo(26,5);    // tạo phân số có tử = 26 và mẫu = 5
        PhanSo phanSo2=new PhanSo(5,9); // tạo phân số có tử = 5 và mẫu = 9
            phanSo1.inManHinh();
            phanSo1.nghichDao();
            phanSo2.inManHinh();
            phanSo2.nghichDao();
            phanSo1.congPhanSo(phanSo2);
            phanSo1.truPhanSo(phanSo2);
            phanSo1.nhanPhanSo(phanSo2);
            phanSo1.chiaPhanSo(phanSo2);
    }
}