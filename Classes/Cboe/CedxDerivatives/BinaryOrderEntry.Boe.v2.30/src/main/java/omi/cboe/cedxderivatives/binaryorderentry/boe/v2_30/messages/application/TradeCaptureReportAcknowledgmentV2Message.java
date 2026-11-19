package omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.AlgorithmicIndicatorField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.ClearingFirmField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.ExtExecInstField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.IdSourceField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.LiquidityProvisionField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.NoSidesField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.NumberOfReturnBitfieldsField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.OrderCategoryField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.OrderQtyField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.PriceFormationField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.SecurityIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.SymbolAlphanumericField2;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TradeCaptureReportAcknowledgmentV2ReturnBitfield10Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TradeCaptureReportAcknowledgmentV2ReturnBitfield11Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TradeCaptureReportAcknowledgmentV2ReturnBitfield12Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TradeCaptureReportAcknowledgmentV2ReturnBitfield13Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TradeCaptureReportAcknowledgmentV2ReturnBitfield14Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TradeCaptureReportAcknowledgmentV2ReturnBitfield15Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TradeCaptureReportAcknowledgmentV2ReturnBitfield16Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TradeCaptureReportAcknowledgmentV2ReturnBitfield17Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TradeCaptureReportAcknowledgmentV2ReturnBitfield18Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TradeCaptureReportAcknowledgmentV2ReturnBitfield19Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TradeCaptureReportAcknowledgmentV2ReturnBitfield1Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TradeCaptureReportAcknowledgmentV2ReturnBitfield2Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TradeCaptureReportAcknowledgmentV2ReturnBitfield3Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TradeCaptureReportAcknowledgmentV2ReturnBitfield4Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TradeCaptureReportAcknowledgmentV2ReturnBitfield5Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TradeCaptureReportAcknowledgmentV2ReturnBitfield6Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TradeCaptureReportAcknowledgmentV2ReturnBitfield7Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TradeCaptureReportAcknowledgmentV2ReturnBitfield8Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TradeCaptureReportAcknowledgmentV2ReturnBitfield9Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TradeReportIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TradeReportRefIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TradeReportTypeReturnField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TransactionTimeField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.groups.TrdCapAckSideGrpEntry;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.groups.TrdCapAckSideGrpList;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.types.Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.types.Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.types.PrintOptions;

/**
 * Represents the TradeCaptureReportAcknowledgmentV2Message message from the BinaryOrderEntry protocol.
 *
 * <p>Trade Capture Report Acknowledgment V2 Message.</p>
 */
