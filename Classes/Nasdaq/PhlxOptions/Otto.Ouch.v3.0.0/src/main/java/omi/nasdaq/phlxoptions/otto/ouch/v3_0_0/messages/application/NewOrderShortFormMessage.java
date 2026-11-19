package omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.AloInstField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.AuctionIdField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.AuctionTypeField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.CapacityField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.ClOrdIdField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.FirmIdField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.InstrumentIdField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.IsoField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.OrderTypeField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.PositionEffectMaskField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.PriceField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.PriceProtectionField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.QuantityShortField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.SideField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.StockCapacityField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.TifField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.types.Field;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.types.Message;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.types.PrintOptions;

/**
 * Represents the NewOrderShortFormMessage message from the Otto protocol.
 *
 * <p>Short format of the New Order request is a compact message (50 bytes) with limited flexibility: simple and multi-leg instruments, quantity up to 65535, auction responses, default clearing configuration for the Firm. Acknowledged by Order Accepted (Short Form).</p>
 */
public final class NewOrderShortFormMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'B';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 49;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Order Short Form Message";

    /**
     * Firm ID (e.g. ABCD, 123A)
     */
    private final FirmIdField firmId = new FirmIdField();

    /**
     * Instrument ID, as specified by Option Directory notifications
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * See Client Order Id
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * N=Not ALO, Y=ALO
     */
    private final AloInstField aloInst = new AloInstField();

    /**
     * N=Not ISO, I=ISO
     */
    private final IsoField iso = new IsoField();

    /**
     * B=Buy, S=Sell
     */
    private final SideField side = new SideField();

    /**
     * L=Limit, M=Market
     */
    private final OrderTypeField orderType = new OrderTypeField();

    /**
     * Limit price. Should be set to 0 if Order Type = M.
     */
    private final PriceField price = new PriceField();

    /**
     * Number of contracts
     */
    private final QuantityShortField quantityShort = new QuantityShortField();

    /**
     * See Time in Force Field (TIF)
     */
    private final TifField tif = new TifField();

    /**
     * See Order Capacity Field
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * See Auction Type Field
     */
    private final AuctionTypeField auctionType = new AuctionTypeField();

    /**
     * Identifies the Auction being responded. 0 if this order is not an auction response.
     */
    private final AuctionIdField auctionId = new AuctionIdField();

    /**
     * L=Local Market, N=National Market
     */
    private final PriceProtectionField priceProtection = new PriceProtectionField();

    /**
     * See Position Effect Mask Field (bit n = leg n; set bit = Open, cleared bit = Close)
     */
    private final PositionEffectMaskField positionEffectMask = new PositionEffectMaskField();

    /**
     * P=Principal, A=Agency, R=Riskless Principal, space=Not Applicable
     */
    private final StockCapacityField stockCapacity = new StockCapacityField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(firmId, instrumentId, clOrdId, aloInst, iso, side, orderType, price, quantityShort, tif, capacity, auctionType, auctionId, priceProtection, positionEffectMask, stockCapacity);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Firm ID (e.g. ABCD, 123A)
     *
     * @return the FirmId field
     */
    public FirmIdField firmId() {
        return firmId;
    }

    /**
     * Instrument ID, as specified by Option Directory notifications
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * See Client Order Id
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * N=Not ALO, Y=ALO
     *
     * @return the AloInst field
     */
    public AloInstField aloInst() {
        return aloInst;
    }

    /**
     * N=Not ISO, I=ISO
     *
     * @return the Iso field
     */
    public IsoField iso() {
        return iso;
    }

    /**
     * B=Buy, S=Sell
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * L=Limit, M=Market
     *
     * @return the OrderType field
     */
    public OrderTypeField orderType() {
        return orderType;
    }

    /**
     * Limit price. Should be set to 0 if Order Type = M.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Number of contracts
     *
     * @return the QuantityShort field
     */
    public QuantityShortField quantityShort() {
        return quantityShort;
    }

    /**
     * See Time in Force Field (TIF)
     *
     * @return the Tif field
     */
    public TifField tif() {
        return tif;
    }

    /**
     * See Order Capacity Field
     *
     * @return the Capacity field
     */
    public CapacityField capacity() {
        return capacity;
    }

    /**
     * See Auction Type Field
     *
     * @return the AuctionType field
     */
    public AuctionTypeField auctionType() {
        return auctionType;
    }

    /**
     * Identifies the Auction being responded. 0 if this order is not an auction response.
     *
     * @return the AuctionId field
     */
    public AuctionIdField auctionId() {
        return auctionId;
    }

    /**
     * L=Local Market, N=National Market
     *
     * @return the PriceProtection field
     */
    public PriceProtectionField priceProtection() {
        return priceProtection;
    }

    /**
     * See Position Effect Mask Field (bit n = leg n; set bit = Open, cleared bit = Close)
     *
     * @return the PositionEffectMask field
     */
    public PositionEffectMaskField positionEffectMask() {
        return positionEffectMask;
    }

    /**
     * P=Principal, A=Agency, R=Riskless Principal, space=Not Applicable
     *
     * @return the StockCapacity field
     */
    public StockCapacityField stockCapacity() {
        return stockCapacity;
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
        if (!firmId.parse(data, cursor)) {
            return false;
        }
        cursor += FirmIdField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!aloInst.parse(data, cursor)) {
            return false;
        }
        cursor += AloInstField.BYTE_LENGTH;
        if (!iso.parse(data, cursor)) {
            return false;
        }
        cursor += IsoField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!orderType.parse(data, cursor)) {
            return false;
        }
        cursor += OrderTypeField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!quantityShort.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityShortField.BYTE_LENGTH;
        if (!tif.parse(data, cursor)) {
            return false;
        }
        cursor += TifField.BYTE_LENGTH;
        if (!capacity.parse(data, cursor)) {
            return false;
        }
        cursor += CapacityField.BYTE_LENGTH;
        if (!auctionType.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionTypeField.BYTE_LENGTH;
        if (!auctionId.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionIdField.BYTE_LENGTH;
        if (!priceProtection.parse(data, cursor)) {
            return false;
        }
        cursor += PriceProtectionField.BYTE_LENGTH;
        if (!positionEffectMask.parse(data, cursor)) {
            return false;
        }
        cursor += PositionEffectMaskField.BYTE_LENGTH;
        return stockCapacity.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = firmId.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = aloInst.encode(data, cursor);
        cursor = iso.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = orderType.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = quantityShort.encode(data, cursor);
        cursor = tif.encode(data, cursor);
        cursor = capacity.encode(data, cursor);
        cursor = auctionType.encode(data, cursor);
        cursor = auctionId.encode(data, cursor);
        cursor = priceProtection.encode(data, cursor);
        cursor = positionEffectMask.encode(data, cursor);
        cursor = stockCapacity.encode(data, cursor);
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
            case "FirmId" -> Optional.of(firmId);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "AloInst" -> Optional.of(aloInst);
            case "Iso" -> Optional.of(iso);
            case "Side" -> Optional.of(side);
            case "OrderType" -> Optional.of(orderType);
            case "Price" -> Optional.of(price);
            case "QuantityShort" -> Optional.of(quantityShort);
            case "Tif" -> Optional.of(tif);
            case "Capacity" -> Optional.of(capacity);
            case "AuctionType" -> Optional.of(auctionType);
            case "AuctionId" -> Optional.of(auctionId);
            case "PriceProtection" -> Optional.of(priceProtection);
            case "PositionEffectMask" -> Optional.of(positionEffectMask);
            case "StockCapacity" -> Optional.of(stockCapacity);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewOrderShortFormMessage message)) {
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
        if (!(other instanceof NewOrderShortFormMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
