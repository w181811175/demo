package com.example.animal;

/**
 * @author wangling
 */
public enum RoosterLanguage {

    /**
     * Danish
     */
    Danish("Danish","kykyliky"),
    Dutch("Dutch","kukeleku"),
    Finnish("Finnish","kukko kiekuu"),
    French("French","cocorico"),
    German("German","kikeriki"),
    Greek("Greek","kikiriki"),
    Hebrew("Hebrew","coo- koo - ri-koo"),
    Hungarian("Hungarian","kukuriku"),
    Italian("Italian","chicchirichi"),
    Japanese("Japanese","ko - ke - kok - ko -o"),
    Portuguese("Portuguese","cucurucu"),
    Russian("Russian","kukareku"),
    Swedish("Swedish","kuckeliku"),
    Turkish("Turkish","kuk-kurri-kuuu"),
    Urdu("Urdu","kuklooku");


    /**
     * language
     */
    public String language;

    /**
     * sound
     */
    public String sound;

    RoosterLanguage(String language, String sound) {
        this.language = language;
        this.sound = sound;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public static String getSound(String language) {
        RoosterLanguage roosterLanguage = RoosterLanguage.valueOf(language);
        if(roosterLanguage != null){
            return roosterLanguage.getSound();
        }
        return "";
    }

}
