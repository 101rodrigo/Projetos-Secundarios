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
}
