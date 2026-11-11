package omi.eurex.t7.eti.fbe.v10_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v10_0.fields.AccountField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ComplianceTextField;
import omi.eurex.t7.eti.fbe.v10_0.fields.CustOrderHandlingInstField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ExecutingTraderField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ExecutingTraderQualifierField;
import omi.eurex.t7.eti.fbe.v10_0.fields.FirmTradeIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.FreeText1Field;
import omi.eurex.t7.eti.fbe.v10_0.fields.FreeText2Field;
import omi.eurex.t7.eti.fbe.v10_0.fields.FreeText3Field;
import omi.eurex.t7.eti.fbe.v10_0.fields.FreeText5Field;
import omi.eurex.t7.eti.fbe.v10_0.fields.HedgingInstructionField;
import omi.eurex.t7.eti.fbe.v10_0.fields.MarketSegmentIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NegotiationIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NetworkMsgIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NoSrqsQuoteGrpsField;
import omi.eurex.t7.eti.fbe.v10_0.fields.OrderAttributeLiquidityProvisionField;
import omi.eurex.t7.eti.fbe.v10_0.fields.OrderOriginationField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PartyExecutingFirmField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PartyExecutingTraderField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PartyIdBeneficiaryField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PartyIdClientIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PartyIdInvestmentDecisionMakerField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PartyIdInvestmentDecisionMakerQualifierField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PartyIdLocationIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PartyIdOrderOriginationFirmField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PartyIdPositionAccountField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PartyIdTakeUpTradingFirmField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PositionEffectField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TradePublishIndicatorField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TradingCapacityField;
import omi.eurex.t7.eti.fbe.v10_0.fields.UnderlyingPriceStipValueField;
import omi.eurex.t7.eti.fbe.v10_0.fields.UnderlyingQtyField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ValidUntilTimeField;
import omi.eurex.t7.eti.fbe.v10_0.groups.SrqsHitQuoteGrpCompEntry;
import omi.eurex.t7.eti.fbe.v10_0.groups.SrqsHitQuoteGrpCompList;
import omi.eurex.t7.eti.fbe.v10_0.structs.RequestHeaderComp;
import omi.eurex.t7.eti.fbe.v10_0.types.Field;
import omi.eurex.t7.eti.fbe.v10_0.types.Message;
import omi.eurex.t7.eti.fbe.v10_0.types.PrintOptions;

/**
 * Represents the SrqsHitQuoteRequest message from the Eti protocol.
 */
