package functional;

import exceptions.LimiteDeAmigosException;
import exceptions.SenhaInvalidaException;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<RedeSocial> redesSociais = new HashSet<>();

        Facebook facebook = new Facebook();
        facebook.setSenha("senhaFacebook");
        facebook.setNumAmigos(15000); // Vai gerar LimiteDeAmigosException

        Twitter twitter = new Twitter();
        twitter.setSenha("123"); // Vai gerar SenhaInvalidaException
        twitter.setNumAmigos(8000);

        GooglePlus googlePlus = new GooglePlus();
        googlePlus.setSenha("senhaGooglePlus");
        googlePlus.setNumAmigos(3000);

        redesSociais.add(facebook);
        redesSociais.add(twitter);
        redesSociais.add(googlePlus);

        Usuario usuario = new Usuario(redesSociais);
        usuario.setNome("Ayrton Senna");
        usuario.setEmail("Ayrtonsennatridomundo@gmail.com");

        try {
            for (RedeSocial rede : redesSociais) {
                usuario.adicionarRedeSocial(rede);
            }
        } catch (LimiteDeAmigosException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (SenhaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        usuario.usarRedes();
    }
}
