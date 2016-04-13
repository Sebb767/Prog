package exercise04;

/**
 * Created by sebb on 4/14/16.
 */
public class NaviCon implements NaviConInterface
{
    private GeoLocationManager mgr;

    @Override
    public void setGeoLocationManager(GeoLocationManager geoManager) {
        mgr = geoManager;
    }

    @Override
    public Point getCurrentPosition() throws InstantiationException, NullPointerException {
        if(mgr == null)
            throw new NullPointerException("NoGeoManager");

        try
        {
            return mgr.currentLocation().moved(1, -1);
        }
        catch (IllegalAccessException e)
        {
            return this.getCurrentPosition();
        }
    }
}