public final class SrqsHitQuoteRequest implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 362;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Srqs Hit Quote Request";

    /**
     * Network Msg Id
     */
    private final NetworkMsgIdField networkMsgId = new NetworkMsgIdField();

    /**
     * Valid Until Time
     */
    private final ValidUntilTimeField validUntilTime = new ValidUntilTimeField();

    /**
     * Underlying Qty
     */
    private final UnderlyingQtyField underlyingQty = new UnderlyingQtyField();

    /**
     * Underlying Price Stip Value
     */
    private final UnderlyingPriceStipValueField underlyingPriceStipValue = new UnderlyingPriceStipValueField();

    /**
     * Party Id Client Id
     */
    private final PartyIdClientIdField partyIdClientId = new PartyIdClientIdField();

    /**
     * Party Id Investment Decision Maker
     */
    private final PartyIdInvestmentDecisionMakerField partyIdInvestmentDecisionMaker = new PartyIdInvestmentDecisionMakerField();

    /**
     * Executing Trader
     */
    private final ExecutingTraderField executingTrader = new ExecutingTraderField();

    /**
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Negotiation Id
     */
    private final NegotiationIdField negotiationId = new NegotiationIdField();

    /**
     * Order Attribute Liquidity Provision
     */
    private final OrderAttributeLiquidityProvisionField orderAttributeLiquidityProvision = new OrderAttributeLiquidityProvisionField();

    /**
     * Executing Trader Qualifier
     */
    private final ExecutingTraderQualifierField executingTraderQualifier = new ExecutingTraderQualifierField();

    /**
     * Party Id Investment Decision Maker Qualifier
     */
    private final PartyIdInvestmentDecisionMakerQualifierField partyIdInvestmentDecisionMakerQualifier = new PartyIdInvestmentDecisionMakerQualifierField();

    /**
     * Trading Capacity
     */
    private final TradingCapacityField tradingCapacity = new TradingCapacityField();

    /**
     * Trade Publish Indicator
     */
    private final TradePublishIndicatorField tradePublishIndicator = new TradePublishIndicatorField();

    /**
     * Order Origination
     */
    private final OrderOriginationField orderOrigination = new OrderOriginationField();

    /**
     * Hedging Instruction
     */
    private final HedgingInstructionField hedgingInstruction = new HedgingInstructionField();

    /**
     * No Srqs Quote Grps
     */
    private final NoSrqsQuoteGrpsField noSrqsQuoteGrps = new NoSrqsQuoteGrpsField();

    /**
     * Party Executing Firm
     */
    private final PartyExecutingFirmField partyExecutingFirm = new PartyExecutingFirmField();

    /**
     * Party Executing Trader
     */
    private final PartyExecutingTraderField partyExecutingTrader = new PartyExecutingTraderField();

    /**
     * Firm Trade Id
     */
    private final FirmTradeIdField firmTradeId = new FirmTradeIdField();

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
     * Srqs Hit Quote Grp Comp
     */
    private final SrqsHitQuoteGrpCompList srqsHitQuoteGrpComp = new SrqsHitQuoteGrpCompList();

    /**
     * Request Header Comp
     */
    private final RequestHeaderComp requestHeaderComp = new RequestHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(networkMsgId), requestHeaderComp.fields(), List.<Field>of(validUntilTime), List.<Field>of(underlyingQty), List.<Field>of(underlyingPriceStipValue), List.<Field>of(partyIdClientId), List.<Field>of(partyIdInvestmentDecisionMaker), List.<Field>of(executingTrader), List.<Field>of(marketSegmentId), List.<Field>of(negotiationId), List.<Field>of(orderAttributeLiquidityProvision), List.<Field>of(executingTraderQualifier), List.<Field>of(partyIdInvestmentDecisionMakerQualifier), List.<Field>of(tradingCapacity), List.<Field>of(tradePublishIndicator), List.<Field>of(orderOrigination), List.<Field>of(hedgingInstruction), List.<Field>of(noSrqsQuoteGrps), List.<Field>of(partyExecutingFirm), List.<Field>of(partyExecutingTrader), List.<Field>of(firmTradeId), List.<Field>of(freeText1), List.<Field>of(freeText2), List.<Field>of(freeText3), List.<Field>of(freeText5), List.<Field>of(positionEffect), List.<Field>of(account), List.<Field>of(partyIdBeneficiary), List.<Field>of(custOrderHandlingInst), List.<Field>of(partyIdOrderOriginationFirm), List.<Field>of(partyIdPositionAccount), List.<Field>of(partyIdLocationId), List.<Field>of(complianceText), List.<Field>of(partyIdTakeUpTradingFirm)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Network Msg Id
     *
     * @return the NetworkMsgId field
     */
    public NetworkMsgIdField networkMsgId() {
        return networkMsgId;
    }

    /**
     * Valid Until Time
     *
     * @return the ValidUntilTime field
     */
    public ValidUntilTimeField validUntilTime() {
        return validUntilTime;
    }

    /**
     * Underlying Qty
     *
     * @return the UnderlyingQty field
     */
    public UnderlyingQtyField underlyingQty() {
        return underlyingQty;
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
     * Party Id Client Id
     *
     * @return the PartyIdClientId field
     */
    public PartyIdClientIdField partyIdClientId() {
        return partyIdClientId;
    }

    /**
     * Party Id Investment Decision Maker
     *
     * @return the PartyIdInvestmentDecisionMaker field
     */
    public PartyIdInvestmentDecisionMakerField partyIdInvestmentDecisionMaker() {
        return partyIdInvestmentDecisionMaker;
    }

    /**
     * Executing Trader
     *
     * @return the ExecutingTrader field
     */
    public ExecutingTraderField executingTrader() {
        return executingTrader;
    }

    /**
     * Market Segment Id
     *
     * @return the MarketSegmentId field
     */
    public MarketSegmentIdField marketSegmentId() {
        return marketSegmentId;
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
     * Order Attribute Liquidity Provision
     *
     * @return the OrderAttributeLiquidityProvision field
     */
    public OrderAttributeLiquidityProvisionField orderAttributeLiquidityProvision() {
        return orderAttributeLiquidityProvision;
    }

    /**
     * Executing Trader Qualifier
     *
     * @return the ExecutingTraderQualifier field
     */
    public ExecutingTraderQualifierField executingTraderQualifier() {
        return executingTraderQualifier;
    }

    /**
     * Party Id Investment Decision Maker Qualifier
     *
     * @return the PartyIdInvestmentDecisionMakerQualifier field
     */
    public PartyIdInvestmentDecisionMakerQualifierField partyIdInvestmentDecisionMakerQualifier() {
        return partyIdInvestmentDecisionMakerQualifier;
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
     * Trade Publish Indicator
     *
     * @return the TradePublishIndicator field
     */
    public TradePublishIndicatorField tradePublishIndicator() {
        return tradePublishIndicator;
    }

    /**
     * Order Origination
     *
     * @return the OrderOrigination field
     */
    public OrderOriginationField orderOrigination() {
        return orderOrigination;
    }

    /**
     * Hedging Instruction
     *
     * @return the HedgingInstruction field
     */
    public HedgingInstructionField hedgingInstruction() {
        return hedgingInstruction;
    }

    /**
     * No Srqs Quote Grps
     *
     * @return the NoSrqsQuoteGrps field
     */
    public NoSrqsQuoteGrpsField noSrqsQuoteGrps() {
        return noSrqsQuoteGrps;
    }

    /**
     * Party Executing Firm
     *
     * @return the PartyExecutingFirm field
     */
    public PartyExecutingFirmField partyExecutingFirm() {
        return partyExecutingFirm;
    }

    /**
     * Party Executing Trader
     *
     * @return the PartyExecutingTrader field
     */
    public PartyExecutingTraderField partyExecutingTrader() {
        return partyExecutingTrader;
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
     * Srqs Hit Quote Grp Comp
     *
     * <p>Encode writes this list's size to the NoSrqsQuoteGrps field.</p>
     *
     * @return the SrqsHitQuoteGrpComp entries
     */
    public SrqsHitQuoteGrpCompList srqsHitQuoteGrpComp() {
        return srqsHitQuoteGrpComp;
    }

    /**
     * Request Header Comp
     *
     * @return the RequestHeaderComp record
     */
    public RequestHeaderComp requestHeaderComp() {
        return requestHeaderComp;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + srqsHitQuoteGrpComp.byteLength();
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        IntStream.Builder runs = IntStream.builder();
        padding(runs, 0);
        return runs.build().toArray();
    }

    /**
     * Adds the declared padding runs, as offset and length pairs.
     *
     * @param runs   the destination
     * @param offset the offset of this class's first byte, relative to the start of the message
     * @return the offset just past this class's last byte
     */
    public int padding(IntStream.Builder runs, int offset) {
        int cursor = offset;
        cursor += 8;
        runs.add(cursor).add(2);
        cursor += 2;
        for (int[] run = RequestHeaderComp.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += RequestHeaderComp.BYTE_LENGTH;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 4;
        cursor += 4;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 5;
        cursor += 6;
        cursor += 20;
        cursor += 12;
        cursor += 12;
        cursor += 12;
        cursor += 132;
        cursor += 1;
        cursor += 2;
        cursor += 9;
        cursor += 1;
        cursor += 7;
        cursor += 32;
        cursor += 2;
        cursor += 20;
        cursor += 5;
        runs.add(cursor).add(2);
        cursor += 2;
        cursor = srqsHitQuoteGrpComp.padding(runs, cursor);
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(validUntilTime.value());
    }

    @Override
    public boolean parseFrom(byte[] data, int offset) {
        return parseFrom(data, offset, data.length);
    }

    @Override
    public boolean parseFrom(byte[] data, int offset, int end) {
        clear();
        this.decoded = read(data, offset, end);

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!networkMsgId.parse(data, cursor)) {
            return false;
        }
        cursor += NetworkMsgIdField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!requestHeaderComp.parseFrom(data, cursor, end - 344)) {
            return false;
        }
        cursor += requestHeaderComp.byteLength();
        if (!validUntilTime.parse(data, cursor)) {
            return false;
        }
        cursor += ValidUntilTimeField.BYTE_LENGTH;
        if (!underlyingQty.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingQtyField.BYTE_LENGTH;
        if (!underlyingPriceStipValue.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingPriceStipValueField.BYTE_LENGTH;
        if (!partyIdClientId.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdClientIdField.BYTE_LENGTH;
        if (!partyIdInvestmentDecisionMaker.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdInvestmentDecisionMakerField.BYTE_LENGTH;
        if (!executingTrader.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutingTraderField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!negotiationId.parse(data, cursor)) {
            return false;
        }
        cursor += NegotiationIdField.BYTE_LENGTH;
        if (!orderAttributeLiquidityProvision.parse(data, cursor)) {
            return false;
        }
        cursor += OrderAttributeLiquidityProvisionField.BYTE_LENGTH;
        if (!executingTraderQualifier.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutingTraderQualifierField.BYTE_LENGTH;
        if (!partyIdInvestmentDecisionMakerQualifier.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdInvestmentDecisionMakerQualifierField.BYTE_LENGTH;
        if (!tradingCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += TradingCapacityField.BYTE_LENGTH;
        if (!tradePublishIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += TradePublishIndicatorField.BYTE_LENGTH;
        if (!orderOrigination.parse(data, cursor)) {
            return false;
        }
        cursor += OrderOriginationField.BYTE_LENGTH;
        if (!hedgingInstruction.parse(data, cursor)) {
            return false;
        }
        cursor += HedgingInstructionField.BYTE_LENGTH;
        if (!noSrqsQuoteGrps.parse(data, cursor)) {
            return false;
        }
        cursor += NoSrqsQuoteGrpsField.BYTE_LENGTH;
        if (!partyExecutingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += PartyExecutingFirmField.BYTE_LENGTH;
        if (!partyExecutingTrader.parse(data, cursor)) {
            return false;
        }
        cursor += PartyExecutingTraderField.BYTE_LENGTH;
        if (!firmTradeId.parse(data, cursor)) {
            return false;
        }
        cursor += FirmTradeIdField.BYTE_LENGTH;
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
        cursor += 2; // padding
        if (!srqsHitQuoteGrpComp.parse(data, cursor, end, noSrqsQuoteGrps.value())) {
            return false;
        }
        cursor += srqsHitQuoteGrpComp.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (srqsHitQuoteGrpComp.size() > 255) {
            throw new IllegalStateException("srqsHitQuoteGrpComp holds " + srqsHitQuoteGrpComp.size() + " entries, more than its count field can state");
        }
        noSrqsQuoteGrps.value((short) srqsHitQuoteGrpComp.size());
        int cursor = offset;
        cursor = networkMsgId.encode(data, cursor);
        if (buffer != null && buffer.length >= 10) {
            System.arraycopy(buffer, 8, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = requestHeaderComp.encode(data, cursor);
        cursor = validUntilTime.encode(data, cursor);
        cursor = underlyingQty.encode(data, cursor);
        cursor = underlyingPriceStipValue.encode(data, cursor);
        cursor = partyIdClientId.encode(data, cursor);
        cursor = partyIdInvestmentDecisionMaker.encode(data, cursor);
        cursor = executingTrader.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = negotiationId.encode(data, cursor);
        cursor = orderAttributeLiquidityProvision.encode(data, cursor);
        cursor = executingTraderQualifier.encode(data, cursor);
        cursor = partyIdInvestmentDecisionMakerQualifier.encode(data, cursor);
        cursor = tradingCapacity.encode(data, cursor);
        cursor = tradePublishIndicator.encode(data, cursor);
        cursor = orderOrigination.encode(data, cursor);
        cursor = hedgingInstruction.encode(data, cursor);
        cursor = noSrqsQuoteGrps.encode(data, cursor);
        cursor = partyExecutingFirm.encode(data, cursor);
        cursor = partyExecutingTrader.encode(data, cursor);
        cursor = firmTradeId.encode(data, cursor);
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
        if (buffer != null && buffer.length >= 362) {
            System.arraycopy(buffer, 360, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = srqsHitQuoteGrpComp.encode(data, cursor);
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[byteLength()];
        encode(data, 0);
        return data;
    }

    @Override
    public void clear() {
        for (Field field : fields) {
            field.reset();
        }
        requestHeaderComp.clear();
        srqsHitQuoteGrpComp.clear();
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noSrqsQuoteGrps && !field.isRecognized()) {
                return false;
            }
        }
        return srqsHitQuoteGrpComp.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noSrqsQuoteGrps && !field.isValid()) {
                return false;
            }
        }
        if (!srqsHitQuoteGrpComp.isValid()) {
            return false;
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
        if (!networkMsgId.isDecoded()) {
            return Optional.of(networkMsgId);
        }
        if (!requestHeaderComp.isDecoded()) {
            return requestHeaderComp.failedAt();
        }
        if (!validUntilTime.isDecoded()) {
            return Optional.of(validUntilTime);
        }
        if (!underlyingQty.isDecoded()) {
            return Optional.of(underlyingQty);
        }
        if (!underlyingPriceStipValue.isDecoded()) {
            return Optional.of(underlyingPriceStipValue);
        }
        if (!partyIdClientId.isDecoded()) {
            return Optional.of(partyIdClientId);
        }
        if (!partyIdInvestmentDecisionMaker.isDecoded()) {
            return Optional.of(partyIdInvestmentDecisionMaker);
        }
        if (!executingTrader.isDecoded()) {
            return Optional.of(executingTrader);
        }
        if (!marketSegmentId.isDecoded()) {
            return Optional.of(marketSegmentId);
        }
        if (!negotiationId.isDecoded()) {
            return Optional.of(negotiationId);
        }
        if (!orderAttributeLiquidityProvision.isDecoded()) {
            return Optional.of(orderAttributeLiquidityProvision);
        }
        if (!executingTraderQualifier.isDecoded()) {
            return Optional.of(executingTraderQualifier);
        }
        if (!partyIdInvestmentDecisionMakerQualifier.isDecoded()) {
            return Optional.of(partyIdInvestmentDecisionMakerQualifier);
        }
        if (!tradingCapacity.isDecoded()) {
            return Optional.of(tradingCapacity);
        }
        if (!tradePublishIndicator.isDecoded()) {
            return Optional.of(tradePublishIndicator);
        }
        if (!orderOrigination.isDecoded()) {
            return Optional.of(orderOrigination);
        }
        if (!hedgingInstruction.isDecoded()) {
            return Optional.of(hedgingInstruction);
        }
        if (!noSrqsQuoteGrps.isDecoded()) {
            return Optional.of(noSrqsQuoteGrps);
        }
        if (!partyExecutingFirm.isDecoded()) {
            return Optional.of(partyExecutingFirm);
        }
        if (!partyExecutingTrader.isDecoded()) {
            return Optional.of(partyExecutingTrader);
        }
        if (!firmTradeId.isDecoded()) {
            return Optional.of(firmTradeId);
        }
        if (!freeText1.isDecoded()) {
            return Optional.of(freeText1);
        }
        if (!freeText2.isDecoded()) {
            return Optional.of(freeText2);
        }
        if (!freeText3.isDecoded()) {
            return Optional.of(freeText3);
        }
        if (!freeText5.isDecoded()) {
            return Optional.of(freeText5);
        }
        if (!positionEffect.isDecoded()) {
            return Optional.of(positionEffect);
        }
        if (!account.isDecoded()) {
            return Optional.of(account);
        }
        if (!partyIdBeneficiary.isDecoded()) {
            return Optional.of(partyIdBeneficiary);
        }
        if (!custOrderHandlingInst.isDecoded()) {
            return Optional.of(custOrderHandlingInst);
        }
        if (!partyIdOrderOriginationFirm.isDecoded()) {
            return Optional.of(partyIdOrderOriginationFirm);
        }
        if (!partyIdPositionAccount.isDecoded()) {
            return Optional.of(partyIdPositionAccount);
        }
        if (!partyIdLocationId.isDecoded()) {
            return Optional.of(partyIdLocationId);
        }
        if (!complianceText.isDecoded()) {
            return Optional.of(complianceText);
        }
        if (!partyIdTakeUpTradingFirm.isDecoded()) {
            return Optional.of(partyIdTakeUpTradingFirm);
        }
        if (!srqsHitQuoteGrpComp.isDecoded()) {
            return Optional.of(srqsHitQuoteGrpComp.failedEntry().flatMap(SrqsHitQuoteGrpCompEntry::failedAt).orElse(noSrqsQuoteGrps));
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
            case "NetworkMsgId" -> Optional.of(networkMsgId);
            case "ValidUntilTime" -> Optional.of(validUntilTime);
            case "UnderlyingQty" -> Optional.of(underlyingQty);
            case "UnderlyingPriceStipValue" -> Optional.of(underlyingPriceStipValue);
            case "PartyIdClientId" -> Optional.of(partyIdClientId);
            case "PartyIdInvestmentDecisionMaker" -> Optional.of(partyIdInvestmentDecisionMaker);
            case "ExecutingTrader" -> Optional.of(executingTrader);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "NegotiationId" -> Optional.of(negotiationId);
            case "OrderAttributeLiquidityProvision" -> Optional.of(orderAttributeLiquidityProvision);
            case "ExecutingTraderQualifier" -> Optional.of(executingTraderQualifier);
            case "PartyIdInvestmentDecisionMakerQualifier" -> Optional.of(partyIdInvestmentDecisionMakerQualifier);
            case "TradingCapacity" -> Optional.of(tradingCapacity);
            case "TradePublishIndicator" -> Optional.of(tradePublishIndicator);
            case "OrderOrigination" -> Optional.of(orderOrigination);
            case "HedgingInstruction" -> Optional.of(hedgingInstruction);
            case "NoSrqsQuoteGrps" -> Optional.of(noSrqsQuoteGrps);
            case "PartyExecutingFirm" -> Optional.of(partyExecutingFirm);
            case "PartyExecutingTrader" -> Optional.of(partyExecutingTrader);
            case "FirmTradeId" -> Optional.of(firmTradeId);
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
        if (!(other instanceof SrqsHitQuoteRequest message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(srqsHitQuoteGrpComp.diffFields(message.srqsHitQuoteGrpComp));
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
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line. Repeating groups follow the fields.</p>
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
            builder.append(", ");
            srqsHitQuoteGrpComp.toFormattedString(builder, options);
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
        srqsHitQuoteGrpComp.toFormattedString(builder, nested);
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
        if (!(other instanceof SrqsHitQuoteRequest message)) {
            return false;
        }
        return fields.equals(message.fields) && srqsHitQuoteGrpComp.equals(message.srqsHitQuoteGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, srqsHitQuoteGrpComp);
    }
}
