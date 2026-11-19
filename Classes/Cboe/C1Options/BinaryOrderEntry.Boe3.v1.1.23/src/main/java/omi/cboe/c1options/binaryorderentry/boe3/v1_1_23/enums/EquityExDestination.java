package omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.enums;

import java.util.Optional;

/**
 * Valid when an equity symbol is present in the complex instrument
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EquityExDestination {

    /**
     * Td Securities Usa Llc Default
     */
    TD_SECURITIES_USA_LLC_DEFAULT('C', "Td Securities Usa Llc Default"),

    /**
     * Penserra Via Nyse Chicago
     */
    PENSERRA_VIA_NYSE_CHICAGO('P', "Penserra Via Nyse Chicago"),

    /**
     * Fog Equities Via Nyse Chicago
     */
    FOG_EQUITIES_VIA_NYSE_CHICAGO('F', "Fog Equities Via Nyse Chicago"),

    /**
     * Libucki Via Nyse Chicago
     */
    LIBUCKI_VIA_NYSE_CHICAGO('L', "Libucki Via Nyse Chicago"),

    /**
     * Srt Securities Via Nyse Chicago
     */
    SRT_SECURITIES_VIA_NYSE_CHICAGO('S', "Srt Securities Via Nyse Chicago");

    private final char wire;

    private final String description;

    EquityExDestination(char wire, String description) {
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
    public static Optional<EquityExDestination> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(TD_SECURITIES_USA_LLC_DEFAULT);
            case 'P' -> Optional.of(PENSERRA_VIA_NYSE_CHICAGO);
            case 'F' -> Optional.of(FOG_EQUITIES_VIA_NYSE_CHICAGO);
            case 'L' -> Optional.of(LIBUCKI_VIA_NYSE_CHICAGO);
            case 'S' -> Optional.of(SRT_SECURITIES_VIA_NYSE_CHICAGO);
            default -> Optional.empty();
        };
    }
}
