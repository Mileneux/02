package oficina;

import java.sql.Date;


public class Agenda {
     private Cliente cliente;
    private Date Data;
    
    public Cliente getCadastrocliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date Data) {
        this.Data = Data;
    }
    
}
