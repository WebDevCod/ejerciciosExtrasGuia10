package entidad;

public class Ciudad {
    private String nombre;
    private String codPostal;

    public Ciudad() {
    }

    public Ciudad(String nombre, String codPostal) {
        this.nombre = nombre;
        this.codPostal = codPostal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "nombre=" + nombre + ", codPostal=" + codPostal + '}';
    }
    
    
}
