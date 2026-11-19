package omi.finra.finraorf.tdds.dfi.v2_1.enums;

import java.util.Optional;

/**
 * Control message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ControlMessageType {

    /**
     * The Start of Day control message signifies the beginning of each operational cycle for TDDS processing
     */
    START_OF_DAY_MESSAGE('I', "The Start of Day control message signifies the beginning of each operational cycle for TDDS processing"),

    /**
     * The End of Day control message signals the end of active message dissemination for the TDDS operational cycle
     */
    END_OF_DAY_MESSAGE('J', "The End of Day control message signals the end of active message dissemination for the TDDS operational cycle"),

    /**
     * The Market Session Open Control Message signifies the opening of FINRA’s market systems for the session indicated in the Message Header
     */
    MARKET_SESSION_OPEN_MESSAGE('O', "The Market Session Open Control Message signifies the opening of FINRA\u2019s market systems for the session indicated in the Message Header"),

    /**
     * The Session Close Control Message signals the closing of FINRA’s market systems for the session indicated in the Message Header
     */
    MARKET_SESSION_CLOSE_MESSAGE('C', "The Session Close Control Message signals the closing of FINRA\u2019s market systems for the session indicated in the Message Header"),

    /**
     * This message signals that no further retransmission requests will be honored. The End of Retransmission Requests message will be sent three times, at one-minute intervals
     */
    END_OF_RETRANSMISSION_REQUESTS_MESSAGE('K', "This message signals that no further retransmission requests will be honored. The End of Retransmission Requests message will be sent three times, at one-minute intervals"),

    /**
     * The End of Transmissions Message signals that there will be no further transmissions of data sent through the TDDS line.
     */
    END_OF_TRANSMISSIONS_MESSAGE('Z', "The End of Transmissions Message signals that there will be no further transmissions of data sent through the TDDS line."),

    /**
     * The Line Integrity Control Message will be transmitted at approximately one-minute intervals to verify the operational integrity of the TDDS message transmission, and will be intermixed with other messages
     */
    LINE_INTEGRITY_MESSAGE('T', "The Line Integrity Control Message will be transmitted at approximately one-minute intervals to verify the operational integrity of the TDDS message transmission, and will be intermixed with other messages"),

    /**
     * The Sequence Number Reset Message forces the resetting of the Sequence Number. The Sequence Number will either be reset to zero or to a number greater than the last number previously transmitted
     */
    SEQUENCE_NUMBER_RESET_MESSAGE('L', "The Sequence Number Reset Message forces the resetting of the Sequence Number. The Sequence Number will either be reset to zero or to a number greater than the last number previously transmitted"),

    /**
     * The End of Trade Reporting Control Message signals that the ORF system is closed for market participant trade transactions
     */
    END_OF_TRADE_REPORTING_MESSAGE('X', "The End of Trade Reporting Control Message signals that the ORF system is closed for market participant trade transactions");

    private final char wire;

    private final String description;

    ControlMessageType(char wire, String description) {
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
    public static Optional<ControlMessageType> fromWire(char wire) {
        return switch (wire) {
            case 'I' -> Optional.of(START_OF_DAY_MESSAGE);
            case 'J' -> Optional.of(END_OF_DAY_MESSAGE);
            case 'O' -> Optional.of(MARKET_SESSION_OPEN_MESSAGE);
            case 'C' -> Optional.of(MARKET_SESSION_CLOSE_MESSAGE);
            case 'K' -> Optional.of(END_OF_RETRANSMISSION_REQUESTS_MESSAGE);
            case 'Z' -> Optional.of(END_OF_TRANSMISSIONS_MESSAGE);
            case 'T' -> Optional.of(LINE_INTEGRITY_MESSAGE);
            case 'L' -> Optional.of(SEQUENCE_NUMBER_RESET_MESSAGE);
            case 'X' -> Optional.of(END_OF_TRADE_REPORTING_MESSAGE);
            default -> Optional.empty();
        };
    }
}
