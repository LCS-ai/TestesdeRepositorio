package Eletrônicos;

import java.util.Scanner;

public class Celular
{   
<<<<<<< HEAD
    //Uma nova alteração
=======
    //Inserindo uma nova branch
>>>>>>> outroBranch
    //Desfazendo algo
    //Um commit
    //entendendo o HEAD
    //entendendo git 
    
    private String modelo;
    private String marca;
    private String sistemaOperacional;
    private Aplicativos apps = new Aplicativos();


    public String getModelo()
    {
        return modelo;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public String getMarca()
    {
        return marca;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public String getSistemaOperacional()
    {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional)
    {
        this.sistemaOperacional = sistemaOperacional;
    }



    public void criaCelular()
    {
        apps = new Aplicativos();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o modelo do celular: ");
        String modelo;
        modelo = sc.next();

        System.out.println("Digite a marca: ");
        String marca;
        marca = sc.next();

        System.out.println("Digite o sistema operacional: ");
        String sistemaOperacional;
        sistemaOperacional = sc.next();

        setModelo(modelo);
        setMarca(marca);
        setSistemaOperacional(sistemaOperacional);

        sc.close();
    }

    public void instalaApp()
    {
        apps = new Aplicativos();

        Scanner entrada = new Scanner(System.in);

        int posiçãoArray;
        String appNaPosição;

        System.out.println("Digite a posição do APP: ");
        posiçãoArray = entrada.nextInt();

        System.out.println("Digite o APP: ");
        appNaPosição = entrada.next();

        apps.insereVector(posiçãoArray, appNaPosição);

        entrada.close();
    }







}