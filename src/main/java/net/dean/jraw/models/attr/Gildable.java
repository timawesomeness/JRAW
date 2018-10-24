package net.dean.jraw.models.attr;

import net.dean.jraw.models.meta.JsonProperty;

/**
 * Specifies that this model is able to be given reddit gold
 */
public interface Gildable extends JsonAttribute {
    /**
     * Gets the number of times this comment has received reddit gold. If this model was retrieved from the inbox, then
     * this will return 0.
     *
     * @return The number of times this comment has received reddit gold
     */
    @JsonProperty
    Integer getTimesGilded();

    /**
     * Gets the number of times this comment has received reddit silver. If this model was retrieved from the inbox, then
     * this will return 0.
     *
     * @return The number of times this comment has received reddit silver
     */
    @JsonProperty
    Integer getTimesSilvered();

    /**
     * Gets the number of times this comment has received reddit platinum. If this model was retrieved from the inbox, then
     * this will return 0.
     *
     * @return The number of times this comment has received reddit platinum
     */
    @JsonProperty
    Integer getTimesPlatinized();
}
