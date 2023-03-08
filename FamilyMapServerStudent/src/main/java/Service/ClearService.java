package Service;

import Request.ClearRequest;
import Result.Result;

/***
 * Service to clear DB of all information
 */
public class ClearService {
    /***
     * Clears the entire DB and leaves it sad and empty.
     */
    public Result clear(ClearRequest request) {
        Result temp = new Result(true);
        // delete everything from the DB
        return temp;
    }
}
