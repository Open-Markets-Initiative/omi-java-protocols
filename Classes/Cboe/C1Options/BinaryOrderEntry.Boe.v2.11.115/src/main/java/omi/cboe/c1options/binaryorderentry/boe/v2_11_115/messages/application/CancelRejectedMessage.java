package omi.cboe.c1options.binaryorderentry.boe.v2_11_115.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.AllocQtyField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.AuctionIdField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CancelRejectReasonField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CancelRejectedReturnBitfield10Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CancelRejectedReturnBitfield11Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CancelRejectedReturnBitfield12Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CancelRejectedReturnBitfield13Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CancelRejectedReturnBitfield14Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CancelRejectedReturnBitfield15Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CancelRejectedReturnBitfield16Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CancelRejectedReturnBitfield17Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CancelRejectedReturnBitfield18Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CancelRejectedReturnBitfield19Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CancelRejectedReturnBitfield1Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CancelRejectedReturnBitfield2Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CancelRejectedReturnBitfield3Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CancelRejectedReturnBitfield4Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CancelRejectedReturnBitfield5Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CancelRejectedReturnBitfield6Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CancelRejectedReturnBitfield7Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CancelRejectedReturnBitfield8Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CancelRejectedReturnBitfield9Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CapacityField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.ClOrdIdField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.ClearingOptionalDataField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CmtaNumberField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CorrectedSizeField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CrossExclusionIndicatorField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CrossIdField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.EchoTextField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.ExecInstField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.GiveUpFirmIdField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.MarketingFeeCodeField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.MassCancelIdField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.MaturityDateField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.MinQtyField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.NumberOfReturnBitfieldsField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.OpenCloseField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.OrdTypeField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.PriceBinaryPriceField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.PutOrCallField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.RoutingFirmIdField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.SideField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.StopPxField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.StopPxTypeField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.StrikePriceField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.SymbolAlphanumericField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.TargetPartyIdField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.TextField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.TimeInForceField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.TransactionTimeField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.types.Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.types.Message;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.types.PrintOptions;

/**
 * Represents the CancelRejectedMessage message from the BinaryOrderEntry protocol.
 *
 * <p>Cancel Rejected Message.</p>
 */
