package omi.eurex.t7.eti.fbe.v8_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v8_0.fields.AccountField;
import omi.eurex.t7.eti.fbe.v8_0.fields.ComplianceTextField;
import omi.eurex.t7.eti.fbe.v8_0.fields.CustOrderHandlingInstField;
import omi.eurex.t7.eti.fbe.v8_0.fields.FirmNegotiationIdField;
import omi.eurex.t7.eti.fbe.v8_0.fields.FirmTradeIdField;
import omi.eurex.t7.eti.fbe.v8_0.fields.FreeText1Field;
import omi.eurex.t7.eti.fbe.v8_0.fields.FreeText2Field;
import omi.eurex.t7.eti.fbe.v8_0.fields.FreeText3Field;
import omi.eurex.t7.eti.fbe.v8_0.fields.FreeText5Field;
import omi.eurex.t7.eti.fbe.v8_0.fields.LastPxField;
import omi.eurex.t7.eti.fbe.v8_0.fields.LastQtyField;
import omi.eurex.t7.eti.fbe.v8_0.fields.MessageEventSourceField;
import omi.eurex.t7.eti.fbe.v8_0.fields.NegotiationIdField;
import omi.eurex.t7.eti.fbe.v8_0.fields.PartyIdBeneficiaryField;
import omi.eurex.t7.eti.fbe.v8_0.fields.PartyIdLocationIdField;
import omi.eurex.t7.eti.fbe.v8_0.fields.PartyIdOrderOriginationFirmField;
import omi.eurex.t7.eti.fbe.v8_0.fields.PartyIdPositionAccountField;
import omi.eurex.t7.eti.fbe.v8_0.fields.PartyIdTakeUpTradingFirmField;
import omi.eurex.t7.eti.fbe.v8_0.fields.PositionEffectField;
import omi.eurex.t7.eti.fbe.v8_0.fields.RequestingPartySubIdTypeField;
import omi.eurex.t7.eti.fbe.v8_0.fields.RootPartyEnteringTraderField;
import omi.eurex.t7.eti.fbe.v8_0.fields.RootPartyExecutingFirmField;
import omi.eurex.t7.eti.fbe.v8_0.fields.RootPartyExecutingTraderField;
import omi.eurex.t7.eti.fbe.v8_0.fields.TargetPartyEnteringTraderField;
import omi.eurex.t7.eti.fbe.v8_0.fields.TargetPartyExecutingFirmField;
import omi.eurex.t7.eti.fbe.v8_0.fields.TargetPartyExecutingTraderField;
import omi.eurex.t7.eti.fbe.v8_0.fields.TradeIdField;
import omi.eurex.t7.eti.fbe.v8_0.fields.TradeRequestResultField;
import omi.eurex.t7.eti.fbe.v8_0.fields.TradingCapacityField;
import omi.eurex.t7.eti.fbe.v8_0.fields.TransactTimeField;
import omi.eurex.t7.eti.fbe.v8_0.fields.TrdRptStatusField;
import omi.eurex.t7.eti.fbe.v8_0.fields.UnderlyingPriceStipValueField;
import omi.eurex.t7.eti.fbe.v8_0.fields.UnderlyingPxField;
import omi.eurex.t7.eti.fbe.v8_0.structs.RbcHeaderComp;
import omi.eurex.t7.eti.fbe.v8_0.types.Field;
import omi.eurex.t7.eti.fbe.v8_0.types.Message;
import omi.eurex.t7.eti.fbe.v8_0.types.PrintOptions;

/**
 * Represents the SrqsDealNotification message from the Eti protocol.
 */
