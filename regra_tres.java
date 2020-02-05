
import java.util.Scanner;

public class regra_tres{
	
	public static void main (String []args ) {
		  
		
		Scanner sc = new Scanner(System.in);	 
		System.out.println("bem-vindo ao calculador do menor ângulo entre os ponteiros de um relógio");
		
		//Neste comando, está sendo solicitado ao usuário para que ele insira a hora desejada por meio da classe'scanner'.
		System.out.println("Informe a hora, entre 0 e 12 :");
		int hora = sc.nextInt();
		
		/*Se o valor da variavel 'hora' for igual a 12, ela recebe o valor 0, pois o ângulo dos dois são 
		 equivalentes em um relógio*/
			if(hora ==12) {
				hora = 0;
			}
	
			/*nesta estrutura de condição, está sendo validadas as entradas corretas das horas.
			 ex: em um relógio analógico não existe a hora 13*/
			if (hora <0 || hora >12 ) {
		        System.out.println("Entrada inválida! Reinicie o programa");
		        return ;
		    }
			
		//Neste comando, está sendo solicitado ao usuário para que ele insira os minutos desejados por meio da classe 'scanner'.
		System.out.println("Informe os minutos, entre 0 e 60 : ");
		int minuto = sc.nextInt();
		

			/*nesta estrutura de condição, está sendo validada as entradas corretas dos minutos, para que não 
			  haja a possibilidade de inserção de valores invalidos*/
			if (minuto < 0 ||  minuto > 60) {
		        System.out.println("Entrada inválida! Reinicie o programa");
		        return ;
		    }
		
		/*Neste conjunto de códigos, está sendo realizada uma regra de três, para encontrar o 
		  exato ângulo do ponteiro dos minutos: para isso, a variavel 'soma_minuto' recebe o valor da variavel 'minuto' 
		  multiplicado por 90, e em sequência divide por 15. */	
		float soma_minuto = minuto*90;
		soma_minuto = soma_minuto /15;
		
		/*Neste conjunto de códigos, está sendo realizada uma regra de três, para encontrar o 
		  exato ângulo do ponteiro das horas: para isso, a variavel 'soma_hora' recebe o valor da variavel 'hora' 
		  multiplicado por 90, e em sequência divide por 3. */	
		float soma_hora = hora*90;
		soma_hora = soma_hora/3;
		
		/*Neste conjunto de códigos, está sendo realizada uma regra de três, para encontrar o 
		  exato ângulo em que o ponteiro andou referente ao avanço do ponteiro dos minutos: 
		  para isso, a variavel 'soma_diferenca_hora' recebe o valor da variavel 'minuto' 
		  multiplicado por 30, e em sequência divide por 60. */
		float soma_diferenca_hora = minuto*30; 
		soma_diferenca_hora = soma_diferenca_hora /60;
		
		/*Nesta linha, a variavel 'angulo_hora_final'recebe a soma de 'soma_hora' e 'soma_diferenca_hora', 
		para assim ter exatidão do angulo do ponteiro da hora*/
		float angulo_hora_final = soma_hora + soma_diferenca_hora;
		
		//declaração da variavel 'soma'.
		float soma;
		
		/* este if e else, identifica se o ângulo do ponteiro das horas é maior do que o ponteiro dos minutos,
		para sempre buscar a menor diferença entre os dois ponteiros.*/
		 
		if(soma_minuto > angulo_hora_final) {
		
			soma= soma_minuto - angulo_hora_final;
			
		}else {

			soma = angulo_hora_final- soma_minuto;
		}
		
		/* Os valores finais sendo mostrados par o usuário*/
		System.out.println(" O ângulo do ponteiro da hora é : " + angulo_hora_final );
		System.out.println(" O ângulo do ponteiro dos minutos é : " + soma_minuto );
		System.out.println(" O menos ângulo entre os dois ponteiros é : " + soma );  	
	}		
}