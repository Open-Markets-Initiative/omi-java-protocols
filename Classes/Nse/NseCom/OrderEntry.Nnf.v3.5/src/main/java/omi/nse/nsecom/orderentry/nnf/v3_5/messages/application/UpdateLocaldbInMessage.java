package omi.nse.nsecom.orderentry.nnf.v3_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.CFillerField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.LastUpdateIndexTimeField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.LastUpdateInstrumentTimeField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.LastUpdateParticipantTimeField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.LastUpdateSecurityTimeField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.RequestForOpenOrdersField;
import omi.nse.nsecom.orderentry.nnf.v3_5.structs.StExMarketStatus;
import omi.nse.nsecom.orderentry.nnf.v3_5.structs.StMarketStatus;
import omi.nse.nsecom.orderentry.nnf.v3_5.structs.StPlMarketStatus;
import omi.nse.nsecom.orderentry.nnf.v3_5.types.Field;
import omi.nse.nsecom.orderentry.nnf.v3_5.types.Message;
import omi.nse.nsecom.orderentry.nnf.v3_5.types.PrintOptions;

/**
 * Represents the UpdateLocaldbInMessage message from the OrderEntry protocol.
 *
 * <p>7300 MS_UPDATE_LOCAL_DATABA 82 I SE, carried in the MS_UPDATE_LOCAL_DATABASE structure</p>
 */
