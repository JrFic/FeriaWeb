package entity;
// Generated 16-10-2016 1:46:00 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DetallesventasId generated by hbm2java
 */
@Embeddable
public class DetallesventasId  implements java.io.Serializable {


     private long ofertaIdOferta;
     private long ventaIdVenta;

    public DetallesventasId() {
    }

    public DetallesventasId(long ofertaIdOferta, long ventaIdVenta) {
       this.ofertaIdOferta = ofertaIdOferta;
       this.ventaIdVenta = ventaIdVenta;
    }
   


    @Column(name="OFERTA_ID_OFERTA", nullable=false, precision=12, scale=0)
    public long getOfertaIdOferta() {
        return this.ofertaIdOferta;
    }
    
    public void setOfertaIdOferta(long ofertaIdOferta) {
        this.ofertaIdOferta = ofertaIdOferta;
    }


    @Column(name="VENTA_ID_VENTA", nullable=false, precision=10, scale=0)
    public long getVentaIdVenta() {
        return this.ventaIdVenta;
    }
    
    public void setVentaIdVenta(long ventaIdVenta) {
        this.ventaIdVenta = ventaIdVenta;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof DetallesventasId) ) return false;
		 DetallesventasId castOther = ( DetallesventasId ) other; 
         
		 return (this.getOfertaIdOferta()==castOther.getOfertaIdOferta())
 && (this.getVentaIdVenta()==castOther.getVentaIdVenta());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + (int) this.getOfertaIdOferta();
         result = 37 * result + (int) this.getVentaIdVenta();
         return result;
   }   


}