public final class SrqsDealNotification implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 410;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Srqs Deal Notification";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 0, 2, 27, 7, 409, 1 };

    /**
     * Transact Time
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Underlying Price Stip Value
     */
    private final UnderlyingPriceStipValueField underlyingPriceStipValue = new UnderlyingPriceStipValueField();

    /**
     * Underlying Px
     */
    private final UnderlyingPxField underlyingPx = new UnderlyingPxField();

    /**
     * Last Px
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * Last Qty
     */
    private final LastQtyField lastQty = new LastQtyField();

    /**
     * Negotiation Id
     */
    private final NegotiationIdField negotiationId = new NegotiationIdField();

    /**
     * Trade Id
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * Requesting Party Sub Id Type
     */
    private final RequestingPartySubIdTypeField requestingPartySubIdType = new RequestingPartySubIdTypeField();

    /**
     * Trd Rpt Status
     */
    private final TrdRptStatusField trdRptStatus = new TrdRptStatusField();

    /**
     * Trade Request Result
     */
    private final TradeRequestResultField tradeRequestResult = new TradeRequestResultField();

    /**
     * Message Event Source
     */
    private final MessageEventSourceField messageEventSource = new MessageEventSourceField();

    /**
     * Trading Capacity
     */
    private final TradingCapacityField tradingCapacity = new TradingCapacityField();

    /**
     * Root Party Executing Firm
     */
    private final RootPartyExecutingFirmField rootPartyExecutingFirm = new RootPartyExecutingFirmField();

    /**
     * Root Party Executing Trader
     */
    private final RootPartyExecutingTraderField rootPartyExecutingTrader = new RootPartyExecutingTraderField();

    /**
     * Root Party Entering Trader
     */
    private final RootPartyEnteringTraderField rootPartyEnteringTrader = new RootPartyEnteringTraderField();

    /**
     * Target Party Executing Firm
     */
    private final TargetPartyExecutingFirmField targetPartyExecutingFirm = new TargetPartyExecutingFirmField();

    /**
     * Target Party Executing Trader
     */
    private final TargetPartyExecutingTraderField targetPartyExecutingTrader = new TargetPartyExecutingTraderField();

    /**
     * Target Party Entering Trader
     */
    private final TargetPartyEnteringTraderField targetPartyEnteringTrader = new TargetPartyEnteringTraderField();

    /**
     * Firm Trade Id
     */
    private final FirmTradeIdField firmTradeId = new FirmTradeIdField();

    /**
     * Firm Negotiation Id
     */
    private final FirmNegotiationIdField firmNegotiationId = new FirmNegotiationIdField();

    /**
     * Free Text 1
     */
    private final FreeText1Field freeText1 = new FreeText1Field();

    /**
     * Free Text 2
     */
    private final FreeText2Field freeText2 = new FreeText2Field();

    /**
     * Free Text 3
     */
    private final FreeText3Field freeText3 = new FreeText3Field();

    /**
     * Free Text 5
     */
    private final FreeText5Field freeText5 = new FreeText5Field();

    /**
     * Position Effect
     */
    private final PositionEffectField positionEffect = new PositionEffectField();

    /**
     * Account
     */
    private final AccountField account = new AccountField();

    /**
     * Party Id Beneficiary
     */
    private final PartyIdBeneficiaryField partyIdBeneficiary = new PartyIdBeneficiaryField();

    /**
     * Cust Order Handling Inst
     */
    private final CustOrderHandlingInstField custOrderHandlingInst = new CustOrderHandlingInstField();

    /**
     * Party Id Order Origination Firm
     */
    private final PartyIdOrderOriginationFirmField partyIdOrderOriginationFirm = new PartyIdOrderOriginationFirmField();

    /**
     * Party Id Position Account
     */
    private final PartyIdPositionAccountField partyIdPositionAccount = new PartyIdPositionAccountField();

    /**
     * Party Id Location Id
     */
    private final PartyIdLocationIdField partyIdLocationId = new PartyIdLocationIdField();

    /**
     * Compliance Text
     */
    private final ComplianceTextField complianceText = new ComplianceTextField();

    /**
     * Party Id Take Up Trading Firm
     */
    private final PartyIdTakeUpTradingFirmField partyIdTakeUpTradingFirm = new PartyIdTakeUpTradingFirmField();

    /**
     * Rbc Header Comp
     */
    private final RbcHeaderComp rbcHeaderComp = new RbcHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(rbcHeaderComp.fields(), List.<Field>of(transactTime), List.<Field>of(underlyingPriceStipValue), List.<Field>of(underlyingPx), List.<Field>of(lastPx), List.<Field>of(lastQty), List.<Field>of(negotiationId), List.<Field>of(tradeId), List.<Field>of(requestingPartySubIdType), List.<Field>of(trdRptStatus), List.<Field>of(tradeRequestResult), List.<Field>of(messageEventSource), List.<Field>of(tradingCapacity), List.<Field>of(rootPartyExecutingFirm), List.<Field>of(rootPartyExecutingTrader), List.<Field>of(rootPartyEnteringTrader), List.<Field>of(targetPartyExecutingFirm), List.<Field>of(targetPartyExecutingTrader), List.<Field>of(targetPartyEnteringTrader), List.<Field>of(firmTradeId), List.<Field>of(firmNegotiationId), List.<Field>of(freeText1), List.<Field>of(freeText2), List.<Field>of(freeText3), List.<Field>of(freeText5), List.<Field>of(positionEffect), List.<Field>of(account), List.<Field>of(partyIdBeneficiary), List.<Field>of(custOrderHandlingInst), List.<Field>of(partyIdOrderOriginationFirm), List.<Field>of(partyIdPositionAccount), List.<Field>of(partyIdLocationId), List.<Field>of(complianceText), List.<Field>of(partyIdTakeUpTradingFirm)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Transact Time
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * Underlying Price Stip Value
     *
     * @return the UnderlyingPriceStipValue field
     */
    public UnderlyingPriceStipValueField underlyingPriceStipValue() {
        return underlyingPriceStipValue;
    }

    /**
     * Underlying Px
     *
     * @return the UnderlyingPx field
     */
    public UnderlyingPxField underlyingPx() {
        return underlyingPx;
    }

    /**
     * Last Px
     *
     * @return the LastPx field
     */
    public LastPxField lastPx() {
        return lastPx;
    }

    /**
     * Last Qty
     *
     * @return the LastQty field
     */
    public LastQtyField lastQty() {
        return lastQty;
    }

    /**
     * Negotiation Id
     *
     * @return the NegotiationId field
     */
    public NegotiationIdField negotiationId() {
        return negotiationId;
    }

    /**
     * Trade Id
     *
     * @return the TradeId field
     */
    public TradeIdField tradeId() {
        return tradeId;
    }

    /**
     * Requesting Party Sub Id Type
     *
     * @return the RequestingPartySubIdType field
     */
    public RequestingPartySubIdTypeField requestingPartySubIdType() {
        return requestingPartySubIdType;
    }

    /**
     * Trd Rpt Status
     *
     * @return the TrdRptStatus field
     */
    public TrdRptStatusField trdRptStatus() {
        return trdRptStatus;
    }

    /**
     * Trade Request Result
     *
     * @return the TradeRequestResult field
     */
    public TradeRequestResultField tradeRequestResult() {
        return tradeRequestResult;
    }

    /**
     * Message Event Source
     *
     * @return the MessageEventSource field
     */
    public MessageEventSourceField messageEventSource() {
        return messageEventSource;
    }

    /**
     * Trading Capacity
     *
     * @return the TradingCapacity field
     */
    public TradingCapacityField tradingCapacity() {
        return tradingCapacity;
    }

    /**
     * Root Party Executing Firm
     *
     * @return the RootPartyExecutingFirm field
     */
    public RootPartyExecutingFirmField rootPartyExecutingFirm() {
        return rootPartyExecutingFirm;
    }

    /**
     * Root Party Executing Trader
     *
     * @return the RootPartyExecutingTrader field
     */
    public RootPartyExecutingTraderField rootPartyExecutingTrader() {
        return rootPartyExecutingTrader;
    }

    /**
     * Root Party Entering Trader
     *
     * @return the RootPartyEnteringTrader field
     */
    public RootPartyEnteringTraderField rootPartyEnteringTrader() {
        return rootPartyEnteringTrader;
    }

    /**
     * Target Party Executing Firm
     *
     * @return the TargetPartyExecutingFirm field
     */
    public TargetPartyExecutingFirmField targetPartyExecutingFirm() {
        return targetPartyExecutingFirm;
    }

    /**
     * Target Party Executing Trader
     *
     * @return the TargetPartyExecutingTrader field
     */
    public TargetPartyExecutingTraderField targetPartyExecutingTrader() {
        return targetPartyExecutingTrader;
    }

    /**
     * Target Party Entering Trader
     *
     * @return the TargetPartyEnteringTrader field
     */
    public TargetPartyEnteringTraderField targetPartyEnteringTrader() {
        return targetPartyEnteringTrader;
    }

    /**
     * Firm Trade Id
     *
     * @return the FirmTradeId field
     */
    public FirmTradeIdField firmTradeId() {
        return firmTradeId;
    }

    /**
     * Firm Negotiation Id
     *
     * @return the FirmNegotiationId field
     */
    public FirmNegotiationIdField firmNegotiationId() {
        return firmNegotiationId;
    }

    /**
     * Free Text 1
     *
     * @return the FreeText1 field
     */
    public FreeText1Field freeText1() {
        return freeText1;
    }

    /**
     * Free Text 2
     *
     * @return the FreeText2 field
     */
    public FreeText2Field freeText2() {
        return freeText2;
    }

    /**
     * Free Text 3
     *
     * @return the FreeText3 field
     */
    public FreeText3Field freeText3() {
        return freeText3;
    }

    /**
     * Free Text 5
     *
     * @return the FreeText5 field
     */
    public FreeText5Field freeText5() {
        return freeText5;
    }

    /**
     * Position Effect
     *
     * @return the PositionEffect field
     */
    public PositionEffectField positionEffect() {
        return positionEffect;
    }

    /**
     * Account
     *
     * @return the Account field
     */
    public AccountField account() {
        return account;
    }

    /**
     * Party Id Beneficiary
     *
     * @return the PartyIdBeneficiary field
     */
    public PartyIdBeneficiaryField partyIdBeneficiary() {
        return partyIdBeneficiary;
    }

    /**
     * Cust Order Handling Inst
     *
     * @return the CustOrderHandlingInst field
     */
    public CustOrderHandlingInstField custOrderHandlingInst() {
        return custOrderHandlingInst;
    }

    /**
     * Party Id Order Origination Firm
     *
     * @return the PartyIdOrderOriginationFirm field
     */
    public PartyIdOrderOriginationFirmField partyIdOrderOriginationFirm() {
        return partyIdOrderOriginationFirm;
    }

    /**
     * Party Id Position Account
     *
     * @return the PartyIdPositionAccount field
     */
    public PartyIdPositionAccountField partyIdPositionAccount() {
        return partyIdPositionAccount;
    }

    /**
     * Party Id Location Id
     *
     * @return the PartyIdLocationId field
     */
    public PartyIdLocationIdField partyIdLocationId() {
        return partyIdLocationId;
    }

    /**
     * Compliance Text
     *
     * @return the ComplianceText field
     */
    public ComplianceTextField complianceText() {
        return complianceText;
    }

    /**
     * Party Id Take Up Trading Firm
     *
     * @return the PartyIdTakeUpTradingFirm field
     */
    public PartyIdTakeUpTradingFirmField partyIdTakeUpTradingFirm() {
        return partyIdTakeUpTradingFirm;
    }

    /**
     * Rbc Header Comp
     *
     * @return the RbcHeaderComp record
     */
    public RbcHeaderComp rbcHeaderComp() {
        return rbcHeaderComp;
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
        return Optional.ofNullable(rbcHeaderComp.sendingTime().value());
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
        cursor += 2; // padding
        if (!rbcHeaderComp.parseFrom(data, cursor, end - 376)) {
            return false;
        }
        cursor += rbcHeaderComp.byteLength();
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!underlyingPriceStipValue.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingPriceStipValueField.BYTE_LENGTH;
        if (!underlyingPx.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingPxField.BYTE_LENGTH;
        if (!lastPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxField.BYTE_LENGTH;
        if (!lastQty.parse(data, cursor)) {
            return false;
        }
        cursor += LastQtyField.BYTE_LENGTH;
        if (!negotiationId.parse(data, cursor)) {
            return false;
        }
        cursor += NegotiationIdField.BYTE_LENGTH;
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!requestingPartySubIdType.parse(data, cursor)) {
            return false;
        }
        cursor += RequestingPartySubIdTypeField.BYTE_LENGTH;
        if (!trdRptStatus.parse(data, cursor)) {
            return false;
        }
        cursor += TrdRptStatusField.BYTE_LENGTH;
        if (!tradeRequestResult.parse(data, cursor)) {
            return false;
        }
        cursor += TradeRequestResultField.BYTE_LENGTH;
        if (!messageEventSource.parse(data, cursor)) {
            return false;
        }
        cursor += MessageEventSourceField.BYTE_LENGTH;
        if (!tradingCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += TradingCapacityField.BYTE_LENGTH;
        if (!rootPartyExecutingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyExecutingFirmField.BYTE_LENGTH;
        if (!rootPartyExecutingTrader.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyExecutingTraderField.BYTE_LENGTH;
        if (!rootPartyEnteringTrader.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyEnteringTraderField.BYTE_LENGTH;
        if (!targetPartyExecutingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += TargetPartyExecutingFirmField.BYTE_LENGTH;
        if (!targetPartyExecutingTrader.parse(data, cursor)) {
            return false;
        }
        cursor += TargetPartyExecutingTraderField.BYTE_LENGTH;
        if (!targetPartyEnteringTrader.parse(data, cursor)) {
            return false;
        }
        cursor += TargetPartyEnteringTraderField.BYTE_LENGTH;
        if (!firmTradeId.parse(data, cursor)) {
            return false;
        }
        cursor += FirmTradeIdField.BYTE_LENGTH;
        if (!firmNegotiationId.parse(data, cursor)) {
            return false;
        }
        cursor += FirmNegotiationIdField.BYTE_LENGTH;
        if (!freeText1.parse(data, cursor)) {
            return false;
        }
        cursor += FreeText1Field.BYTE_LENGTH;
        if (!freeText2.parse(data, cursor)) {
            return false;
        }
        cursor += FreeText2Field.BYTE_LENGTH;
        if (!freeText3.parse(data, cursor)) {
            return false;
        }
        cursor += FreeText3Field.BYTE_LENGTH;
        if (!freeText5.parse(data, cursor)) {
            return false;
        }
        cursor += FreeText5Field.BYTE_LENGTH;
        if (!positionEffect.parse(data, cursor)) {
            return false;
        }
        cursor += PositionEffectField.BYTE_LENGTH;
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
        if (!partyIdBeneficiary.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdBeneficiaryField.BYTE_LENGTH;
        if (!custOrderHandlingInst.parse(data, cursor)) {
            return false;
        }
        cursor += CustOrderHandlingInstField.BYTE_LENGTH;
        if (!partyIdOrderOriginationFirm.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdOrderOriginationFirmField.BYTE_LENGTH;
        if (!partyIdPositionAccount.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdPositionAccountField.BYTE_LENGTH;
        if (!partyIdLocationId.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdLocationIdField.BYTE_LENGTH;
        if (!complianceText.parse(data, cursor)) {
            return false;
        }
        cursor += ComplianceTextField.BYTE_LENGTH;
        if (!partyIdTakeUpTradingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdTakeUpTradingFirmField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        if (buffer != null && buffer.length >= 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = rbcHeaderComp.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = underlyingPriceStipValue.encode(data, cursor);
        cursor = underlyingPx.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = lastQty.encode(data, cursor);
        cursor = negotiationId.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = requestingPartySubIdType.encode(data, cursor);
        cursor = trdRptStatus.encode(data, cursor);
        cursor = tradeRequestResult.encode(data, cursor);
        cursor = messageEventSource.encode(data, cursor);
        cursor = tradingCapacity.encode(data, cursor);
        cursor = rootPartyExecutingFirm.encode(data, cursor);
        cursor = rootPartyExecutingTrader.encode(data, cursor);
        cursor = rootPartyEnteringTrader.encode(data, cursor);
        cursor = targetPartyExecutingFirm.encode(data, cursor);
        cursor = targetPartyExecutingTrader.encode(data, cursor);
        cursor = targetPartyEnteringTrader.encode(data, cursor);
        cursor = firmTradeId.encode(data, cursor);
        cursor = firmNegotiationId.encode(data, cursor);
        cursor = freeText1.encode(data, cursor);
        cursor = freeText2.encode(data, cursor);
        cursor = freeText3.encode(data, cursor);
        cursor = freeText5.encode(data, cursor);
        cursor = positionEffect.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = partyIdBeneficiary.encode(data, cursor);
        cursor = custOrderHandlingInst.encode(data, cursor);
        cursor = partyIdOrderOriginationFirm.encode(data, cursor);
        cursor = partyIdPositionAccount.encode(data, cursor);
        cursor = partyIdLocationId.encode(data, cursor);
        cursor = complianceText.encode(data, cursor);
        cursor = partyIdTakeUpTradingFirm.encode(data, cursor);
        if (buffer != null && buffer.length >= 410) {
            System.arraycopy(buffer, 409, data, cursor, 1); // padding
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
        rbcHeaderComp.clear();
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
            case "TransactTime" -> Optional.of(transactTime);
            case "UnderlyingPriceStipValue" -> Optional.of(underlyingPriceStipValue);
            case "UnderlyingPx" -> Optional.of(underlyingPx);
            case "LastPx" -> Optional.of(lastPx);
            case "LastQty" -> Optional.of(lastQty);
            case "NegotiationId" -> Optional.of(negotiationId);
            case "TradeId" -> Optional.of(tradeId);
            case "RequestingPartySubIdType" -> Optional.of(requestingPartySubIdType);
            case "TrdRptStatus" -> Optional.of(trdRptStatus);
            case "TradeRequestResult" -> Optional.of(tradeRequestResult);
            case "MessageEventSource" -> Optional.of(messageEventSource);
            case "TradingCapacity" -> Optional.of(tradingCapacity);
            case "RootPartyExecutingFirm" -> Optional.of(rootPartyExecutingFirm);
            case "RootPartyExecutingTrader" -> Optional.of(rootPartyExecutingTrader);
            case "RootPartyEnteringTrader" -> Optional.of(rootPartyEnteringTrader);
            case "TargetPartyExecutingFirm" -> Optional.of(targetPartyExecutingFirm);
            case "TargetPartyExecutingTrader" -> Optional.of(targetPartyExecutingTrader);
            case "TargetPartyEnteringTrader" -> Optional.of(targetPartyEnteringTrader);
            case "FirmTradeId" -> Optional.of(firmTradeId);
            case "FirmNegotiationId" -> Optional.of(firmNegotiationId);
            case "FreeText1" -> Optional.of(freeText1);
            case "FreeText2" -> Optional.of(freeText2);
            case "FreeText3" -> Optional.of(freeText3);
            case "FreeText5" -> Optional.of(freeText5);
            case "PositionEffect" -> Optional.of(positionEffect);
            case "Account" -> Optional.of(account);
            case "PartyIdBeneficiary" -> Optional.of(partyIdBeneficiary);
            case "CustOrderHandlingInst" -> Optional.of(custOrderHandlingInst);
            case "PartyIdOrderOriginationFirm" -> Optional.of(partyIdOrderOriginationFirm);
            case "PartyIdPositionAccount" -> Optional.of(partyIdPositionAccount);
            case "PartyIdLocationId" -> Optional.of(partyIdLocationId);
            case "ComplianceText" -> Optional.of(complianceText);
            case "PartyIdTakeUpTradingFirm" -> Optional.of(partyIdTakeUpTradingFirm);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SrqsDealNotification message)) {
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
        if (!(other instanceof SrqsDealNotification message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
