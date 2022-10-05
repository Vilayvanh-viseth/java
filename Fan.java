public class Fan {
    String thuongHieu;
    String loai;
    float gia;
    int congSuat;
    int capDo;
    boolean quayNgang;

    public Fan(String thuongHieu, String loai, float gia, int congSuat) {
        this.thuongHieu = thuongHieu;
        this.loai = loai;
        this.gia = gia;
        this.congSuat = congSuat;
        this.capDo = 0;
        this.quayNgang = false;
    }

    void chuyenSo(int so){
        if(so>=0)
            this.capDo = so;
        else
            System.out.println("So khong hop le");
    }
    void chuyenTrangThaiQuay(){
        this.quayNgang = !this.quayNgang;
    }

    void bat(){
        if(this.capDo==0){
            chuyenSo(1);
        }
    }
    void tat(){
        chuyenSo(0);
    }

    @Override
    public String toString() {
        return "Quat{" +
                "thuongHieu='" + thuongHieu + '\'' +
                ", loai='" + loai + '\'' +
                ", gia=" + gia +
                ", congSuat=" + congSuat +
                ", capDo=" + capDo +
                ", quayNgang=" + quayNgang +
                '}';
    }
    void hienThi(){
        System.out.println(this);
    }
    void display() {
        System.out.println("Thuong Hieu:"+ thuongHieu+ ", loai:" +loai+ ", gia:" +gia+ ", Cong Suat:" +congSuat+"W ,Capdo:"+capDo+ ", Quay Ngang:"+quayNgang);

    }
    public static void main(String[]args){
        System.out.println("Hello World");
        Fan sp1 = new Fan("SUMSUNG","Quat cay",150000, 50);
        Fan sp2 = new Fan("HATARI ","Quat cay",160000, 60);
        Fan sp3 = new Fan("XIAOMI ","Quat cay",165000, 65);
        sp1.display();
        sp2.display();
        sp3.display();
    }
}