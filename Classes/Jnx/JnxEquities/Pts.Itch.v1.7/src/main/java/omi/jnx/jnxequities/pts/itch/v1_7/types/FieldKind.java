package omi.jnx.jnxequities.pts.itch.v1_7.types;

/**
 * Identifies the wire and value archetype of a field.
 *
 * <p>Returned by {@link Field#kind()} on every field instance. Intended for diagnostics
 * and reporting; use the field's own class for dispatch.</p>
 */
public enum FieldKind {

    /** An integer field whose wire value is unsigned. */
    UNSIGNED_INTEGER,

    /** An integer field whose wire value is signed. */
    SIGNED_INTEGER,

    /** A fixed-length ASCII field carrying text. */
    STRING,

    /** A single ASCII byte carrying one character. */
    CHAR,

    /** A timestamp field carrying nanoseconds since the Unix epoch. */
    TIMESTAMP,

    /** An integer field carrying a fixed-point decimal. */
    DECIMAL,

    /** A date, time of day, or both spelled in ASCII characters. */
    CLOCK,

    /** An IEEE 754 binary floating-point field. */
    FLOAT,

    /** A packed field whose children occupy bit ranges. */
    BITFIELD,

    /** A field whose values are declared by the protocol specification. */
    ENUM,

    /** An opaque field carried as raw bytes. */
    STRUCT
}
