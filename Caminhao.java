package AC1;

public class Caminhao extends Veiculo {
    private double quantEixos;
    private String cargaMaxima;
    private String alturaCarga;  //altura máxima da carga
    private String tipoCabine;   //tipo da cabine (simples, dupla, alta, etc)
    private String tipoCaminhao;  //tipo do caminhão (baú, tanque, truck, etc)
     
    public Caminhao(String modelo, String placa, String montadora, double valor, String cor, int anoFabricacao,
    double quantEixos, String cargaMaxima, String alturaCarga, String tipoCabine, String tipoCaminhao){
    super(modelo, placa, montadora, valor, cor, anoFabricacao);
    this.quantEixos = quantEixos;
    this.cargaMaxima = cargaMaxima;
    this.alturaCarga = alturaCarga;
    this.tipoCabine = tipoCabine;
    this.tipoCaminhao = tipoCaminhao;        
}
public double getQuantEixos(){
    return quantEixos;
}
public void setQuantEixos(double quantEixos){
    this.quantEixos = quantEixos;
}
public String getCargaMaxima(){
    return cargaMaxima;
}
public void setCargaMaxima(String cargaMaxima){
    this.cargaMaxima = cargaMaxima;
}
public String getAlturaCarga(){
    return alturaCarga;
}
public void setAlturaCarga(String alturaCarga){
    this.alturaCarga = alturaCarga;
}
public String getTipoCabine(){
    return tipoCabine;
}
public void setTipoCabine(String tipoCabine){
    this.tipoCabine = tipoCabine;
}
public String getTipoCaminhao(){
    return tipoCaminhao;
}
public void setTipoCaminhao(String tipoCaminhao){
    this.tipoCaminhao = tipoCaminhao;
}

public String descricaoCaminhao() {
    return super.descricao() + 
               ", Carga máxima: " + cargaMaxima + ", " +
               "Altura máxima da carga: " + alturaCarga + ", " +
               "Tipo de cabine: " + tipoCabine + ", " +
               "Tipo de caminhão: " + tipoCaminhao;
}

public String insert() {
    return String.format("INSERT INTO caminhões (modelo, placa, montadora, valor, cor, ano_fabricacao, quant_eixos, carga_maxima, altura_carga, tipo_cabine, tipo_caminhao) VALUES ('%s', '%s', '%s', %.2f, '%s', %d, %.0f, '%s', '%s', '%s', '%s');",
            getModelo(), getPlaca(), getMontadora(), getValor(), getCor(), getAnoFabricacao(), getQuantEixos(), getCargaMaxima(), getAlturaCarga(), getTipoCabine(), getTipoCaminhao());
}


}