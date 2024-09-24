package AC1;

public class Principal {
    public static void main(String[] args) {
    	

        Moto moto = new Moto(" Yamaha MT-03", " ABC1D23", " Yamaha", 28500.0, " Preto", 2022, 
        " 321cc", 169.0, " 9C6RN3510K001234", " Dianteira telescópica"); //Placa válida

        Moto moto2 = new Moto(" Yamaha MT-03", " AB12D34", " Yamaha", 28500.0, " Preto", 2022, 
        " 321cc", 169.0, " 9C6RN3510K001234", " Dianteira telescópica"); //Teste de placa inválida

        Carro carro = new Carro(" Gol", " EFG4H56", " Volkswagen", 40000.0, " Branco", 2021, 
        4, 84.0, " hatchback", " Manual", " Flex"); //Placa válida

        Carro carro2 = new Carro(" Gol", " EF34H56", " Volkswagen", 40000.0, " Branco", 2021, 
        4, 84.0, " hatchback", " Manual", " Flex"); //Teste de placa inválida

        Caminhao caminhao = new Caminhao(" Volvo FH 540", " IJK7L89", " Volvo", 600000.0, " Vermelho", 
        2022, 3, " 30 toneladas", " 4,4 metros", " Cabine alta", " Caminhão baú"); //Placa válida

        Caminhao caminhao2 = new Caminhao(" Volvo FH 540", " IJ67L89", " Volvo", 600000.0, " Vermelho", 
        2022, 3, " 30 toneladas", " 4,4 metros", " Cabine alta", " Caminhão baú"); // Teste de placa inválida
        
    System.out.println(moto.descricaoMoto()); 
    	System.out.println("");
    System.out.println(moto2.descricaoMoto()); 
    	System.out.println("");

    System.out.println(carro.descricaoCarro());
    	System.out.println("");
    System.out.println(carro2.descricaoCarro());
    	System.out.println("");
        
    System.out.println(caminhao.descricaoCaminhao()); 
    	System.out.println("");
    System.out.println(caminhao2.descricaoCaminhao()); 
    	System.out.println("");
    	
    System.out.println("Modelo Insert: ");
	    System.out.println(moto.insert());
	    System.out.println(carro.insert());
	    System.out.println(caminhao.insert());
    
    }
}
