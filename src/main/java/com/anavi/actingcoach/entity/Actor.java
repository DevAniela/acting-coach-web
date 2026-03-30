package com.anavi.actingcoach.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="actors")
public class Actor {

    @Id // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment ID
    private int id;

    private String name;
    private String email;
    private String password;
    private String role;
    private int pointsEarned;

    @OneToMany(mappedBy = "actor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CharacterSheet> characterSheets = new ArrayList<>();

    // TODO when building the scheduling and journal features
    // private List<Session> sessions;
    // private List<JournalEntry> journalEntries;
    // private List<Improvisation> improvisations;
    // private List<Invoice> invoiceHistory;

    //--- CONSTRUCTORS ---

    public Actor() {
    }

    public Actor(String name, String email, String password, String role) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
        this.pointsEarned = 0;
    }

    // --- GETTERS AND SETTERS ---

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public int getPointsEarned() { return pointsEarned; }
    public void setPointsEarned(int pointsEarned) { this.pointsEarned = pointsEarned; }

    public List<CharacterSheet> getCharacterSheets() { return characterSheets; }
    public void setCharacterSheets(List<CharacterSheet> characterSheets) { this.characterSheets = characterSheets; }

}
