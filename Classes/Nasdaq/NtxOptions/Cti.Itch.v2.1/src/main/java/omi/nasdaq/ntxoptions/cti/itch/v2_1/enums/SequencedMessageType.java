package omi.nasdaq.ntxoptions.cti.itch.v2_1.enums;

import java.util.Optional;

/**
 * Value identifying sequenced message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SequencedMessageType {

    /**
     * The system event message is used to signal a ring wide event.
     */
    SYSTEM_EVENT_MESSAGE('S', "The system event message is used to signal a ring wide event."),

    /**
     * At the start of each trading day, the exchange disseminates directory messages for all symbols trading on a given ring. Sent once per symbol, typically before the Start of System Hours System Event; intra-day updates are sent as they occur. 48 bytes.
     */
    OPTIONS_DIRECTORY_MESSAGE('D', "At the start of each trading day, the exchange disseminates directory messages for all symbols trading on a given ring. Sent once per symbol, typically before the Start of System Hours System Event; intra-day updates are sent as they occur. 48 bytes."),

    /**
     * Indicates the current trading status of an option within the exchange. A T (Trading resumed) message is sent for all options eligible for trading at the start of system hours; a security absent from the pre-opening spin should be treated as halted. 27 bytes.
     */
    SECURITY_TRADING_ACTION_MESSAGE('H', "Indicates the current trading status of an option within the exchange. A T (Trading resumed) message is sent for all options eligible for trading at the start of system hours; a security absent from the pre-opening spin should be treated as halted. 27 bytes."),

    /**
     * Clearing trades and trade corrections, with contra side clearing information (trade cancels too when a firm and connection block is configured for extended cancels, Transaction Type Z). 330 bytes. Contra side clearing fields carry a Contra prefix.
     */
    TRADE_MESSAGE('T', "Clearing trades and trade corrections, with contra side clearing information (trade cancels too when a firm and connection block is configured for extended cancels, Transaction Type Z). 330 bytes. Contra side clearing fields carry a Contra prefix."),

    /**
     * By default CTI sends trade cancels using this message; alternatively a firm and connection block can be configured to send extended cancels with all the trade information using the Trade message with Transaction Type Z. 55 bytes.
     */
    CANCEL_TRADE_MESSAGE('V', "By default CTI sends trade cancels using this message; alternatively a firm and connection block can be configured to send extended cancels with all the trade information using the Trade message with Transaction Type Z. 55 bytes.");

    private final char wire;

    private final String description;

    SequencedMessageType(char wire, String description) {
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
    public static Optional<SequencedMessageType> fromWire(char wire) {
        return switch (wire) {
            case 'S' -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 'D' -> Optional.of(OPTIONS_DIRECTORY_MESSAGE);
            case 'H' -> Optional.of(SECURITY_TRADING_ACTION_MESSAGE);
            case 'T' -> Optional.of(TRADE_MESSAGE);
            case 'V' -> Optional.of(CANCEL_TRADE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
