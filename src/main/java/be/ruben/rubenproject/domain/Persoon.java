package be.ruben.rubenproject.domain;

import java.time.LocalDate;

public class Persoon {

    private final String voornaam;
    private final String familienaam;
    private final int aantalKinderen;

    private final boolean gehuwd;
    private final LocalDate geboorte;
    private final Adres adres;

    public Persoon(String voornaam, String familienaam, int aantalKinderen, boolean gehuwd, LocalDate geboorte, Adres adres) {
        this.voornaam = voornaam;
        this.familienaam = familienaam;
        this.aantalKinderen = aantalKinderen;
        this.gehuwd = gehuwd;
        this.geboorte = geboorte;
        this.adres = adres;
    }

    public String getNaam(){
        return voornaam +  ' ' + familienaam;
    }
}
