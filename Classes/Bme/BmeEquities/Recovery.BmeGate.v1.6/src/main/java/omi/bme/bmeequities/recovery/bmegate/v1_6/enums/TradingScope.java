package omi.bme.bmeequities.recovery.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Trading Scope
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradingScope {

    /**
     * Valencia
     */
    VALENCIA((short) 1, "Valencia"),

    /**
     * Bilbao
     */
    BILBAO((short) 2, "Bilbao"),

    /**
     * Valencia And Bilbao
     */
    VALENCIA_AND_BILBAO((short) 3, "Valencia And Bilbao"),

    /**
     * Barcelona
     */
    BARCELONA((short) 4, "Barcelona"),

    /**
     * Valencia And Barcelona
     */
    VALENCIA_AND_BARCELONA((short) 5, "Valencia And Barcelona"),

    /**
     * Bilbao And Barcelona
     */
    BILBAO_AND_BARCELONA((short) 6, "Bilbao And Barcelona"),

    /**
     * Valencia Bilbao And Barcelona
     */
    VALENCIA_BILBAO_AND_BARCELONA((short) 7, "Valencia Bilbao And Barcelona"),

    /**
     * Madrid
     */
    MADRID((short) 8, "Madrid"),

    /**
     * Valencia And Madrid
     */
    VALENCIA_AND_MADRID((short) 9, "Valencia And Madrid"),

    /**
     * Bilbao And Madrid
     */
    BILBAO_AND_MADRID((short) 10, "Bilbao And Madrid"),

    /**
     * Valencia Bilbao And Madrid
     */
    VALENCIA_BILBAO_AND_MADRID((short) 11, "Valencia Bilbao And Madrid"),

    /**
     * Barcelona And Madrid
     */
    BARCELONA_AND_MADRID((short) 12, "Barcelona And Madrid"),

    /**
     * Valencia Barcelona And Madrid
     */
    VALENCIA_BARCELONA_AND_MADRID((short) 13, "Valencia Barcelona And Madrid"),

    /**
     * Bilbao Barcelona And Madrid
     */
    BILBAO_BARCELONA_AND_MADRID((short) 14, "Bilbao Barcelona And Madrid"),

    /**
     * Valencia Bilbao Barcelona And Madrid
     */
    VALENCIA_BILBAO_BARCELONA_AND_MADRID((short) 15, "Valencia Bilbao Barcelona And Madrid");

    private final short wire;

    private final String description;

    TradingScope(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
        return wire;
    }

    /**
     * Returns the description the protocol specification gives this value.
     *
     * @return the description
     */
    public String description() {
        return description;
    }

    /**
     * Returns the value with the given wire encoding.
     *
     * @param wire the encoding read from the wire
     * @return the matching value, or empty when the protocol declares no value for it
     */
    public static Optional<TradingScope> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(VALENCIA);
            case 2 -> Optional.of(BILBAO);
            case 3 -> Optional.of(VALENCIA_AND_BILBAO);
            case 4 -> Optional.of(BARCELONA);
            case 5 -> Optional.of(VALENCIA_AND_BARCELONA);
            case 6 -> Optional.of(BILBAO_AND_BARCELONA);
            case 7 -> Optional.of(VALENCIA_BILBAO_AND_BARCELONA);
            case 8 -> Optional.of(MADRID);
            case 9 -> Optional.of(VALENCIA_AND_MADRID);
            case 10 -> Optional.of(BILBAO_AND_MADRID);
            case 11 -> Optional.of(VALENCIA_BILBAO_AND_MADRID);
            case 12 -> Optional.of(BARCELONA_AND_MADRID);
            case 13 -> Optional.of(VALENCIA_BARCELONA_AND_MADRID);
            case 14 -> Optional.of(BILBAO_BARCELONA_AND_MADRID);
            case 15 -> Optional.of(VALENCIA_BILBAO_BARCELONA_AND_MADRID);
            default -> Optional.empty();
        };
    }
}
