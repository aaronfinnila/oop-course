                public class Esiintyja {
                    private String nimi;
                    private String tunniste;
                    private String erityisala;
                    private double palkkiosaldo;

                    public Esiintyja(String nimi, String tunniste, String erityisala, double palkkiosaldo) {
                        this.nimi = nimi;
                        this.tunniste = tunniste;
                        this.erityisala = erityisala;
                        this.palkkiosaldo = palkkiosaldo;
                    }

                    public String getNimi() {
                        return nimi;
                    }

                    public void setNimi(String nimi) {
                        this.nimi = nimi;
                    }

                    public String getTunniste() {
                        return tunniste;
                    }

                    public void setTunniste(String tunniste) {
                        this.tunniste = tunniste;
                    }

                    public String getErityisala() {
                        return erityisala;
                    }

                    public void setErityisala(String erityisala) {
                        this.erityisala = erityisala;
                    }

                    public double getPalkkiosaldo() {
                        return palkkiosaldo;
                    }

                    public void setPalkkiosaldo(double palkkiosaldo) {
                        this.palkkiosaldo = palkkiosaldo;
                    }

                }

                public class Asiakas {
                    private String nimi;
                    private String tunniste;

                    public Asiakas(String nimi, String tunniste) {
                        this.nimi = nimi;
                        this.tunniste = tunniste;
                    }

                    public String tunniste() {
                        return tunniste;
                    }
    
                    public void setTunniste(String tunniste) {
                        this.tunniste = tunniste;
                    }
    
                    public String getNimi() {
                        return nimi;
                    }
    
                    public void setNimi(String nimi) {
                        this.nimi = nimi;
                    }
                }

                public class Tilaisuus {
                    private Asiakas asiakas;
                    private Esiintyja esiintyja;
                    private String tyyppi;
                    private double palkkio;
                    
                    public Tilaisuus(Asiakas asiakas, Esiintyja esiintyja, String tyyppi, double palkkio) {
                        this.asiakas = asiakas;
                        this.esiintyja = esiintyja;
                        this.tyyppi = tyyppi;
                        this.palkkio = palkkio;
                    }

                    public Asiakas getAsiakas() {
                        return asiakas;
                    }

                    public void setAsiakas(Asiakas asiakas) {
                        this.asiakas = asiakas;
                    }

                    public Esiintyja getEsiintyja() {
                        return esiintyja;
                    }

                    public void setEsiintyja(Esiintyja esiintyja) {
                        this.esiintyja = esiintyja;
                    }

                    public String getTyyppi() {
                        return tyyppi;
                    }

                    public void setTyyppi(String tyyppi) {
                        this.tyyppi = tyyppi;
                    }

                    public double getPalkkio() {
                        return palkkio;
                    }

                    public void setPalkkio(double palkkio) {
                        this.palkkio = palkkio;
                    }
                }

                public class Sovellus {
                    private ArrayList<Asiakas> asiakkaat;
                    private ArrayList<Esiintyja> esiintyjat;
                    private ArrayList<Tilaisuus> tilaisuudet;
                }
