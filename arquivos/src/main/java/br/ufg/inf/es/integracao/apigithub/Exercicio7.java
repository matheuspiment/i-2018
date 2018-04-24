package br.ufg.inf.es.integracao.apigithub;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by aluno on 16/04/18.
 */
public class Exercicio7 {
  public static void main(String[] args) throws IOException {
    String myUrl = args[0];
    new Exercicio7().getImageFromGitHubUserURL(myUrl);
  }

    public void getImageFromGitHubUserURL(String myUrl) {
        try {

          // Obtém URL do JSON
            InputStream jsonIS = getInputStream(myUrl);

          // Obtém o JSON
          byte[] jsonByte = getByteArrayFromInputStream(jsonIS);
          String json = new String(jsonByte, StandardCharsets.UTF_8);

          // Extrai informações do JSON
          JsonObject gitUserJSON = getAsJsonObject(json);

          String avatarURL = getValueByKey(gitUserJSON, "avatar_url");
          String userName = getValueByKey(gitUserJSON, "login");

          InputStream in = getAvatarInputStream(avatarURL);

          // Grava arquivo
            gravaArquivo(userName, in);

        } catch (Exception e) {
          e.printStackTrace();
        }
    }

    public InputStream getInputStream(String myUrl) throws IOException {
        URL url = new URL(myUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");
        connection.setReadTimeout(15*1000);
        connection.connect();

        return connection.getInputStream();
    }

    public void gravaArquivo(String userName, InputStream in) throws IOException {
        Files.copy(in, Paths.get(userName+ ".jpg"));
    }

    public static byte[] getByteArrayFromInputStream(InputStream is) {
      ByteArrayOutputStream buffer = new ByteArrayOutputStream();

      int nRead;
      byte[] data = new byte[16384];

      try {

          while ((nRead = is.read(data, 0, data.length)) != -1) {
              buffer.write(data, 0, nRead);
          }

          buffer.flush();

      } catch (Exception e) {
          return null;
      }
      return buffer.toByteArray();
  }

  public static JsonObject getAsJsonObject(String jsonAsString) {
      JsonParser parser = new JsonParser();
      return parser.parse(jsonAsString).getAsJsonObject();
  }

  public static String getValueByKey(JsonObject parsedJsonObject, String key) {
      return parsedJsonObject.get(key).toString().replaceAll("\"", "");
  }

  public InputStream getAvatarInputStream(String avatarURL) throws IOException {
    return new URL(avatarURL).openStream();
  }

}