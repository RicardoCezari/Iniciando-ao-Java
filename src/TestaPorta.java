public class TestaPorta {
    public static void main(String [] args)
    
    {
        Porta p1 = new Porta();
        
        p1.setCor(" branco ");
        p1.setDimensaox(2);
        p1.setDimensaoy(3);
        p1.setDimensaoz(4);
        
        p1.pinta("Cinza");
        p1.pinta("Azul");
        
        System.out.println("Cor da Porta e: "+p1.getCor());
        p1.abre();
        p1.fecha();
        
        if(p1.getAberta())
        {
            System.out.println("Esta Aberta!");
        }
        else 
            System.out.println("Esta Fechada!");
        }
    }