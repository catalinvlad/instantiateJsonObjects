package eu.javaca.playground.simple.example;

import eu.javaca.playground.Pojo;

public class Hobby extends Pojo {
    private String type;
    private Integer proficiencyLevel;
    private Integer timePracticing;
    private String name;
    private Boolean requiresSuit;
    private Integer eloRating;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getProficiencyLevel() {
        return proficiencyLevel;
    }

    public void setProficiencyLevel(Integer proficiencyLevel) {
        this.proficiencyLevel = proficiencyLevel;
    }

    public Integer getTimePracticing() {
        return timePracticing;
    }

    public void setTimePracticing(Integer timePracticing) {
        this.timePracticing = timePracticing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getRequiresSuit() {
        return requiresSuit;
    }

    public void setRequiresSuit(Boolean requiresSuit) {
        this.requiresSuit = requiresSuit;
    }

    public Integer getEloRating() {
        return eloRating;
    }

    public void setEloRating(Integer eloRating) {
        this.eloRating = eloRating;
    }
}
