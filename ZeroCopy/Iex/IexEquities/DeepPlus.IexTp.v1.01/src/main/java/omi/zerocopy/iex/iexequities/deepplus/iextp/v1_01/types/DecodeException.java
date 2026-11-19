package omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.types;

/**
 * Thrown when bytes cannot be read as the layout they are offered as: too few of them, or a frame reaching past its packet.
 */
public final class DecodeException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * Creates the exception.
     *
     * @param message what could not be read
     */
    public DecodeException(String message) {
        super(message);
    }
}
