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
    
    private static int assunto;
    private static int prioridade;
    private static String data;
    private static String hora;
    private static String desc;
    private static int num_chamado;
    private static boolean novoChamadoOk;

    public void setAssunto(int assunto) {
        ChamadosInfo.assunto = assunto;
    }
    public void setPrioridade(int prioridade) {
        ChamadosInfo.prioridade = prioridade;
    }
    public void setData(String data) {
        ChamadosInfo.data = data;
    }
    public void setHora(String hora) {
        ChamadosInfo.hora = hora;
    }
    public void setDesc(String desc) {
        ChamadosInfo.desc = desc;
    }
    public void setNum_chamado(int num_chamado) {
        ChamadosInfo.num_chamado = num_chamado;
    }
    public void setNovoChamadoOk(boolean novoChamadoOk) {
        ChamadosInfo.novoChamadoOk = novoChamadoOk;
    }
    public int getAssunto() {
        return assunto;
    }
    public int getPrioridade() {
        return prioridade;
    }
    public String getData() {
        return data;
    }
    public String getHora() {
        return hora;
    }
    public String getDesc() {
        return desc;
    }
    public int getNum_chamado() {
        return num_chamado;
    }
    public boolean getNovoChamadoOk() {
        return novoChamadoOk;
    }
}
