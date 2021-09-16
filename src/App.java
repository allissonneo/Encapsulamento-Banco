import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String nome = JOptionPane.showInputDialog("Digite o nome do Titular: ");
        Double deposito = Double.parseDouble(JOptionPane.showInputDialog("Para ativar a conta é necessário fazer um depósito\nQuanto deseja Depositar?: "));
        Double limite = Double.parseDouble(JOptionPane.showInputDialog("Quanto deseja de limite? "));
        
        Conta c = new Conta(nome, deposito, limite);
        String titular = c.getTitular();
        Double saldo = c.getSaldo();
        JOptionPane.showMessageDialog(null, "Conta criada com sucesso");
        JOptionPane.showMessageDialog(null, titular);
        JOptionPane.showMessageDialog(null, saldo);
        // Conta conta = new Conta();
        
        System.out.println("Nome do titular: "+titular + "\nLimite: "+saldo);
    }
}
