package lab2.pkg1_willian_garcia_william_morelo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Nodo {
private Nodo ll,rl;
//private  String fecha;
private long nro;
private  float monto;
private  boolean b;
private Date  fecha;


    public Nodo(Date  fecha, long nro, float monto, boolean b) {
        ll=rl=null;
        this.fecha = fecha;
        this.nro = nro;
        this.monto = monto;
        this.b = b;
    }
       public Nodo(Nodo rl,Nodo ll,Date  fecha, long nro, float monto, boolean b) {
        this.ll=ll;
        this.rl=rl;
        this.fecha = fecha;
        this.nro = nro;
        this.monto = monto;
        this.b = b;
    }

    public Nodo getLl() {
        return ll;
    }

    public void setLl(Nodo ll) {
        this.ll=ll;
        ll.rl=this;
    }
    public void setLl() {
        this.ll=null;
    }

    public Nodo getRl() {
        return rl;
    }
    public void setRl() {
         this.rl=null;
    }
    public void setRl(Nodo rl) {
         this.rl=rl;
         rl.ll=this;
    }

    public Date  getFecha() {
        return fecha;
    }

    public void setFecha(Date  fecha) {
        this.fecha = fecha;
    }

    public long getNro() {
        return nro;
    }

    public void setNro(long nro) {
        this.nro = nro;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public boolean isB() {
        return b;
    }
    
    public void setB(boolean b) {
        this.b = b;
    }
      
}
