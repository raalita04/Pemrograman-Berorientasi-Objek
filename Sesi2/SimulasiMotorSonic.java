
public class SimulasiMotorSonic {
    boolean nyala;
    int porseneling;
    int kecepatan;
    
    SimulasiMotorSonic(){
        nyala = false;
        porseneling = 0;
        kecepatan = 0;
    }
    
    public void dinyalakan(){
        if(nyala == true){
            System.out.println("Motor sudah menyala");
        }
        else{
            System.out.println("Motor berhasil menyala");
            nyala = true;
        }
    }
    
    public void dimatikan(){
        if(nyala == false){
            System.out.println("Motor sudah mati");
        }
        else{
            System.out.println("Motor berhasil dimatikan");
            nyala = false;
        }
    }
    
    public void tambah_porseneling(){
        if(porseneling <= 6){
            porseneling++;
            System.out.println("gigi : " + porseneling);
        }
        
    }
    
    public void kurangi_porseneling(){
        if(porseneling >= 0){
            porseneling--;
            System.out.println("gigi : " + porseneling);
        }
        
        if(porseneling == 6 && kecepatan > 150){
            kecepatan = 150;
            System.out.println("kecepatan anda sekarang : " + kecepatan);
        }
        else if(porseneling == 5 && kecepatan > 100){
            kecepatan = 100;
            System.out.println("kecepatan anda sekarang : " + kecepatan);
        }
        else if(porseneling == 4 && kecepatan > 75){
            kecepatan = 75;
            System.out.println("kecepatan anda sekarang : " + kecepatan);
        }
        else if(porseneling == 3 && kecepatan > 50){
            kecepatan = 50;
            System.out.println("kecepatan anda sekarang : " + kecepatan);
        }
        else if(porseneling == 2 && kecepatan > 25){
            kecepatan = 25;
            System.out.println("kecepatan anda sekarang :" + kecepatan);
        }
        else if(porseneling == 1 && kecepatan > 10){
            kecepatan = 10;
            System.out.println("kecepatan anda sekarang :" + kecepatan);
        }
     
    }
    
    public void tambah_kecepatan(int jumlah_kecepatan){
        if(nyala == true){
            
            if(porseneling == 0){
                System.out.println("tidak bisa berjalan");
                System.out.println("porseneling anda normal");
            }
            
            else if(porseneling == 1){
                if(kecepatan + jumlah_kecepatan > 10){
                    System.out.println("kecepatan akan melebihi maksimal kecepatan di gigi 1");
                }
                else{
                    kecepatan += jumlah_kecepatan;
                }
                
                System.out.println("kecepatan anda sekarang: " + kecepatan);
            }
            
            else if(porseneling == 2){
                if(kecepatan + jumlah_kecepatan > 25){
                    System.out.println("kecepatan akan melebihi maksimal kecepatan di gigi 2");
                }
                else{
                    kecepatan += jumlah_kecepatan;
                }
                System.out.println("kecepatan anda sekarang: " + kecepatan);
            }
            
            else if(porseneling == 3){
                if(kecepatan + jumlah_kecepatan > 50){
                    System.out.println("kecepatan akan melebihi maksimal kecepatan di gigi 3");
                }
                else{
                    kecepatan += jumlah_kecepatan;
                }
                System.out.println("kecepatan anda sekarang: " + kecepatan);
            }
            
            else if(porseneling == 4){
                if(kecepatan + jumlah_kecepatan > 75){
                    System.out.println("kecepatan akan melebihi maksimal kecepatan di gigi 4");
                }
                else{
                    kecepatan += jumlah_kecepatan;
                }
                System.out.println("kecepatan anda sekarang: " + kecepatan);
            }
            
            else if(porseneling == 5){
                if(kecepatan + jumlah_kecepatan > 100){
                    System.out.println("kecepatan akan melebihi maksimal kecepatan di gigi 5");
                }
                else{
                    kecepatan += jumlah_kecepatan;
                }
                
                System.out.println("kecepatan anda sekarang: " + kecepatan);
            }
            
            else if(porseneling == 6){
                if(kecepatan + jumlah_kecepatan > 150){
                    System.out.println("kecepatan akan melebihi maksimal kecepatan");
                }
                else{
                    kecepatan += jumlah_kecepatan;
                }
                System.out.println("kecepatan anda sekarang: " + kecepatan);
            }
        }
        else{
            System.out.println("belum nyala");
        }
    }
    
    public void kurangi_kecepatan(int jumlah_kecepatan){
        if(nyala == true){
            kecepatan -= jumlah_kecepatan;
            System.out.println("kecepatan dikurangi");
            System.out.println("kecepatan anda sekarang: " + kecepatan);
        }
    }
    
    public void infoMotor(){
        if(kecepatan >= 0 && kecepatan <= 50){
            System.out.println("kecepatan rendah");
        }
        else if(kecepatan >= 51 && kecepatan < 75){
            System.out.println("kecepatan sedang");
        }
        else if(kecepatan >= 75){
            System.out.println("kecepatan tinggi");
        }
    }
    
    public static void main(String[]args) {
        SimulasiMotorSonic rxking = new SimulasiMotorSonic();
        
        rxking.dinyalakan();
        rxking.tambah_porseneling();
        rxking.tambah_porseneling();
        rxking.tambah_kecepatan(20);
        rxking.kurangi_kecepatan(5);
        rxking.kurangi_porseneling();
        rxking.tambah_kecepatan(10);
        rxking.tambah_kecepatan(10);
        rxking.tambah_porseneling();
        rxking.tambah_porseneling();
        rxking.tambah_porseneling();
        rxking.tambah_kecepatan(20);
        
        rxking.infoMotor();
    }
    
}
