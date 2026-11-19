package omi.nasdaq.nomoptions.itto.itch.v4_0_2025.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nomoptions.itto.itch.v4_0_2025.fields.AuctionIdField;
import omi.nasdaq.nomoptions.itto.itch.v4_0_2025.fields.AuctionTypeField;
import omi.nasdaq.nomoptions.itto.itch.v4_0_2025.fields.CustomerFirmIndicatorField;
import omi.nasdaq.nomoptions.itto.itch.v4_0_2025.fields.ImbalanceDirectionField;
import omi.nasdaq.nomoptions.itto.itch.v4_0_2025.fields.ImbalancePriceField;
import omi.nasdaq.nomoptions.itto.itch.v4_0_2025.fields.ImbalanceVolumeField;
import omi.nasdaq.nomoptions.itto.itch.v4_0_2025.fields.OptionIdField;
import omi.nasdaq.nomoptions.itto.itch.v4_0_2025.fields.PairedContractsField;
import omi.nasdaq.nomoptions.itto.itch.v4_0_2025.fields.TimestampField;
import omi.nasdaq.nomoptions.itto.itch.v4_0_2025.fields.TrackingNumberField;
import omi.nasdaq.nomoptions.itto.itch.v4_0_2025.types.Field;
import omi.nasdaq.nomoptions.itto.itch.v4_0_2025.types.Message;
import omi.nasdaq.nomoptions.itto.itch.v4_0_2025.types.PrintOptions;

/**
 * Represents the NoiiMessage message from the Itto protocol.
 *
 * <p>For the NASDAQ Opening Auction, NASDAQ will begin the dissemination of NOII messages for a put or a call option five minutes prior to the start of opening process event and two minutes prior to the halt resumption (reopening) process event.</p>
 */
public final class NoiiMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'I';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 34;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Noii Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 31, 3 };

    /**
     * Nasdaq Internal tracking number
     */
    private final TrackingNumberField trackingNumber = new TrackingNumberField();

    /**
     * Nanoseconds since midnight
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Uniquely identifies the Auction for the trading day.
     */
    private final AuctionIdField auctionId = new AuctionIdField();

    /**
     * Type of Auction:
     */
    private final AuctionTypeField auctionType = new AuctionTypeField();

    /**
     * The total number of contracts that are eligible to be matched at the Current Reference Price. 0 for Price Improvement (PRISM) Auction.
     */
    private final PairedContractsField pairedContracts = new PairedContractsField();

    /**
     * Indicates the market side of the imbalance
     */
    private final ImbalanceDirectionField imbalanceDirection = new ImbalanceDirectionField();

    /**
     * Option ID assigned daily, valid for trading day.
     */
    private final OptionIdField optionId = new OptionIdField();

    /**
     * The imbalance price. 0 for Price Improvement (PRISM) Auction
     */
    private final ImbalancePriceField imbalancePrice = new ImbalancePriceField();

    /**
     * The imbalance volume.
     */
    private final ImbalanceVolumeField imbalanceVolume = new ImbalanceVolumeField();

    /**
     * For Order Exposure (AuctionType=I) only. Indicates the order capacity:
     */
    private final CustomerFirmIndicatorField customerFirmIndicator = new CustomerFirmIndicatorField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(trackingNumber, timestampField, auctionId, auctionType, pairedContracts, imbalanceDirection, optionId, imbalancePrice, imbalanceVolume, customerFirmIndicator);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nasdaq Internal tracking number
     *
     * @return the TrackingNumber field
     */
    public TrackingNumberField trackingNumber() {
        return trackingNumber;
    }

    /**
     * Nanoseconds since midnight
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Uniquely identifies the Auction for the trading day.
     *
     * @return the AuctionId field
     */
    public AuctionIdField auctionId() {
        return auctionId;
    }

    /**
     * Type of Auction:
     *
     * @return the AuctionType field
     */
    public AuctionTypeField auctionType() {
        return auctionType;
    }

    /**
     * The total number of contracts that are eligible to be matched at the Current Reference Price. 0 for Price Improvement (PRISM) Auction.
     *
     * @return the PairedContracts field
     */
    public PairedContractsField pairedContracts() {
        return pairedContracts;
    }

    /**
     * Indicates the market side of the imbalance
     *
     * @return the ImbalanceDirection field
     */
    public ImbalanceDirectionField imbalanceDirection() {
        return imbalanceDirection;
    }

    /**
     * Option ID assigned daily, valid for trading day.
     *
     * @return the OptionId field
     */
    public OptionIdField optionId() {
        return optionId;
    }

    /**
     * The imbalance price. 0 for Price Improvement (PRISM) Auction
     *
     * @return the ImbalancePrice field
     */
    public ImbalancePriceField imbalancePrice() {
        return imbalancePrice;
    }

    /**
     * The imbalance volume.
     *
     * @return the ImbalanceVolume field
     */
    public ImbalanceVolumeField imbalanceVolume() {
        return imbalanceVolume;
    }

    /**
     * For Order Exposure (AuctionType=I) only. Indicates the order capacity:
     *
     * @return the CustomerFirmIndicator field
     */
    public CustomerFirmIndicatorField customerFirmIndicator() {
        return customerFirmIndicator;
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
        if (!trackingNumber.parse(data, cursor)) {
            return false;
        }
        cursor += TrackingNumberField.BYTE_LENGTH;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!auctionId.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionIdField.BYTE_LENGTH;
        if (!auctionType.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionTypeField.BYTE_LENGTH;
        if (!pairedContracts.parse(data, cursor)) {
            return false;
        }
        cursor += PairedContractsField.BYTE_LENGTH;
        if (!imbalanceDirection.parse(data, cursor)) {
            return false;
        }
        cursor += ImbalanceDirectionField.BYTE_LENGTH;
        if (!optionId.parse(data, cursor)) {
            return false;
        }
        cursor += OptionIdField.BYTE_LENGTH;
        if (!imbalancePrice.parse(data, cursor)) {
            return false;
        }
        cursor += ImbalancePriceField.BYTE_LENGTH;
        if (!imbalanceVolume.parse(data, cursor)) {
            return false;
        }
        cursor += ImbalanceVolumeField.BYTE_LENGTH;
        if (!customerFirmIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += CustomerFirmIndicatorField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = trackingNumber.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = auctionId.encode(data, cursor);
        cursor = auctionType.encode(data, cursor);
        cursor = pairedContracts.encode(data, cursor);
        cursor = imbalanceDirection.encode(data, cursor);
        cursor = optionId.encode(data, cursor);
        cursor = imbalancePrice.encode(data, cursor);
        cursor = imbalanceVolume.encode(data, cursor);
        cursor = customerFirmIndicator.encode(data, cursor);
        if (buffer != null && buffer.length >= 34) {
            System.arraycopy(buffer, 31, data, cursor, 3); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 3, (byte) 0); // padding
        }
        cursor += 3;
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
            case "TrackingNumber" -> Optional.of(trackingNumber);
            case "Timestamp" -> Optional.of(timestampField);
            case "AuctionId" -> Optional.of(auctionId);
            case "AuctionType" -> Optional.of(auctionType);
            case "PairedContracts" -> Optional.of(pairedContracts);
            case "ImbalanceDirection" -> Optional.of(imbalanceDirection);
            case "OptionId" -> Optional.of(optionId);
            case "ImbalancePrice" -> Optional.of(imbalancePrice);
            case "ImbalanceVolume" -> Optional.of(imbalanceVolume);
            case "CustomerFirmIndicator" -> Optional.of(customerFirmIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NoiiMessage message)) {
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
        if (!(other instanceof NoiiMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
