
        package vn.viettuts.bienvadulieu;

public class bienlocal {

    public void sayHello() {
        int n = 10;
        System.out.println("Gia tri cua n la: " + n);
    }

    public static void main(String[] args) {
        vn.viettuts.bienvadulieu.bienlocal bienLocal = new vn.viettuts.bienvadulieu.bienlocal();
        bienLocal.sayHello();
    }
}