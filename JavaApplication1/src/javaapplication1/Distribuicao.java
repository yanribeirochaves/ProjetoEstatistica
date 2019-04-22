package javaapplication1;

import java.util.ArrayList;
import java.util.Collections;

public class Distribuicao 
{
    private ArrayList rol = new ArrayList();
    private String titulo = "";
    private String fonte = "";
    
    public void setRol(float valor)
    {
        rol.add(valor);
    }
    public ArrayList getRol()
    {
        Collections.sort(rol);
        return rol;
    }
    
    public void setTitulo(String tit)
    {
        titulo = tit;
    }
    public String getTitulo()
    {
        return titulo;
    }
    public void setFonte(String font)
    {
        fonte = font;
    }
    public String getFonte()
    {
        return fonte;
    }
    
    public void limpaTudo()
    {
        rol = new ArrayList();
    }
   
    public void limpaUltimo()
    {
        rol.remove(rol.get(rol.size()-1));
    }
}
