package Eletrônicos;

public class Aplicativos
{
    private String [] apps;

    public Aplicativos()
    {
        apps = new String[10];
    }


    public int appsTamanho() {
        return apps.length;
    }

    public void mostraApps()
    {
        for(int indx = 0; indx < apps.length; indx++)
        {
            if(apps[indx] != null)
            {
                System.out.println(apps[indx]);
            }
        }
    }

    public void insereVector(int posiçãoArray, String appNaPosição)
    {
        apps[posiçãoArray] = appNaPosição;
    }


}
