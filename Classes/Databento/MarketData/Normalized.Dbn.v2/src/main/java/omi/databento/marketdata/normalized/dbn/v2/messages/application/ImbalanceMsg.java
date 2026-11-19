package omi.databento.marketdata.normalized.dbn.v2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.databento.marketdata.normalized.dbn.v2.fields.AuctInterestClrPriceField;
import omi.databento.marketdata.normalized.dbn.v2.fields.AuctionStatusField;
import omi.databento.marketdata.normalized.dbn.v2.fields.AuctionTimeField;
import omi.databento.marketdata.normalized.dbn.v2.fields.AuctionTypeField;
import omi.databento.marketdata.normalized.dbn.v2.fields.ContBookClrPriceField;
import omi.databento.marketdata.normalized.dbn.v2.fields.FreezeStatusField;
import omi.databento.marketdata.normalized.dbn.v2.fields.IndMatchPriceField;
import omi.databento.marketdata.normalized.dbn.v2.fields.LowerCollarField;
import omi.databento.marketdata.normalized.dbn.v2.fields.MarketImbalanceQtyField;
import omi.databento.marketdata.normalized.dbn.v2.fields.NumExtensionsField;
import omi.databento.marketdata.normalized.dbn.v2.fields.PairedQtyField;
import omi.databento.marketdata.normalized.dbn.v2.fields.RefPriceField;
import omi.databento.marketdata.normalized.dbn.v2.fields.SideField;
import omi.databento.marketdata.normalized.dbn.v2.fields.SignificantImbalanceField;
import omi.databento.marketdata.normalized.dbn.v2.fields.SsrFillingPriceField;
import omi.databento.marketdata.normalized.dbn.v2.fields.TotalImbalanceQtyField;
import omi.databento.marketdata.normalized.dbn.v2.fields.TsRecvField;
import omi.databento.marketdata.normalized.dbn.v2.fields.UnpairedQtyField;
import omi.databento.marketdata.normalized.dbn.v2.fields.UnpairedSideField;
import omi.databento.marketdata.normalized.dbn.v2.fields.UpperCollarField;
import omi.databento.marketdata.normalized.dbn.v2.types.Field;
import omi.databento.marketdata.normalized.dbn.v2.types.Message;
import omi.databento.marketdata.normalized.dbn.v2.types.PrintOptions;

/**
 * Represents the ImbalanceMsg message from the Normalized protocol.
 *
 * <p>An auction imbalance message; the record of the imbalance schema</p>
 */
