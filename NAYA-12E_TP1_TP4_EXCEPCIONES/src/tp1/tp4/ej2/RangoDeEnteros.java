package tp1.tp4.ej2;

class RangoDeEnteros {
    private int min;
    private int max;

    public RangoDeEnteros(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public boolean contiene(int valor) {
        return valor >= min && valor <= max;
    }
}

