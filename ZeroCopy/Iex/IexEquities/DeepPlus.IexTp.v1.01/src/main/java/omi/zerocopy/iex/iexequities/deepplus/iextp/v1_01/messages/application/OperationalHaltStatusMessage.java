package omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.messages.application;

import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.enums.OperationalHaltStatus;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.types.Codec;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.types.DecodeException;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.types.Message;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.types.TextView;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.types.View;

/**
 * Represents the OperationalHaltStatusMessage message from the DeepPlus protocol.
 *
 * <p>
 * The Exchange may suspend trading of one or more securities on IEX for operational reasons and indicates such operational halt using the Operational Halt Status Message.
 * </p>
 *
 * <p>An immutable view: each getter reads its field from the bytes viewed, so the message is valid for as long as
 * those bytes are unchanged.</p>
 */
public final class OperationalHaltStatusMessage extends View implements Message {

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

    /**
     * Views a message.
     *
     * @param buffer the bytes holding the message
     * @param offset where the message starts
     * @param end where the bytes the message may occupy end
     * @throws DecodeException when fewer than {@link #BYTE_LENGTH} bytes lie between offset and end
     */
    public OperationalHaltStatusMessage(byte[] buffer, int offset, int end) {
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
        return (char) (buffer[offset + OPERATIONAL_HALT_STATUS_OFFSET] & 0xFF);
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
     * <p>Each call returns a new view, valid for as long as the bytes viewed are unchanged.</p>
     *
     * @return the text, its padding left out
     */
    public TextView symbol() {
        return new TextView(buffer, offset + SYMBOL_OFFSET, 8, (byte) ' ', false, true);
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
