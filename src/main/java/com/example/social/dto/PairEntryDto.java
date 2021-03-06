package com.example.social.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

/**
 * @author s.vareyko
 * @since 25.10.2018
 */
@Getter
@Setter
@AllArgsConstructor
public class PairEntryDto implements Comparable<PairEntryDto> {
    private UserDto user;
    private Set<PairDto> pairs;

    /**
     * Getter for user's excluded field.
     *
     * @return true if user still not excluded
     */
    @JsonIgnore
    public boolean isUserNotExcluded() {
        return !this.user.isExcluded();
    }

    /**
     * Special comparator, that never return 'equal',
     * so in {@link java.util.Set} collections element will not be removed.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public int compareTo(final PairEntryDto other) {
        final int result = Integer.compare(this.pairs.size(), other.getPairs().size());
        return result == 0 ? 1 : result;
    }
}
