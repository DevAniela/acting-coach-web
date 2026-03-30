package com.anavi.actingcoach.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="character_sheets")
public class CharacterSheet {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="actor_id")
    private Actor actor;

    private String characterName;

    @ElementCollection
    private List<String> personalityTraits = new ArrayList<>();

    @ElementCollection
    private List<String> physicalTraits = new ArrayList<>();

    @Column(ColumnDefinition = "TEXT")
    private String background;
    private String motivation;

    @Column(ColumnDefiniton = "TEXT")
    private String notes;

    //--- CONSTRUCTORS ---

    public CharacterSheet() {
    }

    public CharacterSheet(String characterName, List<String> personalityTraits, List<String> physicalTraits, String background, String motivation, String notes) {
        this.characterName = characterName;
        this.personalityTraits = personalityTraits;
        this.physicalTraits = physicalTraits;
        this.background = background;
        this.motivation = motivation;
        this.notes = notes;
    }

    //--- GETTERS AND SETTERS ---

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getCharacterName() { return characterName; }
    public void setCharacterName(String characterName) { this.characterName = characterName; }

    public List<String> getPersonalityTraits() { return personalityTraits; }
    public void setPersonalityTraits(List<String> personalityTraits) { this.personalityTraits = personalityTraits; }

    public List<String> getPhysicalTraits() { return physicalTraits; }
    public void setPhysicalTraits(List<String> physicalTraits) { this.physicalTraits = physicalTraits; }

    public String getBackground() { return background; }
    public void setBackground(String background) { this.background = background; }

    public String getMotivation() { return motivation; }
    public void setMotivation(String motivation) { this.motivation = motivation; }

    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }

    public Actor getActor() { return actor; }
    public void setActor(Actor actor) { this.actor = actor; }

}
