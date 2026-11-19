package omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.AlgorithmicIndicatorField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.AllocQtyField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CancelRejectReasonField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CancelRejectedV2ReturnBitfield10Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CancelRejectedV2ReturnBitfield11Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CancelRejectedV2ReturnBitfield12Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CancelRejectedV2ReturnBitfield13Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CancelRejectedV2ReturnBitfield14Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CancelRejectedV2ReturnBitfield15Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CancelRejectedV2ReturnBitfield16Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CancelRejectedV2ReturnBitfield17Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CancelRejectedV2ReturnBitfield18Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CancelRejectedV2ReturnBitfield19Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CancelRejectedV2ReturnBitfield1Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CancelRejectedV2ReturnBitfield2Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CancelRejectedV2ReturnBitfield3Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CancelRejectedV2ReturnBitfield4Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CancelRejectedV2ReturnBitfield5Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CancelRejectedV2ReturnBitfield6Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CancelRejectedV2ReturnBitfield7Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CancelRejectedV2ReturnBitfield8Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CancelRejectedV2ReturnBitfield9Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CapacityField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.ClOrdIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.ClientIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.ClientQualifiedRoleField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.ExecutorIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.ExecutorQualifiedRoleField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.IdSourceField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.InvestorIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.InvestorQualifiedRoleField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.LiquidityProvisionField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.MassCancelIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.MinQtyField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.NumberOfReturnBitfieldsField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.OpenCloseField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.OrdTypeField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.OrderOriginationField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.PriceField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.SecurityIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.SideField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.StopPxField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.SymbolAlphanumericField2;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TextField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TimeInForceField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TransactionTimeField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.types.Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.types.Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.types.PrintOptions;

/**
 * Represents the CancelRejectedV2Message message from the BinaryOrderEntry protocol.
 *
 * <p>Cancel Rejected V2 Message.</p>
 */
