package omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.AuctionAllocPctField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.AuctionDurationField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.AuctionTypeField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.ContraCapacityField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.ContraClOrdIdField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.ContraClearingAccountField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.ContraCmtaField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.ContraCustAcctField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.ContraOccAccountField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.ContraOrderTypeField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.ContraPositionEffectMaskField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.ContraPriceField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.ContraQuantityField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.ContraStockCapacityField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.ContraStockLegMpidField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.ContraStockLegShortSaleField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.CrossTypeField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.DisclosureMaskField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.EffectiveTimeField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.FirmIdField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.InstrumentIdField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.IsoField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.NumberOfFlexLegsField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.PriceProtectionField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.PrimaryCapacityField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.PrimaryClOrdIdField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.PrimaryClearingAccountField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.PrimaryCmtaField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.PrimaryCustAcctField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.PrimaryOccAccountField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.PrimaryPositionEffectMaskField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.PrimaryPriceField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.PrimaryQuantityField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.PrimaryStockCapacityField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.PrimaryStockLegMpidField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.PrimaryStockLegShortSaleField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.SideField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.groups.FlexLegPricesEntry;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.groups.FlexLegPricesList;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.types.Field;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.types.Message;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.types.PrintOptions;

/**
 * Represents the NewCrossOrderMessage message from the Otto protocol.
 *
 * <p>Cross Order message allows specifying two opposite sides to trade against each other. The primary side of the order is exposed in an auction if CrossType is set to A (Auction). Other cross types (QCC and CCC) trade the two sides without market exposure. The Primary Side and Contra Side blocks of the document are carried as Primary and Contra prefixed fields.</p>
 */
