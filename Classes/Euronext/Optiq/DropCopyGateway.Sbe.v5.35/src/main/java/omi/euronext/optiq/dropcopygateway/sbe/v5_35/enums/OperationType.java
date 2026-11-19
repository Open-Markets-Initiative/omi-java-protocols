package omi.euronext.optiq.dropcopygateway.sbe.v5_35.enums;

import java.util.Optional;

/**
 * operationType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OperationType {

    /**
     * Declaration_of_a_trade_outside_the_book
     */
    DECLARATIONOFATRADEOUTSIDETHEBOOK((short) 1, "Declaration_of_a_trade_outside_the_book"),

    /**
     * Fund_order__quantity_
     */
    FUNDORDERQUANTITY((short) 4, "Fund_order__quantity_"),

    /**
     * Declaration_of_a_VWAP_transaction
     */
    DECLARATIONOFA_VWA_PTRANSACTION((short) 5, "Declaration_of_a_VWAP_transaction"),

    /**
     * Fund_order__cash_amount_
     */
    FUNDORDERCASHAMOUNT((short) 6, "Fund_order__cash_amount_"),

    /**
     * Declaration_of_a_trade_on_a_Secondary_listing_place
     */
    DECLARATIONOFATRADEONA_SECONDARYLISTINGPLACE((short) 7, "Declaration_of_a_trade_on_a_Secondary_listing_place");

    private final short wire;

    private final String description;

    OperationType(short wire, String description) {
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
    public static Optional<OperationType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(DECLARATIONOFATRADEOUTSIDETHEBOOK);
            case 4 -> Optional.of(FUNDORDERQUANTITY);
            case 5 -> Optional.of(DECLARATIONOFA_VWA_PTRANSACTION);
            case 6 -> Optional.of(FUNDORDERCASHAMOUNT);
            case 7 -> Optional.of(DECLARATIONOFATRADEONA_SECONDARYLISTINGPLACE);
            default -> Optional.empty();
        };
    }
}
