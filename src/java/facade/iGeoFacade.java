
package facade;

import service.CoordsService;
import service.SquareCalcService;

public interface iGeoFacade {
    
    public SquareCalcService getSquareCalcService();       
    public CoordsService getCoordsService();

}
