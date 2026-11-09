package omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.types;

/**
 * Controls display when formatting generated message and field types.
 *
 * <p>Use {@link #DEFAULT} for indented multi-line output, {@link #IDENTIFIER} for a
 * compact one-line summary of the key fields, or {@link #COMPACT} for a one-line summary
 * of every field. Descend into a nested structure with {@link #nested()}.</p>
 *
 * @param indentDepth the current nesting depth, zero at the top level
 * @param identifier  whether to render only the key fields, on one line
 * @param compact     whether to render every field on one line
 */
public record PrintOptions(int indentDepth, boolean identifier, boolean compact) {

    /** Precomputed indent strings; each entry is its index times two spaces. */
    private static final String[] PREFIXES = {
        "",
        "  ",
        "    ",
        "      ",
        "        ",
        "          ",
        "            ",
        "              ",
        "                ",
        "                  ",
        "                    ",
        "                      ",
        "                        ",
        "                          ",
        "                            ",
        "                              ",
        "                                "
    };

    /** Indented multi-line output, starting at the top level. */
    public static final PrintOptions DEFAULT = new PrintOptions(0, false, false);

    /** A compact one-line summary of the key fields, for debugger and log output. */
    public static final PrintOptions IDENTIFIER = new PrintOptions(0, true, false);

    /** A compact one-line summary of every field. */
    public static final PrintOptions COMPACT = new PrintOptions(0, false, true);

    /**
     * Returns whether output should be rendered on a single line.
     *
     * @return true when either one-line mode is selected
     */
    public boolean isOneLine() {
        return identifier || compact;
    }

    /**
     * Returns these options at one deeper nesting level.
     *
     * @return the options for a nested structure
     */
    public PrintOptions nested() {
        return new PrintOptions(indentDepth + 1, identifier, compact);
    }

    /**
     * Returns the indent string for the current depth, two spaces per level.
     *
     * <p>A negative depth is treated as the top level: the record is constructible with
     * any int, and formatting is not the place to reject one.</p>
     *
     * @return the indent string
     */
    public String prefix() {
        int depth = Math.max(0, indentDepth);
        return depth <= 16 ? PREFIXES[depth] : " ".repeat(depth * 2);
    }
}
