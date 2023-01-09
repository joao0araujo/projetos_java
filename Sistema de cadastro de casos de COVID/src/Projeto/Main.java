package Projeto;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Codigo que recebe valores de casos por municipios que macroregioes e organiza a quantidade de casos por macroregiao,
		   ao fim tem-se a possibilidade de buscar por municipio, sendo nome ou cep, os numeros de casos de cada um. Ou pesquisar por
		   macroregiao, utilizando o nome da mesma, e receber os numeros de casos por macroregiao*/
		
		
		JOptionPane.showMessageDialog(null, "Sistema de Saude do Estado");
		
		int mr = 0;
		
		boolean x = true;
		
		do {//O usuario tem que cadastrar no minimo um municipio
			mr = Integer.parseInt(JOptionPane.showInputDialog("Quantos municipios contem o sistema ?"));
			
			if (mr < 1) {
				JOptionPane.showMessageDialog(null, "Voce precisa cadastrar um municipio", "Erro", JOptionPane.ERROR_MESSAGE);
			} else {
				x = false;
			}
			
			
		} while (x);

		Municipio m1[] = new Municipio[mr]; // Vetor de cidades

		Macroregiao macro[] = new Macroregiao[9];// Vetor de macroregiao

		//instanciando os objetos dentro do vetor de objetos
		
		macro[0] = new Macroregiao();
		macro[1] = new Macroregiao();
		macro[2] = new Macroregiao();
		macro[3] = new Macroregiao();
		macro[4] = new Macroregiao();
		macro[5] = new Macroregiao();
		macro[6] = new Macroregiao();
		macro[7] = new Macroregiao();
		macro[8] = new Macroregiao();

		//Atribuindo os nomes das macroregioes por posicao
		
		macro[0].atualizaMacroregiao("norte");
		macro[1].atualizaMacroregiao("nordeste");
		macro[2].atualizaMacroregiao("centro norte");
		macro[3].atualizaMacroregiao("centro leste");
		macro[4].atualizaMacroregiao("leste");
		macro[5].atualizaMacroregiao("extremo sul");
		macro[6].atualizaMacroregiao("oeste");
		macro[7].atualizaMacroregiao("sudeste");
		macro[8].atualizaMacroregiao("sul");

		JOptionPane.showMessageDialog(null, "Ola usuario");

		JOptionPane.showMessageDialog(null, "Cadastre um municipio");
		
		int cont = 0;

		for (int i = 0; i < m1.length; i++) {

			m1[i] = new Municipio(); //instanciando os municipios por posicao

			int q = i + 1;
			
			boolean gr = true;//boolean gr para o while que verifica se digitou algo
			
			String nome = JOptionPane.showInputDialog("Nome do municipio " + q); 
			
			cont++;//contador para expecificar as posicoes no
			
			String cep = JOptionPane.showInputDialog("CEP do municipio " + q);
			
			do{//Verificando se o usuario digitou algo no nome e cep

			  if (nome.trim().equals("") || cep.trim().equals("")) {
				JOptionPane.showMessageDialog(null, "Digite nome e CEP validos", "Erro", JOptionPane.ERROR_MESSAGE);
				
				nome = JOptionPane.showInputDialog("Nome do municipio " + q); 
				
				cep = JOptionPane.showInputDialog("CEP do municipio " + q);
			  }  else {
				  gr = false;
			     }
			
			} while(gr);//fim do while verificando se ele digitou algo
			
			
			if (mr > 1 && cont > 1) {   /* Verificando se o nome ou CEP ja foi utilizado */
				
				for (int k = 0; k <= (cont-1); k++) {
					
				     boolean jr = true;
				     
						do {
							 if (nome.toLowerCase().trim().equals(m1[k].exibirNome()) || cep.trim().equals(m1[k].exibirCep())) {
							
								JOptionPane.showMessageDialog(null, "Nome ou CEP ja cadastrado",
									"Erro", JOptionPane.ERROR_MESSAGE);
								
								nome = JOptionPane.showInputDialog("Nome do municipio " + q); 
								
								cep = JOptionPane.showInputDialog("CEP do municipio " + q);
								
								k = 0;
								
								        do{//Verificando se o usuario digitou algo no nome e cep nos novos dados fornecidos de nome e cpf

									        if (nome.trim().equals("") || cep.trim().equals("")) {
									        	
									        	gr = true;
									        	
										       JOptionPane.showMessageDialog(null, "Digite nome e CEP validos", "Erro", JOptionPane.ERROR_MESSAGE);
										
										       nome = JOptionPane.showInputDialog("Nome do municipio " + q); 
										
										       cep = JOptionPane.showInputDialog("CEP do municipio " + q);
									        }  else {
										         gr = false;
									           }
									
									     } while(gr);//fim do while verificando se ele digitou algo nos novos dados fornecidos de nome e cpf
								
							  } else {
								jr = false;
							    }
							
						 } while (jr);//Fim do while que verifica se o nome ou CEP ja nao foi repetido
						
				  }//fim do for que verifica se o nome ou CEP ja nao foi repetido
				
			  }//fim do if que verifica se o nome ou CEP ja nao foi repetido

			String regi = JOptionPane.showInputDialog("macroregiao do municipio " + q);

			boolean y = true;

			do { // Verificando se a macroregiao informada existe
				if (regi.toLowerCase().equals("norte") || regi.toLowerCase().equals("nordeste")
						|| regi.toLowerCase().equals("centro norte") || regi.toLowerCase().equals("centro leste")
						|| regi.toLowerCase().equals("leste") || regi.toLowerCase().equals("extremo sul")
						|| regi.toLowerCase().equals("oeste") || regi.toLowerCase().equals("sudeste")
						|| regi.toLowerCase().equals("sul")) {

					y = false;
				} // Fim do if

				else {

					JOptionPane.showMessageDialog(null, "Macroregiao invalida", "Erro", JOptionPane.ERROR_MESSAGE);

					regi = JOptionPane.showInputDialog("macroregiao do minucipio " + q);
				} // fim do else

			} while (y);// fim of do while verificando se a macroregiao existe

			int caso = Integer.parseInt(JOptionPane.showInputDialog("Quantos casos totais nesse municipio?"));

			y = true;

			int a = 0, u = 0, o = 0;

			boolean n = true;

			do { // Verificando se os numeros totais sao os mesmos numeros da variavel caso

				int ativo = Integer.parseInt(JOptionPane.showInputDialog("Quantos casos ativos nesse municipio?"));

				do {

					if (ativo >= 0 && ativo <= caso) {
						y = false;
					} // fim do if 1
					else {
						JOptionPane.showMessageDialog(null, "Quantidade superior aos casos totais", "Erro",
								JOptionPane.ERROR_MESSAGE);
						ativo = Integer.parseInt(JOptionPane.showInputDialog("Quantos casos ativos nesse municipio?"));
					} // fim do else 1

				} while (y);// fim do while 1 - verificando se os numeros batem

				int j = ativo;

				a = ativo;

				int cura = Integer.parseInt(JOptionPane.showInputDialog("Quantos casos curados nesse municipio?"));

				y = true;

				do {

					if (cura >= 0 && cura <= caso) {
						y = false;
					} // fim do if 2
					else {
						JOptionPane.showMessageDialog(null, "Quantidade superior aos casos totais", "Erro",
								JOptionPane.ERROR_MESSAGE);
						ativo = Integer.parseInt(JOptionPane.showInputDialog("Quantos casos curados nesse municipio?"));
					} // fim do else 2

				} while (y);// fim do while 2 - verificando se os numeros batem

				j += cura;

				u = cura;

				int obito = Integer.parseInt(JOptionPane.showInputDialog("Quantos obitos nesse municipio?"));

				y = true;

				do {

					if (obito >= 0 && obito <= caso) {
						y = false;
					} // fim do if 3
					else {
						JOptionPane.showMessageDialog(null, "Quantidade superior aos casos totais", "Erro", JOptionPane.ERROR_MESSAGE);
						obito = Integer.parseInt(JOptionPane.showInputDialog("Quantos obitos nesse municipio?"));
					} // fim do else 3

				} while (y);// fim do while 3 - verificando se os numeros batem

				j += obito;

				o = obito;

				if (j == caso) { //verificando se nos numeros de casos totais batem com os ativos, curados e obitos
					n = false;
				} else {
					JOptionPane.showMessageDialog(null, "A soma dos obitos, ativos e curados nao esta igual ao total de casos", "Erro", JOptionPane.ERROR_MESSAGE);
					JOptionPane.showMessageDialog(null, "Cadastre novamente com os valores corretos" + " / Casos totais: " + caso, "Aviso", JOptionPane.WARNING_MESSAGE);
				}

			} while (n);// fim of do while verificador de casos totais, se os numeros batem

			int desca = Integer.parseInt(JOptionPane.showInputDialog("Quantos casos descartados no municipio?"));

			int suspe = Integer.parseInt(JOptionPane.showInputDialog("Quantos casos suspeitos no municipio?"));

			/*
			 Alimentando as posicoes do vetor de municipio com os valores dados */

			m1[i].Cadastro(nome.toLowerCase(), cep, regi, caso, a, u, o, desca, suspe);

		} // fim do for alimentador

		int mx = 0, j = 0;

		boolean ve = true;

		do {

			if (m1[mx].exibirMacro().toLowerCase().equals(macro[j].exibirMacroregiao().toLowerCase())) {

				/*
				 Alimentando os casos por macroregiao e relacionando a classe
				 macroregiao com a classe municipio
				 */
				macro[j].CadastroCasos(m1[mx].exibirCasos(), m1[mx].exibirAtivos(), m1[mx].exibirCurados(),
						m1[mx].exibirObitos(), m1[mx].exibirDescartados(), m1[mx].exibirSuspeitos(), m1[mx]);

				m1[mx].setMacr(macro[j]);// Relacionamento da classe municipio com a classe macroregiao

				j = 0;

				mx++; // aumentando a posicao do vetor de cidades

				if (mx == mr) {
					ve = false;
				} // if que finaliza o loop
			} // if que alimenta a macroregiao
			else {
				j++;

				if (j == 9) {
					j = 0;
				} // if que zera a posicao da macroregiao

			} // else que aumenta a posicao do vetor de macroregiao caso o if de alimentacao nao rode

		} while (ve);

		JOptionPane.showMessageDialog(null, "Ola, Bem vindo ao sistema de busca");

		boolean l = true;

		do {

			int cas = 0;

			boolean zx = true;

			String esco = "Digite 1 para buscar \nDigite 2 para sair";

			do {

				cas = Integer.parseInt(JOptionPane.showInputDialog(esco));

				if (cas == 1 || cas == 2) {

					zx = false;

				} else {
					JOptionPane.showMessageDialog(null, "Numero nao solicitado", "Erro", JOptionPane.ERROR_MESSAGE);
				}

			} while (zx); // verificando se o usuario digita uma das opcoes disponiveis

			switch (cas) {

			case 1:
				String gt = JOptionPane.showInputDialog("Digite o nome ou cep da cidade / nome da macroregiao que quer buscar os dados");

				boolean lc = false;

				for (int i = 0; i < m1.length; i++) {/* exibindo os dados por municipio*/

					if (gt.toLowerCase().equals(m1[i].exibirNome()) || gt.equals(m1[i].exibirCep())) {

						lc = true;
						
						JOptionPane.showMessageDialog(null, "Cidade: " +m1[i].exibirNome() +"   /   " +"CEP: " +m1[i].exibirCep());

						JOptionPane.showMessageDialog(null, "O numero de casos totais da cidade:  " + m1[i].exibirCasos());
						JOptionPane.showMessageDialog(null, "O numero de ativos da cidade:  " + m1[i].exibirAtivos());
						JOptionPane.showMessageDialog(null, "O numero de curados da cidade:  " + m1[i].exibirCurados());
						JOptionPane.showMessageDialog(null, "O numero de obitos da cidade:  " + m1[i].exibirObitos());
						JOptionPane.showMessageDialog(null, "O numero de descartados da cidade:  " + m1[i].exibirDescartados());
						JOptionPane.showMessageDialog(null, "O numero de suspeitos da cidade:  " + m1[i].exibirSuspeitos());
						/*Exibindo os casos por cidade*/
					}
				}
				
				for (int k = 0; k < macro.length; k++) {/* exibindo os dados por macroregiao*/

					if (gt.toLowerCase().equals(macro[k].exibirMacroregiao())) {

						lc = true;
						
						JOptionPane.showMessageDialog(null, "Macroregiao: " +macro[k].exibirMacroregiao()
								);

						JOptionPane.showMessageDialog(null, "Os casos totais por macroregiao sao:  " + macro[k].exibirCasos());
						JOptionPane.showMessageDialog(null, "Os ativos por macroregiao sao:  " + macro[k].exibirAtivos());
						JOptionPane.showMessageDialog(null, "Os curados por macroregiao sao:  " + macro[k].exibirCurados());
						JOptionPane.showMessageDialog(null, "Os obitos por macroregiao sao:  " + macro[k].exibirObitos());
						JOptionPane.showMessageDialog(null, "Os casos descartados por macroregiao sao:  " + macro[k].exibirDescartados());
						JOptionPane.showMessageDialog(null, "Os casos suspeitos por macroregiao sao:  " + macro[k].exibirSuspeitos());
					}/*Exibindo os casos por macroregiao*/
				}

				if (lc) {
				} else {
					JOptionPane.showMessageDialog(null, "Nome/CEP invalido", "Erro", JOptionPane.ERROR_MESSAGE);
				}

				break;

			case 2:
				
				JOptionPane.showMessageDialog(null, "Sistema Encerrado", "Desligando", JOptionPane.INFORMATION_MESSAGE);

				l = false;

				break;

			default:
				break;
			}// fim do switch de escolha

		} while (l);// fim of do while de buscar ou sair

	}

}
