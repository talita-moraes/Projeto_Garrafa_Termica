package projeto.garrafa.térmica;

import java.util.ArrayList;

public class GarrafaTermica {
    
    //Cilindro Maior
    private double maiorDiametro = 10;
    private double maiorAltura = 30;
    
    //Cilindro Menor
    private double menorDiametro = 9.6 ;
    private double menorAltura = 14;
    
    private final double expessura = 0.1/100;
    private final double temperaturaFinal = 25;
    private double temperaturaInicial;
    
    //Constantes
    private double kvidro = 0.8;
    private double elaminado = 0.6;
    private double kliquido;
    
    
    public GarrafaTermica(){}

    public GarrafaTermica(String aM, String am, String dM, String dm, String liquido, double temp) {
        this.maiorAltura = Double.parseDouble(aM);
        this.maiorDiametro = Double.parseDouble(dM);
        this.menorDiametro = Double.parseDouble(dm);
        this.menorAltura = Double.parseDouble(am);
        this.temperaturaInicial = temp;
        this.kliquido = valorLiquido(liquido);
    }

    public GarrafaTermica(String liquido, double temp) {
        this.temperaturaInicial = temp;
        this.kliquido = valorLiquido(liquido);
    }

    public double valorLiquido(String tipoliquido){
        if(tipoliquido.equals("Agua")){
            return 0.6;
        }else if(tipoliquido.equals("Gelo")){
            return 2;
        }else if(tipoliquido.equals("Alcool")){
            return 0.2;
        }else{
            return 0;
        }
    }
    
    public double calcularConducao(){
        double resultadoConducao = Math.log((maiorDiametro/2)/(menorDiametro/2)/2*3.14*kvidro*expessura);
        return resultadoConducao;
    }
    
    public double calcularConveccao(){
        double resultadoConveccao = 1/3.14*(menorDiametro/2)*kliquido*expessura;
        return resultadoConveccao;
    }
    
    public double calcularRadiacao(){
        double resultadoRadiacao = 1/(2*3.14*elaminado);
        
        return resultadoRadiacao;
    }
    
    public double perdacalor(double somatorioR){
        double q = (temperaturaInicial - temperaturaFinal)/(somatorioR);
        return q;
    }
    
    
}
