package baseball;

public class BaseBallTeam {
    private String name;
    private int win;
    private int lose;
    private int draw;

    public BaseBallTeam() {
    }

    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    public String getName() {
        return this.name;
    }

    public int getWin() {
        return this.win;
    }

    public int getLose() {
        return this.lose;
    }

    public int getDraw() {
        return this.draw;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public double getRate() {
        return (double) getWin() / ((double) getWin() + (double) getLose());
    }

    public void report() {
        System.out.println(getName() + "の2020年の成績は " + String.valueOf(getWin()) + "勝 " + String.valueOf(getLose()) + "敗 " + String.valueOf(getDraw()) + "分、勝率は" + String.valueOf(getRate()) + "です。");
    }
}
