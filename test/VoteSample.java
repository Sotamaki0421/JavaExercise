package test;

public class VoteSample {

    public static void main(String[] args) {
        final int VOTE_AGE = 18;

        int age = 16;
        if (age < VOTE_AGE) {
            System.out.println("18歳未満の方は投票できません");
        }
    }
}