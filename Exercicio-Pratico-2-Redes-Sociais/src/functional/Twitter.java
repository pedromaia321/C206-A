package functional;

public class Twitter extends RedeSocial implements Compartilhamento {
    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Twitter!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no Twitter!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentario no Twitter!");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou algo no Twitter!");
    }
}
