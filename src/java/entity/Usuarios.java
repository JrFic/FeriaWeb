package entity;
// Generated 16-10-2016 1:46:00 by Hibernate Tools 4.3.1


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
import javax.persistence.UniqueConstraint;

/**
 * Usuarios generated by hbm2java
 */
@Entity
@Table(name="USUARIOS"
    ,schema="GRUPO03"
    , uniqueConstraints = @UniqueConstraint(columnNames="CUENTA_ID_CUENTA") 
)
public class Usuarios  implements java.io.Serializable {


     private String rut;
     private Cuentas cuentas;
     private String emailUsuario;
     private long celularUsuario;
     private String nombreUsuario;
     private String apellidoUsuario;
     private short edadUsuario;
     private Set<Productores> productoreses = new HashSet<Productores>(0);
     private Set<Compradores> compradoreses = new HashSet<Compradores>(0);

    public Usuarios() {
    }

	
    public Usuarios(String rut, Cuentas cuentas, String emailUsuario, long celularUsuario, String nombreUsuario, String apellidoUsuario, short edadUsuario) {
        this.rut = rut;
        this.cuentas = cuentas;
        this.emailUsuario = emailUsuario;
        this.celularUsuario = celularUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.edadUsuario = edadUsuario;
    }
    public Usuarios(String rut, Cuentas cuentas, String emailUsuario, long celularUsuario, String nombreUsuario, String apellidoUsuario, short edadUsuario, Set<Productores> productoreses, Set<Compradores> compradoreses) {
       this.rut = rut;
       this.cuentas = cuentas;
       this.emailUsuario = emailUsuario;
       this.celularUsuario = celularUsuario;
       this.nombreUsuario = nombreUsuario;
       this.apellidoUsuario = apellidoUsuario;
       this.edadUsuario = edadUsuario;
       this.productoreses = productoreses;
       this.compradoreses = compradoreses;
    }
   
     @Id 

    
    @Column(name="RUT", unique=true, nullable=false, length=44)
    public String getRut() {
        return this.rut;
    }
    
    public void setRut(String rut) {
        this.rut = rut;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CUENTA_ID_CUENTA", unique=true, nullable=false)
    public Cuentas getCuentas() {
        return this.cuentas;
    }
    
    public void setCuentas(Cuentas cuentas) {
        this.cuentas = cuentas;
    }

    
    @Column(name="EMAIL_USUARIO", nullable=false, length=200)
    public String getEmailUsuario() {
        return this.emailUsuario;
    }
    
    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    
    @Column(name="CELULAR_USUARIO", nullable=false, precision=10, scale=0)
    public long getCelularUsuario() {
        return this.celularUsuario;
    }
    
    public void setCelularUsuario(long celularUsuario) {
        this.celularUsuario = celularUsuario;
    }

    
    @Column(name="NOMBRE_USUARIO", nullable=false, length=200)
    public String getNombreUsuario() {
        return this.nombreUsuario;
    }
    
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    
    @Column(name="APELLIDO_USUARIO", nullable=false, length=200)
    public String getApellidoUsuario() {
        return this.apellidoUsuario;
    }
    
    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    
    @Column(name="EDAD_USUARIO", nullable=false, precision=3, scale=0)
    public short getEdadUsuario() {
        return this.edadUsuario;
    }
    
    public void setEdadUsuario(short edadUsuario) {
        this.edadUsuario = edadUsuario;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="usuarios")
    public Set<Productores> getProductoreses() {
        return this.productoreses;
    }
    
    public void setProductoreses(Set<Productores> productoreses) {
        this.productoreses = productoreses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="usuarios")
    public Set<Compradores> getCompradoreses() {
        return this.compradoreses;
    }
    
    public void setCompradoreses(Set<Compradores> compradoreses) {
        this.compradoreses = compradoreses;
    }




}

