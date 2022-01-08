package com.gap.rockpapertezos.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@JsonDeserialize
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class RockPaperTezosResponse {
    private Integer hoodieId;
    private String hoodieDescription;
    private Double hoodiePrice;
    private String hoodieHashCode;
    private String hoodieOwner;
    private String hoodieImage;

}
