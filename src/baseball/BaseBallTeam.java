// baseball/BaseBallTeam.java
package baseball;

public class BaseBallTeam {
     String name;
     int win;
     int lose;
     int draw;

    // コンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
       this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    // チーム名
    public String getName() {
        return name;
    }

    // 勝数
    public int getWin() {
        return win;
    }

    // 負け数
    public int getLose() {
        return lose;
    }

    // 引き分け数
    public int getDraw() {
        return draw;
    }

    // 勝率
    public double getRate() {
        int totalGames = win + lose;
        return (double) win / totalGames;
    }

    // レポート表示
    public void report() {
        System.out.printf("%sの2022年の成績は %d勝 %d敗 %d分、勝率は %.2fです。\n",
                name, win, lose, draw, getRate());
    }
}
