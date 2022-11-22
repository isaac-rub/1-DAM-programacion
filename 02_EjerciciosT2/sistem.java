



/**
 *
 * @author usuario-mañana
 */
public class sistem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ven="java.vendor";
        String path="java.class.path";
        String home="java.home";
        String vuntil="java.vendor.url";
        String ver="java.version";
        String dir="user.dir";
        String hom="user.home";
        String nom="user.name";
        
        String nombreSO="os.name";
        String nversionSO="os.version";
        String archSO="os.arch";
        System.out.println("/n informacion sobre el SO:");
        System.out.println("/n nombre del SO"+System.getProperty(nombreSO));
        System.out.println("version del SO"+System.getProperty(nversionSO));
         System.out.println("arquitectuta  del SO"+System.getProperty(archSO));
        System.out.println("vendor name"+System.getProperty(ven));
        System.out.println(System.getProperty(path));
        System.out.println(System.getProperty(home));
        System.out.println(System.getProperty(vuntil));
        System.out.println(System.getProperty(ver));
       System.out.println(System.getProperty(dir));
       System.out.println(System.getProperty(hom));
       System.out.println(System.getProperty(nom));
       
        
        
        
        
        
        
    }

}
