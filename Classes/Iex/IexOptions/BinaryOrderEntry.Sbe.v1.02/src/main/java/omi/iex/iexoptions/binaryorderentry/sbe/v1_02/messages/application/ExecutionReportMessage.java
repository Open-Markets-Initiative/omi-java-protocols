package omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.AccountAccountField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.AiqField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.AuctionIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.ClOrdIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.ClearingAccountField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.ClearingFirmField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.ContraClearingAccountField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.ContraClearingFirmField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.ContraCustomerOrFirmField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.ContraMpidField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.ContraOccIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.ContraOpenCloseField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.CumQtyField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.CustomerOrFirmField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.ExecIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.FeeCodeField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.InstrumentIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.LastPxField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.LastQtyField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.LeavesQtyField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.MarketParticipantIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.OccIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.OpenCloseField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.OptionalDataField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.OrderIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.ReasonCodeField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.RoutingFirmIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.SideField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.TargetPartyIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.TradeIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.TradeLiquidityIndicatorField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.TransactTimeField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.types.Field;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.types.Message;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.types.PrintOptions;

/**
 * Represents the ExecutionReportMessage message from the BinaryOrderEntry protocol.
 *
 * <p>ExecutionReportMessage</p>
 */
public final class ExecutionReportMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 154;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Execution Report Message";

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
     * customerOrFirm
     */
    private final CustomerOrFirmField customerOrFirm = new CustomerOrFirmField();

    /**
     * orderId
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * execId
     */
    private final ExecIdField execId = new ExecIdField();

    /**
     * tradeId
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * lastPx
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * openClose
     */
    private final OpenCloseField openClose = new OpenCloseField();

    /**
     * side
     */
    private final SideField side = new SideField();

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
     * leavesQty
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * cumQty
     */
    private final CumQtyField cumQty = new CumQtyField();

    /**
     * lastQty
     */
    private final LastQtyField lastQty = new LastQtyField();

    /**
     * tradeLiquidityIndicator
     */
    private final TradeLiquidityIndicatorField tradeLiquidityIndicator = new TradeLiquidityIndicatorField();

    /**
     * feeCode
     */
    private final FeeCodeField feeCode = new FeeCodeField();

    /**
     * reasonCode
     */
    private final ReasonCodeField reasonCode = new ReasonCodeField();

    /**
     * occId
     */
    private final OccIdField occId = new OccIdField();

    /**
     * contraClearingAccount
     */
    private final ContraClearingAccountField contraClearingAccount = new ContraClearingAccountField();

    /**
     * contraClearingFirm
     */
    private final ContraClearingFirmField contraClearingFirm = new ContraClearingFirmField();

    /**
     * contraMpid
     */
    private final ContraMpidField contraMpid = new ContraMpidField();

    /**
     * contraOpenClose
     */
    private final ContraOpenCloseField contraOpenClose = new ContraOpenCloseField();

    /**
     * contraCustomerOrFirm
     */
    private final ContraCustomerOrFirmField contraCustomerOrFirm = new ContraCustomerOrFirmField();

    /**
     * contraOccId
     */
    private final ContraOccIdField contraOccId = new ContraOccIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(accountAccount, transactTime, instrumentId, marketParticipantId, clOrdId, clearingAccount, customerOrFirm, orderId, execId, tradeId, lastPx, openClose, side, targetPartyId, auctionId, clearingFirm, optionalData, routingFirmId, aiq, leavesQty, cumQty, lastQty, tradeLiquidityIndicator, feeCode, reasonCode, occId, contraClearingAccount, contraClearingFirm, contraMpid, contraOpenClose, contraCustomerOrFirm, contraOccId);

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
     * customerOrFirm
     *
     * @return the CustomerOrFirm field
     */
    public CustomerOrFirmField customerOrFirm() {
        return customerOrFirm;
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
     * execId
     *
     * @return the ExecId field
     */
    public ExecIdField execId() {
        return execId;
    }

    /**
     * tradeId
     *
     * @return the TradeId field
     */
    public TradeIdField tradeId() {
        return tradeId;
    }

    /**
     * lastPx
     *
     * @return the LastPx field
     */
    public LastPxField lastPx() {
        return lastPx;
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
     * side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
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
     * leavesQty
     *
     * @return the LeavesQty field
     */
    public LeavesQtyField leavesQty() {
        return leavesQty;
    }

    /**
     * cumQty
     *
     * @return the CumQty field
     */
    public CumQtyField cumQty() {
        return cumQty;
    }

    /**
     * lastQty
     *
     * @return the LastQty field
     */
    public LastQtyField lastQty() {
        return lastQty;
    }

    /**
     * tradeLiquidityIndicator
     *
     * @return the TradeLiquidityIndicator field
     */
    public TradeLiquidityIndicatorField tradeLiquidityIndicator() {
        return tradeLiquidityIndicator;
    }

    /**
     * feeCode
     *
     * @return the FeeCode field
     */
    public FeeCodeField feeCode() {
        return feeCode;
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
     * occId
     *
     * @return the OccId field
     */
    public OccIdField occId() {
        return occId;
    }

    /**
     * contraClearingAccount
     *
     * @return the ContraClearingAccount field
     */
    public ContraClearingAccountField contraClearingAccount() {
        return contraClearingAccount;
    }

    /**
     * contraClearingFirm
     *
     * @return the ContraClearingFirm field
     */
    public ContraClearingFirmField contraClearingFirm() {
        return contraClearingFirm;
    }

    /**
     * contraMpid
     *
     * @return the ContraMpid field
     */
    public ContraMpidField contraMpid() {
        return contraMpid;
    }

    /**
     * contraOpenClose
     *
     * @return the ContraOpenClose field
     */
    public ContraOpenCloseField contraOpenClose() {
        return contraOpenClose;
    }

    /**
     * contraCustomerOrFirm
     *
     * @return the ContraCustomerOrFirm field
     */
    public ContraCustomerOrFirmField contraCustomerOrFirm() {
        return contraCustomerOrFirm;
    }

    /**
     * contraOccId
     *
     * @return the ContraOccId field
     */
    public ContraOccIdField contraOccId() {
        return contraOccId;
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
        if (!customerOrFirm.parse(data, cursor)) {
            return false;
        }
        cursor += CustomerOrFirmField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!execId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecIdField.BYTE_LENGTH;
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!lastPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxField.BYTE_LENGTH;
        if (!openClose.parse(data, cursor)) {
            return false;
        }
        cursor += OpenCloseField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
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
        if (!leavesQty.parse(data, cursor)) {
            return false;
        }
        cursor += LeavesQtyField.BYTE_LENGTH;
        if (!cumQty.parse(data, cursor)) {
            return false;
        }
        cursor += CumQtyField.BYTE_LENGTH;
        if (!lastQty.parse(data, cursor)) {
            return false;
        }
        cursor += LastQtyField.BYTE_LENGTH;
        if (!tradeLiquidityIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += TradeLiquidityIndicatorField.BYTE_LENGTH;
        if (!feeCode.parse(data, cursor)) {
            return false;
        }
        cursor += FeeCodeField.BYTE_LENGTH;
        if (!reasonCode.parse(data, cursor)) {
            return false;
        }
        cursor += ReasonCodeField.BYTE_LENGTH;
        if (!occId.parse(data, cursor)) {
            return false;
        }
        cursor += OccIdField.BYTE_LENGTH;
        if (!contraClearingAccount.parse(data, cursor)) {
            return false;
        }
        cursor += ContraClearingAccountField.BYTE_LENGTH;
        if (!contraClearingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += ContraClearingFirmField.BYTE_LENGTH;
        if (!contraMpid.parse(data, cursor)) {
            return false;
        }
        cursor += ContraMpidField.BYTE_LENGTH;
        if (!contraOpenClose.parse(data, cursor)) {
            return false;
        }
        cursor += ContraOpenCloseField.BYTE_LENGTH;
        if (!contraCustomerOrFirm.parse(data, cursor)) {
            return false;
        }
        cursor += ContraCustomerOrFirmField.BYTE_LENGTH;
        return contraOccId.parse(data, cursor);
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
        cursor = customerOrFirm.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = execId.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = openClose.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = targetPartyId.encode(data, cursor);
        cursor = auctionId.encode(data, cursor);
        cursor = clearingFirm.encode(data, cursor);
        cursor = optionalData.encode(data, cursor);
        cursor = routingFirmId.encode(data, cursor);
        cursor = aiq.encode(data, cursor);
        cursor = leavesQty.encode(data, cursor);
        cursor = cumQty.encode(data, cursor);
        cursor = lastQty.encode(data, cursor);
        cursor = tradeLiquidityIndicator.encode(data, cursor);
        cursor = feeCode.encode(data, cursor);
        cursor = reasonCode.encode(data, cursor);
        cursor = occId.encode(data, cursor);
        cursor = contraClearingAccount.encode(data, cursor);
        cursor = contraClearingFirm.encode(data, cursor);
        cursor = contraMpid.encode(data, cursor);
        cursor = contraOpenClose.encode(data, cursor);
        cursor = contraCustomerOrFirm.encode(data, cursor);
        cursor = contraOccId.encode(data, cursor);
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
            case "CustomerOrFirm" -> Optional.of(customerOrFirm);
            case "OrderId" -> Optional.of(orderId);
            case "ExecId" -> Optional.of(execId);
            case "TradeId" -> Optional.of(tradeId);
            case "LastPx" -> Optional.of(lastPx);
            case "OpenClose" -> Optional.of(openClose);
            case "Side" -> Optional.of(side);
            case "TargetPartyId" -> Optional.of(targetPartyId);
            case "AuctionId" -> Optional.of(auctionId);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "OptionalData" -> Optional.of(optionalData);
            case "RoutingFirmId" -> Optional.of(routingFirmId);
            case "Aiq" -> Optional.of(aiq);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "CumQty" -> Optional.of(cumQty);
            case "LastQty" -> Optional.of(lastQty);
            case "TradeLiquidityIndicator" -> Optional.of(tradeLiquidityIndicator);
            case "FeeCode" -> Optional.of(feeCode);
            case "ReasonCode" -> Optional.of(reasonCode);
            case "OccId" -> Optional.of(occId);
            case "ContraClearingAccount" -> Optional.of(contraClearingAccount);
            case "ContraClearingFirm" -> Optional.of(contraClearingFirm);
            case "ContraMpid" -> Optional.of(contraMpid);
            case "ContraOpenClose" -> Optional.of(contraOpenClose);
            case "ContraCustomerOrFirm" -> Optional.of(contraCustomerOrFirm);
            case "ContraOccId" -> Optional.of(contraOccId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ExecutionReportMessage message)) {
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
        if (!(other instanceof ExecutionReportMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
