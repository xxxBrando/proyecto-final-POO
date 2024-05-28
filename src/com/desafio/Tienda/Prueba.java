package com.desafio.Tienda;
import com.desafio.Tienda.Producto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        ArrayList<Producto>listaProductos=new ArrayList<>();
        double ValorRestante;
        boolean valorSuficiente=true;

        System.out.println("Escciba el limite de la compra");
        double limite=consola.nextDouble();


        System.out.println("Escriba la descripcion de la compra");
        String descripcion=consola.next();


        System.out.println("Escriba el valor de la compra");
        double valorCompra=consola.nextDouble();




        if (limite>=valorCompra)
        {
            ValorRestante=limite-valorCompra;
            System.out.println("compra relaizada!!!");
            Producto producto1=new Producto(descripcion,valorCompra);
            listaProductos.add(producto1);
            System.out.println("Esciba 0 para salir y 1 para continuar ");
            int opcion=consola.nextInt();
            while(opcion==1&&valorSuficiente==true){
                switch (opcion){
                    case 1:
                        System.out.println("Escriba la descripcion de la compra");
                         descripcion=consola.next();

                        System.out.println("Escriba el valor de la compra");
                         valorCompra=consola.nextDouble();

                         if (ValorRestante>=valorCompra){
                             ValorRestante-=valorCompra;
                             System.out.println("compra relaizada!!!");
                             Producto productonuevo=new Producto(descripcion,valorCompra);
                             listaProductos.add(productonuevo);
                             System.out.println("Esciba 0 para salir y 1 para continuar ");
                             opcion=consola.nextInt();
                         }else {

                             System.out.println("saldo insuficiente");
                             valorSuficiente=false;
                             break;

                         }





                }
            }




        }else{

            System.out.println("su limite es muy bajo XD");

        }
        Collections.sort(listaProductos);

        System.out.println("sus compras Fueron: ");
       for(Producto cosa:listaProductos) {
           System.out.println("descripcion  :" + cosa.getDescrocion()+"  "+"valor: "+cosa.getValorCompra()+"\n");
       }

        }




    }


