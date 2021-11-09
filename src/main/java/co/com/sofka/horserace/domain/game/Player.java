package co.com.sofka.horserace.domain.game;


import co.com.sofka.domain.generic.Entity;
import co.com.sofka.horserace.domain.game.values.LevelPlayer;
import co.com.sofka.horserace.domain.game.values.Name;
import co.com.sofka.horserace.domain.game.values.PlayerId;

public class Player extends Entity<PlayerId> {

    private final Name name;
    private final LevelPlayer level;


    public Player(PlayerId entityId, Name name, LevelPlayer level) {
        super(entityId);
        this.name = name;
        this.level = level;
    }

    public Name name() {
        return name;
    }

    public LevelPlayer level() {
        return level;
    }
}