public final class ImbalanceMsg implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\u0014';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 96;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Imbalance Msg";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 95, 1 };

    /**
     * The capture-server-received timestamp expressed as the number of nanoseconds since the UNIX epoch
     */
    private final TsRecvField tsRecv = new TsRecvField();

    /**
     * The price at which the imbalance shares are calculated
     */
    private final RefPriceField refPrice = new RefPriceField();

    /**
     * Reserved for future use
     */
    private final AuctionTimeField auctionTime = new AuctionTimeField();

    /**
     * The hypothetical auction-clearing price for both cross and continuous orders
     */
    private final ContBookClrPriceField contBookClrPrice = new ContBookClrPriceField();

    /**
     * The hypothetical auction-clearing price for cross orders only
     */
    private final AuctInterestClrPriceField auctInterestClrPrice = new AuctInterestClrPriceField();

    /**
     * Reserved for future use
     */
    private final SsrFillingPriceField ssrFillingPrice = new SsrFillingPriceField();

    /**
     * Reserved for future use
     */
    private final IndMatchPriceField indMatchPrice = new IndMatchPriceField();

    /**
     * Reserved for future use
     */
    private final UpperCollarField upperCollar = new UpperCollarField();

    /**
     * Reserved for future use
     */
    private final LowerCollarField lowerCollar = new LowerCollarField();

    /**
     * The quantity of shares that are eligible to be matched at ref_price
     */
    private final PairedQtyField pairedQty = new PairedQtyField();

    /**
     * The quantity of shares that are not paired at ref_price
     */
    private final TotalImbalanceQtyField totalImbalanceQty = new TotalImbalanceQtyField();

    /**
     * Reserved for future use
     */
    private final MarketImbalanceQtyField marketImbalanceQty = new MarketImbalanceQtyField();

    /**
     * Reserved for future use
     */
    private final UnpairedQtyField unpairedQty = new UnpairedQtyField();

    /**
     * Venue-specific character code indicating the auction type; ~ when unused
     */
    private final AuctionTypeField auctionType = new AuctionTypeField();

    /**
     * The side that initiates the event
     */
    private final SideField side = new SideField();

    /**
     * Reserved for future use
     */
    private final AuctionStatusField auctionStatus = new AuctionStatusField();

    /**
     * Reserved for future use
     */
    private final FreezeStatusField freezeStatus = new FreezeStatusField();

    /**
     * Reserved for future use
     */
    private final NumExtensionsField numExtensions = new NumExtensionsField();

    /**
     * Reserved for future use
     */
    private final UnpairedSideField unpairedSide = new UnpairedSideField();

    /**
     * Venue-specific character code; for Nasdaq, contains the raw Price Variation Indicator
     */
    private final SignificantImbalanceField significantImbalance = new SignificantImbalanceField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(tsRecv, refPrice, auctionTime, contBookClrPrice, auctInterestClrPrice, ssrFillingPrice, indMatchPrice, upperCollar, lowerCollar, pairedQty, totalImbalanceQty, marketImbalanceQty, unpairedQty, auctionType, side, auctionStatus, freezeStatus, numExtensions, unpairedSide, significantImbalance);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The capture-server-received timestamp expressed as the number of nanoseconds since the UNIX epoch
     *
     * @return the TsRecv field
     */
    public TsRecvField tsRecv() {
        return tsRecv;
    }

    /**
     * The price at which the imbalance shares are calculated
     *
     * @return the RefPrice field
     */
    public RefPriceField refPrice() {
        return refPrice;
    }

    /**
     * Reserved for future use
     *
     * @return the AuctionTime field
     */
    public AuctionTimeField auctionTime() {
        return auctionTime;
    }

    /**
     * The hypothetical auction-clearing price for both cross and continuous orders
     *
     * @return the ContBookClrPrice field
     */
    public ContBookClrPriceField contBookClrPrice() {
        return contBookClrPrice;
    }

    /**
     * The hypothetical auction-clearing price for cross orders only
     *
     * @return the AuctInterestClrPrice field
     */
    public AuctInterestClrPriceField auctInterestClrPrice() {
        return auctInterestClrPrice;
    }

    /**
     * Reserved for future use
     *
     * @return the SsrFillingPrice field
     */
    public SsrFillingPriceField ssrFillingPrice() {
        return ssrFillingPrice;
    }

    /**
     * Reserved for future use
     *
     * @return the IndMatchPrice field
     */
    public IndMatchPriceField indMatchPrice() {
        return indMatchPrice;
    }

    /**
     * Reserved for future use
     *
     * @return the UpperCollar field
     */
    public UpperCollarField upperCollar() {
        return upperCollar;
    }

    /**
     * Reserved for future use
     *
     * @return the LowerCollar field
     */
    public LowerCollarField lowerCollar() {
        return lowerCollar;
    }

    /**
     * The quantity of shares that are eligible to be matched at ref_price
     *
     * @return the PairedQty field
     */
    public PairedQtyField pairedQty() {
        return pairedQty;
    }

    /**
     * The quantity of shares that are not paired at ref_price
     *
     * @return the TotalImbalanceQty field
     */
    public TotalImbalanceQtyField totalImbalanceQty() {
        return totalImbalanceQty;
    }

    /**
     * Reserved for future use
     *
     * @return the MarketImbalanceQty field
     */
    public MarketImbalanceQtyField marketImbalanceQty() {
        return marketImbalanceQty;
    }

    /**
     * Reserved for future use
     *
     * @return the UnpairedQty field
     */
    public UnpairedQtyField unpairedQty() {
        return unpairedQty;
    }

    /**
     * Venue-specific character code indicating the auction type; ~ when unused
     *
     * @return the AuctionType field
     */
    public AuctionTypeField auctionType() {
        return auctionType;
    }

    /**
     * The side that initiates the event
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Reserved for future use
     *
     * @return the AuctionStatus field
     */
    public AuctionStatusField auctionStatus() {
        return auctionStatus;
    }

    /**
     * Reserved for future use
     *
     * @return the FreezeStatus field
     */
    public FreezeStatusField freezeStatus() {
        return freezeStatus;
    }

    /**
     * Reserved for future use
     *
     * @return the NumExtensions field
     */
    public NumExtensionsField numExtensions() {
        return numExtensions;
    }

    /**
     * Reserved for future use
     *
     * @return the UnpairedSide field
     */
    public UnpairedSideField unpairedSide() {
        return unpairedSide;
    }

    /**
     * Venue-specific character code; for Nasdaq, contains the raw Price Variation Indicator
     *
     * @return the SignificantImbalance field
     */
    public SignificantImbalanceField significantImbalance() {
        return significantImbalance;
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
        return Optional.ofNullable(tsRecv.value());
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
        if (!tsRecv.parse(data, cursor)) {
            return false;
        }
        cursor += TsRecvField.BYTE_LENGTH;
        if (!refPrice.parse(data, cursor)) {
            return false;
        }
        cursor += RefPriceField.BYTE_LENGTH;
        if (!auctionTime.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionTimeField.BYTE_LENGTH;
        if (!contBookClrPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ContBookClrPriceField.BYTE_LENGTH;
        if (!auctInterestClrPrice.parse(data, cursor)) {
            return false;
        }
        cursor += AuctInterestClrPriceField.BYTE_LENGTH;
        if (!ssrFillingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += SsrFillingPriceField.BYTE_LENGTH;
        if (!indMatchPrice.parse(data, cursor)) {
            return false;
        }
        cursor += IndMatchPriceField.BYTE_LENGTH;
        if (!upperCollar.parse(data, cursor)) {
            return false;
        }
        cursor += UpperCollarField.BYTE_LENGTH;
        if (!lowerCollar.parse(data, cursor)) {
            return false;
        }
        cursor += LowerCollarField.BYTE_LENGTH;
        if (!pairedQty.parse(data, cursor)) {
            return false;
        }
        cursor += PairedQtyField.BYTE_LENGTH;
        if (!totalImbalanceQty.parse(data, cursor)) {
            return false;
        }
        cursor += TotalImbalanceQtyField.BYTE_LENGTH;
        if (!marketImbalanceQty.parse(data, cursor)) {
            return false;
        }
        cursor += MarketImbalanceQtyField.BYTE_LENGTH;
        if (!unpairedQty.parse(data, cursor)) {
            return false;
        }
        cursor += UnpairedQtyField.BYTE_LENGTH;
        if (!auctionType.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionTypeField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!auctionStatus.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionStatusField.BYTE_LENGTH;
        if (!freezeStatus.parse(data, cursor)) {
            return false;
        }
        cursor += FreezeStatusField.BYTE_LENGTH;
        if (!numExtensions.parse(data, cursor)) {
            return false;
        }
        cursor += NumExtensionsField.BYTE_LENGTH;
        if (!unpairedSide.parse(data, cursor)) {
            return false;
        }
        cursor += UnpairedSideField.BYTE_LENGTH;
        if (!significantImbalance.parse(data, cursor)) {
            return false;
        }
        cursor += SignificantImbalanceField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = tsRecv.encode(data, cursor);
        cursor = refPrice.encode(data, cursor);
        cursor = auctionTime.encode(data, cursor);
        cursor = contBookClrPrice.encode(data, cursor);
        cursor = auctInterestClrPrice.encode(data, cursor);
        cursor = ssrFillingPrice.encode(data, cursor);
        cursor = indMatchPrice.encode(data, cursor);
        cursor = upperCollar.encode(data, cursor);
        cursor = lowerCollar.encode(data, cursor);
        cursor = pairedQty.encode(data, cursor);
        cursor = totalImbalanceQty.encode(data, cursor);
        cursor = marketImbalanceQty.encode(data, cursor);
        cursor = unpairedQty.encode(data, cursor);
        cursor = auctionType.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = auctionStatus.encode(data, cursor);
        cursor = freezeStatus.encode(data, cursor);
        cursor = numExtensions.encode(data, cursor);
        cursor = unpairedSide.encode(data, cursor);
        cursor = significantImbalance.encode(data, cursor);
        if (buffer != null && buffer.length >= 96) {
            System.arraycopy(buffer, 95, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
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
            case "TsRecv" -> Optional.of(tsRecv);
            case "RefPrice" -> Optional.of(refPrice);
            case "AuctionTime" -> Optional.of(auctionTime);
            case "ContBookClrPrice" -> Optional.of(contBookClrPrice);
            case "AuctInterestClrPrice" -> Optional.of(auctInterestClrPrice);
            case "SsrFillingPrice" -> Optional.of(ssrFillingPrice);
            case "IndMatchPrice" -> Optional.of(indMatchPrice);
            case "UpperCollar" -> Optional.of(upperCollar);
            case "LowerCollar" -> Optional.of(lowerCollar);
            case "PairedQty" -> Optional.of(pairedQty);
            case "TotalImbalanceQty" -> Optional.of(totalImbalanceQty);
            case "MarketImbalanceQty" -> Optional.of(marketImbalanceQty);
            case "UnpairedQty" -> Optional.of(unpairedQty);
            case "AuctionType" -> Optional.of(auctionType);
            case "Side" -> Optional.of(side);
            case "AuctionStatus" -> Optional.of(auctionStatus);
            case "FreezeStatus" -> Optional.of(freezeStatus);
            case "NumExtensions" -> Optional.of(numExtensions);
            case "UnpairedSide" -> Optional.of(unpairedSide);
            case "SignificantImbalance" -> Optional.of(significantImbalance);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ImbalanceMsg message)) {
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
        if (!(other instanceof ImbalanceMsg message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
