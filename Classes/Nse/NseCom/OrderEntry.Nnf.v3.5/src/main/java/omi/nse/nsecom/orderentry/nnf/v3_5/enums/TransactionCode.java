package omi.nse.nsecom.orderentry.nnf.v3_5.enums;

import java.util.Optional;

/**
 * Type of message sent or received
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TransactionCode {

    /**
     * 1600 MS_SYSTEM_INFO_REQ 44 I, carried in the MS_SYSTEM_INFO_REQ structure
     */
    SYSTEM_INFORMATION_IN_MESSAGE((short) 1600, "1600 MS_SYSTEM_INFO_REQ 44 I, carried in the MS_SYSTEM_INFO_REQ structure"),

    /**
     * 1601 MS_SYSTEM_INFO_DATA 106 I, carried in the MS_SYSTEM_INFO_DATA structure
     */
    SYSTEM_INFORMATION_OUT_MESSAGE((short) 1601, "1601 MS_SYSTEM_INFO_DATA 106 I, carried in the MS_SYSTEM_INFO_DATA structure"),

    /**
     * 7321 MS_SYSTEM_INFO_DATA 106 I, carried in the MS_SYSTEM_INFO_DATA structure
     */
    PARTIAL_SYSTEM_INFORMATION_MESSAGE((short) 7321, "7321 MS_SYSTEM_INFO_DATA 106 I, carried in the MS_SYSTEM_INFO_DATA structure"),

    /**
     * 1821 MS_RP_HDR 108 I, carried in the MS_RP_HDR structure
     */
    OPEN_ORDER_REPORT_MESSAGE((short) 1821, "1821 MS_RP_HDR 108 I, carried in the MS_RP_HDR structure"),

    /**
     * 1992 MS_RP_HDR 108 I, carried in the MS_RP_HDR structure
     */
    SPREAD_ORDER_LOG_REPORT_MESSAGE((short) 1992, "1992 MS_RP_HDR 108 I, carried in the MS_RP_HDR structure"),

    /**
     * 1993 MS_RP_HDR 108 I, carried in the MS_RP_HDR structure
     */
    SPREAD_TRADE_REPORT_MESSAGE((short) 1993, "1993 MS_RP_HDR 108 I, carried in the MS_RP_HDR structure"),

    /**
     * 2000 MS_OE_REQUEST 316 I, carried in the MS_OE_REQUEST structure
     */
    BOARD_LOT_IN_MESSAGE((short) 2000, "2000 MS_OE_REQUEST 316 I, carried in the MS_OE_REQUEST structure"),

    /**
     * 2001 MS_OE_REQUEST 316 I, carried in the MS_OE_REQUEST structure
     */
    BOARD_LOT_OUT_MESSAGE((short) 2001, "2001 MS_OE_REQUEST 316 I, carried in the MS_OE_REQUEST structure"),

    /**
     * 2008 MS_OE_REQUEST 316 I, carried in the MS_OE_REQUEST structure
     */
    NEG_ORDER_TO_BL_MESSAGE((short) 2008, "2008 MS_OE_REQUEST 316 I, carried in the MS_OE_REQUEST structure"),

    /**
     * 2040 MS_OE_REQUEST 316 I, carried in the MS_OE_REQUEST structure
     */
    ORDER_MOD_IN_MESSAGE((short) 2040, "2040 MS_OE_REQUEST 316 I, carried in the MS_OE_REQUEST structure"),

    /**
     * 2041 MS_OE_REQUEST 316 I, carried in the MS_OE_REQUEST structure
     */
    ORDER_MOD_OUT_MESSAGE((short) 2041, "2041 MS_OE_REQUEST 316 I, carried in the MS_OE_REQUEST structure"),

    /**
     * 2042 MS_OE_REQUEST 316 I, carried in the MS_OE_REQUEST structure
     */
    ORDER_MOD_REJECT_MESSAGE((short) 2042, "2042 MS_OE_REQUEST 316 I, carried in the MS_OE_REQUEST structure"),

    /**
     * 2070 MS_OE_REQUEST 316 I, carried in the MS_OE_REQUEST structure
     */
    ORDER_CANCEL_IN_MESSAGE((short) 2070, "2070 MS_OE_REQUEST 316 I, carried in the MS_OE_REQUEST structure"),

    /**
     * 2071 MS_OE_REQUEST 316 I, carried in the MS_OE_REQUEST structure
     */
    ORDER_CANCEL_OUT_MESSAGE((short) 2071, "2071 MS_OE_REQUEST 316 I, carried in the MS_OE_REQUEST structure"),

    /**
     * 2072 MS_OE_REQUEST 316 I, carried in the MS_OE_REQUEST structure
     */
    ORDER_CANCEL_REJECT_MESSAGE((short) 2072, "2072 MS_OE_REQUEST 316 I, carried in the MS_OE_REQUEST structure"),

    /**
     * 2073 MS_OE_REQUEST 316 I, carried in the MS_OE_REQUEST structure
     */
    ORDER_CONFIRMATION_MESSAGE((short) 2073, "2073 MS_OE_REQUEST 316 I, carried in the MS_OE_REQUEST structure"),

    /**
     * 2074 MS_OE_REQUEST 316 I, carried in the MS_OE_REQUEST structure
     */
    ORDER_MOD_CONFIRMATION_MESSAGE((short) 2074, "2074 MS_OE_REQUEST 316 I, carried in the MS_OE_REQUEST structure"),

    /**
     * 2075 MS_OE_REQUEST 316 I Confidential Commodity Derivatives Trading System - Protocol for Non-Neat Front End, carried in the MS_OE_REQUEST structure
     */
    ORDER_CANCEL_CONFIRMATION_MESSAGE((short) 2075, "2075 MS_OE_REQUEST 316 I Confidential Commodity Derivatives Trading System - Protocol for Non-Neat Front End, carried in the MS_OE_REQUEST structure"),

    /**
     * 2076 MS_OE_REQUEST 316 I, carried in the MS_OE_REQUEST structure
     */
    CANCEL_NEG_ORDER_MESSAGE((short) 2076, "2076 MS_OE_REQUEST 316 I, carried in the MS_OE_REQUEST structure"),

    /**
     * 2170 MS_OE_REQUEST 316 I Confidential Commodity Derivatives Trading System - Protocol for Non-Neat Front End, carried in the MS_OE_REQUEST structure
     */
    FREEZE_TO_CONTROL_MESSAGE((short) 2170, "2170 MS_OE_REQUEST 316 I Confidential Commodity Derivatives Trading System - Protocol for Non-Neat Front End, carried in the MS_OE_REQUEST structure"),

    /**
     * 2231 MS_OE_REQUEST 316 I, carried in the MS_OE_REQUEST structure
     */
    ORDER_ERROR_MESSAGE((short) 2231, "2231 MS_OE_REQUEST 316 I, carried in the MS_OE_REQUEST structure"),

    /**
     * 9002 MS_OE_REQUEST 316 I Confidential Commodity Derivatives Trading System - Protocol for Non-Neat Front End, carried in the MS_OE_REQUEST structure
     */
    BATCH_ORDER_CANCEL_MESSAGE((short) 9002, "9002 MS_OE_REQUEST 316 I Confidential Commodity Derivatives Trading System - Protocol for Non-Neat Front End, carried in the MS_OE_REQUEST structure"),

    /**
     * 2013 PRICE_MOD 106 I, carried in the PRICE_MOD structure
     */
    PRICE_MOD_IN_MESSAGE((short) 2013, "2013 PRICE_MOD 106 I, carried in the PRICE_MOD structure"),

    /**
     * 2100 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure
     */
    SP_BOARD_LOT_IN_MESSAGE((short) 2100, "2100 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure"),

    /**
     * 2101 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure
     */
    SP_BOARD_LOT_OUT_MESSAGE((short) 2101, "2101 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure"),

    /**
     * 2102 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure
     */
    TWOL_BOARD_LOT_IN_MESSAGE((short) 2102, "2102 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure"),

    /**
     * 2103 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure
     */
    TWOL_BOARD_LOT_OUT_MESSAGE((short) 2103, "2103 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure"),

    /**
     * 2104 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure
     */
    THRL_BOARD_LOT_IN_MESSAGE((short) 2104, "2104 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure"),

    /**
     * 2105 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure
     */
    THRL_BOARD_LOT_OUT_MESSAGE((short) 2105, "2105 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure"),

    /**
     * 2106 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure
     */
    SP_ORDER_CANCEL_IN_MESSAGE((short) 2106, "2106 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure"),

    /**
     * 2107 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure
     */
    SP_ORDER_CANCEL_OUT_MESSAGE((short) 2107, "2107 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure"),

    /**
     * 2118 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure
     */
    SP_ORDER_MOD_IN_MESSAGE((short) 2118, "2118 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure"),

    /**
     * 2119 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure
     */
    SP_ORDER_MOD_OUT_MESSAGE((short) 2119, "2119 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure"),

    /**
     * 2124 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure
     */
    SP_ORDER_CONFIRMATION_MESSAGE((short) 2124, "2124 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure"),

    /**
     * 2125 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure
     */
    TWOL_ORDER_CONFIRMATION_MESSAGE((short) 2125, "2125 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure"),

    /**
     * 2126 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure
     */
    THRL_ORDER_CONFIRMATION_MESSAGE((short) 2126, "2126 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure"),

    /**
     * 2127 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure
     */
    SP_ORDER_CXL_REJ_OUT_MESSAGE((short) 2127, "2127 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure"),

    /**
     * 2130 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure
     */
    SP_ORDER_CXL_CONFIRMATION_MESSAGE((short) 2130, "2130 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure"),

    /**
     * 2131 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure
     */
    TWOL_ORDER_CXL_CONFIRMATION_MESSAGE((short) 2131, "2131 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure"),

    /**
     * 2132 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure
     */
    THRL_ORDER_CXL_CONFIRMATION_MESSAGE((short) 2132, "2132 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure"),

    /**
     * 2133 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure
     */
    SP_ORDER_MOD_REJ_OUT_MESSAGE((short) 2133, "2133 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure"),

    /**
     * 2136 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure
     */
    SP_ORDER_MOD_CON_OUT_MESSAGE((short) 2136, "2136 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure"),

    /**
     * 2155 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure
     */
    TWOL_ORDER_ERROR_MESSAGE((short) 2155, "2155 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure"),

    /**
     * 2156 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure
     */
    THRL_ORDER_ERROR_MESSAGE((short) 2156, "2156 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure"),

    /**
     * 2212 MS_TRADE_CONFIRM 234 I, carried in the MS_TRADE_CONFIRM structure
     */
    ON_STOP_NOTIFICATION_MESSAGE((short) 2212, "2212 MS_TRADE_CONFIRM 234 I, carried in the MS_TRADE_CONFIRM structure"),

    /**
     * 2222 MS_TRADE_INQ_DATA 296 I, carried in the MS_TRADE_CONFIRM structure
     */
    TRADE_CONFIRMATION_MESSAGE((short) 2222, "2222 MS_TRADE_INQ_DATA 296 I, carried in the MS_TRADE_CONFIRM structure"),

    /**
     * 2282 MS_TRADE_CONFIRM 234 I, carried in the MS_TRADE_CONFIRM structure
     */
    TRADE_CANCEL_CONFIRM_MESSAGE((short) 2282, "2282 MS_TRADE_CONFIRM 234 I, carried in the MS_TRADE_CONFIRM structure"),

    /**
     * 2286 MS_TRADE_CONFIRM 234 I, carried in the MS_TRADE_CONFIRM structure
     */
    TRADE_CANCEL_REJECT_MESSAGE((short) 2286, "2286 MS_TRADE_CONFIRM 234 I, carried in the MS_TRADE_CONFIRM structure"),

    /**
     * 2288 MS_TRADE_CONFIRM 234 I, carried in the MS_TRADE_CONFIRM structure
     */
    TRADE_MODIFY_REJECT_MESSAGE((short) 2288, "2288 MS_TRADE_CONFIRM 234 I, carried in the MS_TRADE_CONFIRM structure"),

    /**
     * 2223 MS_TRADE_INQ_DATA 234 I, carried in the MS_TRADE_INQ_DATA structure
     */
    TRADE_ERROR_MESSAGE((short) 2223, "2223 MS_TRADE_INQ_DATA 234 I, carried in the MS_TRADE_INQ_DATA structure"),

    /**
     * 5440 MS_TRADE_INQ_DATA 234 I, carried in the MS_TRADE_INQ_DATA structure
     */
    TRADE_CANCEL_IN_MESSAGE((short) 5440, "5440 MS_TRADE_INQ_DATA 234 I, carried in the MS_TRADE_INQ_DATA structure"),

    /**
     * 5441 MS_TRADE_INQ_DATA 234 I, carried in the MS_TRADE_INQ_DATA structure
     */
    TRADE_CANCEL_OUT_MESSAGE((short) 5441, "5441 MS_TRADE_INQ_DATA 234 I, carried in the MS_TRADE_INQ_DATA structure"),

    /**
     * 5445 MS_TRADE_INQ_DATA 234 I, carried in the MS_TRADE_INQ_DATA structure
     */
    TRADE_MOD_IN_MESSAGE((short) 5445, "5445 MS_TRADE_INQ_DATA 234 I, carried in the MS_TRADE_INQ_DATA structure"),

    /**
     * 2287 MS_TRADE_MODIFY_CONFIR 234 I M, carried in the MS_TRADE_MODIFY_CONFIRM structure
     */
    TRADE_MODIFY_CONFIRM_MESSAGE((short) 2287, "2287 MS_TRADE_MODIFY_CONFIR 234 I M, carried in the MS_TRADE_MODIFY_CONFIRM structure"),

    /**
     * 2300 MS_SIGNON 278 I, carried in the MS_SIGNON structure
     */
    SIGN_ON_REQUEST_IN_MESSAGE((short) 2300, "2300 MS_SIGNON 278 I, carried in the MS_SIGNON structure"),

    /**
     * 2301 MS_SIGNON 278 I, carried in the MS_SIGNON structure
     */
    SIGN_ON_REQUEST_OUT_MESSAGE((short) 2301, "2301 MS_SIGNON 278 I, carried in the MS_SIGNON structure"),

    /**
     * 5584 MS_SIGNON 278 I, carried in the MS_SIGNON structure
     */
    SIGN_OFF_TRADER_IN_MESSAGE((short) 5584, "5584 MS_SIGNON 278 I, carried in the MS_SIGNON structure"),

    /**
     * 5585 MS_SIGNON 278 I, carried in the MS_SIGNON structure
     */
    SIGN_OFF_TRADER_OUT_MESSAGE((short) 5585, "5585 MS_SIGNON 278 I, carried in the MS_SIGNON structure"),

    /**
     * 2302 MS_ERROR_RESPONSE 182 I, carried in the MS_ERROR_RESPONSE structure
     */
    ERROR_RESPONSE_OUT_MESSAGE((short) 2302, "2302 MS_ERROR_RESPONSE 182 I, carried in the MS_ERROR_RESPONSE structure"),

    /**
     * 2400 MS_GR_REQUEST 48 I, carried in the MS_GR_REQUEST structure
     */
    GR_REQUEST_MESSAGE((short) 2400, "2400 MS_GR_REQUEST 48 I, carried in the MS_GR_REQUEST structure"),

    /**
     * 2401 MS_GR_RESPONSE 124 I, carried in the MS_GR_RESPONSE structure
     */
    GR_RESPONSE_MESSAGE((short) 2401, "2401 MS_GR_RESPONSE 124 I, carried in the MS_GR_RESPONSE structure"),

    /**
     * 5427 USER_ADDR_UNLOCK_REQ_F 114 I O, carried in the USER_ADDR_UNLOCK_REQ_FO structure
     */
    USER_ADDR_UNLOCK_IN_MESSAGE((short) 5427, "5427 USER_ADDR_UNLOCK_REQ_F 114 I O, carried in the USER_ADDR_UNLOCK_REQ_FO structure"),

    /**
     * 5428 USER_ADDR_UNLOCK_CONFIR 322 I M_FO, carried in the USER_ADDR_UNLOCK_CONFIRM_FO structure
     */
    USER_ADDR_UNLOCK_CONFIRM_OUT_MESSAGE((short) 5428, "5428 USER_ADDR_UNLOCK_CONFIR 322 I M_FO, carried in the USER_ADDR_UNLOCK_CONFIRM_FO structure"),

    /**
     * 5483 USER_ADDR_UNLOCK_APPRO 76 I VE_FO, carried in the USER_ADDR_UNLOCK_APPROVE_FO structure
     */
    USER_ADDR_UNLOCK_APPROVE_OUT_MESSAGE((short) 5483, "5483 USER_ADDR_UNLOCK_APPRO 76 I VE_FO, carried in the USER_ADDR_UNLOCK_APPROVE_FO structure"),

    /**
     * 5484 USER_ADDR_UNLOCK_APPRO 76 I VE_FO, carried in the USER_ADDR_UNLOCK_APPROVE_FO structure
     */
    USER_ADDR_UNLOCK_REJECT_OUT_MESSAGE((short) 5484, "5484 USER_ADDR_UNLOCK_APPRO 76 I VE_FO, carried in the USER_ADDR_UNLOCK_APPROVE_FO structure"),

    /**
     * 5716 BRANCH_ORD_VAL_LIMIT_UP 136 I DATE_REQ, carried in the BRANCH_ORD_VAL_LIMIT_UPDATE_REQ structure
     */
    BRANCH_ORD_VAL_LIMIT_UPDATE_IN_MESSAGE((short) 5716, "5716 BRANCH_ORD_VAL_LIMIT_UP 136 I DATE_REQ, carried in the BRANCH_ORD_VAL_LIMIT_UPDATE_REQ structure"),

    /**
     * Branch Ord Val Limit Update Ou, carried in the BRANCH_ORD_VAL_LIMIT_UPDATE_REQ structure
     */
    BRANCH_ORD_VAL_LIMIT_UPDATE_OU_MESSAGE((short) 5717, "Branch Ord Val Limit Update Ou, carried in the BRANCH_ORD_VAL_LIMIT_UPDATE_REQ structure"),

    /**
     * 5730 USER_ORD_VAL_LIMIT_UPDA 208 I TE_REQ, carried in the USER_ORD_VAL_LIMIT_UPDATE_REQ structure
     */
    USER_ORD_VAL_LIMIT_UPDATE_IN_MESSAGE((short) 5730, "5730 USER_ORD_VAL_LIMIT_UPDA 208 I TE_REQ, carried in the USER_ORD_VAL_LIMIT_UPDATE_REQ structure"),

    /**
     * User Order Limit Update Out, carried in the MS_ORDER_VAL_LIMIT_DATA structure
     */
    USER_ORDER_LIMIT_UPDATE_OUT_MESSAGE((short) 5731, "User Order Limit Update Out, carried in the MS_ORDER_VAL_LIMIT_DATA structure"),

    /**
     * 5732 NORMAL_ORD_LIMIT_UPDAT 66 I E_REQ Confidential Commodity Derivatives Trading System - Protocol for Non-Neat Front End, carried in the NORMAL_ORD_LIMIT_UPDATE_REQ structure
     */
    NORMAL_ORD_LIMIT_UPDATE_IN_MESSAGE((short) 5732, "5732 NORMAL_ORD_LIMIT_UPDAT 66 I E_REQ Confidential Commodity Derivatives Trading System - Protocol for Non-Neat Front End, carried in the NORMAL_ORD_LIMIT_UPDATE_REQ structure"),

    /**
     * 5771 NORMAL_ORD_LIMIT_UPDAT 66 I E_REQ, carried in the NORMAL_ORD_LIMIT_UPDATE_REQ structure
     */
    SPREAD_ORD_LIMIT_UPDATE_IN_MESSAGE((short) 5771, "5771 NORMAL_ORD_LIMIT_UPDAT 66 I E_REQ, carried in the NORMAL_ORD_LIMIT_UPDATE_REQ structure"),

    /**
     * Dealer Limit Update Out, carried in the DEALER_ORD_LMT structure
     */
    DEALER_LIMIT_UPDATE_OUT_MESSAGE((short) 5733, "Dealer Limit Update Out, carried in the DEALER_ORD_LMT structure"),

    /**
     * 5740 RESET_USER_PASSWORD_IN_ 58 I FO, carried in the RESET_USER_PASSWORD_IN_FO structure
     */
    RESET_USER_PASSWORD_IN_MESSAGE((short) 5740, "5740 RESET_USER_PASSWORD_IN_ 58 I FO, carried in the RESET_USER_PASSWORD_IN_FO structure"),

    /**
     * 5741 RESET_USER_PASSWORD_IN_ 58 I FO, carried in the RESET_USER_PASSWORD_IN_FO structure
     */
    RESET_USER_PASSWORD_OUT_MESSAGE((short) 5741, "5741 RESET_USER_PASSWORD_IN_ 58 I FO, carried in the RESET_USER_PASSWORD_IN_FO structure"),

    /**
     * 5744 COL_USER_STATUS_CHANGE_ 52 I REQ, carried in the COL_USER_STATUS_CHANGE_REQ structure
     */
    COL_USER_STATUS_CHANGE_IN_MESSAGE((short) 5744, "5744 COL_USER_STATUS_CHANGE_ 52 I REQ, carried in the COL_USER_STATUS_CHANGE_REQ structure"),

    /**
     * 5745 COL_USER_STATUS_CHANGE_ 46 I RESP, carried in the COL_USER_STATUS_CHANGE_RESP structure
     */
    COL_USER_STATUS_CHANGE_OUT_MESSAGE((short) 5745, "5745 COL_USER_STATUS_CHANGE_ 46 I RESP, carried in the COL_USER_STATUS_CHANGE_RESP structure"),

    /**
     * Spd Ord Limit Update Out, carried in the SPD_ORD_LMT structure
     */
    SPD_ORD_LIMIT_UPDATE_OUT_MESSAGE((short) 5772, "Spd Ord Limit Update Out, carried in the SPD_ORD_LMT structure"),

    /**
     * 7000 MS_MESSAGE_DOWNLOAD 48 I, carried in the MS_MESSAGE_DOWNLOAD structure
     */
    DOWNLOAD_REQUEST_MESSAGE((short) 7000, "7000 MS_MESSAGE_DOWNLOAD 48 I, carried in the MS_MESSAGE_DOWNLOAD structure"),

    /**
     * 7011 MESSAGE_HEADER 40 I, carried in the MESSAGE_HEADER structure
     */
    HEADER_RECORD_MESSAGE((short) 7011, "7011 MESSAGE_HEADER 40 I, carried in the MESSAGE_HEADER structure"),

    /**
     * 7021 MESSAGE_HEADER 40 I, carried in the MESSAGE_HEADER structure
     */
    MESSAGE_RECORD_MESSAGE((short) 7021, "7021 MESSAGE_HEADER 40 I, carried in the MESSAGE_HEADER structure"),

    /**
     * 7031 MESSAGE_HEADER 40 I Confidential Commodity Derivatives Trading System - Protocol for Non-Neat Front End, carried in the MESSAGE_HEADER structure
     */
    TRAILER_RECORD_MESSAGE((short) 7031, "7031 MESSAGE_HEADER 40 I Confidential Commodity Derivatives Trading System - Protocol for Non-Neat Front End, carried in the MESSAGE_HEADER structure"),

    /**
     * 7300 MS_UPDATE_LOCAL_DATABA 82 I SE, carried in the MS_UPDATE_LOCAL_DATABASE structure
     */
    UPDATE_LOCALDB_IN_MESSAGE((short) 7300, "7300 MS_UPDATE_LOCAL_DATABA 82 I SE, carried in the MS_UPDATE_LOCAL_DATABASE structure"),

    /**
     * 7307 UPDATE_LDB_HEADER 42 I, carried in the UPDATE_LDB_HEADER structure
     */
    UPDATE_LOCALDB_HEADER_MESSAGE((short) 7307, "7307 UPDATE_LDB_HEADER 42 I, carried in the UPDATE_LDB_HEADER structure"),

    /**
     * 7308 UPDATE_LDB_HEADER 42 I, carried in the UPDATE_LOCAL_DB_TRAILER structure
     */
    UPDATE_LOCALDB_TRAILER_MESSAGE((short) 7308, "7308 UPDATE_LDB_HEADER 42 I, carried in the UPDATE_LOCAL_DB_TRAILER structure"),

    /**
     * Bcast Asset Mstr Chg, carried in the MS_DOWNLOAD_ASSET structure
     */
    BCAST_ASSET_MSTR_CHG_MESSAGE((short) 7325, "Bcast Asset Mstr Chg, carried in the MS_DOWNLOAD_ASSET structure"),

    /**
     * 23000 MS_BOX_SIGN_ON_REQUEST 60 I _IN Confidential Commodity Derivatives Trading System - Protocol for Non-Neat Front End, carried in the MS_BOX_SIGN_ON_REQUEST_IN structure
     */
    BOX_SIGN_ON_REQUEST_IN_MESSAGE((short) 23000, "23000 MS_BOX_SIGN_ON_REQUEST 60 I _IN Confidential Commodity Derivatives Trading System - Protocol for Non-Neat Front End, carried in the MS_BOX_SIGN_ON_REQUEST_IN structure"),

    /**
     * 23001 MS_BOX_SIGN_ON_REQUEST 54 I _OUT, carried in the MS_BOX_SIGN_ON_REQUEST_OUT structure
     */
    BOX_SIGN_ON_REQUEST_OUT_MESSAGE((short) 23001, "23001 MS_BOX_SIGN_ON_REQUEST 54 I _OUT, carried in the MS_BOX_SIGN_ON_REQUEST_OUT structure"),

    /**
     * Secure Box Registration Request In, carried in the MS_SECURE_BOX_REGISTRATION_REQUEST_IN structure
     */
    SECURE_BOX_REGISTRATION_REQUEST_IN_MESSAGE((short) 23008, "Secure Box Registration Request In, carried in the MS_SECURE_BOX_REGISTRATION_REQUEST_IN structure"),

    /**
     * Secure Box Registration Response Out, carried in the MS_SECURE_BOX_REGISTRATION_RESPONSE_OUT structure
     */
    SECURE_BOX_REGISTRATION_RESPONSE_OUT_MESSAGE((short) 23009, "Secure Box Registration Response Out, carried in the MS_SECURE_BOX_REGISTRATION_RESPONSE_OUT structure"),

    /**
     * 20322 MS_BOX_SIGN_OFF 42 I * I/B - Interactive/Broadcast List of Transaction Codes Containing Timestamp in Nanoseconds The trascation codes that will contain timestamp in nanoseconds from 01-Jan-1980 00:00:00 are listed in following table, carried in the MS_BOX_SIGN_OFF structure
     */
    BOX_SIGN_OFF_MESSAGE((short) 20322, "20322 MS_BOX_SIGN_OFF 42 I * I/B - Interactive/Broadcast List of Transaction Codes Containing Timestamp in Nanoseconds The trascation codes that will contain timestamp in nanoseconds from 01-Jan-1980 00:00:00 are listed in following table, carried in the MS_BOX_SIGN_OFF structure");

    private final short wire;

    private final String description;

    TransactionCode(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
        return wire;
    }

    /**
     * Returns the description the protocol specification gives this value.
     *
     * @return the description
     */
    public String description() {
        return description;
    }

    /**
     * Returns the value with the given wire encoding.
     *
     * @param wire the encoding read from the wire
     * @return the matching value, or empty when the protocol declares no value for it
     */
    public static Optional<TransactionCode> fromWire(short wire) {
        return switch (wire) {
            case 1600 -> Optional.of(SYSTEM_INFORMATION_IN_MESSAGE);
            case 1601 -> Optional.of(SYSTEM_INFORMATION_OUT_MESSAGE);
            case 7321 -> Optional.of(PARTIAL_SYSTEM_INFORMATION_MESSAGE);
            case 1821 -> Optional.of(OPEN_ORDER_REPORT_MESSAGE);
            case 1992 -> Optional.of(SPREAD_ORDER_LOG_REPORT_MESSAGE);
            case 1993 -> Optional.of(SPREAD_TRADE_REPORT_MESSAGE);
            case 2000 -> Optional.of(BOARD_LOT_IN_MESSAGE);
            case 2001 -> Optional.of(BOARD_LOT_OUT_MESSAGE);
            case 2008 -> Optional.of(NEG_ORDER_TO_BL_MESSAGE);
            case 2040 -> Optional.of(ORDER_MOD_IN_MESSAGE);
            case 2041 -> Optional.of(ORDER_MOD_OUT_MESSAGE);
            case 2042 -> Optional.of(ORDER_MOD_REJECT_MESSAGE);
            case 2070 -> Optional.of(ORDER_CANCEL_IN_MESSAGE);
            case 2071 -> Optional.of(ORDER_CANCEL_OUT_MESSAGE);
            case 2072 -> Optional.of(ORDER_CANCEL_REJECT_MESSAGE);
            case 2073 -> Optional.of(ORDER_CONFIRMATION_MESSAGE);
            case 2074 -> Optional.of(ORDER_MOD_CONFIRMATION_MESSAGE);
            case 2075 -> Optional.of(ORDER_CANCEL_CONFIRMATION_MESSAGE);
            case 2076 -> Optional.of(CANCEL_NEG_ORDER_MESSAGE);
            case 2170 -> Optional.of(FREEZE_TO_CONTROL_MESSAGE);
            case 2231 -> Optional.of(ORDER_ERROR_MESSAGE);
            case 9002 -> Optional.of(BATCH_ORDER_CANCEL_MESSAGE);
            case 2013 -> Optional.of(PRICE_MOD_IN_MESSAGE);
            case 2100 -> Optional.of(SP_BOARD_LOT_IN_MESSAGE);
            case 2101 -> Optional.of(SP_BOARD_LOT_OUT_MESSAGE);
            case 2102 -> Optional.of(TWOL_BOARD_LOT_IN_MESSAGE);
            case 2103 -> Optional.of(TWOL_BOARD_LOT_OUT_MESSAGE);
            case 2104 -> Optional.of(THRL_BOARD_LOT_IN_MESSAGE);
            case 2105 -> Optional.of(THRL_BOARD_LOT_OUT_MESSAGE);
            case 2106 -> Optional.of(SP_ORDER_CANCEL_IN_MESSAGE);
            case 2107 -> Optional.of(SP_ORDER_CANCEL_OUT_MESSAGE);
            case 2118 -> Optional.of(SP_ORDER_MOD_IN_MESSAGE);
            case 2119 -> Optional.of(SP_ORDER_MOD_OUT_MESSAGE);
            case 2124 -> Optional.of(SP_ORDER_CONFIRMATION_MESSAGE);
            case 2125 -> Optional.of(TWOL_ORDER_CONFIRMATION_MESSAGE);
            case 2126 -> Optional.of(THRL_ORDER_CONFIRMATION_MESSAGE);
            case 2127 -> Optional.of(SP_ORDER_CXL_REJ_OUT_MESSAGE);
            case 2130 -> Optional.of(SP_ORDER_CXL_CONFIRMATION_MESSAGE);
            case 2131 -> Optional.of(TWOL_ORDER_CXL_CONFIRMATION_MESSAGE);
            case 2132 -> Optional.of(THRL_ORDER_CXL_CONFIRMATION_MESSAGE);
            case 2133 -> Optional.of(SP_ORDER_MOD_REJ_OUT_MESSAGE);
            case 2136 -> Optional.of(SP_ORDER_MOD_CON_OUT_MESSAGE);
            case 2155 -> Optional.of(TWOL_ORDER_ERROR_MESSAGE);
            case 2156 -> Optional.of(THRL_ORDER_ERROR_MESSAGE);
            case 2212 -> Optional.of(ON_STOP_NOTIFICATION_MESSAGE);
            case 2222 -> Optional.of(TRADE_CONFIRMATION_MESSAGE);
            case 2282 -> Optional.of(TRADE_CANCEL_CONFIRM_MESSAGE);
            case 2286 -> Optional.of(TRADE_CANCEL_REJECT_MESSAGE);
            case 2288 -> Optional.of(TRADE_MODIFY_REJECT_MESSAGE);
            case 2223 -> Optional.of(TRADE_ERROR_MESSAGE);
            case 5440 -> Optional.of(TRADE_CANCEL_IN_MESSAGE);
            case 5441 -> Optional.of(TRADE_CANCEL_OUT_MESSAGE);
            case 5445 -> Optional.of(TRADE_MOD_IN_MESSAGE);
            case 2287 -> Optional.of(TRADE_MODIFY_CONFIRM_MESSAGE);
            case 2300 -> Optional.of(SIGN_ON_REQUEST_IN_MESSAGE);
            case 2301 -> Optional.of(SIGN_ON_REQUEST_OUT_MESSAGE);
            case 5584 -> Optional.of(SIGN_OFF_TRADER_IN_MESSAGE);
            case 5585 -> Optional.of(SIGN_OFF_TRADER_OUT_MESSAGE);
            case 2302 -> Optional.of(ERROR_RESPONSE_OUT_MESSAGE);
            case 2400 -> Optional.of(GR_REQUEST_MESSAGE);
            case 2401 -> Optional.of(GR_RESPONSE_MESSAGE);
            case 5427 -> Optional.of(USER_ADDR_UNLOCK_IN_MESSAGE);
            case 5428 -> Optional.of(USER_ADDR_UNLOCK_CONFIRM_OUT_MESSAGE);
            case 5483 -> Optional.of(USER_ADDR_UNLOCK_APPROVE_OUT_MESSAGE);
            case 5484 -> Optional.of(USER_ADDR_UNLOCK_REJECT_OUT_MESSAGE);
            case 5716 -> Optional.of(BRANCH_ORD_VAL_LIMIT_UPDATE_IN_MESSAGE);
            case 5717 -> Optional.of(BRANCH_ORD_VAL_LIMIT_UPDATE_OU_MESSAGE);
            case 5730 -> Optional.of(USER_ORD_VAL_LIMIT_UPDATE_IN_MESSAGE);
            case 5731 -> Optional.of(USER_ORDER_LIMIT_UPDATE_OUT_MESSAGE);
            case 5732 -> Optional.of(NORMAL_ORD_LIMIT_UPDATE_IN_MESSAGE);
            case 5771 -> Optional.of(SPREAD_ORD_LIMIT_UPDATE_IN_MESSAGE);
            case 5733 -> Optional.of(DEALER_LIMIT_UPDATE_OUT_MESSAGE);
            case 5740 -> Optional.of(RESET_USER_PASSWORD_IN_MESSAGE);
            case 5741 -> Optional.of(RESET_USER_PASSWORD_OUT_MESSAGE);
            case 5744 -> Optional.of(COL_USER_STATUS_CHANGE_IN_MESSAGE);
            case 5745 -> Optional.of(COL_USER_STATUS_CHANGE_OUT_MESSAGE);
            case 5772 -> Optional.of(SPD_ORD_LIMIT_UPDATE_OUT_MESSAGE);
            case 7000 -> Optional.of(DOWNLOAD_REQUEST_MESSAGE);
            case 7011 -> Optional.of(HEADER_RECORD_MESSAGE);
            case 7021 -> Optional.of(MESSAGE_RECORD_MESSAGE);
            case 7031 -> Optional.of(TRAILER_RECORD_MESSAGE);
            case 7300 -> Optional.of(UPDATE_LOCALDB_IN_MESSAGE);
            case 7307 -> Optional.of(UPDATE_LOCALDB_HEADER_MESSAGE);
            case 7308 -> Optional.of(UPDATE_LOCALDB_TRAILER_MESSAGE);
            case 7325 -> Optional.of(BCAST_ASSET_MSTR_CHG_MESSAGE);
            case 23000 -> Optional.of(BOX_SIGN_ON_REQUEST_IN_MESSAGE);
            case 23001 -> Optional.of(BOX_SIGN_ON_REQUEST_OUT_MESSAGE);
            case 23008 -> Optional.of(SECURE_BOX_REGISTRATION_REQUEST_IN_MESSAGE);
            case 23009 -> Optional.of(SECURE_BOX_REGISTRATION_RESPONSE_OUT_MESSAGE);
            case 20322 -> Optional.of(BOX_SIGN_OFF_MESSAGE);
            default -> Optional.empty();
        };
    }
}
