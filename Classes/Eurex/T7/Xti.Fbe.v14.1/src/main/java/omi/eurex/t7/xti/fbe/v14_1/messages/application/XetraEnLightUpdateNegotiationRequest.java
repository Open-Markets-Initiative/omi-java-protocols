package omi.eurex.t7.xti.fbe.v14_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.eurex.t7.xti.fbe.v14_1.fields.AutoExecExposureDurationField;
import omi.eurex.t7.xti.fbe.v14_1.fields.AutoExecLimitPriceField;
import omi.eurex.t7.xti.fbe.v14_1.fields.AutoExecMinNoOfQuotesField;
import omi.eurex.t7.xti.fbe.v14_1.fields.AutoExecReferencePriceOffsetField;
import omi.eurex.t7.xti.fbe.v14_1.fields.AutoExecTypeField;
import omi.eurex.t7.xti.fbe.v14_1.fields.BidPxField;
import omi.eurex.t7.xti.fbe.v14_1.fields.ExecutingTraderField;
import omi.eurex.t7.xti.fbe.v14_1.fields.ExecutingTraderQualifierField;
import omi.eurex.t7.xti.fbe.v14_1.fields.FreeText1Field;
import omi.eurex.t7.xti.fbe.v14_1.fields.FreeText2Field;
import omi.eurex.t7.xti.fbe.v14_1.fields.FreeText4Field;
import omi.eurex.t7.xti.fbe.v14_1.fields.FreeText5Field;
import omi.eurex.t7.xti.fbe.v14_1.fields.MarketSegmentIdField;
import omi.eurex.t7.xti.fbe.v14_1.fields.NegotiationIdField;
import omi.eurex.t7.xti.fbe.v14_1.fields.NetworkMsgIdField;
import omi.eurex.t7.xti.fbe.v14_1.fields.NoTargetPartyIDsField;
import omi.eurex.t7.xti.fbe.v14_1.fields.NumberOfRespDisclosureInstructionField;
import omi.eurex.t7.xti.fbe.v14_1.fields.OfferPxField;
import omi.eurex.t7.xti.fbe.v14_1.fields.OrderAttributeLiquidityProvisionField;
import omi.eurex.t7.xti.fbe.v14_1.fields.OrderOriginationField;
import omi.eurex.t7.xti.fbe.v14_1.fields.OrderQtyField;
import omi.eurex.t7.xti.fbe.v14_1.fields.PartyExecutingFirmField;
import omi.eurex.t7.xti.fbe.v14_1.fields.PartyExecutingTraderField;
import omi.eurex.t7.xti.fbe.v14_1.fields.PartyIdClientIdField;
import omi.eurex.t7.xti.fbe.v14_1.fields.PartyIdInvestmentDecisionMakerField;
import omi.eurex.t7.xti.fbe.v14_1.fields.PartyIdInvestmentDecisionMakerQualifierField;
import omi.eurex.t7.xti.fbe.v14_1.fields.QuoteConditionField;
import omi.eurex.t7.xti.fbe.v14_1.fields.RespondentTypeField;
import omi.eurex.t7.xti.fbe.v14_1.fields.SettlDateField;
import omi.eurex.t7.xti.fbe.v14_1.fields.SideDisclosureInstructionField;
import omi.eurex.t7.xti.fbe.v14_1.fields.SideField;
import omi.eurex.t7.xti.fbe.v14_1.fields.TradingCapacityField;
import omi.eurex.t7.xti.fbe.v14_1.fields.ValueCheckTypeQuantityField;
import omi.eurex.t7.xti.fbe.v14_1.fields.ValueCheckTypeValueField;
import omi.eurex.t7.xti.fbe.v14_1.groups.XetraEnLightTargetPartiesCompEntry;
import omi.eurex.t7.xti.fbe.v14_1.groups.XetraEnLightTargetPartiesCompList;
import omi.eurex.t7.xti.fbe.v14_1.structs.RequestHeaderComp;
import omi.eurex.t7.xti.fbe.v14_1.types.Field;
import omi.eurex.t7.xti.fbe.v14_1.types.Message;
import omi.eurex.t7.xti.fbe.v14_1.types.PrintOptions;

/**
 * Represents the XetraEnLightUpdateNegotiationRequest message from the Xti protocol.
 */
