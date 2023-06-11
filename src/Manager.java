import input.SelectorLifecycle;
import services.StopOrCont;

public class Manager {

    public static void main(String[] args) {
        StopOrCont stopOrCont = new StopOrCont();
        while(true){
            new SelectorLifecycle().lifecycle();
            if (stopOrCont.continueUse().equals("end")){
                break;
            }
        }


    }

}
