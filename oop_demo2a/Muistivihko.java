import java.util.ArrayList;

public class Muistivihko { /**
 * Muistivihko, jonka nimeä ja omistajan nimeä voi vaihtaa
 * ja johon voi lisätä muistiinpanoja
 */
    private String nimi;
    private String omistaja;
    private ArrayList<String> muistiinpanot;

    /**
     * Luokan konstruktori, jossa parametreina nimi ja omistaja
     * @param nimi merkkijono, muistivihkon nimi
     * @param omistaja merkkijono, muistivihkon omistajan nimi
     */

    public Muistivihko(String nimi, String omistaja) {
        this.nimi = nimi;
        this.omistaja = omistaja;
        muistiinpanot = new ArrayList<>();
    }

    /**
     * Metodi palauttaa muistivihkon nimen
     * @return nimi joka palautetaan
     */
    public String getNimi() {
        return nimi;
    }

    /**
     * Metodi asettaa uuden nimen
     * @param nimi uusi asetettava nimi
     */

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    /**
     * Metodi palauttaa omistajan nimen
     * @return omistajan nimi joka palautetaan
     */

    public String getOmistaja() {
        return omistaja;
    }

    /**
     * asetta uuden nimen omistajalle
     * @param omistaja omistajan uusi nimi
     */
    public void setOmistaja(String omistaja) {
        this.omistaja = omistaja;
    }

    /**
     * lisää uuden muistiinpanon muistiinpanot-listaan
     * @param viesti viesti (muistiinpano) joka lisätään listaan
     */
    public void lisaaMuistiinpano(String viesti) {
        this.muistiinpanot.add(viesti);
    }

    /**
     * palauttaa muistiinpanojen määrän
     * @return palauttaa numeron
     */
    public int muistiinpanoja() {
        return muistiinpanot.size();
    }

    /**
     * tulostaa muistiinpanot
     */
    public void tulostaMuistiinpanot() {
        for(String viesti : muistiinpanot) {
            System.out.println(viesti);
        }
    }
}
