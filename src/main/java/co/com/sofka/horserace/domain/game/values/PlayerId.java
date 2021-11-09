package co.com.sofka.horserace.domain.game.values;

import co.com.sofka.domain.generic.Identity;

public class PlayerId extends Identity {

    public PlayerId(){
    }

    private PlayerId(String id){
        super(id);
    }

    public static PlayerId  of(String id){
        return new PlayerId(id);
    }
}
