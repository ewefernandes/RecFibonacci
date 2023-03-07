package view;
import controller.cModulos;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		cModulos m = new cModulos();
		int posFib = 0;
		
		do {
			posFib = Integer.parseInt(JOptionPane.showInputDialog("Número de 1 a 20: "));
		} while (posFib > 20 || posFib < 1);
		
		int vetF[] = new int[posFib];
		int i = 0;
		int ac = 0;
		int retorno = m.Fibonacci(posFib, vetF, i, ac);
		
		System.out.println("Posicao = " +(posFib));
		System.out.println("Numero = " +retorno);
		
	}

}
