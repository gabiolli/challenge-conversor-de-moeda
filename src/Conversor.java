import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {

    public double conversor(String moedaDeOrigem, String moedaDeDestino) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/63a42ee708fb14fe31b45233/latest/" + moedaDeOrigem))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
        RespostaTaxaDeCambio taxas = gson.fromJson(response.body(), RespostaTaxaDeCambio.class);
        return taxas.conversion_rates.get(moedaDeDestino);

    }
}
