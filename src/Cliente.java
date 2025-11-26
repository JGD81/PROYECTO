
public class Cliente {
    
    private int id;
    private String nombre;
    private String direccion;
    private String DNI;
    private String correo;

    //Constructor
    public Cliente (int id, String nombre, String direccion, String DNI, String correo){
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.DNI = DNI;
        this.correo = correo;
    }

    //Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    public String getDireccion() {
        return direccion;
    }

    public String getDNI() {
        return DNI;
    }

    public String getCorreo() {
        return correo;
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }    
    
}
