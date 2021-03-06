package entity;
// Generated 16-10-2016 1:46:00 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Compras generated by hbm2java
 */
@Entity
@Table(name="COMPRAS"
    ,schema="GRUPO03"
)
public class Compras  implements java.io.Serializable {


     private long idCompra;
     private Compradores compradores;
     private Date fechaCompra;
     private long totalCompra;
     private String medioPago;
     private Set<Detallescompras> detallescomprases = new HashSet<Detallescompras>(0);

    public Compras() {
    }

	
    public Compras(long idCompra, Date fechaCompra, long totalCompra, String medioPago) {
        this.idCompra = idCompra;
        this.fechaCompra = fechaCompra;
        this.totalCompra = totalCompra;
        this.medioPago = medioPago;
    }
    public Compras(long idCompra, Compradores compradores, Date fechaCompra, long totalCompra, String medioPago, Set<Detallescompras> detallescomprases) {
       this.idCompra = idCompra;
       this.compradores = compradores;
       this.fechaCompra = fechaCompra;
       this.totalCompra = totalCompra;
       this.medioPago = medioPago;
       this.detallescomprases = detallescomprases;
    }
   
     @Id 

    
    @Column(name="ID_COMPRA", unique=true, nullable=false, precision=12, scale=0)
    public long getIdCompra() {
        return this.idCompra;
    }
    
    public void setIdCompra(long idCompra) {
        this.idCompra = idCompra;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="COMPRADOR_ID_COMPRADOR")
    public Compradores getCompradores() {
        return this.compradores;
    }
    
    public void setCompradores(Compradores compradores) {
        this.compradores = compradores;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_COMPRA", nullable=false, length=7)
    public Date getFechaCompra() {
        return this.fechaCompra;
    }
    
    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    
    @Column(name="TOTAL_COMPRA", nullable=false, precision=10, scale=0)
    public long getTotalCompra() {
        return this.totalCompra;
    }
    
    public void setTotalCompra(long totalCompra) {
        this.totalCompra = totalCompra;
    }

    
    @Column(name="MEDIO_PAGO", nullable=false, length=160)
    public String getMedioPago() {
        return this.medioPago;
    }
    
    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="compras")
    public Set<Detallescompras> getDetallescomprases() {
        return this.detallescomprases;
    }
    
    public void setDetallescomprases(Set<Detallescompras> detallescomprases) {
        this.detallescomprases = detallescomprases;
    }




}


