package _2023_03_30;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Participant {
    private String name;
    private int age;
}


class Adult extends Participant {
    public Adult(String name, int age) {
        super(name, age);
    }
}

class Pupil extends Participant {

    public Pupil(String name, int age) {
        super(name, age);
    }
}

class Student extends Participant {

    public Student(String name, int age) {
        super(name, age);
    }
}