/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_josereyes;

/**
 *
 * @author josem
 */
import java.util.Scanner;
public class Lab2P1_JoseReyes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner r = new Scanner(System.in);
        boolean flag = true;
        
        while(flag==true){
            System.out.println("Bienvenido al menu principal");
            System.out.println("1.Numero perfecto\n2.Sumatoria\n3.Serie");
            System.out.println("4.Finalizar programa");
            int menu = r.nextInt();
            
            switch(menu){
                case 1:{
                    boolean perfecto=true;
                    boolean primo=true;
                    int sum=0;
                    int i=2;
                    System.out.println("Ingrese un numero");
                    int numero=r.nextInt();
                    
                    while(numero<0){
                        System.out.println("El numero debe ser positivo");
                        numero=r.nextInt();
                    }
                    while (i <= numero / 2) {
                        if (numero % i == 0) {
                            primo = false;
                        }
                        i++;
                    }
                    if (primo) {
                        System.out.println(numero + " es primo, no se puede evaluar si es perfecto");
                    } else {
                        i = 1;
                        while (i <= numero / 2) {
                            if (numero % i == 0) {
                                sum += i;
                            }
                            i++;
                        }
                        if (sum == numero) {
                            perfecto = true;
                            System.out.println(numero + " es un numero perfecto");
                            System.out.print("Divisores: ");
                            i = 1;
                            while (i <= numero / 2) {
                                if (numero % i == 0) {
                                    System.out.print(i + " ");
                                }
                                i++;
                            }
                        } else {
                            System.out.println(numero + " no es un numero perfecto");
                        }
                    }
                    System.out.println("\n");
                }break;
                case 2:{
                    double n=1;
                    double resultado=0;
                    double suma=0;
                    double resultado1=0,resultado2=0,resultado3=0;

                    System.out.println("Ingrese un numero positivo");
                    int numero=r.nextInt();
                    while(numero<0){
                        System.out.println("El numero debe ser positivo");
                        numero=r.nextInt();
                    }
                    while(n<=numero){
                        resultado1=(2*n)-1;
                        resultado2=n+1;
                        resultado3=resultado2*n;
                        n=n+1;
                        suma=suma+resultado1/resultado3;
                    }
                    System.out.println("El resultado es: "+suma);
                    System.out.println("");
                }break;
                case 3:{
                    int contador=0;
                    int limitex=0;
                    int suma=0;
                    System.out.println("Ingrese un numero positivo que seguira el patron");
                    int numero=r.nextInt();
                    while(numero<=0){
                        System.out.println("Ingrese un numero positivo en el patron");
                        numero=r.nextInt();
                    }
                    System.out.println("Ingrese el limite");
                    int limite=r.nextInt();
                    while(limite<=0){
                        System.out.println("Ingrese un numero positivo para el limite");
                        limite=r.nextInt();
                    }
                    while(contador==0 || contador==1){
                        System.out.print(contador+" ");
                        contador++;
                    }
                    int num=numero;
                    int suma1=0;
                    while(limitex<limite){
                        if(limitex%2==0){
                            suma=numero*1;
                        }else{
                            suma=numero*-1;
                        }
                        System.out.print(suma+" ");
                        numero=numero+num;
                        limitex++;
                    }
                    System.out.println("\n");
                }break;
                case 4:{
                    flag=false;
                    System.out.println("Programa finalizado...");
                }break;
                default:
                    System.out.println("Opcion no valida");
                    System.out.println("-----------------");
            }
        }
    }
}
