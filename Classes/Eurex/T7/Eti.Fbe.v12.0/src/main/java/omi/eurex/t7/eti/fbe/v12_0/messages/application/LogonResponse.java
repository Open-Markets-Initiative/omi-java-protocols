package omi.eurex.t7.eti.fbe.v12_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v12_0.fields.DefaultCstmApplVerIdField;
import omi.eurex.t7.eti.fbe.v12_0.fields.DefaultCstmApplVerSubIdField;
import omi.eurex.t7.eti.fbe.v12_0.fields.HeartBtIntField;
import omi.eurex.t7.eti.fbe.v12_0.fields.LatestPublicKeySeqNoField;
import omi.eurex.t7.eti.fbe.v12_0.fields.MarketIdField;
import omi.eurex.t7.eti.fbe.v12_0.fields.PublicKeyLenField;
import omi.eurex.t7.eti.fbe.v12_0.fields.SessionInstanceIdField;
import omi.eurex.t7.eti.fbe.v12_0.fields.ThrottleDisconnectLimitField;
import omi.eurex.t7.eti.fbe.v12_0.fields.ThrottleNoMsgsField;
import omi.eurex.t7.eti.fbe.v12_0.fields.ThrottleTimeIntervalField;
import omi.eurex.t7.eti.fbe.v12_0.fields.TradSesModeField;
import omi.eurex.t7.eti.fbe.v12_0.structs.ResponseHeaderComp;
import omi.eurex.t7.eti.fbe.v12_0.types.Field;
import omi.eurex.t7.eti.fbe.v12_0.types.Message;
import omi.eurex.t7.eti.fbe.v12_0.types.PrintOptions;
import omi.eurex.t7.eti.fbe.v12_0.types.SizedField;

/**
 * Represents the LogonResponse message from the Eti protocol.
 */
