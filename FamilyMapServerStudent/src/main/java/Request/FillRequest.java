package Request;
/***
 * Request class object for filling a users history
 */
public class FillRequest {
    String username;
    int generations;

    public FillRequest(String username, int generations) {
        this.username = username;
        this.generations = generations;
    }

    public String getUsername() {
        return username;
    }

    public int getGenerations() {
        return generations;
    }
}
