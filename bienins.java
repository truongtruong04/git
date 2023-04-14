
package vn.viettuts.bienvadulieu;

public class bienins {
    public String ten;
    private int tuoi;
    public bienins(String ten) {
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
        vn.viettuts.bienvadulieu.bienins sv = new vn.viettuts.bienvadulieu.bienins("Nguyen Van A");
        sv.setTuoi(21);
        sv.showStudent();
    }
}