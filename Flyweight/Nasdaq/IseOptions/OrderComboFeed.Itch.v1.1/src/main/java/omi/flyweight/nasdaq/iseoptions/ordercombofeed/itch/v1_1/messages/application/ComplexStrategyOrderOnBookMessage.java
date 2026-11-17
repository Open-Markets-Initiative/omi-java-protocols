package omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application;

import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums.ExecFlag;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums.OrderCapacity;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums.OrderType;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums.Scope;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums.Side;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Codec;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Flyweight;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Message;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Text;

/**
 * Represents the ComplexStrategyOrderOnBookMessage message from the OrderComboFeed protocol.
 *
 * <p>
 * An Order on Book message is generated for all the following situations whenever an order free from any display restrictions is reported by the matching engine. In all such cases the order size to be displayed is as reported by the matching engine
 * </p>
 *
 * <p>A flyweight its decoder decodes into again for each message of its type: decoding copies every field, so it
 * is valid after the bytes are reused, until the decoder decodes the next message of its type.</p>
 */
public final class ComplexStrategyOrderOnBookMessage extends Flyweight implements Message {

    /**
     * The message's name in the specification.
     */
    public static final String NAME = "Complex Strategy Order On Book Message";

    /**
     * The fixed length of the message in bytes.
     */
    public static final int BYTE_LENGTH = 41;

    /**
     * Where {@link #timestamp()} starts, from the message's start.
     */
    public static final int TIMESTAMP_OFFSET = 0;

    /**
     * Where {@link #strategyId()} starts, from the message's start.
     */
    public static final int STRATEGY_ID_OFFSET = 6;

    /**
     * Where {@link #orderType()} starts, from the message's start.
     */
    public static final int ORDER_TYPE_OFFSET = 10;

    /**
     * Where {@link #side()} starts, from the message's start.
     */
    public static final int SIDE_OFFSET = 11;

    /**
     * Where {@link #price()} starts, from the message's start.
     */
    public static final int PRICE_OFFSET = 12;

    /**
     * The decimal places of {@link #price()}: its raw integer is the value times ten to this power.
     */
    public static final int PRICE_DECIMALS = 4;

    /**
     * Where {@link #size()} starts, from the message's start.
     */
    public static final int SIZE_OFFSET = 16;

    /**
     * Where {@link #execFlag()} starts, from the message's start.
     */
    public static final int EXEC_FLAG_OFFSET = 20;

    /**
     * Where {@link #orderCapacity()} starts, from the message's start.
     */
    public static final int ORDER_CAPACITY_OFFSET = 21;

    /**
     * Where {@link #scope()} starts, from the message's start.
     */
    public static final int SCOPE_OFFSET = 22;

    /**
     * Where {@link #ownerId()} starts, from the message's start.
     */
    public static final int OWNER_ID_OFFSET = 23;

    /**
     * Where {@link #giveup()} starts, from the message's start.
     */
    public static final int GIVEUP_OFFSET = 29;

    /**
     * Where {@link #cmta()} starts, from the message's start.
     */
    public static final int CMTA_OFFSET = 35;

    private long timestamp;

    private long strategyId;

    private char orderType;

    private char side;

    private int price;

    private long size;

    private char execFlag;

    private char orderCapacity;

    private char scope;

    private final Text ownerId = new Text(6, (byte) ' ', false, true);

    private final Text giveup = new Text(6, (byte) ' ', false, true);

    private final Text cmta = new Text(6, (byte) ' ', false, true);

    /**
     * Creates a message holding nothing decoded; a decoder decodes into it.
     */
    public ComplexStrategyOrderOnBookMessage() {
    }

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    @Override
    protected void read(byte[] buffer, int offset) {
        timestamp = Codec.getUnsignedBE(buffer, offset + TIMESTAMP_OFFSET, 6);
        strategyId = Codec.getIntBE(buffer, offset + STRATEGY_ID_OFFSET) & 0xFFFFFFFFL;
        orderType = (char) (buffer[offset + ORDER_TYPE_OFFSET] & 0xFF);
        side = (char) (buffer[offset + SIDE_OFFSET] & 0xFF);
        price = Codec.getIntBE(buffer, offset + PRICE_OFFSET);
        size = Codec.getIntBE(buffer, offset + SIZE_OFFSET) & 0xFFFFFFFFL;
        execFlag = (char) (buffer[offset + EXEC_FLAG_OFFSET] & 0xFF);
        orderCapacity = (char) (buffer[offset + ORDER_CAPACITY_OFFSET] & 0xFF);
        scope = (char) (buffer[offset + SCOPE_OFFSET] & 0xFF);
        ownerId.copy(buffer, offset + OWNER_ID_OFFSET);
        giveup.copy(buffer, offset + GIVEUP_OFFSET);
        cmta.copy(buffer, offset + CMTA_OFFSET);
    }

