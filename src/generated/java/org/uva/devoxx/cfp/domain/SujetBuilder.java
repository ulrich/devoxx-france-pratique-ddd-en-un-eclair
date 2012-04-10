package org.uva.devoxx.cfp.domain;


/**
  * Builder for Sujet class.
  */
public class SujetBuilder {
    private String titre;
    private String resume;
    private Theme theme;

    public SujetBuilder() {
    }

    /**
     * Static factor method for SujetBuilder
     */
    public static SujetBuilder sujet() {
        return new SujetBuilder();
    }

    public SujetBuilder titre(String val) {
        this.titre = val;
        return this;
    }

    public SujetBuilder resume(String val) {
        this.resume = val;
        return this;
    }

    public SujetBuilder theme(Theme theme) {
        this.theme = theme;
        return this;
    }

    public String getTitre() {
        return titre;
    }

    public String getResume() {
        return resume;
    }

    public Theme getTheme() {
        return theme;
    }

    /**
     * @return new Sujet instance constructed based on the values that have been set into this builder
     */
    public Sujet build() {
        Sujet obj = new Sujet();

        obj.setTitre(titre);

        obj.setResume(resume);

        obj.setTheme(theme);

        return obj;
    }
}
