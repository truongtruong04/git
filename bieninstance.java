package vn.viettuts.bienvadulieu;

public class bieninstance {
    public String ten;
    private int tuoi;
    public bieninstance(String ten) {
        this.ten = ten;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void showStudent() {
        System.out.println("Ten  : " + ten);
        System.out.println("Tuoi : " + tuoi);
    }

    public static void main(String args[]) {
        vn.viettuts.bienvadulieu.bieninstance sv = new vn.viettuts.bienvadulieu.bieninstance("pham van truong");
        sv.setTuoi(18);
        sv.showStudent();
    }
}