/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ot;

/**
 *
 * @author TDSN
 */
public class JogodaVelha {
    
    private int turno = 1;
    String[][] jdv = {{"","",""},{"","",""},{"","",""}};
    
    public boolean verificar(String campo){
        boolean TorF = false;
        if(campo.equals("") == true){
            TorF = true;
        }
        return TorF;
    }
    
    public void Marcar(int linha, int coluna, String esc){
        jdv[linha][coluna] = esc;
        turno++;
        
    }
    
    public String Jogador(){
        String esc ;
        if(turno % 2 == 0){
        esc = "O";
        }else{
        esc="X";
        }
        return esc;
    }
    
   public boolean VerificarVitoria(String esc){
       boolean victory = false;
       int cont = 0;
        for(int i = 0; i < 3; i++){
            if(jdv[i][i].equals(esc)){
                cont++;
                if(cont == 3){
                    victory = true;
                } 
            }
        }
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(jdv[i][j].equals(esc)){
                    cont++;
                    if(cont == 3){
                        victory = true;
                        break;
                    }
                }
                
            }
            cont = 0;
        }
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(jdv[j][i].equals(esc)){
                    cont++;
                    if(cont == 3){
                        victory = true;
                        break;
                    }
                }
                
            }
            cont = 0;
        }
        
        if(jdv[2][0].equals(esc) && jdv[1][1].equals(esc) && jdv[0][2].equals(esc) ){
            victory = true;
        }
        
        
        
        return victory;
    }
   
    
    public void vetor(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j<3; j++){
                System.out.println(jdv[i][j]);
            }
        }
    }
    
    public int getTurno(){
        return turno;
    }
    
}
