public class BankAccount{
  String Nome;
  double Saldo;
  int Idade;

  //Constructor
  public BankAccount(String Nome, double Saldo, int Idade) {
    this.Nome = Nome;
    this.Saldo = Saldo;
    this.Idade = Idade;
  }
  //Getters and Setters
  public String getNome() {
    return Nome;
  }

  public void setNome(String Nome) {
    this.Nome = Nome;
  }

  public double getSaldo() {
    return Saldo;
  }
  
  public void setSaldo(double Saldo) {
    this.Saldo = Saldo;
  }

  public int getIdade() {
    return Idade;
  }

  public void setIdade(int Idade) {
    this.Idade = Idade;
  }

  public static void main(String[] args) {
    //Objects
    BankAccount conta1 = new BankAccount("nome1", 101.0, 23);
    BankAccount conta2 = new BankAccount("nome2", 10.1, 24);
    BankAccount conta3 = new BankAccount("nome3", 10101.1, 25);
    
  }
}
