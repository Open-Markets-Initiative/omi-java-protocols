package omi.flyweight.iex.iexequities.deepplus.iextp.v1_01.messages.application;

import omi.flyweight.iex.iexequities.deepplus.iextp.v1_01.enums.Side;
import omi.flyweight.iex.iexequities.deepplus.iextp.v1_01.types.Codec;
import omi.flyweight.iex.iexequities.deepplus.iextp.v1_01.types.Flyweight;
import omi.flyweight.iex.iexequities.deepplus.iextp.v1_01.types.Message;
import omi.flyweight.iex.iexequities.deepplus.iextp.v1_01.types.Text;

/**
 * Represents the AddOrderMessage message from the DeepPlus protocol.
 *
 * <p>
 * A displayed order that has been added to the IEX Book
 * </p>
 *
 * <p>A flyweight its decoder decodes into again for each message of its type: decoding copies every field, so it
 * is valid after the bytes are reused, until the decoder decodes the next message of its type.</p>
 */
public final class AddOrderMessage extends Flyweight implements Message {

    /**
     * The message's name in the specification.
     */
    public static final String NAME = "Add Order Message";

    /**
     * The fixed length of the message in bytes.
     */
    public static final int BYTE_LENGTH = 37;

    /**
     * Where {@link #side()} starts, from the message's start.
     */
    public static final int SIDE_OFFSET = 0;

    /**
     * Where {@link #timestamp()} starts, from the message's start.
     */
    public static final int TIMESTAMP_OFFSET = 1;

    /**
     * Where {@link #symbol()} starts, from the message's start.
     */
    public static final int SYMBOL_OFFSET = 9;

    /**
     * Where {@link #orderId()} starts, from the message's start.
     */
    public static final int ORDER_ID_OFFSET = 17;

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

    private char side;

    private long timestamp;

    private final Text symbol = new Text(8, (byte) ' ', false, true);

    private long orderId;

    private long size;

    private long price;

    /**
     * Creates a message holding nothing decoded; a decoder decodes into it.
     */
    public AddOrderMessage() {
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
        side = (char) (buffer[offset + SIDE_OFFSET] & 0xFF);
        timestamp = Codec.getLongLE(buffer, offset + TIMESTAMP_OFFSET);
        symbol.copy(buffer, offset + SYMBOL_OFFSET);
        orderId = Codec.getLongLE(buffer, offset + ORDER_ID_OFFSET);
        size = Codec.getIntLE(buffer, offset + SIZE_OFFSET) & 0xFFFFFFFFL;
        price = Codec.getLongLE(buffer, offset + PRICE_OFFSET);
    }

    /**
     * Side of order
     *
     * @return the value, or null when the protocol declares none for {@link #sideRaw()}
     */
    public Side side() {
        return Side.get(sideRaw());
    }

    /**
     * Side of order
     *
     * @return the value as it was sent
     */
    public char sideRaw() {
        return side;
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
     * Order ID of new order
     *
     * @return the unsigned value's bits, read through the {@code Long.*Unsigned} methods
     */
    public long orderId() {
        return orderId;
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
        Side side = side();
        if (side == null) {
            builder.append("side=").append(sideRaw());
        }
        else {
            builder.append("side=").append(side.name());
        }
        builder.append(", timestamp=").append(timestamp());
        builder.append(", symbol=").append(symbol());
        builder.append(", orderId=").append(Long.toUnsignedString(orderId()));
        builder.append(", size=").append(size());
        builder.append(", price=").append(price());
        return builder.append('}');
    }

    @Override
    public String toString() {
        return dump(new StringBuilder()).toString();
    }
}
