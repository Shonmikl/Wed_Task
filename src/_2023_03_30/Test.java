package _2023_03_30;

public class Test {
    public static void main(String[] args) {
        Pupil pupil1 = new Pupil("Yan", 14);
        Pupil pupil2 = new Pupil("Anita", 13);
        Pupil pupil3 = new Pupil("Lu", 13);
        Pupil pupil4 = new Pupil("Elina", 11);

        Student student1 = new Student("Uliana", 18);
        Student student2 = new Student("Alexandr", 19);

        Adult adult1 = new Adult("Sonya", 30);
        Adult adult2 = new Adult("Konstantin", 32);

        Team<Pupil> pupilTeam1 = new Team<>("PUPIL1");
        pupilTeam1.addNewParticipant(pupil1);
        pupilTeam1.addNewParticipant(pupil2);

        Team<Pupil> pupilTeam2 = new Team<>("PUPIL2");
        pupilTeam2.addNewParticipant(pupil3);
        pupilTeam2.addNewParticipant(pupil4);

        Team<Student> studentTeam = new Team<>("STUDENT1");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Adult> adultTeam = new Team<>("ADULT1");
        adultTeam.addNewParticipant(adult1);
        adultTeam.addNewParticipant(adult2);

        pupilTeam1.playWith(pupilTeam2);
    }
}
