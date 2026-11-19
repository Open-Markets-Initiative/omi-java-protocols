package omi.asx.asxderivatives.t24.itch.v1_13.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.AotLowerPriceField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.AotPriceField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.AotUpperPriceField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.ContractNumberField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.EtrLowerPriceField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.EtrPriceField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.EtrUpperPriceField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.NanosecondsField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.TradeDateField;
import omi.asx.asxderivatives.t24.itch.v1_13.types.Field;
import omi.asx.asxderivatives.t24.itch.v1_13.types.Message;
import omi.asx.asxderivatives.t24.itch.v1_13.types.PrintOptions;

/**
 * Represents the AnomalousOrderThresholdPublishMessage message from the T24 protocol.
 *
 * <p>ASX Trade24 reports this message to inform the market of setting, zeroing or adjusting the Extreme Trade Range price (ETR), the Anomalous Order Threshold price (AOT) and the associated ranges for a contract that requires Market Integrity Rules enforcement.</p>
 */
public final class AnomalousOrderThresholdPublishMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'W';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 34;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Anomalous Order Threshold Publish Message";

    /**
     * Nanoseconds portion of the timestamp.
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * Trade Date of event as applicable, if Event Code is “P” or “R”, applies to all active trade dates.
     */
    private final TradeDateField tradeDate = new TradeDateField();

    /**
     * Contract Number Field Element Identifier
     */
    private final ContractNumberField contractNumber = new ContractNumberField();

    /**
     * Anomalous Order Threshold price (AOT).
     */
    private final AotPriceField aotPrice = new AotPriceField();

    /**
     * Upper range of the AOT.
     */
    private final AotUpperPriceField aotUpperPrice = new AotUpperPriceField();

    /**
     * Lower range of the AOT.
     */
    private final AotLowerPriceField aotLowerPrice = new AotLowerPriceField();

    /**
     * Extreme Trade Range price (ETR); if zero, MIR is not enforced.
     */
    private final EtrPriceField etrPrice = new EtrPriceField();

    /**
     * Upper range of the ETR.
     */
    private final EtrUpperPriceField etrUpperPrice = new EtrUpperPriceField();

    /**
     * Lower range of the ETR.
     */
    private final EtrLowerPriceField etrLowerPrice = new EtrLowerPriceField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, tradeDate, contractNumber, aotPrice, aotUpperPrice, aotLowerPrice, etrPrice, etrUpperPrice, etrLowerPrice);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds portion of the timestamp.
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * Trade Date of event as applicable, if Event Code is “P” or “R”, applies to all active trade dates.
     *
     * @return the TradeDate field
     */
    public TradeDateField tradeDate() {
        return tradeDate;
    }

    /**
     * Contract Number Field Element Identifier
     *
     * @return the ContractNumber field
     */
    public ContractNumberField contractNumber() {
        return contractNumber;
    }

    /**
     * Anomalous Order Threshold price (AOT).
     *
     * @return the AotPrice field
     */
    public AotPriceField aotPrice() {
        return aotPrice;
    }

    /**
     * Upper range of the AOT.
     *
     * @return the AotUpperPrice field
     */
    public AotUpperPriceField aotUpperPrice() {
        return aotUpperPrice;
    }

    /**
     * Lower range of the AOT.
     *
     * @return the AotLowerPrice field
     */
    public AotLowerPriceField aotLowerPrice() {
        return aotLowerPrice;
    }

    /**
     * Extreme Trade Range price (ETR); if zero, MIR is not enforced.
     *
     * @return the EtrPrice field
     */
    public EtrPriceField etrPrice() {
        return etrPrice;
    }

    /**
     * Upper range of the ETR.
     *
     * @return the EtrUpperPrice field
     */
    public EtrUpperPriceField etrUpperPrice() {
        return etrUpperPrice;
    }

    /**
     * Lower range of the ETR.
     *
     * @return the EtrLowerPrice field
     */
    public EtrLowerPriceField etrLowerPrice() {
        return etrLowerPrice;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
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
        if (!nanoseconds.parse(data, cursor)) {
            return false;
        }
        cursor += NanosecondsField.BYTE_LENGTH;
        if (!tradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradeDateField.BYTE_LENGTH;
        if (!contractNumber.parse(data, cursor)) {
            return false;
        }
        cursor += ContractNumberField.BYTE_LENGTH;
        if (!aotPrice.parse(data, cursor)) {
            return false;
        }
        cursor += AotPriceField.BYTE_LENGTH;
        if (!aotUpperPrice.parse(data, cursor)) {
            return false;
        }
        cursor += AotUpperPriceField.BYTE_LENGTH;
        if (!aotLowerPrice.parse(data, cursor)) {
            return false;
        }
        cursor += AotLowerPriceField.BYTE_LENGTH;
        if (!etrPrice.parse(data, cursor)) {
            return false;
        }
        cursor += EtrPriceField.BYTE_LENGTH;
        if (!etrUpperPrice.parse(data, cursor)) {
            return false;
        }
        cursor += EtrUpperPriceField.BYTE_LENGTH;
        return etrLowerPrice.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanoseconds.encode(data, cursor);
        cursor = tradeDate.encode(data, cursor);
        cursor = contractNumber.encode(data, cursor);
        cursor = aotPrice.encode(data, cursor);
        cursor = aotUpperPrice.encode(data, cursor);
        cursor = aotLowerPrice.encode(data, cursor);
        cursor = etrPrice.encode(data, cursor);
        cursor = etrUpperPrice.encode(data, cursor);
        cursor = etrLowerPrice.encode(data, cursor);
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
            case "Nanoseconds" -> Optional.of(nanoseconds);
            case "TradeDate" -> Optional.of(tradeDate);
            case "ContractNumber" -> Optional.of(contractNumber);
            case "AotPrice" -> Optional.of(aotPrice);
            case "AotUpperPrice" -> Optional.of(aotUpperPrice);
            case "AotLowerPrice" -> Optional.of(aotLowerPrice);
            case "EtrPrice" -> Optional.of(etrPrice);
            case "EtrUpperPrice" -> Optional.of(etrUpperPrice);
            case "EtrLowerPrice" -> Optional.of(etrLowerPrice);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AnomalousOrderThresholdPublishMessage message)) {
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
        if (!(other instanceof AnomalousOrderThresholdPublishMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
