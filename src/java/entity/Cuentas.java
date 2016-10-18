package entity;
// Generated 16-10-2016 1:46:00 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
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
 * Cuentas generated by hbm2java
 */
@Entity
@Table(name="CUENTAS"
    ,schema="GRUPO03"
)
public class Cuentas  implements java.io.Serializable {


     private int idCuenta;
     private Tipocuenta tipocuenta;
     private String nombreCuenta;
     private String passwordCuenta;
     private Date fechaCreacionCuenta;
     private BigDecimal idUbicacion;
     private Set<Ubicaciones> ubicacioneses = new HashSet<Ubicaciones>(0);
     private Set<Usuarios> usuarioses = new HashSet<Usuarios>(0);

    public Cuentas() {
    }

	
    public Cuentas(int idCuenta, Tipocuenta tipocuenta, String nombreCuenta, String passwordCuenta, Date fechaCreacionCuenta, BigDecimal idUbicacion) {
        this.idCuenta = idCuenta;
        this.tipocuenta = tipocuenta;
        this.nombreCuenta = nombreCuenta;
        this.passwordCuenta = passwordCuenta;
        this.fechaCreacionCuenta = fechaCreacionCuenta;
        this.idUbicacion = idUbicacion;
    }
    public Cuentas(int idCuenta, Tipocuenta tipocuenta, String nombreCuenta, String passwordCuenta, Date fechaCreacionCuenta, BigDecimal idUbicacion, Set<Ubicaciones> ubicacioneses, Set<Usuarios> usuarioses) {
       this.idCuenta = idCuenta;
       this.tipocuenta = tipocuenta;
       this.nombreCuenta = nombreCuenta;
       this.passwordCuenta = passwordCuenta;
       this.fechaCreacionCuenta = fechaCreacionCuenta;
       this.idUbicacion = idUbicacion;
       this.ubicacioneses = ubicacioneses;
       this.usuarioses = usuarioses;
    }
   
     @Id 

    
    @Column(name="ID_CUENTA", unique=true, nullable=false, precision=9, scale=0)
    public int getIdCuenta() {
        return this.idCuenta;
    }
    
    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="TIPOCUENTA_ID_TIPOCUENTA", nullable=false)
    public Tipocuenta getTipocuenta() {
        return this.tipocuenta;
    }
    
    public void setTipocuenta(Tipocuenta tipocuenta) {
        this.tipocuenta = tipocuenta;
    }

    
    @Column(name="NOMBRE_CUENTA", nullable=false, length=200)
    public String getNombreCuenta() {
        return this.nombreCuenta;
    }
    
    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    
    @Column(name="PASSWORD_CUENTA", nullable=false, length=100)
    public String getPasswordCuenta() {
        return this.passwordCuenta;
    }
    
    public void setPasswordCuenta(String passwordCuenta) {
        this.passwordCuenta = passwordCuenta;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_CREACION_CUENTA", nullable=false, length=7)
    public Date getFechaCreacionCuenta() {
        return this.fechaCreacionCuenta;
    }
    
    public void setFechaCreacionCuenta(Date fechaCreacionCuenta) {
        this.fechaCreacionCuenta = fechaCreacionCuenta;
    }

    
    @Column(name="ID_UBICACION", nullable=false, precision=22, scale=0)
    public BigDecimal getIdUbicacion() {
        return this.idUbicacion;
    }
    
    public void setIdUbicacion(BigDecimal idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="cuentas")
    public Set<Ubicaciones> getUbicacioneses() {
        return this.ubicacioneses;
    }
    
    public void setUbicacioneses(Set<Ubicaciones> ubicacioneses) {
        this.ubicacioneses = ubicacioneses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="cuentas")
    public Set<Usuarios> getUsuarioses() {
        return this.usuarioses;
    }
    
    public void setUsuarioses(Set<Usuarios> usuarioses) {
        this.usuarioses = usuarioses;
    }




}

