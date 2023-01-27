package Classes;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTextField;

public class HoraData implements Runnable{
    JTextField MainFrame_Pane_Novo_Hora;

    
    public HoraData(JTextField MainFrame_Pane_Novo_Hora){
        this.MainFrame_Pane_Novo_Hora = MainFrame_Pane_Novo_Hora;

    }
    
    @Override
    public void run(){
        while(true){
            SimpleDateFormat sdfHora = new SimpleDateFormat("HH:mm:ss");
            MainFrame_Pane_Novo_Hora.setText(sdfHora.format(new Date()));

            
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}