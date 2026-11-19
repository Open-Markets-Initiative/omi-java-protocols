package omi.moex.spectra.optinfoincremental.simba.v9_9_0.enums;

import java.util.Optional;

/**
 * HaltType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum HaltType {

    /**
     * Empty all halts on client
     */
    EMPTY_HALTS((short) 0, "Empty all halts on client"),

    /**
     * Session
     */
    SESSION((short) 1, "Session"),

    /**
     * Section
     */
    SECTION((short) 2, "Section"),

    /**
     * Section and trade mode
     */
    SECTION_AND_TRADE_MODE((short) 3, "Section and trade mode"),

    /**
     * Futures base contract
     */
    FUT_BASE_CONTRACT((short) 4, "Futures base contract"),

    /**
     * Instruments from trade mode
     */
    INSTRUMENTS_FROM_TRADE_MODE((short) 5, "Instruments from trade mode"),

    /**
     * Instruments from trade mode and futures base contract
     */
    INSTRUMENTS_FROM_TRADE_MODE_AND_FUT_BASE_CONTRACT((short) 6, "Instruments from trade mode and futures base contract"),

    /**
     * Group instruments
     */
    GROUP_INSTRUMENTS((short) 7, "Group instruments"),

    /**
     * Group instruments and futures base contract
     */
    GROUP_INSTRUMENTS_AND_FUT_BASE_CONTRACT((short) 8, "Group instruments and futures base contract");

    private final short wire;

    private final String description;

    HaltType(short wire, String description) {
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
    public static Optional<HaltType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(EMPTY_HALTS);
            case 1 -> Optional.of(SESSION);
            case 2 -> Optional.of(SECTION);
            case 3 -> Optional.of(SECTION_AND_TRADE_MODE);
            case 4 -> Optional.of(FUT_BASE_CONTRACT);
            case 5 -> Optional.of(INSTRUMENTS_FROM_TRADE_MODE);
            case 6 -> Optional.of(INSTRUMENTS_FROM_TRADE_MODE_AND_FUT_BASE_CONTRACT);
            case 7 -> Optional.of(GROUP_INSTRUMENTS);
            case 8 -> Optional.of(GROUP_INSTRUMENTS_AND_FUT_BASE_CONTRACT);
            default -> Optional.empty();
        };
    }
}
