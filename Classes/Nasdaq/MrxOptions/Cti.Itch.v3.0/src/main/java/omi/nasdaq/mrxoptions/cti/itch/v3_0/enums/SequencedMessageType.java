package omi.nasdaq.mrxoptions.cti.itch.v3_0.enums;

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
     * At the start of each trading day, the exchange disseminates directory messages for all symbols trading on a given ring. Sent once per symbol, typically before the Start of System Hours System Event; intra-day updates are sent as they occur.
     */
    OPTIONS_DIRECTORY_MESSAGE('D', "At the start of each trading day, the exchange disseminates directory messages for all symbols trading on a given ring. Sent once per symbol, typically before the Start of System Hours System Event; intra-day updates are sent as they occur."),

    /**
     * The strategy associated to a complex order (PHLX, ISE and MRX only). The Strategy ID assigned for a new complex strategy is unique for a particular complex instrument for a trading session, however Strategy IDs are independent of session Option IDs and uniqueness across complex and simple options is not guaranteed.
     */
    COMPLEX_ORDER_STRATEGY_MESSAGE('R', "The strategy associated to a complex order (PHLX, ISE and MRX only). The Strategy ID assigned for a new complex strategy is unique for a particular complex instrument for a trading session, however Strategy IDs are independent of session Option IDs and uniqueness across complex and simple options is not guaranteed."),

    /**
     * Indicates the current trading status of an option within the exchange. A T (Trading resumed) message is sent for all options eligible for trading at the start of system hours; a security absent from the pre-opening spin should be treated as halted.
     */
    SECURITY_TRADING_ACTION_MESSAGE('H', "Indicates the current trading status of an option within the exchange. A T (Trading resumed) message is sent for all options eligible for trading at the start of system hours; a security absent from the pre-opening spin should be treated as halted."),

    /**
     * Indicates the current trading status of a strategy within the exchange (PHLX, ISE and MRX only). A T (Trading Resumed) message is sent for all strategies eligible for trading at the start of system hours.
     */
    COMPLEX_TRADING_ACTION_MESSAGE('I', "Indicates the current trading status of a strategy within the exchange (PHLX, ISE and MRX only). A T (Trading Resumed) message is sent for all strategies eligible for trading at the start of system hours."),

    /**
     * Clearing trades and trade corrections, with contra side clearing information (trade cancels too when a firm and connection block is configured for extended cancels, Transaction Type Z). 337 bytes. Contra side clearing fields carry a Contra prefix.
     */
    TRADE_MESSAGE('T', "Clearing trades and trade corrections, with contra side clearing information (trade cancels too when a firm and connection block is configured for extended cancels, Transaction Type Z). 337 bytes. Contra side clearing fields carry a Contra prefix."),

    /**
     * By default CTI sends trade cancels using this message; alternatively a firm and connection block can be configured to send extended cancels with all the trade information using the Trade message with Transaction Type Z. 66 bytes.
     */
    CANCEL_TRADE_MESSAGE('V', "By default CTI sends trade cancels using this message; alternatively a firm and connection block can be configured to send extended cancels with all the trade information using the Trade message with Transaction Type Z. 66 bytes.");

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
            case 'R' -> Optional.of(COMPLEX_ORDER_STRATEGY_MESSAGE);
            case 'H' -> Optional.of(SECURITY_TRADING_ACTION_MESSAGE);
            case 'I' -> Optional.of(COMPLEX_TRADING_ACTION_MESSAGE);
            case 'T' -> Optional.of(TRADE_MESSAGE);
            case 'V' -> Optional.of(CANCEL_TRADE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
