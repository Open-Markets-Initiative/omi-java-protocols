package omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.fields.TagField;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.structs.ClearingAccount;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.structs.ClearingAccountType;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.structs.ClearingFirm;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.structs.ClientReference;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.structs.ConditionalType;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.structs.CrossType;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.structs.CumulativeQuantity;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.structs.CustomerOrderCapacity;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.structs.DeaIndicator;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.structs.Display;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.structs.DisplayPrice;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.structs.DisplayQuantity;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.structs.ExpireTime;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.structs.Firm;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.structs.FirmUpId;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.structs.LiquidityProvisionIndicator;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.structs.MaxFloor;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.structs.MaxRate;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.structs.MinRate;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.structs.MinimumQuantity;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.structs.OrderCondition;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.structs.OrderReference;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.structs.OriginalOrderEntryDate;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.structs.OriginalOrderReferenceNumber;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.structs.PegDifference;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.structs.PegType;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.structs.RandomReserve;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.structs.SecondaryOrderReferenceNumber;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.structs.StpAction;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.structs.StpLevel;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.structs.StpTraderGroup;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.structs.TargetStrategy;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.structs.TimeInForce;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.structs.TradingAtClosingPrice;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.types.Field;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.types.GroupEntry;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.types.PrintOptions;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.types.RawRecord;