public final class LogonResponse implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 94;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Logon Response";

    /**
     * Throttle Time Interval
     */
    private final ThrottleTimeIntervalField throttleTimeInterval = new ThrottleTimeIntervalField();

    /**
     * Throttle No Msgs
     */
    private final ThrottleNoMsgsField throttleNoMsgs = new ThrottleNoMsgsField();

    /**
     * Throttle Disconnect Limit
     */
    private final ThrottleDisconnectLimitField throttleDisconnectLimit = new ThrottleDisconnectLimitField();

    /**
     * Heart Bt Int
     */
    private final HeartBtIntField heartBtInt = new HeartBtIntField();

    /**
     * Session Instance Id
     */
    private final SessionInstanceIdField sessionInstanceId = new SessionInstanceIdField();

    /**
     * Latest Public Key Seq No
     */
    private final LatestPublicKeySeqNoField latestPublicKeySeqNo = new LatestPublicKeySeqNoField();

    /**
     * Public Key Len
     */
    private final PublicKeyLenField publicKeyLen = new PublicKeyLenField();

    /**
     * Market Id
     */
    private final MarketIdField marketId = new MarketIdField();

    /**
     * Trad Ses Mode
     */
    private final TradSesModeField tradSesMode = new TradSesModeField();

    /**
     * Default Cstm Appl Ver Id
     */
    private final DefaultCstmApplVerIdField defaultCstmApplVerId = new DefaultCstmApplVerIdField();

    /**
     * Default Cstm Appl Ver Sub Id
     */
    private final DefaultCstmApplVerSubIdField defaultCstmApplVerSubId = new DefaultCstmApplVerSubIdField();

    /**
     * Public Key
     */
    private final SizedField publicKey = new SizedField("PublicKey", true);

    /**
     * Response Header Comp
     */
    private final ResponseHeaderComp responseHeaderComp = new ResponseHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(responseHeaderComp.fields(), List.<Field>of(throttleTimeInterval), List.<Field>of(throttleNoMsgs), List.<Field>of(throttleDisconnectLimit), List.<Field>of(heartBtInt), List.<Field>of(sessionInstanceId), List.<Field>of(latestPublicKeySeqNo), List.<Field>of(publicKeyLen), List.<Field>of(marketId), List.<Field>of(tradSesMode), List.<Field>of(defaultCstmApplVerId), List.<Field>of(defaultCstmApplVerSubId), List.<Field>of(publicKey)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Throttle Time Interval
     *
     * @return the ThrottleTimeInterval field
     */
    public ThrottleTimeIntervalField throttleTimeInterval() {
        return throttleTimeInterval;
    }

    /**
     * Throttle No Msgs
     *
     * @return the ThrottleNoMsgs field
     */
    public ThrottleNoMsgsField throttleNoMsgs() {
        return throttleNoMsgs;
    }

    /**
     * Throttle Disconnect Limit
     *
     * @return the ThrottleDisconnectLimit field
     */
    public ThrottleDisconnectLimitField throttleDisconnectLimit() {
        return throttleDisconnectLimit;
    }

    /**
     * Heart Bt Int
     *
     * @return the HeartBtInt field
     */
    public HeartBtIntField heartBtInt() {
        return heartBtInt;
    }

    /**
     * Session Instance Id
     *
     * @return the SessionInstanceId field
     */
    public SessionInstanceIdField sessionInstanceId() {
        return sessionInstanceId;
    }

    /**
     * Latest Public Key Seq No
     *
     * @return the LatestPublicKeySeqNo field
     */
    public LatestPublicKeySeqNoField latestPublicKeySeqNo() {
        return latestPublicKeySeqNo;
    }

    /**
     * Public Key Len
     *
     * @return the PublicKeyLen field
     */
    public PublicKeyLenField publicKeyLen() {
        return publicKeyLen;
    }

    /**
     * Market Id
     *
     * @return the MarketId field
     */
    public MarketIdField marketId() {
        return marketId;
    }

    /**
     * Trad Ses Mode
     *
     * @return the TradSesMode field
     */
    public TradSesModeField tradSesMode() {
        return tradSesMode;
    }

    /**
     * Default Cstm Appl Ver Id
     *
     * @return the DefaultCstmApplVerId field
     */
    public DefaultCstmApplVerIdField defaultCstmApplVerId() {
        return defaultCstmApplVerId;
    }

    /**
     * Default Cstm Appl Ver Sub Id
     *
     * @return the DefaultCstmApplVerSubId field
     */
    public DefaultCstmApplVerSubIdField defaultCstmApplVerSubId() {
        return defaultCstmApplVerSubId;
    }

    /**
     * Public Key
     *
     * @return the PublicKey field
     */
    public SizedField publicKey() {
        return publicKey;
    }

    /**
     * Response Header Comp
     *
     * @return the ResponseHeaderComp record
     */
    public ResponseHeaderComp responseHeaderComp() {
        return responseHeaderComp;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + publicKey.byteLength();
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        IntStream.Builder runs = IntStream.builder();
        padding(runs, 0);
        return runs.build().toArray();
    }

    /**
     * Adds the declared padding runs, as offset and length pairs.
     *
     * @param runs   the destination
     * @param offset the offset of this class's first byte, relative to the start of the message
     * @return the offset just past this class's last byte
     */
    public int padding(IntStream.Builder runs, int offset) {
        int cursor = offset;
        runs.add(cursor).add(2);
        cursor += 2;
        for (int[] run = ResponseHeaderComp.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += ResponseHeaderComp.BYTE_LENGTH;
        cursor += 8;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 2;
        cursor += 2;
        cursor += 1;
        cursor += 30;
        cursor += 5;
        cursor += publicKey.byteLength();
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(responseHeaderComp.requestTime().value());
    }

    @Override
    public boolean parseFrom(byte[] data, int offset) {
        return parseFrom(data, offset, data.length);
    }

    @Override
    public boolean parseFrom(byte[] data, int offset, int end) {
        clear();
        this.decoded = read(data, offset, end);

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        cursor += 2; // padding
        if (!responseHeaderComp.parseFrom(data, cursor, end - 68)) {
            return false;
        }
        cursor += responseHeaderComp.byteLength();
        if (!throttleTimeInterval.parse(data, cursor)) {
            return false;
        }
        cursor += ThrottleTimeIntervalField.BYTE_LENGTH;
        if (!throttleNoMsgs.parse(data, cursor)) {
            return false;
        }
        cursor += ThrottleNoMsgsField.BYTE_LENGTH;
        if (!throttleDisconnectLimit.parse(data, cursor)) {
            return false;
        }
        cursor += ThrottleDisconnectLimitField.BYTE_LENGTH;
        if (!heartBtInt.parse(data, cursor)) {
            return false;
        }
        cursor += HeartBtIntField.BYTE_LENGTH;
        if (!sessionInstanceId.parse(data, cursor)) {
            return false;
        }
        cursor += SessionInstanceIdField.BYTE_LENGTH;
        if (!latestPublicKeySeqNo.parse(data, cursor)) {
            return false;
        }
        cursor += LatestPublicKeySeqNoField.BYTE_LENGTH;
        if (!publicKeyLen.parse(data, cursor)) {
            return false;
        }
        cursor += PublicKeyLenField.BYTE_LENGTH;
        if (!marketId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketIdField.BYTE_LENGTH;
        if (!tradSesMode.parse(data, cursor)) {
            return false;
        }
        cursor += TradSesModeField.BYTE_LENGTH;
        if (!defaultCstmApplVerId.parse(data, cursor)) {
            return false;
        }
        cursor += DefaultCstmApplVerIdField.BYTE_LENGTH;
        if (!defaultCstmApplVerSubId.parse(data, cursor)) {
            return false;
        }
        cursor += DefaultCstmApplVerSubIdField.BYTE_LENGTH;
        if (!publicKey.parse(data, cursor, publicKeyLen.value(), end)) {
            return false;
        }
        cursor += publicKey.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (publicKey.byteLength() > 65535) {
            throw new IllegalStateException("publicKey holds " + publicKey.byteLength() + " bytes, more than its length field can state");
        }
        publicKeyLen.value((publicKey.byteLength()));
        int cursor = offset;
        if (buffer != null && buffer.length >= 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = responseHeaderComp.encode(data, cursor);
        cursor = throttleTimeInterval.encode(data, cursor);
        cursor = throttleNoMsgs.encode(data, cursor);
        cursor = throttleDisconnectLimit.encode(data, cursor);
        cursor = heartBtInt.encode(data, cursor);
        cursor = sessionInstanceId.encode(data, cursor);
        cursor = latestPublicKeySeqNo.encode(data, cursor);
        cursor = publicKeyLen.encode(data, cursor);
        cursor = marketId.encode(data, cursor);
        cursor = tradSesMode.encode(data, cursor);
        cursor = defaultCstmApplVerId.encode(data, cursor);
        cursor = defaultCstmApplVerSubId.encode(data, cursor);
        cursor = publicKey.encode(data, cursor);
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[byteLength()];
        encode(data, 0);
        return data;
    }

    @Override
    public void clear() {
        for (Field field : fields) {
            field.reset();
        }
        responseHeaderComp.clear();
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        for (Field field : fields) {
            if (field != publicKeyLen && !field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (field != publicKeyLen && !field.isValid()) {
                return false;
            }
        }
        return isRecognized();
    }

    /**
     * Returns a copy of the bytes this message was decoded from.
     *
     * <p>A failed decode leaves behind the partial range that was available, which is what a diagnostic needs to see.</p>
     *
     * @return the message bytes, or empty when no decode has been attempted
     */
    @Override
    public Optional<byte[]> raw() {
        if (buffer == null) {
            return Optional.empty();
        }
        return Optional.of(buffer.clone());
    }

    @Override
    public Optional<Field> failedAt() {
        if (buffer == null || decoded) {
            return Optional.empty();
        }
        for (Field field : fields) {
            if (!field.isDecoded()) {
                return Optional.of(field);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Field> fields() {
        return fields;
    }

    @Override
    public Optional<Field> field(String name) {
        return switch (name) {
            case "ThrottleTimeInterval" -> Optional.of(throttleTimeInterval);
            case "ThrottleNoMsgs" -> Optional.of(throttleNoMsgs);
            case "ThrottleDisconnectLimit" -> Optional.of(throttleDisconnectLimit);
            case "HeartBtInt" -> Optional.of(heartBtInt);
            case "SessionInstanceId" -> Optional.of(sessionInstanceId);
            case "LatestPublicKeySeqNo" -> Optional.of(latestPublicKeySeqNo);
            case "PublicKeyLen" -> Optional.of(publicKeyLen);
            case "MarketId" -> Optional.of(marketId);
            case "TradSesMode" -> Optional.of(tradSesMode);
            case "DefaultCstmApplVerId" -> Optional.of(defaultCstmApplVerId);
            case "DefaultCstmApplVerSubId" -> Optional.of(defaultCstmApplVerSubId);
            case "PublicKey" -> Optional.of(publicKey);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof LogonResponse message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        return changed;
    }

    @Override
    public String toFormattedString(PrintOptions options) {
        StringBuilder builder = new StringBuilder();
        toFormattedString(builder, options);
        return builder.toString();
    }

    /**
     * Appends this message's formatted representation.
     *
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line.</p>
     *
     * @param builder the destination
     * @param options the display options
     */
    @Override
    public void toFormattedString(StringBuilder builder, PrintOptions options) {
        if (options.identifier()) {
            builder.append(NAME);
            return;
        }

        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < fields.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                fields.get(index).toFormattedString(builder, options);
            }
            builder.append(" }");
            return;
        }

        builder.append(options.prefix()).append(NAME).append(System.lineSeparator());
        PrintOptions nested = options.nested();
        for (Field field : fields) {
            builder.append(nested.prefix());
            field.toFormattedString(builder, nested);
            builder.append(System.lineSeparator());
        }
    }

    @Override
    public String toString() {
        return toFormattedString(PrintOptions.DEFAULT);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogonResponse message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
