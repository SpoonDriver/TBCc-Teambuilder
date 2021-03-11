package dev.academy.tbc.entities;
/*
*  This enum contains the classes that can be send in trough the api,
* we decided to use enums to lessen the risk of api bugs with typing errors.
* We can check trough the sql database and see that the roles type is defined as a number,
* that number corresponds to this list and starts from 0, example : 0 = druid, 5 = hunter etc.
*/


public enum Classes {
    DRUID,
    HUNTER,
    MAGE,
    PALADIN,
    PRIEST,
    ROUGE,
    SHAMAN,
    WARLOCK,
    WARRIOR
}
