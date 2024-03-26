import java.util.ArrayList;
import java.util.List;

public class Computador {
   String marca;
     float preco;
     List<HardwareBasico> hardwareBasicos = new ArrayList<>();
     SistemaOperacional sistemaOperacional;
     MemoriaUSB memoriaUSB;

    public Computador(String marca, float preco) {
        this.marca = marca;
        this.preco = preco;
    }

    public void addHardwareBasico(HardwareBasico hardwareBasico) {
        hardwareBasicos.add(hardwareBasico);
    }

    public void setSistemaOperacional(SistemaOperacional sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public void setMemoriaUSB(MemoriaUSB memoriaUSB) {
        this.memoriaUSB = memoriaUSB;
    }

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);
        System.out.println("Configurações:");
        for (HardwareBasico hardwareBasico : hardwareBasicos) {
            System.out.println("- " + hardwareBasico.getNome() + ": " + hardwareBasico.getCapacidade());
        }
        System.out.println("Sistema Operacional: " + sistemaOperacional.getNome() + " (" + sistemaOperacional.getTipo() + " bits)");
        if (memoriaUSB != null) {
            System.out.println("Acompanha Pen-drive de " + memoriaUSB.getCapacidade() + "Gb");
        }
        System.out.println();
    }

    public String getMarca() {
        return marca;
    }

    public float getPreco() {
        return preco;
    }
}