public final class XetraEnLightUpdateNegotiationRequest implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 298;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Xetra En Light Update Negotiation Request";

    /**
     * Network Msg Id
     */
    private final NetworkMsgIdField networkMsgId = new NetworkMsgIdField();

    /**
     * Bid Px
     */
    private final BidPxField bidPx = new BidPxField();

    /**
     * Offer Px
     */
    private final OfferPxField offerPx = new OfferPxField();

    /**
     * Order Qty
     */
    private final OrderQtyField orderQty = new OrderQtyField();

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
     * Auto Exec Limit Price
     */
    private final AutoExecLimitPriceField autoExecLimitPrice = new AutoExecLimitPriceField();

    /**
     * Auto Exec Reference Price Offset
     */
    private final AutoExecReferencePriceOffsetField autoExecReferencePriceOffset = new AutoExecReferencePriceOffsetField();

    /**
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Negotiation Id
     */
    private final NegotiationIdField negotiationId = new NegotiationIdField();

    /**
     * Settl Date
     */
    private final SettlDateField settlDate = new SettlDateField();

    /**
     * Auto Exec Exposure Duration
     */
    private final AutoExecExposureDurationField autoExecExposureDuration = new AutoExecExposureDurationField();

    /**
     * Auto Exec Min No Of Quotes
     */
    private final AutoExecMinNoOfQuotesField autoExecMinNoOfQuotes = new AutoExecMinNoOfQuotesField();

    /**
     * No Target Party I Ds
     */
    private final NoTargetPartyIDsField noTargetPartyIDs = new NoTargetPartyIDsField();

    /**
     * Number Of Resp Disclosure Instruction
     */
    private final NumberOfRespDisclosureInstructionField numberOfRespDisclosureInstruction = new NumberOfRespDisclosureInstructionField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * Value Check Type Value
     */
    private final ValueCheckTypeValueField valueCheckTypeValue = new ValueCheckTypeValueField();

    /**
     * Value Check Type Quantity
     */
    private final ValueCheckTypeQuantityField valueCheckTypeQuantity = new ValueCheckTypeQuantityField();

    /**
     * Respondent Type
     */
    private final RespondentTypeField respondentType = new RespondentTypeField();

    /**
     * Trading Capacity
     */
    private final TradingCapacityField tradingCapacity = new TradingCapacityField();

    /**
     * Auto Exec Type
     */
    private final AutoExecTypeField autoExecType = new AutoExecTypeField();

    /**
     * Side Disclosure Instruction
     */
    private final SideDisclosureInstructionField sideDisclosureInstruction = new SideDisclosureInstructionField();

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
     * Order Origination
     */
    private final OrderOriginationField orderOrigination = new OrderOriginationField();

    /**
     * Quote Condition
     */
    private final QuoteConditionField quoteCondition = new QuoteConditionField();

    /**
     * Party Executing Firm
     */
    private final PartyExecutingFirmField partyExecutingFirm = new PartyExecutingFirmField();

    /**
     * Party Executing Trader
     */
    private final PartyExecutingTraderField partyExecutingTrader = new PartyExecutingTraderField();

    /**
     * Free Text 1
     */
    private final FreeText1Field freeText1 = new FreeText1Field();

    /**
     * Free Text 2
     */
    private final FreeText2Field freeText2 = new FreeText2Field();

    /**
     * Free Text 4
     */
    private final FreeText4Field freeText4 = new FreeText4Field();

    /**
     * Free Text 5
     */
    private final FreeText5Field freeText5 = new FreeText5Field();

    /**
     * Xetra En Light Target Parties Comp
     */
    private final XetraEnLightTargetPartiesCompList xetraEnLightTargetPartiesComp = new XetraEnLightTargetPartiesCompList();

    /**
     * Request Header Comp
     */
    private final RequestHeaderComp requestHeaderComp = new RequestHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(networkMsgId), requestHeaderComp.fields(), List.<Field>of(bidPx), List.<Field>of(offerPx), List.<Field>of(orderQty), List.<Field>of(partyIdClientId), List.<Field>of(partyIdInvestmentDecisionMaker), List.<Field>of(executingTrader), List.<Field>of(autoExecLimitPrice), List.<Field>of(autoExecReferencePriceOffset), List.<Field>of(marketSegmentId), List.<Field>of(negotiationId), List.<Field>of(settlDate), List.<Field>of(autoExecExposureDuration), List.<Field>of(autoExecMinNoOfQuotes), List.<Field>of(noTargetPartyIDs), List.<Field>of(numberOfRespDisclosureInstruction), List.<Field>of(side), List.<Field>of(valueCheckTypeValue), List.<Field>of(valueCheckTypeQuantity), List.<Field>of(respondentType), List.<Field>of(tradingCapacity), List.<Field>of(autoExecType), List.<Field>of(sideDisclosureInstruction), List.<Field>of(orderAttributeLiquidityProvision), List.<Field>of(executingTraderQualifier), List.<Field>of(partyIdInvestmentDecisionMakerQualifier), List.<Field>of(orderOrigination), List.<Field>of(quoteCondition), List.<Field>of(partyExecutingFirm), List.<Field>of(partyExecutingTrader), List.<Field>of(freeText1), List.<Field>of(freeText2), List.<Field>of(freeText4), List.<Field>of(freeText5)).flatMap(List::stream).toList();

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
     * Bid Px
     *
     * @return the BidPx field
     */
    public BidPxField bidPx() {
        return bidPx;
    }

    /**
     * Offer Px
     *
     * @return the OfferPx field
     */
    public OfferPxField offerPx() {
        return offerPx;
    }

    /**
     * Order Qty
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
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
     * Auto Exec Limit Price
     *
     * @return the AutoExecLimitPrice field
     */
    public AutoExecLimitPriceField autoExecLimitPrice() {
        return autoExecLimitPrice;
    }

    /**
     * Auto Exec Reference Price Offset
     *
     * @return the AutoExecReferencePriceOffset field
     */
    public AutoExecReferencePriceOffsetField autoExecReferencePriceOffset() {
        return autoExecReferencePriceOffset;
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
     * Settl Date
     *
     * @return the SettlDate field
     */
    public SettlDateField settlDate() {
        return settlDate;
    }

    /**
     * Auto Exec Exposure Duration
     *
     * @return the AutoExecExposureDuration field
     */
    public AutoExecExposureDurationField autoExecExposureDuration() {
        return autoExecExposureDuration;
    }

    /**
     * Auto Exec Min No Of Quotes
     *
     * @return the AutoExecMinNoOfQuotes field
     */
    public AutoExecMinNoOfQuotesField autoExecMinNoOfQuotes() {
        return autoExecMinNoOfQuotes;
    }

    /**
     * No Target Party I Ds
     *
     * @return the NoTargetPartyIDs field
     */
    public NoTargetPartyIDsField noTargetPartyIDs() {
        return noTargetPartyIDs;
    }

    /**
     * Number Of Resp Disclosure Instruction
     *
     * @return the NumberOfRespDisclosureInstruction field
     */
    public NumberOfRespDisclosureInstructionField numberOfRespDisclosureInstruction() {
        return numberOfRespDisclosureInstruction;
    }

    /**
     * Side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Value Check Type Value
     *
     * @return the ValueCheckTypeValue field
     */
    public ValueCheckTypeValueField valueCheckTypeValue() {
        return valueCheckTypeValue;
    }

    /**
     * Value Check Type Quantity
     *
     * @return the ValueCheckTypeQuantity field
     */
    public ValueCheckTypeQuantityField valueCheckTypeQuantity() {
        return valueCheckTypeQuantity;
    }

    /**
     * Respondent Type
     *
     * @return the RespondentType field
     */
    public RespondentTypeField respondentType() {
        return respondentType;
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
     * Auto Exec Type
     *
     * @return the AutoExecType field
     */
    public AutoExecTypeField autoExecType() {
        return autoExecType;
    }

    /**
     * Side Disclosure Instruction
     *
     * @return the SideDisclosureInstruction field
     */
    public SideDisclosureInstructionField sideDisclosureInstruction() {
        return sideDisclosureInstruction;
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
     * Order Origination
     *
     * @return the OrderOrigination field
     */
    public OrderOriginationField orderOrigination() {
        return orderOrigination;
    }

    /**
     * Quote Condition
     *
     * @return the QuoteCondition field
     */
    public QuoteConditionField quoteCondition() {
        return quoteCondition;
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
     * Free Text 4
     *
     * @return the FreeText4 field
     */
    public FreeText4Field freeText4() {
        return freeText4;
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
     * Xetra En Light Target Parties Comp
     *
     * <p>Encode writes this list's size to the NoTargetPartyIDs field.</p>
     *
     * @return the XetraEnLightTargetPartiesComp entries
     */
    public XetraEnLightTargetPartiesCompList xetraEnLightTargetPartiesComp() {
        return xetraEnLightTargetPartiesComp;
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
        return MINIMUM_BYTE_LENGTH + xetraEnLightTargetPartiesComp.byteLength();
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
        cursor += 8;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 4;
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
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 5;
        cursor += 6;
        cursor += 12;
        cursor += 12;
        cursor += 16;
        cursor += 132;
        runs.add(cursor).add(3);
        cursor += 3;
        cursor = xetraEnLightTargetPartiesComp.padding(runs, cursor);
        return cursor;
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
        if (!requestHeaderComp.parseFrom(data, cursor, end - 280)) {
            return false;
        }
        cursor += requestHeaderComp.byteLength();
        if (!bidPx.parse(data, cursor)) {
            return false;
        }
        cursor += BidPxField.BYTE_LENGTH;
        if (!offerPx.parse(data, cursor)) {
            return false;
        }
        cursor += OfferPxField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
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
        if (!autoExecLimitPrice.parse(data, cursor)) {
            return false;
        }
        cursor += AutoExecLimitPriceField.BYTE_LENGTH;
        if (!autoExecReferencePriceOffset.parse(data, cursor)) {
            return false;
        }
        cursor += AutoExecReferencePriceOffsetField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!negotiationId.parse(data, cursor)) {
            return false;
        }
        cursor += NegotiationIdField.BYTE_LENGTH;
        if (!settlDate.parse(data, cursor)) {
            return false;
        }
        cursor += SettlDateField.BYTE_LENGTH;
        if (!autoExecExposureDuration.parse(data, cursor)) {
            return false;
        }
        cursor += AutoExecExposureDurationField.BYTE_LENGTH;
        if (!autoExecMinNoOfQuotes.parse(data, cursor)) {
            return false;
        }
        cursor += AutoExecMinNoOfQuotesField.BYTE_LENGTH;
        if (!noTargetPartyIDs.parse(data, cursor)) {
            return false;
        }
        cursor += NoTargetPartyIDsField.BYTE_LENGTH;
        if (!numberOfRespDisclosureInstruction.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfRespDisclosureInstructionField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!valueCheckTypeValue.parse(data, cursor)) {
            return false;
        }
        cursor += ValueCheckTypeValueField.BYTE_LENGTH;
        if (!valueCheckTypeQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += ValueCheckTypeQuantityField.BYTE_LENGTH;
        if (!respondentType.parse(data, cursor)) {
            return false;
        }
        cursor += RespondentTypeField.BYTE_LENGTH;
        if (!tradingCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += TradingCapacityField.BYTE_LENGTH;
        if (!autoExecType.parse(data, cursor)) {
            return false;
        }
        cursor += AutoExecTypeField.BYTE_LENGTH;
        if (!sideDisclosureInstruction.parse(data, cursor)) {
            return false;
        }
        cursor += SideDisclosureInstructionField.BYTE_LENGTH;
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
        if (!orderOrigination.parse(data, cursor)) {
            return false;
        }
        cursor += OrderOriginationField.BYTE_LENGTH;
        if (!quoteCondition.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteConditionField.BYTE_LENGTH;
        if (!partyExecutingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += PartyExecutingFirmField.BYTE_LENGTH;
        if (!partyExecutingTrader.parse(data, cursor)) {
            return false;
        }
        cursor += PartyExecutingTraderField.BYTE_LENGTH;
        if (!freeText1.parse(data, cursor)) {
            return false;
        }
        cursor += FreeText1Field.BYTE_LENGTH;
        if (!freeText2.parse(data, cursor)) {
            return false;
        }
        cursor += FreeText2Field.BYTE_LENGTH;
        if (!freeText4.parse(data, cursor)) {
            return false;
        }
        cursor += FreeText4Field.BYTE_LENGTH;
        if (!freeText5.parse(data, cursor)) {
            return false;
        }
        cursor += FreeText5Field.BYTE_LENGTH;
        cursor += 3; // padding
        if (!xetraEnLightTargetPartiesComp.parse(data, cursor, end, noTargetPartyIDs.value())) {
            return false;
        }
        cursor += xetraEnLightTargetPartiesComp.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (xetraEnLightTargetPartiesComp.size() > 255) {
            throw new IllegalStateException("xetraEnLightTargetPartiesComp holds " + xetraEnLightTargetPartiesComp.size() + " entries, more than its count field can state");
        }
        noTargetPartyIDs.value((short) xetraEnLightTargetPartiesComp.size());
        int cursor = offset;
        cursor = networkMsgId.encode(data, cursor);
        if (buffer != null && buffer.length >= 10) {
            System.arraycopy(buffer, 8, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = requestHeaderComp.encode(data, cursor);
        cursor = bidPx.encode(data, cursor);
        cursor = offerPx.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = partyIdClientId.encode(data, cursor);
        cursor = partyIdInvestmentDecisionMaker.encode(data, cursor);
        cursor = executingTrader.encode(data, cursor);
        cursor = autoExecLimitPrice.encode(data, cursor);
        cursor = autoExecReferencePriceOffset.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = negotiationId.encode(data, cursor);
        cursor = settlDate.encode(data, cursor);
        cursor = autoExecExposureDuration.encode(data, cursor);
        cursor = autoExecMinNoOfQuotes.encode(data, cursor);
        cursor = noTargetPartyIDs.encode(data, cursor);
        cursor = numberOfRespDisclosureInstruction.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = valueCheckTypeValue.encode(data, cursor);
        cursor = valueCheckTypeQuantity.encode(data, cursor);
        cursor = respondentType.encode(data, cursor);
        cursor = tradingCapacity.encode(data, cursor);
        cursor = autoExecType.encode(data, cursor);
        cursor = sideDisclosureInstruction.encode(data, cursor);
        cursor = orderAttributeLiquidityProvision.encode(data, cursor);
        cursor = executingTraderQualifier.encode(data, cursor);
        cursor = partyIdInvestmentDecisionMakerQualifier.encode(data, cursor);
        cursor = orderOrigination.encode(data, cursor);
        cursor = quoteCondition.encode(data, cursor);
        cursor = partyExecutingFirm.encode(data, cursor);
        cursor = partyExecutingTrader.encode(data, cursor);
        cursor = freeText1.encode(data, cursor);
        cursor = freeText2.encode(data, cursor);
        cursor = freeText4.encode(data, cursor);
        cursor = freeText5.encode(data, cursor);
        if (buffer != null && buffer.length >= 298) {
            System.arraycopy(buffer, 295, data, cursor, 3); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 3, (byte) 0); // padding
        }
        cursor += 3;
        cursor = xetraEnLightTargetPartiesComp.encode(data, cursor);
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
        xetraEnLightTargetPartiesComp.clear();
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
            if (field != noTargetPartyIDs && !field.isRecognized()) {
                return false;
            }
        }
        return xetraEnLightTargetPartiesComp.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noTargetPartyIDs && !field.isValid()) {
                return false;
            }
        }
        if (!xetraEnLightTargetPartiesComp.isValid()) {
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
        if (!bidPx.isDecoded()) {
            return Optional.of(bidPx);
        }
        if (!offerPx.isDecoded()) {
            return Optional.of(offerPx);
        }
        if (!orderQty.isDecoded()) {
            return Optional.of(orderQty);
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
        if (!autoExecLimitPrice.isDecoded()) {
            return Optional.of(autoExecLimitPrice);
        }
        if (!autoExecReferencePriceOffset.isDecoded()) {
            return Optional.of(autoExecReferencePriceOffset);
        }
        if (!marketSegmentId.isDecoded()) {
            return Optional.of(marketSegmentId);
        }
        if (!negotiationId.isDecoded()) {
            return Optional.of(negotiationId);
        }
        if (!settlDate.isDecoded()) {
            return Optional.of(settlDate);
        }
        if (!autoExecExposureDuration.isDecoded()) {
            return Optional.of(autoExecExposureDuration);
        }
        if (!autoExecMinNoOfQuotes.isDecoded()) {
            return Optional.of(autoExecMinNoOfQuotes);
        }
        if (!noTargetPartyIDs.isDecoded()) {
            return Optional.of(noTargetPartyIDs);
        }
        if (!numberOfRespDisclosureInstruction.isDecoded()) {
            return Optional.of(numberOfRespDisclosureInstruction);
        }
        if (!side.isDecoded()) {
            return Optional.of(side);
        }
        if (!valueCheckTypeValue.isDecoded()) {
            return Optional.of(valueCheckTypeValue);
        }
        if (!valueCheckTypeQuantity.isDecoded()) {
            return Optional.of(valueCheckTypeQuantity);
        }
        if (!respondentType.isDecoded()) {
            return Optional.of(respondentType);
        }
        if (!tradingCapacity.isDecoded()) {
            return Optional.of(tradingCapacity);
        }
        if (!autoExecType.isDecoded()) {
            return Optional.of(autoExecType);
        }
        if (!sideDisclosureInstruction.isDecoded()) {
            return Optional.of(sideDisclosureInstruction);
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
        if (!orderOrigination.isDecoded()) {
            return Optional.of(orderOrigination);
        }
        if (!quoteCondition.isDecoded()) {
            return Optional.of(quoteCondition);
        }
        if (!partyExecutingFirm.isDecoded()) {
            return Optional.of(partyExecutingFirm);
        }
        if (!partyExecutingTrader.isDecoded()) {
            return Optional.of(partyExecutingTrader);
        }
        if (!freeText1.isDecoded()) {
            return Optional.of(freeText1);
        }
        if (!freeText2.isDecoded()) {
            return Optional.of(freeText2);
        }
        if (!freeText4.isDecoded()) {
            return Optional.of(freeText4);
        }
        if (!freeText5.isDecoded()) {
            return Optional.of(freeText5);
        }
        if (!xetraEnLightTargetPartiesComp.isDecoded()) {
            return Optional.of(xetraEnLightTargetPartiesComp.failedEntry().flatMap(XetraEnLightTargetPartiesCompEntry::failedAt).orElse(noTargetPartyIDs));
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
            case "BidPx" -> Optional.of(bidPx);
            case "OfferPx" -> Optional.of(offerPx);
            case "OrderQty" -> Optional.of(orderQty);
            case "PartyIdClientId" -> Optional.of(partyIdClientId);
            case "PartyIdInvestmentDecisionMaker" -> Optional.of(partyIdInvestmentDecisionMaker);
            case "ExecutingTrader" -> Optional.of(executingTrader);
            case "AutoExecLimitPrice" -> Optional.of(autoExecLimitPrice);
            case "AutoExecReferencePriceOffset" -> Optional.of(autoExecReferencePriceOffset);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "NegotiationId" -> Optional.of(negotiationId);
            case "SettlDate" -> Optional.of(settlDate);
            case "AutoExecExposureDuration" -> Optional.of(autoExecExposureDuration);
            case "AutoExecMinNoOfQuotes" -> Optional.of(autoExecMinNoOfQuotes);
            case "NoTargetPartyIDs" -> Optional.of(noTargetPartyIDs);
            case "NumberOfRespDisclosureInstruction" -> Optional.of(numberOfRespDisclosureInstruction);
            case "Side" -> Optional.of(side);
            case "ValueCheckTypeValue" -> Optional.of(valueCheckTypeValue);
            case "ValueCheckTypeQuantity" -> Optional.of(valueCheckTypeQuantity);
            case "RespondentType" -> Optional.of(respondentType);
            case "TradingCapacity" -> Optional.of(tradingCapacity);
            case "AutoExecType" -> Optional.of(autoExecType);
            case "SideDisclosureInstruction" -> Optional.of(sideDisclosureInstruction);
            case "OrderAttributeLiquidityProvision" -> Optional.of(orderAttributeLiquidityProvision);
            case "ExecutingTraderQualifier" -> Optional.of(executingTraderQualifier);
            case "PartyIdInvestmentDecisionMakerQualifier" -> Optional.of(partyIdInvestmentDecisionMakerQualifier);
            case "OrderOrigination" -> Optional.of(orderOrigination);
            case "QuoteCondition" -> Optional.of(quoteCondition);
            case "PartyExecutingFirm" -> Optional.of(partyExecutingFirm);
            case "PartyExecutingTrader" -> Optional.of(partyExecutingTrader);
            case "FreeText1" -> Optional.of(freeText1);
            case "FreeText2" -> Optional.of(freeText2);
            case "FreeText4" -> Optional.of(freeText4);
            case "FreeText5" -> Optional.of(freeText5);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof XetraEnLightUpdateNegotiationRequest message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(xetraEnLightTargetPartiesComp.diffFields(message.xetraEnLightTargetPartiesComp));
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
            xetraEnLightTargetPartiesComp.toFormattedString(builder, options);
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
        xetraEnLightTargetPartiesComp.toFormattedString(builder, nested);
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
        if (!(other instanceof XetraEnLightUpdateNegotiationRequest message)) {
            return false;
        }
        return fields.equals(message.fields) && xetraEnLightTargetPartiesComp.equals(message.xetraEnLightTargetPartiesComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, xetraEnLightTargetPartiesComp);
    }
}
