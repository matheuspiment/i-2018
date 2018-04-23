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

      reader = getConnectionBuferredReader(connection);

      String result = stringfy(reader);

      JsonObject gitUserJSON = getAsJsonObject(result);

      String avatarURL = getValueByKey(gitUserJSON, "avatar_url");
      String userName = getValueByKey(gitUserJSON, "login");

      System.out.println("URL do avatar " + avatarURL);

      InputStream in = getAvatarInputStream(avatarURL);
      Files.copy(in, Paths.get(userName+ ".jpg"));

      System.out.println("Imagem salva no diretório arquivos com o nome " + userName + ".jpg");

    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      reader.close();
    }
  }

  public static BufferedReader getConnectionBuferredReader(HttpURLConnection connection) throws IOException {
      return new BufferedReader(new InputStreamReader(connection.getInputStream()));
  }

  public static String stringfy(BufferedReader reader) throws IOException {
    StringBuilder stringBuilder = new StringBuilder();
    String line = null;
    while ((line = reader.readLine()) != null) {
        stringBuilder.append(line + "\n");
    }

    return stringBuilder.toString();
  }

  public static JsonObject getAsJsonObject(String jsonAsString) {
      JsonParser parser = new JsonParser();
      return parser.parse(jsonAsString).getAsJsonObject();
  }

  public static String getValueByKey(JsonObject parsedJsonObject, String key) {
      return parsedJsonObject.get(key).toString().replaceAll("\"", "");
  }

  public static InputStream getAvatarInputStream(String avatarURL) throws IOException {
    return new URL(avatarURL).openStream();
  }

}