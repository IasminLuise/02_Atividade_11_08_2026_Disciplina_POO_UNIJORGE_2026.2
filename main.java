import java.util.Scanner;

public class Main {
public static void main(String[] args) {

Scanner imput = new Scanner(System.in);

double imc, altura, peso;

System.out.println("Digite a sua altura: ");
altura = imput.nextDouble();

System.out.println("Digite o seu peso: ");
peso = imput.nextDouble();

imc = peso/(altura*altura);

if (imc < 18.5) {
System.out.println("Abaixo do peso");
} else if (imc >= 18.5 && imc <= 24.9) {
System.out.println("Peso normal");
} else if (imc >= 25.0 && imc <= 29.9) {
System.out.println("Sobrepeso");
} else if (imc >= 30 && imc <= 34.9) {
System.out.println("Obesidade grau I");
} else if (imc >= 35.0 && imc <= 39.9) {
System.out.println("Obesidade grau II");
} else {
System.out.println("Obesidade grau III");
}

System.out.println(imc);

}
}
