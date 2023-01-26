/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ticketsystem;

/*
 *
 * @author Iago
 */
public class ChamadosInfo {
    
    private int ci_assunto;
    private int ci_prioridade;
    private String ci_data;
    private String ci_hora;
    private String ci_desc;
    private int ci_num_chamado;
    private boolean ci_novoChamadoOk;

    public void setCi_assunto(int ci_assunto) {
        this.ci_assunto = ci_assunto;
    }
    public void setCi_prioridade(int ci_prioridade) {
        this.ci_prioridade = ci_prioridade;
    }
    public void setCi_data(String ci_data) {
        this.ci_data = ci_data;
    }
    public void setCi_hora(String ci_hora) {
        this.ci_hora = ci_hora;
    }
    public void setCi_desc(String ci_desc) {
        this.ci_desc = ci_desc;
    }
    public void setCi_num_chamado(int ci_num_chamado) {
        this.ci_num_chamado = ci_num_chamado;
    }
    public void setCi_novoChamadoOk(boolean ci_novoChamadoOk) {
        this.ci_novoChamadoOk = ci_novoChamadoOk;
    }
    public int getCi_assunto() {
        return ci_assunto;
    }
    public int getCi_prioridade() {
        return ci_prioridade;
    }
    public String getCi_data() {
        return ci_data;
    }
    public String getCi_hora() {
        return ci_hora;
    }
    public String getCi_desc() {
        return ci_desc;
    }
    public int getCi_num_chamado() {
        return ci_num_chamado;
    }
    public boolean getCi_novoChamadoOk() {
        return ci_novoChamadoOk;
    }
}
