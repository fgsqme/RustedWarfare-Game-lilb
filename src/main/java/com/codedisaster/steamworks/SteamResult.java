/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 */
package com.codedisaster.steamworks;

public enum SteamResult {
    OK(1),
    Fail(2),
    NoConnection(3),
    InvalidPassword(5),
    LoggedInElsewhere(6),
    InvalidProtocolVer(7),
    InvalidParam(8),
    FileNotFound(9),
    Busy(10),
    InvalidState(11),
    InvalidName(12),
    InvalidEmail(13),
    DuplicateName(14),
    AccessDenied(15),
    Timeout(16),
    Banned(17),
    AccountNotFound(18),
    InvalidSteamID(19),
    ServiceUnavailable(20),
    NotLoggedOn(21),
    Pending(22),
    EncryptionFailure(23),
    InsufficientPrivilege(24),
    LimitExceeded(25),
    Revoked(26),
    Expired(27),
    AlreadyRedeemed(28),
    DuplicateRequest(29),
    AlreadyOwned(30),
    IPNotFound(31),
    PersistFailed(32),
    LockingFailed(33),
    LogonSessionReplaced(34),
    ConnectFailed(35),
    HandshakeFailed(36),
    IOFailure(37),
    RemoteDisconnect(38),
    ShoppingCartNotFound(39),
    Blocked(40),
    Ignored(41),
    NoMatch(42),
    AccountDisabled(43),
    ServiceReadOnly(44),
    AccountNotFeatured(45),
    AdministratorOK(46),
    ContentVersion(47),
    TryAnotherCM(48),
    PasswordRequiredToKickSession(49),
    AlreadyLoggedInElsewhere(50),
    Suspended(51),
    Cancelled(52),
    DataCorruption(53),
    DiskFull(54),
    RemoteCallFailed(55),
    PasswordUnset(56),
    ExternalAccountUnlinked(57),
    PSNTicketInvalid(58),
    ExternalAccountAlreadyLinked(59),
    RemoteFileConflict(60),
    IllegalPassword(61),
    SameAsPreviousValue(62),
    AccountLogonDenied(63),
    CannotUseOldPassword(64),
    InvalidLoginAuthCode(65),
    AccountLogonDeniedNoMail(66),
    HardwareNotCapableOfIPT(67),
    IPTInitError(68),
    ParentalControlRestricted(69),
    FacebookQueryError(70),
    ExpiredLoginAuthCode(71),
    IPLoginRestrictionFailed(72),
    AccountLockedDown(73),
    AccountLogonDeniedVerifiedEmailRequired(74),
    NoMatchingURL(75),
    BadResponse(76),
    RequirePasswordReEntry(77),
    ValueOutOfRange(78),
    UnexpectedError(79),
    Disabled(80),
    InvalidCEGSubmission(81),
    RestrictedDevice(82),
    RegionLocked(83),
    RateLimitExceeded(84),
    AccountLoginDeniedNeedTwoFactor(85),
    ItemDeleted(86),
    AccountLoginDeniedThrottle(87),
    TwoFactorCodeMismatch(88),
    TwoFactorActivationCodeMismatch(89),
    AccountAssociatedToMultiplePartners(90),
    NotModified(91),
    NoMobileDevice(92),
    TimeNotSynced(93),
    SmsCodeFailed(94),
    AccountLimitExceeded(95),
    AccountActivityLimitExceeded(96),
    PhoneActivityLimitExceeded(97),
    RefundToWallet(98),
    EmailSendFailure(99),
    NotSettled(100),
    NeedCaptcha(101),
    GSLTDenied(102),
    GSOwnerDenied(103),
    InvalidItemType(104),
    IPBanned(105),
    GLSTExpired(106),
    UnknownErrorCode_NotImplementedByAPI(0);

    private final int code;
    private static final SteamResult[] valuesLookupTable;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private SteamResult() {
        void var3_1;
        this.code = var3_1;
    }

    public static SteamResult byValue(int n2) {
        if (n2 < valuesLookupTable.length) {
            return valuesLookupTable[n2];
        }
        return UnknownErrorCode_NotImplementedByAPI;
    }

    static {
        SteamResult[] steamResultArray = SteamResult.values();
        int n2 = 0;
        for (SteamResult steamResult : steamResultArray) {
            n2 = Math.max((int)n2, (int)steamResult.code);
        }
        valuesLookupTable = new SteamResult[n2 + 1];
        SteamResult[] steamResultArray2 = steamResultArray;
        int n3 = steamResultArray2.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            SteamResult steamResult;
            SteamResult.valuesLookupTable[steamResult.code] = steamResult = steamResultArray2[i2];
        }
    }
}