    /**
     * The time, expressed as the number of nanoseconds after midnight.
     *
     * @return the value
     */
    public long timestamp() {
        return timestamp;
    }

    /**
     * ISE’s Strategy ID assigned daily, valid while there are any open complex orders for the day
     *
     * @return the value
     */
    public long strategyId() {
        return strategyId;
    }

    /**
     * Order Type
     *
     * @return the value, or null when the protocol declares none for {@link #orderTypeRaw()}
     */
    public OrderType orderType() {
        return OrderType.get(orderTypeRaw());
    }

    /**
     * Order Type
     *
     * @return the value as it was sent
     */
    public char orderTypeRaw() {
        return orderType;
    }

    /**
     * ‘B’ = Bid ‘A’ = Offer (Ask) ‘ ’ (blank) = not set (hidden)
     *
     * @return the value, or null when the protocol declares none for {@link #sideRaw()}
     */
    public Side side() {
        return Side.get(sideRaw());
    }

    /**
     * ‘B’ = Bid ‘A’ = Offer (Ask) ‘ ’ (blank) = not set (hidden)
     *
     * @return the value as it was sent
     */
    public char sideRaw() {
        return side;
    }

    /**
     * Price of the order in fixed point format with 6 whole number places followed by 4 decimal digits.
     *
     * @return the raw integer, the value times ten to the power of PRICE_DECIMALS
     */
    public int price() {
        return price;
    }

    /**
     * Size of the order
     *
     * @return the value
     */
    public long size() {
        return size;
    }

    /**
     * ‘N’ = None ‘A’ = AON
     *
     * @return the value, or null when the protocol declares none for {@link #execFlagRaw()}
     */
    public ExecFlag execFlag() {
        return ExecFlag.get(execFlagRaw());
    }

    /**
     * ‘N’ = None ‘A’ = AON
     *
     * @return the value as it was sent
     */
    public char execFlagRaw() {
        return execFlag;
    }

    /**
     * Order Capacity value
     *
     * @return the value, or null when the protocol declares none for {@link #orderCapacityRaw()}
     */
    public OrderCapacity orderCapacity() {
        return OrderCapacity.get(orderCapacityRaw());
    }

    /**
     * Order Capacity value
     *
     * @return the value as it was sent
     */
    public char orderCapacityRaw() {
        return orderCapacity;
    }

    /**
     * Scope value
     *
     * @return the value, or null when the protocol declares none for {@link #scopeRaw()}
     */
    public Scope scope() {
        return Scope.get(scopeRaw());
    }

    /**
     * Scope value
     *
     * @return the value as it was sent
     */
    public char scopeRaw() {
        return scope;
    }

    /**
     * Spaces when not set
     *
     * <p>The text is copied at every decode and is valid until the next.</p>
     *
     * @return the text, its padding left out
     */
    public Text ownerId() {
        return ownerId;
    }

    /**
     * Spaces when not set
     *
     * <p>The text is copied at every decode and is valid until the next.</p>
     *
     * @return the text, its padding left out
     */
    public Text giveup() {
        return giveup;
    }

    /**
     * Spaces when not set
     *
     * <p>The text is copied at every decode and is valid until the next.</p>
     *
     * @return the text, its padding left out
     */
    public Text cmta() {
        return cmta;
    }

    @Override
    public StringBuilder dump(StringBuilder builder) {
        builder.append(NAME).append('{');
        builder.append("timestamp=").append(timestamp());
        builder.append(", strategyId=").append(strategyId());
        OrderType orderType = orderType();
        if (orderType == null) {
            builder.append(", orderType=").append(orderTypeRaw());
        }
        else {
            builder.append(", orderType=").append(orderType.name());
        }
        Side side = side();
        if (side == null) {
            builder.append(", side=").append(sideRaw());
        }
        else {
            builder.append(", side=").append(side.name());
        }
        builder.append(", price=").append(price());
        builder.append(", size=").append(size());
        ExecFlag execFlag = execFlag();
        if (execFlag == null) {
            builder.append(", execFlag=").append(execFlagRaw());
        }
        else {
            builder.append(", execFlag=").append(execFlag.name());
        }
        OrderCapacity orderCapacity = orderCapacity();
        if (orderCapacity == null) {
            builder.append(", orderCapacity=").append(orderCapacityRaw());
        }
        else {
            builder.append(", orderCapacity=").append(orderCapacity.name());
        }
        Scope scope = scope();
        if (scope == null) {
            builder.append(", scope=").append(scopeRaw());
        }
        else {
            builder.append(", scope=").append(scope.name());
        }
        builder.append(", ownerId=").append(ownerId());
        builder.append(", giveup=").append(giveup());
        builder.append(", cmta=").append(cmta());
        return builder.append('}');
    }

    @Override
    public String toString() {
        return dump(new StringBuilder()).toString();
    }
}
