package composite;

public class Main {
	
	public static void main(String [] args)
	{
		Componente p1 = new Componente("Sistema de Arrefecimento");
        No a1 = new No("Radiador");
        No a2 = new No("Ventilador");
        p1.add(a1);
        p1.add(a2);

        Componente p2 = new Componente("Motor");
        No a4 = new No("Pistão");
        No a5 = new No("Válvula");
		p2.add(a4);
		p2.add(a5);
		
		Componente p3 = new Componente("Carro");
		p3.add(p1);
		p3.add(p2);
		
		// p3.escreva();

		System.out.println(p3.QntdePecas());
		p3.escreva();

		
		p3.remove(p1);
		
		// p3.escreva();
	}
	
}
