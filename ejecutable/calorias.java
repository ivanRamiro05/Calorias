import java.util.Arrays;

import javax.swing.JOptionPane;
import javax.swing.MenuSelectionManager;

public class calorias
{
    



    public static void main(String[] args)
     {
     int[]calorias=new int[7];
     int caloriastotales=0,mascal = 0, menoscal=0;
     String diamas=" ", diamenos=" ";
       
    String[] dias ={"lunes","Martes","Miercoles","Jueves","Viernes", "Sabado", "Domingo" };
  
        for(int i=0; i<calorias.length;i++)
        {
            calorias[i]=Integer.parseInt(JOptionPane.showInputDialog( "ingrese las calorias quemadas el dia "+ dias[i]+": "));
            caloriastotales = caloriastotales + calorias[i];
            if (calorias[i]> mascal)
            {
                mascal=calorias[i];
                diamas=dias[i];
            }
            if (calorias[i]<menoscal)
            {
                menoscal[i+1]=calorias[i];
                diamenos=dias[i];
            }
    
        }
        
        
            JOptionPane.showMessageDialog(null, "Dia que se quemaron mas calorias: "+diamas+"  "+mascal+"\nDia que se quemaron menos calorias : "+diamenos+"  "+menoscal+"\nPromedio total : "+"  "+caloriastotales/7);

}
}