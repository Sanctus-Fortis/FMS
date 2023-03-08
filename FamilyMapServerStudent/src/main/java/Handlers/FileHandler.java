package Handlers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.file.Files;

public class FileHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {

        // Check if GET
        if (exchange.getRequestMethod().equalsIgnoreCase("get")) {
            String urlPath = exchange.getRequestURI().toString();
            if (urlPath.equals("/")) {
                urlPath = "/index.html";
            }
            String filePath = "web" + urlPath;
            File file = new File(filePath);
            if (file.exists()) {
                exchange.sendResponseHeaders(HttpURLConnection.HTTP_OK, 0);
                OutputStream respBody = exchange.getResponseBody();
                Files.copy(file.toPath(), respBody);
            }
            else {
                filePath = "web/HTML/404.html";
                File badFile = new File(filePath);
                exchange.sendResponseHeaders(HttpURLConnection.HTTP_NOT_FOUND, 0);
                OutputStream respBody = exchange.getResponseBody();
                Files.copy(badFile.toPath(), respBody);
            }
            exchange.getResponseBody().close();
        }
        else {
            // Something bad.
        }

    }
}
