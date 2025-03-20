package javaapplication1;

x

    //Metodo para acelerar o objeto Carro
    public void acelerar(){
        velocidade += 10;
        if(velocidade >= 100){
            velocidade = 100;
            System.out.println("Velocidade máxima: " + velocidade + " Km/h");
        } else {
        System.out.println("O carro está acelerando.\n Velocidade atual: " + velocidade + " Km/h");
        }
    }
    
        //Metodo para frear o objeto Carro
    public void frear(){
        velocidade -= 10;
        if(velocidade <= 0){
            velocidade = 0;
        }
        System.out.println("O carro está acelerando.\n Velocidade atual: " + velocidade + " Km/h");
    }

        //Metodo para ligar o Farol do objeto Carro
    public void ligarFarol(){
        System.out.println("Farol ligado!");

    }
    
    public String getModelo() {
        return modelo;
    }    
    
}

