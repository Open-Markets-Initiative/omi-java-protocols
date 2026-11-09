package omi.siac.opra.output.obi.v6_2.enums;

import java.util.Optional;

/**
 * ASCII character that identifies the Participant or Processor that initiated the message.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ParticipantId {

    /**
     * NYSE American
     */
    AMEX('A', "NYSE American"),

    /**
     * Boston Options Exchange
     */
    BOX('B', "Boston Options Exchange"),

    /**
     * Cboe Options Exchange
     */
    CBOE('C', "Cboe Options Exchange"),

    /**
     * MIAX Emerald
     */
    EMERALD('D', "MIAX Emerald"),

    /**
     * Cboe EDGX Options Exchange
     */
    EDGX('E', "Cboe EDGX Options Exchange"),

    /**
     * Nasdaq GEMX
     */
    GEMX('H', "Nasdaq GEMX"),

    /**
     * Nasdaq ISE
     */
    ISE('I', "Nasdaq ISE"),

    /**
     * Nasdaq MRX
     */
    MRX('J', "Nasdaq MRX"),

    /**
     * Miami International Securities Exchange
     */
    MIAX('M', "Miami International Securities Exchange"),

    /**
     * NYSE ARCA
     */
    NYSE('N', "NYSE ARCA"),

    /**
     * Options Price Reporting Authority
     */
    OPRA('O', "Options Price Reporting Authority"),

    /**
     * MIAX PEARL
     */
    PEARL('P', "MIAX PEARL"),

    /**
     * NASDAQ Options Market
     */
    NASD('Q', "NASDAQ Options Market"),

    /**
     * MIAX Sapphire
     */
    SPHR('S', "MIAX Sapphire"),

    /**
     * NASDAQ BX Options
     */
    BX('T', "NASDAQ BX Options"),

    /**
     * Members Options Exchange
     */
    MEMX('U', "Members Options Exchange"),

    /**
     * Cboe C2 Options Exchange
     */
    C2('W', "Cboe C2 Options Exchange"),

    /**
     * NASDAQ PHLX
     */
    PHLX('X', "NASDAQ PHLX"),

    /**
     * Cboe BZX Options Exchange
     */
    BATS('Z', "Cboe BZX Options Exchange");

    private final char wire;

    private final String description;

    ParticipantId(char wire, String description) {
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
    public static Optional<ParticipantId> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(AMEX);
            case 'B' -> Optional.of(BOX);
            case 'C' -> Optional.of(CBOE);
            case 'D' -> Optional.of(EMERALD);
            case 'E' -> Optional.of(EDGX);
            case 'H' -> Optional.of(GEMX);
            case 'I' -> Optional.of(ISE);
            case 'J' -> Optional.of(MRX);
            case 'M' -> Optional.of(MIAX);
            case 'N' -> Optional.of(NYSE);
            case 'O' -> Optional.of(OPRA);
            case 'P' -> Optional.of(PEARL);
            case 'Q' -> Optional.of(NASD);
            case 'S' -> Optional.of(SPHR);
            case 'T' -> Optional.of(BX);
            case 'U' -> Optional.of(MEMX);
            case 'W' -> Optional.of(C2);
            case 'X' -> Optional.of(PHLX);
            case 'Z' -> Optional.of(BATS);
            default -> Optional.empty();
        };
    }
}
