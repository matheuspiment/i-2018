package br.ufg.inf.es.integracao.apigithub;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by aluno on 16/04/18.
 */
public class Exercicio7 {
    public static void main(String[] args) throws IOException {
        String myUrl = args[0];

        BufferedReader reader = null;

        try {

            URL url = new URL(myUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setReadTimeout(15*1000);
            connection.connect();

            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder stringBuilder = new StringBuilder();

            String line = null;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line + "\n");
            }

            String result = stringBuilder.toString();

            JsonParser parser = new JsonParser();
            JsonObject gitUserJSON = parser.parse(result).getAsJsonObject();
            String avatarURL = gitUserJSON.get("avatar_url").toString().replaceAll("\"", "");
            String userName = gitUserJSON.get("login").toString().replaceAll("\"", "");

            System.out.println("URL do avatar " + avatarURL);

            InputStream in = new URL(avatarURL).openStream();
            Files.copy(in, Paths.get(userName+ ".jpg"));

            System.out.println("Imagem salva no diretório arquivos com o nome " + userName + ".jpg");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }
    }
}