/**
 * The ValuePayload branch: one of 34 records, each as wide as its own fields, chosen by the Tag its holder reads before it.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class ValuePayload implements GroupEntry {

    /**
     * The width of this branch's narrowest case: the least it occupies on the wire.
     */
    public static final int MINIMUM_BYTE_LENGTH = 0;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "ValuePayload";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when its holder's Tag is 1.
         */
        CLEARING_ACCOUNT,
        /**
         * Selected when its holder's Tag is 2.
         */
        CLEARING_ACCOUNT_TYPE,
        /**
         * Selected when its holder's Tag is 3.
         */
        CLEARING_FIRM,
        /**
         * Selected when its holder's Tag is 4.
         */
        CLIENT_REFERENCE,
        /**
         * Selected when its holder's Tag is 5.
         */
        CROSS_TYPE,
        /**
         * Selected when its holder's Tag is 6.
         */
        DEA_INDICATOR,
        /**
         * Selected when its holder's Tag is 7.
         */
        DISPLAY,
        /**
         * Selected when its holder's Tag is 8.
         */
        DISPLAY_PRICE,
        /**
         * Selected when its holder's Tag is 9.
         */
        DISPLAY_QUANTITY,
        /**
         * Selected when its holder's Tag is 10.
         */
        EXPIRE_TIME,
        /**
         * Selected when its holder's Tag is 11.
         */
        FIRM,
        /**
         * Selected when its holder's Tag is 12.
         */
        LIQUIDITY_PROVISION_INDICATOR,
        /**
         * Selected when its holder's Tag is 13.
         */
        MAX_FLOOR,
        /**
         * Selected when its holder's Tag is 14.
         */
        MINIMUM_QUANTITY,
        /**
         * Selected when its holder's Tag is 15.
         */
        ORDER_REFERENCE,
        /**
         * Selected when its holder's Tag is 16.
         */
        ORIGINAL_ORDER_ENTRY_DATE,
        /**
         * Selected when its holder's Tag is 17.
         */
        ORIGINAL_ORDER_REFERENCE_NUMBER,
        /**
         * Selected when its holder's Tag is 18.
         */
        PEG_DIFFERENCE,
        /**
         * Selected when its holder's Tag is 19.
         */
        PEG_TYPE,
        /**
         * Selected when its holder's Tag is 20.
         */
        RANDOM_RESERVE,
        /**
         * Selected when its holder's Tag is 21.
         */
        SECONDARY_ORDER_REFERENCE_NUMBER,
        /**
         * Selected when its holder's Tag is 22.
         */
        STP_ACTION,
        /**
         * Selected when its holder's Tag is 23.
         */
        STP_LEVEL,
        /**
         * Selected when its holder's Tag is 24.
         */
        STP_TRADER_GROUP,
        /**
         * Selected when its holder's Tag is 25.
         */
        TIME_IN_FORCE,
        /**
         * Selected when its holder's Tag is 26.
         */
        TRADING_AT_CLOSING_PRICE,
        /**
         * Selected when its holder's Tag is 27.
         */
        ORDER_CONDITION,
        /**
         * Selected when its holder's Tag is 28.
         */
        CUMULATIVE_QUANTITY,
        /**
         * Selected when its holder's Tag is 29.
         */
        CUSTOMER_ORDER_CAPACITY,
        /**
         * Selected when its holder's Tag is 30.
         */
        TARGET_STRATEGY,
        /**
         * Selected when its holder's Tag is 31.
         */
        MIN_RATE,
        /**
         * Selected when its holder's Tag is 32.
         */
        MAX_RATE,
        /**
         * Selected when its holder's Tag is 33.
         */
        CONDITIONAL_TYPE,
        /**
         * Selected when its holder's Tag is 34.
         */
        FIRM_UP_ID,
        /**
         * Selected when its holder's Tag names no case above: the bytes the wire states for it, kept whole.
         */
        UNKNOWN
    }

    private final ClearingAccount clearingAccount = new ClearingAccount();
    private final ClearingAccountType clearingAccountType = new ClearingAccountType();
    private final ClearingFirm clearingFirm = new ClearingFirm();
    private final ClientReference clientReference = new ClientReference();
    private final CrossType crossType = new CrossType();
    private final DeaIndicator deaIndicator = new DeaIndicator();
    private final Display display = new Display();
    private final DisplayPrice displayPrice = new DisplayPrice();
    private final DisplayQuantity displayQuantity = new DisplayQuantity();
    private final ExpireTime expireTime = new ExpireTime();
    private final Firm firm = new Firm();
    private final LiquidityProvisionIndicator liquidityProvisionIndicator = new LiquidityProvisionIndicator();
    private final MaxFloor maxFloor = new MaxFloor();
    private final MinimumQuantity minimumQuantity = new MinimumQuantity();
    private final OrderReference orderReference = new OrderReference();
    private final OriginalOrderEntryDate originalOrderEntryDate = new OriginalOrderEntryDate();
    private final OriginalOrderReferenceNumber originalOrderReferenceNumber = new OriginalOrderReferenceNumber();
    private final PegDifference pegDifference = new PegDifference();
    private final PegType pegType = new PegType();
    private final RandomReserve randomReserve = new RandomReserve();
    private final SecondaryOrderReferenceNumber secondaryOrderReferenceNumber = new SecondaryOrderReferenceNumber();
    private final StpAction stpAction = new StpAction();
    private final StpLevel stpLevel = new StpLevel();
    private final StpTraderGroup stpTraderGroup = new StpTraderGroup();
    private final TimeInForce timeInForce = new TimeInForce();
    private final TradingAtClosingPrice tradingAtClosingPrice = new TradingAtClosingPrice();
    private final OrderCondition orderCondition = new OrderCondition();
    private final CumulativeQuantity cumulativeQuantity = new CumulativeQuantity();
    private final CustomerOrderCapacity customerOrderCapacity = new CustomerOrderCapacity();
    private final TargetStrategy targetStrategy = new TargetStrategy();
    private final MinRate minRate = new MinRate();
    private final MaxRate maxRate = new MaxRate();
    private final ConditionalType conditionalType = new ConditionalType();
    private final FirmUpId firmUpId = new FirmUpId();
    private final RawRecord unknown = new RawRecord();
    private Case selected = Case.CLEARING_ACCOUNT;

    /**
     * Returns the case this branch holds: the one its rules selected, or the one last chosen.
     *
     * @return the selected case
     */
    public Case selected() {
        return selected;
    }

    /**
     * Chooses the case to encode. Its holder writes the Tag that selects it, so its bytes select it again.
     *
     * @param value the case
     */
    public void select(Case value) {
        selected = Objects.requireNonNull(value, "value");
    }

    /**
     * Returns the case a Tag selects, rules tried in order.
     *
     * @param tag the field its holder read before this branch
     * @return the selected case, or null when it selects none
     */
    public static Case caseFor(TagField tag) {
        if (tag.value() == 1L) {
            return Case.CLEARING_ACCOUNT;
        }
        if (tag.value() == 2L) {
            return Case.CLEARING_ACCOUNT_TYPE;
        }
        if (tag.value() == 3L) {
            return Case.CLEARING_FIRM;
        }
        if (tag.value() == 4L) {
            return Case.CLIENT_REFERENCE;
        }
        if (tag.value() == 5L) {
            return Case.CROSS_TYPE;
        }
        if (tag.value() == 6L) {
            return Case.DEA_INDICATOR;
        }
        if (tag.value() == 7L) {
            return Case.DISPLAY;
        }
        if (tag.value() == 8L) {
            return Case.DISPLAY_PRICE;
        }
        if (tag.value() == 9L) {
            return Case.DISPLAY_QUANTITY;
        }
        if (tag.value() == 10L) {
            return Case.EXPIRE_TIME;
        }
        if (tag.value() == 11L) {
            return Case.FIRM;
        }
        if (tag.value() == 12L) {
            return Case.LIQUIDITY_PROVISION_INDICATOR;
        }
        if (tag.value() == 13L) {
            return Case.MAX_FLOOR;
        }
        if (tag.value() == 14L) {
            return Case.MINIMUM_QUANTITY;
        }
        if (tag.value() == 15L) {
            return Case.ORDER_REFERENCE;
        }
        if (tag.value() == 16L) {
            return Case.ORIGINAL_ORDER_ENTRY_DATE;
        }
        if (tag.value() == 17L) {
            return Case.ORIGINAL_ORDER_REFERENCE_NUMBER;
        }
        if (tag.value() == 18L) {
            return Case.PEG_DIFFERENCE;
        }
        if (tag.value() == 19L) {
            return Case.PEG_TYPE;
        }
        if (tag.value() == 20L) {
            return Case.RANDOM_RESERVE;
        }
        if (tag.value() == 21L) {
            return Case.SECONDARY_ORDER_REFERENCE_NUMBER;
        }
        if (tag.value() == 22L) {
            return Case.STP_ACTION;
        }
        if (tag.value() == 23L) {
            return Case.STP_LEVEL;
        }
        if (tag.value() == 24L) {
            return Case.STP_TRADER_GROUP;
        }
        if (tag.value() == 25L) {
            return Case.TIME_IN_FORCE;
        }
        if (tag.value() == 26L) {
            return Case.TRADING_AT_CLOSING_PRICE;
        }
        if (tag.value() == 27L) {
            return Case.ORDER_CONDITION;
        }
        if (tag.value() == 28L) {
            return Case.CUMULATIVE_QUANTITY;
        }
        if (tag.value() == 29L) {
            return Case.CUSTOMER_ORDER_CAPACITY;
        }
        if (tag.value() == 30L) {
            return Case.TARGET_STRATEGY;
        }
        if (tag.value() == 31L) {
            return Case.MIN_RATE;
        }
        if (tag.value() == 32L) {
            return Case.MAX_RATE;
        }
        if (tag.value() == 33L) {
            return Case.CONDITIONAL_TYPE;
        }
        if (tag.value() == 34L) {
            return Case.FIRM_UP_ID;
        }
        return null;
    }

    /**
     * Writes the Tag that selects the case this branch holds.
     *
     * @param tag the field its holder writes before this branch
     */
    public void writeKey(TagField tag) {
        switch (selected) {
            case CLEARING_ACCOUNT -> tag.value((short) 1);
            case CLEARING_ACCOUNT_TYPE -> tag.value((short) 2);
            case CLEARING_FIRM -> tag.value((short) 3);
            case CLIENT_REFERENCE -> tag.value((short) 4);
            case CROSS_TYPE -> tag.value((short) 5);
            case DEA_INDICATOR -> tag.value((short) 6);
            case DISPLAY -> tag.value((short) 7);
            case DISPLAY_PRICE -> tag.value((short) 8);
            case DISPLAY_QUANTITY -> tag.value((short) 9);
            case EXPIRE_TIME -> tag.value((short) 10);
            case FIRM -> tag.value((short) 11);
            case LIQUIDITY_PROVISION_INDICATOR -> tag.value((short) 12);
            case MAX_FLOOR -> tag.value((short) 13);
            case MINIMUM_QUANTITY -> tag.value((short) 14);
            case ORDER_REFERENCE -> tag.value((short) 15);
            case ORIGINAL_ORDER_ENTRY_DATE -> tag.value((short) 16);
            case ORIGINAL_ORDER_REFERENCE_NUMBER -> tag.value((short) 17);
            case PEG_DIFFERENCE -> tag.value((short) 18);
            case PEG_TYPE -> tag.value((short) 19);
            case RANDOM_RESERVE -> tag.value((short) 20);
            case SECONDARY_ORDER_REFERENCE_NUMBER -> tag.value((short) 21);
            case STP_ACTION -> tag.value((short) 22);
            case STP_LEVEL -> tag.value((short) 23);
            case STP_TRADER_GROUP -> tag.value((short) 24);
            case TIME_IN_FORCE -> tag.value((short) 25);
            case TRADING_AT_CLOSING_PRICE -> tag.value((short) 26);
            case ORDER_CONDITION -> tag.value((short) 27);
            case CUMULATIVE_QUANTITY -> tag.value((short) 28);
            case CUSTOMER_ORDER_CAPACITY -> tag.value((short) 29);
            case TARGET_STRATEGY -> tag.value((short) 30);
            case MIN_RATE -> tag.value((short) 31);
            case MAX_RATE -> tag.value((short) 32);
            case CONDITIONAL_TYPE -> tag.value((short) 33);
            case FIRM_UP_ID -> tag.value((short) 34);
            case UNKNOWN -> { }
        }
    }

    /**
     * Decodes the case a Tag selects.
     *
     * @param tag the field its holder read before this branch
     * @param data   the buffer to decode from
     * @param offset the index of this branch's first byte
     * @param end    the index just past the last byte this branch may read
     * @return true when its record decoded; a key naming no declared case keeps the bytes the wire states
     */
    public boolean parseFrom(TagField tag, byte[] data, int offset, int end) {
        clear();
        Case chosen = caseFor(tag);
        if (chosen == null) {
            chosen = Case.UNKNOWN;
        }
        selected = chosen;
        return entry().parseFrom(data, offset, end);
    }

    /**
     * Returns the ClearingAccount case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public ClearingAccount clearingAccount() {
        return clearingAccount;
    }

    /**
     * Returns the ClearingAccountType case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public ClearingAccountType clearingAccountType() {
        return clearingAccountType;
    }

    /**
     * Returns the ClearingFirm case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public ClearingFirm clearingFirm() {
        return clearingFirm;
    }

    /**
     * Returns the ClientReference case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public ClientReference clientReference() {
        return clientReference;
    }

    /**
     * Returns the CrossType case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public CrossType crossType() {
        return crossType;
    }

    /**
     * Returns the DeaIndicator case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public DeaIndicator deaIndicator() {
        return deaIndicator;
    }

    /**
     * Returns the Display case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public Display display() {
        return display;
    }

    /**
     * Returns the DisplayPrice case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public DisplayPrice displayPrice() {
        return displayPrice;
    }

    /**
     * Returns the DisplayQuantity case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public DisplayQuantity displayQuantity() {
        return displayQuantity;
    }

    /**
     * Returns the ExpireTime case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public ExpireTime expireTime() {
        return expireTime;
    }

    /**
     * Returns the Firm case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public Firm firm() {
        return firm;
    }

    /**
     * Returns the LiquidityProvisionIndicator case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public LiquidityProvisionIndicator liquidityProvisionIndicator() {
        return liquidityProvisionIndicator;
    }

    /**
     * Returns the MaxFloor case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MaxFloor maxFloor() {
        return maxFloor;
    }

    /**
     * Returns the MinimumQuantity case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MinimumQuantity minimumQuantity() {
        return minimumQuantity;
    }

    /**
     * Returns the OrderReference case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public OrderReference orderReference() {
        return orderReference;
    }

    /**
     * Returns the OriginalOrderEntryDate case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public OriginalOrderEntryDate originalOrderEntryDate() {
        return originalOrderEntryDate;
    }

    /**
     * Returns the OriginalOrderReferenceNumber case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public OriginalOrderReferenceNumber originalOrderReferenceNumber() {
        return originalOrderReferenceNumber;
    }

    /**
     * Returns the PegDifference case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PegDifference pegDifference() {
        return pegDifference;
    }

    /**
     * Returns the PegType case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PegType pegType() {
        return pegType;
    }

    /**
     * Returns the RandomReserve case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public RandomReserve randomReserve() {
        return randomReserve;
    }

    /**
     * Returns the SecondaryOrderReferenceNumber case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public SecondaryOrderReferenceNumber secondaryOrderReferenceNumber() {
        return secondaryOrderReferenceNumber;
    }

    /**
     * Returns the StpAction case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public StpAction stpAction() {
        return stpAction;
    }

    /**
     * Returns the StpLevel case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public StpLevel stpLevel() {
        return stpLevel;
    }

    /**
     * Returns the StpTraderGroup case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public StpTraderGroup stpTraderGroup() {
        return stpTraderGroup;
    }

    /**
     * Returns the TimeInForce case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TimeInForce timeInForce() {
        return timeInForce;
    }

    /**
     * Returns the TradingAtClosingPrice case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TradingAtClosingPrice tradingAtClosingPrice() {
        return tradingAtClosingPrice;
    }

    /**
     * Returns the OrderCondition case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public OrderCondition orderCondition() {
        return orderCondition;
    }

    /**
     * Returns the CumulativeQuantity case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public CumulativeQuantity cumulativeQuantity() {
        return cumulativeQuantity;
    }

    /**
     * Returns the CustomerOrderCapacity case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public CustomerOrderCapacity customerOrderCapacity() {
        return customerOrderCapacity;
    }

    /**
     * Returns the TargetStrategy case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TargetStrategy targetStrategy() {
        return targetStrategy;
    }

    /**
     * Returns the MinRate case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MinRate minRate() {
        return minRate;
    }

    /**
     * Returns the MaxRate case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MaxRate maxRate() {
        return maxRate;
    }

    /**
     * Returns the ConditionalType case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public ConditionalType conditionalType() {
        return conditionalType;
    }

    /**
     * Returns the FirmUpId case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public FirmUpId firmUpId() {
        return firmUpId;
    }

    /**
     * Returns the bytes of an undeclared case, which holds them when it is selected.
     *
     * @return the undeclared case's record
     */
    public RawRecord unknown() {
        return unknown;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case CLEARING_ACCOUNT -> clearingAccount;
            case CLEARING_ACCOUNT_TYPE -> clearingAccountType;
            case CLEARING_FIRM -> clearingFirm;
            case CLIENT_REFERENCE -> clientReference;
            case CROSS_TYPE -> crossType;
            case DEA_INDICATOR -> deaIndicator;
            case DISPLAY -> display;
            case DISPLAY_PRICE -> displayPrice;
            case DISPLAY_QUANTITY -> displayQuantity;
            case EXPIRE_TIME -> expireTime;
            case FIRM -> firm;
            case LIQUIDITY_PROVISION_INDICATOR -> liquidityProvisionIndicator;
            case MAX_FLOOR -> maxFloor;
            case MINIMUM_QUANTITY -> minimumQuantity;
            case ORDER_REFERENCE -> orderReference;
            case ORIGINAL_ORDER_ENTRY_DATE -> originalOrderEntryDate;
            case ORIGINAL_ORDER_REFERENCE_NUMBER -> originalOrderReferenceNumber;
            case PEG_DIFFERENCE -> pegDifference;
            case PEG_TYPE -> pegType;
            case RANDOM_RESERVE -> randomReserve;
            case SECONDARY_ORDER_REFERENCE_NUMBER -> secondaryOrderReferenceNumber;
            case STP_ACTION -> stpAction;
            case STP_LEVEL -> stpLevel;
            case STP_TRADER_GROUP -> stpTraderGroup;
            case TIME_IN_FORCE -> timeInForce;
            case TRADING_AT_CLOSING_PRICE -> tradingAtClosingPrice;
            case ORDER_CONDITION -> orderCondition;
            case CUMULATIVE_QUANTITY -> cumulativeQuantity;
            case CUSTOMER_ORDER_CAPACITY -> customerOrderCapacity;
            case TARGET_STRATEGY -> targetStrategy;
            case MIN_RATE -> minRate;
            case MAX_RATE -> maxRate;
            case CONDITIONAL_TYPE -> conditionalType;
            case FIRM_UP_ID -> firmUpId;
            case UNKNOWN -> unknown;
        };
    }

    /**
     * Returns the declared padding runs: none, as no case of a branch holds padding.
     *
     * @return an empty array
     */
    public static int[] padding() {
        return new int[0];
    }

    @Override
    public int byteLength() {
        return entry().byteLength();
    }

    @Override
    public Optional<byte[]> raw() {
        return entry().raw();
    }

    @Override
    public boolean isDecoded() {
        return entry().isDecoded();
    }

    @Override
    public boolean isRecognized() {
        return entry().isRecognized();
    }

    @Override
    public boolean isValid() {
        return entry().isValid();
    }

    @Override
    public Optional<Field> failedAt() {
        return entry().failedAt();
    }

    @Override
    public boolean parseFrom(byte[] data, int offset) {
        return parseFrom(data, offset, data.length);
    }

    @Override
    public boolean parseFrom(byte[] data, int offset, int end) {
        Case chosen = selected;
        clear();
        selected = chosen;
        return entry().parseFrom(data, offset, end);
    }

    @Override
    public int encode(byte[] data, int offset) {
        return entry().encode(data, offset);
    }

    @Override
    public byte[] toBytes() {
        return entry().toBytes();
    }

    @Override
    public void clear() {
        clearingAccount.clear();
        clearingAccountType.clear();
        clearingFirm.clear();
        clientReference.clear();
        crossType.clear();
        deaIndicator.clear();
        display.clear();
        displayPrice.clear();
        displayQuantity.clear();
        expireTime.clear();
        firm.clear();
        liquidityProvisionIndicator.clear();
        maxFloor.clear();
        minimumQuantity.clear();
        orderReference.clear();
        originalOrderEntryDate.clear();
        originalOrderReferenceNumber.clear();
        pegDifference.clear();
        pegType.clear();
        randomReserve.clear();
        secondaryOrderReferenceNumber.clear();
        stpAction.clear();
        stpLevel.clear();
        stpTraderGroup.clear();
        timeInForce.clear();
        tradingAtClosingPrice.clear();
        orderCondition.clear();
        cumulativeQuantity.clear();
        customerOrderCapacity.clear();
        targetStrategy.clear();
        minRate.clear();
        maxRate.clear();
        conditionalType.clear();
        firmUpId.clear();
        unknown.clear();
        selected = Case.CLEARING_ACCOUNT;
    }

    @Override
    public List<Field> fields() {
        return entry().fields();
    }

    @Override
    public Optional<Field> field(String name) {
        return entry().field(name);
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        return other instanceof ValuePayload branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
    }

    @Override
    public String toFormattedString(PrintOptions options) {
        StringBuilder builder = new StringBuilder();
        toFormattedString(builder, options);
        return builder.toString();
    }

    @Override
    public void toFormattedString(StringBuilder builder, PrintOptions options) {
        if (options.identifier()) {
            builder.append(NAME);
            return;
        }
        entry().toFormattedString(builder, options);
    }

    @Override
    public String toString() {
        return toFormattedString(PrintOptions.DEFAULT);
    }

    @Override
    public boolean equals(Object other) {
        return this == other || other instanceof ValuePayload branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