public final class CancelRejectedV2Message implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 91;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Cancel Rejected V 2 Message";

    /**
     * The time the event occurred in the Cboe match- ing engine (not the time the message was sent).
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. Day-unique ID chosen by the client. Characters in the ASCII range 33–126 are allowed, except for comma, semicolon, and pipe. A leading tilde (˜) cannot be sent on any ClOrdId and will result in a reject. These are reserved for internal use by Cboe and could be received as a result of a system generated ClOrdId. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders. However, we strongly recommend that you keep your ClOrdID values day-unique.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Reason for a cancel rejection. See Reason Codes (§ 7.1, p. 196) for a list of possible reasons.
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
     * BitSet CancelRejectedV2 byte 1.
     */
    private final CancelRejectedV2ReturnBitfield1Field cancelRejectedV2ReturnBitfield1 = new CancelRejectedV2ReturnBitfield1Field();

    /**
     * BitSet CancelRejectedV2 byte 2.
     */
    private final CancelRejectedV2ReturnBitfield2Field cancelRejectedV2ReturnBitfield2 = new CancelRejectedV2ReturnBitfield2Field();

    /**
     * BitSet CancelRejectedV2 byte 3.
     */
    private final CancelRejectedV2ReturnBitfield3Field cancelRejectedV2ReturnBitfield3 = new CancelRejectedV2ReturnBitfield3Field();

    /**
     * BitSet CancelRejectedV2 byte 4.
     */
    private final CancelRejectedV2ReturnBitfield4Field cancelRejectedV2ReturnBitfield4 = new CancelRejectedV2ReturnBitfield4Field();

    /**
     * BitSet CancelRejectedV2 byte 5.
     */
    private final CancelRejectedV2ReturnBitfield5Field cancelRejectedV2ReturnBitfield5 = new CancelRejectedV2ReturnBitfield5Field();

    /**
     * BitSet CancelRejectedV2 byte 6.
     */
    private final CancelRejectedV2ReturnBitfield6Field cancelRejectedV2ReturnBitfield6 = new CancelRejectedV2ReturnBitfield6Field();

    /**
     * BitSet CancelRejectedV2 byte 7.
     */
    private final CancelRejectedV2ReturnBitfield7Field cancelRejectedV2ReturnBitfield7 = new CancelRejectedV2ReturnBitfield7Field();

    /**
     * BitSet CancelRejectedV2 byte 8.
     */
    private final CancelRejectedV2ReturnBitfield8Field cancelRejectedV2ReturnBitfield8 = new CancelRejectedV2ReturnBitfield8Field();

    /**
     * BitSet CancelRejectedV2 byte 9.
     */
    private final CancelRejectedV2ReturnBitfield9Field cancelRejectedV2ReturnBitfield9 = new CancelRejectedV2ReturnBitfield9Field();

    /**
     * BitSet CancelRejectedV2 byte 10.
     */
    private final CancelRejectedV2ReturnBitfield10Field cancelRejectedV2ReturnBitfield10 = new CancelRejectedV2ReturnBitfield10Field();

    /**
     * BitSet CancelRejectedV2 byte 11.
     */
    private final CancelRejectedV2ReturnBitfield11Field cancelRejectedV2ReturnBitfield11 = new CancelRejectedV2ReturnBitfield11Field();

    /**
     * BitSet CancelRejectedV2 byte 12.
     */
    private final CancelRejectedV2ReturnBitfield12Field cancelRejectedV2ReturnBitfield12 = new CancelRejectedV2ReturnBitfield12Field();

    /**
     * BitSet CancelRejectedV2 byte 13.
     */
    private final CancelRejectedV2ReturnBitfield13Field cancelRejectedV2ReturnBitfield13 = new CancelRejectedV2ReturnBitfield13Field();

    /**
     * BitSet CancelRejectedV2 byte 14.
     */
    private final CancelRejectedV2ReturnBitfield14Field cancelRejectedV2ReturnBitfield14 = new CancelRejectedV2ReturnBitfield14Field();

    /**
     * BitSet CancelRejectedV2 byte 15.
     */
    private final CancelRejectedV2ReturnBitfield15Field cancelRejectedV2ReturnBitfield15 = new CancelRejectedV2ReturnBitfield15Field();

    /**
     * BitSet CancelRejectedV2 byte 16.
     */
    private final CancelRejectedV2ReturnBitfield16Field cancelRejectedV2ReturnBitfield16 = new CancelRejectedV2ReturnBitfield16Field();

    /**
     * BitSet CancelRejectedV2 byte 17.
     */
    private final CancelRejectedV2ReturnBitfield17Field cancelRejectedV2ReturnBitfield17 = new CancelRejectedV2ReturnBitfield17Field();

    /**
     * BitSet CancelRejectedV2 byte 18.
     */
    private final CancelRejectedV2ReturnBitfield18Field cancelRejectedV2ReturnBitfield18 = new CancelRejectedV2ReturnBitfield18Field();

    /**
     * BitSet CancelRejectedV2 byte 19.
     */
    private final CancelRejectedV2ReturnBitfield19Field cancelRejectedV2ReturnBitfield19 = new CancelRejectedV2ReturnBitfield19Field();

    /**
     * Corresponds to Side (54) in Cboe FIX. 1 = Buy 2 = Sell
     */
    private final SideField side = new SideField();

    /**
     * Price
     */
    private final PriceField price = new PriceField();

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
     * Capacity
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * Open Close
     */
    private final OpenCloseField openClose = new OpenCloseField();

    /**
     * Stop Px
     */
    private final StopPxField stopPx = new StopPxField();

    /**
     * Liquidity Provision
     */
    private final LiquidityProvisionField liquidityProvision = new LiquidityProvisionField();

    /**
     * Corresponds to CrossID (548) in Cboe FIX. Day-unique identifier for the cross order chosen by the client. Characters in the ASCII range 33– 126 are allowed, except for comma, semicolon, and pipe.
     */
    private final CrossIdField crossId = new CrossIdField();

    /**
     * Alloc Qty
     */
    private final AllocQtyField allocQty = new AllocQtyField();

    /**
     * Client Qualified Role
     */
    private final ClientQualifiedRoleField clientQualifiedRole = new ClientQualifiedRoleField();

    /**
     * Client Id
     */
    private final ClientIdField clientId = new ClientIdField();

    /**
     * Investor Id
     */
    private final InvestorIdField investorId = new InvestorIdField();

    /**
     * Executor Id
     */
    private final ExecutorIdField executorId = new ExecutorIdField();

    /**
     * Order Origination
     */
    private final OrderOriginationField orderOrigination = new OrderOriginationField();

    /**
     * Algorithmic Indicator
     */
    private final AlgorithmicIndicatorField algorithmicIndicator = new AlgorithmicIndicatorField();

    /**
     * Investor Qualified Role
     */
    private final InvestorQualifiedRoleField investorQualifiedRole = new InvestorQualifiedRoleField();

    /**
     * Executor Qualified Role
     */
    private final ExecutorQualifiedRoleField executorQualifiedRole = new ExecutorQualifiedRoleField();

    /**
     * Mass Cancel Id
     */
    private final MassCancelIdField massCancelId = new MassCancelIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, clOrdId, cancelRejectReason, text, numberOfReturnBitfields, cancelRejectedV2ReturnBitfield1, cancelRejectedV2ReturnBitfield2, cancelRejectedV2ReturnBitfield3, cancelRejectedV2ReturnBitfield4, cancelRejectedV2ReturnBitfield5, cancelRejectedV2ReturnBitfield6, cancelRejectedV2ReturnBitfield7, cancelRejectedV2ReturnBitfield8, cancelRejectedV2ReturnBitfield9, cancelRejectedV2ReturnBitfield10, cancelRejectedV2ReturnBitfield11, cancelRejectedV2ReturnBitfield12, cancelRejectedV2ReturnBitfield13, cancelRejectedV2ReturnBitfield14, cancelRejectedV2ReturnBitfield15, cancelRejectedV2ReturnBitfield16, cancelRejectedV2ReturnBitfield17, cancelRejectedV2ReturnBitfield18, cancelRejectedV2ReturnBitfield19, side, price, ordType, timeInForce, minQty, symbolAlphanumeric, idSource, securityId, capacity, openClose, stopPx, liquidityProvision, crossId, allocQty, clientQualifiedRole, clientId, investorId, executorId, orderOrigination, algorithmicIndicator, investorQualifiedRole, executorQualifiedRole, massCancelId);

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
     * Corresponds to ClOrdID (11) in Cboe FIX. Day-unique ID chosen by the client. Characters in the ASCII range 33–126 are allowed, except for comma, semicolon, and pipe. A leading tilde (˜) cannot be sent on any ClOrdId and will result in a reject. These are reserved for internal use by Cboe and could be received as a result of a system generated ClOrdId. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders. However, we strongly recommend that you keep your ClOrdID values day-unique.
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Reason for a cancel rejection. See Reason Codes (§ 7.1, p. 196) for a list of possible reasons.
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
     * BitSet CancelRejectedV2 byte 1.
     *
     * @return the CancelRejectedV2ReturnBitfield1 field
     */
    public CancelRejectedV2ReturnBitfield1Field cancelRejectedV2ReturnBitfield1() {
        return cancelRejectedV2ReturnBitfield1;
    }

    /**
     * BitSet CancelRejectedV2 byte 2.
     *
     * @return the CancelRejectedV2ReturnBitfield2 field
     */
    public CancelRejectedV2ReturnBitfield2Field cancelRejectedV2ReturnBitfield2() {
        return cancelRejectedV2ReturnBitfield2;
    }

    /**
     * BitSet CancelRejectedV2 byte 3.
     *
     * @return the CancelRejectedV2ReturnBitfield3 field
     */
    public CancelRejectedV2ReturnBitfield3Field cancelRejectedV2ReturnBitfield3() {
        return cancelRejectedV2ReturnBitfield3;
    }

    /**
     * BitSet CancelRejectedV2 byte 4.
     *
     * @return the CancelRejectedV2ReturnBitfield4 field
     */
    public CancelRejectedV2ReturnBitfield4Field cancelRejectedV2ReturnBitfield4() {
        return cancelRejectedV2ReturnBitfield4;
    }

    /**
     * BitSet CancelRejectedV2 byte 5.
     *
     * @return the CancelRejectedV2ReturnBitfield5 field
     */
    public CancelRejectedV2ReturnBitfield5Field cancelRejectedV2ReturnBitfield5() {
        return cancelRejectedV2ReturnBitfield5;
    }

    /**
     * BitSet CancelRejectedV2 byte 6.
     *
     * @return the CancelRejectedV2ReturnBitfield6 field
     */
    public CancelRejectedV2ReturnBitfield6Field cancelRejectedV2ReturnBitfield6() {
        return cancelRejectedV2ReturnBitfield6;
    }

    /**
     * BitSet CancelRejectedV2 byte 7.
     *
     * @return the CancelRejectedV2ReturnBitfield7 field
     */
    public CancelRejectedV2ReturnBitfield7Field cancelRejectedV2ReturnBitfield7() {
        return cancelRejectedV2ReturnBitfield7;
    }

    /**
     * BitSet CancelRejectedV2 byte 8.
     *
     * @return the CancelRejectedV2ReturnBitfield8 field
     */
    public CancelRejectedV2ReturnBitfield8Field cancelRejectedV2ReturnBitfield8() {
        return cancelRejectedV2ReturnBitfield8;
    }

    /**
     * BitSet CancelRejectedV2 byte 9.
     *
     * @return the CancelRejectedV2ReturnBitfield9 field
     */
    public CancelRejectedV2ReturnBitfield9Field cancelRejectedV2ReturnBitfield9() {
        return cancelRejectedV2ReturnBitfield9;
    }

    /**
     * BitSet CancelRejectedV2 byte 10.
     *
     * @return the CancelRejectedV2ReturnBitfield10 field
     */
    public CancelRejectedV2ReturnBitfield10Field cancelRejectedV2ReturnBitfield10() {
        return cancelRejectedV2ReturnBitfield10;
    }

    /**
     * BitSet CancelRejectedV2 byte 11.
     *
     * @return the CancelRejectedV2ReturnBitfield11 field
     */
    public CancelRejectedV2ReturnBitfield11Field cancelRejectedV2ReturnBitfield11() {
        return cancelRejectedV2ReturnBitfield11;
    }

    /**
     * BitSet CancelRejectedV2 byte 12.
     *
     * @return the CancelRejectedV2ReturnBitfield12 field
     */
    public CancelRejectedV2ReturnBitfield12Field cancelRejectedV2ReturnBitfield12() {
        return cancelRejectedV2ReturnBitfield12;
    }

    /**
     * BitSet CancelRejectedV2 byte 13.
     *
     * @return the CancelRejectedV2ReturnBitfield13 field
     */
    public CancelRejectedV2ReturnBitfield13Field cancelRejectedV2ReturnBitfield13() {
        return cancelRejectedV2ReturnBitfield13;
    }

    /**
     * BitSet CancelRejectedV2 byte 14.
     *
     * @return the CancelRejectedV2ReturnBitfield14 field
     */
    public CancelRejectedV2ReturnBitfield14Field cancelRejectedV2ReturnBitfield14() {
        return cancelRejectedV2ReturnBitfield14;
    }

    /**
     * BitSet CancelRejectedV2 byte 15.
     *
     * @return the CancelRejectedV2ReturnBitfield15 field
     */
    public CancelRejectedV2ReturnBitfield15Field cancelRejectedV2ReturnBitfield15() {
        return cancelRejectedV2ReturnBitfield15;
    }

    /**
     * BitSet CancelRejectedV2 byte 16.
     *
     * @return the CancelRejectedV2ReturnBitfield16 field
     */
    public CancelRejectedV2ReturnBitfield16Field cancelRejectedV2ReturnBitfield16() {
        return cancelRejectedV2ReturnBitfield16;
    }

    /**
     * BitSet CancelRejectedV2 byte 17.
     *
     * @return the CancelRejectedV2ReturnBitfield17 field
     */
    public CancelRejectedV2ReturnBitfield17Field cancelRejectedV2ReturnBitfield17() {
        return cancelRejectedV2ReturnBitfield17;
    }

    /**
     * BitSet CancelRejectedV2 byte 18.
     *
     * @return the CancelRejectedV2ReturnBitfield18 field
     */
    public CancelRejectedV2ReturnBitfield18Field cancelRejectedV2ReturnBitfield18() {
        return cancelRejectedV2ReturnBitfield18;
    }

    /**
     * BitSet CancelRejectedV2 byte 19.
     *
     * @return the CancelRejectedV2ReturnBitfield19 field
     */
    public CancelRejectedV2ReturnBitfield19Field cancelRejectedV2ReturnBitfield19() {
        return cancelRejectedV2ReturnBitfield19;
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
     * Price
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
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
     * Capacity
     *
     * @return the Capacity field
     */
    public CapacityField capacity() {
        return capacity;
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
     * Stop Px
     *
     * @return the StopPx field
     */
    public StopPxField stopPx() {
        return stopPx;
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
     * Corresponds to CrossID (548) in Cboe FIX. Day-unique identifier for the cross order chosen by the client. Characters in the ASCII range 33– 126 are allowed, except for comma, semicolon, and pipe.
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
     * Client Qualified Role
     *
     * @return the ClientQualifiedRole field
     */
    public ClientQualifiedRoleField clientQualifiedRole() {
        return clientQualifiedRole;
    }

    /**
     * Client Id
     *
     * @return the ClientId field
     */
    public ClientIdField clientId() {
        return clientId;
    }

    /**
     * Investor Id
     *
     * @return the InvestorId field
     */
    public InvestorIdField investorId() {
        return investorId;
    }

    /**
     * Executor Id
     *
     * @return the ExecutorId field
     */
    public ExecutorIdField executorId() {
        return executorId;
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
     * Algorithmic Indicator
     *
     * @return the AlgorithmicIndicator field
     */
    public AlgorithmicIndicatorField algorithmicIndicator() {
        return algorithmicIndicator;
    }

    /**
     * Investor Qualified Role
     *
     * @return the InvestorQualifiedRole field
     */
    public InvestorQualifiedRoleField investorQualifiedRole() {
        return investorQualifiedRole;
    }

    /**
     * Executor Qualified Role
     *
     * @return the ExecutorQualifiedRole field
     */
    public ExecutorQualifiedRoleField executorQualifiedRole() {
        return executorQualifiedRole;
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
     * Returns whether the fields before the CancelRejectedV2ReturnBitfield1 put it on the wire.
     *
     * <p>Decode reads the CancelRejectedV2ReturnBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelRejectedV2ReturnBitfield1 is on the wire
     */
    public boolean cancelRejectedV2ReturnBitfield1Present() {
        return numberOfReturnBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the CancelRejectedV2ReturnBitfield2 put it on the wire.
     *
     * <p>Decode reads the CancelRejectedV2ReturnBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelRejectedV2ReturnBitfield2 is on the wire
     */
    public boolean cancelRejectedV2ReturnBitfield2Present() {
        return numberOfReturnBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the CancelRejectedV2ReturnBitfield3 put it on the wire.
     *
     * <p>Decode reads the CancelRejectedV2ReturnBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelRejectedV2ReturnBitfield3 is on the wire
     */
    public boolean cancelRejectedV2ReturnBitfield3Present() {
        return numberOfReturnBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the CancelRejectedV2ReturnBitfield4 put it on the wire.
     *
     * <p>Decode reads the CancelRejectedV2ReturnBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelRejectedV2ReturnBitfield4 is on the wire
     */
    public boolean cancelRejectedV2ReturnBitfield4Present() {
        return numberOfReturnBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the CancelRejectedV2ReturnBitfield5 put it on the wire.
     *
     * <p>Decode reads the CancelRejectedV2ReturnBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelRejectedV2ReturnBitfield5 is on the wire
     */
    public boolean cancelRejectedV2ReturnBitfield5Present() {
        return numberOfReturnBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the CancelRejectedV2ReturnBitfield6 put it on the wire.
     *
     * <p>Decode reads the CancelRejectedV2ReturnBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelRejectedV2ReturnBitfield6 is on the wire
     */
    public boolean cancelRejectedV2ReturnBitfield6Present() {
        return numberOfReturnBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the CancelRejectedV2ReturnBitfield7 put it on the wire.
     *
     * <p>Decode reads the CancelRejectedV2ReturnBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelRejectedV2ReturnBitfield7 is on the wire
     */
    public boolean cancelRejectedV2ReturnBitfield7Present() {
        return numberOfReturnBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the CancelRejectedV2ReturnBitfield8 put it on the wire.
     *
     * <p>Decode reads the CancelRejectedV2ReturnBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelRejectedV2ReturnBitfield8 is on the wire
     */
    public boolean cancelRejectedV2ReturnBitfield8Present() {
        return numberOfReturnBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the CancelRejectedV2ReturnBitfield9 put it on the wire.
     *
     * <p>Decode reads the CancelRejectedV2ReturnBitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelRejectedV2ReturnBitfield9 is on the wire
     */
    public boolean cancelRejectedV2ReturnBitfield9Present() {
        return numberOfReturnBitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the CancelRejectedV2ReturnBitfield10 put it on the wire.
     *
     * <p>Decode reads the CancelRejectedV2ReturnBitfield10 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelRejectedV2ReturnBitfield10 is on the wire
     */
    public boolean cancelRejectedV2ReturnBitfield10Present() {
        return numberOfReturnBitfields.value() >= 10L;
    }

    /**
     * Returns whether the fields before the CancelRejectedV2ReturnBitfield11 put it on the wire.
     *
     * <p>Decode reads the CancelRejectedV2ReturnBitfield11 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelRejectedV2ReturnBitfield11 is on the wire
     */
    public boolean cancelRejectedV2ReturnBitfield11Present() {
        return numberOfReturnBitfields.value() >= 11L;
    }

    /**
     * Returns whether the fields before the CancelRejectedV2ReturnBitfield12 put it on the wire.
     *
     * <p>Decode reads the CancelRejectedV2ReturnBitfield12 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelRejectedV2ReturnBitfield12 is on the wire
     */
    public boolean cancelRejectedV2ReturnBitfield12Present() {
        return numberOfReturnBitfields.value() >= 12L;
    }

    /**
     * Returns whether the fields before the CancelRejectedV2ReturnBitfield13 put it on the wire.
     *
     * <p>Decode reads the CancelRejectedV2ReturnBitfield13 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelRejectedV2ReturnBitfield13 is on the wire
     */
    public boolean cancelRejectedV2ReturnBitfield13Present() {
        return numberOfReturnBitfields.value() >= 13L;
    }

    /**
     * Returns whether the fields before the CancelRejectedV2ReturnBitfield14 put it on the wire.
     *
     * <p>Decode reads the CancelRejectedV2ReturnBitfield14 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelRejectedV2ReturnBitfield14 is on the wire
     */
    public boolean cancelRejectedV2ReturnBitfield14Present() {
        return numberOfReturnBitfields.value() >= 14L;
    }

    /**
     * Returns whether the fields before the CancelRejectedV2ReturnBitfield15 put it on the wire.
     *
     * <p>Decode reads the CancelRejectedV2ReturnBitfield15 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelRejectedV2ReturnBitfield15 is on the wire
     */
    public boolean cancelRejectedV2ReturnBitfield15Present() {
        return numberOfReturnBitfields.value() >= 15L;
    }

    /**
     * Returns whether the fields before the CancelRejectedV2ReturnBitfield16 put it on the wire.
     *
     * <p>Decode reads the CancelRejectedV2ReturnBitfield16 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelRejectedV2ReturnBitfield16 is on the wire
     */
    public boolean cancelRejectedV2ReturnBitfield16Present() {
        return numberOfReturnBitfields.value() >= 16L;
    }

    /**
     * Returns whether the fields before the CancelRejectedV2ReturnBitfield17 put it on the wire.
     *
     * <p>Decode reads the CancelRejectedV2ReturnBitfield17 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelRejectedV2ReturnBitfield17 is on the wire
     */
    public boolean cancelRejectedV2ReturnBitfield17Present() {
        return numberOfReturnBitfields.value() >= 17L;
    }

    /**
     * Returns whether the fields before the CancelRejectedV2ReturnBitfield18 put it on the wire.
     *
     * <p>Decode reads the CancelRejectedV2ReturnBitfield18 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelRejectedV2ReturnBitfield18 is on the wire
     */
    public boolean cancelRejectedV2ReturnBitfield18Present() {
        return numberOfReturnBitfields.value() >= 18L;
    }

    /**
     * Returns whether the fields before the CancelRejectedV2ReturnBitfield19 put it on the wire.
     *
     * <p>Decode reads the CancelRejectedV2ReturnBitfield19 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelRejectedV2ReturnBitfield19 is on the wire
     */
    public boolean cancelRejectedV2ReturnBitfield19Present() {
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
        return (numberOfReturnBitfields.value() >= 1L) && (cancelRejectedV2ReturnBitfield1Present() && cancelRejectedV2ReturnBitfield1.cancelRejectedV2ReturnBitfield1Side());
    }

    /**
     * Returns whether the fields before the Price put it on the wire.
     *
     * <p>Decode reads the Price where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Price is on the wire
     */
    public boolean pricePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (cancelRejectedV2ReturnBitfield1Present() && cancelRejectedV2ReturnBitfield1.cancelRejectedV2ReturnBitfield1Price());
    }

    /**
     * Returns whether the fields before the OrdType put it on the wire.
     *
     * <p>Decode reads the OrdType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrdType is on the wire
     */
    public boolean ordTypePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (cancelRejectedV2ReturnBitfield1Present() && cancelRejectedV2ReturnBitfield1.cancelRejectedV2ReturnBitfield1OrdType());
    }

    /**
     * Returns whether the fields before the TimeInForce put it on the wire.
     *
     * <p>Decode reads the TimeInForce where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TimeInForce is on the wire
     */
    public boolean timeInForcePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (cancelRejectedV2ReturnBitfield1Present() && cancelRejectedV2ReturnBitfield1.cancelRejectedV2ReturnBitfield1TimeInForce());
    }

    /**
     * Returns whether the fields before the MinQty put it on the wire.
     *
     * <p>Decode reads the MinQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MinQty is on the wire
     */
    public boolean minQtyPresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (cancelRejectedV2ReturnBitfield1Present() && cancelRejectedV2ReturnBitfield1.cancelRejectedV2ReturnBitfield1MinQty());
    }

    /**
     * Returns whether the fields before the SymbolAlphanumeric put it on the wire.
     *
     * <p>Decode reads the SymbolAlphanumeric where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolAlphanumeric is on the wire
     */
    public boolean symbolAlphanumericPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (cancelRejectedV2ReturnBitfield2Present() && cancelRejectedV2ReturnBitfield2.cancelRejectedV2ReturnBitfield2Symbol());
    }

    /**
     * Returns whether the fields before the IdSource put it on the wire.
     *
     * <p>Decode reads the IdSource where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the IdSource is on the wire
     */
    public boolean idSourcePresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (cancelRejectedV2ReturnBitfield2Present() && cancelRejectedV2ReturnBitfield2.cancelRejectedV2ReturnBitfield2IdSource());
    }

    /**
     * Returns whether the fields before the SecurityId put it on the wire.
     *
     * <p>Decode reads the SecurityId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecurityId is on the wire
     */
    public boolean securityIdPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (cancelRejectedV2ReturnBitfield2Present() && cancelRejectedV2ReturnBitfield2.cancelRejectedV2ReturnBitfield2SecurityId());
    }

    /**
     * Returns whether the fields before the Capacity put it on the wire.
     *
     * <p>Decode reads the Capacity where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Capacity is on the wire
     */
    public boolean capacityPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (cancelRejectedV2ReturnBitfield2Present() && cancelRejectedV2ReturnBitfield2.cancelRejectedV2ReturnBitfield2Capacity());
    }

    /**
     * Returns whether the fields before the OpenClose put it on the wire.
     *
     * <p>Decode reads the OpenClose where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OpenClose is on the wire
     */
    public boolean openClosePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (cancelRejectedV2ReturnBitfield4Present() && cancelRejectedV2ReturnBitfield4.cancelRejectedV2ReturnBitfield4OpenClose());
    }

    /**
     * Returns whether the fields before the StopPx put it on the wire.
     *
     * <p>Decode reads the StopPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StopPx is on the wire
     */
    public boolean stopPxPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (cancelRejectedV2ReturnBitfield8Present() && cancelRejectedV2ReturnBitfield8.cancelRejectedV2ReturnBitfield8StopPx());
    }

    /**
     * Returns whether the fields before the LiquidityProvision put it on the wire.
     *
     * <p>Decode reads the LiquidityProvision where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LiquidityProvision is on the wire
     */
    public boolean liquidityProvisionPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (cancelRejectedV2ReturnBitfield9Present() && cancelRejectedV2ReturnBitfield9.cancelRejectedV2ReturnBitfield9LiquidityProvision());
    }

    /**
     * Returns whether the fields before the CrossId put it on the wire.
     *
     * <p>Decode reads the CrossId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossId is on the wire
     */
    public boolean crossIdPresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (cancelRejectedV2ReturnBitfield10Present() && cancelRejectedV2ReturnBitfield10.cancelRejectedV2ReturnBitfield10CrossId());
    }

    /**
     * Returns whether the fields before the AllocQty put it on the wire.
     *
     * <p>Decode reads the AllocQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AllocQty is on the wire
     */
    public boolean allocQtyPresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (cancelRejectedV2ReturnBitfield10Present() && cancelRejectedV2ReturnBitfield10.cancelRejectedV2ReturnBitfield10AllocQty());
    }

    /**
     * Returns whether the fields before the ClientQualifiedRole put it on the wire.
     *
     * <p>Decode reads the ClientQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClientQualifiedRole is on the wire
     */
    public boolean clientQualifiedRolePresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (cancelRejectedV2ReturnBitfield10Present() && cancelRejectedV2ReturnBitfield10.cancelRejectedV2ReturnBitfield10ClientQualifiedRole());
    }

    /**
     * Returns whether the fields before the ClientId put it on the wire.
     *
     * <p>Decode reads the ClientId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClientId is on the wire
     */
    public boolean clientIdPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (cancelRejectedV2ReturnBitfield11Present() && cancelRejectedV2ReturnBitfield11.cancelRejectedV2ReturnBitfield11ClientId());
    }

    /**
     * Returns whether the fields before the InvestorId put it on the wire.
     *
     * <p>Decode reads the InvestorId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the InvestorId is on the wire
     */
    public boolean investorIdPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (cancelRejectedV2ReturnBitfield11Present() && cancelRejectedV2ReturnBitfield11.cancelRejectedV2ReturnBitfield11InvestorId());
    }

    /**
     * Returns whether the fields before the ExecutorId put it on the wire.
     *
     * <p>Decode reads the ExecutorId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecutorId is on the wire
     */
    public boolean executorIdPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (cancelRejectedV2ReturnBitfield11Present() && cancelRejectedV2ReturnBitfield11.cancelRejectedV2ReturnBitfield11ExecutorId());
    }

    /**
     * Returns whether the fields before the OrderOrigination put it on the wire.
     *
     * <p>Decode reads the OrderOrigination where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderOrigination is on the wire
     */
    public boolean orderOriginationPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (cancelRejectedV2ReturnBitfield11Present() && cancelRejectedV2ReturnBitfield11.cancelRejectedV2ReturnBitfield11OrderOrigination());
    }

    /**
     * Returns whether the fields before the AlgorithmicIndicator put it on the wire.
     *
     * <p>Decode reads the AlgorithmicIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AlgorithmicIndicator is on the wire
     */
    public boolean algorithmicIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (cancelRejectedV2ReturnBitfield11Present() && cancelRejectedV2ReturnBitfield11.cancelRejectedV2ReturnBitfield11AlgorithmicIndicator());
    }

    /**
     * Returns whether the fields before the InvestorQualifiedRole put it on the wire.
     *
     * <p>Decode reads the InvestorQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the InvestorQualifiedRole is on the wire
     */
    public boolean investorQualifiedRolePresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (cancelRejectedV2ReturnBitfield11Present() && cancelRejectedV2ReturnBitfield11.cancelRejectedV2ReturnBitfield11InvestorQualifiedRole());
    }

    /**
     * Returns whether the fields before the ExecutorQualifiedRole put it on the wire.
     *
     * <p>Decode reads the ExecutorQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecutorQualifiedRole is on the wire
     */
    public boolean executorQualifiedRolePresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (cancelRejectedV2ReturnBitfield11Present() && cancelRejectedV2ReturnBitfield11.cancelRejectedV2ReturnBitfield11ExecutorQualifiedRole());
    }

    /**
     * Returns whether the fields before the MassCancelId put it on the wire.
     *
     * <p>Decode reads the MassCancelId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MassCancelId is on the wire
     */
    public boolean massCancelIdPresent() {
        return (numberOfReturnBitfields.value() >= 15L) && (cancelRejectedV2ReturnBitfield15Present() && cancelRejectedV2ReturnBitfield15.cancelRejectedV2ReturnBitfield15MassCancelId());
    }

    private boolean onWire(Field field) {
        return (field != cancelRejectedV2ReturnBitfield1 || cancelRejectedV2ReturnBitfield1Present()) && (field != cancelRejectedV2ReturnBitfield2 || cancelRejectedV2ReturnBitfield2Present()) && (field != cancelRejectedV2ReturnBitfield3 || cancelRejectedV2ReturnBitfield3Present()) && (field != cancelRejectedV2ReturnBitfield4 || cancelRejectedV2ReturnBitfield4Present()) && (field != cancelRejectedV2ReturnBitfield5 || cancelRejectedV2ReturnBitfield5Present()) && (field != cancelRejectedV2ReturnBitfield6 || cancelRejectedV2ReturnBitfield6Present()) && (field != cancelRejectedV2ReturnBitfield7 || cancelRejectedV2ReturnBitfield7Present()) && (field != cancelRejectedV2ReturnBitfield8 || cancelRejectedV2ReturnBitfield8Present()) && (field != cancelRejectedV2ReturnBitfield9 || cancelRejectedV2ReturnBitfield9Present()) && (field != cancelRejectedV2ReturnBitfield10 || cancelRejectedV2ReturnBitfield10Present()) && (field != cancelRejectedV2ReturnBitfield11 || cancelRejectedV2ReturnBitfield11Present()) && (field != cancelRejectedV2ReturnBitfield12 || cancelRejectedV2ReturnBitfield12Present()) && (field != cancelRejectedV2ReturnBitfield13 || cancelRejectedV2ReturnBitfield13Present()) && (field != cancelRejectedV2ReturnBitfield14 || cancelRejectedV2ReturnBitfield14Present()) && (field != cancelRejectedV2ReturnBitfield15 || cancelRejectedV2ReturnBitfield15Present()) && (field != cancelRejectedV2ReturnBitfield16 || cancelRejectedV2ReturnBitfield16Present()) && (field != cancelRejectedV2ReturnBitfield17 || cancelRejectedV2ReturnBitfield17Present()) && (field != cancelRejectedV2ReturnBitfield18 || cancelRejectedV2ReturnBitfield18Present()) && (field != cancelRejectedV2ReturnBitfield19 || cancelRejectedV2ReturnBitfield19Present()) && (field != side || sidePresent()) && (field != price || pricePresent()) && (field != ordType || ordTypePresent()) && (field != timeInForce || timeInForcePresent()) && (field != minQty || minQtyPresent()) && (field != symbolAlphanumeric || symbolAlphanumericPresent()) && (field != idSource || idSourcePresent()) && (field != securityId || securityIdPresent()) && (field != capacity || capacityPresent()) && (field != openClose || openClosePresent()) && (field != stopPx || stopPxPresent()) && (field != liquidityProvision || liquidityProvisionPresent()) && (field != crossId || crossIdPresent()) && (field != allocQty || allocQtyPresent()) && (field != clientQualifiedRole || clientQualifiedRolePresent()) && (field != clientId || clientIdPresent()) && (field != investorId || investorIdPresent()) && (field != executorId || executorIdPresent()) && (field != orderOrigination || orderOriginationPresent()) && (field != algorithmicIndicator || algorithmicIndicatorPresent()) && (field != investorQualifiedRole || investorQualifiedRolePresent()) && (field != executorQualifiedRole || executorQualifiedRolePresent()) && (field != massCancelId || massCancelIdPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (cancelRejectedV2ReturnBitfield1Present() ? CancelRejectedV2ReturnBitfield1Field.BYTE_LENGTH : 0) + (cancelRejectedV2ReturnBitfield2Present() ? CancelRejectedV2ReturnBitfield2Field.BYTE_LENGTH : 0) + (cancelRejectedV2ReturnBitfield3Present() ? CancelRejectedV2ReturnBitfield3Field.BYTE_LENGTH : 0) + (cancelRejectedV2ReturnBitfield4Present() ? CancelRejectedV2ReturnBitfield4Field.BYTE_LENGTH : 0) + (cancelRejectedV2ReturnBitfield5Present() ? CancelRejectedV2ReturnBitfield5Field.BYTE_LENGTH : 0) + (cancelRejectedV2ReturnBitfield6Present() ? CancelRejectedV2ReturnBitfield6Field.BYTE_LENGTH : 0) + (cancelRejectedV2ReturnBitfield7Present() ? CancelRejectedV2ReturnBitfield7Field.BYTE_LENGTH : 0) + (cancelRejectedV2ReturnBitfield8Present() ? CancelRejectedV2ReturnBitfield8Field.BYTE_LENGTH : 0) + (cancelRejectedV2ReturnBitfield9Present() ? CancelRejectedV2ReturnBitfield9Field.BYTE_LENGTH : 0) + (cancelRejectedV2ReturnBitfield10Present() ? CancelRejectedV2ReturnBitfield10Field.BYTE_LENGTH : 0) + (cancelRejectedV2ReturnBitfield11Present() ? CancelRejectedV2ReturnBitfield11Field.BYTE_LENGTH : 0) + (cancelRejectedV2ReturnBitfield12Present() ? CancelRejectedV2ReturnBitfield12Field.BYTE_LENGTH : 0) + (cancelRejectedV2ReturnBitfield13Present() ? CancelRejectedV2ReturnBitfield13Field.BYTE_LENGTH : 0) + (cancelRejectedV2ReturnBitfield14Present() ? CancelRejectedV2ReturnBitfield14Field.BYTE_LENGTH : 0) + (cancelRejectedV2ReturnBitfield15Present() ? CancelRejectedV2ReturnBitfield15Field.BYTE_LENGTH : 0) + (cancelRejectedV2ReturnBitfield16Present() ? CancelRejectedV2ReturnBitfield16Field.BYTE_LENGTH : 0) + (cancelRejectedV2ReturnBitfield17Present() ? CancelRejectedV2ReturnBitfield17Field.BYTE_LENGTH : 0) + (cancelRejectedV2ReturnBitfield18Present() ? CancelRejectedV2ReturnBitfield18Field.BYTE_LENGTH : 0) + (cancelRejectedV2ReturnBitfield19Present() ? CancelRejectedV2ReturnBitfield19Field.BYTE_LENGTH : 0) + (sidePresent() ? SideField.BYTE_LENGTH : 0) + (pricePresent() ? PriceField.BYTE_LENGTH : 0) + (ordTypePresent() ? OrdTypeField.BYTE_LENGTH : 0) + (timeInForcePresent() ? TimeInForceField.BYTE_LENGTH : 0) + (minQtyPresent() ? MinQtyField.BYTE_LENGTH : 0) + (symbolAlphanumericPresent() ? SymbolAlphanumericField2.BYTE_LENGTH : 0) + (idSourcePresent() ? IdSourceField.BYTE_LENGTH : 0) + (securityIdPresent() ? SecurityIdField.BYTE_LENGTH : 0) + (capacityPresent() ? CapacityField.BYTE_LENGTH : 0) + (openClosePresent() ? OpenCloseField.BYTE_LENGTH : 0) + (stopPxPresent() ? StopPxField.BYTE_LENGTH : 0) + (liquidityProvisionPresent() ? LiquidityProvisionField.BYTE_LENGTH : 0) + (crossIdPresent() ? CrossIdField.BYTE_LENGTH : 0) + (allocQtyPresent() ? AllocQtyField.BYTE_LENGTH : 0) + (clientQualifiedRolePresent() ? ClientQualifiedRoleField.BYTE_LENGTH : 0) + (clientIdPresent() ? ClientIdField.BYTE_LENGTH : 0) + (investorIdPresent() ? InvestorIdField.BYTE_LENGTH : 0) + (executorIdPresent() ? ExecutorIdField.BYTE_LENGTH : 0) + (orderOriginationPresent() ? OrderOriginationField.BYTE_LENGTH : 0) + (algorithmicIndicatorPresent() ? AlgorithmicIndicatorField.BYTE_LENGTH : 0) + (investorQualifiedRolePresent() ? InvestorQualifiedRoleField.BYTE_LENGTH : 0) + (executorQualifiedRolePresent() ? ExecutorQualifiedRoleField.BYTE_LENGTH : 0) + (massCancelIdPresent() ? MassCancelIdField.BYTE_LENGTH : 0);
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
        if (cancelRejectedV2ReturnBitfield1Present()) {
            cursor += 1;
        }
        if (cancelRejectedV2ReturnBitfield2Present()) {
            cursor += 1;
        }
        if (cancelRejectedV2ReturnBitfield3Present()) {
            cursor += 1;
        }
        if (cancelRejectedV2ReturnBitfield4Present()) {
            cursor += 1;
        }
        if (cancelRejectedV2ReturnBitfield5Present()) {
            cursor += 1;
        }
        if (cancelRejectedV2ReturnBitfield6Present()) {
            cursor += 1;
        }
        if (cancelRejectedV2ReturnBitfield7Present()) {
            cursor += 1;
        }
        if (cancelRejectedV2ReturnBitfield8Present()) {
            cursor += 1;
        }
        if (cancelRejectedV2ReturnBitfield9Present()) {
            cursor += 1;
        }
        if (cancelRejectedV2ReturnBitfield10Present()) {
            cursor += 1;
        }
        if (cancelRejectedV2ReturnBitfield11Present()) {
            cursor += 1;
        }
        if (cancelRejectedV2ReturnBitfield12Present()) {
            cursor += 1;
        }
        if (cancelRejectedV2ReturnBitfield13Present()) {
            cursor += 1;
        }
        if (cancelRejectedV2ReturnBitfield14Present()) {
            cursor += 1;
        }
        if (cancelRejectedV2ReturnBitfield15Present()) {
            cursor += 1;
        }
        if (cancelRejectedV2ReturnBitfield16Present()) {
            cursor += 1;
        }
        if (cancelRejectedV2ReturnBitfield17Present()) {
            cursor += 1;
        }
        if (cancelRejectedV2ReturnBitfield18Present()) {
            cursor += 1;
        }
        if (cancelRejectedV2ReturnBitfield19Present()) {
            cursor += 1;
        }
        if (sidePresent()) {
            cursor += 1;
        }
        if (pricePresent()) {
            cursor += 8;
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
        if (idSourcePresent()) {
            cursor += 1;
        }
        if (securityIdPresent()) {
            cursor += 16;
        }
        if (capacityPresent()) {
            cursor += 1;
        }
        if (openClosePresent()) {
            cursor += 1;
        }
        if (stopPxPresent()) {
            cursor += 8;
        }
        if (liquidityProvisionPresent()) {
            cursor += 1;
        }
        if (crossIdPresent()) {
            cursor += 20;
        }
        if (allocQtyPresent()) {
            cursor += 4;
        }
        if (clientQualifiedRolePresent()) {
            cursor += 1;
        }
        if (clientIdPresent()) {
            cursor += 4;
        }
        if (investorIdPresent()) {
            cursor += 4;
        }
        if (executorIdPresent()) {
            cursor += 4;
        }
        if (orderOriginationPresent()) {
            cursor += 1;
        }
        if (algorithmicIndicatorPresent()) {
            cursor += 1;
        }
        if (investorQualifiedRolePresent()) {
            cursor += 1;
        }
        if (executorQualifiedRolePresent()) {
            cursor += 1;
        }
        if (massCancelIdPresent()) {
            cursor += 20;
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
        if (cancelRejectedV2ReturnBitfield1Present()) {
            if (end - cursor < CancelRejectedV2ReturnBitfield1Field.BYTE_LENGTH || !cancelRejectedV2ReturnBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += CancelRejectedV2ReturnBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelRejectedV2ReturnBitfield2Present()) {
            if (end - cursor < CancelRejectedV2ReturnBitfield2Field.BYTE_LENGTH || !cancelRejectedV2ReturnBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += CancelRejectedV2ReturnBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelRejectedV2ReturnBitfield3Present()) {
            if (end - cursor < CancelRejectedV2ReturnBitfield3Field.BYTE_LENGTH || !cancelRejectedV2ReturnBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += CancelRejectedV2ReturnBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelRejectedV2ReturnBitfield4Present()) {
            if (end - cursor < CancelRejectedV2ReturnBitfield4Field.BYTE_LENGTH || !cancelRejectedV2ReturnBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += CancelRejectedV2ReturnBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelRejectedV2ReturnBitfield5Present()) {
            if (end - cursor < CancelRejectedV2ReturnBitfield5Field.BYTE_LENGTH || !cancelRejectedV2ReturnBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += CancelRejectedV2ReturnBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelRejectedV2ReturnBitfield6Present()) {
            if (end - cursor < CancelRejectedV2ReturnBitfield6Field.BYTE_LENGTH || !cancelRejectedV2ReturnBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += CancelRejectedV2ReturnBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelRejectedV2ReturnBitfield7Present()) {
            if (end - cursor < CancelRejectedV2ReturnBitfield7Field.BYTE_LENGTH || !cancelRejectedV2ReturnBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += CancelRejectedV2ReturnBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelRejectedV2ReturnBitfield8Present()) {
            if (end - cursor < CancelRejectedV2ReturnBitfield8Field.BYTE_LENGTH || !cancelRejectedV2ReturnBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += CancelRejectedV2ReturnBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelRejectedV2ReturnBitfield9Present()) {
            if (end - cursor < CancelRejectedV2ReturnBitfield9Field.BYTE_LENGTH || !cancelRejectedV2ReturnBitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += CancelRejectedV2ReturnBitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelRejectedV2ReturnBitfield10Present()) {
            if (end - cursor < CancelRejectedV2ReturnBitfield10Field.BYTE_LENGTH || !cancelRejectedV2ReturnBitfield10.parse(data, cursor)) {
                return false;
            }
            cursor += CancelRejectedV2ReturnBitfield10Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelRejectedV2ReturnBitfield11Present()) {
            if (end - cursor < CancelRejectedV2ReturnBitfield11Field.BYTE_LENGTH || !cancelRejectedV2ReturnBitfield11.parse(data, cursor)) {
                return false;
            }
            cursor += CancelRejectedV2ReturnBitfield11Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelRejectedV2ReturnBitfield12Present()) {
            if (end - cursor < CancelRejectedV2ReturnBitfield12Field.BYTE_LENGTH || !cancelRejectedV2ReturnBitfield12.parse(data, cursor)) {
                return false;
            }
            cursor += CancelRejectedV2ReturnBitfield12Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelRejectedV2ReturnBitfield13Present()) {
            if (end - cursor < CancelRejectedV2ReturnBitfield13Field.BYTE_LENGTH || !cancelRejectedV2ReturnBitfield13.parse(data, cursor)) {
                return false;
            }
            cursor += CancelRejectedV2ReturnBitfield13Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelRejectedV2ReturnBitfield14Present()) {
            if (end - cursor < CancelRejectedV2ReturnBitfield14Field.BYTE_LENGTH || !cancelRejectedV2ReturnBitfield14.parse(data, cursor)) {
                return false;
            }
            cursor += CancelRejectedV2ReturnBitfield14Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelRejectedV2ReturnBitfield15Present()) {
            if (end - cursor < CancelRejectedV2ReturnBitfield15Field.BYTE_LENGTH || !cancelRejectedV2ReturnBitfield15.parse(data, cursor)) {
                return false;
            }
            cursor += CancelRejectedV2ReturnBitfield15Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelRejectedV2ReturnBitfield16Present()) {
            if (end - cursor < CancelRejectedV2ReturnBitfield16Field.BYTE_LENGTH || !cancelRejectedV2ReturnBitfield16.parse(data, cursor)) {
                return false;
            }
            cursor += CancelRejectedV2ReturnBitfield16Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelRejectedV2ReturnBitfield17Present()) {
            if (end - cursor < CancelRejectedV2ReturnBitfield17Field.BYTE_LENGTH || !cancelRejectedV2ReturnBitfield17.parse(data, cursor)) {
                return false;
            }
            cursor += CancelRejectedV2ReturnBitfield17Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelRejectedV2ReturnBitfield18Present()) {
            if (end - cursor < CancelRejectedV2ReturnBitfield18Field.BYTE_LENGTH || !cancelRejectedV2ReturnBitfield18.parse(data, cursor)) {
                return false;
            }
            cursor += CancelRejectedV2ReturnBitfield18Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelRejectedV2ReturnBitfield19Present()) {
            if (end - cursor < CancelRejectedV2ReturnBitfield19Field.BYTE_LENGTH || !cancelRejectedV2ReturnBitfield19.parse(data, cursor)) {
                return false;
            }
            cursor += CancelRejectedV2ReturnBitfield19Field.BYTE_LENGTH;
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
        if (pricePresent()) {
            if (end - cursor < PriceField.BYTE_LENGTH || !price.parse(data, cursor)) {
                return false;
            }
            cursor += PriceField.BYTE_LENGTH;
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
        if (capacityPresent()) {
            if (end - cursor < CapacityField.BYTE_LENGTH || !capacity.parse(data, cursor)) {
                return false;
            }
            cursor += CapacityField.BYTE_LENGTH;
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
        if (stopPxPresent()) {
            if (end - cursor < StopPxField.BYTE_LENGTH || !stopPx.parse(data, cursor)) {
                return false;
            }
            cursor += StopPxField.BYTE_LENGTH;
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
        if (clientQualifiedRolePresent()) {
            if (end - cursor < ClientQualifiedRoleField.BYTE_LENGTH || !clientQualifiedRole.parse(data, cursor)) {
                return false;
            }
            cursor += ClientQualifiedRoleField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (clientIdPresent()) {
            if (end - cursor < ClientIdField.BYTE_LENGTH || !clientId.parse(data, cursor)) {
                return false;
            }
            cursor += ClientIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (investorIdPresent()) {
            if (end - cursor < InvestorIdField.BYTE_LENGTH || !investorId.parse(data, cursor)) {
                return false;
            }
            cursor += InvestorIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (executorIdPresent()) {
            if (end - cursor < ExecutorIdField.BYTE_LENGTH || !executorId.parse(data, cursor)) {
                return false;
            }
            cursor += ExecutorIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderOriginationPresent()) {
            if (end - cursor < OrderOriginationField.BYTE_LENGTH || !orderOrigination.parse(data, cursor)) {
                return false;
            }
            cursor += OrderOriginationField.BYTE_LENGTH;
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
        if (end - cursor < 0) {
            return false;
        }
        if (investorQualifiedRolePresent()) {
            if (end - cursor < InvestorQualifiedRoleField.BYTE_LENGTH || !investorQualifiedRole.parse(data, cursor)) {
                return false;
            }
            cursor += InvestorQualifiedRoleField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (executorQualifiedRolePresent()) {
            if (end - cursor < ExecutorQualifiedRoleField.BYTE_LENGTH || !executorQualifiedRole.parse(data, cursor)) {
                return false;
            }
            cursor += ExecutorQualifiedRoleField.BYTE_LENGTH;
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

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (cancelRejectedV2ReturnBitfield1Present() != cancelRejectedV2ReturnBitfield1.hasValue()) {
            throw new IllegalStateException(cancelRejectedV2ReturnBitfield1.hasValue() ? "cancelRejectedV2ReturnBitfield1 holds a value the fields before it leave off the wire" : "cancelRejectedV2ReturnBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (cancelRejectedV2ReturnBitfield2Present() != cancelRejectedV2ReturnBitfield2.hasValue()) {
            throw new IllegalStateException(cancelRejectedV2ReturnBitfield2.hasValue() ? "cancelRejectedV2ReturnBitfield2 holds a value the fields before it leave off the wire" : "cancelRejectedV2ReturnBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (cancelRejectedV2ReturnBitfield3Present() != cancelRejectedV2ReturnBitfield3.hasValue()) {
            throw new IllegalStateException(cancelRejectedV2ReturnBitfield3.hasValue() ? "cancelRejectedV2ReturnBitfield3 holds a value the fields before it leave off the wire" : "cancelRejectedV2ReturnBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (cancelRejectedV2ReturnBitfield4Present() != cancelRejectedV2ReturnBitfield4.hasValue()) {
            throw new IllegalStateException(cancelRejectedV2ReturnBitfield4.hasValue() ? "cancelRejectedV2ReturnBitfield4 holds a value the fields before it leave off the wire" : "cancelRejectedV2ReturnBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (cancelRejectedV2ReturnBitfield5Present() != cancelRejectedV2ReturnBitfield5.hasValue()) {
            throw new IllegalStateException(cancelRejectedV2ReturnBitfield5.hasValue() ? "cancelRejectedV2ReturnBitfield5 holds a value the fields before it leave off the wire" : "cancelRejectedV2ReturnBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (cancelRejectedV2ReturnBitfield6Present() != cancelRejectedV2ReturnBitfield6.hasValue()) {
            throw new IllegalStateException(cancelRejectedV2ReturnBitfield6.hasValue() ? "cancelRejectedV2ReturnBitfield6 holds a value the fields before it leave off the wire" : "cancelRejectedV2ReturnBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (cancelRejectedV2ReturnBitfield7Present() != cancelRejectedV2ReturnBitfield7.hasValue()) {
            throw new IllegalStateException(cancelRejectedV2ReturnBitfield7.hasValue() ? "cancelRejectedV2ReturnBitfield7 holds a value the fields before it leave off the wire" : "cancelRejectedV2ReturnBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (cancelRejectedV2ReturnBitfield8Present() != cancelRejectedV2ReturnBitfield8.hasValue()) {
            throw new IllegalStateException(cancelRejectedV2ReturnBitfield8.hasValue() ? "cancelRejectedV2ReturnBitfield8 holds a value the fields before it leave off the wire" : "cancelRejectedV2ReturnBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (cancelRejectedV2ReturnBitfield9Present() != cancelRejectedV2ReturnBitfield9.hasValue()) {
            throw new IllegalStateException(cancelRejectedV2ReturnBitfield9.hasValue() ? "cancelRejectedV2ReturnBitfield9 holds a value the fields before it leave off the wire" : "cancelRejectedV2ReturnBitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (cancelRejectedV2ReturnBitfield10Present() != cancelRejectedV2ReturnBitfield10.hasValue()) {
            throw new IllegalStateException(cancelRejectedV2ReturnBitfield10.hasValue() ? "cancelRejectedV2ReturnBitfield10 holds a value the fields before it leave off the wire" : "cancelRejectedV2ReturnBitfield10 holds no value, though the fields before it put it on the wire");
        }
        if (cancelRejectedV2ReturnBitfield11Present() != cancelRejectedV2ReturnBitfield11.hasValue()) {
            throw new IllegalStateException(cancelRejectedV2ReturnBitfield11.hasValue() ? "cancelRejectedV2ReturnBitfield11 holds a value the fields before it leave off the wire" : "cancelRejectedV2ReturnBitfield11 holds no value, though the fields before it put it on the wire");
        }
        if (cancelRejectedV2ReturnBitfield12Present() != cancelRejectedV2ReturnBitfield12.hasValue()) {
            throw new IllegalStateException(cancelRejectedV2ReturnBitfield12.hasValue() ? "cancelRejectedV2ReturnBitfield12 holds a value the fields before it leave off the wire" : "cancelRejectedV2ReturnBitfield12 holds no value, though the fields before it put it on the wire");
        }
        if (cancelRejectedV2ReturnBitfield13Present() != cancelRejectedV2ReturnBitfield13.hasValue()) {
            throw new IllegalStateException(cancelRejectedV2ReturnBitfield13.hasValue() ? "cancelRejectedV2ReturnBitfield13 holds a value the fields before it leave off the wire" : "cancelRejectedV2ReturnBitfield13 holds no value, though the fields before it put it on the wire");
        }
        if (cancelRejectedV2ReturnBitfield14Present() != cancelRejectedV2ReturnBitfield14.hasValue()) {
            throw new IllegalStateException(cancelRejectedV2ReturnBitfield14.hasValue() ? "cancelRejectedV2ReturnBitfield14 holds a value the fields before it leave off the wire" : "cancelRejectedV2ReturnBitfield14 holds no value, though the fields before it put it on the wire");
        }
        if (cancelRejectedV2ReturnBitfield15Present() != cancelRejectedV2ReturnBitfield15.hasValue()) {
            throw new IllegalStateException(cancelRejectedV2ReturnBitfield15.hasValue() ? "cancelRejectedV2ReturnBitfield15 holds a value the fields before it leave off the wire" : "cancelRejectedV2ReturnBitfield15 holds no value, though the fields before it put it on the wire");
        }
        if (cancelRejectedV2ReturnBitfield16Present() != cancelRejectedV2ReturnBitfield16.hasValue()) {
            throw new IllegalStateException(cancelRejectedV2ReturnBitfield16.hasValue() ? "cancelRejectedV2ReturnBitfield16 holds a value the fields before it leave off the wire" : "cancelRejectedV2ReturnBitfield16 holds no value, though the fields before it put it on the wire");
        }
        if (cancelRejectedV2ReturnBitfield17Present() != cancelRejectedV2ReturnBitfield17.hasValue()) {
            throw new IllegalStateException(cancelRejectedV2ReturnBitfield17.hasValue() ? "cancelRejectedV2ReturnBitfield17 holds a value the fields before it leave off the wire" : "cancelRejectedV2ReturnBitfield17 holds no value, though the fields before it put it on the wire");
        }
        if (cancelRejectedV2ReturnBitfield18Present() != cancelRejectedV2ReturnBitfield18.hasValue()) {
            throw new IllegalStateException(cancelRejectedV2ReturnBitfield18.hasValue() ? "cancelRejectedV2ReturnBitfield18 holds a value the fields before it leave off the wire" : "cancelRejectedV2ReturnBitfield18 holds no value, though the fields before it put it on the wire");
        }
        if (cancelRejectedV2ReturnBitfield19Present() != cancelRejectedV2ReturnBitfield19.hasValue()) {
            throw new IllegalStateException(cancelRejectedV2ReturnBitfield19.hasValue() ? "cancelRejectedV2ReturnBitfield19 holds a value the fields before it leave off the wire" : "cancelRejectedV2ReturnBitfield19 holds no value, though the fields before it put it on the wire");
        }
        if (sidePresent() != side.hasValue()) {
            throw new IllegalStateException(side.hasValue() ? "side holds a value the fields before it leave off the wire" : "side holds no value, though the fields before it put it on the wire");
        }
        if (pricePresent() != price.hasValue()) {
            throw new IllegalStateException(price.hasValue() ? "price holds a value the fields before it leave off the wire" : "price holds no value, though the fields before it put it on the wire");
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
        if (idSourcePresent() != idSource.hasValue()) {
            throw new IllegalStateException(idSource.hasValue() ? "idSource holds a value the fields before it leave off the wire" : "idSource holds no value, though the fields before it put it on the wire");
        }
        if (securityIdPresent() != securityId.hasValue()) {
            throw new IllegalStateException(securityId.hasValue() ? "securityId holds a value the fields before it leave off the wire" : "securityId holds no value, though the fields before it put it on the wire");
        }
        if (capacityPresent() != capacity.hasValue()) {
            throw new IllegalStateException(capacity.hasValue() ? "capacity holds a value the fields before it leave off the wire" : "capacity holds no value, though the fields before it put it on the wire");
        }
        if (openClosePresent() != openClose.hasValue()) {
            throw new IllegalStateException(openClose.hasValue() ? "openClose holds a value the fields before it leave off the wire" : "openClose holds no value, though the fields before it put it on the wire");
        }
        if (stopPxPresent() != stopPx.hasValue()) {
            throw new IllegalStateException(stopPx.hasValue() ? "stopPx holds a value the fields before it leave off the wire" : "stopPx holds no value, though the fields before it put it on the wire");
        }
        if (liquidityProvisionPresent() != liquidityProvision.hasValue()) {
            throw new IllegalStateException(liquidityProvision.hasValue() ? "liquidityProvision holds a value the fields before it leave off the wire" : "liquidityProvision holds no value, though the fields before it put it on the wire");
        }
        if (crossIdPresent() != crossId.hasValue()) {
            throw new IllegalStateException(crossId.hasValue() ? "crossId holds a value the fields before it leave off the wire" : "crossId holds no value, though the fields before it put it on the wire");
        }
        if (allocQtyPresent() != allocQty.hasValue()) {
            throw new IllegalStateException(allocQty.hasValue() ? "allocQty holds a value the fields before it leave off the wire" : "allocQty holds no value, though the fields before it put it on the wire");
        }
        if (clientQualifiedRolePresent() != clientQualifiedRole.hasValue()) {
            throw new IllegalStateException(clientQualifiedRole.hasValue() ? "clientQualifiedRole holds a value the fields before it leave off the wire" : "clientQualifiedRole holds no value, though the fields before it put it on the wire");
        }
        if (clientIdPresent() != clientId.hasValue()) {
            throw new IllegalStateException(clientId.hasValue() ? "clientId holds a value the fields before it leave off the wire" : "clientId holds no value, though the fields before it put it on the wire");
        }
        if (investorIdPresent() != investorId.hasValue()) {
            throw new IllegalStateException(investorId.hasValue() ? "investorId holds a value the fields before it leave off the wire" : "investorId holds no value, though the fields before it put it on the wire");
        }
        if (executorIdPresent() != executorId.hasValue()) {
            throw new IllegalStateException(executorId.hasValue() ? "executorId holds a value the fields before it leave off the wire" : "executorId holds no value, though the fields before it put it on the wire");
        }
        if (orderOriginationPresent() != orderOrigination.hasValue()) {
            throw new IllegalStateException(orderOrigination.hasValue() ? "orderOrigination holds a value the fields before it leave off the wire" : "orderOrigination holds no value, though the fields before it put it on the wire");
        }
        if (algorithmicIndicatorPresent() != algorithmicIndicator.hasValue()) {
            throw new IllegalStateException(algorithmicIndicator.hasValue() ? "algorithmicIndicator holds a value the fields before it leave off the wire" : "algorithmicIndicator holds no value, though the fields before it put it on the wire");
        }
        if (investorQualifiedRolePresent() != investorQualifiedRole.hasValue()) {
            throw new IllegalStateException(investorQualifiedRole.hasValue() ? "investorQualifiedRole holds a value the fields before it leave off the wire" : "investorQualifiedRole holds no value, though the fields before it put it on the wire");
        }
        if (executorQualifiedRolePresent() != executorQualifiedRole.hasValue()) {
            throw new IllegalStateException(executorQualifiedRole.hasValue() ? "executorQualifiedRole holds a value the fields before it leave off the wire" : "executorQualifiedRole holds no value, though the fields before it put it on the wire");
        }
        if (massCancelIdPresent() != massCancelId.hasValue()) {
            throw new IllegalStateException(massCancelId.hasValue() ? "massCancelId holds a value the fields before it leave off the wire" : "massCancelId holds no value, though the fields before it put it on the wire");
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
        if (cancelRejectedV2ReturnBitfield1Present()) {
            cursor = cancelRejectedV2ReturnBitfield1.encode(data, cursor);
        }
        if (cancelRejectedV2ReturnBitfield2Present()) {
            cursor = cancelRejectedV2ReturnBitfield2.encode(data, cursor);
        }
        if (cancelRejectedV2ReturnBitfield3Present()) {
            cursor = cancelRejectedV2ReturnBitfield3.encode(data, cursor);
        }
        if (cancelRejectedV2ReturnBitfield4Present()) {
            cursor = cancelRejectedV2ReturnBitfield4.encode(data, cursor);
        }
        if (cancelRejectedV2ReturnBitfield5Present()) {
            cursor = cancelRejectedV2ReturnBitfield5.encode(data, cursor);
        }
        if (cancelRejectedV2ReturnBitfield6Present()) {
            cursor = cancelRejectedV2ReturnBitfield6.encode(data, cursor);
        }
        if (cancelRejectedV2ReturnBitfield7Present()) {
            cursor = cancelRejectedV2ReturnBitfield7.encode(data, cursor);
        }
        if (cancelRejectedV2ReturnBitfield8Present()) {
            cursor = cancelRejectedV2ReturnBitfield8.encode(data, cursor);
        }
        if (cancelRejectedV2ReturnBitfield9Present()) {
            cursor = cancelRejectedV2ReturnBitfield9.encode(data, cursor);
        }
        if (cancelRejectedV2ReturnBitfield10Present()) {
            cursor = cancelRejectedV2ReturnBitfield10.encode(data, cursor);
        }
        if (cancelRejectedV2ReturnBitfield11Present()) {
            cursor = cancelRejectedV2ReturnBitfield11.encode(data, cursor);
        }
        if (cancelRejectedV2ReturnBitfield12Present()) {
            cursor = cancelRejectedV2ReturnBitfield12.encode(data, cursor);
        }
        if (cancelRejectedV2ReturnBitfield13Present()) {
            cursor = cancelRejectedV2ReturnBitfield13.encode(data, cursor);
        }
        if (cancelRejectedV2ReturnBitfield14Present()) {
            cursor = cancelRejectedV2ReturnBitfield14.encode(data, cursor);
        }
        if (cancelRejectedV2ReturnBitfield15Present()) {
            cursor = cancelRejectedV2ReturnBitfield15.encode(data, cursor);
        }
        if (cancelRejectedV2ReturnBitfield16Present()) {
            cursor = cancelRejectedV2ReturnBitfield16.encode(data, cursor);
        }
        if (cancelRejectedV2ReturnBitfield17Present()) {
            cursor = cancelRejectedV2ReturnBitfield17.encode(data, cursor);
        }
        if (cancelRejectedV2ReturnBitfield18Present()) {
            cursor = cancelRejectedV2ReturnBitfield18.encode(data, cursor);
        }
        if (cancelRejectedV2ReturnBitfield19Present()) {
            cursor = cancelRejectedV2ReturnBitfield19.encode(data, cursor);
        }
        if (sidePresent()) {
            cursor = side.encode(data, cursor);
        }
        if (pricePresent()) {
            cursor = price.encode(data, cursor);
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
        if (idSourcePresent()) {
            cursor = idSource.encode(data, cursor);
        }
        if (securityIdPresent()) {
            cursor = securityId.encode(data, cursor);
        }
        if (capacityPresent()) {
            cursor = capacity.encode(data, cursor);
        }
        if (openClosePresent()) {
            cursor = openClose.encode(data, cursor);
        }
        if (stopPxPresent()) {
            cursor = stopPx.encode(data, cursor);
        }
        if (liquidityProvisionPresent()) {
            cursor = liquidityProvision.encode(data, cursor);
        }
        if (crossIdPresent()) {
            cursor = crossId.encode(data, cursor);
        }
        if (allocQtyPresent()) {
            cursor = allocQty.encode(data, cursor);
        }
        if (clientQualifiedRolePresent()) {
            cursor = clientQualifiedRole.encode(data, cursor);
        }
        if (clientIdPresent()) {
            cursor = clientId.encode(data, cursor);
        }
        if (investorIdPresent()) {
            cursor = investorId.encode(data, cursor);
        }
        if (executorIdPresent()) {
            cursor = executorId.encode(data, cursor);
        }
        if (orderOriginationPresent()) {
            cursor = orderOrigination.encode(data, cursor);
        }
        if (algorithmicIndicatorPresent()) {
            cursor = algorithmicIndicator.encode(data, cursor);
        }
        if (investorQualifiedRolePresent()) {
            cursor = investorQualifiedRole.encode(data, cursor);
        }
        if (executorQualifiedRolePresent()) {
            cursor = executorQualifiedRole.encode(data, cursor);
        }
        if (massCancelIdPresent()) {
            cursor = massCancelId.encode(data, cursor);
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
            case "CancelRejectedV2ReturnBitfield1" -> Optional.of(cancelRejectedV2ReturnBitfield1);
            case "CancelRejectedV2ReturnBitfield2" -> Optional.of(cancelRejectedV2ReturnBitfield2);
            case "CancelRejectedV2ReturnBitfield3" -> Optional.of(cancelRejectedV2ReturnBitfield3);
            case "CancelRejectedV2ReturnBitfield4" -> Optional.of(cancelRejectedV2ReturnBitfield4);
            case "CancelRejectedV2ReturnBitfield5" -> Optional.of(cancelRejectedV2ReturnBitfield5);
            case "CancelRejectedV2ReturnBitfield6" -> Optional.of(cancelRejectedV2ReturnBitfield6);
            case "CancelRejectedV2ReturnBitfield7" -> Optional.of(cancelRejectedV2ReturnBitfield7);
            case "CancelRejectedV2ReturnBitfield8" -> Optional.of(cancelRejectedV2ReturnBitfield8);
            case "CancelRejectedV2ReturnBitfield9" -> Optional.of(cancelRejectedV2ReturnBitfield9);
            case "CancelRejectedV2ReturnBitfield10" -> Optional.of(cancelRejectedV2ReturnBitfield10);
            case "CancelRejectedV2ReturnBitfield11" -> Optional.of(cancelRejectedV2ReturnBitfield11);
            case "CancelRejectedV2ReturnBitfield12" -> Optional.of(cancelRejectedV2ReturnBitfield12);
            case "CancelRejectedV2ReturnBitfield13" -> Optional.of(cancelRejectedV2ReturnBitfield13);
            case "CancelRejectedV2ReturnBitfield14" -> Optional.of(cancelRejectedV2ReturnBitfield14);
            case "CancelRejectedV2ReturnBitfield15" -> Optional.of(cancelRejectedV2ReturnBitfield15);
            case "CancelRejectedV2ReturnBitfield16" -> Optional.of(cancelRejectedV2ReturnBitfield16);
            case "CancelRejectedV2ReturnBitfield17" -> Optional.of(cancelRejectedV2ReturnBitfield17);
            case "CancelRejectedV2ReturnBitfield18" -> Optional.of(cancelRejectedV2ReturnBitfield18);
            case "CancelRejectedV2ReturnBitfield19" -> Optional.of(cancelRejectedV2ReturnBitfield19);
            case "Side" -> Optional.of(side);
            case "Price" -> Optional.of(price);
            case "OrdType" -> Optional.of(ordType);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "MinQty" -> Optional.of(minQty);
            case "SymbolAlphanumeric" -> Optional.of(symbolAlphanumeric);
            case "IdSource" -> Optional.of(idSource);
            case "SecurityId" -> Optional.of(securityId);
            case "Capacity" -> Optional.of(capacity);
            case "OpenClose" -> Optional.of(openClose);
            case "StopPx" -> Optional.of(stopPx);
            case "LiquidityProvision" -> Optional.of(liquidityProvision);
            case "CrossId" -> Optional.of(crossId);
            case "AllocQty" -> Optional.of(allocQty);
            case "ClientQualifiedRole" -> Optional.of(clientQualifiedRole);
            case "ClientId" -> Optional.of(clientId);
            case "InvestorId" -> Optional.of(investorId);
            case "ExecutorId" -> Optional.of(executorId);
            case "OrderOrigination" -> Optional.of(orderOrigination);
            case "AlgorithmicIndicator" -> Optional.of(algorithmicIndicator);
            case "InvestorQualifiedRole" -> Optional.of(investorQualifiedRole);
            case "ExecutorQualifiedRole" -> Optional.of(executorQualifiedRole);
            case "MassCancelId" -> Optional.of(massCancelId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof CancelRejectedV2Message message)) {
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
        if (!(other instanceof CancelRejectedV2Message message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
