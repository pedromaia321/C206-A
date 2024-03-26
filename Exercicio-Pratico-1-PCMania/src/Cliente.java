import java.util.ArrayList;
import java.util.List;

public class Cliente {
     String nome;
     long cpf;
     List<Computador> compras = new ArrayList<>();

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void addCompra(Computador computador) {
        compras.add(computador);
    }

    public float calculaTotalCompra() {
        float total = 0;
        for (Computador computador : compras) {
            total += computador.getPreco();
        }
        return total;
    }

    public void mostrarRecibo() {
        System.out.println("Cliente: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Compras:");
        for (Computador computador : compras) {
            computador.mostraPCConfigs();
        }
        System.out.println("Total da compra: R$" + calculaTotalCompra());
    }
}
