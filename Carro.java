package AC1;

public class Carro extends Veiculo{
    private double quantPortas;
    private double potencia;
    private String tipoCarro; //tipo do carro (sedan, SUV, hatchback, etc)
    private String tipoCambio; //tipo do câmbio (manual, automático)
    private String tipoCombustivel; //tipo de combustível (gasolina, álcool, flex, etc)
    
    public Carro(String modelo, String placa, String montadora, double valor, String cor, int anoFabricacao,
        double quantPortas, double potencia, String tipoCarro, String tipoCambio, String tipoCombustivel){
        super(modelo, placa, montadora, valor, cor, anoFabricacao);
        this.quantPortas = quantPortas;
        this.potencia = potencia;
        this.tipoCarro = tipoCarro;
        this.tipoCambio = tipoCambio;
        this.tipoCombustivel = tipoCombustivel;        
    }
    public double getQuantPortas(){
        return quantPortas;
    }
    public void setCilindradas(double quantPortas){
        this.quantPortas = quantPortas;
    }
    public double getPotencia(){
        return potencia;
    }
    public void setPesoMoto(double potencia){
        this.potencia = potencia;
    }
    public String getTipoCarro(){
        return tipoCarro;
    }
    public void setTipoCarro(String tipoCarro){
        this.tipoCarro = tipoCarro;
    }
    public String getTipoCambio(){
        return tipoCambio;
    }
    public void setTipoCambio(String tipoCambio){
        this.tipoCambio = tipoCambio;
    }
    public String getTipoCombustivel(){
        return tipoCombustivel;
    }
    public void setTipoCombustivel(String tipoCombustivel){
        this.tipoCombustivel = tipoCombustivel;
    }
    
    public String descricaoCarro() {
        return super.descricao() + 
               ", Quantidade de portas: " + quantPortas + ", " +
               "Potência: " + potencia + "cv, " +
               "Tipo de carro: " + tipoCarro + ", " +
               "Tipo de câmbio: " + tipoCambio + ", " +
               "Tipo de combustível: " + tipoCombustivel;
    }
    
    public String insert() {
        return String.format("INSERT INTO carros (modelo, placa, montadora, valor, cor, ano_fabricacao, quant_portas, potencia, tipo_carro, tipo_cambio, tipo_combustivel) VALUES ('%s', '%s', '%s', %.2f, '%s', %d, %.0f, %.1f, '%s', '%s', '%s');",
                getModelo(), getPlaca(), getMontadora(), getValor(), getCor(), getAnoFabricacao(), getQuantPortas(), getPotencia(), getTipoCarro(), getTipoCambio(), getTipoCombustivel());
    }

}