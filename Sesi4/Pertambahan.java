
public class Pertambahan {
    
     public int tambah(int x, int y) {
        return x + y;
    }

    public float tambah(float x, float y){
        return x + y;
    }

    public double tambah(double x, double y){
        return x + y;
    }

    public static void main(String[] args) {
        Pertambahan per = new Pertambahan();

        System.out.println(per.tambah(10, 5));
        System.out.println(per.tambah(6.6, 2.512));
        System.out.println(per.tambah(6.234283048203482034, 4.237429387492342));
    }
    
}
