package omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.enums;

import java.util.Optional;

/**
 * Order level parameter to allow clients to specify that they would like their order to rest prior to execution, with flexibility for visible orders to rest at a specified price level on the book.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum PassiveOnlyOrder {

    /**
     * No Constraint
     */
    NO_CONSTRAINT((short) 0, "No Constraint"),

    /**
     * Only Accept Order If It Will Not Match With Visible Contra Order Otherwise Expire Order
     */
    ONLY_ACCEPT_ORDER_IF_IT_WILL_NOT_MATCH_WITH_VISIBLE_CONTRA_ORDER_OTHERWISE_EXPIRE_ORDER((short) 99, "Only Accept Order If It Will Not Match With Visible Contra Order Otherwise Expire Order"),

    /**
     * Only Accept Order If Setting New Visible Bbo Otherwise Expire Order
     */
    ONLY_ACCEPT_ORDER_IF_SETTING_NEW_VISIBLE_BBO_OTHERWISE_EXPIRE_ORDER((short) 100, "Only Accept Order If Setting New Visible Bbo Otherwise Expire Order"),

    /**
     * Only Accept Order If Setting New Bbo Or Joining Existing Bbo Otherwise Expire Order
     */
    ONLY_ACCEPT_ORDER_IF_SETTING_NEW_BBO_OR_JOINING_EXISTING_BBO_OTHERWISE_EXPIRE_ORDER((short) 1, "Only Accept Order If Setting New Bbo Or Joining Existing Bbo Otherwise Expire Order"),

    /**
     * Only Accept Order If Will Be At Bbo Or Within One Visible Price Point Otherwise Expire Order
     */
    ONLY_ACCEPT_ORDER_IF_WILL_BE_AT_BBO_OR_WITHIN_ONE_VISIBLE_PRICE_POINT_OTHERWISE_EXPIRE_ORDER((short) 2, "Only Accept Order If Will Be At Bbo Or Within One Visible Price Point Otherwise Expire Order"),

    /**
     * Only Accept Order If Will Be At Bbo Or Within Two Visible Price Points Otherwise Expire Order
     */
    ONLY_ACCEPT_ORDER_IF_WILL_BE_AT_BBO_OR_WITHIN_TWO_VISIBLE_PRICE_POINTS_OTHERWISE_EXPIRE_ORDER((short) 3, "Only Accept Order If Will Be At Bbo Or Within Two Visible Price Points Otherwise Expire Order");

    private final short wire;

    private final String description;

    PassiveOnlyOrder(short wire, String description) {
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
    public static Optional<PassiveOnlyOrder> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NO_CONSTRAINT);
            case 99 -> Optional.of(ONLY_ACCEPT_ORDER_IF_IT_WILL_NOT_MATCH_WITH_VISIBLE_CONTRA_ORDER_OTHERWISE_EXPIRE_ORDER);
            case 100 -> Optional.of(ONLY_ACCEPT_ORDER_IF_SETTING_NEW_VISIBLE_BBO_OTHERWISE_EXPIRE_ORDER);
            case 1 -> Optional.of(ONLY_ACCEPT_ORDER_IF_SETTING_NEW_BBO_OR_JOINING_EXISTING_BBO_OTHERWISE_EXPIRE_ORDER);
            case 2 -> Optional.of(ONLY_ACCEPT_ORDER_IF_WILL_BE_AT_BBO_OR_WITHIN_ONE_VISIBLE_PRICE_POINT_OTHERWISE_EXPIRE_ORDER);
            case 3 -> Optional.of(ONLY_ACCEPT_ORDER_IF_WILL_BE_AT_BBO_OR_WITHIN_TWO_VISIBLE_PRICE_POINTS_OTHERWISE_EXPIRE_ORDER);
            default -> Optional.empty();
        };
    }
}
