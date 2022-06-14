package com.davidlein.frostgravecompanion.models;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class SpellRollPK implements Serializable
{
    private Long firstRoll;
    private Long secondRoll;
}
