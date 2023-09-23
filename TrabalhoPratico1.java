import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
public class TrabalhoPratico1 {

	public static void main(String[] args) throws IOException {
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	DecimalFormat mt= new DecimalFormat("###,###,###.00 Mts");

	}

	public static void menu () throws IOException{
		char opcao, tiposeguro;

		do{
			opcao=opcoesMenu();

			switch(opcao){
				case 1: tiposeguro= tipodeseguro(); break;
				case 2: break;
				case 3: break;
				case 4: break;
				case 5: break;
				case 6: break;
				case 7:System.out.println("Hasbion Adamgee, estudante do 1o ano do curso de Engenharia Informatica, turma B.  \nLuana Wanga, estudante do 1o ano do curso de Engenharia Informatica, turma B"+
				" \nSuely Buque, estudante do 1o ano do curso de Engenharia Informatica, turma B"); break;
				case 8: System.out.println("Obrigado! Volte sempre. "); break;
			}
		}while (opcao!=8);
	}


	public static char opcoesMenu() throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		char opcao;

		do{
			System.out.println("  Bem vindo/a a Global Aliance Seguros \n***MENU*** \nSelecione uma opcao para prosseguir");
			System.out.println("1)Introduzir dados e visualizar o valor a pagar \n2) Visualizar a quantidade de assegurados feitos por cada tipo de seguro." +
			"\n3) Visualizar o valor total obtido por cada tipo de seguro. \n4) Visualizar o tipo de cobertura mais aderido, inclusive o valor total que arrecadou. \n5) Visualizar o tipo de seguro que menos facturou."+ 
			"\n6) Visualizar o valor total recebido pela Global Aliance Seguros. \n7) Visualizar os dados do programador.\n8) Sair do programa");

			if (opcao!=1&&  opcao!=2 &&  opcao!=3 && opcao!=4 &&  opcao!=5 && opcao!=6 &&  opcao!=7 &&  opcao!=8  )
				System.out.println("Opcao invalida! Tente novamente.");
		}while (opcao!=1&&  opcao!=2 &&  opcao!=3 && opcao!=4 &&  opcao!=5 && opcao!=6 &&  opcao!=7 &&  opcao!=8  );

		return opcao;
	}

	public static char tipodeseguro()throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		char tp;

		do{
			System.out.println("Introduza o tipo de seguro  \n[A]- Seguro Automovel \n[V]- Seguro de vida \n[S]- Seguro de Acidente de Trabalho" );
			tp=Character.toUpperCase(br.readLine().charAt(0));

			if(tp!='A' && tp!='V' && tp!='S')
				System.out.println("Tipo invalido! Por favor,  tente novamente.");
		}while(tp!='A' && tp!='V' && tp!='S');

		return tp;
	}
}
