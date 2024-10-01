package tp1.tp4.ej2;

class Alumno extends Persona {
    private int legajo;
    private String nombreCompleto;

    
    public static final RangoDeEnteros RANGO_NRO_DOCUMENTO = new RangoDeEnteros(1000000, 99999999);
    public static final RangoDeEnteros RANGO_ANIO_NACIMIENTO = new RangoDeEnteros(1900, 2019);

 
    public Alumno(int legajo, String nombreCompleto, int anioNacimiento, boolean vive) {
        super(vive);

       
        if (!RANGO_NRO_DOCUMENTO.contiene(legajo)) {
            throw new IllegalArgumentException("El legajo debe estar entre 1000000 y 99999999.");
        }

   
        if (!RANGO_ANIO_NACIMIENTO.contiene(anioNacimiento)) {
            throw new IllegalArgumentException("El año de nacimiento debe estar entre 1900 y 2019.");
        }

        this.legajo = legajo;
        this.nombreCompleto = nombreCompleto;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "legajo=" + legajo +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", vive=" + vive() +
                '}';
    }
}
