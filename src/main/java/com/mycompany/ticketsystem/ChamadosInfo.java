/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ticketsystem;

/**
 *
 * @author Iago
 */
public class ChamadosInfo {
    
    ConexaoDB ci_con = new ConexaoDB();
    
    public int ci_assunto;
    public int ci_prioridade;
    public String ci_data;
    public String ci_hora;
    public String ci_desc;
    public int ci_num_chamado;
    boolean ci_novoChamadoOk;
    
    public void NovoChamado(int assunto, int prioridade, String data, String hora, String desc, int num_chamado, boolean novoChamadoOk){
        
    }
    
    
}
