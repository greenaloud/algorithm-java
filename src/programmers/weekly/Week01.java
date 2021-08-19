package programmers.weekly;

public class Week01 {

    public long solution(int price, int money, int count) {
        long required = price * (long) (count+1) * count / 2;
        return required > money ? required - money : 0;
    }

}