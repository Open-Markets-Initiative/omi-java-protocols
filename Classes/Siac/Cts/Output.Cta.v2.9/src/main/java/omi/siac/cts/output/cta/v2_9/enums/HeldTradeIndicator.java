package omi.siac.cts.output.cta.v2_9.enums;

import java.util.Optional;

/**
 * The Held Trade Indicator reflects whether this trade qualifies for the Participant or Consolidated Last Price at the time it is disseminated
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum HeldTradeIndicator {

    /**
     * Not Applicable
     */
    NOT_APPLICABLE(' ', "Not Applicable"),

    /**
     * Cannot Be Used As A Last Sale For Both Participant And Consolidated Basis
     */
    CANNOT_BE_USED_AS_A_LAST_SALE_FOR_BOTH_PARTICIPANT_AND_CONSOLIDATED_BASIS('A', "Cannot Be Used As A Last Sale For Both Participant And Consolidated Basis"),

    /**
     * Can Be Used As A Last Sale For Participant But Not Consolidated Basis
     */
    CAN_BE_USED_AS_A_LAST_SALE_FOR_PARTICIPANT_BUT_NOT_CONSOLIDATED_BASIS('B', "Can Be Used As A Last Sale For Participant But Not Consolidated Basis"),

    /**
     * Can Be Used As A Last Sale For Participant And Consolidated Basis
     */
    CAN_BE_USED_AS_A_LAST_SALE_FOR_PARTICIPANT_AND_CONSOLIDATED_BASIS('C', "Can Be Used As A Last Sale For Participant And Consolidated Basis");

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
            case ' ' -> Optional.of(NOT_APPLICABLE);
            case 'A' -> Optional.of(CANNOT_BE_USED_AS_A_LAST_SALE_FOR_BOTH_PARTICIPANT_AND_CONSOLIDATED_BASIS);
            case 'B' -> Optional.of(CAN_BE_USED_AS_A_LAST_SALE_FOR_PARTICIPANT_BUT_NOT_CONSOLIDATED_BASIS);
            case 'C' -> Optional.of(CAN_BE_USED_AS_A_LAST_SALE_FOR_PARTICIPANT_AND_CONSOLIDATED_BASIS);
            default -> Optional.empty();
        };
    }
}
