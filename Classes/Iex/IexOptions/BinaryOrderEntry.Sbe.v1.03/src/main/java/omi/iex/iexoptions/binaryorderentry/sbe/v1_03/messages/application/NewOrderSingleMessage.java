package omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.AccountAccountOptionalField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.AiqField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.AttributedQuoteOptionalField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.AuctionIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.CancelInsteadOfSlideOptionalField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.ClOrdIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.ClearingAccountOptionalField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.ClearingFirmField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.CustomerOrFirmField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.DisplayInstField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.ExecInstField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.InstrumentIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.MarketParticipantIdOptionalField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.OpenCloseField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.OptionalDataField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.OrdTypeField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.OrderQtyQuantityNonZeroField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.PricePrice8OptionalField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.RoutingFirmIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.SideField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.TargetPartyIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.TimeInForceField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.types.Field;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.types.Message;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.types.PrintOptions;

/**
 * Represents the NewOrderSingleMessage message from the BinaryOrderEntry protocol.
 *
 * <p>NewOrderSingleMessage</p>
 */
public final class NewOrderSingleMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 92;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Order Single Message";

    /**
     * account
     */
    private final AccountAccountOptionalField accountAccountOptional = new AccountAccountOptionalField();

    /**
     * instrumentId
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * marketParticipantId
     */
    private final MarketParticipantIdOptionalField marketParticipantIdOptional = new MarketParticipantIdOptionalField();

    /**
     * clOrdId
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * clearingAccount
     */
    private final ClearingAccountOptionalField clearingAccountOptional = new ClearingAccountOptionalField();

    /**
     * customerOrFirm
     */
    private final CustomerOrFirmField customerOrFirm = new CustomerOrFirmField();

    /**
     * openClose
     */
    private final OpenCloseField openClose = new OpenCloseField();

    /**
     * attributedQuote
     */
    private final AttributedQuoteOptionalField attributedQuoteOptional = new AttributedQuoteOptionalField();

    /**
     * timeInForce
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * cancelInsteadOfSlide
     */
    private final CancelInsteadOfSlideOptionalField cancelInsteadOfSlideOptional = new CancelInsteadOfSlideOptionalField();

    /**
     * displayInst
     */
    private final DisplayInstField displayInst = new DisplayInstField();

    /**
     * execInst
     */
    private final ExecInstField execInst = new ExecInstField();

    /**
     * ordType
     */
    private final OrdTypeField ordType = new OrdTypeField();

    /**
     * targetPartyId
     */
    private final TargetPartyIdField targetPartyId = new TargetPartyIdField();

    /**
     * auctionId
     */
    private final AuctionIdField auctionId = new AuctionIdField();

    /**
     * clearingFirm
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * optionalData
     */
    private final OptionalDataField optionalData = new OptionalDataField();

    /**
     * routingFirmId
     */
    private final RoutingFirmIdField routingFirmId = new RoutingFirmIdField();

    /**
     * aiq
     */
    private final AiqField aiq = new AiqField();

    /**
     * side
     */
    private final SideField side = new SideField();

    /**
     * price
     */
    private final PricePrice8OptionalField pricePrice8Optional = new PricePrice8OptionalField();

    /**
     * orderQty
     */
    private final OrderQtyQuantityNonZeroField orderQtyQuantityNonZero = new OrderQtyQuantityNonZeroField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(accountAccountOptional, instrumentId, marketParticipantIdOptional, clOrdId, clearingAccountOptional, customerOrFirm, openClose, attributedQuoteOptional, timeInForce, cancelInsteadOfSlideOptional, displayInst, execInst, ordType, targetPartyId, auctionId, clearingFirm, optionalData, routingFirmId, aiq, side, pricePrice8Optional, orderQtyQuantityNonZero);

    private byte[] buffer;

    private boolean decoded;

    /**
     * account
     *
     * @return the AccountAccountOptional field
     */
    public AccountAccountOptionalField accountAccountOptional() {
        return accountAccountOptional;
    }

    /**
     * instrumentId
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * marketParticipantId
     *
     * @return the MarketParticipantIdOptional field
     */
    public MarketParticipantIdOptionalField marketParticipantIdOptional() {
        return marketParticipantIdOptional;
    }

    /**
     * clOrdId
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * clearingAccount
     *
     * @return the ClearingAccountOptional field
     */
    public ClearingAccountOptionalField clearingAccountOptional() {
        return clearingAccountOptional;
    }

    /**
     * customerOrFirm
     *
     * @return the CustomerOrFirm field
     */
    public CustomerOrFirmField customerOrFirm() {
        return customerOrFirm;
    }

    /**
     * openClose
     *
     * @return the OpenClose field
     */
    public OpenCloseField openClose() {
        return openClose;
    }

    /**
     * attributedQuote
     *
     * @return the AttributedQuoteOptional field
     */
    public AttributedQuoteOptionalField attributedQuoteOptional() {
        return attributedQuoteOptional;
    }

    /**
     * timeInForce
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
    }

    /**
     * cancelInsteadOfSlide
     *
     * @return the CancelInsteadOfSlideOptional field
     */
    public CancelInsteadOfSlideOptionalField cancelInsteadOfSlideOptional() {
        return cancelInsteadOfSlideOptional;
    }

    /**
     * displayInst
     *
     * @return the DisplayInst field
     */
    public DisplayInstField displayInst() {
        return displayInst;
    }

    /**
     * execInst
     *
     * @return the ExecInst field
     */
    public ExecInstField execInst() {
        return execInst;
    }

    /**
     * ordType
     *
     * @return the OrdType field
     */
    public OrdTypeField ordType() {
        return ordType;
    }

    /**
     * targetPartyId
     *
     * @return the TargetPartyId field
     */
    public TargetPartyIdField targetPartyId() {
        return targetPartyId;
    }

    /**
     * auctionId
     *
     * @return the AuctionId field
     */
    public AuctionIdField auctionId() {
        return auctionId;
    }

    /**
     * clearingFirm
     *
     * @return the ClearingFirm field
     */
    public ClearingFirmField clearingFirm() {
        return clearingFirm;
    }

    /**
     * optionalData
     *
     * @return the OptionalData field
     */
    public OptionalDataField optionalData() {
        return optionalData;
    }

    /**
     * routingFirmId
     *
     * @return the RoutingFirmId field
     */
    public RoutingFirmIdField routingFirmId() {
        return routingFirmId;
    }

    /**
     * aiq
     *
     * @return the Aiq field
     */
    public AiqField aiq() {
        return aiq;
    }

    /**
     * side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * price
     *
     * @return the PricePrice8Optional field
     */
    public PricePrice8OptionalField pricePrice8Optional() {
        return pricePrice8Optional;
    }

    /**
     * orderQty
     *
     * @return the OrderQtyQuantityNonZero field
     */
    public OrderQtyQuantityNonZeroField orderQtyQuantityNonZero() {
        return orderQtyQuantityNonZero;
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
        if (!accountAccountOptional.parse(data, cursor)) {
            return false;
        }
        cursor += AccountAccountOptionalField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!marketParticipantIdOptional.parse(data, cursor)) {
            return false;
        }
        cursor += MarketParticipantIdOptionalField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!clearingAccountOptional.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingAccountOptionalField.BYTE_LENGTH;
        if (!customerOrFirm.parse(data, cursor)) {
            return false;
        }
        cursor += CustomerOrFirmField.BYTE_LENGTH;
        if (!openClose.parse(data, cursor)) {
            return false;
        }
        cursor += OpenCloseField.BYTE_LENGTH;
        if (!attributedQuoteOptional.parse(data, cursor)) {
            return false;
        }
        cursor += AttributedQuoteOptionalField.BYTE_LENGTH;
        if (!timeInForce.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceField.BYTE_LENGTH;
        if (!cancelInsteadOfSlideOptional.parse(data, cursor)) {
            return false;
        }
        cursor += CancelInsteadOfSlideOptionalField.BYTE_LENGTH;
        if (!displayInst.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayInstField.BYTE_LENGTH;
        if (!execInst.parse(data, cursor)) {
            return false;
        }
        cursor += ExecInstField.BYTE_LENGTH;
        if (!ordType.parse(data, cursor)) {
            return false;
        }
        cursor += OrdTypeField.BYTE_LENGTH;
        if (!targetPartyId.parse(data, cursor)) {
            return false;
        }
        cursor += TargetPartyIdField.BYTE_LENGTH;
        if (!auctionId.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionIdField.BYTE_LENGTH;
        if (!clearingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingFirmField.BYTE_LENGTH;
        if (!optionalData.parse(data, cursor)) {
            return false;
        }
        cursor += OptionalDataField.BYTE_LENGTH;
        if (!routingFirmId.parse(data, cursor)) {
            return false;
        }
        cursor += RoutingFirmIdField.BYTE_LENGTH;
        if (!aiq.parse(data, cursor)) {
            return false;
        }
        cursor += AiqField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!pricePrice8Optional.parse(data, cursor)) {
            return false;
        }
        cursor += PricePrice8OptionalField.BYTE_LENGTH;
        return orderQtyQuantityNonZero.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = accountAccountOptional.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = marketParticipantIdOptional.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = clearingAccountOptional.encode(data, cursor);
        cursor = customerOrFirm.encode(data, cursor);
        cursor = openClose.encode(data, cursor);
        cursor = attributedQuoteOptional.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = cancelInsteadOfSlideOptional.encode(data, cursor);
        cursor = displayInst.encode(data, cursor);
        cursor = execInst.encode(data, cursor);
        cursor = ordType.encode(data, cursor);
        cursor = targetPartyId.encode(data, cursor);
        cursor = auctionId.encode(data, cursor);
        cursor = clearingFirm.encode(data, cursor);
        cursor = optionalData.encode(data, cursor);
        cursor = routingFirmId.encode(data, cursor);
        cursor = aiq.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = pricePrice8Optional.encode(data, cursor);
        cursor = orderQtyQuantityNonZero.encode(data, cursor);
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
            case "AccountAccountOptional" -> Optional.of(accountAccountOptional);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "MarketParticipantIdOptional" -> Optional.of(marketParticipantIdOptional);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "ClearingAccountOptional" -> Optional.of(clearingAccountOptional);
            case "CustomerOrFirm" -> Optional.of(customerOrFirm);
            case "OpenClose" -> Optional.of(openClose);
            case "AttributedQuoteOptional" -> Optional.of(attributedQuoteOptional);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "CancelInsteadOfSlideOptional" -> Optional.of(cancelInsteadOfSlideOptional);
            case "DisplayInst" -> Optional.of(displayInst);
            case "ExecInst" -> Optional.of(execInst);
            case "OrdType" -> Optional.of(ordType);
            case "TargetPartyId" -> Optional.of(targetPartyId);
            case "AuctionId" -> Optional.of(auctionId);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "OptionalData" -> Optional.of(optionalData);
            case "RoutingFirmId" -> Optional.of(routingFirmId);
            case "Aiq" -> Optional.of(aiq);
            case "Side" -> Optional.of(side);
            case "PricePrice8Optional" -> Optional.of(pricePrice8Optional);
            case "OrderQtyQuantityNonZero" -> Optional.of(orderQtyQuantityNonZero);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewOrderSingleMessage message)) {
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
        if (!(other instanceof NewOrderSingleMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
