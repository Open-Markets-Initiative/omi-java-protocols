package omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.fields.AskField;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.fields.BidField;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.fields.BusinessDateField;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.fields.CurrencyCodeField;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.fields.InstrumentIdField;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.fields.PriceField;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.fields.PriceStatusField;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.fields.ProductCodeField;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.fields.ReferencePriceCategoryField;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.fields.ReferencePriceTypeField;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.fields.TimeOfEventField;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.types.Field;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.types.Message;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.types.PrintOptions;

/**
 * Represents the ReferencePriceMessage message from the ReferencePricesSnapshot protocol.
 *
 * <p>Reference prices are published for instruments with an InstrumentID for the Official, Settlement, Closing and Index price types. Instruments are published in the Instrument Definition message.</p>
 */
public final class ReferencePriceMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 94;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Reference Price Message";

    /**
     * The time at which the price was established.
     */
    private final TimeOfEventField timeOfEvent = new TimeOfEventField();

    /**
     * Category of the reference price. The specification names this field Category; it is qualified here because the Reference FX Rate message gives a Category of its own carrying a different set of values.
     */
    private final ReferencePriceCategoryField referencePriceCategory = new ReferencePriceCategoryField();

    /**
     * Reference price type. The specification names this field PriceType; it is qualified here because the Contract Definition message gives a PriceType of its own carrying a different set of values.
     */
    private final ReferencePriceTypeField referencePriceType = new ReferencePriceTypeField();

    /**
     * The status of reference price.
     */
    private final PriceStatusField priceStatus = new PriceStatusField();

    /**
     * The business date on which the price was established, as YYYYMMDD.
     */
    private final BusinessDateField businessDate = new BusinessDateField();

    /**
     * Unique Instrument Identifier. Null for PriceType Index.
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * The product code. This identifies the metal for the instrument.
     */
    private final ProductCodeField productCode = new ProductCodeField();

    /**
     * The currency code according to ISO 4217.
     */
    private final CurrencyCodeField currencyCode = new CurrencyCodeField();

    /**
     * A reference bid price, in implicit six decimal place format. Represents the average bid price for a reference price categorised as such.
     */
    private final BidField bid = new BidField();

    /**
     * A reference price, in implicit six decimal place format. For an Average represents the mean of bid ask averages.
     */
    private final PriceField price = new PriceField();

    /**
     * A reference ask price, in implicit six decimal place format. Represents the average ask price for a reference price categorised as such.
     */
    private final AskField ask = new AskField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timeOfEvent, referencePriceCategory, referencePriceType, priceStatus, businessDate, instrumentId, productCode, currencyCode, bid, price, ask);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time at which the price was established.
     *
     * @return the TimeOfEvent field
     */
    public TimeOfEventField timeOfEvent() {
        return timeOfEvent;
    }

    /**
     * Category of the reference price. The specification names this field Category; it is qualified here because the Reference FX Rate message gives a Category of its own carrying a different set of values.
     *
     * @return the ReferencePriceCategory field
     */
    public ReferencePriceCategoryField referencePriceCategory() {
        return referencePriceCategory;
    }

    /**
     * Reference price type. The specification names this field PriceType; it is qualified here because the Contract Definition message gives a PriceType of its own carrying a different set of values.
     *
     * @return the ReferencePriceType field
     */
    public ReferencePriceTypeField referencePriceType() {
        return referencePriceType;
    }

    /**
     * The status of reference price.
     *
     * @return the PriceStatus field
     */
    public PriceStatusField priceStatus() {
        return priceStatus;
    }

    /**
     * The business date on which the price was established, as YYYYMMDD.
     *
     * @return the BusinessDate field
     */
    public BusinessDateField businessDate() {
        return businessDate;
    }

    /**
     * Unique Instrument Identifier. Null for PriceType Index.
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * The product code. This identifies the metal for the instrument.
     *
     * @return the ProductCode field
     */
    public ProductCodeField productCode() {
        return productCode;
    }

    /**
     * The currency code according to ISO 4217.
     *
     * @return the CurrencyCode field
     */
    public CurrencyCodeField currencyCode() {
        return currencyCode;
    }

    /**
     * A reference bid price, in implicit six decimal place format. Represents the average bid price for a reference price categorised as such.
     *
     * @return the Bid field
     */
    public BidField bid() {
        return bid;
    }

    /**
     * A reference price, in implicit six decimal place format. For an Average represents the mean of bid ask averages.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * A reference ask price, in implicit six decimal place format. Represents the average ask price for a reference price categorised as such.
     *
     * @return the Ask field
     */
    public AskField ask() {
        return ask;
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
        return Optional.ofNullable(timeOfEvent.value());
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
        if (!timeOfEvent.parse(data, cursor)) {
            return false;
        }
        cursor += TimeOfEventField.BYTE_LENGTH;
        if (!referencePriceCategory.parse(data, cursor)) {
            return false;
        }
        cursor += ReferencePriceCategoryField.BYTE_LENGTH;
        if (!referencePriceType.parse(data, cursor)) {
            return false;
        }
        cursor += ReferencePriceTypeField.BYTE_LENGTH;
        if (!priceStatus.parse(data, cursor)) {
            return false;
        }
        cursor += PriceStatusField.BYTE_LENGTH;
        if (!businessDate.parse(data, cursor)) {
            return false;
        }
        cursor += BusinessDateField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!productCode.parse(data, cursor)) {
            return false;
        }
        cursor += ProductCodeField.BYTE_LENGTH;
        if (!currencyCode.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyCodeField.BYTE_LENGTH;
        if (!bid.parse(data, cursor)) {
            return false;
        }
        cursor += BidField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        return ask.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timeOfEvent.encode(data, cursor);
        cursor = referencePriceCategory.encode(data, cursor);
        cursor = referencePriceType.encode(data, cursor);
        cursor = priceStatus.encode(data, cursor);
        cursor = businessDate.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = productCode.encode(data, cursor);
        cursor = currencyCode.encode(data, cursor);
        cursor = bid.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = ask.encode(data, cursor);
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
            case "TimeOfEvent" -> Optional.of(timeOfEvent);
            case "ReferencePriceCategory" -> Optional.of(referencePriceCategory);
            case "ReferencePriceType" -> Optional.of(referencePriceType);
            case "PriceStatus" -> Optional.of(priceStatus);
            case "BusinessDate" -> Optional.of(businessDate);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "ProductCode" -> Optional.of(productCode);
            case "CurrencyCode" -> Optional.of(currencyCode);
            case "Bid" -> Optional.of(bid);
            case "Price" -> Optional.of(price);
            case "Ask" -> Optional.of(ask);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ReferencePriceMessage message)) {
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
        if (!(other instanceof ReferencePriceMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