public final class UpdateLocaldbInMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 42;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Update Localdb In Message";

    /**
     * This field should contain the time when the Security information was last updated for all Security information that is downloaded
     */
    private final LastUpdateSecurityTimeField lastUpdateSecurityTime = new LastUpdateSecurityTimeField();

    /**
     * LastUpdateParticipantTime
     */
    private final LastUpdateParticipantTimeField lastUpdateParticipantTime = new LastUpdateParticipantTimeField();

    /**
     * LastUpdateInstrumentTime
     */
    private final LastUpdateInstrumentTimeField lastUpdateInstrumentTime = new LastUpdateInstrumentTimeField();

    /**
     * LastUpdateIndexTime
     */
    private final LastUpdateIndexTimeField lastUpdateIndexTime = new LastUpdateIndexTimeField();

    /**
     * RequestForOpenOrders
     */
    private final RequestForOpenOrdersField requestForOpenOrders = new RequestForOpenOrdersField();

    /**
     * cFiller
     */
    private final CFillerField cFiller = new CFillerField();

    /**
     * ST_MARKET_STATUS
     */
    private final StMarketStatus stMarketStatus = new StMarketStatus();

    /**
     * ST_EX_MARKET_STATUS
     */
    private final StExMarketStatus stExMarketStatus = new StExMarketStatus();

    /**
     * ST_PL_MARKET_STATUS
     */
    private final StPlMarketStatus stPlMarketStatus = new StPlMarketStatus();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(lastUpdateSecurityTime), List.<Field>of(lastUpdateParticipantTime), List.<Field>of(lastUpdateInstrumentTime), List.<Field>of(lastUpdateIndexTime), List.<Field>of(requestForOpenOrders), List.<Field>of(cFiller), stMarketStatus.fields(), stExMarketStatus.fields(), stPlMarketStatus.fields()).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * This field should contain the time when the Security information was last updated for all Security information that is downloaded
     *
     * @return the LastUpdateSecurityTime field
     */
    public LastUpdateSecurityTimeField lastUpdateSecurityTime() {
        return lastUpdateSecurityTime;
    }

    /**
     * LastUpdateParticipantTime
     *
     * @return the LastUpdateParticipantTime field
     */
    public LastUpdateParticipantTimeField lastUpdateParticipantTime() {
        return lastUpdateParticipantTime;
    }

    /**
     * LastUpdateInstrumentTime
     *
     * @return the LastUpdateInstrumentTime field
     */
    public LastUpdateInstrumentTimeField lastUpdateInstrumentTime() {
        return lastUpdateInstrumentTime;
    }

    /**
     * LastUpdateIndexTime
     *
     * @return the LastUpdateIndexTime field
     */
    public LastUpdateIndexTimeField lastUpdateIndexTime() {
        return lastUpdateIndexTime;
    }

    /**
     * RequestForOpenOrders
     *
     * @return the RequestForOpenOrders field
     */
    public RequestForOpenOrdersField requestForOpenOrders() {
        return requestForOpenOrders;
    }

    /**
     * cFiller
     *
     * @return the CFiller field
     */
    public CFillerField cFiller() {
        return cFiller;
    }

    /**
     * ST_MARKET_STATUS
     *
     * @return the StMarketStatus record
     */
    public StMarketStatus stMarketStatus() {
        return stMarketStatus;
    }

    /**
     * ST_EX_MARKET_STATUS
     *
     * @return the StExMarketStatus record
     */
    public StExMarketStatus stExMarketStatus() {
        return stExMarketStatus;
    }

    /**
     * ST_PL_MARKET_STATUS
     *
     * @return the StPlMarketStatus record
     */
    public StPlMarketStatus stPlMarketStatus() {
        return stPlMarketStatus;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
        return new int[0];
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.empty();
    }

    @Override
    public boolean parseFrom(byte[] data, int offset) {
        return parseFrom(data, offset, data.length);
    }

    @Override
    public boolean parseFrom(byte[] data, int offset, int end) {
        clear();
        this.decoded = read(data, offset, end);

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!lastUpdateSecurityTime.parse(data, cursor)) {
            return false;
        }
        cursor += LastUpdateSecurityTimeField.BYTE_LENGTH;
        if (!lastUpdateParticipantTime.parse(data, cursor)) {
            return false;
        }
        cursor += LastUpdateParticipantTimeField.BYTE_LENGTH;
        if (!lastUpdateInstrumentTime.parse(data, cursor)) {
            return false;
        }
        cursor += LastUpdateInstrumentTimeField.BYTE_LENGTH;
        if (!lastUpdateIndexTime.parse(data, cursor)) {
            return false;
        }
        cursor += LastUpdateIndexTimeField.BYTE_LENGTH;
        if (!requestForOpenOrders.parse(data, cursor)) {
            return false;
        }
        cursor += RequestForOpenOrdersField.BYTE_LENGTH;
        if (!cFiller.parse(data, cursor)) {
            return false;
        }
        cursor += CFillerField.BYTE_LENGTH;
        if (!stMarketStatus.parseFrom(data, cursor, end - 16)) {
            return false;
        }
        cursor += stMarketStatus.byteLength();
        if (!stExMarketStatus.parseFrom(data, cursor, end - 8)) {
            return false;
        }
        cursor += stExMarketStatus.byteLength();
        return stPlMarketStatus.parseFrom(data, cursor, end);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = lastUpdateSecurityTime.encode(data, cursor);
        cursor = lastUpdateParticipantTime.encode(data, cursor);
        cursor = lastUpdateInstrumentTime.encode(data, cursor);
        cursor = lastUpdateIndexTime.encode(data, cursor);
        cursor = requestForOpenOrders.encode(data, cursor);
        cursor = cFiller.encode(data, cursor);
        cursor = stMarketStatus.encode(data, cursor);
        cursor = stExMarketStatus.encode(data, cursor);
        cursor = stPlMarketStatus.encode(data, cursor);
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[BYTE_LENGTH];
        encode(data, 0);
        return data;
    }

    @Override
    public void clear() {
        for (Field field : fields) {
            field.reset();
        }
        stMarketStatus.clear();
        stExMarketStatus.clear();
        stPlMarketStatus.clear();
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
            if (!field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (!field.isValid()) {
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
            case "LastUpdateSecurityTime" -> Optional.of(lastUpdateSecurityTime);
            case "LastUpdateParticipantTime" -> Optional.of(lastUpdateParticipantTime);
            case "LastUpdateInstrumentTime" -> Optional.of(lastUpdateInstrumentTime);
            case "LastUpdateIndexTime" -> Optional.of(lastUpdateIndexTime);
            case "RequestForOpenOrders" -> Optional.of(requestForOpenOrders);
            case "CFiller" -> Optional.of(cFiller);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof UpdateLocaldbInMessage message)) {
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
        if (!(other instanceof UpdateLocaldbInMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
