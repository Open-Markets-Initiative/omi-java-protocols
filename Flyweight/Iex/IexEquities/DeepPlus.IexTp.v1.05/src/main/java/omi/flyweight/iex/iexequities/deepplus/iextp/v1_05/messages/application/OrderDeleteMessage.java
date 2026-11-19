package omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.messages.application;

import omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.types.Codec;
import omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.types.Flyweight;
import omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.types.Message;
import omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.types.Text;

/**
 * Represents the OrderDeleteMessage message from the DeepPlus protocol.
 *
 * <p>
 * A displayed order that was removed from the IEX Book
 * </p>
 *
 * <p>A flyweight its decoder decodes into again for each message of its type: decoding copies every field, so it
 * is valid after the bytes are reused, until the decoder decodes the next message of its type.</p>
 */
public final class OrderDeleteMessage extends Flyweight implements Message {

    /**
     * The message's name in the specification.
     */
    public static final String NAME = "Order Delete Message";

    /**
     * The fixed length of the message in bytes.
     */
    public static final int BYTE_LENGTH = 25;

    /**
     * Where {@link #reserved()} starts, from the message's start.
     */
    public static final int RESERVED_OFFSET = 0;

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

    private char reserved;

    private long timestamp;

    private final Text symbol = new Text(8, (byte) ' ', false, true);

    private long orderIdReference;

    /**
     * Creates a message holding nothing decoded; a decoder decodes into it.
     */
    public OrderDeleteMessage() {
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
        reserved = (char) (buffer[offset + RESERVED_OFFSET] & 0xFF);
        timestamp = Codec.getLongLE(buffer, offset + TIMESTAMP_OFFSET);
        symbol.copy(buffer, offset + SYMBOL_OFFSET);
        orderIdReference = Codec.getLongLE(buffer, offset + ORDER_ID_REFERENCE_OFFSET);
    }

    /**
     * Reserved for future use
     *
     * @return the character
     */
    public char reserved() {
        return reserved;
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

    @Override
    public StringBuilder dump(StringBuilder builder) {
        builder.append(NAME).append('{');
        builder.append("reserved=").append(reserved());
        builder.append(", timestamp=").append(timestamp());
        builder.append(", symbol=").append(symbol());
        builder.append(", orderIdReference=").append(Long.toUnsignedString(orderIdReference()));
        return builder.append('}');
    }

    @Override
    public String toString() {
        return dump(new StringBuilder()).toString();
    }
}
