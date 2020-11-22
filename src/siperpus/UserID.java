package siperpus;

public class UserID {

    private static  String id_log;
    private static  String lvl_log;
    
    public static  String getid(){
        return id_log;
    }
    
    public static void setid(String id_log) {
        UserID.id_log = id_log;
    }
    
     public static  String getlvl(){
        return lvl_log;
    }
    
    public static void setlvl(String lvl_log) {
        UserID.lvl_log = lvl_log;
    }
  
}
