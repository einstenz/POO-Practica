
/**
 * Write a description of class AtraccionTipo here.
 *
 * @author (Samuel Alarco)
 * @version (v1.0)
 */

import java.util.List;
import java.util.LinkedList;
public class AtraccionB implements AtraccionIF
{
    private String tipo;
    private boolean accesoVIP;
    private float minAlturaCM, maxAlturaCM;
    private int minEdad;
    private boolean accesoNiños;
    private boolean accesoAdultos;
    private int numRespAtracc;
    private int numAyuAtracc;
    private int contador;

    private List trabajadores;
    private List usuarios;

    /**
     * Constructor for objects of class AtraccionTipo
     */
    public AtraccionB()
    {
        this.tipo = "B";
        trabajadores =  new LinkedList<Trabajador>();
        usuarios =  new LinkedList<EntradaIF>();
        // Valores default
        accesoVIP = true;
        minAlturaCM = 120; // no minimo de altura
        maxAlturaCM = 190;
        minEdad = 0; // no minimo de edad;
        accesoNiños = false;
        accesoAdultos = true;
        numRespAtracc = 1;
        numAyuAtracc = 5;
    }

    public String getTipo()
    {
      return this.tipo;
    }

    public boolean getVIP()
    {
        return accesoVIP;
    }

    public void setVIP(boolean VIP)
    {
        this.accesoVIP = VIP;
    }

    public float getMinAlturaCM()
    {
        return this.minAlturaCM;
    }

    public void setMinAlturaCM(float min)
    {
        this.minAlturaCM = min;
    }

     public float getMaxAlturaCM()
    {
        return this.maxAlturaCM;
    }

    public void setMaxAlturaCM(float max)
    {
        this.maxAlturaCM = max;
    }

    public int getEdad()
    {
        return this.minEdad;
    }

    public void setMinEdad(int min)
    {
        this.minEdad = min;
    }

    public boolean getAccesoNiños()
    {
        return this.accesoNiños;
    }

    public void setAccesoNiños(boolean acceso)
    {
        this.accesoNiños= acceso;
    }

    public void setAccesoAdultos(boolean acceso)
    {
        this.accesoAdultos= acceso;
    }

    public boolean getAccesoAdultos()
    {
        return this.accesoAdultos;
    }

    public void setNumRespAtracc(int num)
    {
        this.numRespAtracc = num;
    }

    public int getNumRespAtracc()
    {
        return numRespAtracc;
    }

    public void setNumAyuAtracc(int num)
    {
        numAyuAtracc = num;
    }

    public int getNumAyuAtracc()
    {
        return numAyuAtracc;
    }

    public void addTrabajador(Trabajador trabajador)
    {
        trabajadores.add(trabajador);
    }

    public void usar(EntradaIF entrada)
    {
        contador++;
        if (!(((entrada instanceof Niño) && !getAccesoNiños()) || (!(entrada instanceof Niño) && !getAccesoAdultos())))
        {
            usuarios.add(entrada);
            //System.out.println("Acceso permitido a la atraccion");
        }
        else
        {
            //System.out.println("Acceso denegado a la atraccion");
        }
    }

    public List getUsuarios()
    {
      return this.usuarios;
    }

    public List getTrabajadores()
    {
      return trabajadores;
    }

}
