package exercise04;

/**
 * Created by sebb on 4/14/16.
 */
public class NaviCon implements NaviConInterface
{
    private GeoLocationManager mgr;
    private static final int MAX_RETRY = 10;
    private int retryCounter = 0;

    @Override
    public void setGeoLocationManager(GeoLocationManager geoManager) {
        mgr = geoManager;
    }

    public NaviCon()
    {

    }

    @Override
    public Point getCurrentPosition() throws InstantiationException, NullPointerException {
        if(mgr == null)
            throw new NullPointerException("NoGeoManager");



        try
        {
            Point e = mgr.currentLocation().moved(1, -1);
            retryCounter = 0;
            return e;
        }
        catch (IllegalAccessException e)
        {
            if(retryCounter++ < MAX_RETRY)
            {
                return this.getCurrentPosition();
            }
            return null;

        }
        /*catch (NullPointerException e)
        {
            throw new NullPointerException("NoGeoManager");
        }*/
    }


}
