package omi.siac.cts.output.cta.v2_11_b.enums;

import java.util.Optional;

/**
 * Reflects whether a held trade qualifies for the Participant or Consolidated Last Price at the time it is disseminated
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum HeldTradeIndicator {

    /**
     * Held Trade Indicator Not Applicable
     */
    HELD_TRADE_INDICATOR_NOT_APPLICABLE(' ', "Held Trade Indicator Not Applicable"),

    /**
     * Held Trade Not A Last Sale For Participant Or Consolidated
     */
    HELD_TRADE_NOT_A_LAST_SALE_FOR_PARTICIPANT_OR_CONSOLIDATED('A', "Held Trade Not A Last Sale For Participant Or Consolidated"),

    /**
     * Held Trade Last Sale For Participant But Not Consolidated
     */
    HELD_TRADE_LAST_SALE_FOR_PARTICIPANT_BUT_NOT_CONSOLIDATED('B', "Held Trade Last Sale For Participant But Not Consolidated"),

    /**
     * Held Trade Last Sale For Participant And Consolidated
     */
    HELD_TRADE_LAST_SALE_FOR_PARTICIPANT_AND_CONSOLIDATED('C', "Held Trade Last Sale For Participant And Consolidated");

    private final char wire;

    private final String description;

    HeldTradeIndicator(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
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
    public static Optional<HeldTradeIndicator> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(HELD_TRADE_INDICATOR_NOT_APPLICABLE);
            case 'A' -> Optional.of(HELD_TRADE_NOT_A_LAST_SALE_FOR_PARTICIPANT_OR_CONSOLIDATED);
            case 'B' -> Optional.of(HELD_TRADE_LAST_SALE_FOR_PARTICIPANT_BUT_NOT_CONSOLIDATED);
            case 'C' -> Optional.of(HELD_TRADE_LAST_SALE_FOR_PARTICIPANT_AND_CONSOLIDATED);
            default -> Optional.empty();
        };
    }
}
