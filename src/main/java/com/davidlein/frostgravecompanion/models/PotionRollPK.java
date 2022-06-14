package com.davidlein.frostgravecompanion.models;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PotionRollPK implements Serializable
{
    private Long firstRoll;
    private Long secondRoll;
}
