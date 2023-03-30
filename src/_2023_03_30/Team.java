package _2023_03_30;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 *
 *
 *
 *
 *
 */

public class Team<T extends Participant> {
    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(T participant) {
        participants.add(participant);
        System.out.println("We added new participant: "
                + participant.getName());
    }

    //t1.playWith(t2)
    public void playWith(Team<T> team) {
        String winner;
        Random random = new Random();
        int w = random.nextInt(2);
        if (w == 0) {
            winner = this.name;
        } else {
            winner = team.name;
        }
        System.out.println(winner);
    }
}