package Eletrônicos;


public class CelularTeste
{
    public static void main(String[] args) {

        System.out.println("==========| Crie o celular: |==========\n");
        Celular c1 = new Celular();

        c1.criaCelular();

        System.out.println();

        System.out.println(c1.getMarca());
        System.out.println(c1.getModelo());
        System.out.println(c1.getSistemaOperacional());

        System.out.println();

        //c1.instalaApp();


    }



}
