package cursojava.executavel;

public class MediaAluno {
	public static void main(String[] args) {
		
		float nota1 = 10f;
		float nota2 = 10f;
		float media = (nota1 + nota2)/2;
		if(media >=7) {
			System.out.println("Sua media: " + media + " Vocé passou de ano");
		}else {
			System.out.println("Sua media: " + media + " Reprovado");
		}
	}

}
