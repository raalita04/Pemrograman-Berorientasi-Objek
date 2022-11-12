
public class SegiTiga extends BangunDatar {
    private float alas;
    private float tinggi;
    
    public SegiTiga(float alas, float tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
        
    }

    SegiTiga(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    float getLuas() {
        return(float)0.5 * alas * tinggi;
    }
    

   
    }
    
    
    
    
    
    
    

