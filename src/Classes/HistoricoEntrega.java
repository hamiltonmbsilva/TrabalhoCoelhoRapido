/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.time.LocalDateTime;



/**
 *
 * @author Hamil
 */
public class HistoricoEntrega {
    
    private LocalDateTime dataHoraChegada;
    private LocalDateTime dataHoraSaida;
    private String local;

    public HistoricoEntrega(LocalDateTime dataHoraChegada, LocalDateTime dataHoraSaida, String local) {
        this.dataHoraChegada = dataHoraChegada;
        this.dataHoraSaida = dataHoraSaida;
        this.local = local;
    }

    public HistoricoEntrega() {
    }

    public LocalDateTime getDataHoraChegada() {
        return dataHoraChegada;
    }

    public void setDataHoraChegada(LocalDateTime dataHoraChegada) {
        this.dataHoraChegada = dataHoraChegada;
    }

    public LocalDateTime getDataHoraSaida() {
        return dataHoraSaida;
    }

    public void setDataHoraSaida(LocalDateTime dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
   
}
