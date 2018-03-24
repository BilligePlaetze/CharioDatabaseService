package de.opencodes.chario.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Love {

    @Id
    private String name;

    private String love;

    public String getLove() {
        return love;
    }

    public Love setLove(String love) {
        this.love = love;
        return this;
    }

    public String getName() {
        return name;
    }

    public Love setName(String name) {
        this.name = name;
        return this;
    }
}