public final class TradeCaptureReportAcknowledgmentV2Message implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 31;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Capture Report Acknowledgment V 2 Message";

    /**
     * The time the event occurred in the Cboe match- ing engine (not the time the message was sent).
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Corresponds to TradeReportID (571) in Cboe FIX. Day-unique ID chosen by client. Cboe will en- force port level day-uniqueness. 20 characters or less. Characters in ASCII range 33–126 are allowed, except for comma, semi- colon, and pipe. If the TradeReportID matches a live trade report (one that has been acked, but not confirmed or declined), it will be rejected as duplicate.
     */
    private final TradeReportIdField tradeReportId = new TradeReportIdField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfReturnBitfieldsField numberOfReturnBitfields = new NumberOfReturnBitfieldsField();

    /**
     * BitSet TradeCaptureReportAcknowledgmentV2 byte 1.
     */
    private final TradeCaptureReportAcknowledgmentV2ReturnBitfield1Field tradeCaptureReportAcknowledgmentV2ReturnBitfield1 = new TradeCaptureReportAcknowledgmentV2ReturnBitfield1Field();

    /**
     * BitSet TradeCaptureReportAcknowledgmentV2 byte 2.
     */
    private final TradeCaptureReportAcknowledgmentV2ReturnBitfield2Field tradeCaptureReportAcknowledgmentV2ReturnBitfield2 = new TradeCaptureReportAcknowledgmentV2ReturnBitfield2Field();

    /**
     * BitSet TradeCaptureReportAcknowledgmentV2 byte 3.
     */
    private final TradeCaptureReportAcknowledgmentV2ReturnBitfield3Field tradeCaptureReportAcknowledgmentV2ReturnBitfield3 = new TradeCaptureReportAcknowledgmentV2ReturnBitfield3Field();

    /**
     * BitSet TradeCaptureReportAcknowledgmentV2 byte 4.
     */
    private final TradeCaptureReportAcknowledgmentV2ReturnBitfield4Field tradeCaptureReportAcknowledgmentV2ReturnBitfield4 = new TradeCaptureReportAcknowledgmentV2ReturnBitfield4Field();

    /**
     * BitSet TradeCaptureReportAcknowledgmentV2 byte 5.
     */
    private final TradeCaptureReportAcknowledgmentV2ReturnBitfield5Field tradeCaptureReportAcknowledgmentV2ReturnBitfield5 = new TradeCaptureReportAcknowledgmentV2ReturnBitfield5Field();

    /**
     * BitSet TradeCaptureReportAcknowledgmentV2 byte 6.
     */
    private final TradeCaptureReportAcknowledgmentV2ReturnBitfield6Field tradeCaptureReportAcknowledgmentV2ReturnBitfield6 = new TradeCaptureReportAcknowledgmentV2ReturnBitfield6Field();

    /**
     * BitSet TradeCaptureReportAcknowledgmentV2 byte 7.
     */
    private final TradeCaptureReportAcknowledgmentV2ReturnBitfield7Field tradeCaptureReportAcknowledgmentV2ReturnBitfield7 = new TradeCaptureReportAcknowledgmentV2ReturnBitfield7Field();

    /**
     * BitSet TradeCaptureReportAcknowledgmentV2 byte 8.
     */
    private final TradeCaptureReportAcknowledgmentV2ReturnBitfield8Field tradeCaptureReportAcknowledgmentV2ReturnBitfield8 = new TradeCaptureReportAcknowledgmentV2ReturnBitfield8Field();

    /**
     * BitSet TradeCaptureReportAcknowledgmentV2 byte 9.
     */
    private final TradeCaptureReportAcknowledgmentV2ReturnBitfield9Field tradeCaptureReportAcknowledgmentV2ReturnBitfield9 = new TradeCaptureReportAcknowledgmentV2ReturnBitfield9Field();

    /**
     * BitSet TradeCaptureReportAcknowledgmentV2 byte 10.
     */
    private final TradeCaptureReportAcknowledgmentV2ReturnBitfield10Field tradeCaptureReportAcknowledgmentV2ReturnBitfield10 = new TradeCaptureReportAcknowledgmentV2ReturnBitfield10Field();

    /**
     * BitSet TradeCaptureReportAcknowledgmentV2 byte 11.
     */
    private final TradeCaptureReportAcknowledgmentV2ReturnBitfield11Field tradeCaptureReportAcknowledgmentV2ReturnBitfield11 = new TradeCaptureReportAcknowledgmentV2ReturnBitfield11Field();

    /**
     * BitSet TradeCaptureReportAcknowledgmentV2 byte 12.
     */
    private final TradeCaptureReportAcknowledgmentV2ReturnBitfield12Field tradeCaptureReportAcknowledgmentV2ReturnBitfield12 = new TradeCaptureReportAcknowledgmentV2ReturnBitfield12Field();

    /**
     * BitSet TradeCaptureReportAcknowledgmentV2 byte 13.
     */
    private final TradeCaptureReportAcknowledgmentV2ReturnBitfield13Field tradeCaptureReportAcknowledgmentV2ReturnBitfield13 = new TradeCaptureReportAcknowledgmentV2ReturnBitfield13Field();

    /**
     * BitSet TradeCaptureReportAcknowledgmentV2 byte 14.
     */
    private final TradeCaptureReportAcknowledgmentV2ReturnBitfield14Field tradeCaptureReportAcknowledgmentV2ReturnBitfield14 = new TradeCaptureReportAcknowledgmentV2ReturnBitfield14Field();

    /**
     * BitSet TradeCaptureReportAcknowledgmentV2 byte 15.
     */
    private final TradeCaptureReportAcknowledgmentV2ReturnBitfield15Field tradeCaptureReportAcknowledgmentV2ReturnBitfield15 = new TradeCaptureReportAcknowledgmentV2ReturnBitfield15Field();

    /**
     * BitSet TradeCaptureReportAcknowledgmentV2 byte 16.
     */
    private final TradeCaptureReportAcknowledgmentV2ReturnBitfield16Field tradeCaptureReportAcknowledgmentV2ReturnBitfield16 = new TradeCaptureReportAcknowledgmentV2ReturnBitfield16Field();

    /**
     * BitSet TradeCaptureReportAcknowledgmentV2 byte 17.
     */
    private final TradeCaptureReportAcknowledgmentV2ReturnBitfield17Field tradeCaptureReportAcknowledgmentV2ReturnBitfield17 = new TradeCaptureReportAcknowledgmentV2ReturnBitfield17Field();

    /**
     * BitSet TradeCaptureReportAcknowledgmentV2 byte 18.
     */
    private final TradeCaptureReportAcknowledgmentV2ReturnBitfield18Field tradeCaptureReportAcknowledgmentV2ReturnBitfield18 = new TradeCaptureReportAcknowledgmentV2ReturnBitfield18Field();

    /**
     * BitSet TradeCaptureReportAcknowledgmentV2 byte 19.
     */
    private final TradeCaptureReportAcknowledgmentV2ReturnBitfield19Field tradeCaptureReportAcknowledgmentV2ReturnBitfield19 = new TradeCaptureReportAcknowledgmentV2ReturnBitfield19Field();

    /**
     * Corresponds to NoSides (552) in Cboe FIX. Indicates the number of repeating groups to fol- low. Must be 2.
     */
    private final NoSidesField noSides = new NoSidesField();

    /**
     * Symbol Alphanumeric
     */
    private final SymbolAlphanumericField2 symbolAlphanumeric = new SymbolAlphanumericField2();

    /**
     * Id Source
     */
    private final IdSourceField idSource = new IdSourceField();

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Clearing Firm
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Corresponds to OrderQty (38) in Cboe FIX. Order quantity. System limit is 999,999 con- tracts.
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Ext Exec Inst
     */
    private final ExtExecInstField extExecInst = new ExtExecInstField();

    /**
     * Trade Report Type Return
     */
    private final TradeReportTypeReturnField tradeReportTypeReturn = new TradeReportTypeReturnField();

    /**
     * Trade Report Ref Id
     */
    private final TradeReportRefIdField tradeReportRefId = new TradeReportRefIdField();

    /**
     * Order Category
     */
    private final OrderCategoryField orderCategory = new OrderCategoryField();

    /**
     * Liquidity Provision
     */
    private final LiquidityProvisionField liquidityProvision = new LiquidityProvisionField();

    /**
     * Price Formation
     */
    private final PriceFormationField priceFormation = new PriceFormationField();

    /**
     * Algorithmic Indicator
     */
    private final AlgorithmicIndicatorField algorithmicIndicator = new AlgorithmicIndicatorField();

    /**
     * Repeating group stated NoSides times.
     */
    private final TrdCapAckSideGrpList trdCapAckSideGrp = new TrdCapAckSideGrpList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, tradeReportId, numberOfReturnBitfields, tradeCaptureReportAcknowledgmentV2ReturnBitfield1, tradeCaptureReportAcknowledgmentV2ReturnBitfield2, tradeCaptureReportAcknowledgmentV2ReturnBitfield3, tradeCaptureReportAcknowledgmentV2ReturnBitfield4, tradeCaptureReportAcknowledgmentV2ReturnBitfield5, tradeCaptureReportAcknowledgmentV2ReturnBitfield6, tradeCaptureReportAcknowledgmentV2ReturnBitfield7, tradeCaptureReportAcknowledgmentV2ReturnBitfield8, tradeCaptureReportAcknowledgmentV2ReturnBitfield9, tradeCaptureReportAcknowledgmentV2ReturnBitfield10, tradeCaptureReportAcknowledgmentV2ReturnBitfield11, tradeCaptureReportAcknowledgmentV2ReturnBitfield12, tradeCaptureReportAcknowledgmentV2ReturnBitfield13, tradeCaptureReportAcknowledgmentV2ReturnBitfield14, tradeCaptureReportAcknowledgmentV2ReturnBitfield15, tradeCaptureReportAcknowledgmentV2ReturnBitfield16, tradeCaptureReportAcknowledgmentV2ReturnBitfield17, tradeCaptureReportAcknowledgmentV2ReturnBitfield18, tradeCaptureReportAcknowledgmentV2ReturnBitfield19, noSides, symbolAlphanumeric, idSource, securityId, clearingFirm, orderQty, extExecInst, tradeReportTypeReturn, tradeReportRefId, orderCategory, liquidityProvision, priceFormation, algorithmicIndicator);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time the event occurred in the Cboe match- ing engine (not the time the message was sent).
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * Corresponds to TradeReportID (571) in Cboe FIX. Day-unique ID chosen by client. Cboe will en- force port level day-uniqueness. 20 characters or less. Characters in ASCII range 33–126 are allowed, except for comma, semi- colon, and pipe. If the TradeReportID matches a live trade report (one that has been acked, but not confirmed or declined), it will be rejected as duplicate.
     *
     * @return the TradeReportId field
     */
    public TradeReportIdField tradeReportId() {
        return tradeReportId;
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
     * BitSet TradeCaptureReportAcknowledgmentV2 byte 1.
     *
     * @return the TradeCaptureReportAcknowledgmentV2ReturnBitfield1 field
     */
    public TradeCaptureReportAcknowledgmentV2ReturnBitfield1Field tradeCaptureReportAcknowledgmentV2ReturnBitfield1() {
        return tradeCaptureReportAcknowledgmentV2ReturnBitfield1;
    }

    /**
     * BitSet TradeCaptureReportAcknowledgmentV2 byte 2.
     *
     * @return the TradeCaptureReportAcknowledgmentV2ReturnBitfield2 field
     */
    public TradeCaptureReportAcknowledgmentV2ReturnBitfield2Field tradeCaptureReportAcknowledgmentV2ReturnBitfield2() {
        return tradeCaptureReportAcknowledgmentV2ReturnBitfield2;
    }

    /**
     * BitSet TradeCaptureReportAcknowledgmentV2 byte 3.
     *
     * @return the TradeCaptureReportAcknowledgmentV2ReturnBitfield3 field
     */
    public TradeCaptureReportAcknowledgmentV2ReturnBitfield3Field tradeCaptureReportAcknowledgmentV2ReturnBitfield3() {
        return tradeCaptureReportAcknowledgmentV2ReturnBitfield3;
    }

    /**
     * BitSet TradeCaptureReportAcknowledgmentV2 byte 4.
     *
     * @return the TradeCaptureReportAcknowledgmentV2ReturnBitfield4 field
     */
    public TradeCaptureReportAcknowledgmentV2ReturnBitfield4Field tradeCaptureReportAcknowledgmentV2ReturnBitfield4() {
        return tradeCaptureReportAcknowledgmentV2ReturnBitfield4;
    }

    /**
     * BitSet TradeCaptureReportAcknowledgmentV2 byte 5.
     *
     * @return the TradeCaptureReportAcknowledgmentV2ReturnBitfield5 field
     */
    public TradeCaptureReportAcknowledgmentV2ReturnBitfield5Field tradeCaptureReportAcknowledgmentV2ReturnBitfield5() {
        return tradeCaptureReportAcknowledgmentV2ReturnBitfield5;
    }

    /**
     * BitSet TradeCaptureReportAcknowledgmentV2 byte 6.
     *
     * @return the TradeCaptureReportAcknowledgmentV2ReturnBitfield6 field
     */
    public TradeCaptureReportAcknowledgmentV2ReturnBitfield6Field tradeCaptureReportAcknowledgmentV2ReturnBitfield6() {
        return tradeCaptureReportAcknowledgmentV2ReturnBitfield6;
    }

    /**
     * BitSet TradeCaptureReportAcknowledgmentV2 byte 7.
     *
     * @return the TradeCaptureReportAcknowledgmentV2ReturnBitfield7 field
     */
    public TradeCaptureReportAcknowledgmentV2ReturnBitfield7Field tradeCaptureReportAcknowledgmentV2ReturnBitfield7() {
        return tradeCaptureReportAcknowledgmentV2ReturnBitfield7;
    }

    /**
     * BitSet TradeCaptureReportAcknowledgmentV2 byte 8.
     *
     * @return the TradeCaptureReportAcknowledgmentV2ReturnBitfield8 field
     */
    public TradeCaptureReportAcknowledgmentV2ReturnBitfield8Field tradeCaptureReportAcknowledgmentV2ReturnBitfield8() {
        return tradeCaptureReportAcknowledgmentV2ReturnBitfield8;
    }

    /**
     * BitSet TradeCaptureReportAcknowledgmentV2 byte 9.
     *
     * @return the TradeCaptureReportAcknowledgmentV2ReturnBitfield9 field
     */
    public TradeCaptureReportAcknowledgmentV2ReturnBitfield9Field tradeCaptureReportAcknowledgmentV2ReturnBitfield9() {
        return tradeCaptureReportAcknowledgmentV2ReturnBitfield9;
    }

    /**
     * BitSet TradeCaptureReportAcknowledgmentV2 byte 10.
     *
     * @return the TradeCaptureReportAcknowledgmentV2ReturnBitfield10 field
     */
    public TradeCaptureReportAcknowledgmentV2ReturnBitfield10Field tradeCaptureReportAcknowledgmentV2ReturnBitfield10() {
        return tradeCaptureReportAcknowledgmentV2ReturnBitfield10;
    }

    /**
     * BitSet TradeCaptureReportAcknowledgmentV2 byte 11.
     *
     * @return the TradeCaptureReportAcknowledgmentV2ReturnBitfield11 field
     */
    public TradeCaptureReportAcknowledgmentV2ReturnBitfield11Field tradeCaptureReportAcknowledgmentV2ReturnBitfield11() {
        return tradeCaptureReportAcknowledgmentV2ReturnBitfield11;
    }

    /**
     * BitSet TradeCaptureReportAcknowledgmentV2 byte 12.
     *
     * @return the TradeCaptureReportAcknowledgmentV2ReturnBitfield12 field
     */
    public TradeCaptureReportAcknowledgmentV2ReturnBitfield12Field tradeCaptureReportAcknowledgmentV2ReturnBitfield12() {
        return tradeCaptureReportAcknowledgmentV2ReturnBitfield12;
    }

    /**
     * BitSet TradeCaptureReportAcknowledgmentV2 byte 13.
     *
     * @return the TradeCaptureReportAcknowledgmentV2ReturnBitfield13 field
     */
    public TradeCaptureReportAcknowledgmentV2ReturnBitfield13Field tradeCaptureReportAcknowledgmentV2ReturnBitfield13() {
        return tradeCaptureReportAcknowledgmentV2ReturnBitfield13;
    }

    /**
     * BitSet TradeCaptureReportAcknowledgmentV2 byte 14.
     *
     * @return the TradeCaptureReportAcknowledgmentV2ReturnBitfield14 field
     */
    public TradeCaptureReportAcknowledgmentV2ReturnBitfield14Field tradeCaptureReportAcknowledgmentV2ReturnBitfield14() {
        return tradeCaptureReportAcknowledgmentV2ReturnBitfield14;
    }

    /**
     * BitSet TradeCaptureReportAcknowledgmentV2 byte 15.
     *
     * @return the TradeCaptureReportAcknowledgmentV2ReturnBitfield15 field
     */
    public TradeCaptureReportAcknowledgmentV2ReturnBitfield15Field tradeCaptureReportAcknowledgmentV2ReturnBitfield15() {
        return tradeCaptureReportAcknowledgmentV2ReturnBitfield15;
    }

    /**
     * BitSet TradeCaptureReportAcknowledgmentV2 byte 16.
     *
     * @return the TradeCaptureReportAcknowledgmentV2ReturnBitfield16 field
     */
    public TradeCaptureReportAcknowledgmentV2ReturnBitfield16Field tradeCaptureReportAcknowledgmentV2ReturnBitfield16() {
        return tradeCaptureReportAcknowledgmentV2ReturnBitfield16;
    }

    /**
     * BitSet TradeCaptureReportAcknowledgmentV2 byte 17.
     *
     * @return the TradeCaptureReportAcknowledgmentV2ReturnBitfield17 field
     */
    public TradeCaptureReportAcknowledgmentV2ReturnBitfield17Field tradeCaptureReportAcknowledgmentV2ReturnBitfield17() {
        return tradeCaptureReportAcknowledgmentV2ReturnBitfield17;
    }

    /**
     * BitSet TradeCaptureReportAcknowledgmentV2 byte 18.
     *
     * @return the TradeCaptureReportAcknowledgmentV2ReturnBitfield18 field
     */
    public TradeCaptureReportAcknowledgmentV2ReturnBitfield18Field tradeCaptureReportAcknowledgmentV2ReturnBitfield18() {
        return tradeCaptureReportAcknowledgmentV2ReturnBitfield18;
    }

    /**
     * BitSet TradeCaptureReportAcknowledgmentV2 byte 19.
     *
     * @return the TradeCaptureReportAcknowledgmentV2ReturnBitfield19 field
     */
    public TradeCaptureReportAcknowledgmentV2ReturnBitfield19Field tradeCaptureReportAcknowledgmentV2ReturnBitfield19() {
        return tradeCaptureReportAcknowledgmentV2ReturnBitfield19;
    }

    /**
     * Corresponds to NoSides (552) in Cboe FIX. Indicates the number of repeating groups to fol- low. Must be 2.
     *
     * @return the NoSides field
     */
    public NoSidesField noSides() {
        return noSides;
    }

    /**
     * Symbol Alphanumeric
     *
     * @return the SymbolAlphanumeric field
     */
    public SymbolAlphanumericField2 symbolAlphanumeric() {
        return symbolAlphanumeric;
    }

    /**
     * Id Source
     *
     * @return the IdSource field
     */
    public IdSourceField idSource() {
        return idSource;
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
     * Clearing Firm
     *
     * @return the ClearingFirm field
     */
    public ClearingFirmField clearingFirm() {
        return clearingFirm;
    }

    /**
     * Corresponds to OrderQty (38) in Cboe FIX. Order quantity. System limit is 999,999 con- tracts.
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * Ext Exec Inst
     *
     * @return the ExtExecInst field
     */
    public ExtExecInstField extExecInst() {
        return extExecInst;
    }

    /**
     * Trade Report Type Return
     *
     * @return the TradeReportTypeReturn field
     */
    public TradeReportTypeReturnField tradeReportTypeReturn() {
        return tradeReportTypeReturn;
    }

    /**
     * Trade Report Ref Id
     *
     * @return the TradeReportRefId field
     */
    public TradeReportRefIdField tradeReportRefId() {
        return tradeReportRefId;
    }

    /**
     * Order Category
     *
     * @return the OrderCategory field
     */
    public OrderCategoryField orderCategory() {
        return orderCategory;
    }

    /**
     * Liquidity Provision
     *
     * @return the LiquidityProvision field
     */
    public LiquidityProvisionField liquidityProvision() {
        return liquidityProvision;
    }

    /**
     * Price Formation
     *
     * @return the PriceFormation field
     */
    public PriceFormationField priceFormation() {
        return priceFormation;
    }

    /**
     * Algorithmic Indicator
     *
     * @return the AlgorithmicIndicator field
     */
    public AlgorithmicIndicatorField algorithmicIndicator() {
        return algorithmicIndicator;
    }

    /**
     * Repeating group stated NoSides times.
     *
     * <p>Encode writes this list's size to the NoSides field.</p>
     *
     * @return the TrdCapAckSideGrp entries
     */
    public TrdCapAckSideGrpList trdCapAckSideGrp() {
        return trdCapAckSideGrp;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportAcknowledgmentV2ReturnBitfield1 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportAcknowledgmentV2ReturnBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportAcknowledgmentV2ReturnBitfield1 is on the wire
     */
    public boolean tradeCaptureReportAcknowledgmentV2ReturnBitfield1Present() {
        return numberOfReturnBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportAcknowledgmentV2ReturnBitfield2 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportAcknowledgmentV2ReturnBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportAcknowledgmentV2ReturnBitfield2 is on the wire
     */
    public boolean tradeCaptureReportAcknowledgmentV2ReturnBitfield2Present() {
        return numberOfReturnBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportAcknowledgmentV2ReturnBitfield3 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportAcknowledgmentV2ReturnBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportAcknowledgmentV2ReturnBitfield3 is on the wire
     */
    public boolean tradeCaptureReportAcknowledgmentV2ReturnBitfield3Present() {
        return numberOfReturnBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportAcknowledgmentV2ReturnBitfield4 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportAcknowledgmentV2ReturnBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportAcknowledgmentV2ReturnBitfield4 is on the wire
     */
    public boolean tradeCaptureReportAcknowledgmentV2ReturnBitfield4Present() {
        return numberOfReturnBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportAcknowledgmentV2ReturnBitfield5 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportAcknowledgmentV2ReturnBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportAcknowledgmentV2ReturnBitfield5 is on the wire
     */
    public boolean tradeCaptureReportAcknowledgmentV2ReturnBitfield5Present() {
        return numberOfReturnBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportAcknowledgmentV2ReturnBitfield6 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportAcknowledgmentV2ReturnBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportAcknowledgmentV2ReturnBitfield6 is on the wire
     */
    public boolean tradeCaptureReportAcknowledgmentV2ReturnBitfield6Present() {
        return numberOfReturnBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportAcknowledgmentV2ReturnBitfield7 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportAcknowledgmentV2ReturnBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportAcknowledgmentV2ReturnBitfield7 is on the wire
     */
    public boolean tradeCaptureReportAcknowledgmentV2ReturnBitfield7Present() {
        return numberOfReturnBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportAcknowledgmentV2ReturnBitfield8 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportAcknowledgmentV2ReturnBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportAcknowledgmentV2ReturnBitfield8 is on the wire
     */
    public boolean tradeCaptureReportAcknowledgmentV2ReturnBitfield8Present() {
        return numberOfReturnBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportAcknowledgmentV2ReturnBitfield9 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportAcknowledgmentV2ReturnBitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportAcknowledgmentV2ReturnBitfield9 is on the wire
     */
    public boolean tradeCaptureReportAcknowledgmentV2ReturnBitfield9Present() {
        return numberOfReturnBitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportAcknowledgmentV2ReturnBitfield10 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportAcknowledgmentV2ReturnBitfield10 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportAcknowledgmentV2ReturnBitfield10 is on the wire
     */
    public boolean tradeCaptureReportAcknowledgmentV2ReturnBitfield10Present() {
        return numberOfReturnBitfields.value() >= 10L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportAcknowledgmentV2ReturnBitfield11 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportAcknowledgmentV2ReturnBitfield11 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportAcknowledgmentV2ReturnBitfield11 is on the wire
     */
    public boolean tradeCaptureReportAcknowledgmentV2ReturnBitfield11Present() {
        return numberOfReturnBitfields.value() >= 11L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportAcknowledgmentV2ReturnBitfield12 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportAcknowledgmentV2ReturnBitfield12 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportAcknowledgmentV2ReturnBitfield12 is on the wire
     */
    public boolean tradeCaptureReportAcknowledgmentV2ReturnBitfield12Present() {
        return numberOfReturnBitfields.value() >= 12L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportAcknowledgmentV2ReturnBitfield13 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportAcknowledgmentV2ReturnBitfield13 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportAcknowledgmentV2ReturnBitfield13 is on the wire
     */
    public boolean tradeCaptureReportAcknowledgmentV2ReturnBitfield13Present() {
        return numberOfReturnBitfields.value() >= 13L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportAcknowledgmentV2ReturnBitfield14 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportAcknowledgmentV2ReturnBitfield14 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportAcknowledgmentV2ReturnBitfield14 is on the wire
     */
    public boolean tradeCaptureReportAcknowledgmentV2ReturnBitfield14Present() {
        return numberOfReturnBitfields.value() >= 14L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportAcknowledgmentV2ReturnBitfield15 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportAcknowledgmentV2ReturnBitfield15 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportAcknowledgmentV2ReturnBitfield15 is on the wire
     */
    public boolean tradeCaptureReportAcknowledgmentV2ReturnBitfield15Present() {
        return numberOfReturnBitfields.value() >= 15L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportAcknowledgmentV2ReturnBitfield16 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportAcknowledgmentV2ReturnBitfield16 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportAcknowledgmentV2ReturnBitfield16 is on the wire
     */
    public boolean tradeCaptureReportAcknowledgmentV2ReturnBitfield16Present() {
        return numberOfReturnBitfields.value() >= 16L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportAcknowledgmentV2ReturnBitfield17 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportAcknowledgmentV2ReturnBitfield17 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportAcknowledgmentV2ReturnBitfield17 is on the wire
     */
    public boolean tradeCaptureReportAcknowledgmentV2ReturnBitfield17Present() {
        return numberOfReturnBitfields.value() >= 17L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportAcknowledgmentV2ReturnBitfield18 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportAcknowledgmentV2ReturnBitfield18 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportAcknowledgmentV2ReturnBitfield18 is on the wire
     */
    public boolean tradeCaptureReportAcknowledgmentV2ReturnBitfield18Present() {
        return numberOfReturnBitfields.value() >= 18L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportAcknowledgmentV2ReturnBitfield19 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportAcknowledgmentV2ReturnBitfield19 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportAcknowledgmentV2ReturnBitfield19 is on the wire
     */
    public boolean tradeCaptureReportAcknowledgmentV2ReturnBitfield19Present() {
        return numberOfReturnBitfields.value() >= 19L;
    }

    /**
     * Returns whether the fields before the SymbolAlphanumeric put it on the wire.
     *
     * <p>Decode reads the SymbolAlphanumeric where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolAlphanumeric is on the wire
     */
    public boolean symbolAlphanumericPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (tradeCaptureReportAcknowledgmentV2ReturnBitfield2Present() && tradeCaptureReportAcknowledgmentV2ReturnBitfield2.tradeCaptureReportAcknowledgmentV2ReturnBitfield2Symbol());
    }

    /**
     * Returns whether the fields before the IdSource put it on the wire.
     *
     * <p>Decode reads the IdSource where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the IdSource is on the wire
     */
    public boolean idSourcePresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (tradeCaptureReportAcknowledgmentV2ReturnBitfield2Present() && tradeCaptureReportAcknowledgmentV2ReturnBitfield2.tradeCaptureReportAcknowledgmentV2ReturnBitfield2IdSource());
    }

    /**
     * Returns whether the fields before the SecurityId put it on the wire.
     *
     * <p>Decode reads the SecurityId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecurityId is on the wire
     */
    public boolean securityIdPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (tradeCaptureReportAcknowledgmentV2ReturnBitfield2Present() && tradeCaptureReportAcknowledgmentV2ReturnBitfield2.tradeCaptureReportAcknowledgmentV2ReturnBitfield2SecurityId());
    }

    /**
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (tradeCaptureReportAcknowledgmentV2ReturnBitfield3Present() && tradeCaptureReportAcknowledgmentV2ReturnBitfield3.tradeCaptureReportAcknowledgmentV2ReturnBitfield3ClearingFirm());
    }

    /**
     * Returns whether the fields before the OrderQty put it on the wire.
     *
     * <p>Decode reads the OrderQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderQty is on the wire
     */
    public boolean orderQtyPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (tradeCaptureReportAcknowledgmentV2ReturnBitfield3Present() && tradeCaptureReportAcknowledgmentV2ReturnBitfield3.tradeCaptureReportAcknowledgmentV2ReturnBitfield3OrderQty());
    }

    /**
     * Returns whether the fields before the ExtExecInst put it on the wire.
     *
     * <p>Decode reads the ExtExecInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExtExecInst is on the wire
     */
    public boolean extExecInstPresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (tradeCaptureReportAcknowledgmentV2ReturnBitfield6Present() && tradeCaptureReportAcknowledgmentV2ReturnBitfield6.tradeCaptureReportAcknowledgmentV2ReturnBitfield6ExtExecInst());
    }

    /**
     * Returns whether the fields before the TradeReportTypeReturn put it on the wire.
     *
     * <p>Decode reads the TradeReportTypeReturn where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeReportTypeReturn is on the wire
     */
    public boolean tradeReportTypeReturnPresent() {
        return (numberOfReturnBitfields.value() >= 7L) && (tradeCaptureReportAcknowledgmentV2ReturnBitfield7Present() && tradeCaptureReportAcknowledgmentV2ReturnBitfield7.tradeCaptureReportAcknowledgmentV2ReturnBitfield7TradeReportTypeReturn());
    }

    /**
     * Returns whether the fields before the TradeReportRefId put it on the wire.
     *
     * <p>Decode reads the TradeReportRefId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeReportRefId is on the wire
     */
    public boolean tradeReportRefIdPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (tradeCaptureReportAcknowledgmentV2ReturnBitfield8Present() && tradeCaptureReportAcknowledgmentV2ReturnBitfield8.tradeCaptureReportAcknowledgmentV2ReturnBitfield8TradeReportRefId());
    }

    /**
     * Returns whether the fields before the OrderCategory put it on the wire.
     *
     * <p>Decode reads the OrderCategory where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderCategory is on the wire
     */
    public boolean orderCategoryPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (tradeCaptureReportAcknowledgmentV2ReturnBitfield9Present() && tradeCaptureReportAcknowledgmentV2ReturnBitfield9.tradeCaptureReportAcknowledgmentV2ReturnBitfield9OrderCategory());
    }

    /**
     * Returns whether the fields before the LiquidityProvision put it on the wire.
     *
     * <p>Decode reads the LiquidityProvision where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LiquidityProvision is on the wire
     */
    public boolean liquidityProvisionPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (tradeCaptureReportAcknowledgmentV2ReturnBitfield9Present() && tradeCaptureReportAcknowledgmentV2ReturnBitfield9.tradeCaptureReportAcknowledgmentV2ReturnBitfield9LiquidityProvision());
    }

    /**
     * Returns whether the fields before the PriceFormation put it on the wire.
     *
     * <p>Decode reads the PriceFormation where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PriceFormation is on the wire
     */
    public boolean priceFormationPresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (tradeCaptureReportAcknowledgmentV2ReturnBitfield10Present() && tradeCaptureReportAcknowledgmentV2ReturnBitfield10.tradeCaptureReportAcknowledgmentV2ReturnBitfield10PriceFormation());
    }

    /**
     * Returns whether the fields before the AlgorithmicIndicator put it on the wire.
     *
     * <p>Decode reads the AlgorithmicIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AlgorithmicIndicator is on the wire
     */
    public boolean algorithmicIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (tradeCaptureReportAcknowledgmentV2ReturnBitfield11Present() && tradeCaptureReportAcknowledgmentV2ReturnBitfield11.tradeCaptureReportAcknowledgmentV2ReturnBitfield11AlgorithmicIndicator());
    }

    private boolean onWire(Field field) {
        return (field != tradeCaptureReportAcknowledgmentV2ReturnBitfield1 || tradeCaptureReportAcknowledgmentV2ReturnBitfield1Present()) && (field != tradeCaptureReportAcknowledgmentV2ReturnBitfield2 || tradeCaptureReportAcknowledgmentV2ReturnBitfield2Present()) && (field != tradeCaptureReportAcknowledgmentV2ReturnBitfield3 || tradeCaptureReportAcknowledgmentV2ReturnBitfield3Present()) && (field != tradeCaptureReportAcknowledgmentV2ReturnBitfield4 || tradeCaptureReportAcknowledgmentV2ReturnBitfield4Present()) && (field != tradeCaptureReportAcknowledgmentV2ReturnBitfield5 || tradeCaptureReportAcknowledgmentV2ReturnBitfield5Present()) && (field != tradeCaptureReportAcknowledgmentV2ReturnBitfield6 || tradeCaptureReportAcknowledgmentV2ReturnBitfield6Present()) && (field != tradeCaptureReportAcknowledgmentV2ReturnBitfield7 || tradeCaptureReportAcknowledgmentV2ReturnBitfield7Present()) && (field != tradeCaptureReportAcknowledgmentV2ReturnBitfield8 || tradeCaptureReportAcknowledgmentV2ReturnBitfield8Present()) && (field != tradeCaptureReportAcknowledgmentV2ReturnBitfield9 || tradeCaptureReportAcknowledgmentV2ReturnBitfield9Present()) && (field != tradeCaptureReportAcknowledgmentV2ReturnBitfield10 || tradeCaptureReportAcknowledgmentV2ReturnBitfield10Present()) && (field != tradeCaptureReportAcknowledgmentV2ReturnBitfield11 || tradeCaptureReportAcknowledgmentV2ReturnBitfield11Present()) && (field != tradeCaptureReportAcknowledgmentV2ReturnBitfield12 || tradeCaptureReportAcknowledgmentV2ReturnBitfield12Present()) && (field != tradeCaptureReportAcknowledgmentV2ReturnBitfield13 || tradeCaptureReportAcknowledgmentV2ReturnBitfield13Present()) && (field != tradeCaptureReportAcknowledgmentV2ReturnBitfield14 || tradeCaptureReportAcknowledgmentV2ReturnBitfield14Present()) && (field != tradeCaptureReportAcknowledgmentV2ReturnBitfield15 || tradeCaptureReportAcknowledgmentV2ReturnBitfield15Present()) && (field != tradeCaptureReportAcknowledgmentV2ReturnBitfield16 || tradeCaptureReportAcknowledgmentV2ReturnBitfield16Present()) && (field != tradeCaptureReportAcknowledgmentV2ReturnBitfield17 || tradeCaptureReportAcknowledgmentV2ReturnBitfield17Present()) && (field != tradeCaptureReportAcknowledgmentV2ReturnBitfield18 || tradeCaptureReportAcknowledgmentV2ReturnBitfield18Present()) && (field != tradeCaptureReportAcknowledgmentV2ReturnBitfield19 || tradeCaptureReportAcknowledgmentV2ReturnBitfield19Present()) && (field != symbolAlphanumeric || symbolAlphanumericPresent()) && (field != idSource || idSourcePresent()) && (field != securityId || securityIdPresent()) && (field != clearingFirm || clearingFirmPresent()) && (field != orderQty || orderQtyPresent()) && (field != extExecInst || extExecInstPresent()) && (field != tradeReportTypeReturn || tradeReportTypeReturnPresent()) && (field != tradeReportRefId || tradeReportRefIdPresent()) && (field != orderCategory || orderCategoryPresent()) && (field != liquidityProvision || liquidityProvisionPresent()) && (field != priceFormation || priceFormationPresent()) && (field != algorithmicIndicator || algorithmicIndicatorPresent());
    }

    /**
     * Hands each list whose entries read this record's fields the values they read, none for a field off the wire.
     */
    private void giveEntryInputs() {
        trdCapAckSideGrp.inputs(OptionalLong.of(numberOfReturnBitfields.value()), tradeCaptureReportAcknowledgmentV2ReturnBitfield1Present() ? OptionalLong.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield1.value()) : OptionalLong.empty(), tradeCaptureReportAcknowledgmentV2ReturnBitfield2Present() ? OptionalLong.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield2.value()) : OptionalLong.empty(), tradeCaptureReportAcknowledgmentV2ReturnBitfield3Present() ? OptionalLong.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield3.value()) : OptionalLong.empty(), tradeCaptureReportAcknowledgmentV2ReturnBitfield4Present() ? OptionalLong.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield4.value()) : OptionalLong.empty(), tradeCaptureReportAcknowledgmentV2ReturnBitfield6Present() ? OptionalLong.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield6.value()) : OptionalLong.empty(), tradeCaptureReportAcknowledgmentV2ReturnBitfield17Present() ? OptionalLong.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield17.value()) : OptionalLong.empty(), tradeCaptureReportAcknowledgmentV2ReturnBitfield18Present() ? OptionalLong.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield18.value()) : OptionalLong.empty());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        giveEntryInputs();
        return MINIMUM_BYTE_LENGTH + (tradeCaptureReportAcknowledgmentV2ReturnBitfield1Present() ? TradeCaptureReportAcknowledgmentV2ReturnBitfield1Field.BYTE_LENGTH : 0) + (tradeCaptureReportAcknowledgmentV2ReturnBitfield2Present() ? TradeCaptureReportAcknowledgmentV2ReturnBitfield2Field.BYTE_LENGTH : 0) + (tradeCaptureReportAcknowledgmentV2ReturnBitfield3Present() ? TradeCaptureReportAcknowledgmentV2ReturnBitfield3Field.BYTE_LENGTH : 0) + (tradeCaptureReportAcknowledgmentV2ReturnBitfield4Present() ? TradeCaptureReportAcknowledgmentV2ReturnBitfield4Field.BYTE_LENGTH : 0) + (tradeCaptureReportAcknowledgmentV2ReturnBitfield5Present() ? TradeCaptureReportAcknowledgmentV2ReturnBitfield5Field.BYTE_LENGTH : 0) + (tradeCaptureReportAcknowledgmentV2ReturnBitfield6Present() ? TradeCaptureReportAcknowledgmentV2ReturnBitfield6Field.BYTE_LENGTH : 0) + (tradeCaptureReportAcknowledgmentV2ReturnBitfield7Present() ? TradeCaptureReportAcknowledgmentV2ReturnBitfield7Field.BYTE_LENGTH : 0) + (tradeCaptureReportAcknowledgmentV2ReturnBitfield8Present() ? TradeCaptureReportAcknowledgmentV2ReturnBitfield8Field.BYTE_LENGTH : 0) + (tradeCaptureReportAcknowledgmentV2ReturnBitfield9Present() ? TradeCaptureReportAcknowledgmentV2ReturnBitfield9Field.BYTE_LENGTH : 0) + (tradeCaptureReportAcknowledgmentV2ReturnBitfield10Present() ? TradeCaptureReportAcknowledgmentV2ReturnBitfield10Field.BYTE_LENGTH : 0) + (tradeCaptureReportAcknowledgmentV2ReturnBitfield11Present() ? TradeCaptureReportAcknowledgmentV2ReturnBitfield11Field.BYTE_LENGTH : 0) + (tradeCaptureReportAcknowledgmentV2ReturnBitfield12Present() ? TradeCaptureReportAcknowledgmentV2ReturnBitfield12Field.BYTE_LENGTH : 0) + (tradeCaptureReportAcknowledgmentV2ReturnBitfield13Present() ? TradeCaptureReportAcknowledgmentV2ReturnBitfield13Field.BYTE_LENGTH : 0) + (tradeCaptureReportAcknowledgmentV2ReturnBitfield14Present() ? TradeCaptureReportAcknowledgmentV2ReturnBitfield14Field.BYTE_LENGTH : 0) + (tradeCaptureReportAcknowledgmentV2ReturnBitfield15Present() ? TradeCaptureReportAcknowledgmentV2ReturnBitfield15Field.BYTE_LENGTH : 0) + (tradeCaptureReportAcknowledgmentV2ReturnBitfield16Present() ? TradeCaptureReportAcknowledgmentV2ReturnBitfield16Field.BYTE_LENGTH : 0) + (tradeCaptureReportAcknowledgmentV2ReturnBitfield17Present() ? TradeCaptureReportAcknowledgmentV2ReturnBitfield17Field.BYTE_LENGTH : 0) + (tradeCaptureReportAcknowledgmentV2ReturnBitfield18Present() ? TradeCaptureReportAcknowledgmentV2ReturnBitfield18Field.BYTE_LENGTH : 0) + (tradeCaptureReportAcknowledgmentV2ReturnBitfield19Present() ? TradeCaptureReportAcknowledgmentV2ReturnBitfield19Field.BYTE_LENGTH : 0) + trdCapAckSideGrp.byteLength() + (symbolAlphanumericPresent() ? SymbolAlphanumericField2.BYTE_LENGTH : 0) + (idSourcePresent() ? IdSourceField.BYTE_LENGTH : 0) + (securityIdPresent() ? SecurityIdField.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (orderQtyPresent() ? OrderQtyField.BYTE_LENGTH : 0) + (extExecInstPresent() ? ExtExecInstField.BYTE_LENGTH : 0) + (tradeReportTypeReturnPresent() ? TradeReportTypeReturnField.BYTE_LENGTH : 0) + (tradeReportRefIdPresent() ? TradeReportRefIdField.BYTE_LENGTH : 0) + (orderCategoryPresent() ? OrderCategoryField.BYTE_LENGTH : 0) + (liquidityProvisionPresent() ? LiquidityProvisionField.BYTE_LENGTH : 0) + (priceFormationPresent() ? PriceFormationField.BYTE_LENGTH : 0) + (algorithmicIndicatorPresent() ? AlgorithmicIndicatorField.BYTE_LENGTH : 0);
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
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 1;
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield1Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield2Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield3Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield4Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield5Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield6Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield7Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield8Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield9Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield10Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield11Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield12Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield13Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield14Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield15Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield16Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield17Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield18Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield19Present()) {
            cursor += 1;
        }
        cursor += 1;
        cursor += trdCapAckSideGrp.byteLength();
        if (symbolAlphanumericPresent()) {
            cursor += 8;
        }
        if (idSourcePresent()) {
            cursor += 1;
        }
        if (securityIdPresent()) {
            cursor += 16;
        }
        if (clearingFirmPresent()) {
            cursor += 4;
        }
        if (orderQtyPresent()) {
            cursor += 4;
        }
        if (extExecInstPresent()) {
            cursor += 1;
        }
        if (tradeReportTypeReturnPresent()) {
            cursor += 2;
        }
        if (tradeReportRefIdPresent()) {
            cursor += 20;
        }
        if (orderCategoryPresent()) {
            cursor += 1;
        }
        if (liquidityProvisionPresent()) {
            cursor += 1;
        }
        if (priceFormationPresent()) {
            cursor += 1;
        }
        if (algorithmicIndicatorPresent()) {
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
        if (!tradeReportId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReportIdField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!numberOfReturnBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfReturnBitfieldsField.BYTE_LENGTH;
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield1Present()) {
            if (end - 1 - cursor < TradeCaptureReportAcknowledgmentV2ReturnBitfield1Field.BYTE_LENGTH || !tradeCaptureReportAcknowledgmentV2ReturnBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportAcknowledgmentV2ReturnBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield2Present()) {
            if (end - 1 - cursor < TradeCaptureReportAcknowledgmentV2ReturnBitfield2Field.BYTE_LENGTH || !tradeCaptureReportAcknowledgmentV2ReturnBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportAcknowledgmentV2ReturnBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield3Present()) {
            if (end - 1 - cursor < TradeCaptureReportAcknowledgmentV2ReturnBitfield3Field.BYTE_LENGTH || !tradeCaptureReportAcknowledgmentV2ReturnBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportAcknowledgmentV2ReturnBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield4Present()) {
            if (end - 1 - cursor < TradeCaptureReportAcknowledgmentV2ReturnBitfield4Field.BYTE_LENGTH || !tradeCaptureReportAcknowledgmentV2ReturnBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportAcknowledgmentV2ReturnBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield5Present()) {
            if (end - 1 - cursor < TradeCaptureReportAcknowledgmentV2ReturnBitfield5Field.BYTE_LENGTH || !tradeCaptureReportAcknowledgmentV2ReturnBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportAcknowledgmentV2ReturnBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield6Present()) {
            if (end - 1 - cursor < TradeCaptureReportAcknowledgmentV2ReturnBitfield6Field.BYTE_LENGTH || !tradeCaptureReportAcknowledgmentV2ReturnBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportAcknowledgmentV2ReturnBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield7Present()) {
            if (end - 1 - cursor < TradeCaptureReportAcknowledgmentV2ReturnBitfield7Field.BYTE_LENGTH || !tradeCaptureReportAcknowledgmentV2ReturnBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportAcknowledgmentV2ReturnBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield8Present()) {
            if (end - 1 - cursor < TradeCaptureReportAcknowledgmentV2ReturnBitfield8Field.BYTE_LENGTH || !tradeCaptureReportAcknowledgmentV2ReturnBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportAcknowledgmentV2ReturnBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield9Present()) {
            if (end - 1 - cursor < TradeCaptureReportAcknowledgmentV2ReturnBitfield9Field.BYTE_LENGTH || !tradeCaptureReportAcknowledgmentV2ReturnBitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportAcknowledgmentV2ReturnBitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield10Present()) {
            if (end - 1 - cursor < TradeCaptureReportAcknowledgmentV2ReturnBitfield10Field.BYTE_LENGTH || !tradeCaptureReportAcknowledgmentV2ReturnBitfield10.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportAcknowledgmentV2ReturnBitfield10Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield11Present()) {
            if (end - 1 - cursor < TradeCaptureReportAcknowledgmentV2ReturnBitfield11Field.BYTE_LENGTH || !tradeCaptureReportAcknowledgmentV2ReturnBitfield11.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportAcknowledgmentV2ReturnBitfield11Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield12Present()) {
            if (end - 1 - cursor < TradeCaptureReportAcknowledgmentV2ReturnBitfield12Field.BYTE_LENGTH || !tradeCaptureReportAcknowledgmentV2ReturnBitfield12.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportAcknowledgmentV2ReturnBitfield12Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield13Present()) {
            if (end - 1 - cursor < TradeCaptureReportAcknowledgmentV2ReturnBitfield13Field.BYTE_LENGTH || !tradeCaptureReportAcknowledgmentV2ReturnBitfield13.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportAcknowledgmentV2ReturnBitfield13Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield14Present()) {
            if (end - 1 - cursor < TradeCaptureReportAcknowledgmentV2ReturnBitfield14Field.BYTE_LENGTH || !tradeCaptureReportAcknowledgmentV2ReturnBitfield14.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportAcknowledgmentV2ReturnBitfield14Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield15Present()) {
            if (end - 1 - cursor < TradeCaptureReportAcknowledgmentV2ReturnBitfield15Field.BYTE_LENGTH || !tradeCaptureReportAcknowledgmentV2ReturnBitfield15.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportAcknowledgmentV2ReturnBitfield15Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield16Present()) {
            if (end - 1 - cursor < TradeCaptureReportAcknowledgmentV2ReturnBitfield16Field.BYTE_LENGTH || !tradeCaptureReportAcknowledgmentV2ReturnBitfield16.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportAcknowledgmentV2ReturnBitfield16Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield17Present()) {
            if (end - 1 - cursor < TradeCaptureReportAcknowledgmentV2ReturnBitfield17Field.BYTE_LENGTH || !tradeCaptureReportAcknowledgmentV2ReturnBitfield17.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportAcknowledgmentV2ReturnBitfield17Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield18Present()) {
            if (end - 1 - cursor < TradeCaptureReportAcknowledgmentV2ReturnBitfield18Field.BYTE_LENGTH || !tradeCaptureReportAcknowledgmentV2ReturnBitfield18.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportAcknowledgmentV2ReturnBitfield18Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield19Present()) {
            if (end - 1 - cursor < TradeCaptureReportAcknowledgmentV2ReturnBitfield19Field.BYTE_LENGTH || !tradeCaptureReportAcknowledgmentV2ReturnBitfield19.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportAcknowledgmentV2ReturnBitfield19Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (!noSides.parse(data, cursor)) {
            return false;
        }
        cursor += NoSidesField.BYTE_LENGTH;
        giveEntryInputs();
        if (!trdCapAckSideGrp.parse(data, cursor, end, noSides.value())) {
            return false;
        }
        cursor += trdCapAckSideGrp.byteLength();
        if (end - cursor < 0) {
            return false;
        }
        if (symbolAlphanumericPresent()) {
            if (end - cursor < SymbolAlphanumericField2.BYTE_LENGTH || !symbolAlphanumeric.parse(data, cursor)) {
                return false;
            }
            cursor += SymbolAlphanumericField2.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (idSourcePresent()) {
            if (end - cursor < IdSourceField.BYTE_LENGTH || !idSource.parse(data, cursor)) {
                return false;
            }
            cursor += IdSourceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (securityIdPresent()) {
            if (end - cursor < SecurityIdField.BYTE_LENGTH || !securityId.parse(data, cursor)) {
                return false;
            }
            cursor += SecurityIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (clearingFirmPresent()) {
            if (end - cursor < ClearingFirmField.BYTE_LENGTH || !clearingFirm.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingFirmField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderQtyPresent()) {
            if (end - cursor < OrderQtyField.BYTE_LENGTH || !orderQty.parse(data, cursor)) {
                return false;
            }
            cursor += OrderQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (extExecInstPresent()) {
            if (end - cursor < ExtExecInstField.BYTE_LENGTH || !extExecInst.parse(data, cursor)) {
                return false;
            }
            cursor += ExtExecInstField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeReportTypeReturnPresent()) {
            if (end - cursor < TradeReportTypeReturnField.BYTE_LENGTH || !tradeReportTypeReturn.parse(data, cursor)) {
                return false;
            }
            cursor += TradeReportTypeReturnField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeReportRefIdPresent()) {
            if (end - cursor < TradeReportRefIdField.BYTE_LENGTH || !tradeReportRefId.parse(data, cursor)) {
                return false;
            }
            cursor += TradeReportRefIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderCategoryPresent()) {
            if (end - cursor < OrderCategoryField.BYTE_LENGTH || !orderCategory.parse(data, cursor)) {
                return false;
            }
            cursor += OrderCategoryField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (liquidityProvisionPresent()) {
            if (end - cursor < LiquidityProvisionField.BYTE_LENGTH || !liquidityProvision.parse(data, cursor)) {
                return false;
            }
            cursor += LiquidityProvisionField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (priceFormationPresent()) {
            if (end - cursor < PriceFormationField.BYTE_LENGTH || !priceFormation.parse(data, cursor)) {
                return false;
            }
            cursor += PriceFormationField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (algorithmicIndicatorPresent()) {
            if (end - cursor < AlgorithmicIndicatorField.BYTE_LENGTH || !algorithmicIndicator.parse(data, cursor)) {
                return false;
            }
            cursor += AlgorithmicIndicatorField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (trdCapAckSideGrp.size() > 255) {
            throw new IllegalStateException("trdCapAckSideGrp holds " + trdCapAckSideGrp.size() + " entries, more than its count field can state");
        }
        noSides.value((short) trdCapAckSideGrp.size());
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield1Present() != tradeCaptureReportAcknowledgmentV2ReturnBitfield1.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportAcknowledgmentV2ReturnBitfield1.hasValue() ? "tradeCaptureReportAcknowledgmentV2ReturnBitfield1 holds a value the fields before it leave off the wire" : "tradeCaptureReportAcknowledgmentV2ReturnBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield2Present() != tradeCaptureReportAcknowledgmentV2ReturnBitfield2.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportAcknowledgmentV2ReturnBitfield2.hasValue() ? "tradeCaptureReportAcknowledgmentV2ReturnBitfield2 holds a value the fields before it leave off the wire" : "tradeCaptureReportAcknowledgmentV2ReturnBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield3Present() != tradeCaptureReportAcknowledgmentV2ReturnBitfield3.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportAcknowledgmentV2ReturnBitfield3.hasValue() ? "tradeCaptureReportAcknowledgmentV2ReturnBitfield3 holds a value the fields before it leave off the wire" : "tradeCaptureReportAcknowledgmentV2ReturnBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield4Present() != tradeCaptureReportAcknowledgmentV2ReturnBitfield4.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportAcknowledgmentV2ReturnBitfield4.hasValue() ? "tradeCaptureReportAcknowledgmentV2ReturnBitfield4 holds a value the fields before it leave off the wire" : "tradeCaptureReportAcknowledgmentV2ReturnBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield5Present() != tradeCaptureReportAcknowledgmentV2ReturnBitfield5.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportAcknowledgmentV2ReturnBitfield5.hasValue() ? "tradeCaptureReportAcknowledgmentV2ReturnBitfield5 holds a value the fields before it leave off the wire" : "tradeCaptureReportAcknowledgmentV2ReturnBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield6Present() != tradeCaptureReportAcknowledgmentV2ReturnBitfield6.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportAcknowledgmentV2ReturnBitfield6.hasValue() ? "tradeCaptureReportAcknowledgmentV2ReturnBitfield6 holds a value the fields before it leave off the wire" : "tradeCaptureReportAcknowledgmentV2ReturnBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield7Present() != tradeCaptureReportAcknowledgmentV2ReturnBitfield7.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportAcknowledgmentV2ReturnBitfield7.hasValue() ? "tradeCaptureReportAcknowledgmentV2ReturnBitfield7 holds a value the fields before it leave off the wire" : "tradeCaptureReportAcknowledgmentV2ReturnBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield8Present() != tradeCaptureReportAcknowledgmentV2ReturnBitfield8.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportAcknowledgmentV2ReturnBitfield8.hasValue() ? "tradeCaptureReportAcknowledgmentV2ReturnBitfield8 holds a value the fields before it leave off the wire" : "tradeCaptureReportAcknowledgmentV2ReturnBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield9Present() != tradeCaptureReportAcknowledgmentV2ReturnBitfield9.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportAcknowledgmentV2ReturnBitfield9.hasValue() ? "tradeCaptureReportAcknowledgmentV2ReturnBitfield9 holds a value the fields before it leave off the wire" : "tradeCaptureReportAcknowledgmentV2ReturnBitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield10Present() != tradeCaptureReportAcknowledgmentV2ReturnBitfield10.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportAcknowledgmentV2ReturnBitfield10.hasValue() ? "tradeCaptureReportAcknowledgmentV2ReturnBitfield10 holds a value the fields before it leave off the wire" : "tradeCaptureReportAcknowledgmentV2ReturnBitfield10 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield11Present() != tradeCaptureReportAcknowledgmentV2ReturnBitfield11.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportAcknowledgmentV2ReturnBitfield11.hasValue() ? "tradeCaptureReportAcknowledgmentV2ReturnBitfield11 holds a value the fields before it leave off the wire" : "tradeCaptureReportAcknowledgmentV2ReturnBitfield11 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield12Present() != tradeCaptureReportAcknowledgmentV2ReturnBitfield12.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportAcknowledgmentV2ReturnBitfield12.hasValue() ? "tradeCaptureReportAcknowledgmentV2ReturnBitfield12 holds a value the fields before it leave off the wire" : "tradeCaptureReportAcknowledgmentV2ReturnBitfield12 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield13Present() != tradeCaptureReportAcknowledgmentV2ReturnBitfield13.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportAcknowledgmentV2ReturnBitfield13.hasValue() ? "tradeCaptureReportAcknowledgmentV2ReturnBitfield13 holds a value the fields before it leave off the wire" : "tradeCaptureReportAcknowledgmentV2ReturnBitfield13 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield14Present() != tradeCaptureReportAcknowledgmentV2ReturnBitfield14.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportAcknowledgmentV2ReturnBitfield14.hasValue() ? "tradeCaptureReportAcknowledgmentV2ReturnBitfield14 holds a value the fields before it leave off the wire" : "tradeCaptureReportAcknowledgmentV2ReturnBitfield14 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield15Present() != tradeCaptureReportAcknowledgmentV2ReturnBitfield15.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportAcknowledgmentV2ReturnBitfield15.hasValue() ? "tradeCaptureReportAcknowledgmentV2ReturnBitfield15 holds a value the fields before it leave off the wire" : "tradeCaptureReportAcknowledgmentV2ReturnBitfield15 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield16Present() != tradeCaptureReportAcknowledgmentV2ReturnBitfield16.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportAcknowledgmentV2ReturnBitfield16.hasValue() ? "tradeCaptureReportAcknowledgmentV2ReturnBitfield16 holds a value the fields before it leave off the wire" : "tradeCaptureReportAcknowledgmentV2ReturnBitfield16 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield17Present() != tradeCaptureReportAcknowledgmentV2ReturnBitfield17.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportAcknowledgmentV2ReturnBitfield17.hasValue() ? "tradeCaptureReportAcknowledgmentV2ReturnBitfield17 holds a value the fields before it leave off the wire" : "tradeCaptureReportAcknowledgmentV2ReturnBitfield17 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield18Present() != tradeCaptureReportAcknowledgmentV2ReturnBitfield18.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportAcknowledgmentV2ReturnBitfield18.hasValue() ? "tradeCaptureReportAcknowledgmentV2ReturnBitfield18 holds a value the fields before it leave off the wire" : "tradeCaptureReportAcknowledgmentV2ReturnBitfield18 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield19Present() != tradeCaptureReportAcknowledgmentV2ReturnBitfield19.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportAcknowledgmentV2ReturnBitfield19.hasValue() ? "tradeCaptureReportAcknowledgmentV2ReturnBitfield19 holds a value the fields before it leave off the wire" : "tradeCaptureReportAcknowledgmentV2ReturnBitfield19 holds no value, though the fields before it put it on the wire");
        }
        if (symbolAlphanumericPresent() != symbolAlphanumeric.hasValue()) {
            throw new IllegalStateException(symbolAlphanumeric.hasValue() ? "symbolAlphanumeric holds a value the fields before it leave off the wire" : "symbolAlphanumeric holds no value, though the fields before it put it on the wire");
        }
        if (idSourcePresent() != idSource.hasValue()) {
            throw new IllegalStateException(idSource.hasValue() ? "idSource holds a value the fields before it leave off the wire" : "idSource holds no value, though the fields before it put it on the wire");
        }
        if (securityIdPresent() != securityId.hasValue()) {
            throw new IllegalStateException(securityId.hasValue() ? "securityId holds a value the fields before it leave off the wire" : "securityId holds no value, though the fields before it put it on the wire");
        }
        if (clearingFirmPresent() != clearingFirm.hasValue()) {
            throw new IllegalStateException(clearingFirm.hasValue() ? "clearingFirm holds a value the fields before it leave off the wire" : "clearingFirm holds no value, though the fields before it put it on the wire");
        }
        if (orderQtyPresent() != orderQty.hasValue()) {
            throw new IllegalStateException(orderQty.hasValue() ? "orderQty holds a value the fields before it leave off the wire" : "orderQty holds no value, though the fields before it put it on the wire");
        }
        if (extExecInstPresent() != extExecInst.hasValue()) {
            throw new IllegalStateException(extExecInst.hasValue() ? "extExecInst holds a value the fields before it leave off the wire" : "extExecInst holds no value, though the fields before it put it on the wire");
        }
        if (tradeReportTypeReturnPresent() != tradeReportTypeReturn.hasValue()) {
            throw new IllegalStateException(tradeReportTypeReturn.hasValue() ? "tradeReportTypeReturn holds a value the fields before it leave off the wire" : "tradeReportTypeReturn holds no value, though the fields before it put it on the wire");
        }
        if (tradeReportRefIdPresent() != tradeReportRefId.hasValue()) {
            throw new IllegalStateException(tradeReportRefId.hasValue() ? "tradeReportRefId holds a value the fields before it leave off the wire" : "tradeReportRefId holds no value, though the fields before it put it on the wire");
        }
        if (orderCategoryPresent() != orderCategory.hasValue()) {
            throw new IllegalStateException(orderCategory.hasValue() ? "orderCategory holds a value the fields before it leave off the wire" : "orderCategory holds no value, though the fields before it put it on the wire");
        }
        if (liquidityProvisionPresent() != liquidityProvision.hasValue()) {
            throw new IllegalStateException(liquidityProvision.hasValue() ? "liquidityProvision holds a value the fields before it leave off the wire" : "liquidityProvision holds no value, though the fields before it put it on the wire");
        }
        if (priceFormationPresent() != priceFormation.hasValue()) {
            throw new IllegalStateException(priceFormation.hasValue() ? "priceFormation holds a value the fields before it leave off the wire" : "priceFormation holds no value, though the fields before it put it on the wire");
        }
        if (algorithmicIndicatorPresent() != algorithmicIndicator.hasValue()) {
            throw new IllegalStateException(algorithmicIndicator.hasValue() ? "algorithmicIndicator holds a value the fields before it leave off the wire" : "algorithmicIndicator holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = transactionTime.encode(data, cursor);
        cursor = tradeReportId.encode(data, cursor);
        if (buffer != null && buffer.length >= 29) {
            System.arraycopy(buffer, 28, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = numberOfReturnBitfields.encode(data, cursor);
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield1Present()) {
            cursor = tradeCaptureReportAcknowledgmentV2ReturnBitfield1.encode(data, cursor);
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield2Present()) {
            cursor = tradeCaptureReportAcknowledgmentV2ReturnBitfield2.encode(data, cursor);
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield3Present()) {
            cursor = tradeCaptureReportAcknowledgmentV2ReturnBitfield3.encode(data, cursor);
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield4Present()) {
            cursor = tradeCaptureReportAcknowledgmentV2ReturnBitfield4.encode(data, cursor);
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield5Present()) {
            cursor = tradeCaptureReportAcknowledgmentV2ReturnBitfield5.encode(data, cursor);
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield6Present()) {
            cursor = tradeCaptureReportAcknowledgmentV2ReturnBitfield6.encode(data, cursor);
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield7Present()) {
            cursor = tradeCaptureReportAcknowledgmentV2ReturnBitfield7.encode(data, cursor);
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield8Present()) {
            cursor = tradeCaptureReportAcknowledgmentV2ReturnBitfield8.encode(data, cursor);
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield9Present()) {
            cursor = tradeCaptureReportAcknowledgmentV2ReturnBitfield9.encode(data, cursor);
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield10Present()) {
            cursor = tradeCaptureReportAcknowledgmentV2ReturnBitfield10.encode(data, cursor);
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield11Present()) {
            cursor = tradeCaptureReportAcknowledgmentV2ReturnBitfield11.encode(data, cursor);
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield12Present()) {
            cursor = tradeCaptureReportAcknowledgmentV2ReturnBitfield12.encode(data, cursor);
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield13Present()) {
            cursor = tradeCaptureReportAcknowledgmentV2ReturnBitfield13.encode(data, cursor);
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield14Present()) {
            cursor = tradeCaptureReportAcknowledgmentV2ReturnBitfield14.encode(data, cursor);
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield15Present()) {
            cursor = tradeCaptureReportAcknowledgmentV2ReturnBitfield15.encode(data, cursor);
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield16Present()) {
            cursor = tradeCaptureReportAcknowledgmentV2ReturnBitfield16.encode(data, cursor);
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield17Present()) {
            cursor = tradeCaptureReportAcknowledgmentV2ReturnBitfield17.encode(data, cursor);
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield18Present()) {
            cursor = tradeCaptureReportAcknowledgmentV2ReturnBitfield18.encode(data, cursor);
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield19Present()) {
            cursor = tradeCaptureReportAcknowledgmentV2ReturnBitfield19.encode(data, cursor);
        }
        cursor = noSides.encode(data, cursor);
        cursor = trdCapAckSideGrp.encode(data, cursor);
        if (symbolAlphanumericPresent()) {
            cursor = symbolAlphanumeric.encode(data, cursor);
        }
        if (idSourcePresent()) {
            cursor = idSource.encode(data, cursor);
        }
        if (securityIdPresent()) {
            cursor = securityId.encode(data, cursor);
        }
        if (clearingFirmPresent()) {
            cursor = clearingFirm.encode(data, cursor);
        }
        if (orderQtyPresent()) {
            cursor = orderQty.encode(data, cursor);
        }
        if (extExecInstPresent()) {
            cursor = extExecInst.encode(data, cursor);
        }
        if (tradeReportTypeReturnPresent()) {
            cursor = tradeReportTypeReturn.encode(data, cursor);
        }
        if (tradeReportRefIdPresent()) {
            cursor = tradeReportRefId.encode(data, cursor);
        }
        if (orderCategoryPresent()) {
            cursor = orderCategory.encode(data, cursor);
        }
        if (liquidityProvisionPresent()) {
            cursor = liquidityProvision.encode(data, cursor);
        }
        if (priceFormationPresent()) {
            cursor = priceFormation.encode(data, cursor);
        }
        if (algorithmicIndicatorPresent()) {
            cursor = algorithmicIndicator.encode(data, cursor);
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
        trdCapAckSideGrp.clear();
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
        for (Field field : fields()) {
            if (field != noSides && !field.isRecognized()) {
                return false;
            }
        }
        return trdCapAckSideGrp.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields()) {
            if (field != noSides && !field.isValid()) {
                return false;
            }
        }
        if (!trdCapAckSideGrp.isValid()) {
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
        if (!transactionTime.isDecoded()) {
            return Optional.of(transactionTime);
        }
        if (!tradeReportId.isDecoded()) {
            return Optional.of(tradeReportId);
        }
        if (!numberOfReturnBitfields.isDecoded()) {
            return Optional.of(numberOfReturnBitfields);
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield1Present() && !tradeCaptureReportAcknowledgmentV2ReturnBitfield1.isDecoded()) {
            return Optional.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield1);
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield2Present() && !tradeCaptureReportAcknowledgmentV2ReturnBitfield2.isDecoded()) {
            return Optional.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield2);
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield3Present() && !tradeCaptureReportAcknowledgmentV2ReturnBitfield3.isDecoded()) {
            return Optional.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield3);
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield4Present() && !tradeCaptureReportAcknowledgmentV2ReturnBitfield4.isDecoded()) {
            return Optional.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield4);
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield5Present() && !tradeCaptureReportAcknowledgmentV2ReturnBitfield5.isDecoded()) {
            return Optional.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield5);
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield6Present() && !tradeCaptureReportAcknowledgmentV2ReturnBitfield6.isDecoded()) {
            return Optional.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield6);
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield7Present() && !tradeCaptureReportAcknowledgmentV2ReturnBitfield7.isDecoded()) {
            return Optional.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield7);
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield8Present() && !tradeCaptureReportAcknowledgmentV2ReturnBitfield8.isDecoded()) {
            return Optional.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield8);
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield9Present() && !tradeCaptureReportAcknowledgmentV2ReturnBitfield9.isDecoded()) {
            return Optional.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield9);
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield10Present() && !tradeCaptureReportAcknowledgmentV2ReturnBitfield10.isDecoded()) {
            return Optional.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield10);
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield11Present() && !tradeCaptureReportAcknowledgmentV2ReturnBitfield11.isDecoded()) {
            return Optional.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield11);
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield12Present() && !tradeCaptureReportAcknowledgmentV2ReturnBitfield12.isDecoded()) {
            return Optional.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield12);
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield13Present() && !tradeCaptureReportAcknowledgmentV2ReturnBitfield13.isDecoded()) {
            return Optional.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield13);
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield14Present() && !tradeCaptureReportAcknowledgmentV2ReturnBitfield14.isDecoded()) {
            return Optional.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield14);
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield15Present() && !tradeCaptureReportAcknowledgmentV2ReturnBitfield15.isDecoded()) {
            return Optional.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield15);
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield16Present() && !tradeCaptureReportAcknowledgmentV2ReturnBitfield16.isDecoded()) {
            return Optional.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield16);
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield17Present() && !tradeCaptureReportAcknowledgmentV2ReturnBitfield17.isDecoded()) {
            return Optional.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield17);
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield18Present() && !tradeCaptureReportAcknowledgmentV2ReturnBitfield18.isDecoded()) {
            return Optional.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield18);
        }
        if (tradeCaptureReportAcknowledgmentV2ReturnBitfield19Present() && !tradeCaptureReportAcknowledgmentV2ReturnBitfield19.isDecoded()) {
            return Optional.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield19);
        }
        if (!noSides.isDecoded()) {
            return Optional.of(noSides);
        }
        if (!trdCapAckSideGrp.isDecoded()) {
            return Optional.of(trdCapAckSideGrp.failedEntry().flatMap(TrdCapAckSideGrpEntry::failedAt).orElse(noSides));
        }
        if (symbolAlphanumericPresent() && !symbolAlphanumeric.isDecoded()) {
            return Optional.of(symbolAlphanumeric);
        }
        if (idSourcePresent() && !idSource.isDecoded()) {
            return Optional.of(idSource);
        }
        if (securityIdPresent() && !securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (clearingFirmPresent() && !clearingFirm.isDecoded()) {
            return Optional.of(clearingFirm);
        }
        if (orderQtyPresent() && !orderQty.isDecoded()) {
            return Optional.of(orderQty);
        }
        if (extExecInstPresent() && !extExecInst.isDecoded()) {
            return Optional.of(extExecInst);
        }
        if (tradeReportTypeReturnPresent() && !tradeReportTypeReturn.isDecoded()) {
            return Optional.of(tradeReportTypeReturn);
        }
        if (tradeReportRefIdPresent() && !tradeReportRefId.isDecoded()) {
            return Optional.of(tradeReportRefId);
        }
        if (orderCategoryPresent() && !orderCategory.isDecoded()) {
            return Optional.of(orderCategory);
        }
        if (liquidityProvisionPresent() && !liquidityProvision.isDecoded()) {
            return Optional.of(liquidityProvision);
        }
        if (priceFormationPresent() && !priceFormation.isDecoded()) {
            return Optional.of(priceFormation);
        }
        if (algorithmicIndicatorPresent() && !algorithmicIndicator.isDecoded()) {
            return Optional.of(algorithmicIndicator);
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
            case "TradeReportId" -> Optional.of(tradeReportId);
            case "NumberOfReturnBitfields" -> Optional.of(numberOfReturnBitfields);
            case "TradeCaptureReportAcknowledgmentV2ReturnBitfield1" -> Optional.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield1);
            case "TradeCaptureReportAcknowledgmentV2ReturnBitfield2" -> Optional.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield2);
            case "TradeCaptureReportAcknowledgmentV2ReturnBitfield3" -> Optional.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield3);
            case "TradeCaptureReportAcknowledgmentV2ReturnBitfield4" -> Optional.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield4);
            case "TradeCaptureReportAcknowledgmentV2ReturnBitfield5" -> Optional.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield5);
            case "TradeCaptureReportAcknowledgmentV2ReturnBitfield6" -> Optional.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield6);
            case "TradeCaptureReportAcknowledgmentV2ReturnBitfield7" -> Optional.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield7);
            case "TradeCaptureReportAcknowledgmentV2ReturnBitfield8" -> Optional.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield8);
            case "TradeCaptureReportAcknowledgmentV2ReturnBitfield9" -> Optional.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield9);
            case "TradeCaptureReportAcknowledgmentV2ReturnBitfield10" -> Optional.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield10);
            case "TradeCaptureReportAcknowledgmentV2ReturnBitfield11" -> Optional.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield11);
            case "TradeCaptureReportAcknowledgmentV2ReturnBitfield12" -> Optional.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield12);
            case "TradeCaptureReportAcknowledgmentV2ReturnBitfield13" -> Optional.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield13);
            case "TradeCaptureReportAcknowledgmentV2ReturnBitfield14" -> Optional.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield14);
            case "TradeCaptureReportAcknowledgmentV2ReturnBitfield15" -> Optional.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield15);
            case "TradeCaptureReportAcknowledgmentV2ReturnBitfield16" -> Optional.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield16);
            case "TradeCaptureReportAcknowledgmentV2ReturnBitfield17" -> Optional.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield17);
            case "TradeCaptureReportAcknowledgmentV2ReturnBitfield18" -> Optional.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield18);
            case "TradeCaptureReportAcknowledgmentV2ReturnBitfield19" -> Optional.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield19);
            case "NoSides" -> Optional.of(noSides);
            case "SymbolAlphanumeric" -> Optional.of(symbolAlphanumeric);
            case "IdSource" -> Optional.of(idSource);
            case "SecurityId" -> Optional.of(securityId);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "OrderQty" -> Optional.of(orderQty);
            case "ExtExecInst" -> Optional.of(extExecInst);
            case "TradeReportTypeReturn" -> Optional.of(tradeReportTypeReturn);
            case "TradeReportRefId" -> Optional.of(tradeReportRefId);
            case "OrderCategory" -> Optional.of(orderCategory);
            case "LiquidityProvision" -> Optional.of(liquidityProvision);
            case "PriceFormation" -> Optional.of(priceFormation);
            case "AlgorithmicIndicator" -> Optional.of(algorithmicIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeCaptureReportAcknowledgmentV2Message message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(trdCapAckSideGrp.diffFields(message.trdCapAckSideGrp));
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

        List<Field> onWire = fields();
        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < onWire.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                onWire.get(index).toFormattedString(builder, options);
            }
            builder.append(", ");
            trdCapAckSideGrp.toFormattedString(builder, options);
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
        trdCapAckSideGrp.toFormattedString(builder, nested);
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
        if (!(other instanceof TradeCaptureReportAcknowledgmentV2Message message)) {
            return false;
        }
        return fields.equals(message.fields) && trdCapAckSideGrp.equals(message.trdCapAckSideGrp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, trdCapAckSideGrp);
    }
}
