package omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9.fields.CorrelationIdField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9.fields.FairValueField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9.fields.FinalFundingRateTimestampField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9.fields.FlagsField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9.fields.FundingRateField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9.fields.FuturesMarkPriceField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9.fields.SpotMarkPriceField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9.structs.InstrHeader;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9.types.Field;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9.types.Message;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9.types.PrintOptions;

/**
 * Represents the FundingRateMessage message from the MarketDataApi protocol.
 *
 * <p>FundingRateMessage</p>
 */
public final class FundingRateMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 71;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Funding Rate Message";

    /**
     * fundingRate
     */
    private final FundingRateField fundingRate = new FundingRateField();

    /**
     * futuresMarkPrice
     */
    private final FuturesMarkPriceField futuresMarkPrice = new FuturesMarkPriceField();

    /**
     * spotMarkPrice
     */
    private final SpotMarkPriceField spotMarkPrice = new SpotMarkPriceField();

    /**
     * fairValue
     */
    private final FairValueField fairValue = new FairValueField();

    /**
     * finalFundingRateTimestamp
     */
    private final FinalFundingRateTimestampField finalFundingRateTimestamp = new FinalFundingRateTimestampField();

    /**
     * correlationId
     */
    private final CorrelationIdField correlationId = new CorrelationIdField();

    /**
     * FundingRateFlags bit set
     */
    private final FlagsField flags = new FlagsField();

    /**
     * Instrument Header
     */
    private final InstrHeader instrHeader = new InstrHeader();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(instrHeader.fields(), List.<Field>of(fundingRate), List.<Field>of(futuresMarkPrice), List.<Field>of(spotMarkPrice), List.<Field>of(fairValue), List.<Field>of(finalFundingRateTimestamp), List.<Field>of(correlationId), List.<Field>of(flags)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * fundingRate
     *
     * @return the FundingRate field
     */
    public FundingRateField fundingRate() {
        return fundingRate;
    }

    /**
     * futuresMarkPrice
     *
     * @return the FuturesMarkPrice field
     */
    public FuturesMarkPriceField futuresMarkPrice() {
        return futuresMarkPrice;
    }

    /**
     * spotMarkPrice
     *
     * @return the SpotMarkPrice field
     */
    public SpotMarkPriceField spotMarkPrice() {
        return spotMarkPrice;
    }

    /**
     * fairValue
     *
     * @return the FairValue field
     */
    public FairValueField fairValue() {
        return fairValue;
    }

    /**
     * finalFundingRateTimestamp
     *
     * @return the FinalFundingRateTimestamp field
     */
    public FinalFundingRateTimestampField finalFundingRateTimestamp() {
        return finalFundingRateTimestamp;
    }

    /**
     * correlationId
     *
     * @return the CorrelationId field
     */
    public CorrelationIdField correlationId() {
        return correlationId;
    }

    /**
     * FundingRateFlags bit set
     *
     * @return the Flags field
     */
    public FlagsField flags() {
        return flags;
    }

    /**
     * Instrument Header
     *
     * @return the InstrHeader record
     */
    public InstrHeader instrHeader() {
        return instrHeader;
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
        return Optional.ofNullable(instrHeader.transactTime().value());
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
        if (!instrHeader.parseFrom(data, cursor, end - 49)) {
            return false;
        }
        cursor += instrHeader.byteLength();
        if (!fundingRate.parse(data, cursor)) {
            return false;
        }
        cursor += FundingRateField.BYTE_LENGTH;
        if (!futuresMarkPrice.parse(data, cursor)) {
            return false;
        }
        cursor += FuturesMarkPriceField.BYTE_LENGTH;
        if (!spotMarkPrice.parse(data, cursor)) {
            return false;
        }
        cursor += SpotMarkPriceField.BYTE_LENGTH;
        if (!fairValue.parse(data, cursor)) {
            return false;
        }
        cursor += FairValueField.BYTE_LENGTH;
        if (!finalFundingRateTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += FinalFundingRateTimestampField.BYTE_LENGTH;
        if (!correlationId.parse(data, cursor)) {
            return false;
        }
        cursor += CorrelationIdField.BYTE_LENGTH;
        return flags.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = instrHeader.encode(data, cursor);
        cursor = fundingRate.encode(data, cursor);
        cursor = futuresMarkPrice.encode(data, cursor);
        cursor = spotMarkPrice.encode(data, cursor);
        cursor = fairValue.encode(data, cursor);
        cursor = finalFundingRateTimestamp.encode(data, cursor);
        cursor = correlationId.encode(data, cursor);
        cursor = flags.encode(data, cursor);
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
        instrHeader.clear();
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
            case "FundingRate" -> Optional.of(fundingRate);
            case "FuturesMarkPrice" -> Optional.of(futuresMarkPrice);
            case "SpotMarkPrice" -> Optional.of(spotMarkPrice);
            case "FairValue" -> Optional.of(fairValue);
            case "FinalFundingRateTimestamp" -> Optional.of(finalFundingRateTimestamp);
            case "CorrelationId" -> Optional.of(correlationId);
            case "Flags" -> Optional.of(flags);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof FundingRateMessage message)) {
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
        if (!(other instanceof FundingRateMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
