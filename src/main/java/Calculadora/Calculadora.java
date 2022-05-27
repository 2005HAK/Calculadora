package Calculadora;

import java.util.Scanner;

public class Calculadora {
    
    static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) 
    {
        float v[] = new float [2];
        int decisao;
               
        do
        {
            decisao = operacoes();
            
        if(decisao > 0 && decisao < 6)
        {
            if(decisao!=5)
            {
                inserir_valores(v);
                calculo(decisao, v);
                decisao=0;
            }
            else
            {
                sair();
            }
        }
        else
        {
            decisao = erro();
        }
        }while(decisao == 0);
    }
    static int operacoes()
    {
        int d;
        
        System.out.println("Qual operação deseja realizar? ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - sair");
        d = leia.nextInt();
       
        return(d);
    }
    static void inserir_valores(float v[])
    {
        for(int i=0; i<2; i++)
        {
            System.out.println("Insira o "+(i+1)+"º valor: ");
            v[i] = leia.nextFloat();
        }
    }
    static void calculo(int decisao, float v[])
    {
        float resultado;
        
        if(decisao == 1)
        {
            resultado = soma(v);
            resultado(resultado); 
        }
        if(decisao == 2)
        {
            resultado = subtracao(v);
            resultado(resultado);
        }
        if(decisao == 3)
        {
            resultado = multiplicacao(v);
            resultado(resultado);
        }
        if(decisao == 4)
        {
            resultado = divisao(v);
            resultado(resultado);   
        }
        if(decisao == 5)
        {
            sair();
        }
    }
    static float soma(float v[])
    {
        float r;
        
        r = v[0] + v[1];
        
        return(r);
    }
    static float subtracao(float v[])
    {
        float r;
        
        r = v[0] - v[1];
        
        return(r);
    }
    static float multiplicacao(float v[])
    {
        float r;
        
        r = v[0] * v[1];
        
        return(r);
    }
    static float divisao(float v[])
    {
        float r;
        
        r = v[0] / v[1];
        
        return(r);
    }
    static void resultado(float resultado)
    {
        System.out.println("\nO resultado é: "+resultado+"\n");
    }
    static void sair()
    {
        System.out.println("\nOperaçoes finalizadas");
    }
    static int erro()
    {       
        System.out.println("\nOpção inválida!\n");
        
        return(0);
    }
}