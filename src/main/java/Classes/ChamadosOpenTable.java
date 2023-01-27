package Classes;

import java.sql.*;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ChamadosOpenTable extends AbstractTableModel {

    ConexaoDB conexao = new ConexaoDB();
    UserInfo userinfo = new UserInfo();
    ChamadosInfo chamadosinfo = new ChamadosInfo();

    private Statement stmt;
    private int user_id;
    private int numLinhas;
    private Object[][] data;
    private String[] columnNames = {"Código", "Assunto", "Prioridade", "Descrição", "Data", "Hora"};

    public ChamadosOpenTable() {
        this.user_id = userinfo.getUser_id();
        try {
            conexao.conn();
            Statement stmt = conexao.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("SELECT * FROM chamados WHERE chamados_users_id = " + user_id + " AND chamados_encerrado = 0");
            int tamanho = 0;
            while (rs.next()){
                tamanho++;
            }
            data = new Object[tamanho][columnNames.length];
            rs.beforeFirst();

            int i = 0;
            while (rs.next()) {
                data[i][0] = rs.getInt("chamados_id");
                data[i][1] = rs.getInt("chamados_categoria");
                data[i][2] = rs.getInt("chamados_prioridade");
                data[i][3] = rs.getString("chamados_desc");
                data[i][4] = rs.getString("chamados_data");
                data[i][5] = rs.getString("chamados_hora");
                i++;
            }
            
        } catch (SQLException e) {
            System.out.println("Erro catch opentable");
            e.printStackTrace();
        }
    }

    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        if(columnIndex == 1){
            int assuntoNum = (int) data[rowIndex][columnIndex];
            switch(assuntoNum){
                case 1:
                    return "Parte física do computador";
            case 2:
                return "Programas do computador";
            case 3:
                return "Impressora";
            case 4:
                return "Telefone";
            case 5:
                return "Qualquer outra coisa";
            default:
                return "Inválido";
            }
        } else if(columnIndex == 2){
            int prioridadeNum = (int) data[rowIndex][columnIndex];
            switch(prioridadeNum){
                case 1:
                    return "Até rola usar assim, mas tem que arrumar";
                case 2:
                    return "Precisa resolver pra agora esse troço";
                case 3:
                    return "Não dá pra viver, arruma isso aqui plmds";
                case 4:
                    return "TÁ PEGANDO FOGO, BICHO";
                default:
                    return "Inválido";
            }
        } else {
            return data[rowIndex][columnIndex];
        }
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }
    
    @Override
    public boolean isCellEditable(int row, int col) {
        return false;
    }
    
    @Override
    public void setValueAt(Object value, int row, int col) {
        data[row][col] = value;
        fireTableCellUpdated(row, col);
    }
}