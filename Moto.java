package AC1;

public class Moto extends Veiculo {
    private String cilindradas;
    private double pesoMoto;  // peso da moto em kg
    private String chassi;  // código do chassi da moto
    private String suspensao;  // tipo de suspensão


    public Moto(String modelo, String placa, String montadora, double valor, String cor, int anoFabricacao,
        String cilindradas, double pesoMoto, String chassi, String suspensao){
        super(modelo, placa, montadora, valor, cor, anoFabricacao);
        this.cilindradas = cilindradas;
        this.pesoMoto = pesoMoto;
        this.chassi = chassi;
        this.suspensao = suspensao;        
    }
    public String getCilindradas(){
        return cilindradas;
    }
    public void setCilindradas(String cilindradas){
        this.cilindradas = cilindradas;
    }
    public double getPesoMoto(){
        return pesoMoto;
    }
    public void setPesoMoto(double pesoMoto){
        this.pesoMoto = pesoMoto;
    }
    public String getChassi(){
        return chassi;
    }
    public void setChassi(String chassi){
        this.chassi = chassi;
    }
    public String getSuspensao(){
        return suspensao;
    }
    public void setSuspensao(String suspensao){
        this.suspensao = suspensao;
    }
    public String descricaoMoto() {
        return super.descricao() +
               ", Cilindradas: " + cilindradas + ", " +
               "Peso da moto: " + pesoMoto + "kg, " +
               "Chassi: " + chassi + ", " +
               "Suspensão: " + suspensao;
    }

    public String insert() {
        return String.format("INSERT INTO motos (modelo, placa, montadora, valor, cor, ano_fabricacao, cilindradas, peso, chassi, suspensao) VALUES ('%s', '%s', '%s', %.2f, '%s', %d, '%s', %.2f, '%s', '%s');",
                getModelo(), getPlaca(), getMontadora(), getValor(), getCor(), getAnoFabricacao(), getCilindradas(), getPesoMoto(), getChassi(), getSuspensao());
    }

    
}