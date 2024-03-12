import java.util.Scanner;

public class Principal {
 
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in); 
        double porcentagem = 0, resultadoFinal = 0, resultadoParcial = 0, resultado = 0, continuar, calculo1, calculo2;
        String operador;
        System.out.println();
        System.out.println("Bem vindo a calculadora Back end!!!");
        System.out.println("A operação vai usar porcentagem? [1]- Sim / [2] Não?");
        continuar = dados.nextInt();
        if (continuar == 1) {
            System.out.println("Digite o primeiro numero:");        
            calculo1 = dados.nextDouble();
            System.out.println("Digite o segundo numero em porcentagem:");
            calculo2 = dados.nextDouble();


            porcentagem = calculo2 / 100;
            resultado = calculo1 * porcentagem;
            System.out.println("Resultado Final: "+ resultado);
            System.out.println("ENCERRADO!");
        } else {
            System.out.println("Digite o primeiro numero:");
            calculo1 = dados.nextDouble();
            System.out.println("Digite o operador:");
            operador = dados.next();
            System.out.println("Digite o segundo numero:");
            calculo2 = dados.nextDouble(); 
            
            if(operador.equals("+")) {
                resultado = calculo1 + calculo2;
            }else if(operador.equals("-")){
                resultado = calculo1 - calculo2;
            }else if(operador.equals("*")){
                resultado = calculo1 * calculo2; 
            }else if(operador.equals("/")){
                resultado = calculo1 / calculo2;
            }    
        
            System.out.println("Resultado Final: "+ resultado);
            System.out.println("Deseja continuar [1]- Sim / [2] Não?");
            continuar = dados.nextInt();
                
            if (continuar == 1) {
                do {
                    resultadoParcial = resultado;
        
                    System.out.println("Digite o operador:");

                    operador = dados.next();
                    System.out.println("Digite o segundo numero:");
                    calculo2 = dados.nextDouble(); 
                        
                    if(operador.equals("+")) {
                            resultado = resultadoParcial + calculo2;
                        }else if(operador.equals("-")){
                            resultado = resultadoParcial - calculo2;
                        }else if(operador.equals("*")){
                            resultado = resultadoParcial * calculo2; 
                        }else if(operador.equals("/")){
                            resultado = resultadoParcial / calculo2;
                        }
                        System.out.println("Resultado Final: "+ resultado);
                        System.out.println("Deseja continuar [1]- Sim / [2] Não?");
                        continuar = dados.nextInt();    
                } while(continuar == 1);
                System.out.println("Resultado Final: "+ resultado);
                System.out.println("ENCERRADO!");
                } else {
                    System.out.println("Resultado Final: "+ resultado);
                    System.out.println("ENCERRADO!");
                }
            }
    } 
} 
