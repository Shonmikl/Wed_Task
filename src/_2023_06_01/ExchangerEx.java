package _2023_06_01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();

        List<Action> person1actionList = new ArrayList<>();
        person1actionList.add(Action.SCISSORS);
        person1actionList.add(Action.STONE);
        person1actionList.add(Action.SCISSORS);

        List<Action> person2actionList = new ArrayList<>();
        person2actionList.add(Action.STONE);
        person2actionList.add(Action.STONE);
        person2actionList.add(Action.PAPER);

        new Person("PERSON1", person1actionList, exchanger);
        new Person("PERSON2", person2actionList, exchanger);
    }
}

enum Action {
    STONE,
    PAPER,
    SCISSORS
}

//у КЛАССА есть ПОЛЕ
class Person extends Thread {
    private String name;
    private List<Action> actionList;
    private Exchanger<Action> exchanger;


    public Person(String name, List<Action> actionList, Exchanger<Action> exchanger) {
        this.name = name;
        this.actionList = actionList;
        this.exchanger = exchanger;
        this.start();
    }

    private void whoWins(Action person1, Action person2) {
        if (person1 == Action.PAPER && person2 == Action.STONE ||
                person1 == Action.STONE && person2 == Action.SCISSORS ||
                person1 == Action.SCISSORS && person2 == Action.PAPER) {
            System.out.println(name + " is WINNER");
        }
    }


    public void run() {
        Action reply;
        //p1 --> SC p2 --> ST
        for (Action action : actionList) {
            try {
                reply = exchanger.exchange(action); //p1 --> SC p2 --> ST
                whoWins(action, reply);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}