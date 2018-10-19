package net.dean.jraw.models;

import java.util.List;

/**
 * Immutable class representing a set of rules.
 */
public final class Ruleset {
    private final List<SubredditRule> rules;
    private final List<String> siteRules;

    /**
     * Instantiates a new Ruleset
     *
     * @param newRules A set of subreddit rules
     * @param newSiteRules A set of site rules
     */
    public Ruleset(List<SubredditRule> newRules, List<String> newSiteRules) {
        this.rules = newRules;
        this.siteRules = newSiteRules;
    }

    /**
     * Gets subreddit rules
     */
    public List<SubredditRule> getSubredditRules() {
        return rules;
    }

    /**
     * Gets site rules
     */
    public List<String> getSiteRules() {
        return siteRules;
    }
}
