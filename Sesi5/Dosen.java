import java.util.ArrayList;

public class Dosen extends Person {
    private int jumlahmatkul;
    private ArrayList<String> matkuList;

    public Dosen(String name, String address){
        super(name, address);
        jumlahmatkul = 0;
        matkuList = new ArrayList<>();

    }

    public boolean addCourse(String course){
        //Jika dalam arraylist ada yang sama maka mata kuliah telah ada
        if(matkuList.contains(course)){
            System.out.println("Mata kuliah telah ada");
            return false;
        }

        //Menambahkan
        jumlahmatkul++;
        matkuList.add(course);
        return true;
    }

    public boolean removeCourse(String course){
        //Jika dalam arraylist tidak ada course maka tidak bisa menghapus matkul
        if(!matkuList.contains(course)){
            System.out.println("Mata kuliah yang akan dihapus tidak ada");
            return false;
        }

        //Jika ada hapus
        jumlahmatkul--;
        matkuList.remove(course);
        return true;
        
    }

    public int getjumlahmatkul() {
        return jumlahmatkul;
    }

    public String toString(){
        return 
        super.toString() + 
        "\n Jumlah mata kuliah yang diampu : " + getjumlahmatkul();
    }
    
}
