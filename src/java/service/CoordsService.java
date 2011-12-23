
package service;

import java.util.List;
import domain.Coordinates;

public interface CoordsService {
    
    public void addCoords (Coordinates coord);    
    public Coordinates getCoordById (int id);    
    public int getCoordinateCount ();
    public List <Coordinates> getCoords ();
   
}
