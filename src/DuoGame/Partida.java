
package DuoGame;


public class Partida {
    
    String contraseña; //unirse
    String jugador1;
    String jugador2; 
    int monedas; //apuesta
    int correctas; // buenas
    boolean respuesta; //tuerno

    public String getJugador1() {
        return jugador1;
    }

    public void setJugador1(String jugador1) {
        this.jugador1 = jugador1;
    }

    public String getJugador2() {
        return jugador2;
    }

    public void setJugador2(String jugador2) {
        this.jugador2 = jugador2;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getMonedas() {
        return monedas;
    }

    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }

    public int getCorrectas() {
        return correctas;
    }

    public void setCorrectas(int correctas) {
        this.correctas = correctas;
    }

    public boolean getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(boolean respuesta) {
        this.respuesta = respuesta;
    }
    
    
}
