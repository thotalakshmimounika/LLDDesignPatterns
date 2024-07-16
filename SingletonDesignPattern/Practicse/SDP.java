package SingletonDesignPattern.Practicse;

public class SDP {
    private static SDP instance=null;
    private SDP(){

    }
    public static SDP getinstance(){
        if(instance==null){
            instance = new SDP();
        }
        return instance;
    }


}
