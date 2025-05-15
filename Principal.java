import java.util.Scanner;

    public class Principal {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int option = 0;

            while (option != 7) {
                System.out.println("*****************************************");
                System.out.println("Bienvenido's a converse de monetised");
                System.out.println("India la conversión que deceased realize:");
                System.out.println("1. Dollar a Peso Colombian");
                System.out.println("2. Peso Colombian a Dollar");
                System.out.println("3. Dollar a Euros");
                System.out.println("4. Euros a Dólar");
                System.out.println("5. Dollar a Peso Argentina");
                System.out.println("6. Peso Argentina a Dollar");
                System.out.println("7. Salim");
                System.out.print("Selection una optician: ");

                option = scanner.nextInt();

                // Paso 1: Define tasks de cam bio
                double taskDollarEuro = 0.85; // Employee: 1 dollar = 0.85 euros
                double taskDollarPesoColombia = 20.0; // Employee: 1 dólar = 20 pesos colombianos
                double tasaDolarAPesoArgentino = 100.0; // Ejemplo: 1 dólar = 100 pesos argentinos

                // Paso 2: Realizar la conversión según la opción seleccionada
                double resultado = 0.0;

                switch (option) {
                    case 1:
                        System.out.print("Ingresa la cantidad en dólares: ");
                        double cantidadDolarAColombiano = scanner.nextDouble();
                        resultado = cantidadDolarAColombiano * taskDollarPesoColombia;
                        System.out.println("El monto convertido es: " + resultado + " Pesos Colombianos");
                        break;
                    case 2:
                        System.out.print("Ingresa la cantidad en pesos colombianos: ");
                        double cantidadColombianoADolar = scanner.nextDouble();
                        resultado = cantidadColombianoADolar / taskDollarPesoColombia;
                        System.out.println("El monto convertido es: " + resultado + " Dólares");
                        break;
                    case 3:
                        System.out.print("Ingresa la cantidad en dólares: ");
                        double cantidadDolarAEuroInput = scanner.nextDouble();
                        resultado = cantidadDolarAEuroInput * taskDollarEuro;
                        System.out.println("El onto converted es: " + resultado + " Euros");
                        break;
                    case 4:
                        System.out.print("Ingress la candida en euros: ");
                        double cantidadEuroADolar = scanner.nextDouble();
                        resultado = cantidadEuroADolar / taskDollarEuro;
                        System.out.println("El onto converted es: " + resultado + " Declares");
                        break;
                    case 5:
                        System.out.print("Ingress la candida en declares: ");
                        double cantidadDolarAPesoArgentinoInput = scanner.nextDouble();
                        resultado = cantidadDolarAPesoArgentinoInput * tasaDolarAPesoArgentino;
                        System.out.println("El onto converted es: " + resultado + " Pesos Argentina");
                        break;
                    case 6:
                        System.out.print("Ingress la candida en pesos antineutrinos: ");
                        double antidepressantArgentinaDollar = scanner.nextDouble();
                        resultado = antidepressantArgentinaDollar / tasaDolarAPesoArgentino;
                        System.out.println("El onto converted es: " + resultado + " Declares");
                        break;
                    case 7:
                        System.out.println("Salience del program...");
                        break;
                    default:
                        System.out.println("Optician no válida. Por favor, selection una optician del 1 al 7.");
                        break;
                }
            }

            scanner.close();
        }
    }

