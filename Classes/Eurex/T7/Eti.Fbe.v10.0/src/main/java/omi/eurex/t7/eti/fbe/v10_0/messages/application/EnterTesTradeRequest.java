package omi.eurex.t7.eti.fbe.v10_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v10_0.fields.CompressionIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.HedgeTypeField;
import omi.eurex.t7.eti.fbe.v10_0.fields.LastPxField;
import omi.eurex.t7.eti.fbe.v10_0.fields.MarketSegmentIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NetworkMsgIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NoEventsField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NoInstrAttribField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NoLegsField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NoSideAllocsField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NoUnderlyingStipsField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PartyIdSettlementLocationField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ProductComplexField;
import omi.eurex.t7.eti.fbe.v10_0.fields.RelatedClosePriceField;
import omi.eurex.t7.eti.fbe.v10_0.fields.RelatedMarketSegmentIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.RelatedTradeIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.RelatedTradeQuantityField;
import omi.eurex.t7.eti.fbe.v10_0.fields.SecurityIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.SwapClearerField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TradePublishIndicatorField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TradeReportIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TradeReportTextField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TradeReportTypeField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TransBkdTimeField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TrdTypeField;
import omi.eurex.t7.eti.fbe.v10_0.fields.UnderlyingCurrencyField;
import omi.eurex.t7.eti.fbe.v10_0.fields.UnderlyingIssuerField;
import omi.eurex.t7.eti.fbe.v10_0.fields.UnderlyingMaturityDateField;
import omi.eurex.t7.eti.fbe.v10_0.fields.UnderlyingPxField;
import omi.eurex.t7.eti.fbe.v10_0.fields.UnderlyingQtyField;
import omi.eurex.t7.eti.fbe.v10_0.fields.UnderlyingSecurityDescField;
import omi.eurex.t7.eti.fbe.v10_0.fields.UnderlyingSecurityIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.UnderlyingSettlementDateField;
import omi.eurex.t7.eti.fbe.v10_0.groups.InstrumentAttributeGrpCompEntry;
import omi.eurex.t7.eti.fbe.v10_0.groups.InstrumentAttributeGrpCompList;
import omi.eurex.t7.eti.fbe.v10_0.groups.InstrumentEventGrpCompEntry;
import omi.eurex.t7.eti.fbe.v10_0.groups.InstrumentEventGrpCompList;
import omi.eurex.t7.eti.fbe.v10_0.groups.SideAllocGrpCompEntry;
import omi.eurex.t7.eti.fbe.v10_0.groups.SideAllocGrpCompList;
import omi.eurex.t7.eti.fbe.v10_0.groups.TrdInstrmntLegGrpCompEntry;
import omi.eurex.t7.eti.fbe.v10_0.groups.TrdInstrmntLegGrpCompList;
import omi.eurex.t7.eti.fbe.v10_0.groups.UnderlyingStipGrpCompEntry;
import omi.eurex.t7.eti.fbe.v10_0.groups.UnderlyingStipGrpCompList;
import omi.eurex.t7.eti.fbe.v10_0.structs.RequestHeaderComp;
import omi.eurex.t7.eti.fbe.v10_0.types.Field;
import omi.eurex.t7.eti.fbe.v10_0.types.Message;
import omi.eurex.t7.eti.fbe.v10_0.types.PrintOptions;

/**
 * Represents the EnterTesTradeRequest message from the Eti protocol.
 */
