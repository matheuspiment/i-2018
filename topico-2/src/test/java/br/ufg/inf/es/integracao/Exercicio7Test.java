package br.ufg.inf.es.integracao;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

/**
 * Created by aluno on 23/04/18.
 */
public class Exercicio7Test {

    @Test
    public void test() throws Exception {
        MeuExercicio7 exercicio7 = new MeuExercicio7();
        exercicio7.getImageFromGitHubUserURL("https://api.github.com/users/matheuspiment");
    }

}

class MeuExercicio7 extends Exercicio7 {
    public InputStream getInputStream(String url) {
        String json = "{'avatar_url': 'x', 'login': 'matheuspiment'}";
        return new ByteArrayInputStream(json.getBytes(StandardCharsets.UTF_8));
    }

    public InputStream getAvatarInputStream(String avatarURL) {
        String string = "matheuspiment";
        return new ByteArrayInputStream( string.getBytes() );

    }

    public void gravaArquivo(String userName, InputStream in) throws IOException {
        assertNotNull(in);
        assertEquals("matheuspiment", userName);
    }
}