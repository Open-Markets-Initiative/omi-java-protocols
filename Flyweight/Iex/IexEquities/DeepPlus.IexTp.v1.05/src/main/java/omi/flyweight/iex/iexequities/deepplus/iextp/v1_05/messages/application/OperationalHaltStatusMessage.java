package omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.messages.application;

import omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.enums.OperationalHaltStatus;
import omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.types.Codec;
import omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.types.Flyweight;
import omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.types.Message;
import omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.types.Text;

/**
 * Represents the OperationalHaltStatusMessage message from the DeepPlus protocol.
 *
 * <p>
 * The Exchange may suspend trading of one or more securities on IEX for operational reasons and indicates such operational halt using the Operational Halt Status Message.
 * </p>
 *
 * <p>A flyweight its decoder decodes into again for each message of its type: decoding copies every field, so it
 * is valid after the bytes are reused, until the decoder decodes the next message of its type.</p>
 */
public final class OperationalHaltStatusMessage extends Flyweight implements Message {

    /**
     * The message's name in the specification.
     */
    public static final String NAME = "Operational Halt Status Message";

    /**
     * The fixed length of the message in bytes.
     */
    public static final int BYTE_LENGTH = 17;

    /**
     * Where {@link #operationalHaltStatus()} starts, from the message's start.
     */
    public static final int OPERATIONAL_HALT_STATUS_OFFSET = 0;

    /**
     * Where {@link #timestamp()} starts, from the message's start.
     */
    public static final int TIMESTAMP_OFFSET = 1;

    /**
     * Where {@link #symbol()} starts, from the message's start.
     */
    public static final int SYMBOL_OFFSET = 9;

    private char operationalHaltStatus;

    private long timestamp;

    private final Text symbol = new Text(8, (byte) ' ', false, true);

    /**
     * Creates a message holding nothing decoded; a decoder decodes into it.
     */
    public OperationalHaltStatusMessage() {
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
        operationalHaltStatus = (char) (buffer[offset + OPERATIONAL_HALT_STATUS_OFFSET] & 0xFF);
        timestamp = Codec.getLongLE(buffer, offset + TIMESTAMP_OFFSET);
        symbol.copy(buffer, offset + SYMBOL_OFFSET);
    }

    /**
     * Operational halt status identifier
     *
     * @return the value, or null when the protocol declares none for {@link #operationalHaltStatusRaw()}
     */
    public OperationalHaltStatus operationalHaltStatus() {
        return OperationalHaltStatus.get(operationalHaltStatusRaw());
    }

    /**
     * Operational halt status identifier
     *
     * @return the value as it was sent
     */
    public char operationalHaltStatusRaw() {
        return operationalHaltStatus;
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

    @Override
    public StringBuilder dump(StringBuilder builder) {
        builder.append(NAME).append('{');
        OperationalHaltStatus operationalHaltStatus = operationalHaltStatus();
        if (operationalHaltStatus == null) {
            builder.append("operationalHaltStatus=").append(operationalHaltStatusRaw());
        }
        else {
            builder.append("operationalHaltStatus=").append(operationalHaltStatus.name());
        }
        builder.append(", timestamp=").append(timestamp());
        builder.append(", symbol=").append(symbol());
        return builder.append('}');
    }

    @Override
    public String toString() {
        return dump(new StringBuilder()).toString();
    }
}
