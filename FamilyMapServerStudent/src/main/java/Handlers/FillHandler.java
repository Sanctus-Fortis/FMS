package Handlers;

import Request.FillRequest;
import Result.Result;
import Service.ClearService;
import Service.FillService;
import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.HttpURLConnection;

public class FillHandler extends DaddyHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        boolean success = false;
        try {
            if (exchange.getRequestMethod().toLowerCase().equals("post")) {
                String urlPath = exchange.getRequestURI().toString();
                String[] delimitedURL=urlPath.split("/");
                String username = "";
                int generations = 4;
                if (!delimitedURL[1].isEmpty()) {
                    // Prepare username for service
                    username = delimitedURL[1];
                }
                if (delimitedURL.length >= 3) {
                    // Prepare number of generations for service
                    generations = Integer.parseInt(delimitedURL[2]);
                }

                FillService serve = new FillService();

                FillRequest request = new FillRequest(username, generations);

                ClearService preClear = new ClearService();
                preClear.clear();
                Result result = serve.Fill(request);

                Gson gson = new Gson();
                exchange.sendResponseHeaders(HttpURLConnection.HTTP_OK, 0);
                Writer response = new OutputStreamWriter(exchange.getResponseBody());
                gson.toJson(result, response);
                response.close();

                // Start sending the HTTP response to the client, starting with
                // the status code and any defined headers.
                exchange.sendResponseHeaders(HttpURLConnection.HTTP_OK, 0);
                // We are not sending a response body, so close the response body
                // output stream, indicating that the response is complete.
                exchange.getResponseBody().close();
                success = true;

            }
            if (!success) {
                // The HTTP request was invalid somehow, so we return a "bad request"
                // status code to the client.
                exchange.sendResponseHeaders(HttpURLConnection.HTTP_BAD_REQUEST, 0);

                // We are not sending a response body, so close the response body
                // output stream, indicating that the response is complete.
                exchange.getResponseBody().close();
            }
        } catch (IOException e) {
            // Some kind of internal error has occurred inside the server (not the
            // client's fault), so we return an "internal server error" status code
            // to the client.
            exchange.sendResponseHeaders(HttpURLConnection.HTTP_SERVER_ERROR, 0);

            // We are not sending a response body, so close the response body
            // output stream, indicating that the response is complete.
            exchange.getResponseBody().close();

            // Display/log the stack trace
            e.printStackTrace();
        }
    }
}
