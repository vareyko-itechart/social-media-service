package com.example.social.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Container for received object.
 *
 * @author s.vareyko
 * @since 24.10.2018
 */
@Getter
@Setter
public class UserDto {
    private String name;
    private List<String> interests;

    /**
     * Special flags.
     */
    @JsonIgnore
    private boolean excluded = false;

    @Override
    public String toString() {
        return this.name;
    }
}
