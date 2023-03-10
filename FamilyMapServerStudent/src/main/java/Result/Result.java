package Result;

/***
 * Primary class for result handling. Includes error messages and success messages.
 */
public class Result {
    boolean success;

    String message;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setMessage(String message) { this.message = message; }

    public Result(boolean success) {
        this.success = success;
    }

    public Result(String message, boolean success) {
        this.message = message;
        this.success = success;
    }

    public boolean getSuccess() {
        return success;
    }
}
