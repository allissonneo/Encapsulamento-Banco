class Conta {
    private String titular;
    // private int numero;
    private double saldo;
    private double limite; // adicionando um limite a conta
    private static int totaldeContas;

    Conta() {
        Conta.totaldeContas = Conta.totaldeContas + 1;
    }

    public static int getTotalDeContas() {
        return Conta.totaldeContas;
    }

    // construtor
    // Conta(String titular) {
    //     this.titular = titular;
    //     // faz mais uma série de inicializações e configurações
    // }
    
    Conta(String titular, Double saldo, Double limite) {
        this.titular = titular; // chama o construtor que foi declarado acima
        this.saldo = saldo;
        this.limite = limite;
    }

    public double getSaldo() {
        return this.saldo + this.limite;
    }

    // deposita() saca() e transfere() omitidos
    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

}
