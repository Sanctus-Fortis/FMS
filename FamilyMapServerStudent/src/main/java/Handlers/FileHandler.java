package Handlers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;

public class FileHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        // Check if GET
        // Parse URL path (looking for "/"
        // turn "/" into web/index.html

        // Files.copy(file.toPath(), respBody);

    }
}
