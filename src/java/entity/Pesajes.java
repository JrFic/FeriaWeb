package entity;
// Generated 16-10-2016 1:46:00 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Pesajes generated by hbm2java
 */
@Entity
@Table(name="PESAJES"
    ,schema="GRUPO03"
)
public class Pesajes  implements java.io.Serializable {


     private boolean idPesaje;
     private String descripcionPesaje;
     private Set<Productos> productoses = new HashSet<Productos>(0);

    public Pesajes() {
    }

	
    public Pesajes(boolean idPesaje, String descripcionPesaje) {
        this.idPesaje = idPesaje;
        this.descripcionPesaje = descripcionPesaje;
    }
    public Pesajes(boolean idPesaje, String descripcionPesaje, Set<Productos> productoses) {
       this.idPesaje = idPesaje;
       this.descripcionPesaje = descripcionPesaje;
       this.productoses = productoses;
    }
   
     @Id 

    
    @Column(name="ID_PESAJE", unique=true, nullable=false, precision=1, scale=0)
    public boolean isIdPesaje() {
        return this.idPesaje;
    }
    
    public void setIdPesaje(boolean idPesaje) {
        this.idPesaje = idPesaje;
    }

    
    @Column(name="DESCRIPCION_PESAJE", nullable=false, length=40)
    public String getDescripcionPesaje() {
        return this.descripcionPesaje;
    }
    
    public void setDescripcionPesaje(String descripcionPesaje) {
        this.descripcionPesaje = descripcionPesaje;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="pesajes")
    public Set<Productos> getProductoses() {
        return this.productoses;
    }
    
    public void setProductoses(Set<Productos> productoses) {
        this.productoses = productoses;
    }




}


