package unidad5;

public class Tablero
 	{
 	       String tab[][];
 	       String sNombre;  
 	
 	       public String PintTab(char cTipo, int iFil, int iCols, String sNomb)  
 	         {
 	                 tab = new String[iFil][iCols];
 	                 sNombre = "";
 	                 int iNumPos = 0;
 	 
 	                 if (cTipo == 'T')
 	                            { sNombre = sNomb; }
 	                 else if (cTipo == 'D')
 	                            { sNombre = "CARTON"; }
 	                 else if (cTipo == 'D')
 	                            { sNombre = ""; }
 	 
 	                 for (int i=0; i < iFil; i++)
 	                {
 	                            for (int j=0; j<iCols; j++)
 	                            {
 	                                        iNumPos++;
 	                                        tab[i][j] = "";
 	                            }
 	                 }
 	 
 	                 return sNombre + " tiene " + iNumPos + " posiciones";
 	       }
 	       
 	       public static void main (String[] args){
 	    	   Tablero t = new Tablero();
 	    	   String carton = t.PintTab('D', 0, 0, "Mila");
 	    	   System.out.println(carton);
 	       }
 	}
