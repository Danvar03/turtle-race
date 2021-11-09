package co.com.sofka.horserace.domain.game.values;

import co.com.sofka.domain.generic.Identity;

public class HorseId extends Identity {

    public HorseId(){
    }

    private HorseId(String id){
        super(id);
    }

    public static HorseId of(String id){
        return new HorseId(id);
    }
}
