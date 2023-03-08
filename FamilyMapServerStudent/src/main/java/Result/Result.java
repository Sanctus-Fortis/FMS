package Result;

/***
 * Primary class for result handling. Includes error messages and success messages.
 */
public class Result {
    boolean success;
    String message;

    public Result(boolean success) {
        this.success = success;
    }
}