public final class NewCrossOrderMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'X';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 156;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Cross Order Message";

    /**
     * Firm ID (e.g. ABCD, 123A)
     */
    private final FirmIdField firmId = new FirmIdField();

    /**
     * Instrument ID, as specified by Option Directory notifications
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * A=Auction, Q=QCC, C=CCC
     */
    private final CrossTypeField crossType = new CrossTypeField();

    /**
     * See Auction Type Field
     */
    private final AuctionTypeField auctionType = new AuctionTypeField();

    /**
     * Order Allocation percentage 0 &lt;= n &lt;= 40. 0 for Simple and Complex Solicitation.
     */
    private final AuctionAllocPctField auctionAllocPct = new AuctionAllocPctField();

    /**
     * B=Buy, S=Sell
     */
    private final SideField side = new SideField();

    /**
     * N=Not ISO, I=ISO
     */
    private final IsoField iso = new IsoField();

    /**
     * L=Local Market, N=National Market
     */
    private final PriceProtectionField priceProtection = new PriceProtectionField();

    /**
     * Agreed upon time for the stopped price. UTC time in milliseconds.
     */
    private final EffectiveTimeField effectiveTime = new EffectiveTimeField();

    /**
     * See Disclosure Mask Field (bits 0-5: Firm, Clearing Account, CMTA Account, Side, Price, Quantity; a set bit makes the attribute visible)
     */
    private final DisclosureMaskField disclosureMask = new DisclosureMaskField();

    /**
     * User defined field for Auction Duration. In milliseconds between 3,000 and 300,000. Only required for Flex auctions. Must be 0 for Non-Flex Auctions.
     */
    private final AuctionDurationField auctionDuration = new AuctionDurationField();

    /**
     * See Client Order Id
     */
    private final PrimaryClOrdIdField primaryClOrdId = new PrimaryClOrdIdField();

    /**
     * CMTA
     */
    private final PrimaryCmtaField primaryCmta = new PrimaryCmtaField();

    /**
     * Sub-account/MM Identifier at the registered exchange; all four characters will be provided to OCC
     */
    private final PrimaryClearingAccountField primaryClearingAccount = new PrimaryClearingAccountField();

    /**
     * OCC # to use for clearing (give up)
     */
    private final PrimaryOccAccountField primaryOccAccount = new PrimaryOccAccountField();

    /**
     * Account on the customer system (pass-through)
     */
    private final PrimaryCustAcctField primaryCustAcct = new PrimaryCustAcctField();

    /**
     * Limit price. Primary Side of a Cross order cannot be Market.
     */
    private final PrimaryPriceField primaryPrice = new PrimaryPriceField();

    /**
     * Number of contracts
     */
    private final PrimaryQuantityField primaryQuantity = new PrimaryQuantityField();

    /**
     * See Order Capacity Field
     */
    private final PrimaryCapacityField primaryCapacity = new PrimaryCapacityField();

    /**
     * See Position Effect Mask Field
     */
    private final PrimaryPositionEffectMaskField primaryPositionEffectMask = new PrimaryPositionEffectMaskField();

    /**
     * N=Not Applicable, H=Sell Short, E=Sell Short Exempt. If this is a multi-leg order for a stock combo where stock leg is on the Sell side StockLegShortSale may be set to H or E. In all other cases value N should be used.
     */
    private final PrimaryStockLegShortSaleField primaryStockLegShortSale = new PrimaryStockLegShortSaleField();

    /**
     * Give-up for the stock leg
     */
    private final PrimaryStockLegMpidField primaryStockLegMpid = new PrimaryStockLegMpidField();

    /**
     * P=Principal, A=Agency, R=Riskless Principal, space=Not Applicable
     */
    private final PrimaryStockCapacityField primaryStockCapacity = new PrimaryStockCapacityField();

    /**
     * See Client Order Id
     */
    private final ContraClOrdIdField contraClOrdId = new ContraClOrdIdField();

    /**
     * CMTA
     */
    private final ContraCmtaField contraCmta = new ContraCmtaField();

    /**
     * Sub-account/MM Identifier at the registered exchange; all four characters will be provided to OCC
     */
    private final ContraClearingAccountField contraClearingAccount = new ContraClearingAccountField();

    /**
     * OCC # to use for clearing (give up)
     */
    private final ContraOccAccountField contraOccAccount = new ContraOccAccountField();

    /**
     * Account on the customer system (pass-through)
     */
    private final ContraCustAcctField contraCustAcct = new ContraCustAcctField();

    /**
     * L=Limit, M=Market
     */
    private final ContraOrderTypeField contraOrderType = new ContraOrderTypeField();

    /**
     * Limit price. Should be set to 0 if Order Type = M.
     */
    private final ContraPriceField contraPrice = new ContraPriceField();

    /**
     * Number of contracts
     */
    private final ContraQuantityField contraQuantity = new ContraQuantityField();

    /**
     * See Order Capacity Field
     */
    private final ContraCapacityField contraCapacity = new ContraCapacityField();

    /**
     * See Position Effect Mask Field
     */
    private final ContraPositionEffectMaskField contraPositionEffectMask = new ContraPositionEffectMaskField();

    /**
     * N=Not Applicable, H=Sell Short, E=Sell Short Exempt. If this is a multi-leg order for a stock combo where stock leg is on the Sell side StockLegShortSale may be set to H or E. In all other cases value N should be used.
     */
    private final ContraStockLegShortSaleField contraStockLegShortSale = new ContraStockLegShortSaleField();

    /**
     * Give-up for the stock leg
     */
    private final ContraStockLegMpidField contraStockLegMpid = new ContraStockLegMpidField();

    /**
     * P=Principal, A=Agency, R=Riskless Principal, space=Not Applicable
     */
    private final ContraStockCapacityField contraStockCapacity = new ContraStockCapacityField();

    /**
     * To be used for notifying Leg Deltas on Delta-Adjusted At Close feature as well as Leg Prices on Flex instruments. It will be 0 for non-Flex instruments.
     */
    private final NumberOfFlexLegsField numberOfFlexLegs = new NumberOfFlexLegsField();

    /**
     * Leg Definitions (1-10) of New Order (Long Form) and New Cross Order: Leg Prices on Flex instruments, to be used for Leg Deltas on the Delta-Adjusted At Close feature
     */
    private final FlexLegPricesList flexLegPrices = new FlexLegPricesList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(firmId, instrumentId, crossType, auctionType, auctionAllocPct, side, iso, priceProtection, effectiveTime, disclosureMask, auctionDuration, primaryClOrdId, primaryCmta, primaryClearingAccount, primaryOccAccount, primaryCustAcct, primaryPrice, primaryQuantity, primaryCapacity, primaryPositionEffectMask, primaryStockLegShortSale, primaryStockLegMpid, primaryStockCapacity, contraClOrdId, contraCmta, contraClearingAccount, contraOccAccount, contraCustAcct, contraOrderType, contraPrice, contraQuantity, contraCapacity, contraPositionEffectMask, contraStockLegShortSale, contraStockLegMpid, contraStockCapacity, numberOfFlexLegs);

    private byte[] buffer;

    private boolean decoded;

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
     * A=Auction, Q=QCC, C=CCC
     *
     * @return the CrossType field
     */
    public CrossTypeField crossType() {
        return crossType;
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
     * Order Allocation percentage 0 &lt;= n &lt;= 40. 0 for Simple and Complex Solicitation.
     *
     * @return the AuctionAllocPct field
     */
    public AuctionAllocPctField auctionAllocPct() {
        return auctionAllocPct;
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
     * N=Not ISO, I=ISO
     *
     * @return the Iso field
     */
    public IsoField iso() {
        return iso;
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
     * Agreed upon time for the stopped price. UTC time in milliseconds.
     *
     * @return the EffectiveTime field
     */
    public EffectiveTimeField effectiveTime() {
        return effectiveTime;
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
     * User defined field for Auction Duration. In milliseconds between 3,000 and 300,000. Only required for Flex auctions. Must be 0 for Non-Flex Auctions.
     *
     * @return the AuctionDuration field
     */
    public AuctionDurationField auctionDuration() {
        return auctionDuration;
    }

    /**
     * See Client Order Id
     *
     * @return the PrimaryClOrdId field
     */
    public PrimaryClOrdIdField primaryClOrdId() {
        return primaryClOrdId;
    }

    /**
     * CMTA
     *
     * @return the PrimaryCmta field
     */
    public PrimaryCmtaField primaryCmta() {
        return primaryCmta;
    }

    /**
     * Sub-account/MM Identifier at the registered exchange; all four characters will be provided to OCC
     *
     * @return the PrimaryClearingAccount field
     */
    public PrimaryClearingAccountField primaryClearingAccount() {
        return primaryClearingAccount;
    }

    /**
     * OCC # to use for clearing (give up)
     *
     * @return the PrimaryOccAccount field
     */
    public PrimaryOccAccountField primaryOccAccount() {
        return primaryOccAccount;
    }

    /**
     * Account on the customer system (pass-through)
     *
     * @return the PrimaryCustAcct field
     */
    public PrimaryCustAcctField primaryCustAcct() {
        return primaryCustAcct;
    }

    /**
     * Limit price. Primary Side of a Cross order cannot be Market.
     *
     * @return the PrimaryPrice field
     */
    public PrimaryPriceField primaryPrice() {
        return primaryPrice;
    }

    /**
     * Number of contracts
     *
     * @return the PrimaryQuantity field
     */
    public PrimaryQuantityField primaryQuantity() {
        return primaryQuantity;
    }

    /**
     * See Order Capacity Field
     *
     * @return the PrimaryCapacity field
     */
    public PrimaryCapacityField primaryCapacity() {
        return primaryCapacity;
    }

    /**
     * See Position Effect Mask Field
     *
     * @return the PrimaryPositionEffectMask field
     */
    public PrimaryPositionEffectMaskField primaryPositionEffectMask() {
        return primaryPositionEffectMask;
    }

    /**
     * N=Not Applicable, H=Sell Short, E=Sell Short Exempt. If this is a multi-leg order for a stock combo where stock leg is on the Sell side StockLegShortSale may be set to H or E. In all other cases value N should be used.
     *
     * @return the PrimaryStockLegShortSale field
     */
    public PrimaryStockLegShortSaleField primaryStockLegShortSale() {
        return primaryStockLegShortSale;
    }

    /**
     * Give-up for the stock leg
     *
     * @return the PrimaryStockLegMpid field
     */
    public PrimaryStockLegMpidField primaryStockLegMpid() {
        return primaryStockLegMpid;
    }

    /**
     * P=Principal, A=Agency, R=Riskless Principal, space=Not Applicable
     *
     * @return the PrimaryStockCapacity field
     */
    public PrimaryStockCapacityField primaryStockCapacity() {
        return primaryStockCapacity;
    }

    /**
     * See Client Order Id
     *
     * @return the ContraClOrdId field
     */
    public ContraClOrdIdField contraClOrdId() {
        return contraClOrdId;
    }

    /**
     * CMTA
     *
     * @return the ContraCmta field
     */
    public ContraCmtaField contraCmta() {
        return contraCmta;
    }

    /**
     * Sub-account/MM Identifier at the registered exchange; all four characters will be provided to OCC
     *
     * @return the ContraClearingAccount field
     */
    public ContraClearingAccountField contraClearingAccount() {
        return contraClearingAccount;
    }

    /**
     * OCC # to use for clearing (give up)
     *
     * @return the ContraOccAccount field
     */
    public ContraOccAccountField contraOccAccount() {
        return contraOccAccount;
    }

    /**
     * Account on the customer system (pass-through)
     *
     * @return the ContraCustAcct field
     */
    public ContraCustAcctField contraCustAcct() {
        return contraCustAcct;
    }

    /**
     * L=Limit, M=Market
     *
     * @return the ContraOrderType field
     */
    public ContraOrderTypeField contraOrderType() {
        return contraOrderType;
    }

    /**
     * Limit price. Should be set to 0 if Order Type = M.
     *
     * @return the ContraPrice field
     */
    public ContraPriceField contraPrice() {
        return contraPrice;
    }

    /**
     * Number of contracts
     *
     * @return the ContraQuantity field
     */
    public ContraQuantityField contraQuantity() {
        return contraQuantity;
    }

    /**
     * See Order Capacity Field
     *
     * @return the ContraCapacity field
     */
    public ContraCapacityField contraCapacity() {
        return contraCapacity;
    }

    /**
     * See Position Effect Mask Field
     *
     * @return the ContraPositionEffectMask field
     */
    public ContraPositionEffectMaskField contraPositionEffectMask() {
        return contraPositionEffectMask;
    }

    /**
     * N=Not Applicable, H=Sell Short, E=Sell Short Exempt. If this is a multi-leg order for a stock combo where stock leg is on the Sell side StockLegShortSale may be set to H or E. In all other cases value N should be used.
     *
     * @return the ContraStockLegShortSale field
     */
    public ContraStockLegShortSaleField contraStockLegShortSale() {
        return contraStockLegShortSale;
    }

    /**
     * Give-up for the stock leg
     *
     * @return the ContraStockLegMpid field
     */
    public ContraStockLegMpidField contraStockLegMpid() {
        return contraStockLegMpid;
    }

    /**
     * P=Principal, A=Agency, R=Riskless Principal, space=Not Applicable
     *
     * @return the ContraStockCapacity field
     */
    public ContraStockCapacityField contraStockCapacity() {
        return contraStockCapacity;
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
     * Leg Definitions (1-10) of New Order (Long Form) and New Cross Order: Leg Prices on Flex instruments, to be used for Leg Deltas on the Delta-Adjusted At Close feature
     *
     * <p>Encode writes this list's size to the NumberOfFlexLegs field.</p>
     *
     * @return the FlexLegPrices entries
     */
    public FlexLegPricesList flexLegPrices() {
        return flexLegPrices;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + flexLegPrices.byteLength();
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
        cursor += 4;
        cursor += 4;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 8;
        cursor += 1;
        cursor += 4;
        runs.add(cursor).add(9);
        cursor += 9;
        cursor += 16;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 10;
        cursor += 8;
        cursor += 4;
        cursor += 1;
        cursor += 2;
        cursor += 1;
        cursor += 4;
        cursor += 1;
        cursor += 16;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 10;
        cursor += 1;
        cursor += 8;
        cursor += 4;
        cursor += 1;
        cursor += 2;
        cursor += 1;
        cursor += 4;
        cursor += 1;
        cursor += 1;
        cursor = flexLegPrices.padding(runs, cursor);
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
        if (!firmId.parse(data, cursor)) {
            return false;
        }
        cursor += FirmIdField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!crossType.parse(data, cursor)) {
            return false;
        }
        cursor += CrossTypeField.BYTE_LENGTH;
        if (!auctionType.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionTypeField.BYTE_LENGTH;
        if (!auctionAllocPct.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionAllocPctField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!iso.parse(data, cursor)) {
            return false;
        }
        cursor += IsoField.BYTE_LENGTH;
        if (!priceProtection.parse(data, cursor)) {
            return false;
        }
        cursor += PriceProtectionField.BYTE_LENGTH;
        if (!effectiveTime.parse(data, cursor)) {
            return false;
        }
        cursor += EffectiveTimeField.BYTE_LENGTH;
        if (!disclosureMask.parse(data, cursor)) {
            return false;
        }
        cursor += DisclosureMaskField.BYTE_LENGTH;
        if (!auctionDuration.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionDurationField.BYTE_LENGTH;
        cursor += 9; // padding
        if (!primaryClOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += PrimaryClOrdIdField.BYTE_LENGTH;
        if (!primaryCmta.parse(data, cursor)) {
            return false;
        }
        cursor += PrimaryCmtaField.BYTE_LENGTH;
        if (!primaryClearingAccount.parse(data, cursor)) {
            return false;
        }
        cursor += PrimaryClearingAccountField.BYTE_LENGTH;
        if (!primaryOccAccount.parse(data, cursor)) {
            return false;
        }
        cursor += PrimaryOccAccountField.BYTE_LENGTH;
        if (!primaryCustAcct.parse(data, cursor)) {
            return false;
        }
        cursor += PrimaryCustAcctField.BYTE_LENGTH;
        if (!primaryPrice.parse(data, cursor)) {
            return false;
        }
        cursor += PrimaryPriceField.BYTE_LENGTH;
        if (!primaryQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += PrimaryQuantityField.BYTE_LENGTH;
        if (!primaryCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += PrimaryCapacityField.BYTE_LENGTH;
        if (!primaryPositionEffectMask.parse(data, cursor)) {
            return false;
        }
        cursor += PrimaryPositionEffectMaskField.BYTE_LENGTH;
        if (!primaryStockLegShortSale.parse(data, cursor)) {
            return false;
        }
        cursor += PrimaryStockLegShortSaleField.BYTE_LENGTH;
        if (!primaryStockLegMpid.parse(data, cursor)) {
            return false;
        }
        cursor += PrimaryStockLegMpidField.BYTE_LENGTH;
        if (!primaryStockCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += PrimaryStockCapacityField.BYTE_LENGTH;
        if (!contraClOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ContraClOrdIdField.BYTE_LENGTH;
        if (!contraCmta.parse(data, cursor)) {
            return false;
        }
        cursor += ContraCmtaField.BYTE_LENGTH;
        if (!contraClearingAccount.parse(data, cursor)) {
            return false;
        }
        cursor += ContraClearingAccountField.BYTE_LENGTH;
        if (!contraOccAccount.parse(data, cursor)) {
            return false;
        }
        cursor += ContraOccAccountField.BYTE_LENGTH;
        if (!contraCustAcct.parse(data, cursor)) {
            return false;
        }
        cursor += ContraCustAcctField.BYTE_LENGTH;
        if (!contraOrderType.parse(data, cursor)) {
            return false;
        }
        cursor += ContraOrderTypeField.BYTE_LENGTH;
        if (!contraPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ContraPriceField.BYTE_LENGTH;
        if (!contraQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += ContraQuantityField.BYTE_LENGTH;
        if (!contraCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += ContraCapacityField.BYTE_LENGTH;
        if (!contraPositionEffectMask.parse(data, cursor)) {
            return false;
        }
        cursor += ContraPositionEffectMaskField.BYTE_LENGTH;
        if (!contraStockLegShortSale.parse(data, cursor)) {
            return false;
        }
        cursor += ContraStockLegShortSaleField.BYTE_LENGTH;
        if (!contraStockLegMpid.parse(data, cursor)) {
            return false;
        }
        cursor += ContraStockLegMpidField.BYTE_LENGTH;
        if (!contraStockCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += ContraStockCapacityField.BYTE_LENGTH;
        if (!numberOfFlexLegs.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfFlexLegsField.BYTE_LENGTH;
        if (!flexLegPrices.parse(data, cursor, end, numberOfFlexLegs.value())) {
            return false;
        }
        cursor += flexLegPrices.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (flexLegPrices.size() > 255) {
            throw new IllegalStateException("flexLegPrices holds " + flexLegPrices.size() + " entries, more than its count field can state");
        }
        numberOfFlexLegs.value((short) flexLegPrices.size());
        int cursor = offset;
        cursor = firmId.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = crossType.encode(data, cursor);
        cursor = auctionType.encode(data, cursor);
        cursor = auctionAllocPct.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = iso.encode(data, cursor);
        cursor = priceProtection.encode(data, cursor);
        cursor = effectiveTime.encode(data, cursor);
        cursor = disclosureMask.encode(data, cursor);
        cursor = auctionDuration.encode(data, cursor);
        if (buffer != null && buffer.length >= 36) {
            System.arraycopy(buffer, 27, data, cursor, 9); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 9, (byte) 0); // padding
        }
        cursor += 9;
        cursor = primaryClOrdId.encode(data, cursor);
        cursor = primaryCmta.encode(data, cursor);
        cursor = primaryClearingAccount.encode(data, cursor);
        cursor = primaryOccAccount.encode(data, cursor);
        cursor = primaryCustAcct.encode(data, cursor);
        cursor = primaryPrice.encode(data, cursor);
        cursor = primaryQuantity.encode(data, cursor);
        cursor = primaryCapacity.encode(data, cursor);
        cursor = primaryPositionEffectMask.encode(data, cursor);
        cursor = primaryStockLegShortSale.encode(data, cursor);
        cursor = primaryStockLegMpid.encode(data, cursor);
        cursor = primaryStockCapacity.encode(data, cursor);
        cursor = contraClOrdId.encode(data, cursor);
        cursor = contraCmta.encode(data, cursor);
        cursor = contraClearingAccount.encode(data, cursor);
        cursor = contraOccAccount.encode(data, cursor);
        cursor = contraCustAcct.encode(data, cursor);
        cursor = contraOrderType.encode(data, cursor);
        cursor = contraPrice.encode(data, cursor);
        cursor = contraQuantity.encode(data, cursor);
        cursor = contraCapacity.encode(data, cursor);
        cursor = contraPositionEffectMask.encode(data, cursor);
        cursor = contraStockLegShortSale.encode(data, cursor);
        cursor = contraStockLegMpid.encode(data, cursor);
        cursor = contraStockCapacity.encode(data, cursor);
        cursor = numberOfFlexLegs.encode(data, cursor);
        cursor = flexLegPrices.encode(data, cursor);
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
        flexLegPrices.clear();
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
        return flexLegPrices.isRecognized();
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
        if (!flexLegPrices.isValid()) {
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
        if (!firmId.isDecoded()) {
            return Optional.of(firmId);
        }
        if (!instrumentId.isDecoded()) {
            return Optional.of(instrumentId);
        }
        if (!crossType.isDecoded()) {
            return Optional.of(crossType);
        }
        if (!auctionType.isDecoded()) {
            return Optional.of(auctionType);
        }
        if (!auctionAllocPct.isDecoded()) {
            return Optional.of(auctionAllocPct);
        }
        if (!side.isDecoded()) {
            return Optional.of(side);
        }
        if (!iso.isDecoded()) {
            return Optional.of(iso);
        }
        if (!priceProtection.isDecoded()) {
            return Optional.of(priceProtection);
        }
        if (!effectiveTime.isDecoded()) {
            return Optional.of(effectiveTime);
        }
        if (!disclosureMask.isDecoded()) {
            return Optional.of(disclosureMask);
        }
        if (!auctionDuration.isDecoded()) {
            return Optional.of(auctionDuration);
        }
        if (!primaryClOrdId.isDecoded()) {
            return Optional.of(primaryClOrdId);
        }
        if (!primaryCmta.isDecoded()) {
            return Optional.of(primaryCmta);
        }
        if (!primaryClearingAccount.isDecoded()) {
            return Optional.of(primaryClearingAccount);
        }
        if (!primaryOccAccount.isDecoded()) {
            return Optional.of(primaryOccAccount);
        }
        if (!primaryCustAcct.isDecoded()) {
            return Optional.of(primaryCustAcct);
        }
        if (!primaryPrice.isDecoded()) {
            return Optional.of(primaryPrice);
        }
        if (!primaryQuantity.isDecoded()) {
            return Optional.of(primaryQuantity);
        }
        if (!primaryCapacity.isDecoded()) {
            return Optional.of(primaryCapacity);
        }
        if (!primaryPositionEffectMask.isDecoded()) {
            return Optional.of(primaryPositionEffectMask);
        }
        if (!primaryStockLegShortSale.isDecoded()) {
            return Optional.of(primaryStockLegShortSale);
        }
        if (!primaryStockLegMpid.isDecoded()) {
            return Optional.of(primaryStockLegMpid);
        }
        if (!primaryStockCapacity.isDecoded()) {
            return Optional.of(primaryStockCapacity);
        }
        if (!contraClOrdId.isDecoded()) {
            return Optional.of(contraClOrdId);
        }
        if (!contraCmta.isDecoded()) {
            return Optional.of(contraCmta);
        }
        if (!contraClearingAccount.isDecoded()) {
            return Optional.of(contraClearingAccount);
        }
        if (!contraOccAccount.isDecoded()) {
            return Optional.of(contraOccAccount);
        }
        if (!contraCustAcct.isDecoded()) {
            return Optional.of(contraCustAcct);
        }
        if (!contraOrderType.isDecoded()) {
            return Optional.of(contraOrderType);
        }
        if (!contraPrice.isDecoded()) {
            return Optional.of(contraPrice);
        }
        if (!contraQuantity.isDecoded()) {
            return Optional.of(contraQuantity);
        }
        if (!contraCapacity.isDecoded()) {
            return Optional.of(contraCapacity);
        }
        if (!contraPositionEffectMask.isDecoded()) {
            return Optional.of(contraPositionEffectMask);
        }
        if (!contraStockLegShortSale.isDecoded()) {
            return Optional.of(contraStockLegShortSale);
        }
        if (!contraStockLegMpid.isDecoded()) {
            return Optional.of(contraStockLegMpid);
        }
        if (!contraStockCapacity.isDecoded()) {
            return Optional.of(contraStockCapacity);
        }
        if (!numberOfFlexLegs.isDecoded()) {
            return Optional.of(numberOfFlexLegs);
        }
        if (!flexLegPrices.isDecoded()) {
            return Optional.of(flexLegPrices.failedEntry().flatMap(FlexLegPricesEntry::failedAt).orElse(numberOfFlexLegs));
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
            case "FirmId" -> Optional.of(firmId);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "CrossType" -> Optional.of(crossType);
            case "AuctionType" -> Optional.of(auctionType);
            case "AuctionAllocPct" -> Optional.of(auctionAllocPct);
            case "Side" -> Optional.of(side);
            case "Iso" -> Optional.of(iso);
            case "PriceProtection" -> Optional.of(priceProtection);
            case "EffectiveTime" -> Optional.of(effectiveTime);
            case "DisclosureMask" -> Optional.of(disclosureMask);
            case "AuctionDuration" -> Optional.of(auctionDuration);
            case "PrimaryClOrdId" -> Optional.of(primaryClOrdId);
            case "PrimaryCmta" -> Optional.of(primaryCmta);
            case "PrimaryClearingAccount" -> Optional.of(primaryClearingAccount);
            case "PrimaryOccAccount" -> Optional.of(primaryOccAccount);
            case "PrimaryCustAcct" -> Optional.of(primaryCustAcct);
            case "PrimaryPrice" -> Optional.of(primaryPrice);
            case "PrimaryQuantity" -> Optional.of(primaryQuantity);
            case "PrimaryCapacity" -> Optional.of(primaryCapacity);
            case "PrimaryPositionEffectMask" -> Optional.of(primaryPositionEffectMask);
            case "PrimaryStockLegShortSale" -> Optional.of(primaryStockLegShortSale);
            case "PrimaryStockLegMpid" -> Optional.of(primaryStockLegMpid);
            case "PrimaryStockCapacity" -> Optional.of(primaryStockCapacity);
            case "ContraClOrdId" -> Optional.of(contraClOrdId);
            case "ContraCmta" -> Optional.of(contraCmta);
            case "ContraClearingAccount" -> Optional.of(contraClearingAccount);
            case "ContraOccAccount" -> Optional.of(contraOccAccount);
            case "ContraCustAcct" -> Optional.of(contraCustAcct);
            case "ContraOrderType" -> Optional.of(contraOrderType);
            case "ContraPrice" -> Optional.of(contraPrice);
            case "ContraQuantity" -> Optional.of(contraQuantity);
            case "ContraCapacity" -> Optional.of(contraCapacity);
            case "ContraPositionEffectMask" -> Optional.of(contraPositionEffectMask);
            case "ContraStockLegShortSale" -> Optional.of(contraStockLegShortSale);
            case "ContraStockLegMpid" -> Optional.of(contraStockLegMpid);
            case "ContraStockCapacity" -> Optional.of(contraStockCapacity);
            case "NumberOfFlexLegs" -> Optional.of(numberOfFlexLegs);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewCrossOrderMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(flexLegPrices.diffFields(message.flexLegPrices));
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
            flexLegPrices.toFormattedString(builder, options);
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
        flexLegPrices.toFormattedString(builder, nested);
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
        if (!(other instanceof NewCrossOrderMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && flexLegPrices.equals(message.flexLegPrices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, flexLegPrices);
    }
}
