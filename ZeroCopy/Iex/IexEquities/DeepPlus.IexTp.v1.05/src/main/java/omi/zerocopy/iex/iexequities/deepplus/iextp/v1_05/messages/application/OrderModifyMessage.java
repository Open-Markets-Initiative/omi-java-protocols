package omi.zerocopy.iex.iexequities.deepplus.iextp.v1_05.messages.application;

import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_05.types.Codec;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_05.types.Flyweight;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_05.types.Message;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_05.types.TextView;

/**
 * Represents the OrderModifyMessage message from the DeepPlus protocol.
 *
 * <p>
 * A displayed order that had its Price, Size, or Priority component changed as a result of user or system action
 * </p>
 *
 * <p>A flyweight: wrapping it points it at the message's bytes, and each getter reads its field from there. It is
 * valid only while those bytes are unchanged.</p>
 */
public final class OrderModifyMessage extends Flyweight implements Message {

    /**
     * The message's name in the specification.
     */
    public static final String NAME = "Order Modify Message";

    /**
     * The fixed length of the message in bytes.
     */
    public static final int BYTE_LENGTH = 37;

    /**
     * Where {@link #modifyFlags()} starts, from the message's start.
     */
    public static final int MODIFY_FLAGS_OFFSET = 0;

    /**
     * Where {@link #timestamp()} starts, from the message's start.
     */
    public static final int TIMESTAMP_OFFSET = 1;

    /**
     * Where {@link #symbol()} starts, from the message's start.
     */
    public static final int SYMBOL_OFFSET = 9;

    /**
     * Where {@link #orderIdReference()} starts, from the message's start.
     */
    public static final int ORDER_ID_REFERENCE_OFFSET = 17;

    /**
     * Where {@link #size()} starts, from the message's start.
     */
    public static final int SIZE_OFFSET = 25;

    /**
     * Where {@link #price()} starts, from the message's start.
     */
    public static final int PRICE_OFFSET = 29;

    /**
     * The decimal places of {@link #price()}: its raw integer is the value times ten to this power.
     */
    public static final int PRICE_DECIMALS = 4;

    private final TextView symbolView = new TextView(8, (byte) ' ', false, true);

    /**
     * Creates a flyweight wrapping nothing; a decoder wraps it.
     */
    public OrderModifyMessage() {
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
     * Modify Flags
     *
     * @return the whole container; prefer the named bit accessors
     */
    public byte modifyFlags() {
        return buffer[offset + MODIFY_FLAGS_OFFSET];
    }

    /**
     * Unused
     *
     * @return bits 0 through 6 of {@link #modifyFlags()}
     */
    public int modifyFlagsUnused() {
        return (int) (modifyFlags() & 0x7FL);
    }

    /**
     * Order Priority
     *
     * @return bit 7 of {@link #modifyFlags()}
     */
    public boolean modifyFlagsPriority() {
        return ((modifyFlags() >>> 7) & 1L) != 0L;
    }

    /**
     * Time stamp of the system event
     *
     * @return nanoseconds since the Unix epoch
     */
    public long timestamp() {
        return Codec.getLongLE(buffer, offset + TIMESTAMP_OFFSET);
    }

    /**
     * Security identifier
     *
     * <p>The view is repointed at every read and is valid as long as this flyweight.</p>
     *
     * @return the text, its padding left out
     */
    public TextView symbol() {
        return symbolView.wrap(buffer, offset + SYMBOL_OFFSET);
    }

    /**
     * Order ID of the referenced order
     *
     * @return the unsigned value's bits, read through the {@code Long.*Unsigned} methods
     */
    public long orderIdReference() {
        return Codec.getLongLE(buffer, offset + ORDER_ID_REFERENCE_OFFSET);
    }

    /**
     * Quoted size
     *
     * @return the value
     */
    public long size() {
        return Codec.getIntLE(buffer, offset + SIZE_OFFSET) & 0xFFFFFFFFL;
    }

    /**
     * Booking price on the IEX Order Book
     *
     * @return the raw integer, the value times ten to the power of PRICE_DECIMALS
     */
    public long price() {
        return Codec.getLongLE(buffer, offset + PRICE_OFFSET);
    }

    @Override
    public StringBuilder dump(StringBuilder builder) {
        builder.append(NAME).append('{');
        builder.append("modifyFlags=").append(modifyFlags());
        builder.append(", timestamp=").append(timestamp());
        builder.append(", symbol=").append(symbol());
        builder.append(", orderIdReference=").append(Long.toUnsignedString(orderIdReference()));
        builder.append(", size=").append(size());
        builder.append(", price=").append(price());
        return builder.append('}');
    }

    @Override
    public String toString() {
        return dump(new StringBuilder()).toString();
    }
}
