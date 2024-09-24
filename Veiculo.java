package AC1;

public class Veiculo {

    private String modelo;
    private String placa;
    private String montadora;
    private double valor;
    private String cor;
    private int anoFabricacao;

    public Veiculo(String modelo, String placa, String montadora, double valor, String cor, int anoFabricacao){
        this.modelo = modelo;
        this.placa = placa;
        this.montadora = montadora;
        this.valor = valor;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    } 
    public String getPlaca(){
        return placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public String getMontadora(){
        return montadora;
    }
    public void setMontadora(String montadora){
        this.montadora = montadora;
    }
    public double getValor(){
        return valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public int getAnoFabricacao(){
        return anoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao){
        this.anoFabricacao = anoFabricacao;
    }

    public boolean validarPlaca() {
        if (placa != null && placa.trim().matches("^[A-Z]{3}[0-9]{1}[A-Z]{1}[0-9]{2}$")) {
            return true;
        } else {
            return false;}
        }
    public String descricao() {
        return "Modelo: " + modelo + ", Placa: " + placa + ", Montadora:" + montadora +
        ", Valor: " + valor + ", Cor: " + cor + ", Ano de fabricação: " + anoFabricacao +
        ", Validação: " + (validarPlaca() ? " Placa válida" : " Placa inválida");
    }
}