package exercise05.extended;
import exercise05.Coin;
import exercise05.EnhancedChangeCalculator;
import exercise05.SimpleChangeCalculator;

/**
 * Created by sebb on 4/25/16.
 */
public class LimitedChangeCalculator extends EnhancedChangeCalculator {

    @Override
    public int[] getChange(int euros, int cent) {
        try
        {
            return getChangeLtd(euros, cent, CoinAvailable.coinsAvailable());
        }
        catch (NotEnoughCoinsAvailableException e)
        {
            // :(
            return super.getChange(euros, cent);
        }
    }

    /**
     * Returns change when the available coins are limited.
     * @param euros
     * @param cent
     * @param avail
     * @return
     * @throws NotEnoughCoinsAvailableException
     */
    public int[] getChangeLtd(int euros, int cent, CoinAvailable[] avail) throws NotEnoughCoinsAvailableException {
        CoinAvailable[] reverze =  new CoinAvailable[avail.length];
        cent += 100*euros; // alles in ct
        int[] ret = new int[avail.length];

        for (int i = 0; i < avail.length; i++) // reverse input
            reverze[i] = avail[avail.length - 1 - i];

        for (int i = avail.length - 1; i >= 0; i--) {
            int left = avail[i].getAvailable(),   // how much coins are available
                value = avail[avail.length - 1 - i].getCoin().getValue(), // the coins value
                count = 0; // the count of this coin


            while (left-- > 0 && cent >= value)
            {
                cent -= value;
                count++;
            }

            ret[ret.length - 1 - i] = count; // save count
        }

        if(cent > 0) // no fitting coin count
            throw new NotEnoughCoinsAvailableException();

        return ret;
    }



}
