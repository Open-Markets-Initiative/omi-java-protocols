package omi.eurex.t7.xti.fbe.v13_1.enums;

import java.util.Optional;

/**
 * Defines the RespondentType values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum RespondentType {

    /**
     * Respondents specified by requestor
     */
    SPECIFIEDMARKETPARTICIPANTS((short) 2, "Respondents specified by requestor"),

    /**
     * Respondents specified by requestor and SmartRfQ processing
     */
    SPECIFIEDAND_SMART_RF_QSELECTEDPARTICIPANTS((short) 100, "Respondents specified by requestor and SmartRfQ processing"),

    /**
     * Respondents specified by SmartRfQ processing
     */
    SMART_RF_QSELECTEDPARTICIPANTS((short) 101, "Respondents specified by SmartRfQ processing"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    RespondentType(short wire, String description) {
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
    public static Optional<RespondentType> fromWire(short wire) {
        return switch (wire) {
            case 2 -> Optional.of(SPECIFIEDMARKETPARTICIPANTS);
            case 100 -> Optional.of(SPECIFIEDAND_SMART_RF_QSELECTEDPARTICIPANTS);
            case 101 -> Optional.of(SMART_RF_QSELECTEDPARTICIPANTS);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
