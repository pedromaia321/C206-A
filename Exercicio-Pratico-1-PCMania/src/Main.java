
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        SistemaOperacional linuxUbuntu = new SistemaOperacional("Linux Ubuntu", 32);
        SistemaOperacional windows8 = new SistemaOperacional("Windows 8", 64);
        SistemaOperacional windows10 = new SistemaOperacional("Windows 10", 64);


        HardwareBasico corei3 = new HardwareBasico("Pentium Core i3", 2200);
        HardwareBasico corei5 = new HardwareBasico("Pentium Core i5", 3370);
        HardwareBasico corei7 = new HardwareBasico("Pentium Core i7", 4500);


        MemoriaUSB penDrive16gb = new MemoriaUSB("Pen-drive", 16);
        MemoriaUSB penDrive32gb = new MemoriaUSB("Pen-drive", 32);
        MemoriaUSB hdExterno1tb = new MemoriaUSB("HD Externo", 1000);


        Computador positivo = new Computador("Positivo", 3300);
        positivo.addHardwareBasico(corei3);
        positivo.setSistemaOperacional(linuxUbuntu);
        positivo.setMemoriaUSB(penDrive16gb);

        Computador acer = new Computador("Acer", 8800);
        acer.addHardwareBasico(corei5);
        acer.setSistemaOperacional(windows8);
        acer.setMemoriaUSB(penDrive32gb);

        Computador vaio = new Computador("Vaio", 4800);
        vaio.addHardwareBasico(corei7);
        vaio.setSistemaOperacional(windows10);
        vaio.setMemoriaUSB(hdExterno1tb);


        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente("Exemplo", 462836838);

        while (true) {
            System.out.println("Digite o código da promoção do computador que deseja comprar 1, 2 e 3. Use 0 para sair:");
            int codigo = scanner.nextInt();
            if (codigo == 0) {
                break;
            } else if (codigo == 1) {
                cliente.addCompra(positivo);
            } else if (codigo == 2) {
                cliente.addCompra(acer);
            } else if (codigo == 3) {
                cliente.addCompra(vaio);
            } else {
                System.out.println("Código inválido!");
            }
        }


        cliente.mostrarRecibo();
    }
}
