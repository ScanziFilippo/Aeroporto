import java.util.Iterator;
import java.util.HashMap;
/**
 * <p>Classe della torre di controllo</p>
 */
public class TorreDiControllo
{
    HashMap<String,Aereo> aerei = new HashMap<>();
    Aeroporto aeroporto;
    public TorreDiControllo(Aeroporto aeroporto)
    {
        this.aeroporto = aeroporto;
    }
    /**
     * <p>Genera 6 aerei in aria e 1 a terra</p>
     */
    public void generaAerei(){
        Aereo sette47 = new Aereo("Boeing 747", Stato.inAria, aeroporto);
        Aereo a380 = new Aereo("Airbus A380", Stato.aTerra, aeroporto);
        aerei.put(sette47.codice, sette47);
        aerei.put(a380.codice, a380);
        sette47.start();
        a380.start(); 
        for(int i = 0;i < 5; i++){
            Aereo aereo = new Aereo(Stato.inAria, aeroporto);
            aerei.put(aereo.codice, aereo);
            aereo.start();
        }
    }
}
