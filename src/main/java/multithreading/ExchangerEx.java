package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> friendActions1 = new ArrayList<>();
        friendActions1.add(Action.NOGNICI);
        friendActions1.add(Action.BUMAGA);
        friendActions1.add(Action.NOGNICI);
        List<Action> friendActions2 = new ArrayList<>();
        friendActions2.add(Action.BUMAGA);
        friendActions2.add(Action.KAMEN);
        friendActions2.add(Action.KAMEN);
        new BestFriend("Vania", friendActions1, exchanger);
        new BestFriend("Alex", friendActions2, exchanger);



    }
}
enum Action {
    KAMEN,NOGNICI, BUMAGA;
}

class BestFriend extends Thread {
    private final String name;
    private final List<Action> myActions;
    private final Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();
    }
    private void whoWins(Action myAction, Action friendAction) {

        if ((myAction == Action.KAMEN && friendAction == Action.NOGNICI
        || myAction == Action.NOGNICI && friendAction == Action.BUMAGA)
        || myAction == Action.BUMAGA && friendAction == Action.KAMEN) {
            System.out.println(name + " WINS!!!!");
        }

    }
    public void run(){
        Action replay;
        for (Action action : myActions) {
            try {
                replay = exchanger.exchange(action);
                whoWins(action, replay);
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}