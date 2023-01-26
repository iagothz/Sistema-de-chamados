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
    
    private static int ci_assunto;
    private static int ci_prioridade;
    private static String ci_data;
    private static String ci_hora;
    private static String ci_desc;
    private static int ci_num_chamado;
    private static boolean ci_novoChamadoOk;

    public void setCi_assunto(int ci_assunto) {
        ChamadosInfo.ci_assunto = ci_assunto;
    }
    public void setCi_prioridade(int ci_prioridade) {
        ChamadosInfo.ci_prioridade = ci_prioridade;
    }
    public void setCi_data(String ci_data) {
        ChamadosInfo.ci_data = ci_data;
    }
    public void setCi_hora(String ci_hora) {
        ChamadosInfo.ci_hora = ci_hora;
    }
    public void setCi_desc(String ci_desc) {
        ChamadosInfo.ci_desc = ci_desc;
    }
    public void setCi_num_chamado(int ci_num_chamado) {
        ChamadosInfo.ci_num_chamado = ci_num_chamado;
    }
    public void setCi_novoChamadoOk(boolean ci_novoChamadoOk) {
        ChamadosInfo.ci_novoChamadoOk = ci_novoChamadoOk;
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
