package omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.messages.application;

import omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.types.Codec;
import omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.types.Flyweight;
import omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.types.Message;
import omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.types.Text;

/**
 * Represents the OrderModifyMessage message from the DeepPlus protocol.
 *
 * <p>
 * A displayed order that had its Price, Size, or Priority component changed as a result of user or system action
 * </p>
 *
 * <p>A flyweight its decoder decodes into again for each message of its type: decoding copies every field, so it
 * is valid after the bytes are reused, until the decoder decodes the next message of its type.</p>
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

    private byte modifyFlags;

    private long timestamp;

    private final Text symbol = new Text(8, (byte) ' ', false, true);

    private long orderIdReference;

    private long size;

    private long price;

    /**
     * Creates a message holding nothing decoded; a decoder decodes into it.
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

    @Override
    protected void read(byte[] buffer, int offset) {
        modifyFlags = buffer[offset + MODIFY_FLAGS_OFFSET];
        timestamp = Codec.getLongLE(buffer, offset + TIMESTAMP_OFFSET);
        symbol.copy(buffer, offset + SYMBOL_OFFSET);
        orderIdReference = Codec.getLongLE(buffer, offset + ORDER_ID_REFERENCE_OFFSET);
        size = Codec.getIntLE(buffer, offset + SIZE_OFFSET) & 0xFFFFFFFFL;
        price = Codec.getLongLE(buffer, offset + PRICE_OFFSET);
    }

    /**
     * Modify Flags
     *
     * @return the whole container; prefer the named bit accessors
     */
    public byte modifyFlags() {
        return modifyFlags;
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
        return timestamp;
    }

    /**
     * Security identifier
     *
     * <p>The text is copied at every decode and is valid until the next.</p>
     *
     * @return the text, its padding left out
     */
    public Text symbol() {
        return symbol;
    }

    /**
     * Order ID of the referenced order
     *
     * @return the unsigned value's bits, read through the {@code Long.*Unsigned} methods
     */
    public long orderIdReference() {
        return orderIdReference;
    }

    /**
     * Quoted size
     *
     * @return the value
     */
    public long size() {
        return size;
    }

    /**
     * Booking price on the IEX Order Book
     *
     * @return the raw integer, the value times ten to the power of PRICE_DECIMALS
     */
    public long price() {
        return price;
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