public final class EnterTesTradeRequest implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 234;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Enter Tes Trade Request";

    /**
     * Network Msg Id
     */
    private final NetworkMsgIdField networkMsgId = new NetworkMsgIdField();

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Last Px
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * Trans Bkd Time
     */
    private final TransBkdTimeField transBkdTime = new TransBkdTimeField();

    /**
     * Underlying Px
     */
    private final UnderlyingPxField underlyingPx = new UnderlyingPxField();

    /**
     * Related Close Price
     */
    private final RelatedClosePriceField relatedClosePrice = new RelatedClosePriceField();

    /**
     * Related Trade Quantity
     */
    private final RelatedTradeQuantityField relatedTradeQuantity = new RelatedTradeQuantityField();

    /**
     * Underlying Qty
     */
    private final UnderlyingQtyField underlyingQty = new UnderlyingQtyField();

    /**
     * Compression Id
     */
    private final CompressionIdField compressionId = new CompressionIdField();

    /**
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Underlying Settlement Date
     */
    private final UnderlyingSettlementDateField underlyingSettlementDate = new UnderlyingSettlementDateField();

    /**
     * Underlying Maturity Date
     */
    private final UnderlyingMaturityDateField underlyingMaturityDate = new UnderlyingMaturityDateField();

    /**
     * Related Trade Id
     */
    private final RelatedTradeIdField relatedTradeId = new RelatedTradeIdField();

    /**
     * Related Market Segment Id
     */
    private final RelatedMarketSegmentIdField relatedMarketSegmentId = new RelatedMarketSegmentIdField();

    /**
     * Trd Type
     */
    private final TrdTypeField trdType = new TrdTypeField();

    /**
     * Product Complex
     */
    private final ProductComplexField productComplex = new ProductComplexField();

    /**
     * Trade Report Type
     */
    private final TradeReportTypeField tradeReportType = new TradeReportTypeField();

    /**
     * Trade Publish Indicator
     */
    private final TradePublishIndicatorField tradePublishIndicator = new TradePublishIndicatorField();

    /**
     * No Side Allocs
     */
    private final NoSideAllocsField noSideAllocs = new NoSideAllocsField();

    /**
     * No Events
     */
    private final NoEventsField noEvents = new NoEventsField();

    /**
     * No Legs
     */
    private final NoLegsField noLegs = new NoLegsField();

    /**
     * No Instr Attrib
     */
    private final NoInstrAttribField noInstrAttrib = new NoInstrAttribField();

    /**
     * No Underlying Stips
     */
    private final NoUnderlyingStipsField noUnderlyingStips = new NoUnderlyingStipsField();

    /**
     * Party Id Settlement Location
     */
    private final PartyIdSettlementLocationField partyIdSettlementLocation = new PartyIdSettlementLocationField();

    /**
     * Hedge Type
     */
    private final HedgeTypeField hedgeType = new HedgeTypeField();

    /**
     * Swap Clearer
     */
    private final SwapClearerField swapClearer = new SwapClearerField();

    /**
     * Trade Report Text
     */
    private final TradeReportTextField tradeReportText = new TradeReportTextField();

    /**
     * Trade Report Id
     */
    private final TradeReportIdField tradeReportId = new TradeReportIdField();

    /**
     * Underlying Security Id
     */
    private final UnderlyingSecurityIdField underlyingSecurityId = new UnderlyingSecurityIdField();

    /**
     * Underlying Security Desc
     */
    private final UnderlyingSecurityDescField underlyingSecurityDesc = new UnderlyingSecurityDescField();

    /**
     * Underlying Currency
     */
    private final UnderlyingCurrencyField underlyingCurrency = new UnderlyingCurrencyField();

    /**
     * Underlying Issuer
     */
    private final UnderlyingIssuerField underlyingIssuer = new UnderlyingIssuerField();

    /**
     * Side Alloc Grp Comp
     */
    private final SideAllocGrpCompList sideAllocGrpComp = new SideAllocGrpCompList();

    /**
     * Trd Instrmnt Leg Grp Comp
     */
    private final TrdInstrmntLegGrpCompList trdInstrmntLegGrpComp = new TrdInstrmntLegGrpCompList();

    /**
     * Instrument Event Grp Comp
     */
    private final InstrumentEventGrpCompList instrumentEventGrpComp = new InstrumentEventGrpCompList();

    /**
     * Instrument Attribute Grp Comp
     */
    private final InstrumentAttributeGrpCompList instrumentAttributeGrpComp = new InstrumentAttributeGrpCompList();

    /**
     * Underlying Stip Grp Comp
     */
    private final UnderlyingStipGrpCompList underlyingStipGrpComp = new UnderlyingStipGrpCompList();

    /**
     * Request Header Comp
     */
    private final RequestHeaderComp requestHeaderComp = new RequestHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(networkMsgId), requestHeaderComp.fields(), List.<Field>of(securityId), List.<Field>of(lastPx), List.<Field>of(transBkdTime), List.<Field>of(underlyingPx), List.<Field>of(relatedClosePrice), List.<Field>of(relatedTradeQuantity), List.<Field>of(underlyingQty), List.<Field>of(compressionId), List.<Field>of(marketSegmentId), List.<Field>of(underlyingSettlementDate), List.<Field>of(underlyingMaturityDate), List.<Field>of(relatedTradeId), List.<Field>of(relatedMarketSegmentId), List.<Field>of(trdType), List.<Field>of(productComplex), List.<Field>of(tradeReportType), List.<Field>of(tradePublishIndicator), List.<Field>of(noSideAllocs), List.<Field>of(noEvents), List.<Field>of(noLegs), List.<Field>of(noInstrAttrib), List.<Field>of(noUnderlyingStips), List.<Field>of(partyIdSettlementLocation), List.<Field>of(hedgeType), List.<Field>of(swapClearer), List.<Field>of(tradeReportText), List.<Field>of(tradeReportId), List.<Field>of(underlyingSecurityId), List.<Field>of(underlyingSecurityDesc), List.<Field>of(underlyingCurrency), List.<Field>of(underlyingIssuer)).flatMap(List::stream).toList();

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
     * Security Id
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
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
     * Trans Bkd Time
     *
     * @return the TransBkdTime field
     */
    public TransBkdTimeField transBkdTime() {
        return transBkdTime;
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
     * Related Close Price
     *
     * @return the RelatedClosePrice field
     */
    public RelatedClosePriceField relatedClosePrice() {
        return relatedClosePrice;
    }

    /**
     * Related Trade Quantity
     *
     * @return the RelatedTradeQuantity field
     */
    public RelatedTradeQuantityField relatedTradeQuantity() {
        return relatedTradeQuantity;
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
     * Compression Id
     *
     * @return the CompressionId field
     */
    public CompressionIdField compressionId() {
        return compressionId;
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
     * Underlying Settlement Date
     *
     * @return the UnderlyingSettlementDate field
     */
    public UnderlyingSettlementDateField underlyingSettlementDate() {
        return underlyingSettlementDate;
    }

    /**
     * Underlying Maturity Date
     *
     * @return the UnderlyingMaturityDate field
     */
    public UnderlyingMaturityDateField underlyingMaturityDate() {
        return underlyingMaturityDate;
    }

    /**
     * Related Trade Id
     *
     * @return the RelatedTradeId field
     */
    public RelatedTradeIdField relatedTradeId() {
        return relatedTradeId;
    }

    /**
     * Related Market Segment Id
     *
     * @return the RelatedMarketSegmentId field
     */
    public RelatedMarketSegmentIdField relatedMarketSegmentId() {
        return relatedMarketSegmentId;
    }

    /**
     * Trd Type
     *
     * @return the TrdType field
     */
    public TrdTypeField trdType() {
        return trdType;
    }

    /**
     * Product Complex
     *
     * @return the ProductComplex field
     */
    public ProductComplexField productComplex() {
        return productComplex;
    }

    /**
     * Trade Report Type
     *
     * @return the TradeReportType field
     */
    public TradeReportTypeField tradeReportType() {
        return tradeReportType;
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
     * No Side Allocs
     *
     * @return the NoSideAllocs field
     */
    public NoSideAllocsField noSideAllocs() {
        return noSideAllocs;
    }

    /**
     * No Events
     *
     * @return the NoEvents field
     */
    public NoEventsField noEvents() {
        return noEvents;
    }

    /**
     * No Legs
     *
     * @return the NoLegs field
     */
    public NoLegsField noLegs() {
        return noLegs;
    }

    /**
     * No Instr Attrib
     *
     * @return the NoInstrAttrib field
     */
    public NoInstrAttribField noInstrAttrib() {
        return noInstrAttrib;
    }

    /**
     * No Underlying Stips
     *
     * @return the NoUnderlyingStips field
     */
    public NoUnderlyingStipsField noUnderlyingStips() {
        return noUnderlyingStips;
    }

    /**
     * Party Id Settlement Location
     *
     * @return the PartyIdSettlementLocation field
     */
    public PartyIdSettlementLocationField partyIdSettlementLocation() {
        return partyIdSettlementLocation;
    }

    /**
     * Hedge Type
     *
     * @return the HedgeType field
     */
    public HedgeTypeField hedgeType() {
        return hedgeType;
    }

    /**
     * Swap Clearer
     *
     * @return the SwapClearer field
     */
    public SwapClearerField swapClearer() {
        return swapClearer;
    }

    /**
     * Trade Report Text
     *
     * @return the TradeReportText field
     */
    public TradeReportTextField tradeReportText() {
        return tradeReportText;
    }

    /**
     * Trade Report Id
     *
     * @return the TradeReportId field
     */
    public TradeReportIdField tradeReportId() {
        return tradeReportId;
    }

    /**
     * Underlying Security Id
     *
     * @return the UnderlyingSecurityId field
     */
    public UnderlyingSecurityIdField underlyingSecurityId() {
        return underlyingSecurityId;
    }

    /**
     * Underlying Security Desc
     *
     * @return the UnderlyingSecurityDesc field
     */
    public UnderlyingSecurityDescField underlyingSecurityDesc() {
        return underlyingSecurityDesc;
    }

    /**
     * Underlying Currency
     *
     * @return the UnderlyingCurrency field
     */
    public UnderlyingCurrencyField underlyingCurrency() {
        return underlyingCurrency;
    }

    /**
     * Underlying Issuer
     *
     * @return the UnderlyingIssuer field
     */
    public UnderlyingIssuerField underlyingIssuer() {
        return underlyingIssuer;
    }

    /**
     * Side Alloc Grp Comp
     *
     * <p>Encode writes this list's size to the NoSideAllocs field.</p>
     *
     * @return the SideAllocGrpComp entries
     */
    public SideAllocGrpCompList sideAllocGrpComp() {
        return sideAllocGrpComp;
    }

    /**
     * Trd Instrmnt Leg Grp Comp
     *
     * <p>Encode writes this list's size to the NoLegs field.</p>
     *
     * @return the TrdInstrmntLegGrpComp entries
     */
    public TrdInstrmntLegGrpCompList trdInstrmntLegGrpComp() {
        return trdInstrmntLegGrpComp;
    }

    /**
     * Instrument Event Grp Comp
     *
     * <p>Encode writes this list's size to the NoEvents field.</p>
     *
     * @return the InstrumentEventGrpComp entries
     */
    public InstrumentEventGrpCompList instrumentEventGrpComp() {
        return instrumentEventGrpComp;
    }

    /**
     * Instrument Attribute Grp Comp
     *
     * <p>Encode writes this list's size to the NoInstrAttrib field.</p>
     *
     * @return the InstrumentAttributeGrpComp entries
     */
    public InstrumentAttributeGrpCompList instrumentAttributeGrpComp() {
        return instrumentAttributeGrpComp;
    }

    /**
     * Underlying Stip Grp Comp
     *
     * <p>Encode writes this list's size to the NoUnderlyingStips field.</p>
     *
     * @return the UnderlyingStipGrpComp entries
     */
    public UnderlyingStipGrpCompList underlyingStipGrpComp() {
        return underlyingStipGrpComp;
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
        return MINIMUM_BYTE_LENGTH + sideAllocGrpComp.byteLength() + trdInstrmntLegGrpComp.byteLength() + instrumentEventGrpComp.byteLength() + instrumentAttributeGrpComp.byteLength() + underlyingStipGrpComp.byteLength();
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
        cursor += 8;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 2;
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
        cursor += 20;
        cursor += 20;
        cursor += 12;
        cursor += 30;
        cursor += 3;
        cursor += 30;
        runs.add(cursor).add(4);
        cursor += 4;
        cursor = sideAllocGrpComp.padding(runs, cursor);
        cursor += trdInstrmntLegGrpComp.byteLength();
        cursor = instrumentEventGrpComp.padding(runs, cursor);
        cursor = instrumentAttributeGrpComp.padding(runs, cursor);
        cursor = underlyingStipGrpComp.padding(runs, cursor);
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(transBkdTime.value());
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
        if (!requestHeaderComp.parseFrom(data, cursor, end - 216)) {
            return false;
        }
        cursor += requestHeaderComp.byteLength();
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!lastPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxField.BYTE_LENGTH;
        if (!transBkdTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransBkdTimeField.BYTE_LENGTH;
        if (!underlyingPx.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingPxField.BYTE_LENGTH;
        if (!relatedClosePrice.parse(data, cursor)) {
            return false;
        }
        cursor += RelatedClosePriceField.BYTE_LENGTH;
        if (!relatedTradeQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += RelatedTradeQuantityField.BYTE_LENGTH;
        if (!underlyingQty.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingQtyField.BYTE_LENGTH;
        if (!compressionId.parse(data, cursor)) {
            return false;
        }
        cursor += CompressionIdField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!underlyingSettlementDate.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingSettlementDateField.BYTE_LENGTH;
        if (!underlyingMaturityDate.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingMaturityDateField.BYTE_LENGTH;
        if (!relatedTradeId.parse(data, cursor)) {
            return false;
        }
        cursor += RelatedTradeIdField.BYTE_LENGTH;
        if (!relatedMarketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += RelatedMarketSegmentIdField.BYTE_LENGTH;
        if (!trdType.parse(data, cursor)) {
            return false;
        }
        cursor += TrdTypeField.BYTE_LENGTH;
        if (!productComplex.parse(data, cursor)) {
            return false;
        }
        cursor += ProductComplexField.BYTE_LENGTH;
        if (!tradeReportType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReportTypeField.BYTE_LENGTH;
        if (!tradePublishIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += TradePublishIndicatorField.BYTE_LENGTH;
        if (!noSideAllocs.parse(data, cursor)) {
            return false;
        }
        cursor += NoSideAllocsField.BYTE_LENGTH;
        if (!noEvents.parse(data, cursor)) {
            return false;
        }
        cursor += NoEventsField.BYTE_LENGTH;
        if (!noLegs.parse(data, cursor)) {
            return false;
        }
        cursor += NoLegsField.BYTE_LENGTH;
        if (!noInstrAttrib.parse(data, cursor)) {
            return false;
        }
        cursor += NoInstrAttribField.BYTE_LENGTH;
        if (!noUnderlyingStips.parse(data, cursor)) {
            return false;
        }
        cursor += NoUnderlyingStipsField.BYTE_LENGTH;
        if (!partyIdSettlementLocation.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdSettlementLocationField.BYTE_LENGTH;
        if (!hedgeType.parse(data, cursor)) {
            return false;
        }
        cursor += HedgeTypeField.BYTE_LENGTH;
        if (!swapClearer.parse(data, cursor)) {
            return false;
        }
        cursor += SwapClearerField.BYTE_LENGTH;
        if (!tradeReportText.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReportTextField.BYTE_LENGTH;
        if (!tradeReportId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReportIdField.BYTE_LENGTH;
        if (!underlyingSecurityId.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingSecurityIdField.BYTE_LENGTH;
        if (!underlyingSecurityDesc.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingSecurityDescField.BYTE_LENGTH;
        if (!underlyingCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingCurrencyField.BYTE_LENGTH;
        if (!underlyingIssuer.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingIssuerField.BYTE_LENGTH;
        cursor += 4; // padding
        if (!sideAllocGrpComp.parse(data, cursor, end, noSideAllocs.value())) {
            return false;
        }
        cursor += sideAllocGrpComp.byteLength();
        if (end - cursor < 0) {
            return false;
        }
        if (!trdInstrmntLegGrpComp.parse(data, cursor, end, noLegs.value())) {
            return false;
        }
        cursor += trdInstrmntLegGrpComp.byteLength();
        if (end - cursor < 0) {
            return false;
        }
        if (!instrumentEventGrpComp.parse(data, cursor, end, noEvents.value())) {
            return false;
        }
        cursor += instrumentEventGrpComp.byteLength();
        if (end - cursor < 0) {
            return false;
        }
        if (!instrumentAttributeGrpComp.parse(data, cursor, end, noInstrAttrib.value())) {
            return false;
        }
        cursor += instrumentAttributeGrpComp.byteLength();
        if (end - cursor < 0) {
            return false;
        }
        if (!underlyingStipGrpComp.parse(data, cursor, end, noUnderlyingStips.value())) {
            return false;
        }
        cursor += underlyingStipGrpComp.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (sideAllocGrpComp.size() > 255) {
            throw new IllegalStateException("sideAllocGrpComp holds " + sideAllocGrpComp.size() + " entries, more than its count field can state");
        }
        if (trdInstrmntLegGrpComp.size() > 255) {
            throw new IllegalStateException("trdInstrmntLegGrpComp holds " + trdInstrmntLegGrpComp.size() + " entries, more than its count field can state");
        }
        if (instrumentEventGrpComp.size() > 255) {
            throw new IllegalStateException("instrumentEventGrpComp holds " + instrumentEventGrpComp.size() + " entries, more than its count field can state");
        }
        if (instrumentAttributeGrpComp.size() > 255) {
            throw new IllegalStateException("instrumentAttributeGrpComp holds " + instrumentAttributeGrpComp.size() + " entries, more than its count field can state");
        }
        if (underlyingStipGrpComp.size() > 255) {
            throw new IllegalStateException("underlyingStipGrpComp holds " + underlyingStipGrpComp.size() + " entries, more than its count field can state");
        }
        noSideAllocs.value((short) sideAllocGrpComp.size());
        noLegs.value((short) trdInstrmntLegGrpComp.size());
        noEvents.value((short) instrumentEventGrpComp.size());
        noInstrAttrib.value((short) instrumentAttributeGrpComp.size());
        noUnderlyingStips.value((short) underlyingStipGrpComp.size());
        int cursor = offset;
        cursor = networkMsgId.encode(data, cursor);
        if (buffer != null && buffer.length >= 10) {
            System.arraycopy(buffer, 8, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = requestHeaderComp.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = transBkdTime.encode(data, cursor);
        cursor = underlyingPx.encode(data, cursor);
        cursor = relatedClosePrice.encode(data, cursor);
        cursor = relatedTradeQuantity.encode(data, cursor);
        cursor = underlyingQty.encode(data, cursor);
        cursor = compressionId.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = underlyingSettlementDate.encode(data, cursor);
        cursor = underlyingMaturityDate.encode(data, cursor);
        cursor = relatedTradeId.encode(data, cursor);
        cursor = relatedMarketSegmentId.encode(data, cursor);
        cursor = trdType.encode(data, cursor);
        cursor = productComplex.encode(data, cursor);
        cursor = tradeReportType.encode(data, cursor);
        cursor = tradePublishIndicator.encode(data, cursor);
        cursor = noSideAllocs.encode(data, cursor);
        cursor = noEvents.encode(data, cursor);
        cursor = noLegs.encode(data, cursor);
        cursor = noInstrAttrib.encode(data, cursor);
        cursor = noUnderlyingStips.encode(data, cursor);
        cursor = partyIdSettlementLocation.encode(data, cursor);
        cursor = hedgeType.encode(data, cursor);
        cursor = swapClearer.encode(data, cursor);
        cursor = tradeReportText.encode(data, cursor);
        cursor = tradeReportId.encode(data, cursor);
        cursor = underlyingSecurityId.encode(data, cursor);
        cursor = underlyingSecurityDesc.encode(data, cursor);
        cursor = underlyingCurrency.encode(data, cursor);
        cursor = underlyingIssuer.encode(data, cursor);
        if (buffer != null && buffer.length >= 234) {
            System.arraycopy(buffer, 230, data, cursor, 4); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 4, (byte) 0); // padding
        }
        cursor += 4;
        cursor = sideAllocGrpComp.encode(data, cursor);
        cursor = trdInstrmntLegGrpComp.encode(data, cursor);
        cursor = instrumentEventGrpComp.encode(data, cursor);
        cursor = instrumentAttributeGrpComp.encode(data, cursor);
        cursor = underlyingStipGrpComp.encode(data, cursor);
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
        sideAllocGrpComp.clear();
        trdInstrmntLegGrpComp.clear();
        instrumentEventGrpComp.clear();
        instrumentAttributeGrpComp.clear();
        underlyingStipGrpComp.clear();
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
            if (field != noSideAllocs && field != noLegs && field != noEvents && field != noInstrAttrib && field != noUnderlyingStips && !field.isRecognized()) {
                return false;
            }
        }
        if (!sideAllocGrpComp.isRecognized()) {
            return false;
        }
        if (!trdInstrmntLegGrpComp.isRecognized()) {
            return false;
        }
        if (!instrumentEventGrpComp.isRecognized()) {
            return false;
        }
        if (!instrumentAttributeGrpComp.isRecognized()) {
            return false;
        }
        return underlyingStipGrpComp.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noSideAllocs && field != noLegs && field != noEvents && field != noInstrAttrib && field != noUnderlyingStips && !field.isValid()) {
                return false;
            }
        }
        if (!sideAllocGrpComp.isValid()) {
            return false;
        }
        if (!trdInstrmntLegGrpComp.isValid()) {
            return false;
        }
        if (!instrumentEventGrpComp.isValid()) {
            return false;
        }
        if (!instrumentAttributeGrpComp.isValid()) {
            return false;
        }
        if (!underlyingStipGrpComp.isValid()) {
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
        if (!securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (!lastPx.isDecoded()) {
            return Optional.of(lastPx);
        }
        if (!transBkdTime.isDecoded()) {
            return Optional.of(transBkdTime);
        }
        if (!underlyingPx.isDecoded()) {
            return Optional.of(underlyingPx);
        }
        if (!relatedClosePrice.isDecoded()) {
            return Optional.of(relatedClosePrice);
        }
        if (!relatedTradeQuantity.isDecoded()) {
            return Optional.of(relatedTradeQuantity);
        }
        if (!underlyingQty.isDecoded()) {
            return Optional.of(underlyingQty);
        }
        if (!compressionId.isDecoded()) {
            return Optional.of(compressionId);
        }
        if (!marketSegmentId.isDecoded()) {
            return Optional.of(marketSegmentId);
        }
        if (!underlyingSettlementDate.isDecoded()) {
            return Optional.of(underlyingSettlementDate);
        }
        if (!underlyingMaturityDate.isDecoded()) {
            return Optional.of(underlyingMaturityDate);
        }
        if (!relatedTradeId.isDecoded()) {
            return Optional.of(relatedTradeId);
        }
        if (!relatedMarketSegmentId.isDecoded()) {
            return Optional.of(relatedMarketSegmentId);
        }
        if (!trdType.isDecoded()) {
            return Optional.of(trdType);
        }
        if (!productComplex.isDecoded()) {
            return Optional.of(productComplex);
        }
        if (!tradeReportType.isDecoded()) {
            return Optional.of(tradeReportType);
        }
        if (!tradePublishIndicator.isDecoded()) {
            return Optional.of(tradePublishIndicator);
        }
        if (!noSideAllocs.isDecoded()) {
            return Optional.of(noSideAllocs);
        }
        if (!noEvents.isDecoded()) {
            return Optional.of(noEvents);
        }
        if (!noLegs.isDecoded()) {
            return Optional.of(noLegs);
        }
        if (!noInstrAttrib.isDecoded()) {
            return Optional.of(noInstrAttrib);
        }
        if (!noUnderlyingStips.isDecoded()) {
            return Optional.of(noUnderlyingStips);
        }
        if (!partyIdSettlementLocation.isDecoded()) {
            return Optional.of(partyIdSettlementLocation);
        }
        if (!hedgeType.isDecoded()) {
            return Optional.of(hedgeType);
        }
        if (!swapClearer.isDecoded()) {
            return Optional.of(swapClearer);
        }
        if (!tradeReportText.isDecoded()) {
            return Optional.of(tradeReportText);
        }
        if (!tradeReportId.isDecoded()) {
            return Optional.of(tradeReportId);
        }
        if (!underlyingSecurityId.isDecoded()) {
            return Optional.of(underlyingSecurityId);
        }
        if (!underlyingSecurityDesc.isDecoded()) {
            return Optional.of(underlyingSecurityDesc);
        }
        if (!underlyingCurrency.isDecoded()) {
            return Optional.of(underlyingCurrency);
        }
        if (!underlyingIssuer.isDecoded()) {
            return Optional.of(underlyingIssuer);
        }
        if (!sideAllocGrpComp.isDecoded()) {
            return Optional.of(sideAllocGrpComp.failedEntry().flatMap(SideAllocGrpCompEntry::failedAt).orElse(noSideAllocs));
        }
        if (!trdInstrmntLegGrpComp.isDecoded()) {
            return Optional.of(trdInstrmntLegGrpComp.failedEntry().flatMap(TrdInstrmntLegGrpCompEntry::failedAt).orElse(noLegs));
        }
        if (!instrumentEventGrpComp.isDecoded()) {
            return Optional.of(instrumentEventGrpComp.failedEntry().flatMap(InstrumentEventGrpCompEntry::failedAt).orElse(noEvents));
        }
        if (!instrumentAttributeGrpComp.isDecoded()) {
            return Optional.of(instrumentAttributeGrpComp.failedEntry().flatMap(InstrumentAttributeGrpCompEntry::failedAt).orElse(noInstrAttrib));
        }
        if (!underlyingStipGrpComp.isDecoded()) {
            return Optional.of(underlyingStipGrpComp.failedEntry().flatMap(UnderlyingStipGrpCompEntry::failedAt).orElse(noUnderlyingStips));
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
            case "SecurityId" -> Optional.of(securityId);
            case "LastPx" -> Optional.of(lastPx);
            case "TransBkdTime" -> Optional.of(transBkdTime);
            case "UnderlyingPx" -> Optional.of(underlyingPx);
            case "RelatedClosePrice" -> Optional.of(relatedClosePrice);
            case "RelatedTradeQuantity" -> Optional.of(relatedTradeQuantity);
            case "UnderlyingQty" -> Optional.of(underlyingQty);
            case "CompressionId" -> Optional.of(compressionId);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "UnderlyingSettlementDate" -> Optional.of(underlyingSettlementDate);
            case "UnderlyingMaturityDate" -> Optional.of(underlyingMaturityDate);
            case "RelatedTradeId" -> Optional.of(relatedTradeId);
            case "RelatedMarketSegmentId" -> Optional.of(relatedMarketSegmentId);
            case "TrdType" -> Optional.of(trdType);
            case "ProductComplex" -> Optional.of(productComplex);
            case "TradeReportType" -> Optional.of(tradeReportType);
            case "TradePublishIndicator" -> Optional.of(tradePublishIndicator);
            case "NoSideAllocs" -> Optional.of(noSideAllocs);
            case "NoEvents" -> Optional.of(noEvents);
            case "NoLegs" -> Optional.of(noLegs);
            case "NoInstrAttrib" -> Optional.of(noInstrAttrib);
            case "NoUnderlyingStips" -> Optional.of(noUnderlyingStips);
            case "PartyIdSettlementLocation" -> Optional.of(partyIdSettlementLocation);
            case "HedgeType" -> Optional.of(hedgeType);
            case "SwapClearer" -> Optional.of(swapClearer);
            case "TradeReportText" -> Optional.of(tradeReportText);
            case "TradeReportId" -> Optional.of(tradeReportId);
            case "UnderlyingSecurityId" -> Optional.of(underlyingSecurityId);
            case "UnderlyingSecurityDesc" -> Optional.of(underlyingSecurityDesc);
            case "UnderlyingCurrency" -> Optional.of(underlyingCurrency);
            case "UnderlyingIssuer" -> Optional.of(underlyingIssuer);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof EnterTesTradeRequest message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(sideAllocGrpComp.diffFields(message.sideAllocGrpComp));
        changed.addAll(trdInstrmntLegGrpComp.diffFields(message.trdInstrmntLegGrpComp));
        changed.addAll(instrumentEventGrpComp.diffFields(message.instrumentEventGrpComp));
        changed.addAll(instrumentAttributeGrpComp.diffFields(message.instrumentAttributeGrpComp));
        changed.addAll(underlyingStipGrpComp.diffFields(message.underlyingStipGrpComp));
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
            sideAllocGrpComp.toFormattedString(builder, options);
            builder.append(", ");
            trdInstrmntLegGrpComp.toFormattedString(builder, options);
            builder.append(", ");
            instrumentEventGrpComp.toFormattedString(builder, options);
            builder.append(", ");
            instrumentAttributeGrpComp.toFormattedString(builder, options);
            builder.append(", ");
            underlyingStipGrpComp.toFormattedString(builder, options);
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
        sideAllocGrpComp.toFormattedString(builder, nested);
        trdInstrmntLegGrpComp.toFormattedString(builder, nested);
        instrumentEventGrpComp.toFormattedString(builder, nested);
        instrumentAttributeGrpComp.toFormattedString(builder, nested);
        underlyingStipGrpComp.toFormattedString(builder, nested);
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
        if (!(other instanceof EnterTesTradeRequest message)) {
            return false;
        }
        return fields.equals(message.fields) && sideAllocGrpComp.equals(message.sideAllocGrpComp) && trdInstrmntLegGrpComp.equals(message.trdInstrmntLegGrpComp) && instrumentEventGrpComp.equals(message.instrumentEventGrpComp) && instrumentAttributeGrpComp.equals(message.instrumentAttributeGrpComp) && underlyingStipGrpComp.equals(message.underlyingStipGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, sideAllocGrpComp, trdInstrmntLegGrpComp, instrumentEventGrpComp, instrumentAttributeGrpComp, underlyingStipGrpComp);
    }
}
