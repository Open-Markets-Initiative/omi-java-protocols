package omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application;

import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums.ExecFlag;
import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums.OrderCapacity;
import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums.OrderType;
import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums.Scope;
import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums.Side;
import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Codec;
import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.DecodeException;
import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Message;
import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.TextView;
import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.View;

/**
 * Represents the ComplexStrategyOrderOnBookMessage message from the OrderComboFeed protocol.
 *
 * <p>
 * An Order on Book message is generated for all the following situations whenever an order free from any display restrictions is reported by the matching engine. In all such cases the order size to be displayed is as reported by the matching engine
 * </p>
 *
 * <p>An immutable view: each getter reads its field from the bytes viewed, so the message is valid for as long as
 * those bytes are unchanged.</p>
 */
public final class ComplexStrategyOrderOnBookMessage extends View implements Message {

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

    /**
     * Views a message.
     *
     * @param buffer the bytes holding the message
     * @param offset where the message starts
     * @param end where the bytes the message may occupy end
     * @throws DecodeException when fewer than {@link #BYTE_LENGTH} bytes lie between offset and end
     */
    public ComplexStrategyOrderOnBookMessage(byte[] buffer, int offset, int end) {
        super(buffer, offset, end, BYTE_LENGTH);
    }

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * The time, expressed as the number of nanoseconds after midnight.
     *
     * @return the value
     */
    public long timestamp() {
        return Codec.getUnsignedBE(buffer, offset + TIMESTAMP_OFFSET, 6);
    }

    /**
     * ISE’s Strategy ID assigned daily, valid while there are any open complex orders for the day
     *
     * @return the value
     */
    public long strategyId() {
        return Codec.getIntBE(buffer, offset + STRATEGY_ID_OFFSET) & 0xFFFFFFFFL;
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
        return (char) (buffer[offset + ORDER_TYPE_OFFSET] & 0xFF);
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
        return (char) (buffer[offset + SIDE_OFFSET] & 0xFF);
    }

    /**
     * Price of the order in fixed point format with 6 whole number places followed by 4 decimal digits.
     *
     * @return the raw integer, the value times ten to the power of PRICE_DECIMALS
     */
    public int price() {
        return Codec.getIntBE(buffer, offset + PRICE_OFFSET);
    }

    /**
     * Size of the order
     *
     * @return the value
     */
    public long size() {
        return Codec.getIntBE(buffer, offset + SIZE_OFFSET) & 0xFFFFFFFFL;
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
        return (char) (buffer[offset + EXEC_FLAG_OFFSET] & 0xFF);
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
        return (char) (buffer[offset + ORDER_CAPACITY_OFFSET] & 0xFF);
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
        return (char) (buffer[offset + SCOPE_OFFSET] & 0xFF);
    }

    /**
     * Spaces when not set
     *
     * <p>Each call returns a new view, valid for as long as the bytes viewed are unchanged.</p>
     *
     * @return the text, its padding left out
     */
    public TextView ownerId() {
        return new TextView(buffer, offset + OWNER_ID_OFFSET, 6, (byte) ' ', false, true);
    }

    /**
     * Spaces when not set
     *
     * <p>Each call returns a new view, valid for as long as the bytes viewed are unchanged.</p>
     *
     * @return the text, its padding left out
     */
    public TextView giveup() {
        return new TextView(buffer, offset + GIVEUP_OFFSET, 6, (byte) ' ', false, true);
    }

    /**
     * Spaces when not set
     *
     * <p>Each call returns a new view, valid for as long as the bytes viewed are unchanged.</p>
     *
     * @return the text, its padding left out
     */
    public TextView cmta() {
        return new TextView(buffer, offset + CMTA_OFFSET, 6, (byte) ' ', false, true);
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
