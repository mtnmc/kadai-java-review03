package baseball;

public class BaseBallTeam {
    // フィールド
    private String name; // 名前
    private int win; // 勝った数
    private int lose; // 負けた数
    private int draw; // 引き分け数

    // 引数なしのコンストラクタ
    public BaseBallTeam() {
    }

    // 引数ありのコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    // 勝率メソッド
    public double getRate() {
        double rate = (double)this.win / (this.win + this.lose);
        return rate;
    }

    // レポートメソッド
    public void report() {
        System.out.println(this.name + "の２０２２年の成績は" + this.win + "勝" + this.lose + "敗" + this.draw + "分、勝率は" + getRate() + "です");
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getwin() {
        return win;
    }

    public void setwin(int win) {
        this.win = win;
    }

    public int getlose() {
        return lose;
    }

    public void setlose(int lose) {
        this.lose = lose;
    }

    public int getdraw() {
        return draw;
    }

    public void setdraw(int draw) {
        this.draw = draw;
    }

}
