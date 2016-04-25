package exercise05.extended;

import exercise05.Coin;

/**
 * Created by sebb on 4/25/16.
 */
public class CoinAvailable {
    public Coin coin;
    public int available;

    public CoinAvailable(Coin coin, int available) {
        this.coin = coin;
        this.available = available;
    }

    public CoinAvailable(Coin coin) {
        this.coin = coin;
        this.available = (int)(Math.random() * 3);
    }

    public Coin getCoin() {
        return coin;
    }

    public void setCoin(Coin coin) {
        this.coin = coin;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    /**
     * Returns all coins with random availability..
     * @return
     */
    public static CoinAvailable[] coinsAvailable()
    {
        return new CoinAvailable[] {
                new CoinAvailable(new Coin("1-Cent", 1)),
                new CoinAvailable(new Coin("2-Cent", 2)),
                new CoinAvailable(new Coin("5-Cent", 5)),
                new CoinAvailable(new Coin("10-Cent", 10)),
                new CoinAvailable(new Coin("20-Cent", 20)),
                new CoinAvailable(new Coin("50-Cent", 50)),
                new CoinAvailable(new Coin("1-Euro", 100)),
                new CoinAvailable(new Coin("2-Euro", 200))
        };
    }
}
