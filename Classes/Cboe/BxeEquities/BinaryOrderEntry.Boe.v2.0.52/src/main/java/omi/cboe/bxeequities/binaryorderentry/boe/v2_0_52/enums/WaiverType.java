package omi.cboe.bxeequities.binaryorderentry.boe.v2_0_52.enums;

import java.util.Optional;

/**
 * Defines the WaiverType values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum WaiverType {

    /**
     * No Waiver Type
     */
    NO_WAIVER_TYPE('-', "No Waiver Type"),

    /**
     * Negotiated Trade in Liquid Instrument (NLIQ)
     */
    NEGOTIATED_TRADE_IN_LIQUID_INSTRUMENT('0', "Negotiated Trade in Liquid Instrument (NLIQ)"),

    /**
     * Negotiated Trade in Illiquid Instrument (OILQ)
     */
    NEGOTIATED_TRADE_IN_ILLIQUID_INSTRUMENT('1', "Negotiated Trade in Illiquid Instrument (OILQ)"),

    /**
     * Negotiated Trade Subject to Conditions Other Than the Current Market Price (PRIC)
     */
    NEGOTIATED_TRADE_SUBJECT_TO_CONDITIONS_OTHER_THAN_THE('2', "Negotiated Trade Subject to Conditions Other Than the Current Market Price (PRIC)"),

    /**
     * Reference Price (Dark Book) (RFPT) (Pre-Trade Trans- parency Waiver)
     */
    REFERENCE_PRICE('3', "Reference Price (Dark Book) (RFPT) (Pre-Trade Trans- parency Waiver)"),

    /**
     * Order Management Facility (Iceberg) (Pre-Trade Trans- parency Waiver)
     */
    ORDER_MANAGEMENT_FACILITY('A', "Order Management Facility (Iceberg) (Pre-Trade Trans- parency Waiver)"),

    /**
     * Large In Scale (Pre-Trade Transparency Waiver)
     */
    LARGE_IN_SCALE('9', "Large In Scale (Pre-Trade Transparency Waiver)");

    private final char wire;

    private final String description;

    WaiverType(char wire, String description) {
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
    public static Optional<WaiverType> fromWire(char wire) {
        return switch (wire) {
            case '-' -> Optional.of(NO_WAIVER_TYPE);
            case '0' -> Optional.of(NEGOTIATED_TRADE_IN_LIQUID_INSTRUMENT);
            case '1' -> Optional.of(NEGOTIATED_TRADE_IN_ILLIQUID_INSTRUMENT);
            case '2' -> Optional.of(NEGOTIATED_TRADE_SUBJECT_TO_CONDITIONS_OTHER_THAN_THE);
            case '3' -> Optional.of(REFERENCE_PRICE);
            case 'A' -> Optional.of(ORDER_MANAGEMENT_FACILITY);
            case '9' -> Optional.of(LARGE_IN_SCALE);
            default -> Optional.empty();
        };
    }
}
