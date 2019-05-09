package aponte.proyectos.mypaginasamarillas.models;

public class Company {

    private Integer id;
    private String nombre;
    private String info;
    private String direccion;
    private Integer telefono;
    private String categoria;
    private String email;
    private String url;
    private String picture;

    public Company() {
    }

    public Company(Integer id, String nombre, String info, String direccion, Integer telefono, String categoria, String email, String url, String picture) {
        this.id = id;
        this.nombre = nombre;
        this.info = info;
        this.direccion = direccion;
        this.telefono = telefono;
        this.categoria = categoria;
        this.email = email;
        this.url = url;
        this.picture = picture;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", info='" + info + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                ", categoria='" + categoria + '\'' +
                ", email='" + email + '\'' +
                ", url='" + url + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }
}
