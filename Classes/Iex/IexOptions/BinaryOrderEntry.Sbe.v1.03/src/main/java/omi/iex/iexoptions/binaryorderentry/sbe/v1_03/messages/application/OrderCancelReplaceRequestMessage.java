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
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.CustomerOrFirmOptionalField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.DisplayInstField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.ExecInstField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.InstrumentIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.MarketParticipantIdOptionalField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.OpenCloseOptionalField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.OptionalDataField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.OrdTypeOptionalField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.OrderQtyQuantityNonZeroField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.OrigClOrdIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.PricePrice8OptionalField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.RoutingFirmIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.SideOptionalField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.TargetPartyIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.TimeInForceOptionalField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.types.Field;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.types.Message;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.types.PrintOptions;

/**
 * Represents the OrderCancelReplaceRequestMessage message from the BinaryOrderEntry protocol.
 *
 * <p>OrderCancelReplaceRequestMessage</p>
 */
public final class OrderCancelReplaceRequestMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 100;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Cancel Replace Request Message";

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
     * origClOrdId
     */
    private final OrigClOrdIdField origClOrdId = new OrigClOrdIdField();

    /**
     * customerOrFirm
     */
    private final CustomerOrFirmOptionalField customerOrFirmOptional = new CustomerOrFirmOptionalField();

    /**
     * openClose
     */
    private final OpenCloseOptionalField openCloseOptional = new OpenCloseOptionalField();

    /**
     * attributedQuote
     */
    private final AttributedQuoteOptionalField attributedQuoteOptional = new AttributedQuoteOptionalField();

    /**
     * timeInForce
     */
    private final TimeInForceOptionalField timeInForceOptional = new TimeInForceOptionalField();

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
    private final OrdTypeOptionalField ordTypeOptional = new OrdTypeOptionalField();

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
    private final SideOptionalField sideOptional = new SideOptionalField();

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
    private final List<Field> fields = List.of(accountAccountOptional, instrumentId, marketParticipantIdOptional, clOrdId, clearingAccountOptional, origClOrdId, customerOrFirmOptional, openCloseOptional, attributedQuoteOptional, timeInForceOptional, cancelInsteadOfSlideOptional, displayInst, execInst, ordTypeOptional, targetPartyId, auctionId, clearingFirm, optionalData, routingFirmId, aiq, sideOptional, pricePrice8Optional, orderQtyQuantityNonZero);

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
     * origClOrdId
     *
     * @return the OrigClOrdId field
     */
    public OrigClOrdIdField origClOrdId() {
        return origClOrdId;
    }

    /**
     * customerOrFirm
     *
     * @return the CustomerOrFirmOptional field
     */
    public CustomerOrFirmOptionalField customerOrFirmOptional() {
        return customerOrFirmOptional;
    }

    /**
     * openClose
     *
     * @return the OpenCloseOptional field
     */
    public OpenCloseOptionalField openCloseOptional() {
        return openCloseOptional;
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
     * @return the TimeInForceOptional field
     */
    public TimeInForceOptionalField timeInForceOptional() {
        return timeInForceOptional;
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
     * @return the OrdTypeOptional field
     */
    public OrdTypeOptionalField ordTypeOptional() {
        return ordTypeOptional;
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
     * @return the SideOptional field
     */
    public SideOptionalField sideOptional() {
        return sideOptional;
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
        if (!origClOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += OrigClOrdIdField.BYTE_LENGTH;
        if (!customerOrFirmOptional.parse(data, cursor)) {
            return false;
        }
        cursor += CustomerOrFirmOptionalField.BYTE_LENGTH;
        if (!openCloseOptional.parse(data, cursor)) {
            return false;
        }
        cursor += OpenCloseOptionalField.BYTE_LENGTH;
        if (!attributedQuoteOptional.parse(data, cursor)) {
            return false;
        }
        cursor += AttributedQuoteOptionalField.BYTE_LENGTH;
        if (!timeInForceOptional.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceOptionalField.BYTE_LENGTH;
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
        if (!ordTypeOptional.parse(data, cursor)) {
            return false;
        }
        cursor += OrdTypeOptionalField.BYTE_LENGTH;
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
        if (!sideOptional.parse(data, cursor)) {
            return false;
        }
        cursor += SideOptionalField.BYTE_LENGTH;
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
        cursor = origClOrdId.encode(data, cursor);
        cursor = customerOrFirmOptional.encode(data, cursor);
        cursor = openCloseOptional.encode(data, cursor);
        cursor = attributedQuoteOptional.encode(data, cursor);
        cursor = timeInForceOptional.encode(data, cursor);
        cursor = cancelInsteadOfSlideOptional.encode(data, cursor);
        cursor = displayInst.encode(data, cursor);
        cursor = execInst.encode(data, cursor);
        cursor = ordTypeOptional.encode(data, cursor);
        cursor = targetPartyId.encode(data, cursor);
        cursor = auctionId.encode(data, cursor);
        cursor = clearingFirm.encode(data, cursor);
        cursor = optionalData.encode(data, cursor);
        cursor = routingFirmId.encode(data, cursor);
        cursor = aiq.encode(data, cursor);
        cursor = sideOptional.encode(data, cursor);
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
            case "OrigClOrdId" -> Optional.of(origClOrdId);
            case "CustomerOrFirmOptional" -> Optional.of(customerOrFirmOptional);
            case "OpenCloseOptional" -> Optional.of(openCloseOptional);
            case "AttributedQuoteOptional" -> Optional.of(attributedQuoteOptional);
            case "TimeInForceOptional" -> Optional.of(timeInForceOptional);
            case "CancelInsteadOfSlideOptional" -> Optional.of(cancelInsteadOfSlideOptional);
            case "DisplayInst" -> Optional.of(displayInst);
            case "ExecInst" -> Optional.of(execInst);
            case "OrdTypeOptional" -> Optional.of(ordTypeOptional);
            case "TargetPartyId" -> Optional.of(targetPartyId);
            case "AuctionId" -> Optional.of(auctionId);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "OptionalData" -> Optional.of(optionalData);
            case "RoutingFirmId" -> Optional.of(routingFirmId);
            case "Aiq" -> Optional.of(aiq);
            case "SideOptional" -> Optional.of(sideOptional);
            case "PricePrice8Optional" -> Optional.of(pricePrice8Optional);
            case "OrderQtyQuantityNonZero" -> Optional.of(orderQtyQuantityNonZero);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderCancelReplaceRequestMessage message)) {
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
        if (!(other instanceof OrderCancelReplaceRequestMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
