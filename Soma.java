public class Soma {
    private Integer numCliente;
    
    public Soma(int numCliente) {
        this.numCliente = numCliente;
    }

    public String fazerSoma(){
        int centenas = 0;
        int restoCentenas = 0;
        int dezenas = 0;
        int restoDezenas = 0; 
        if(numCliente > 99){
            centenas = numCliente / 100;
            restoCentenas = numCliente % 100;
            if(restoCentenas > 9){
                dezenas = restoCentenas / 10;
                restoDezenas = restoCentenas % 10; 
            } else {
               restoDezenas = restoCentenas;
            }
            return "Quantidade de centenas"+ centenas + "Quantidade de dezenas" + dezenas + "Quantidade de unidades" + restoDezenas;
        }
        if(numCliente > 9 && numCliente <= 99){
            dezenas = numCliente / 10;
            restoDezenas = numCliente % 10; 
            return "Quantidade de dezenas" + dezenas + "Quantidade de unidades" + restoDezenas;
        }
        if(numCliente < 10){
            return "Quantidade de unidades" + numCliente;
        }
        return null;
    }
}
