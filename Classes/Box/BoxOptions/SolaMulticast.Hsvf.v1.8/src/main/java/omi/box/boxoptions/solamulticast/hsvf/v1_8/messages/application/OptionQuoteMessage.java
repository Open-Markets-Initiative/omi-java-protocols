package omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.AskPriceFractionIndicatorField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.AskPriceQuoteNumericField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.AskSizeField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.BidPriceFractionIndicatorField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.BidPriceQuoteNumericField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.BidSizeField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.ExchangeIdField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.InstrumentStatusMarkerField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.PublicCustomerAskSizeField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.PublicCustomerBidSizeField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.structs.InstrumentDescription;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.types.Field;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.types.Message;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.types.PrintOptions;

/**
 * Represents the OptionQuoteMessage message from the SolaMulticast protocol.
 *
 * <p>Option Quote</p>
 */
public final class OptionQuoteMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 57;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Option Quote Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 8, 1, 45, 1 };

    /**
     * Q by default
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * Bid price for the option series
     */
    private final BidPriceQuoteNumericField bidPriceQuoteNumeric = new BidPriceQuoteNumericField();

    /**
     * Defines number of decimal places or fraction positions
     */
    private final BidPriceFractionIndicatorField bidPriceFractionIndicator = new BidPriceFractionIndicatorField();

    /**
     * Number of option contracts represented by the Bid Price
     */
    private final BidSizeField bidSize = new BidSizeField();

    /**
     * Ask price for the option series
     */
    private final AskPriceQuoteNumericField askPriceQuoteNumeric = new AskPriceQuoteNumericField();

    /**
     * Defines number of decimal places or fraction positions.
     */
    private final AskPriceFractionIndicatorField askPriceFractionIndicator = new AskPriceFractionIndicatorField();

    /**
     * Number of option contracts represented by the Ask Price
     */
    private final AskSizeField askSize = new AskSizeField();

    /**
     * Indicates instrument status
     */
    private final InstrumentStatusMarkerField instrumentStatusMarker = new InstrumentStatusMarkerField();

    /**
     * Number of option contracts represented by Public Customer orders on the bid side
     */
    private final PublicCustomerBidSizeField publicCustomerBidSize = new PublicCustomerBidSizeField();

    /**
     * Number of option contracts represented by Public Customer orders on the ask side
     */
    private final PublicCustomerAskSizeField publicCustomerAskSize = new PublicCustomerAskSizeField();

    /**
     * Instrument Description
     */
    private final InstrumentDescription instrumentDescription = new InstrumentDescription();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(exchangeId), instrumentDescription.fields(), List.<Field>of(bidPriceQuoteNumeric), List.<Field>of(bidPriceFractionIndicator), List.<Field>of(bidSize), List.<Field>of(askPriceQuoteNumeric), List.<Field>of(askPriceFractionIndicator), List.<Field>of(askSize), List.<Field>of(instrumentStatusMarker), List.<Field>of(publicCustomerBidSize), List.<Field>of(publicCustomerAskSize)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Q by default
     *
     * @return the ExchangeId field
     */
    public ExchangeIdField exchangeId() {
        return exchangeId;
    }

    /**
     * Bid price for the option series
     *
     * @return the BidPriceQuoteNumeric field
     */
    public BidPriceQuoteNumericField bidPriceQuoteNumeric() {
        return bidPriceQuoteNumeric;
    }

    /**
     * Defines number of decimal places or fraction positions
     *
     * @return the BidPriceFractionIndicator field
     */
    public BidPriceFractionIndicatorField bidPriceFractionIndicator() {
        return bidPriceFractionIndicator;
    }

    /**
     * Number of option contracts represented by the Bid Price
     *
     * @return the BidSize field
     */
    public BidSizeField bidSize() {
        return bidSize;
    }

    /**
     * Ask price for the option series
     *
     * @return the AskPriceQuoteNumeric field
     */
    public AskPriceQuoteNumericField askPriceQuoteNumeric() {
        return askPriceQuoteNumeric;
    }

    /**
     * Defines number of decimal places or fraction positions.
     *
     * @return the AskPriceFractionIndicator field
     */
    public AskPriceFractionIndicatorField askPriceFractionIndicator() {
        return askPriceFractionIndicator;
    }

    /**
     * Number of option contracts represented by the Ask Price
     *
     * @return the AskSize field
     */
    public AskSizeField askSize() {
        return askSize;
    }

    /**
     * Indicates instrument status
     *
     * @return the InstrumentStatusMarker field
     */
    public InstrumentStatusMarkerField instrumentStatusMarker() {
        return instrumentStatusMarker;
    }

    /**
     * Number of option contracts represented by Public Customer orders on the bid side
     *
     * @return the PublicCustomerBidSize field
     */
    public PublicCustomerBidSizeField publicCustomerBidSize() {
        return publicCustomerBidSize;
    }

    /**
     * Number of option contracts represented by Public Customer orders on the ask side
     *
     * @return the PublicCustomerAskSize field
     */
    public PublicCustomerAskSizeField publicCustomerAskSize() {
        return publicCustomerAskSize;
    }

    /**
     * Instrument Description
     *
     * @return the InstrumentDescription record
     */
    public InstrumentDescription instrumentDescription() {
        return instrumentDescription;
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
        return PADDING.clone();
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
        if (!exchangeId.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeIdField.BYTE_LENGTH;
        if (!instrumentDescription.parseFrom(data, cursor, end - 36)) {
            return false;
        }
        cursor += instrumentDescription.byteLength();
        if (!bidPriceQuoteNumeric.parse(data, cursor)) {
            return false;
        }
        cursor += BidPriceQuoteNumericField.BYTE_LENGTH;
        if (!bidPriceFractionIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += BidPriceFractionIndicatorField.BYTE_LENGTH;
        if (!bidSize.parse(data, cursor)) {
            return false;
        }
        cursor += BidSizeField.BYTE_LENGTH;
        if (!askPriceQuoteNumeric.parse(data, cursor)) {
            return false;
        }
        cursor += AskPriceQuoteNumericField.BYTE_LENGTH;
        if (!askPriceFractionIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += AskPriceFractionIndicatorField.BYTE_LENGTH;
        if (!askSize.parse(data, cursor)) {
            return false;
        }
        cursor += AskSizeField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!instrumentStatusMarker.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentStatusMarkerField.BYTE_LENGTH;
        if (!publicCustomerBidSize.parse(data, cursor)) {
            return false;
        }
        cursor += PublicCustomerBidSizeField.BYTE_LENGTH;
        return publicCustomerAskSize.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = exchangeId.encode(data, cursor);
        cursor = instrumentDescription.encode(data, cursor);
        cursor = bidPriceQuoteNumeric.encode(data, cursor);
        cursor = bidPriceFractionIndicator.encode(data, cursor);
        cursor = bidSize.encode(data, cursor);
        cursor = askPriceQuoteNumeric.encode(data, cursor);
        cursor = askPriceFractionIndicator.encode(data, cursor);
        cursor = askSize.encode(data, cursor);
        if (buffer != null && buffer.length >= 46) {
            System.arraycopy(buffer, 45, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = instrumentStatusMarker.encode(data, cursor);
        cursor = publicCustomerBidSize.encode(data, cursor);
        cursor = publicCustomerAskSize.encode(data, cursor);
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
        instrumentDescription.clear();
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
            case "ExchangeId" -> Optional.of(exchangeId);
            case "BidPriceQuoteNumeric" -> Optional.of(bidPriceQuoteNumeric);
            case "BidPriceFractionIndicator" -> Optional.of(bidPriceFractionIndicator);
            case "BidSize" -> Optional.of(bidSize);
            case "AskPriceQuoteNumeric" -> Optional.of(askPriceQuoteNumeric);
            case "AskPriceFractionIndicator" -> Optional.of(askPriceFractionIndicator);
            case "AskSize" -> Optional.of(askSize);
            case "InstrumentStatusMarker" -> Optional.of(instrumentStatusMarker);
            case "PublicCustomerBidSize" -> Optional.of(publicCustomerBidSize);
            case "PublicCustomerAskSize" -> Optional.of(publicCustomerAskSize);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OptionQuoteMessage message)) {
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
        if (!(other instanceof OptionQuoteMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
