package omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.AccountAccountField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.AckTypeField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.AiqField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.AttributedQuoteField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.AuctionIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.CancelInsteadOfSlideField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.ClOrdIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.ClearingAccountField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.ClearingFirmField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.CustomerOrFirmField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.DisplayInstField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.DisplayPriceField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.EffectiveLimitPriceField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.ExecInstField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.InstrumentIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.LeavesQtyField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.MarketParticipantIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.OpenCloseField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.OptionalDataField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.OrdTypeField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.OrderIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.OrderQtyQuantityNonZeroField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.OrigClOrdIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.PricePriceField2;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.ReasonCodeField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.RoutingFirmIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.SideField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.TargetPartyIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.ThrottleIndicatorField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.TimeInForceField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.TransactTimeField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.types.Field;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.types.Message;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.types.PrintOptions;

/**
 * Represents the OrderAckMessage message from the BinaryOrderEntry protocol.
 *
 * <p>OrderAckMessage</p>
 */
public final class OrderAckMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 139;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Ack Message";

    /**
     * account
     */
    private final AccountAccountField accountAccount = new AccountAccountField();

    /**
     * transactTime
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * instrumentId
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * marketParticipantId
     */
    private final MarketParticipantIdField marketParticipantId = new MarketParticipantIdField();

    /**
     * clOrdId
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * clearingAccount
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * origClOrdId
     */
    private final OrigClOrdIdField origClOrdId = new OrigClOrdIdField();

    /**
     * orderId
     */
    private final OrderIdField orderId = new OrderIdField();

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
    private final AttributedQuoteField attributedQuote = new AttributedQuoteField();

    /**
     * timeInForce
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * cancelInsteadOfSlide
     */
    private final CancelInsteadOfSlideField cancelInsteadOfSlide = new CancelInsteadOfSlideField();

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
    private final PricePriceField2 pricePrice = new PricePriceField2();

    /**
     * orderQty
     */
    private final OrderQtyQuantityNonZeroField orderQtyQuantityNonZero = new OrderQtyQuantityNonZeroField();

    /**
     * leavesQty
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * effectiveLimitPrice
     */
    private final EffectiveLimitPriceField effectiveLimitPrice = new EffectiveLimitPriceField();

    /**
     * displayPrice
     */
    private final DisplayPriceField displayPrice = new DisplayPriceField();

    /**
     * reasonCode
     */
    private final ReasonCodeField reasonCode = new ReasonCodeField();

    /**
     * ackType
     */
    private final AckTypeField ackType = new AckTypeField();

    /**
     * throttleIndicator
     */
    private final ThrottleIndicatorField throttleIndicator = new ThrottleIndicatorField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(accountAccount, transactTime, instrumentId, marketParticipantId, clOrdId, clearingAccount, origClOrdId, orderId, customerOrFirm, openClose, attributedQuote, timeInForce, cancelInsteadOfSlide, displayInst, execInst, ordType, targetPartyId, auctionId, clearingFirm, optionalData, routingFirmId, aiq, side, pricePrice, orderQtyQuantityNonZero, leavesQty, effectiveLimitPrice, displayPrice, reasonCode, ackType, throttleIndicator);

    private byte[] buffer;

    private boolean decoded;

    /**
     * account
     *
     * @return the AccountAccount field
     */
    public AccountAccountField accountAccount() {
        return accountAccount;
    }

    /**
     * transactTime
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
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
     * @return the MarketParticipantId field
     */
    public MarketParticipantIdField marketParticipantId() {
        return marketParticipantId;
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
     * @return the ClearingAccount field
     */
    public ClearingAccountField clearingAccount() {
        return clearingAccount;
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
     * orderId
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
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
     * @return the AttributedQuote field
     */
    public AttributedQuoteField attributedQuote() {
        return attributedQuote;
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
     * @return the CancelInsteadOfSlide field
     */
    public CancelInsteadOfSlideField cancelInsteadOfSlide() {
        return cancelInsteadOfSlide;
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
     * @return the PricePrice field
     */
    public PricePriceField2 pricePrice() {
        return pricePrice;
    }

    /**
     * orderQty
     *
     * @return the OrderQtyQuantityNonZero field
     */
    public OrderQtyQuantityNonZeroField orderQtyQuantityNonZero() {
        return orderQtyQuantityNonZero;
    }

    /**
     * leavesQty
     *
     * @return the LeavesQty field
     */
    public LeavesQtyField leavesQty() {
        return leavesQty;
    }

    /**
     * effectiveLimitPrice
     *
     * @return the EffectiveLimitPrice field
     */
    public EffectiveLimitPriceField effectiveLimitPrice() {
        return effectiveLimitPrice;
    }

    /**
     * displayPrice
     *
     * @return the DisplayPrice field
     */
    public DisplayPriceField displayPrice() {
        return displayPrice;
    }

    /**
     * reasonCode
     *
     * @return the ReasonCode field
     */
    public ReasonCodeField reasonCode() {
        return reasonCode;
    }

    /**
     * ackType
     *
     * @return the AckType field
     */
    public AckTypeField ackType() {
        return ackType;
    }

    /**
     * throttleIndicator
     *
     * @return the ThrottleIndicator field
     */
    public ThrottleIndicatorField throttleIndicator() {
        return throttleIndicator;
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
        if (!accountAccount.parse(data, cursor)) {
            return false;
        }
        cursor += AccountAccountField.BYTE_LENGTH;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!marketParticipantId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketParticipantIdField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!clearingAccount.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingAccountField.BYTE_LENGTH;
        if (!origClOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += OrigClOrdIdField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!customerOrFirm.parse(data, cursor)) {
            return false;
        }
        cursor += CustomerOrFirmField.BYTE_LENGTH;
        if (!openClose.parse(data, cursor)) {
            return false;
        }
        cursor += OpenCloseField.BYTE_LENGTH;
        if (!attributedQuote.parse(data, cursor)) {
            return false;
        }
        cursor += AttributedQuoteField.BYTE_LENGTH;
        if (!timeInForce.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceField.BYTE_LENGTH;
        if (!cancelInsteadOfSlide.parse(data, cursor)) {
            return false;
        }
        cursor += CancelInsteadOfSlideField.BYTE_LENGTH;
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
        if (!pricePrice.parse(data, cursor)) {
            return false;
        }
        cursor += PricePriceField2.BYTE_LENGTH;
        if (!orderQtyQuantityNonZero.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyQuantityNonZeroField.BYTE_LENGTH;
        if (!leavesQty.parse(data, cursor)) {
            return false;
        }
        cursor += LeavesQtyField.BYTE_LENGTH;
        if (!effectiveLimitPrice.parse(data, cursor)) {
            return false;
        }
        cursor += EffectiveLimitPriceField.BYTE_LENGTH;
        if (!displayPrice.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayPriceField.BYTE_LENGTH;
        if (!reasonCode.parse(data, cursor)) {
            return false;
        }
        cursor += ReasonCodeField.BYTE_LENGTH;
        if (!ackType.parse(data, cursor)) {
            return false;
        }
        cursor += AckTypeField.BYTE_LENGTH;
        return throttleIndicator.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = accountAccount.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = marketParticipantId.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = clearingAccount.encode(data, cursor);
        cursor = origClOrdId.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = customerOrFirm.encode(data, cursor);
        cursor = openClose.encode(data, cursor);
        cursor = attributedQuote.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = cancelInsteadOfSlide.encode(data, cursor);
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
        cursor = pricePrice.encode(data, cursor);
        cursor = orderQtyQuantityNonZero.encode(data, cursor);
        cursor = leavesQty.encode(data, cursor);
        cursor = effectiveLimitPrice.encode(data, cursor);
        cursor = displayPrice.encode(data, cursor);
        cursor = reasonCode.encode(data, cursor);
        cursor = ackType.encode(data, cursor);
        cursor = throttleIndicator.encode(data, cursor);
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
            case "AccountAccount" -> Optional.of(accountAccount);
            case "TransactTime" -> Optional.of(transactTime);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "MarketParticipantId" -> Optional.of(marketParticipantId);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "OrigClOrdId" -> Optional.of(origClOrdId);
            case "OrderId" -> Optional.of(orderId);
            case "CustomerOrFirm" -> Optional.of(customerOrFirm);
            case "OpenClose" -> Optional.of(openClose);
            case "AttributedQuote" -> Optional.of(attributedQuote);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "CancelInsteadOfSlide" -> Optional.of(cancelInsteadOfSlide);
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
            case "PricePrice" -> Optional.of(pricePrice);
            case "OrderQtyQuantityNonZero" -> Optional.of(orderQtyQuantityNonZero);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "EffectiveLimitPrice" -> Optional.of(effectiveLimitPrice);
            case "DisplayPrice" -> Optional.of(displayPrice);
            case "ReasonCode" -> Optional.of(reasonCode);
            case "AckType" -> Optional.of(ackType);
            case "ThrottleIndicator" -> Optional.of(throttleIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderAckMessage message)) {
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
        if (!(other instanceof OrderAckMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
