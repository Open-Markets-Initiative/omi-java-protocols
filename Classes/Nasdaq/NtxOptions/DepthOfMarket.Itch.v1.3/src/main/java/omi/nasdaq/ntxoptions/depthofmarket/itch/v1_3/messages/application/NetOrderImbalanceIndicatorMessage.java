package omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.fields.AuctionIdField;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.fields.AuctionTypeField;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.fields.CustomerFirmIndicatorField;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.fields.ImbalanceDirectionField;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.fields.ImbalancePriceField;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.fields.ImbalanceVolumeField;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.fields.NanosecondsField;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.fields.OptionIdField;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.fields.PairedContractsField;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.fields.ReservedField;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.types.Field;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.types.Message;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.types.PrintOptions;

/**
 * Represents the NetOrderImbalanceIndicatorMessage message from the DepthOfMarket protocol.
 *
 * <p>BX disseminates NOII data at 5-second intervals in the minutes leading up to the BX Opening Auction events. This message is also used for price improvement (PRISM) auctions.</p>
 */
public final class NetOrderImbalanceIndicatorMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'I';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 30;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Net Order Imbalance Indicator Message";

    /**
     * Nanoseconds portion of timestamp
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

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
     * The imbalance contracts.
     */
    private final ImbalanceVolumeField imbalanceVolume = new ImbalanceVolumeField();

    /**
     * For Order Exposure (AuctionType=I) only. Indicates the order capacity:
     */
    private final CustomerFirmIndicatorField customerFirmIndicator = new CustomerFirmIndicatorField();

    /**
     * Reserved for future use
     */
    private final ReservedField reserved = new ReservedField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, auctionId, auctionType, pairedContracts, imbalanceDirection, optionId, imbalancePrice, imbalanceVolume, customerFirmIndicator, reserved);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds portion of timestamp
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
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
     * The imbalance contracts.
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

    /**
     * Reserved for future use
     *
     * @return the Reserved field
     */
    public ReservedField reserved() {
        return reserved;
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
        return reserved.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanoseconds.encode(data, cursor);
        cursor = auctionId.encode(data, cursor);
        cursor = auctionType.encode(data, cursor);
        cursor = pairedContracts.encode(data, cursor);
        cursor = imbalanceDirection.encode(data, cursor);
        cursor = optionId.encode(data, cursor);
        cursor = imbalancePrice.encode(data, cursor);
        cursor = imbalanceVolume.encode(data, cursor);
        cursor = customerFirmIndicator.encode(data, cursor);
        cursor = reserved.encode(data, cursor);
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
            case "AuctionId" -> Optional.of(auctionId);
            case "AuctionType" -> Optional.of(auctionType);
            case "PairedContracts" -> Optional.of(pairedContracts);
            case "ImbalanceDirection" -> Optional.of(imbalanceDirection);
            case "OptionId" -> Optional.of(optionId);
            case "ImbalancePrice" -> Optional.of(imbalancePrice);
            case "ImbalanceVolume" -> Optional.of(imbalanceVolume);
            case "CustomerFirmIndicator" -> Optional.of(customerFirmIndicator);
            case "Reserved" -> Optional.of(reserved);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NetOrderImbalanceIndicatorMessage message)) {
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
        if (!(other instanceof NetOrderImbalanceIndicatorMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
