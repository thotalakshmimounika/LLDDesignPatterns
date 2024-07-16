package SingletonDesignPattern.Practicse;

public class SDP_Multithread {
    private static SDP_Multithread instance = null;
    private SDP_Multithread(){

    }
    public static SDP_Multithread getInstance(){
        if(instance == null){
            synchronized (SDP_Multithread.class){
                if(instance == null){
                    instance = new SDP_Multithread();
                }
            }

        }
        return instance;
    }
}