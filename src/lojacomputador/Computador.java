/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojacomputador;

/**
 *
 * @author priscyla.poliveira
 */
public class Computador {
    String[] acessorios;
    String[] servicos;
    String tipoComputador, sistemaOperacional, HD;
    
    public Computador(){
        
    }
    
    public Computador(String tipoComputador, String sistemaOperacional, String HD){
        
        acessorios = new String[3];
        servicos = new String[4];
        
        this.tipoComputador = tipoComputador;
        this.sistemaOperacional = sistemaOperacional;
        this.HD = HD;
    }
    
    public String getTipoComputador(){
        return tipoComputador;
    }
    
    public void setTipoComputador(String tipoComputador){
        this.tipoComputador = tipoComputador;
    }
    
    public String getSistemaOperacional(){
        return sistemaOperacional;
    }
    
    public void setSistemaOperacional(String sistemaOperacional){
        this.sistemaOperacional = sistemaOperacional;
    }
    
    public String getHD(){
        return HD;
    }
    
    public void setHD(String HD){
        this.HD = HD;
    }
    
    public String[] getAcessorios(){
        return acessorios;
    }
    
    public void setAcessorios(String[] acessorios){
        this.acessorios = acessorios;
    }
    
    public String[] getServicos(){
        return servicos;
    }
    
    public void setServicos(String[] servicos){
        this.servicos = servicos;
    }
}
