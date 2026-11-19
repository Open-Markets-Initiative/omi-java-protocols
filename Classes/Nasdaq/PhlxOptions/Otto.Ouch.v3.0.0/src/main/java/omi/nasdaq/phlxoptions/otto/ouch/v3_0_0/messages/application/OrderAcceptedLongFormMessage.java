package omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.AloInstField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.AuctionIdField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.AuctionTypeField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.CapacityField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.ClOrdIdField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.ClearingAccountField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.CmtaField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.CustAcctField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.DisclosureMaskField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.DisplayHighQtyField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.DisplayLowQtyField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.DisplayMethodField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.DisplayQtyField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.DisplayWhenField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.FirmIdField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.InstrumentIdField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.IsoField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.MinQtyField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.NumberOfFlexLegsField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.OccAccountField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.OrderIdField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.OrderTypeField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.PositionEffectMaskField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.PreferredPartyField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.PriceField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.PriceProtectionField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.QuantityField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.SideField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.StockCapacityField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.StockLegMpidField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.StockLegShortSaleField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.TifField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.TimestampField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.groups.FlexLegsEntry;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.groups.FlexLegsList;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.types.Field;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.types.Message;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.types.PrintOptions;

/**
 * Represents the OrderAcceptedLongFormMessage message from the Otto protocol.
 *
 * <p>Acknowledges the receipt and acceptance of a valid New Order (Long Form). The data fields from the New Order Message are echoed back. Order Accepted messages always come before any Order Executed or Order Canceled Messages for an order. Does not include Leg Prices or Auction Duration.</p>
 */
public final class OrderAcceptedLongFormMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'a';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 120;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Accepted Long Form Message";

    /**
     * Nanoseconds since midnight
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Firm ID (e.g. ABCD, 123A)
     */
    private final FirmIdField firmId = new FirmIdField();

    /**
     * Instrument ID, as specified by Option Directory notifications
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Day-unique Order identifier assigned by exchange
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * See Client Order Id
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * CMTA
     */
    private final CmtaField cmta = new CmtaField();

    /**
     * Sub-account/MM Identifier at the registered exchange; all four characters will be provided to OCC
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * OCC # to use for clearing (give up)
     */
    private final OccAccountField occAccount = new OccAccountField();

    /**
     * Account on the customer system (pass-through)
     */
    private final CustAcctField custAcct = new CustAcctField();

    /**
     * IFI of the preferred Market Maker. Blank if none.
     */
    private final PreferredPartyField preferredParty = new PreferredPartyField();

    /**
     * N=Not ALO, Y=ALO
     */
    private final AloInstField aloInst = new AloInstField();

    /**
     * N=Not ISO, I=ISO
     */
    private final IsoField iso = new IsoField();

    /**
     * B=Buy, S=Sell
     */
    private final SideField side = new SideField();

    /**
     * L=Limit, M=Market
     */
    private final OrderTypeField orderType = new OrderTypeField();

    /**
     * Limit price. Should be set to 0 if Order Type = M.
     */
    private final PriceField price = new PriceField();

    /**
     * Number of contracts
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * 0 or Quantity
     */
    private final MinQtyField minQty = new MinQtyField();

    /**
     * See Time in Force Field (TIF)
     */
    private final TifField tif = new TifField();

    /**
     * See Order Capacity Field
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * See Auction Type Field
     */
    private final AuctionTypeField auctionType = new AuctionTypeField();

    /**
     * Identifies the Auction being responded. 0 if this order is not an auction response.
     */
    private final AuctionIdField auctionId = new AuctionIdField();

    /**
     * See Disclosure Mask Field (bits 0-5: Firm, Clearing Account, CMTA Account, Side, Price, Quantity; a set bit makes the attribute visible)
     */
    private final DisclosureMaskField disclosureMask = new DisclosureMaskField();

    /**
     * L=Local Market, N=National Market
     */
    private final PriceProtectionField priceProtection = new PriceProtectionField();

    /**
     * Initial Display Quantity
     */
    private final DisplayQtyField displayQty = new DisplayQtyField();

    /**
     * I=Immediate, E=Exhaust, N=N/A
     */
    private final DisplayWhenField displayWhen = new DisplayWhenField();

    /**
     * I=Initial, R=Random, N=None
     */
    private final DisplayMethodField displayMethod = new DisplayMethodField();

    /**
     * If DisplayMethod = Random
     */
    private final DisplayLowQtyField displayLowQty = new DisplayLowQtyField();

    /**
     * If DisplayMethod = Random
     */
    private final DisplayHighQtyField displayHighQty = new DisplayHighQtyField();

    /**
     * See Position Effect Mask Field (bit n = leg n; set bit = Open, cleared bit = Close)
     */
    private final PositionEffectMaskField positionEffectMask = new PositionEffectMaskField();

    /**
     * N=Not Applicable, H=Sell Short, E=Sell Short Exempt. If this is a multi-leg order for a stock combo where stock leg is on the Sell side StockLegShortSale may be set to H or E. In all other cases value N should be used.
     */
    private final StockLegShortSaleField stockLegShortSale = new StockLegShortSaleField();

    /**
     * Give-up for the stock leg
     */
    private final StockLegMpidField stockLegMpid = new StockLegMpidField();

    /**
     * P=Principal, A=Agency, R=Riskless Principal, space=Not Applicable
     */
    private final StockCapacityField stockCapacity = new StockCapacityField();

    /**
     * To be used for notifying Leg Deltas on Delta-Adjusted At Close feature as well as Leg Prices on Flex instruments. It will be 0 for non-Flex instruments.
     */
    private final NumberOfFlexLegsField numberOfFlexLegs = new NumberOfFlexLegsField();

    /**
     * Leg Definitions (1-10) of Order Accepted (Long Form); leg prices are not echoed
     */
    private final FlexLegsList flexLegs = new FlexLegsList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, firmId, instrumentId, orderId, clOrdId, cmta, clearingAccount, occAccount, custAcct, preferredParty, aloInst, iso, side, orderType, price, quantity, minQty, tif, capacity, auctionType, auctionId, disclosureMask, priceProtection, displayQty, displayWhen, displayMethod, displayLowQty, displayHighQty, positionEffectMask, stockLegShortSale, stockLegMpid, stockCapacity, numberOfFlexLegs);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds since midnight
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Firm ID (e.g. ABCD, 123A)
     *
     * @return the FirmId field
     */
    public FirmIdField firmId() {
        return firmId;
    }

    /**
     * Instrument ID, as specified by Option Directory notifications
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * Day-unique Order identifier assigned by exchange
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * See Client Order Id
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * CMTA
     *
     * @return the Cmta field
     */
    public CmtaField cmta() {
        return cmta;
    }

    /**
     * Sub-account/MM Identifier at the registered exchange; all four characters will be provided to OCC
     *
     * @return the ClearingAccount field
     */
    public ClearingAccountField clearingAccount() {
        return clearingAccount;
    }

    /**
     * OCC # to use for clearing (give up)
     *
     * @return the OccAccount field
     */
    public OccAccountField occAccount() {
        return occAccount;
    }

    /**
     * Account on the customer system (pass-through)
     *
     * @return the CustAcct field
     */
    public CustAcctField custAcct() {
        return custAcct;
    }

    /**
     * IFI of the preferred Market Maker. Blank if none.
     *
     * @return the PreferredParty field
     */
    public PreferredPartyField preferredParty() {
        return preferredParty;
    }

    /**
     * N=Not ALO, Y=ALO
     *
     * @return the AloInst field
     */
    public AloInstField aloInst() {
        return aloInst;
    }

    /**
     * N=Not ISO, I=ISO
     *
     * @return the Iso field
     */
    public IsoField iso() {
        return iso;
    }

    /**
     * B=Buy, S=Sell
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * L=Limit, M=Market
     *
     * @return the OrderType field
     */
    public OrderTypeField orderType() {
        return orderType;
    }

    /**
     * Limit price. Should be set to 0 if Order Type = M.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Number of contracts
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * 0 or Quantity
     *
     * @return the MinQty field
     */
    public MinQtyField minQty() {
        return minQty;
    }

    /**
     * See Time in Force Field (TIF)
     *
     * @return the Tif field
     */
    public TifField tif() {
        return tif;
    }

    /**
     * See Order Capacity Field
     *
     * @return the Capacity field
     */
    public CapacityField capacity() {
        return capacity;
    }

    /**
     * See Auction Type Field
     *
     * @return the AuctionType field
     */
    public AuctionTypeField auctionType() {
        return auctionType;
    }

    /**
     * Identifies the Auction being responded. 0 if this order is not an auction response.
     *
     * @return the AuctionId field
     */
    public AuctionIdField auctionId() {
        return auctionId;
    }

    /**
     * See Disclosure Mask Field (bits 0-5: Firm, Clearing Account, CMTA Account, Side, Price, Quantity; a set bit makes the attribute visible)
     *
     * @return the DisclosureMask field
     */
    public DisclosureMaskField disclosureMask() {
        return disclosureMask;
    }

    /**
     * L=Local Market, N=National Market
     *
     * @return the PriceProtection field
     */
    public PriceProtectionField priceProtection() {
        return priceProtection;
    }

    /**
     * Initial Display Quantity
     *
     * @return the DisplayQty field
     */
    public DisplayQtyField displayQty() {
        return displayQty;
    }

    /**
     * I=Immediate, E=Exhaust, N=N/A
     *
     * @return the DisplayWhen field
     */
    public DisplayWhenField displayWhen() {
        return displayWhen;
    }

    /**
     * I=Initial, R=Random, N=None
     *
     * @return the DisplayMethod field
     */
    public DisplayMethodField displayMethod() {
        return displayMethod;
    }

    /**
     * If DisplayMethod = Random
     *
     * @return the DisplayLowQty field
     */
    public DisplayLowQtyField displayLowQty() {
        return displayLowQty;
    }

    /**
     * If DisplayMethod = Random
     *
     * @return the DisplayHighQty field
     */
    public DisplayHighQtyField displayHighQty() {
        return displayHighQty;
    }

    /**
     * See Position Effect Mask Field (bit n = leg n; set bit = Open, cleared bit = Close)
     *
     * @return the PositionEffectMask field
     */
    public PositionEffectMaskField positionEffectMask() {
        return positionEffectMask;
    }

    /**
     * N=Not Applicable, H=Sell Short, E=Sell Short Exempt. If this is a multi-leg order for a stock combo where stock leg is on the Sell side StockLegShortSale may be set to H or E. In all other cases value N should be used.
     *
     * @return the StockLegShortSale field
     */
    public StockLegShortSaleField stockLegShortSale() {
        return stockLegShortSale;
    }

    /**
     * Give-up for the stock leg
     *
     * @return the StockLegMpid field
     */
    public StockLegMpidField stockLegMpid() {
        return stockLegMpid;
    }

    /**
     * P=Principal, A=Agency, R=Riskless Principal, space=Not Applicable
     *
     * @return the StockCapacity field
     */
    public StockCapacityField stockCapacity() {
        return stockCapacity;
    }

    /**
     * To be used for notifying Leg Deltas on Delta-Adjusted At Close feature as well as Leg Prices on Flex instruments. It will be 0 for non-Flex instruments.
     *
     * @return the NumberOfFlexLegs field
     */
    public NumberOfFlexLegsField numberOfFlexLegs() {
        return numberOfFlexLegs;
    }

    /**
     * Leg Definitions (1-10) of Order Accepted (Long Form); leg prices are not echoed
     *
     * <p>Encode writes this list's size to the NumberOfFlexLegs field.</p>
     *
     * @return the FlexLegs entries
     */
    public FlexLegsList flexLegs() {
        return flexLegs;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + flexLegs.byteLength();
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
        cursor += 4;
        cursor += 4;
        cursor += 8;
        cursor += 16;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 10;
        cursor += 3;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 8;
        cursor += 4;
        cursor += 4;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 4;
        cursor += 1;
        cursor += 1;
        cursor += 2;
        cursor += 1;
        cursor += 1;
        cursor += 2;
        cursor += 2;
        cursor += 2;
        cursor += 1;
        cursor += 4;
        cursor += 1;
        runs.add(cursor).add(9);
        cursor += 9;
        cursor += 1;
        cursor = flexLegs.padding(runs, cursor);
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!firmId.parse(data, cursor)) {
            return false;
        }
        cursor += FirmIdField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!cmta.parse(data, cursor)) {
            return false;
        }
        cursor += CmtaField.BYTE_LENGTH;
        if (!clearingAccount.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingAccountField.BYTE_LENGTH;
        if (!occAccount.parse(data, cursor)) {
            return false;
        }
        cursor += OccAccountField.BYTE_LENGTH;
        if (!custAcct.parse(data, cursor)) {
            return false;
        }
        cursor += CustAcctField.BYTE_LENGTH;
        if (!preferredParty.parse(data, cursor)) {
            return false;
        }
        cursor += PreferredPartyField.BYTE_LENGTH;
        if (!aloInst.parse(data, cursor)) {
            return false;
        }
        cursor += AloInstField.BYTE_LENGTH;
        if (!iso.parse(data, cursor)) {
            return false;
        }
        cursor += IsoField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!orderType.parse(data, cursor)) {
            return false;
        }
        cursor += OrderTypeField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!minQty.parse(data, cursor)) {
            return false;
        }
        cursor += MinQtyField.BYTE_LENGTH;
        if (!tif.parse(data, cursor)) {
            return false;
        }
        cursor += TifField.BYTE_LENGTH;
        if (!capacity.parse(data, cursor)) {
            return false;
        }
        cursor += CapacityField.BYTE_LENGTH;
        if (!auctionType.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionTypeField.BYTE_LENGTH;
        if (!auctionId.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionIdField.BYTE_LENGTH;
        if (!disclosureMask.parse(data, cursor)) {
            return false;
        }
        cursor += DisclosureMaskField.BYTE_LENGTH;
        if (!priceProtection.parse(data, cursor)) {
            return false;
        }
        cursor += PriceProtectionField.BYTE_LENGTH;
        if (!displayQty.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayQtyField.BYTE_LENGTH;
        if (!displayWhen.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayWhenField.BYTE_LENGTH;
        if (!displayMethod.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayMethodField.BYTE_LENGTH;
        if (!displayLowQty.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayLowQtyField.BYTE_LENGTH;
        if (!displayHighQty.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayHighQtyField.BYTE_LENGTH;
        if (!positionEffectMask.parse(data, cursor)) {
            return false;
        }
        cursor += PositionEffectMaskField.BYTE_LENGTH;
        if (!stockLegShortSale.parse(data, cursor)) {
            return false;
        }
        cursor += StockLegShortSaleField.BYTE_LENGTH;
        if (!stockLegMpid.parse(data, cursor)) {
            return false;
        }
        cursor += StockLegMpidField.BYTE_LENGTH;
        if (!stockCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += StockCapacityField.BYTE_LENGTH;
        cursor += 9; // padding
        if (!numberOfFlexLegs.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfFlexLegsField.BYTE_LENGTH;
        if (!flexLegs.parse(data, cursor, end, numberOfFlexLegs.value())) {
            return false;
        }
        cursor += flexLegs.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (flexLegs.size() > 255) {
            throw new IllegalStateException("flexLegs holds " + flexLegs.size() + " entries, more than its count field can state");
        }
        numberOfFlexLegs.value((short) flexLegs.size());
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = firmId.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = cmta.encode(data, cursor);
        cursor = clearingAccount.encode(data, cursor);
        cursor = occAccount.encode(data, cursor);
        cursor = custAcct.encode(data, cursor);
        cursor = preferredParty.encode(data, cursor);
        cursor = aloInst.encode(data, cursor);
        cursor = iso.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = orderType.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = minQty.encode(data, cursor);
        cursor = tif.encode(data, cursor);
        cursor = capacity.encode(data, cursor);
        cursor = auctionType.encode(data, cursor);
        cursor = auctionId.encode(data, cursor);
        cursor = disclosureMask.encode(data, cursor);
        cursor = priceProtection.encode(data, cursor);
        cursor = displayQty.encode(data, cursor);
        cursor = displayWhen.encode(data, cursor);
        cursor = displayMethod.encode(data, cursor);
        cursor = displayLowQty.encode(data, cursor);
        cursor = displayHighQty.encode(data, cursor);
        cursor = positionEffectMask.encode(data, cursor);
        cursor = stockLegShortSale.encode(data, cursor);
        cursor = stockLegMpid.encode(data, cursor);
        cursor = stockCapacity.encode(data, cursor);
        if (buffer != null && buffer.length >= 119) {
            System.arraycopy(buffer, 110, data, cursor, 9); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 9, (byte) 0); // padding
        }
        cursor += 9;
        cursor = numberOfFlexLegs.encode(data, cursor);
        cursor = flexLegs.encode(data, cursor);
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
        flexLegs.clear();
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
            if (field != numberOfFlexLegs && !field.isRecognized()) {
                return false;
            }
        }
        return flexLegs.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != numberOfFlexLegs && !field.isValid()) {
                return false;
            }
        }
        if (!flexLegs.isValid()) {
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
        if (!timestampField.isDecoded()) {
            return Optional.of(timestampField);
        }
        if (!firmId.isDecoded()) {
            return Optional.of(firmId);
        }
        if (!instrumentId.isDecoded()) {
            return Optional.of(instrumentId);
        }
        if (!orderId.isDecoded()) {
            return Optional.of(orderId);
        }
        if (!clOrdId.isDecoded()) {
            return Optional.of(clOrdId);
        }
        if (!cmta.isDecoded()) {
            return Optional.of(cmta);
        }
        if (!clearingAccount.isDecoded()) {
            return Optional.of(clearingAccount);
        }
        if (!occAccount.isDecoded()) {
            return Optional.of(occAccount);
        }
        if (!custAcct.isDecoded()) {
            return Optional.of(custAcct);
        }
        if (!preferredParty.isDecoded()) {
            return Optional.of(preferredParty);
        }
        if (!aloInst.isDecoded()) {
            return Optional.of(aloInst);
        }
        if (!iso.isDecoded()) {
            return Optional.of(iso);
        }
        if (!side.isDecoded()) {
            return Optional.of(side);
        }
        if (!orderType.isDecoded()) {
            return Optional.of(orderType);
        }
        if (!price.isDecoded()) {
            return Optional.of(price);
        }
        if (!quantity.isDecoded()) {
            return Optional.of(quantity);
        }
        if (!minQty.isDecoded()) {
            return Optional.of(minQty);
        }
        if (!tif.isDecoded()) {
            return Optional.of(tif);
        }
        if (!capacity.isDecoded()) {
            return Optional.of(capacity);
        }
        if (!auctionType.isDecoded()) {
            return Optional.of(auctionType);
        }
        if (!auctionId.isDecoded()) {
            return Optional.of(auctionId);
        }
        if (!disclosureMask.isDecoded()) {
            return Optional.of(disclosureMask);
        }
        if (!priceProtection.isDecoded()) {
            return Optional.of(priceProtection);
        }
        if (!displayQty.isDecoded()) {
            return Optional.of(displayQty);
        }
        if (!displayWhen.isDecoded()) {
            return Optional.of(displayWhen);
        }
        if (!displayMethod.isDecoded()) {
            return Optional.of(displayMethod);
        }
        if (!displayLowQty.isDecoded()) {
            return Optional.of(displayLowQty);
        }
        if (!displayHighQty.isDecoded()) {
            return Optional.of(displayHighQty);
        }
        if (!positionEffectMask.isDecoded()) {
            return Optional.of(positionEffectMask);
        }
        if (!stockLegShortSale.isDecoded()) {
            return Optional.of(stockLegShortSale);
        }
        if (!stockLegMpid.isDecoded()) {
            return Optional.of(stockLegMpid);
        }
        if (!stockCapacity.isDecoded()) {
            return Optional.of(stockCapacity);
        }
        if (!numberOfFlexLegs.isDecoded()) {
            return Optional.of(numberOfFlexLegs);
        }
        if (!flexLegs.isDecoded()) {
            return Optional.of(flexLegs.failedEntry().flatMap(FlexLegsEntry::failedAt).orElse(numberOfFlexLegs));
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
            case "Timestamp" -> Optional.of(timestampField);
            case "FirmId" -> Optional.of(firmId);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "OrderId" -> Optional.of(orderId);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "Cmta" -> Optional.of(cmta);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "OccAccount" -> Optional.of(occAccount);
            case "CustAcct" -> Optional.of(custAcct);
            case "PreferredParty" -> Optional.of(preferredParty);
            case "AloInst" -> Optional.of(aloInst);
            case "Iso" -> Optional.of(iso);
            case "Side" -> Optional.of(side);
            case "OrderType" -> Optional.of(orderType);
            case "Price" -> Optional.of(price);
            case "Quantity" -> Optional.of(quantity);
            case "MinQty" -> Optional.of(minQty);
            case "Tif" -> Optional.of(tif);
            case "Capacity" -> Optional.of(capacity);
            case "AuctionType" -> Optional.of(auctionType);
            case "AuctionId" -> Optional.of(auctionId);
            case "DisclosureMask" -> Optional.of(disclosureMask);
            case "PriceProtection" -> Optional.of(priceProtection);
            case "DisplayQty" -> Optional.of(displayQty);
            case "DisplayWhen" -> Optional.of(displayWhen);
            case "DisplayMethod" -> Optional.of(displayMethod);
            case "DisplayLowQty" -> Optional.of(displayLowQty);
            case "DisplayHighQty" -> Optional.of(displayHighQty);
            case "PositionEffectMask" -> Optional.of(positionEffectMask);
            case "StockLegShortSale" -> Optional.of(stockLegShortSale);
            case "StockLegMpid" -> Optional.of(stockLegMpid);
            case "StockCapacity" -> Optional.of(stockCapacity);
            case "NumberOfFlexLegs" -> Optional.of(numberOfFlexLegs);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderAcceptedLongFormMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(flexLegs.diffFields(message.flexLegs));
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
            flexLegs.toFormattedString(builder, options);
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
        flexLegs.toFormattedString(builder, nested);
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
        if (!(other instanceof OrderAcceptedLongFormMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && flexLegs.equals(message.flexLegs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, flexLegs);
    }
}
