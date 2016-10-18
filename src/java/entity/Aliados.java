package entity;
// Generated 16-10-2016 1:46:00 by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Aliados generated by hbm2java
 */
@Entity
@Table(name="ALIADOS"
    ,schema="GRUPO03"
)
public class Aliados  implements java.io.Serializable {


     private AliadosId id;
     private Productores productoresByProductorProductorId;
     private Productores productoresByProductorProductorId1;
     private String estado;

    public Aliados() {
    }

    public Aliados(AliadosId id, Productores productoresByProductorProductorId, Productores productoresByProductorProductorId1, String estado) {
       this.id = id;
       this.productoresByProductorProductorId = productoresByProductorProductorId;
       this.productoresByProductorProductorId1 = productoresByProductorProductorId1;
       this.estado = estado;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="productorProductorId", column=@Column(name="PRODUCTOR_PRODUCTOR_ID", nullable=false, precision=8, scale=0) ), 
        @AttributeOverride(name="productorProductorId1", column=@Column(name="PRODUCTOR_PRODUCTOR_ID1", nullable=false, precision=8, scale=0) ) } )
    public AliadosId getId() {
        return this.id;
    }
    
    public void setId(AliadosId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PRODUCTOR_PRODUCTOR_ID", nullable=false, insertable=false, updatable=false)
    public Productores getProductoresByProductorProductorId() {
        return this.productoresByProductorProductorId;
    }
    
    public void setProductoresByProductorProductorId(Productores productoresByProductorProductorId) {
        this.productoresByProductorProductorId = productoresByProductorProductorId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PRODUCTOR_PRODUCTOR_ID1", nullable=false, insertable=false, updatable=false)
    public Productores getProductoresByProductorProductorId1() {
        return this.productoresByProductorProductorId1;
    }
    
    public void setProductoresByProductorProductorId1(Productores productoresByProductorProductorId1) {
        this.productoresByProductorProductorId1 = productoresByProductorProductorId1;
    }

    
    @Column(name="ESTADO", nullable=false, length=80)
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }




}


