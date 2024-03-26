import java.util.Scanner;


public class Principal {
    

    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in); 
        int continuar1, continuar2, calculo3 = 0, calculo4 = 0, resultadoInteiro = 0;
        double porcentagem = 0, resultadoPorcentagem = 0, calculo1, calculo2, resultadoParcial = 0, resultadoFinal = 0;
        String operador;

        System.out.println();
        System.out.println("Bem vindo a calculadora Back end!!!");
        System.out.println("A operação vai usar porcentagem? [1]- Sim / [2] Não?");
        continuar1 = dados.nextInt();

        if (continuar1 == 1) {
            System.out.println("Digite o primeiro numero:");        
            calculo1 = dados.nextDouble();
            System.out.println("Digite o segundo numero em porcentagem:");
            calculo2 = dados.nextDouble();
            porcentagem = calculo2 / 100;
            resultadoPorcentagem = calculo1 * porcentagem;
            System.out.println("Resultado Final: "+ resultadoPorcentagem);
            System.out.println("ENCERRADO!");
        } else {
            System.out.println("Digite o primeiro numero:");
            calculo3 = dados.nextInt();
            System.out.println("Digite o operador:");
            operador = dados.next();
            System.out.println("Digite o segundo numero:");
            calculo4 = dados.nextInt(); 
            
            if(operador.equals("+")) {
                resultadoFinal = calculo3 + calculo4;
            }else if(operador.equals("-")){
                resultadoFinal = calculo3 - calculo4;
            }else if(operador.equals("*")){
                resultadoFinal = calculo3 * calculo4; 
            }else if(operador.equals("/")){
                resultadoFinal = (double) calculo3 / calculo4;
            }    
        
            System.out.println("Resultado Final: "+ resultadoFinal);
            System.out.println("Deseja continuar [1]- Sim / [2] Não?");
            continuar2 = dados.nextInt();
                
            if (continuar2 == 1) {
                do {
                    resultadoParcial = resultadoFinal;
        
                    System.out.println("Digite o operador:");
                    operador = dados.next();
                    System.out.println("Digite o segundo numero:");
                    calculo4 = dados.nextInt(); 
                        
                    if(operador.equals("+")) {
                        resultadoFinal = resultadoParcial + calculo4;
                    }else if(operador.equals("-")){
                        resultadoFinal = resultadoParcial - calculo4;
                    }else if(operador.equals("*")){
                        resultadoFinal = resultadoParcial * calculo4; 
                    }else if(operador.equals("/")){
                        resultadoFinal = resultadoParcial / calculo4;
                    }
                        System.out.println("Resultado Final: "+ resultadoFinal);
                        System.out.println("Deseja continuar [1]- Sim / [2] Não?");
                        continuar2 = dados.nextInt();    
                } while(continuar2 == 1);
                System.out.println("Resultado Final: "+ resultadoFinal);
                System.out.println("ENCERRADO!");
                } else {
                    System.out.println("Resultado Final: "+ resultadoFinal);
                    System.out.println("ENCERRADO!");
                }
            }
    } 
} 
