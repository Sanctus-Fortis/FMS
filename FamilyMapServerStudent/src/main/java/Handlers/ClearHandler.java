package Handlers;
import Service.ClearService;
import Result.Result;
import java.io.*;
import java.net.*;

import com.google.gson.Gson;
import com.sun.net.httpserver.*;

public class ClearHandler extends DaddyHandler implements HttpHandler {

    public void handle(HttpExchange exchange) throws IOException {
        boolean success = false;
        try {
            if (exchange.getRequestMethod().toLowerCase().equals("post")) {
                ClearService serve = new ClearService();

                // Get the request body input stream
                InputStream reqBody = exchange.getRequestBody();

                // Read JSON string from the input stream
                String reqData = readString(reqBody);

                // Display/log the request JSON data
                System.out.println(reqData);
                Gson gson = new Gson();

				Result result = serve.clear();

                // Start sending the HTTP response to the client, starting with
                // the status code and any defined headers.
                exchange.sendResponseHeaders(HttpURLConnection.HTTP_OK, 0);
                Writer response = new OutputStreamWriter(exchange.getResponseBody());
                gson.toJson(result, response);
                response.close();
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

// login, register, fill, load, person, event and clear will all inherit from this