public final class CancelRejectedMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 91;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Cancel Rejected Message";

    /**
     * Report send time (for audit).
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, pipe, the ‘at’ symbol (@) and double quotes. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders, which includes long-lived, persisting GTC/GTD orders. However, we strongly recommend that you keep your ClOrdID values unique.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Reason for the order cancellation. See Order Reason Codes for a list of possible reasons.
     */
    private final CancelRejectReasonField cancelRejectReason = new CancelRejectReasonField();

    /**
     * Human readable text with more information about the reject reason.
     */
    private final TextField text = new TextField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfReturnBitfieldsField numberOfReturnBitfields = new NumberOfReturnBitfieldsField();

    /**
     * BitSet CancelRejected byte 1.
     */
    private final CancelRejectedReturnBitfield1Field cancelRejectedReturnBitfield1 = new CancelRejectedReturnBitfield1Field();

    /**
     * BitSet CancelRejected byte 2.
     */
    private final CancelRejectedReturnBitfield2Field cancelRejectedReturnBitfield2 = new CancelRejectedReturnBitfield2Field();

    /**
     * BitSet CancelRejected byte 3.
     */
    private final CancelRejectedReturnBitfield3Field cancelRejectedReturnBitfield3 = new CancelRejectedReturnBitfield3Field();

    /**
     * BitSet CancelRejected byte 4.
     */
    private final CancelRejectedReturnBitfield4Field cancelRejectedReturnBitfield4 = new CancelRejectedReturnBitfield4Field();

    /**
     * BitSet CancelRejected byte 5.
     */
    private final CancelRejectedReturnBitfield5Field cancelRejectedReturnBitfield5 = new CancelRejectedReturnBitfield5Field();

    /**
     * BitSet CancelRejected byte 6.
     */
    private final CancelRejectedReturnBitfield6Field cancelRejectedReturnBitfield6 = new CancelRejectedReturnBitfield6Field();

    /**
     * BitSet CancelRejected byte 7.
     */
    private final CancelRejectedReturnBitfield7Field cancelRejectedReturnBitfield7 = new CancelRejectedReturnBitfield7Field();

    /**
     * BitSet CancelRejected byte 8.
     */
    private final CancelRejectedReturnBitfield8Field cancelRejectedReturnBitfield8 = new CancelRejectedReturnBitfield8Field();

    /**
     * BitSet CancelRejected byte 9.
     */
    private final CancelRejectedReturnBitfield9Field cancelRejectedReturnBitfield9 = new CancelRejectedReturnBitfield9Field();

    /**
     * BitSet CancelRejected byte 10.
     */
    private final CancelRejectedReturnBitfield10Field cancelRejectedReturnBitfield10 = new CancelRejectedReturnBitfield10Field();

    /**
     * BitSet CancelRejected byte 11.
     */
    private final CancelRejectedReturnBitfield11Field cancelRejectedReturnBitfield11 = new CancelRejectedReturnBitfield11Field();

    /**
     * BitSet CancelRejected byte 12.
     */
    private final CancelRejectedReturnBitfield12Field cancelRejectedReturnBitfield12 = new CancelRejectedReturnBitfield12Field();

    /**
     * BitSet CancelRejected byte 13.
     */
    private final CancelRejectedReturnBitfield13Field cancelRejectedReturnBitfield13 = new CancelRejectedReturnBitfield13Field();

    /**
     * BitSet CancelRejected byte 14.
     */
    private final CancelRejectedReturnBitfield14Field cancelRejectedReturnBitfield14 = new CancelRejectedReturnBitfield14Field();

    /**
     * BitSet CancelRejected byte 15.
     */
    private final CancelRejectedReturnBitfield15Field cancelRejectedReturnBitfield15 = new CancelRejectedReturnBitfield15Field();

    /**
     * BitSet CancelRejected byte 16.
     */
    private final CancelRejectedReturnBitfield16Field cancelRejectedReturnBitfield16 = new CancelRejectedReturnBitfield16Field();

    /**
     * BitSet CancelRejected byte 17.
     */
    private final CancelRejectedReturnBitfield17Field cancelRejectedReturnBitfield17 = new CancelRejectedReturnBitfield17Field();

    /**
     * BitSet CancelRejected byte 18.
     */
    private final CancelRejectedReturnBitfield18Field cancelRejectedReturnBitfield18 = new CancelRejectedReturnBitfield18Field();

    /**
     * BitSet CancelRejected byte 19.
     */
    private final CancelRejectedReturnBitfield19Field cancelRejectedReturnBitfield19 = new CancelRejectedReturnBitfield19Field();

    /**
     * Corresponds to Side (54) in Cboe FIX. 1 = Buy 2 = Sell
     */
    private final SideField side = new SideField();

    /**
     * Price Binary Price
     */
    private final PriceBinaryPriceField priceBinaryPrice = new PriceBinaryPriceField();

    /**
     * Exec Inst
     */
    private final ExecInstField execInst = new ExecInstField();

    /**
     * Ord Type
     */
    private final OrdTypeField ordType = new OrdTypeField();

    /**
     * Time In Force
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * Min Qty
     */
    private final MinQtyField minQty = new MinQtyField();

    /**
     * Symbol Alphanumeric
     */
    private final SymbolAlphanumericField symbolAlphanumeric = new SymbolAlphanumericField();

    /**
     * Capacity
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * Maturity Date
     */
    private final MaturityDateField maturityDate = new MaturityDateField();

    /**
     * Strike Price
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * Put Or Call
     */
    private final PutOrCallField putOrCall = new PutOrCallField();

    /**
     * Open Close
     */
    private final OpenCloseField openClose = new OpenCloseField();

    /**
     * Corrected Size
     */
    private final CorrectedSizeField correctedSize = new CorrectedSizeField();

    /**
     * Echo Text
     */
    private final EchoTextField echoText = new EchoTextField();

    /**
     * Stop Px
     */
    private final StopPxField stopPx = new StopPxField();

    /**
     * Marketing Fee Code
     */
    private final MarketingFeeCodeField marketingFeeCode = new MarketingFeeCodeField();

    /**
     * Target Party Id
     */
    private final TargetPartyIdField targetPartyId = new TargetPartyIdField();

    /**
     * Auction Id
     */
    private final AuctionIdField auctionId = new AuctionIdField();

    /**
     * Cmta Number
     */
    private final CmtaNumberField cmtaNumber = new CmtaNumberField();

    /**
     * Corresponds to CrossID (548) in Cboe FIX. Day-unique identifier for the cross order chosen by the client. Characters in the ASCII range 33- 126 are allowed, except for comma, semicolon, pipe, the ‘at’ symbol and double quotes.
     */
    private final CrossIdField crossId = new CrossIdField();

    /**
     * Alloc Qty
     */
    private final AllocQtyField allocQty = new AllocQtyField();

    /**
     * Give Up Firm Id
     */
    private final GiveUpFirmIdField giveUpFirmId = new GiveUpFirmIdField();

    /**
     * Routing Firm Id
     */
    private final RoutingFirmIdField routingFirmId = new RoutingFirmIdField();

    /**
     * Cross Exclusion Indicator
     */
    private final CrossExclusionIndicatorField crossExclusionIndicator = new CrossExclusionIndicatorField();

    /**
     * Clearing Optional Data
     */
    private final ClearingOptionalDataField clearingOptionalData = new ClearingOptionalDataField();

    /**
     * Mass Cancel Id
     */
    private final MassCancelIdField massCancelId = new MassCancelIdField();

    /**
     * Stop Px Type
     */
    private final StopPxTypeField stopPxType = new StopPxTypeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, clOrdId, cancelRejectReason, text, numberOfReturnBitfields, cancelRejectedReturnBitfield1, cancelRejectedReturnBitfield2, cancelRejectedReturnBitfield3, cancelRejectedReturnBitfield4, cancelRejectedReturnBitfield5, cancelRejectedReturnBitfield6, cancelRejectedReturnBitfield7, cancelRejectedReturnBitfield8, cancelRejectedReturnBitfield9, cancelRejectedReturnBitfield10, cancelRejectedReturnBitfield11, cancelRejectedReturnBitfield12, cancelRejectedReturnBitfield13, cancelRejectedReturnBitfield14, cancelRejectedReturnBitfield15, cancelRejectedReturnBitfield16, cancelRejectedReturnBitfield17, cancelRejectedReturnBitfield18, cancelRejectedReturnBitfield19, side, priceBinaryPrice, execInst, ordType, timeInForce, minQty, symbolAlphanumeric, capacity, maturityDate, strikePrice, putOrCall, openClose, correctedSize, echoText, stopPx, marketingFeeCode, targetPartyId, auctionId, cmtaNumber, crossId, allocQty, giveUpFirmId, routingFirmId, crossExclusionIndicator, clearingOptionalData, massCancelId, stopPxType);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Report send time (for audit).
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, pipe, the ‘at’ symbol (@) and double quotes. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders, which includes long-lived, persisting GTC/GTD orders. However, we strongly recommend that you keep your ClOrdID values unique.
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Reason for the order cancellation. See Order Reason Codes for a list of possible reasons.
     *
     * @return the CancelRejectReason field
     */
    public CancelRejectReasonField cancelRejectReason() {
        return cancelRejectReason;
    }

    /**
     * Human readable text with more information about the reject reason.
     *
     * @return the Text field
     */
    public TextField text() {
        return text;
    }

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     *
     * @return the NumberOfReturnBitfields field
     */
    public NumberOfReturnBitfieldsField numberOfReturnBitfields() {
        return numberOfReturnBitfields;
    }

    /**
     * BitSet CancelRejected byte 1.
     *
     * @return the CancelRejectedReturnBitfield1 field
     */
    public CancelRejectedReturnBitfield1Field cancelRejectedReturnBitfield1() {
        return cancelRejectedReturnBitfield1;
    }

    /**
     * BitSet CancelRejected byte 2.
     *
     * @return the CancelRejectedReturnBitfield2 field
     */
    public CancelRejectedReturnBitfield2Field cancelRejectedReturnBitfield2() {
        return cancelRejectedReturnBitfield2;
    }

    /**
     * BitSet CancelRejected byte 3.
     *
     * @return the CancelRejectedReturnBitfield3 field
     */
    public CancelRejectedReturnBitfield3Field cancelRejectedReturnBitfield3() {
        return cancelRejectedReturnBitfield3;
    }

    /**
     * BitSet CancelRejected byte 4.
     *
     * @return the CancelRejectedReturnBitfield4 field
     */
    public CancelRejectedReturnBitfield4Field cancelRejectedReturnBitfield4() {
        return cancelRejectedReturnBitfield4;
    }

    /**
     * BitSet CancelRejected byte 5.
     *
     * @return the CancelRejectedReturnBitfield5 field
     */
    public CancelRejectedReturnBitfield5Field cancelRejectedReturnBitfield5() {
        return cancelRejectedReturnBitfield5;
    }

    /**
     * BitSet CancelRejected byte 6.
     *
     * @return the CancelRejectedReturnBitfield6 field
     */
    public CancelRejectedReturnBitfield6Field cancelRejectedReturnBitfield6() {
        return cancelRejectedReturnBitfield6;
    }

    /**
     * BitSet CancelRejected byte 7.
     *
     * @return the CancelRejectedReturnBitfield7 field
     */
    public CancelRejectedReturnBitfield7Field cancelRejectedReturnBitfield7() {
        return cancelRejectedReturnBitfield7;
    }

    /**
     * BitSet CancelRejected byte 8.
     *
     * @return the CancelRejectedReturnBitfield8 field
     */
    public CancelRejectedReturnBitfield8Field cancelRejectedReturnBitfield8() {
        return cancelRejectedReturnBitfield8;
    }

    /**
     * BitSet CancelRejected byte 9.
     *
     * @return the CancelRejectedReturnBitfield9 field
     */
    public CancelRejectedReturnBitfield9Field cancelRejectedReturnBitfield9() {
        return cancelRejectedReturnBitfield9;
    }

    /**
     * BitSet CancelRejected byte 10.
     *
     * @return the CancelRejectedReturnBitfield10 field
     */
    public CancelRejectedReturnBitfield10Field cancelRejectedReturnBitfield10() {
        return cancelRejectedReturnBitfield10;
    }

    /**
     * BitSet CancelRejected byte 11.
     *
     * @return the CancelRejectedReturnBitfield11 field
     */
    public CancelRejectedReturnBitfield11Field cancelRejectedReturnBitfield11() {
        return cancelRejectedReturnBitfield11;
    }

    /**
     * BitSet CancelRejected byte 12.
     *
     * @return the CancelRejectedReturnBitfield12 field
     */
    public CancelRejectedReturnBitfield12Field cancelRejectedReturnBitfield12() {
        return cancelRejectedReturnBitfield12;
    }

    /**
     * BitSet CancelRejected byte 13.
     *
     * @return the CancelRejectedReturnBitfield13 field
     */
    public CancelRejectedReturnBitfield13Field cancelRejectedReturnBitfield13() {
        return cancelRejectedReturnBitfield13;
    }

    /**
     * BitSet CancelRejected byte 14.
     *
     * @return the CancelRejectedReturnBitfield14 field
     */
    public CancelRejectedReturnBitfield14Field cancelRejectedReturnBitfield14() {
        return cancelRejectedReturnBitfield14;
    }

    /**
     * BitSet CancelRejected byte 15.
     *
     * @return the CancelRejectedReturnBitfield15 field
     */
    public CancelRejectedReturnBitfield15Field cancelRejectedReturnBitfield15() {
        return cancelRejectedReturnBitfield15;
    }

    /**
     * BitSet CancelRejected byte 16.
     *
     * @return the CancelRejectedReturnBitfield16 field
     */
    public CancelRejectedReturnBitfield16Field cancelRejectedReturnBitfield16() {
        return cancelRejectedReturnBitfield16;
    }

    /**
     * BitSet CancelRejected byte 17.
     *
     * @return the CancelRejectedReturnBitfield17 field
     */
    public CancelRejectedReturnBitfield17Field cancelRejectedReturnBitfield17() {
        return cancelRejectedReturnBitfield17;
    }

    /**
     * BitSet CancelRejected byte 18.
     *
     * @return the CancelRejectedReturnBitfield18 field
     */
    public CancelRejectedReturnBitfield18Field cancelRejectedReturnBitfield18() {
        return cancelRejectedReturnBitfield18;
    }

    /**
     * BitSet CancelRejected byte 19.
     *
     * @return the CancelRejectedReturnBitfield19 field
     */
    public CancelRejectedReturnBitfield19Field cancelRejectedReturnBitfield19() {
        return cancelRejectedReturnBitfield19;
    }

    /**
     * Corresponds to Side (54) in Cboe FIX. 1 = Buy 2 = Sell
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Price Binary Price
     *
     * @return the PriceBinaryPrice field
     */
    public PriceBinaryPriceField priceBinaryPrice() {
        return priceBinaryPrice;
    }

    /**
     * Exec Inst
     *
     * @return the ExecInst field
     */
    public ExecInstField execInst() {
        return execInst;
    }

    /**
     * Ord Type
     *
     * @return the OrdType field
     */
    public OrdTypeField ordType() {
        return ordType;
    }

    /**
     * Time In Force
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
    }

    /**
     * Min Qty
     *
     * @return the MinQty field
     */
    public MinQtyField minQty() {
        return minQty;
    }

    /**
     * Symbol Alphanumeric
     *
     * @return the SymbolAlphanumeric field
     */
    public SymbolAlphanumericField symbolAlphanumeric() {
        return symbolAlphanumeric;
    }

    /**
     * Capacity
     *
     * @return the Capacity field
     */
    public CapacityField capacity() {
        return capacity;
    }

    /**
     * Maturity Date
     *
     * @return the MaturityDate field
     */
    public MaturityDateField maturityDate() {
        return maturityDate;
    }

    /**
     * Strike Price
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * Put Or Call
     *
     * @return the PutOrCall field
     */
    public PutOrCallField putOrCall() {
        return putOrCall;
    }

    /**
     * Open Close
     *
     * @return the OpenClose field
     */
    public OpenCloseField openClose() {
        return openClose;
    }

    /**
     * Corrected Size
     *
     * @return the CorrectedSize field
     */
    public CorrectedSizeField correctedSize() {
        return correctedSize;
    }

    /**
     * Echo Text
     *
     * @return the EchoText field
     */
    public EchoTextField echoText() {
        return echoText;
    }

    /**
     * Stop Px
     *
     * @return the StopPx field
     */
    public StopPxField stopPx() {
        return stopPx;
    }

    /**
     * Marketing Fee Code
     *
     * @return the MarketingFeeCode field
     */
    public MarketingFeeCodeField marketingFeeCode() {
        return marketingFeeCode;
    }

    /**
     * Target Party Id
     *
     * @return the TargetPartyId field
     */
    public TargetPartyIdField targetPartyId() {
        return targetPartyId;
    }

    /**
     * Auction Id
     *
     * @return the AuctionId field
     */
    public AuctionIdField auctionId() {
        return auctionId;
    }

    /**
     * Cmta Number
     *
     * @return the CmtaNumber field
     */
    public CmtaNumberField cmtaNumber() {
        return cmtaNumber;
    }

    /**
     * Corresponds to CrossID (548) in Cboe FIX. Day-unique identifier for the cross order chosen by the client. Characters in the ASCII range 33- 126 are allowed, except for comma, semicolon, pipe, the ‘at’ symbol and double quotes.
     *
     * @return the CrossId field
     */
    public CrossIdField crossId() {
        return crossId;
    }

    /**
     * Alloc Qty
     *
     * @return the AllocQty field
     */
    public AllocQtyField allocQty() {
        return allocQty;
    }

    /**
     * Give Up Firm Id
     *
     * @return the GiveUpFirmId field
     */
    public GiveUpFirmIdField giveUpFirmId() {
        return giveUpFirmId;
    }

    /**
     * Routing Firm Id
     *
     * @return the RoutingFirmId field
     */
    public RoutingFirmIdField routingFirmId() {
        return routingFirmId;
    }

    /**
     * Cross Exclusion Indicator
     *
     * @return the CrossExclusionIndicator field
     */
    public CrossExclusionIndicatorField crossExclusionIndicator() {
        return crossExclusionIndicator;
    }

    /**
     * Clearing Optional Data
     *
     * @return the ClearingOptionalData field
     */
    public ClearingOptionalDataField clearingOptionalData() {
        return clearingOptionalData;
    }

    /**
     * Mass Cancel Id
     *
     * @return the MassCancelId field
     */
    public MassCancelIdField massCancelId() {
        return massCancelId;
    }

    /**
     * Stop Px Type
     *
     * @return the StopPxType field
     */
    public StopPxTypeField stopPxType() {
        return stopPxType;
    }

    /**
     * Returns whether the fields before the CancelRejectedReturnBitfield1 put it on the wire.
     *
     * <p>Decode reads the CancelRejectedReturnBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelRejectedReturnBitfield1 is on the wire
     */
    public boolean cancelRejectedReturnBitfield1Present() {
        return numberOfReturnBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the CancelRejectedReturnBitfield2 put it on the wire.
     *
     * <p>Decode reads the CancelRejectedReturnBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelRejectedReturnBitfield2 is on the wire
     */
    public boolean cancelRejectedReturnBitfield2Present() {
        return numberOfReturnBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the CancelRejectedReturnBitfield3 put it on the wire.
     *
     * <p>Decode reads the CancelRejectedReturnBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelRejectedReturnBitfield3 is on the wire
     */
    public boolean cancelRejectedReturnBitfield3Present() {
        return numberOfReturnBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the CancelRejectedReturnBitfield4 put it on the wire.
     *
     * <p>Decode reads the CancelRejectedReturnBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelRejectedReturnBitfield4 is on the wire
     */
    public boolean cancelRejectedReturnBitfield4Present() {
        return numberOfReturnBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the CancelRejectedReturnBitfield5 put it on the wire.
     *
     * <p>Decode reads the CancelRejectedReturnBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelRejectedReturnBitfield5 is on the wire
     */
    public boolean cancelRejectedReturnBitfield5Present() {
        return numberOfReturnBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the CancelRejectedReturnBitfield6 put it on the wire.
     *
     * <p>Decode reads the CancelRejectedReturnBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelRejectedReturnBitfield6 is on the wire
     */
    public boolean cancelRejectedReturnBitfield6Present() {
        return numberOfReturnBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the CancelRejectedReturnBitfield7 put it on the wire.
     *
     * <p>Decode reads the CancelRejectedReturnBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelRejectedReturnBitfield7 is on the wire
     */
    public boolean cancelRejectedReturnBitfield7Present() {
        return numberOfReturnBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the CancelRejectedReturnBitfield8 put it on the wire.
     *
     * <p>Decode reads the CancelRejectedReturnBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelRejectedReturnBitfield8 is on the wire
     */
    public boolean cancelRejectedReturnBitfield8Present() {
        return numberOfReturnBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the CancelRejectedReturnBitfield9 put it on the wire.
     *
     * <p>Decode reads the CancelRejectedReturnBitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelRejectedReturnBitfield9 is on the wire
     */
    public boolean cancelRejectedReturnBitfield9Present() {
        return numberOfReturnBitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the CancelRejectedReturnBitfield10 put it on the wire.
     *
     * <p>Decode reads the CancelRejectedReturnBitfield10 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelRejectedReturnBitfield10 is on the wire
     */
    public boolean cancelRejectedReturnBitfield10Present() {
        return numberOfReturnBitfields.value() >= 10L;
    }

    /**
     * Returns whether the fields before the CancelRejectedReturnBitfield11 put it on the wire.
     *
     * <p>Decode reads the CancelRejectedReturnBitfield11 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelRejectedReturnBitfield11 is on the wire
     */
    public boolean cancelRejectedReturnBitfield11Present() {
        return numberOfReturnBitfields.value() >= 11L;
    }

    /**
     * Returns whether the fields before the CancelRejectedReturnBitfield12 put it on the wire.
     *
     * <p>Decode reads the CancelRejectedReturnBitfield12 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelRejectedReturnBitfield12 is on the wire
     */
    public boolean cancelRejectedReturnBitfield12Present() {
        return numberOfReturnBitfields.value() >= 12L;
    }

    /**
     * Returns whether the fields before the CancelRejectedReturnBitfield13 put it on the wire.
     *
     * <p>Decode reads the CancelRejectedReturnBitfield13 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelRejectedReturnBitfield13 is on the wire
     */
    public boolean cancelRejectedReturnBitfield13Present() {
        return numberOfReturnBitfields.value() >= 13L;
    }

    /**
     * Returns whether the fields before the CancelRejectedReturnBitfield14 put it on the wire.
     *
     * <p>Decode reads the CancelRejectedReturnBitfield14 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelRejectedReturnBitfield14 is on the wire
     */
    public boolean cancelRejectedReturnBitfield14Present() {
        return numberOfReturnBitfields.value() >= 14L;
    }

    /**
     * Returns whether the fields before the CancelRejectedReturnBitfield15 put it on the wire.
     *
     * <p>Decode reads the CancelRejectedReturnBitfield15 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelRejectedReturnBitfield15 is on the wire
     */
    public boolean cancelRejectedReturnBitfield15Present() {
        return numberOfReturnBitfields.value() >= 15L;
    }

    /**
     * Returns whether the fields before the CancelRejectedReturnBitfield16 put it on the wire.
     *
     * <p>Decode reads the CancelRejectedReturnBitfield16 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelRejectedReturnBitfield16 is on the wire
     */
    public boolean cancelRejectedReturnBitfield16Present() {
        return numberOfReturnBitfields.value() >= 16L;
    }

    /**
     * Returns whether the fields before the CancelRejectedReturnBitfield17 put it on the wire.
     *
     * <p>Decode reads the CancelRejectedReturnBitfield17 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelRejectedReturnBitfield17 is on the wire
     */
    public boolean cancelRejectedReturnBitfield17Present() {
        return numberOfReturnBitfields.value() >= 17L;
    }

    /**
     * Returns whether the fields before the CancelRejectedReturnBitfield18 put it on the wire.
     *
     * <p>Decode reads the CancelRejectedReturnBitfield18 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelRejectedReturnBitfield18 is on the wire
     */
    public boolean cancelRejectedReturnBitfield18Present() {
        return numberOfReturnBitfields.value() >= 18L;
    }

    /**
     * Returns whether the fields before the CancelRejectedReturnBitfield19 put it on the wire.
     *
     * <p>Decode reads the CancelRejectedReturnBitfield19 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelRejectedReturnBitfield19 is on the wire
     */
    public boolean cancelRejectedReturnBitfield19Present() {
        return numberOfReturnBitfields.value() >= 19L;
    }

    /**
     * Returns whether the fields before the Side put it on the wire.
     *
     * <p>Decode reads the Side where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Side is on the wire
     */
    public boolean sidePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (cancelRejectedReturnBitfield1Present() && cancelRejectedReturnBitfield1.cancelRejectedReturnBitfield1Side());
    }

    /**
     * Returns whether the fields before the PriceBinaryPrice put it on the wire.
     *
     * <p>Decode reads the PriceBinaryPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PriceBinaryPrice is on the wire
     */
    public boolean priceBinaryPricePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (cancelRejectedReturnBitfield1Present() && cancelRejectedReturnBitfield1.cancelRejectedReturnBitfield1Price());
    }

    /**
     * Returns whether the fields before the ExecInst put it on the wire.
     *
     * <p>Decode reads the ExecInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecInst is on the wire
     */
    public boolean execInstPresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (cancelRejectedReturnBitfield1Present() && cancelRejectedReturnBitfield1.cancelRejectedReturnBitfield1ExecInst());
    }

    /**
     * Returns whether the fields before the OrdType put it on the wire.
     *
     * <p>Decode reads the OrdType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrdType is on the wire
     */
    public boolean ordTypePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (cancelRejectedReturnBitfield1Present() && cancelRejectedReturnBitfield1.cancelRejectedReturnBitfield1OrdType());
    }

    /**
     * Returns whether the fields before the TimeInForce put it on the wire.
     *
     * <p>Decode reads the TimeInForce where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TimeInForce is on the wire
     */
    public boolean timeInForcePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (cancelRejectedReturnBitfield1Present() && cancelRejectedReturnBitfield1.cancelRejectedReturnBitfield1TimeInForce());
    }

    /**
     * Returns whether the fields before the MinQty put it on the wire.
     *
     * <p>Decode reads the MinQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MinQty is on the wire
     */
    public boolean minQtyPresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (cancelRejectedReturnBitfield1Present() && cancelRejectedReturnBitfield1.cancelRejectedReturnBitfield1MinQty());
    }

    /**
     * Returns whether the fields before the SymbolAlphanumeric put it on the wire.
     *
     * <p>Decode reads the SymbolAlphanumeric where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolAlphanumeric is on the wire
     */
    public boolean symbolAlphanumericPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (cancelRejectedReturnBitfield2Present() && cancelRejectedReturnBitfield2.cancelRejectedReturnBitfield2Symbol());
    }

    /**
     * Returns whether the fields before the Capacity put it on the wire.
     *
     * <p>Decode reads the Capacity where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Capacity is on the wire
     */
    public boolean capacityPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (cancelRejectedReturnBitfield2Present() && cancelRejectedReturnBitfield2.cancelRejectedReturnBitfield2Capacity());
    }

    /**
     * Returns whether the fields before the MaturityDate put it on the wire.
     *
     * <p>Decode reads the MaturityDate where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MaturityDate is on the wire
     */
    public boolean maturityDatePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (cancelRejectedReturnBitfield4Present() && cancelRejectedReturnBitfield4.cancelRejectedReturnBitfield4MaturityDate());
    }

    /**
     * Returns whether the fields before the StrikePrice put it on the wire.
     *
     * <p>Decode reads the StrikePrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StrikePrice is on the wire
     */
    public boolean strikePricePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (cancelRejectedReturnBitfield4Present() && cancelRejectedReturnBitfield4.cancelRejectedReturnBitfield4StrikePrice());
    }

    /**
     * Returns whether the fields before the PutOrCall put it on the wire.
     *
     * <p>Decode reads the PutOrCall where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PutOrCall is on the wire
     */
    public boolean putOrCallPresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (cancelRejectedReturnBitfield4Present() && cancelRejectedReturnBitfield4.cancelRejectedReturnBitfield4PutOrCall());
    }

    /**
     * Returns whether the fields before the OpenClose put it on the wire.
     *
     * <p>Decode reads the OpenClose where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OpenClose is on the wire
     */
    public boolean openClosePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (cancelRejectedReturnBitfield4Present() && cancelRejectedReturnBitfield4.cancelRejectedReturnBitfield4OpenClose());
    }

    /**
     * Returns whether the fields before the CorrectedSize put it on the wire.
     *
     * <p>Decode reads the CorrectedSize where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CorrectedSize is on the wire
     */
    public boolean correctedSizePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (cancelRejectedReturnBitfield4Present() && cancelRejectedReturnBitfield4.cancelRejectedReturnBitfield4CorrectedSize());
    }

    /**
     * Returns whether the fields before the EchoText put it on the wire.
     *
     * <p>Decode reads the EchoText where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the EchoText is on the wire
     */
    public boolean echoTextPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (cancelRejectedReturnBitfield8Present() && cancelRejectedReturnBitfield8.cancelRejectedReturnBitfield8EchoText());
    }

    /**
     * Returns whether the fields before the StopPx put it on the wire.
     *
     * <p>Decode reads the StopPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StopPx is on the wire
     */
    public boolean stopPxPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (cancelRejectedReturnBitfield8Present() && cancelRejectedReturnBitfield8.cancelRejectedReturnBitfield8StopPx());
    }

    /**
     * Returns whether the fields before the MarketingFeeCode put it on the wire.
     *
     * <p>Decode reads the MarketingFeeCode where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MarketingFeeCode is on the wire
     */
    public boolean marketingFeeCodePresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (cancelRejectedReturnBitfield9Present() && cancelRejectedReturnBitfield9.cancelRejectedReturnBitfield9MarketingFeeCode());
    }

    /**
     * Returns whether the fields before the TargetPartyId put it on the wire.
     *
     * <p>Decode reads the TargetPartyId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TargetPartyId is on the wire
     */
    public boolean targetPartyIdPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (cancelRejectedReturnBitfield9Present() && cancelRejectedReturnBitfield9.cancelRejectedReturnBitfield9TargetPartyId());
    }

    /**
     * Returns whether the fields before the AuctionId put it on the wire.
     *
     * <p>Decode reads the AuctionId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AuctionId is on the wire
     */
    public boolean auctionIdPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (cancelRejectedReturnBitfield9Present() && cancelRejectedReturnBitfield9.cancelRejectedReturnBitfield9AuctionId());
    }

    /**
     * Returns whether the fields before the CmtaNumber put it on the wire.
     *
     * <p>Decode reads the CmtaNumber where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CmtaNumber is on the wire
     */
    public boolean cmtaNumberPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (cancelRejectedReturnBitfield9Present() && cancelRejectedReturnBitfield9.cancelRejectedReturnBitfield9CmtaNumber());
    }

    /**
     * Returns whether the fields before the CrossId put it on the wire.
     *
     * <p>Decode reads the CrossId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossId is on the wire
     */
    public boolean crossIdPresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (cancelRejectedReturnBitfield10Present() && cancelRejectedReturnBitfield10.cancelRejectedReturnBitfield10CrossId());
    }

    /**
     * Returns whether the fields before the AllocQty put it on the wire.
     *
     * <p>Decode reads the AllocQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AllocQty is on the wire
     */
    public boolean allocQtyPresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (cancelRejectedReturnBitfield10Present() && cancelRejectedReturnBitfield10.cancelRejectedReturnBitfield10AllocQty());
    }

    /**
     * Returns whether the fields before the GiveUpFirmId put it on the wire.
     *
     * <p>Decode reads the GiveUpFirmId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the GiveUpFirmId is on the wire
     */
    public boolean giveUpFirmIdPresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (cancelRejectedReturnBitfield10Present() && cancelRejectedReturnBitfield10.cancelRejectedReturnBitfield10GiveUpFirmId());
    }

    /**
     * Returns whether the fields before the RoutingFirmId put it on the wire.
     *
     * <p>Decode reads the RoutingFirmId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RoutingFirmId is on the wire
     */
    public boolean routingFirmIdPresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (cancelRejectedReturnBitfield10Present() && cancelRejectedReturnBitfield10.cancelRejectedReturnBitfield10RoutingFirmId());
    }

    /**
     * Returns whether the fields before the CrossExclusionIndicator put it on the wire.
     *
     * <p>Decode reads the CrossExclusionIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossExclusionIndicator is on the wire
     */
    public boolean crossExclusionIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (cancelRejectedReturnBitfield10Present() && cancelRejectedReturnBitfield10.cancelRejectedReturnBitfield10CrossExclusionIndicator());
    }

    /**
     * Returns whether the fields before the ClearingOptionalData put it on the wire.
     *
     * <p>Decode reads the ClearingOptionalData where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingOptionalData is on the wire
     */
    public boolean clearingOptionalDataPresent() {
        return (numberOfReturnBitfields.value() >= 12L) && (cancelRejectedReturnBitfield12Present() && cancelRejectedReturnBitfield12.cancelRejectedReturnBitfield12ClearingOptionalData());
    }

    /**
     * Returns whether the fields before the MassCancelId put it on the wire.
     *
     * <p>Decode reads the MassCancelId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MassCancelId is on the wire
     */
    public boolean massCancelIdPresent() {
        return (numberOfReturnBitfields.value() >= 15L) && (cancelRejectedReturnBitfield15Present() && cancelRejectedReturnBitfield15.cancelRejectedReturnBitfield15MassCancelId());
    }

    /**
     * Returns whether the fields before the StopPxType put it on the wire.
     *
     * <p>Decode reads the StopPxType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StopPxType is on the wire
     */
    public boolean stopPxTypePresent() {
        return (numberOfReturnBitfields.value() >= 19L) && (cancelRejectedReturnBitfield19Present() && cancelRejectedReturnBitfield19.cancelRejectedReturnBitfield19StopPxType());
    }

    private boolean onWire(Field field) {
        return (field != cancelRejectedReturnBitfield1 || cancelRejectedReturnBitfield1Present()) && (field != cancelRejectedReturnBitfield2 || cancelRejectedReturnBitfield2Present()) && (field != cancelRejectedReturnBitfield3 || cancelRejectedReturnBitfield3Present()) && (field != cancelRejectedReturnBitfield4 || cancelRejectedReturnBitfield4Present()) && (field != cancelRejectedReturnBitfield5 || cancelRejectedReturnBitfield5Present()) && (field != cancelRejectedReturnBitfield6 || cancelRejectedReturnBitfield6Present()) && (field != cancelRejectedReturnBitfield7 || cancelRejectedReturnBitfield7Present()) && (field != cancelRejectedReturnBitfield8 || cancelRejectedReturnBitfield8Present()) && (field != cancelRejectedReturnBitfield9 || cancelRejectedReturnBitfield9Present()) && (field != cancelRejectedReturnBitfield10 || cancelRejectedReturnBitfield10Present()) && (field != cancelRejectedReturnBitfield11 || cancelRejectedReturnBitfield11Present()) && (field != cancelRejectedReturnBitfield12 || cancelRejectedReturnBitfield12Present()) && (field != cancelRejectedReturnBitfield13 || cancelRejectedReturnBitfield13Present()) && (field != cancelRejectedReturnBitfield14 || cancelRejectedReturnBitfield14Present()) && (field != cancelRejectedReturnBitfield15 || cancelRejectedReturnBitfield15Present()) && (field != cancelRejectedReturnBitfield16 || cancelRejectedReturnBitfield16Present()) && (field != cancelRejectedReturnBitfield17 || cancelRejectedReturnBitfield17Present()) && (field != cancelRejectedReturnBitfield18 || cancelRejectedReturnBitfield18Present()) && (field != cancelRejectedReturnBitfield19 || cancelRejectedReturnBitfield19Present()) && (field != side || sidePresent()) && (field != priceBinaryPrice || priceBinaryPricePresent()) && (field != execInst || execInstPresent()) && (field != ordType || ordTypePresent()) && (field != timeInForce || timeInForcePresent()) && (field != minQty || minQtyPresent()) && (field != symbolAlphanumeric || symbolAlphanumericPresent()) && (field != capacity || capacityPresent()) && (field != maturityDate || maturityDatePresent()) && (field != strikePrice || strikePricePresent()) && (field != putOrCall || putOrCallPresent()) && (field != openClose || openClosePresent()) && (field != correctedSize || correctedSizePresent()) && (field != echoText || echoTextPresent()) && (field != stopPx || stopPxPresent()) && (field != marketingFeeCode || marketingFeeCodePresent()) && (field != targetPartyId || targetPartyIdPresent()) && (field != auctionId || auctionIdPresent()) && (field != cmtaNumber || cmtaNumberPresent()) && (field != crossId || crossIdPresent()) && (field != allocQty || allocQtyPresent()) && (field != giveUpFirmId || giveUpFirmIdPresent()) && (field != routingFirmId || routingFirmIdPresent()) && (field != crossExclusionIndicator || crossExclusionIndicatorPresent()) && (field != clearingOptionalData || clearingOptionalDataPresent()) && (field != massCancelId || massCancelIdPresent()) && (field != stopPxType || stopPxTypePresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (cancelRejectedReturnBitfield1Present() ? CancelRejectedReturnBitfield1Field.BYTE_LENGTH : 0) + (cancelRejectedReturnBitfield2Present() ? CancelRejectedReturnBitfield2Field.BYTE_LENGTH : 0) + (cancelRejectedReturnBitfield3Present() ? CancelRejectedReturnBitfield3Field.BYTE_LENGTH : 0) + (cancelRejectedReturnBitfield4Present() ? CancelRejectedReturnBitfield4Field.BYTE_LENGTH : 0) + (cancelRejectedReturnBitfield5Present() ? CancelRejectedReturnBitfield5Field.BYTE_LENGTH : 0) + (cancelRejectedReturnBitfield6Present() ? CancelRejectedReturnBitfield6Field.BYTE_LENGTH : 0) + (cancelRejectedReturnBitfield7Present() ? CancelRejectedReturnBitfield7Field.BYTE_LENGTH : 0) + (cancelRejectedReturnBitfield8Present() ? CancelRejectedReturnBitfield8Field.BYTE_LENGTH : 0) + (cancelRejectedReturnBitfield9Present() ? CancelRejectedReturnBitfield9Field.BYTE_LENGTH : 0) + (cancelRejectedReturnBitfield10Present() ? CancelRejectedReturnBitfield10Field.BYTE_LENGTH : 0) + (cancelRejectedReturnBitfield11Present() ? CancelRejectedReturnBitfield11Field.BYTE_LENGTH : 0) + (cancelRejectedReturnBitfield12Present() ? CancelRejectedReturnBitfield12Field.BYTE_LENGTH : 0) + (cancelRejectedReturnBitfield13Present() ? CancelRejectedReturnBitfield13Field.BYTE_LENGTH : 0) + (cancelRejectedReturnBitfield14Present() ? CancelRejectedReturnBitfield14Field.BYTE_LENGTH : 0) + (cancelRejectedReturnBitfield15Present() ? CancelRejectedReturnBitfield15Field.BYTE_LENGTH : 0) + (cancelRejectedReturnBitfield16Present() ? CancelRejectedReturnBitfield16Field.BYTE_LENGTH : 0) + (cancelRejectedReturnBitfield17Present() ? CancelRejectedReturnBitfield17Field.BYTE_LENGTH : 0) + (cancelRejectedReturnBitfield18Present() ? CancelRejectedReturnBitfield18Field.BYTE_LENGTH : 0) + (cancelRejectedReturnBitfield19Present() ? CancelRejectedReturnBitfield19Field.BYTE_LENGTH : 0) + (sidePresent() ? SideField.BYTE_LENGTH : 0) + (priceBinaryPricePresent() ? PriceBinaryPriceField.BYTE_LENGTH : 0) + (execInstPresent() ? ExecInstField.BYTE_LENGTH : 0) + (ordTypePresent() ? OrdTypeField.BYTE_LENGTH : 0) + (timeInForcePresent() ? TimeInForceField.BYTE_LENGTH : 0) + (minQtyPresent() ? MinQtyField.BYTE_LENGTH : 0) + (symbolAlphanumericPresent() ? SymbolAlphanumericField.BYTE_LENGTH : 0) + (capacityPresent() ? CapacityField.BYTE_LENGTH : 0) + (maturityDatePresent() ? MaturityDateField.BYTE_LENGTH : 0) + (strikePricePresent() ? StrikePriceField.BYTE_LENGTH : 0) + (putOrCallPresent() ? PutOrCallField.BYTE_LENGTH : 0) + (openClosePresent() ? OpenCloseField.BYTE_LENGTH : 0) + (correctedSizePresent() ? CorrectedSizeField.BYTE_LENGTH : 0) + (echoTextPresent() ? EchoTextField.BYTE_LENGTH : 0) + (stopPxPresent() ? StopPxField.BYTE_LENGTH : 0) + (marketingFeeCodePresent() ? MarketingFeeCodeField.BYTE_LENGTH : 0) + (targetPartyIdPresent() ? TargetPartyIdField.BYTE_LENGTH : 0) + (auctionIdPresent() ? AuctionIdField.BYTE_LENGTH : 0) + (cmtaNumberPresent() ? CmtaNumberField.BYTE_LENGTH : 0) + (crossIdPresent() ? CrossIdField.BYTE_LENGTH : 0) + (allocQtyPresent() ? AllocQtyField.BYTE_LENGTH : 0) + (giveUpFirmIdPresent() ? GiveUpFirmIdField.BYTE_LENGTH : 0) + (routingFirmIdPresent() ? RoutingFirmIdField.BYTE_LENGTH : 0) + (crossExclusionIndicatorPresent() ? CrossExclusionIndicatorField.BYTE_LENGTH : 0) + (clearingOptionalDataPresent() ? ClearingOptionalDataField.BYTE_LENGTH : 0) + (massCancelIdPresent() ? MassCancelIdField.BYTE_LENGTH : 0) + (stopPxTypePresent() ? StopPxTypeField.BYTE_LENGTH : 0);
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
        cursor += 20;
        cursor += 1;
        cursor += 60;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 1;
        if (cancelRejectedReturnBitfield1Present()) {
            cursor += 1;
        }
        if (cancelRejectedReturnBitfield2Present()) {
            cursor += 1;
        }
        if (cancelRejectedReturnBitfield3Present()) {
            cursor += 1;
        }
        if (cancelRejectedReturnBitfield4Present()) {
            cursor += 1;
        }
        if (cancelRejectedReturnBitfield5Present()) {
            cursor += 1;
        }
        if (cancelRejectedReturnBitfield6Present()) {
            cursor += 1;
        }
        if (cancelRejectedReturnBitfield7Present()) {
            cursor += 1;
        }
        if (cancelRejectedReturnBitfield8Present()) {
            cursor += 1;
        }
        if (cancelRejectedReturnBitfield9Present()) {
            cursor += 1;
        }
        if (cancelRejectedReturnBitfield10Present()) {
            cursor += 1;
        }
        if (cancelRejectedReturnBitfield11Present()) {
            cursor += 1;
        }
        if (cancelRejectedReturnBitfield12Present()) {
            cursor += 1;
        }
        if (cancelRejectedReturnBitfield13Present()) {
            cursor += 1;
        }
        if (cancelRejectedReturnBitfield14Present()) {
            cursor += 1;
        }
        if (cancelRejectedReturnBitfield15Present()) {
            cursor += 1;
        }
        if (cancelRejectedReturnBitfield16Present()) {
            cursor += 1;
        }
        if (cancelRejectedReturnBitfield17Present()) {
            cursor += 1;
        }
        if (cancelRejectedReturnBitfield18Present()) {
            cursor += 1;
        }
        if (cancelRejectedReturnBitfield19Present()) {
            cursor += 1;
        }
        if (sidePresent()) {
            cursor += 1;
        }
        if (priceBinaryPricePresent()) {
            cursor += 8;
        }
        if (execInstPresent()) {
            cursor += 1;
        }
        if (ordTypePresent()) {
            cursor += 1;
        }
        if (timeInForcePresent()) {
            cursor += 1;
        }
        if (minQtyPresent()) {
            cursor += 4;
        }
        if (symbolAlphanumericPresent()) {
            cursor += 8;
        }
        if (capacityPresent()) {
            cursor += 1;
        }
        if (maturityDatePresent()) {
            cursor += 4;
        }
        if (strikePricePresent()) {
            cursor += 8;
        }
        if (putOrCallPresent()) {
            cursor += 1;
        }
        if (openClosePresent()) {
            cursor += 1;
        }
        if (correctedSizePresent()) {
            cursor += 4;
        }
        if (echoTextPresent()) {
            cursor += 64;
        }
        if (stopPxPresent()) {
            cursor += 8;
        }
        if (marketingFeeCodePresent()) {
            cursor += 2;
        }
        if (targetPartyIdPresent()) {
            cursor += 4;
        }
        if (auctionIdPresent()) {
            cursor += 8;
        }
        if (cmtaNumberPresent()) {
            cursor += 4;
        }
        if (crossIdPresent()) {
            cursor += 20;
        }
        if (allocQtyPresent()) {
            cursor += 4;
        }
        if (giveUpFirmIdPresent()) {
            cursor += 4;
        }
        if (routingFirmIdPresent()) {
            cursor += 4;
        }
        if (crossExclusionIndicatorPresent()) {
            cursor += 1;
        }
        if (clearingOptionalDataPresent()) {
            cursor += 16;
        }
        if (massCancelIdPresent()) {
            cursor += 20;
        }
        if (stopPxTypePresent()) {
            cursor += 1;
        }
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(transactionTime.value());
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
        if (!transactionTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionTimeField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!cancelRejectReason.parse(data, cursor)) {
            return false;
        }
        cursor += CancelRejectReasonField.BYTE_LENGTH;
        if (!text.parse(data, cursor)) {
            return false;
        }
        cursor += TextField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!numberOfReturnBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfReturnBitfieldsField.BYTE_LENGTH;
        if (cancelRejectedReturnBitfield1Present()) {
            if (end - cursor < CancelRejectedReturnBitfield1Field.BYTE_LENGTH || !cancelRejectedReturnBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += CancelRejectedReturnBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelRejectedReturnBitfield2Present()) {
            if (end - cursor < CancelRejectedReturnBitfield2Field.BYTE_LENGTH || !cancelRejectedReturnBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += CancelRejectedReturnBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelRejectedReturnBitfield3Present()) {
            if (end - cursor < CancelRejectedReturnBitfield3Field.BYTE_LENGTH || !cancelRejectedReturnBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += CancelRejectedReturnBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelRejectedReturnBitfield4Present()) {
            if (end - cursor < CancelRejectedReturnBitfield4Field.BYTE_LENGTH || !cancelRejectedReturnBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += CancelRejectedReturnBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelRejectedReturnBitfield5Present()) {
            if (end - cursor < CancelRejectedReturnBitfield5Field.BYTE_LENGTH || !cancelRejectedReturnBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += CancelRejectedReturnBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelRejectedReturnBitfield6Present()) {
            if (end - cursor < CancelRejectedReturnBitfield6Field.BYTE_LENGTH || !cancelRejectedReturnBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += CancelRejectedReturnBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelRejectedReturnBitfield7Present()) {
            if (end - cursor < CancelRejectedReturnBitfield7Field.BYTE_LENGTH || !cancelRejectedReturnBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += CancelRejectedReturnBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelRejectedReturnBitfield8Present()) {
            if (end - cursor < CancelRejectedReturnBitfield8Field.BYTE_LENGTH || !cancelRejectedReturnBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += CancelRejectedReturnBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelRejectedReturnBitfield9Present()) {
            if (end - cursor < CancelRejectedReturnBitfield9Field.BYTE_LENGTH || !cancelRejectedReturnBitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += CancelRejectedReturnBitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelRejectedReturnBitfield10Present()) {
            if (end - cursor < CancelRejectedReturnBitfield10Field.BYTE_LENGTH || !cancelRejectedReturnBitfield10.parse(data, cursor)) {
                return false;
            }
            cursor += CancelRejectedReturnBitfield10Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelRejectedReturnBitfield11Present()) {
            if (end - cursor < CancelRejectedReturnBitfield11Field.BYTE_LENGTH || !cancelRejectedReturnBitfield11.parse(data, cursor)) {
                return false;
            }
            cursor += CancelRejectedReturnBitfield11Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelRejectedReturnBitfield12Present()) {
            if (end - cursor < CancelRejectedReturnBitfield12Field.BYTE_LENGTH || !cancelRejectedReturnBitfield12.parse(data, cursor)) {
                return false;
            }
            cursor += CancelRejectedReturnBitfield12Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelRejectedReturnBitfield13Present()) {
            if (end - cursor < CancelRejectedReturnBitfield13Field.BYTE_LENGTH || !cancelRejectedReturnBitfield13.parse(data, cursor)) {
                return false;
            }
            cursor += CancelRejectedReturnBitfield13Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelRejectedReturnBitfield14Present()) {
            if (end - cursor < CancelRejectedReturnBitfield14Field.BYTE_LENGTH || !cancelRejectedReturnBitfield14.parse(data, cursor)) {
                return false;
            }
            cursor += CancelRejectedReturnBitfield14Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelRejectedReturnBitfield15Present()) {
            if (end - cursor < CancelRejectedReturnBitfield15Field.BYTE_LENGTH || !cancelRejectedReturnBitfield15.parse(data, cursor)) {
                return false;
            }
            cursor += CancelRejectedReturnBitfield15Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelRejectedReturnBitfield16Present()) {
            if (end - cursor < CancelRejectedReturnBitfield16Field.BYTE_LENGTH || !cancelRejectedReturnBitfield16.parse(data, cursor)) {
                return false;
            }
            cursor += CancelRejectedReturnBitfield16Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelRejectedReturnBitfield17Present()) {
            if (end - cursor < CancelRejectedReturnBitfield17Field.BYTE_LENGTH || !cancelRejectedReturnBitfield17.parse(data, cursor)) {
                return false;
            }
            cursor += CancelRejectedReturnBitfield17Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelRejectedReturnBitfield18Present()) {
            if (end - cursor < CancelRejectedReturnBitfield18Field.BYTE_LENGTH || !cancelRejectedReturnBitfield18.parse(data, cursor)) {
                return false;
            }
            cursor += CancelRejectedReturnBitfield18Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelRejectedReturnBitfield19Present()) {
            if (end - cursor < CancelRejectedReturnBitfield19Field.BYTE_LENGTH || !cancelRejectedReturnBitfield19.parse(data, cursor)) {
                return false;
            }
            cursor += CancelRejectedReturnBitfield19Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (sidePresent()) {
            if (end - cursor < SideField.BYTE_LENGTH || !side.parse(data, cursor)) {
                return false;
            }
            cursor += SideField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (priceBinaryPricePresent()) {
            if (end - cursor < PriceBinaryPriceField.BYTE_LENGTH || !priceBinaryPrice.parse(data, cursor)) {
                return false;
            }
            cursor += PriceBinaryPriceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (execInstPresent()) {
            if (end - cursor < ExecInstField.BYTE_LENGTH || !execInst.parse(data, cursor)) {
                return false;
            }
            cursor += ExecInstField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (ordTypePresent()) {
            if (end - cursor < OrdTypeField.BYTE_LENGTH || !ordType.parse(data, cursor)) {
                return false;
            }
            cursor += OrdTypeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (timeInForcePresent()) {
            if (end - cursor < TimeInForceField.BYTE_LENGTH || !timeInForce.parse(data, cursor)) {
                return false;
            }
            cursor += TimeInForceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (minQtyPresent()) {
            if (end - cursor < MinQtyField.BYTE_LENGTH || !minQty.parse(data, cursor)) {
                return false;
            }
            cursor += MinQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (symbolAlphanumericPresent()) {
            if (end - cursor < SymbolAlphanumericField.BYTE_LENGTH || !symbolAlphanumeric.parse(data, cursor)) {
                return false;
            }
            cursor += SymbolAlphanumericField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (capacityPresent()) {
            if (end - cursor < CapacityField.BYTE_LENGTH || !capacity.parse(data, cursor)) {
                return false;
            }
            cursor += CapacityField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (maturityDatePresent()) {
            if (end - cursor < MaturityDateField.BYTE_LENGTH || !maturityDate.parse(data, cursor)) {
                return false;
            }
            cursor += MaturityDateField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (strikePricePresent()) {
            if (end - cursor < StrikePriceField.BYTE_LENGTH || !strikePrice.parse(data, cursor)) {
                return false;
            }
            cursor += StrikePriceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (putOrCallPresent()) {
            if (end - cursor < PutOrCallField.BYTE_LENGTH || !putOrCall.parse(data, cursor)) {
                return false;
            }
            cursor += PutOrCallField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (openClosePresent()) {
            if (end - cursor < OpenCloseField.BYTE_LENGTH || !openClose.parse(data, cursor)) {
                return false;
            }
            cursor += OpenCloseField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (correctedSizePresent()) {
            if (end - cursor < CorrectedSizeField.BYTE_LENGTH || !correctedSize.parse(data, cursor)) {
                return false;
            }
            cursor += CorrectedSizeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (echoTextPresent()) {
            if (end - cursor < EchoTextField.BYTE_LENGTH || !echoText.parse(data, cursor)) {
                return false;
            }
            cursor += EchoTextField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (stopPxPresent()) {
            if (end - cursor < StopPxField.BYTE_LENGTH || !stopPx.parse(data, cursor)) {
                return false;
            }
            cursor += StopPxField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (marketingFeeCodePresent()) {
            if (end - cursor < MarketingFeeCodeField.BYTE_LENGTH || !marketingFeeCode.parse(data, cursor)) {
                return false;
            }
            cursor += MarketingFeeCodeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (targetPartyIdPresent()) {
            if (end - cursor < TargetPartyIdField.BYTE_LENGTH || !targetPartyId.parse(data, cursor)) {
                return false;
            }
            cursor += TargetPartyIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (auctionIdPresent()) {
            if (end - cursor < AuctionIdField.BYTE_LENGTH || !auctionId.parse(data, cursor)) {
                return false;
            }
            cursor += AuctionIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cmtaNumberPresent()) {
            if (end - cursor < CmtaNumberField.BYTE_LENGTH || !cmtaNumber.parse(data, cursor)) {
                return false;
            }
            cursor += CmtaNumberField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (crossIdPresent()) {
            if (end - cursor < CrossIdField.BYTE_LENGTH || !crossId.parse(data, cursor)) {
                return false;
            }
            cursor += CrossIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (allocQtyPresent()) {
            if (end - cursor < AllocQtyField.BYTE_LENGTH || !allocQty.parse(data, cursor)) {
                return false;
            }
            cursor += AllocQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (giveUpFirmIdPresent()) {
            if (end - cursor < GiveUpFirmIdField.BYTE_LENGTH || !giveUpFirmId.parse(data, cursor)) {
                return false;
            }
            cursor += GiveUpFirmIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (routingFirmIdPresent()) {
            if (end - cursor < RoutingFirmIdField.BYTE_LENGTH || !routingFirmId.parse(data, cursor)) {
                return false;
            }
            cursor += RoutingFirmIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (crossExclusionIndicatorPresent()) {
            if (end - cursor < CrossExclusionIndicatorField.BYTE_LENGTH || !crossExclusionIndicator.parse(data, cursor)) {
                return false;
            }
            cursor += CrossExclusionIndicatorField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (clearingOptionalDataPresent()) {
            if (end - cursor < ClearingOptionalDataField.BYTE_LENGTH || !clearingOptionalData.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingOptionalDataField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (massCancelIdPresent()) {
            if (end - cursor < MassCancelIdField.BYTE_LENGTH || !massCancelId.parse(data, cursor)) {
                return false;
            }
            cursor += MassCancelIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (stopPxTypePresent()) {
            if (end - cursor < StopPxTypeField.BYTE_LENGTH || !stopPxType.parse(data, cursor)) {
                return false;
            }
            cursor += StopPxTypeField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (cancelRejectedReturnBitfield1Present() != cancelRejectedReturnBitfield1.hasValue()) {
            throw new IllegalStateException(cancelRejectedReturnBitfield1.hasValue() ? "cancelRejectedReturnBitfield1 holds a value the fields before it leave off the wire" : "cancelRejectedReturnBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (cancelRejectedReturnBitfield2Present() != cancelRejectedReturnBitfield2.hasValue()) {
            throw new IllegalStateException(cancelRejectedReturnBitfield2.hasValue() ? "cancelRejectedReturnBitfield2 holds a value the fields before it leave off the wire" : "cancelRejectedReturnBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (cancelRejectedReturnBitfield3Present() != cancelRejectedReturnBitfield3.hasValue()) {
            throw new IllegalStateException(cancelRejectedReturnBitfield3.hasValue() ? "cancelRejectedReturnBitfield3 holds a value the fields before it leave off the wire" : "cancelRejectedReturnBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (cancelRejectedReturnBitfield4Present() != cancelRejectedReturnBitfield4.hasValue()) {
            throw new IllegalStateException(cancelRejectedReturnBitfield4.hasValue() ? "cancelRejectedReturnBitfield4 holds a value the fields before it leave off the wire" : "cancelRejectedReturnBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (cancelRejectedReturnBitfield5Present() != cancelRejectedReturnBitfield5.hasValue()) {
            throw new IllegalStateException(cancelRejectedReturnBitfield5.hasValue() ? "cancelRejectedReturnBitfield5 holds a value the fields before it leave off the wire" : "cancelRejectedReturnBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (cancelRejectedReturnBitfield6Present() != cancelRejectedReturnBitfield6.hasValue()) {
            throw new IllegalStateException(cancelRejectedReturnBitfield6.hasValue() ? "cancelRejectedReturnBitfield6 holds a value the fields before it leave off the wire" : "cancelRejectedReturnBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (cancelRejectedReturnBitfield7Present() != cancelRejectedReturnBitfield7.hasValue()) {
            throw new IllegalStateException(cancelRejectedReturnBitfield7.hasValue() ? "cancelRejectedReturnBitfield7 holds a value the fields before it leave off the wire" : "cancelRejectedReturnBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (cancelRejectedReturnBitfield8Present() != cancelRejectedReturnBitfield8.hasValue()) {
            throw new IllegalStateException(cancelRejectedReturnBitfield8.hasValue() ? "cancelRejectedReturnBitfield8 holds a value the fields before it leave off the wire" : "cancelRejectedReturnBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (cancelRejectedReturnBitfield9Present() != cancelRejectedReturnBitfield9.hasValue()) {
            throw new IllegalStateException(cancelRejectedReturnBitfield9.hasValue() ? "cancelRejectedReturnBitfield9 holds a value the fields before it leave off the wire" : "cancelRejectedReturnBitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (cancelRejectedReturnBitfield10Present() != cancelRejectedReturnBitfield10.hasValue()) {
            throw new IllegalStateException(cancelRejectedReturnBitfield10.hasValue() ? "cancelRejectedReturnBitfield10 holds a value the fields before it leave off the wire" : "cancelRejectedReturnBitfield10 holds no value, though the fields before it put it on the wire");
        }
        if (cancelRejectedReturnBitfield11Present() != cancelRejectedReturnBitfield11.hasValue()) {
            throw new IllegalStateException(cancelRejectedReturnBitfield11.hasValue() ? "cancelRejectedReturnBitfield11 holds a value the fields before it leave off the wire" : "cancelRejectedReturnBitfield11 holds no value, though the fields before it put it on the wire");
        }
        if (cancelRejectedReturnBitfield12Present() != cancelRejectedReturnBitfield12.hasValue()) {
            throw new IllegalStateException(cancelRejectedReturnBitfield12.hasValue() ? "cancelRejectedReturnBitfield12 holds a value the fields before it leave off the wire" : "cancelRejectedReturnBitfield12 holds no value, though the fields before it put it on the wire");
        }
        if (cancelRejectedReturnBitfield13Present() != cancelRejectedReturnBitfield13.hasValue()) {
            throw new IllegalStateException(cancelRejectedReturnBitfield13.hasValue() ? "cancelRejectedReturnBitfield13 holds a value the fields before it leave off the wire" : "cancelRejectedReturnBitfield13 holds no value, though the fields before it put it on the wire");
        }
        if (cancelRejectedReturnBitfield14Present() != cancelRejectedReturnBitfield14.hasValue()) {
            throw new IllegalStateException(cancelRejectedReturnBitfield14.hasValue() ? "cancelRejectedReturnBitfield14 holds a value the fields before it leave off the wire" : "cancelRejectedReturnBitfield14 holds no value, though the fields before it put it on the wire");
        }
        if (cancelRejectedReturnBitfield15Present() != cancelRejectedReturnBitfield15.hasValue()) {
            throw new IllegalStateException(cancelRejectedReturnBitfield15.hasValue() ? "cancelRejectedReturnBitfield15 holds a value the fields before it leave off the wire" : "cancelRejectedReturnBitfield15 holds no value, though the fields before it put it on the wire");
        }
        if (cancelRejectedReturnBitfield16Present() != cancelRejectedReturnBitfield16.hasValue()) {
            throw new IllegalStateException(cancelRejectedReturnBitfield16.hasValue() ? "cancelRejectedReturnBitfield16 holds a value the fields before it leave off the wire" : "cancelRejectedReturnBitfield16 holds no value, though the fields before it put it on the wire");
        }
        if (cancelRejectedReturnBitfield17Present() != cancelRejectedReturnBitfield17.hasValue()) {
            throw new IllegalStateException(cancelRejectedReturnBitfield17.hasValue() ? "cancelRejectedReturnBitfield17 holds a value the fields before it leave off the wire" : "cancelRejectedReturnBitfield17 holds no value, though the fields before it put it on the wire");
        }
        if (cancelRejectedReturnBitfield18Present() != cancelRejectedReturnBitfield18.hasValue()) {
            throw new IllegalStateException(cancelRejectedReturnBitfield18.hasValue() ? "cancelRejectedReturnBitfield18 holds a value the fields before it leave off the wire" : "cancelRejectedReturnBitfield18 holds no value, though the fields before it put it on the wire");
        }
        if (cancelRejectedReturnBitfield19Present() != cancelRejectedReturnBitfield19.hasValue()) {
            throw new IllegalStateException(cancelRejectedReturnBitfield19.hasValue() ? "cancelRejectedReturnBitfield19 holds a value the fields before it leave off the wire" : "cancelRejectedReturnBitfield19 holds no value, though the fields before it put it on the wire");
        }
        if (sidePresent() != side.hasValue()) {
            throw new IllegalStateException(side.hasValue() ? "side holds a value the fields before it leave off the wire" : "side holds no value, though the fields before it put it on the wire");
        }
        if (priceBinaryPricePresent() != priceBinaryPrice.hasValue()) {
            throw new IllegalStateException(priceBinaryPrice.hasValue() ? "priceBinaryPrice holds a value the fields before it leave off the wire" : "priceBinaryPrice holds no value, though the fields before it put it on the wire");
        }
        if (execInstPresent() != execInst.hasValue()) {
            throw new IllegalStateException(execInst.hasValue() ? "execInst holds a value the fields before it leave off the wire" : "execInst holds no value, though the fields before it put it on the wire");
        }
        if (ordTypePresent() != ordType.hasValue()) {
            throw new IllegalStateException(ordType.hasValue() ? "ordType holds a value the fields before it leave off the wire" : "ordType holds no value, though the fields before it put it on the wire");
        }
        if (timeInForcePresent() != timeInForce.hasValue()) {
            throw new IllegalStateException(timeInForce.hasValue() ? "timeInForce holds a value the fields before it leave off the wire" : "timeInForce holds no value, though the fields before it put it on the wire");
        }
        if (minQtyPresent() != minQty.hasValue()) {
            throw new IllegalStateException(minQty.hasValue() ? "minQty holds a value the fields before it leave off the wire" : "minQty holds no value, though the fields before it put it on the wire");
        }
        if (symbolAlphanumericPresent() != symbolAlphanumeric.hasValue()) {
            throw new IllegalStateException(symbolAlphanumeric.hasValue() ? "symbolAlphanumeric holds a value the fields before it leave off the wire" : "symbolAlphanumeric holds no value, though the fields before it put it on the wire");
        }
        if (capacityPresent() != capacity.hasValue()) {
            throw new IllegalStateException(capacity.hasValue() ? "capacity holds a value the fields before it leave off the wire" : "capacity holds no value, though the fields before it put it on the wire");
        }
        if (maturityDatePresent() != maturityDate.hasValue()) {
            throw new IllegalStateException(maturityDate.hasValue() ? "maturityDate holds a value the fields before it leave off the wire" : "maturityDate holds no value, though the fields before it put it on the wire");
        }
        if (strikePricePresent() != strikePrice.hasValue()) {
            throw new IllegalStateException(strikePrice.hasValue() ? "strikePrice holds a value the fields before it leave off the wire" : "strikePrice holds no value, though the fields before it put it on the wire");
        }
        if (putOrCallPresent() != putOrCall.hasValue()) {
            throw new IllegalStateException(putOrCall.hasValue() ? "putOrCall holds a value the fields before it leave off the wire" : "putOrCall holds no value, though the fields before it put it on the wire");
        }
        if (openClosePresent() != openClose.hasValue()) {
            throw new IllegalStateException(openClose.hasValue() ? "openClose holds a value the fields before it leave off the wire" : "openClose holds no value, though the fields before it put it on the wire");
        }
        if (correctedSizePresent() != correctedSize.hasValue()) {
            throw new IllegalStateException(correctedSize.hasValue() ? "correctedSize holds a value the fields before it leave off the wire" : "correctedSize holds no value, though the fields before it put it on the wire");
        }
        if (echoTextPresent() != echoText.hasValue()) {
            throw new IllegalStateException(echoText.hasValue() ? "echoText holds a value the fields before it leave off the wire" : "echoText holds no value, though the fields before it put it on the wire");
        }
        if (stopPxPresent() != stopPx.hasValue()) {
            throw new IllegalStateException(stopPx.hasValue() ? "stopPx holds a value the fields before it leave off the wire" : "stopPx holds no value, though the fields before it put it on the wire");
        }
        if (marketingFeeCodePresent() != marketingFeeCode.hasValue()) {
            throw new IllegalStateException(marketingFeeCode.hasValue() ? "marketingFeeCode holds a value the fields before it leave off the wire" : "marketingFeeCode holds no value, though the fields before it put it on the wire");
        }
        if (targetPartyIdPresent() != targetPartyId.hasValue()) {
            throw new IllegalStateException(targetPartyId.hasValue() ? "targetPartyId holds a value the fields before it leave off the wire" : "targetPartyId holds no value, though the fields before it put it on the wire");
        }
        if (auctionIdPresent() != auctionId.hasValue()) {
            throw new IllegalStateException(auctionId.hasValue() ? "auctionId holds a value the fields before it leave off the wire" : "auctionId holds no value, though the fields before it put it on the wire");
        }
        if (cmtaNumberPresent() != cmtaNumber.hasValue()) {
            throw new IllegalStateException(cmtaNumber.hasValue() ? "cmtaNumber holds a value the fields before it leave off the wire" : "cmtaNumber holds no value, though the fields before it put it on the wire");
        }
        if (crossIdPresent() != crossId.hasValue()) {
            throw new IllegalStateException(crossId.hasValue() ? "crossId holds a value the fields before it leave off the wire" : "crossId holds no value, though the fields before it put it on the wire");
        }
        if (allocQtyPresent() != allocQty.hasValue()) {
            throw new IllegalStateException(allocQty.hasValue() ? "allocQty holds a value the fields before it leave off the wire" : "allocQty holds no value, though the fields before it put it on the wire");
        }
        if (giveUpFirmIdPresent() != giveUpFirmId.hasValue()) {
            throw new IllegalStateException(giveUpFirmId.hasValue() ? "giveUpFirmId holds a value the fields before it leave off the wire" : "giveUpFirmId holds no value, though the fields before it put it on the wire");
        }
        if (routingFirmIdPresent() != routingFirmId.hasValue()) {
            throw new IllegalStateException(routingFirmId.hasValue() ? "routingFirmId holds a value the fields before it leave off the wire" : "routingFirmId holds no value, though the fields before it put it on the wire");
        }
        if (crossExclusionIndicatorPresent() != crossExclusionIndicator.hasValue()) {
            throw new IllegalStateException(crossExclusionIndicator.hasValue() ? "crossExclusionIndicator holds a value the fields before it leave off the wire" : "crossExclusionIndicator holds no value, though the fields before it put it on the wire");
        }
        if (clearingOptionalDataPresent() != clearingOptionalData.hasValue()) {
            throw new IllegalStateException(clearingOptionalData.hasValue() ? "clearingOptionalData holds a value the fields before it leave off the wire" : "clearingOptionalData holds no value, though the fields before it put it on the wire");
        }
        if (massCancelIdPresent() != massCancelId.hasValue()) {
            throw new IllegalStateException(massCancelId.hasValue() ? "massCancelId holds a value the fields before it leave off the wire" : "massCancelId holds no value, though the fields before it put it on the wire");
        }
        if (stopPxTypePresent() != stopPxType.hasValue()) {
            throw new IllegalStateException(stopPxType.hasValue() ? "stopPxType holds a value the fields before it leave off the wire" : "stopPxType holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = transactionTime.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = cancelRejectReason.encode(data, cursor);
        cursor = text.encode(data, cursor);
        if (buffer != null && buffer.length >= 90) {
            System.arraycopy(buffer, 89, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = numberOfReturnBitfields.encode(data, cursor);
        if (cancelRejectedReturnBitfield1Present()) {
            cursor = cancelRejectedReturnBitfield1.encode(data, cursor);
        }
        if (cancelRejectedReturnBitfield2Present()) {
            cursor = cancelRejectedReturnBitfield2.encode(data, cursor);
        }
        if (cancelRejectedReturnBitfield3Present()) {
            cursor = cancelRejectedReturnBitfield3.encode(data, cursor);
        }
        if (cancelRejectedReturnBitfield4Present()) {
            cursor = cancelRejectedReturnBitfield4.encode(data, cursor);
        }
        if (cancelRejectedReturnBitfield5Present()) {
            cursor = cancelRejectedReturnBitfield5.encode(data, cursor);
        }
        if (cancelRejectedReturnBitfield6Present()) {
            cursor = cancelRejectedReturnBitfield6.encode(data, cursor);
        }
        if (cancelRejectedReturnBitfield7Present()) {
            cursor = cancelRejectedReturnBitfield7.encode(data, cursor);
        }
        if (cancelRejectedReturnBitfield8Present()) {
            cursor = cancelRejectedReturnBitfield8.encode(data, cursor);
        }
        if (cancelRejectedReturnBitfield9Present()) {
            cursor = cancelRejectedReturnBitfield9.encode(data, cursor);
        }
        if (cancelRejectedReturnBitfield10Present()) {
            cursor = cancelRejectedReturnBitfield10.encode(data, cursor);
        }
        if (cancelRejectedReturnBitfield11Present()) {
            cursor = cancelRejectedReturnBitfield11.encode(data, cursor);
        }
        if (cancelRejectedReturnBitfield12Present()) {
            cursor = cancelRejectedReturnBitfield12.encode(data, cursor);
        }
        if (cancelRejectedReturnBitfield13Present()) {
            cursor = cancelRejectedReturnBitfield13.encode(data, cursor);
        }
        if (cancelRejectedReturnBitfield14Present()) {
            cursor = cancelRejectedReturnBitfield14.encode(data, cursor);
        }
        if (cancelRejectedReturnBitfield15Present()) {
            cursor = cancelRejectedReturnBitfield15.encode(data, cursor);
        }
        if (cancelRejectedReturnBitfield16Present()) {
            cursor = cancelRejectedReturnBitfield16.encode(data, cursor);
        }
        if (cancelRejectedReturnBitfield17Present()) {
            cursor = cancelRejectedReturnBitfield17.encode(data, cursor);
        }
        if (cancelRejectedReturnBitfield18Present()) {
            cursor = cancelRejectedReturnBitfield18.encode(data, cursor);
        }
        if (cancelRejectedReturnBitfield19Present()) {
            cursor = cancelRejectedReturnBitfield19.encode(data, cursor);
        }
        if (sidePresent()) {
            cursor = side.encode(data, cursor);
        }
        if (priceBinaryPricePresent()) {
            cursor = priceBinaryPrice.encode(data, cursor);
        }
        if (execInstPresent()) {
            cursor = execInst.encode(data, cursor);
        }
        if (ordTypePresent()) {
            cursor = ordType.encode(data, cursor);
        }
        if (timeInForcePresent()) {
            cursor = timeInForce.encode(data, cursor);
        }
        if (minQtyPresent()) {
            cursor = minQty.encode(data, cursor);
        }
        if (symbolAlphanumericPresent()) {
            cursor = symbolAlphanumeric.encode(data, cursor);
        }
        if (capacityPresent()) {
            cursor = capacity.encode(data, cursor);
        }
        if (maturityDatePresent()) {
            cursor = maturityDate.encode(data, cursor);
        }
        if (strikePricePresent()) {
            cursor = strikePrice.encode(data, cursor);
        }
        if (putOrCallPresent()) {
            cursor = putOrCall.encode(data, cursor);
        }
        if (openClosePresent()) {
            cursor = openClose.encode(data, cursor);
        }
        if (correctedSizePresent()) {
            cursor = correctedSize.encode(data, cursor);
        }
        if (echoTextPresent()) {
            cursor = echoText.encode(data, cursor);
        }
        if (stopPxPresent()) {
            cursor = stopPx.encode(data, cursor);
        }
        if (marketingFeeCodePresent()) {
            cursor = marketingFeeCode.encode(data, cursor);
        }
        if (targetPartyIdPresent()) {
            cursor = targetPartyId.encode(data, cursor);
        }
        if (auctionIdPresent()) {
            cursor = auctionId.encode(data, cursor);
        }
        if (cmtaNumberPresent()) {
            cursor = cmtaNumber.encode(data, cursor);
        }
        if (crossIdPresent()) {
            cursor = crossId.encode(data, cursor);
        }
        if (allocQtyPresent()) {
            cursor = allocQty.encode(data, cursor);
        }
        if (giveUpFirmIdPresent()) {
            cursor = giveUpFirmId.encode(data, cursor);
        }
        if (routingFirmIdPresent()) {
            cursor = routingFirmId.encode(data, cursor);
        }
        if (crossExclusionIndicatorPresent()) {
            cursor = crossExclusionIndicator.encode(data, cursor);
        }
        if (clearingOptionalDataPresent()) {
            cursor = clearingOptionalData.encode(data, cursor);
        }
        if (massCancelIdPresent()) {
            cursor = massCancelId.encode(data, cursor);
        }
        if (stopPxTypePresent()) {
            cursor = stopPxType.encode(data, cursor);
        }
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
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        for (Field field : fields()) {
            if (!field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields()) {
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
        return fields.stream().filter(this::onWire).toList();
    }

    @Override
    public Optional<Field> field(String name) {
        return switch (name) {
            case "TransactionTime" -> Optional.of(transactionTime);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "CancelRejectReason" -> Optional.of(cancelRejectReason);
            case "Text" -> Optional.of(text);
            case "NumberOfReturnBitfields" -> Optional.of(numberOfReturnBitfields);
            case "CancelRejectedReturnBitfield1" -> Optional.of(cancelRejectedReturnBitfield1);
            case "CancelRejectedReturnBitfield2" -> Optional.of(cancelRejectedReturnBitfield2);
            case "CancelRejectedReturnBitfield3" -> Optional.of(cancelRejectedReturnBitfield3);
            case "CancelRejectedReturnBitfield4" -> Optional.of(cancelRejectedReturnBitfield4);
            case "CancelRejectedReturnBitfield5" -> Optional.of(cancelRejectedReturnBitfield5);
            case "CancelRejectedReturnBitfield6" -> Optional.of(cancelRejectedReturnBitfield6);
            case "CancelRejectedReturnBitfield7" -> Optional.of(cancelRejectedReturnBitfield7);
            case "CancelRejectedReturnBitfield8" -> Optional.of(cancelRejectedReturnBitfield8);
            case "CancelRejectedReturnBitfield9" -> Optional.of(cancelRejectedReturnBitfield9);
            case "CancelRejectedReturnBitfield10" -> Optional.of(cancelRejectedReturnBitfield10);
            case "CancelRejectedReturnBitfield11" -> Optional.of(cancelRejectedReturnBitfield11);
            case "CancelRejectedReturnBitfield12" -> Optional.of(cancelRejectedReturnBitfield12);
            case "CancelRejectedReturnBitfield13" -> Optional.of(cancelRejectedReturnBitfield13);
            case "CancelRejectedReturnBitfield14" -> Optional.of(cancelRejectedReturnBitfield14);
            case "CancelRejectedReturnBitfield15" -> Optional.of(cancelRejectedReturnBitfield15);
            case "CancelRejectedReturnBitfield16" -> Optional.of(cancelRejectedReturnBitfield16);
            case "CancelRejectedReturnBitfield17" -> Optional.of(cancelRejectedReturnBitfield17);
            case "CancelRejectedReturnBitfield18" -> Optional.of(cancelRejectedReturnBitfield18);
            case "CancelRejectedReturnBitfield19" -> Optional.of(cancelRejectedReturnBitfield19);
            case "Side" -> Optional.of(side);
            case "PriceBinaryPrice" -> Optional.of(priceBinaryPrice);
            case "ExecInst" -> Optional.of(execInst);
            case "OrdType" -> Optional.of(ordType);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "MinQty" -> Optional.of(minQty);
            case "SymbolAlphanumeric" -> Optional.of(symbolAlphanumeric);
            case "Capacity" -> Optional.of(capacity);
            case "MaturityDate" -> Optional.of(maturityDate);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "PutOrCall" -> Optional.of(putOrCall);
            case "OpenClose" -> Optional.of(openClose);
            case "CorrectedSize" -> Optional.of(correctedSize);
            case "EchoText" -> Optional.of(echoText);
            case "StopPx" -> Optional.of(stopPx);
            case "MarketingFeeCode" -> Optional.of(marketingFeeCode);
            case "TargetPartyId" -> Optional.of(targetPartyId);
            case "AuctionId" -> Optional.of(auctionId);
            case "CmtaNumber" -> Optional.of(cmtaNumber);
            case "CrossId" -> Optional.of(crossId);
            case "AllocQty" -> Optional.of(allocQty);
            case "GiveUpFirmId" -> Optional.of(giveUpFirmId);
            case "RoutingFirmId" -> Optional.of(routingFirmId);
            case "CrossExclusionIndicator" -> Optional.of(crossExclusionIndicator);
            case "ClearingOptionalData" -> Optional.of(clearingOptionalData);
            case "MassCancelId" -> Optional.of(massCancelId);
            case "StopPxType" -> Optional.of(stopPxType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof CancelRejectedMessage message)) {
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

        List<Field> onWire = fields();
        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < onWire.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                onWire.get(index).toFormattedString(builder, options);
            }
            builder.append(" }");
            return;
        }

        builder.append(options.prefix()).append(NAME).append(System.lineSeparator());
        PrintOptions nested = options.nested();
        for (Field field : onWire) {
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
        if (!(other instanceof CancelRejectedMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
